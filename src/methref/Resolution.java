package methref;

import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeToken;
import javassist.*;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

class Resolution {
    private static ConcurrentHashMap<Invokable<?, ?>, MethodReference> cache = new ConcurrentHashMap<>();

    private static <O, R> MethodReference resolve(TypeToken<O> clazz, String name, TypeToken<R> returnType, TypeToken<?>... paramTypes) {
        Class<?>[] rawParamTypes = new Class[paramTypes.length];
        for (int i = 0; i < paramTypes.length; i++) {
            rawParamTypes[i] = paramTypes[i].getRawType();
        }

        Class<? super O> rawClass = clazz.getRawType();

        java.lang.reflect.Method rawMethod;
        try {
            rawMethod = rawClass.getMethod(name, rawParamTypes);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        if (!returnType.getType().equals(rawMethod.getGenericReturnType())) {
            throw new RuntimeException("Requested return type \"" + returnType.getType() + "\" does not match actual return type \"" + rawMethod.getGenericReturnType() + "\"." );
        }

        Invokable<O, R> invokable = (Invokable<O, R>) clazz.method(rawMethod);

        return cache.computeIfAbsent(invokable, inv -> {
            ClassPool cp = ClassPool.getDefault();
            CtClass c = cp.makeClass(Resolution.class.getName() + "$ResolvedMethodReference" + cache.size());

            c.setModifiers(Modifier.FINAL);

            try {
                if (returnType.getRawType() == void.class) {
                    c.setSuperclass(cp.get(VoidMethodReference.class.getName() + "$_" + paramTypes.length));
                } else {
                    c.setSuperclass(cp.get(MethodReference.class.getName() + "$_" + paramTypes.length));
                }

                CtConstructor constructor = CtNewConstructor.make("constructor(" + Invokable.class.getName() + " invokable) { super(invokable); }", c);
                c.addConstructor(constructor);

                StringBuilder methodSource = new StringBuilder();
                if (returnType.getRawType() == void.class) {
                    methodSource.append("public void invoke(");
                } else {
                    methodSource.append("public Object invoke(");
                }

                for (int i = 0; i < paramTypes.length - 1; i++) {
                    methodSource.append("Object arg" + i + ", ");
                }
                if (paramTypes.length > 0) {
                    methodSource.append("Object arg" + (paramTypes.length - 1));
                }
                methodSource.append(") {\n");

                StringBuilder expression = new StringBuilder();
                if (invokable.isStatic()) {
                    expression.append(rawClass.getName() + "." + name + "(");
                    for (int i = 0; i < paramTypes.length - 1; i++) {
                        expression.append(convert(cp, Object.class, rawParamTypes[i], "arg" + i) + ", ");
                    }
                    if (paramTypes.length > 0) {
                        expression.append(convert(cp, Object.class, rawParamTypes[paramTypes.length - 1], "arg" + (paramTypes.length - 1)));
                    }
                    expression.append(")");
                } else {
                    expression.append("arg0." + name + "(");
                    for (int i = 1; i < paramTypes.length - 1; i++) {
                        expression.append(convert(cp, Object.class, rawParamTypes[i], "arg" + i) + ", ");
                    }
                    if (paramTypes.length > 1) {
                        expression.append(convert(cp, Object.class, rawParamTypes[paramTypes.length - 1], "arg" + (paramTypes.length - 1)));
                    }
                    expression.append(")");
                }

                if (returnType.getRawType() == void.class) {
                    methodSource.append("   " + expression.toString());
                } else {
                    methodSource.append("   return " + convert(cp, rawMethod.getReturnType(), Object.class, expression.toString()));
                }
                methodSource.append(";\n }");

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
        return resolve(clazz, name, returnType, paramTypes);
    }

    static <O> VoidMethodReference resolveStaticVoid(TypeToken<O> clazz, String name, TypeToken<?>... paramTypes) {
        return (VoidMethodReference) resolve(clazz, name, TypeToken.of(void.class), paramTypes);
    }

    static <O, R> MethodReference resolveVirtual(TypeToken<O> clazz, String name, TypeToken<R> returnType, TypeToken<?>... paramTypes) {
        return resolve(clazz, name, returnType, paramTypes);
    }

    static <O> VoidMethodReference resolveVirtualVoid(TypeToken<O> clazz, String name, TypeToken<?>... paramTypes) {
        return (VoidMethodReference) resolve(clazz, name, TypeToken.of(void.class), paramTypes);
    }
}
