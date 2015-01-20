package methref.examples;

import com.google.common.reflect.TypeToken;
import methref.MethodReference;
import methref.Static;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.function.BiFunction;

public class Addition {
    public static int add(int a, int b) { return a + b; }
    public static long example() throws Throwable {
        MethodReference._2<Integer, Integer, Integer> mRef = Static.resolve(new TypeToken<Addition>(){}, "add", TypeToken.of(int.class), TypeToken.of(int.class), TypeToken.of(int.class));
        BiFunction<Integer, Integer, Integer> mLam = Addition::add;
        java.lang.reflect.Method mReflect = Addition.class.getDeclaredMethod("add", int.class, int.class);
        MethodHandle mHandle = MethodHandles.lookup().unreflect(mReflect);

        int r;

        r = 0;
        for (int i = 0; i < 100000000; i++) {
            // r += mLam.apply(i, i);
            // r += (Integer) mReflect.invoke(null, i, i);
            // r += (Integer) mHandle.invoke(i, i);
            r += mRef.invoke(i, i);
            // r += add(i, i);
        }

        long start = System.currentTimeMillis();
        r = 0;
        for (int i = 0; i < 100000000; i++) {
            // r += mLam.apply(i, i); // [804, 827, 815, 810, 805, 809, 799, 824, 802, 807]
            // r += (Integer) mReflect.invoke(null, i, i); // [1061, 741, 573, 589, 584, 579, 583, 586, 582, 589]
            // r += (Integer) mHandle.invoke(i, i); // [715, 693, 680, 672, 686, 695, 707, 687, 685, 676]
            r += mRef.invoke(i, i); // [841, 831, 794, 817, 802, 802, 796, 801, 812, 804]
            // r += add(i, i); // [39, 32, 30, 31, 31, 29, 29, 30, 31, 30]
        }
        long end = System.currentTimeMillis();

        System.out.println(r);
        return end - start;
    }

    public static Integer addWrapped(Integer a, Integer b) { return a + b; }
    public static long exampleWrapped() throws Throwable {
        MethodReference._2<Integer, Integer, Integer> mRef = Static.resolve(new TypeToken<Addition>(){}, "addWrapped", TypeToken.of(Integer.class), TypeToken.of(Integer.class), TypeToken.of(Integer.class));
        BiFunction<Integer, Integer, Integer> mLam = Addition::addWrapped;
        java.lang.reflect.Method mReflect = Addition.class.getDeclaredMethod("addWrapped", Integer.class, Integer.class);
        MethodHandle mHandle = MethodHandles.lookup().unreflect(mReflect);

        int r;

        r = 0;
        for (int i = 0; i < 1000000000; i++) {
            // r += mLam.apply(i, i);
            // r += (Integer) mReflect.invoke(null, i, i);
            // r += (Integer) mHandle.invoke(i, i);
            r += mRef.invoke(i, i);
            // r += addWrapped(i, i);
        }

        long start = System.currentTimeMillis();
        r = 0;
        for (int i = 0; i < 100000000; i++) {
            // r += mLam.apply(i, i); // [897, 803, 786, 774, 840, 827, 1002, 785, 777, 771]
            // r += (Integer) mReflect.invoke(null, i, i); // [1308, 1071, 832, 849, 857, 836, 859, 847, 834, 836]
            // r += (Integer) mHandle.invoke(i, i); // [1258, 1187, 1200, 1177, 1196, 1203, 1180, 1215, 1224, 1251]
            r += mRef.invoke(i, i); // [847, 823, 809, 816, 815, 826, 828, 803, 807, 813]
            // r += addWrapped(i, i); // [800, 815, 823, 797, 806, 789, 795, 812, 800, 786]
        }
        long end = System.currentTimeMillis();

        System.out.println(r);
        return end - start;
    }

    public static int mul(int a, int b) { return a * b; }
    public static long exampleAlternate() throws Throwable {
        MethodReference._2<Integer, Integer, Integer> mRef;
        java.lang.reflect.Method mReflect;

        int r;

        r = 0;
        for (int i = 0; i < 5000000; i++) {
            if (i % 213 == 0) {
                mRef = Static.resolve(new TypeToken<Addition>(){}, "add", TypeToken.of(int.class), TypeToken.of(int.class), TypeToken.of(int.class));
                // mReflect = Addition.class.getDeclaredMethod("add", int.class, int.class);
            } else {
                mRef = Static.resolve(new TypeToken<Addition>(){}, "mul", TypeToken.of(int.class), TypeToken.of(int.class), TypeToken.of(int.class));
                // mReflect = Addition.class.getDeclaredMethod("mul", int.class, int.class);
            }
            r += mRef.invoke(i, i);
            // r += (Integer) mReflect.invoke(null, i, i);
        }

        long acc = 0;
        r = 0;
        for (int i = 0; i < 5000000; i++) {
            if (i % 213 == 0) {
                mRef = Static.resolve(new TypeToken<Addition>(){}, "add", TypeToken.of(int.class), TypeToken.of(int.class), TypeToken.of(int.class));
                // mReflect = Addition.class.getDeclaredMethod("add", int.class, int.class);
            } else {
                mRef = Static.resolve(new TypeToken<Addition>(){}, "mul", TypeToken.of(int.class), TypeToken.of(int.class), TypeToken.of(int.class));
                // mReflect = Addition.class.getDeclaredMethod("mul", int.class, int.class);
            }
            long start = System.currentTimeMillis();
            r += mRef.invoke(i, i);
            // r += (Integer) mReflect.invoke(null, i, i); // [264, 244, 274, 240, 242, 256, 237, 252, 247, 277]
            acc += System.currentTimeMillis() - start; // [257, 242, 239, 237, 236, 231, 241, 219, 222, 219]
        }

        System.out.println(r);
        return acc;
    }

    private static int proxyReflect(Method m, int a, int b) throws InvocationTargetException, IllegalAccessException {
        return (Integer) m.invoke(null, a, b);
    }
    private static int proxyReference(MethodReference._2<Integer, Integer, Integer> m, int a, int b) throws InvocationTargetException, IllegalAccessException {
        return m.invoke(a, b);
    }
    public static long exampleProxy() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MethodReference._2<Integer, Integer, Integer> mRef = Static.resolve(new TypeToken<Addition>(){}, "add", TypeToken.of(int.class), TypeToken.of(int.class), TypeToken.of(int.class));
        java.lang.reflect.Method mReflect = Addition.class.getDeclaredMethod("add", int.class, int.class);

        int r;

        r = 0;
        for (int i = 0; i < 100000000; i++) {
            r += proxyReflect(mReflect, i, i);
            // r += proxyReference(mRef, i, i);
        }

        long start = System.currentTimeMillis();
        r = 0;
        for (int i = 0; i < 100000000; i++) {
            r += proxyReflect(mReflect, i, i); // [1312, 1081, 834, 925, 882, 954, 852, 858, 926, 861]
            // r += proxyReference(mRef, i, i); // [828, 838, 806, 800, 828, 809, 796, 796, 830, 825]
        }
        long end = System.currentTimeMillis();

        System.out.println(r);
        return end - start;
    }

    public static void main(String[] args) throws Throwable {
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(exampleProxy());
        }
        System.out.println(list);
    }
}
