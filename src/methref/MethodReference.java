package methref;

import com.google.common.reflect.Invokable;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class MethodReference {
    final Invokable<?, ?> invokable;

    MethodReference(Invokable<?, ?> invokable) {
        this.invokable = invokable;
    }

    public Invokable<?, ?> getInvokable() {
        return invokable;
    }

    public abstract static class _0<R> extends MethodReference implements Supplier<R> {
        _0(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke();

        @Override
        public R get() { return invoke(); }
    }

    public abstract static class _1<R, A0> extends MethodReference implements Function<A0, R> {
        _1(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0);

        @Override
        public R apply(A0 arg0) { return invoke(arg0); }
    }

    public abstract static class _2<R, A0, A1> extends MethodReference implements BiFunction<A0, A1, R> {
        _2(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1);

        @Override
        public R apply(A0 arg0, A1 arg1) { return invoke(arg0, arg1); }
    }

    public abstract static class _3<R, A0, A1, A2> extends MethodReference {
        _3(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2);
    }

    public abstract static class _4<R, A0, A1, A2, A3> extends MethodReference {
        _4(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3);
    }

    public abstract static class _5<R, A0, A1, A2, A3, A4> extends MethodReference {
        _5(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4);
    }

    public abstract static class _6<R, A0, A1, A2, A3, A4, A5> extends MethodReference {
        _6(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5);
    }

    public abstract static class _7<R, A0, A1, A2, A3, A4, A5, A6> extends MethodReference {
        _7(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6);
    }

    public abstract static class _8<R, A0, A1, A2, A3, A4, A5, A6, A7> extends MethodReference {
        _8(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7);
    }

    public abstract static class _9<R, A0, A1, A2, A3, A4, A5, A6, A7, A8> extends MethodReference {
        _9(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8);
    }

    public abstract static class _10<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9> extends MethodReference {
        _10(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9);
    }

    public abstract static class _11<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10> extends MethodReference {
        _11(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10);
    }

    public abstract static class _12<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11> extends MethodReference {
        _12(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11);
    }

    public abstract static class _13<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12> extends MethodReference {
        _13(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12);
    }

    public abstract static class _14<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13> extends MethodReference {
        _14(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13);
    }

    public abstract static class _15<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14> extends MethodReference {
        _15(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14);
    }

    public abstract static class _16<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15> extends MethodReference {
        _16(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15);
    }

    public abstract static class _17<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16> extends MethodReference {
        _17(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16);
    }

    public abstract static class _18<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17> extends MethodReference {
        _18(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17);
    }

    public abstract static class _19<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18> extends MethodReference {
        _19(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18);
    }

    public abstract static class _20<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19> extends MethodReference {
        _20(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19);
    }

    public abstract static class _21<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20> extends MethodReference {
        _21(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20);
    }

    public abstract static class _22<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21> extends MethodReference {
        _22(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21);
    }

    public abstract static class _23<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22> extends MethodReference {
        _23(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22);
    }

    public abstract static class _24<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23> extends MethodReference {
        _24(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23);
    }

    public abstract static class _25<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24> extends MethodReference {
        _25(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24);
    }

    public abstract static class _26<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25> extends MethodReference {
        _26(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25);
    }

    public abstract static class _27<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26> extends MethodReference {
        _27(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26);
    }

    public abstract static class _28<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27> extends MethodReference {
        _28(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27);
    }

    public abstract static class _29<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28> extends MethodReference {
        _29(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27, A28 arg28);
    }

    public abstract static class _30<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29> extends MethodReference {
        _30(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27, A28 arg28, A29 arg29);
    }

    public abstract static class _31<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30> extends MethodReference {
        _31(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27, A28 arg28, A29 arg29, A30 arg30);
    }

    public abstract static class _32<R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31> extends MethodReference {
        _32(Invokable<?, R> invokable) {
            super(invokable);
        }
    
        public abstract R invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27, A28 arg28, A29 arg29, A30 arg30, A31 arg31);
    }
}
