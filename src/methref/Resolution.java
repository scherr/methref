package methref;

import com.google.common.reflect.Invokable;
import com.google.common.reflect.Parameter;
import com.google.common.reflect.TypeToken;
import javassist.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

class Resolution {
    private static ConcurrentHashMap<Invokable<?, ?>, MethodReference> cache = new ConcurrentHashMap<>();

    private static <O, R> MethodReference resolve(TypeToken<O> clazz, boolean isStatic, String name, TypeToken<R> returnType, TypeToken<?>... paramTypes) {
        Class<? super O> rawClass = clazz.getRawType();

        Method tempRawMethod = null;
        Invokable<O, R> tempInvokable = null;
        outer:
        for (Method m : rawClass.getDeclaredMethods()) {
            tempRawMethod = m;
            tempInvokable = (Invokable<O, R>) clazz.method(m);

            if (tempInvokable.isStatic() != isStatic ||
                    !tempInvokable.getName().equals(name) ||
                    !tempInvokable.getReturnType().equals(returnType)) {
                tempRawMethod = null;
                tempInvokable = null;
                continue;
            }

            int i = 0;
            for (Parameter p : tempInvokable.getParameters()) {
                if (!p.getType().equals(paramTypes[i])) {
                    tempRawMethod = null;
                    tempInvokable = null;
                    continue outer;
                }
                i++;
            }

            break;
        }

        Method rawMethod = tempRawMethod;
        Invokable<O, R> invokable = tempInvokable;

        if (invokable == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not resolve " + (isStatic ? "static" : "virtual") + " method \"");
            sb.append(clazz + "." + name + "(");
            for (int i = 0; i < paramTypes.length - 1; i++) {
                sb.append(paramTypes[i] + ", ");
            }
            if (paramTypes.length > 0) {
                sb.append(paramTypes[paramTypes.length - 1]);
            }
            sb.append(")" + returnType);
            sb.append("\"!");

            throw new RuntimeException(sb.toString());
        }

        return cache.computeIfAbsent(tempInvokable, inv -> {
            ClassPool cp = ClassPool.getDefault();
            CtClass c = cp.makeClass(Resolution.class.getName() + "$ResolvedMethodReference" + cache.size());

            c.setModifiers(Modifier.FINAL);

            try {
                if (returnType.getRawType() == void.class) {
                    c.setSuperclass(cp.get(VoidMethodReference.class.getName() + "$_" + (paramTypes.length + (invokable.isStatic() ? 0 : 1))));
                } else {
                    c.setSuperclass(cp.get(MethodReference.class.getName() + "$_" + (paramTypes.length + (invokable.isStatic() ? 0 : 1))));
                }

                CtConstructor constructor = CtNewConstructor.make("constructor(" + Invokable.class.getName() + " invokable) { super(invokable); }", c);
                c.addConstructor(constructor);

                StringBuilder methodSource = new StringBuilder();
                if (returnType.getRawType() == void.class) {
                    methodSource.append("public void invoke(");
                } else {
                    methodSource.append("public Object invoke(");
                }

                StringBuilder expression = new StringBuilder();
                if (invokable.isStatic()) {
                    for (int i = 0; i < paramTypes.length - 1; i++) {
                        methodSource.append("Object arg" + i + ", ");
                    }
                    if (paramTypes.length > 0) {
                        methodSource.append("Object arg" + (paramTypes.length - 1));
                    }
                    methodSource.append(") {\n");

                    expression.append(rawClass.getName() + "." + name + "(");
                    for (int i = 0; i < paramTypes.length - 1; i++) {
                        expression.append(convert(cp, Object.class, paramTypes[i].getRawType(), "arg" + i) + ", ");
                    }
                    if (paramTypes.length > 0) {
                        expression.append(convert(cp, Object.class, paramTypes[paramTypes.length - 1].getRawType(), "arg" + (paramTypes.length - 1)));
                    }
                    expression.append(")");
                } else {
                    methodSource.append("Object arg0, ");
                    for (int i = 0; i < paramTypes.length - 1; i++) {
                        methodSource.append("Object arg" + (i + 1) + ", ");
                    }
                    if (paramTypes.length > 0) {
                        methodSource.append("Object arg" + paramTypes.length);
                    }
                    methodSource.append(") {\n");

                    expression.append(convert(cp, Object.class, rawClass, "arg0") + "." + name + "(");
                    for (int i = 0; i < paramTypes.length - 1; i++) {
                        expression.append(convert(cp, Object.class, paramTypes[i].getRawType(), "arg" + (i + 1)) + ", ");
                    }
                    if (paramTypes.length > 0) {
                        expression.append(convert(cp, Object.class, paramTypes[paramTypes.length - 1].getRawType(), "arg" + paramTypes.length));
                    }
                    expression.append(")");
                }

                if (returnType.getRawType() == void.class) {
                    methodSource.append("   " + expression.toString());
                } else {
                    methodSource.append("   return " + convert(cp, rawMethod.getReturnType(), Object.class, expression.toString()));
                }
                methodSource.append(";\n}");

                CtMethod method = CtMethod.make(methodSource.toString(), c);
                c.addMethod(method);

                return (MethodReference) c.toClass().getDeclaredConstructor(new Class<?>[]{ Invokable.class }).newInstance(invokable);
            } catch (CannotCompileException | NotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static String convert(ClassPool cp, Class<?> from, Class<?> to, String expression) throws NotFoundException {
        if (to.isAssignableFrom(from)) { return expression; }

        if (!from.isPrimitive() && to.isPrimitive()) {
            CtPrimitiveType p = (CtPrimitiveType) cp.get(to.getName());
            return "((" + p.getWrapperName() + ") " + expression + ")." + p.getGetMethodName() + "()";
        } else if (from.isPrimitive() && !to.isPrimitive()) {
            CtPrimitiveType p = (CtPrimitiveType) cp.get(from.getName());
            if (to == Object.class) {
                return "(" + p.getWrapperName() + ".valueOf(" + expression + "))";
            } else {
                return "((" + to.getName() + ") " + p.getWrapperName() + ".valueOf(" + expression + "))";
            }
        } else {
            String t = "";
            if (to.isArray()) {
                while (to.isArray()) {
                    to = to.getComponentType();
                    t = t + "[]";
                }
            }
            return "((" + to.getName() + t + ") " + expression + ")";
        }
    }

    static <O, R> MethodReference resolveStatic(TypeToken<O> clazz, String name, TypeToken<R> returnType, TypeToken<?>... paramTypes) {
        return resolve(clazz, true, name, returnType, paramTypes);
    }

    static <O> VoidMethodReference resolveStaticVoid(TypeToken<O> clazz, String name, TypeToken<?>... paramTypes) {
        return (VoidMethodReference) resolve(clazz, true, name, TypeToken.of(void.class), paramTypes);
    }

    static <O, R> MethodReference resolveVirtual(TypeToken<O> clazz, String name, TypeToken<R> returnType, TypeToken<?>... paramTypes) {
        return resolve(clazz, false, name, returnType, paramTypes);
    }

    static <O> VoidMethodReference resolveVirtualVoid(TypeToken<O> clazz, String name, TypeToken<?>... paramTypes) {
        return (VoidMethodReference) resolve(clazz, false, name, TypeToken.of(void.class), paramTypes);
    }
}
