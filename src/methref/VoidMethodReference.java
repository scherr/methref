package methref;

import com.google.common.reflect.Invokable;

import java.util.function.Consumer;

public abstract class VoidMethodReference extends MethodReference<Void> {
    VoidMethodReference(Invokable<?, Void> invokable) {
        super(invokable);
    }

    public abstract static class _0 extends VoidMethodReference {
        _0(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke();
    }

    public abstract static class _1<A0> extends VoidMethodReference implements Consumer<A0> {
        _1(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0);

        @Override
        public void accept(A0 arg0) { invoke(arg0); }
    }

    public abstract static class _2<A0, A1> extends VoidMethodReference {
        _2(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1);

    }

    public abstract static class _3<A0, A1, A2> extends VoidMethodReference {
        _3(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2);
    }

    public abstract static class _4<A0, A1, A2, A3> extends VoidMethodReference {
        _4(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3);
    }

    public abstract static class _5<A0, A1, A2, A3, A4> extends VoidMethodReference {
        _5(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4);
    }

    public abstract static class _6<A0, A1, A2, A3, A4, A5> extends VoidMethodReference {
        _6(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5);
    }

    public abstract static class _7<A0, A1, A2, A3, A4, A5, A6> extends VoidMethodReference {
        _7(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6);
    }

    public abstract static class _8<A0, A1, A2, A3, A4, A5, A6, A7> extends VoidMethodReference {
        _8(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7);
    }

    public abstract static class _9<A0, A1, A2, A3, A4, A5, A6, A7, A8> extends VoidMethodReference {
        _9(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8);
    }

    public abstract static class _10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9> extends VoidMethodReference {
        _10(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9);
    }

    public abstract static class _11<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10> extends VoidMethodReference {
        _11(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10);
    }

    public abstract static class _12<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11> extends VoidMethodReference {
        _12(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11);
    }

    public abstract static class _13<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12> extends VoidMethodReference {
        _13(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12);
    }

    public abstract static class _14<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13> extends VoidMethodReference {
        _14(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13);
    }

    public abstract static class _15<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14> extends VoidMethodReference {
        _15(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14);
    }

    public abstract static class _16<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15> extends VoidMethodReference {
        _16(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15);
    }

    public abstract static class _17<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16> extends VoidMethodReference {
        _17(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16);
    }

    public abstract static class _18<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17> extends VoidMethodReference {
        _18(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17);
    }

    public abstract static class _19<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18> extends VoidMethodReference {
        _19(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18);
    }

    public abstract static class _20<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19> extends VoidMethodReference {
        _20(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19);
    }

    public abstract static class _21<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20> extends VoidMethodReference {
        _21(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20);
    }

    public abstract static class _22<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21> extends VoidMethodReference {
        _22(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21);
    }

    public abstract static class _23<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22> extends VoidMethodReference {
        _23(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22);
    }

    public abstract static class _24<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23> extends VoidMethodReference {
        _24(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23);
    }

    public abstract static class _25<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24> extends VoidMethodReference {
        _25(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24);
    }

    public abstract static class _26<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25> extends VoidMethodReference {
        _26(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25);
    }

    public abstract static class _27<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26> extends VoidMethodReference {
        _27(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26);
    }

    public abstract static class _28<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27> extends VoidMethodReference {
        _28(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27);
    }

    public abstract static class _29<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28> extends VoidMethodReference {
        _29(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27, A28 arg28);
    }

    public abstract static class _30<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29> extends VoidMethodReference {
        _30(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27, A28 arg28, A29 arg29);
    }

    public abstract static class _31<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30> extends VoidMethodReference {
        _31(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27, A28 arg28, A29 arg29, A30 arg30);
    }

    public abstract static class _32<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31> extends VoidMethodReference {
        _32(Invokable<?, Void> invokable) {
            super(invokable);
        }
    
        public abstract void invoke(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8, A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13, A14 arg14, A15 arg15, A16 arg16, A17 arg17, A18 arg18, A19 arg19, A20 arg20, A21 arg21, A22 arg22, A23 arg23, A24 arg24, A25 arg25, A26 arg26, A27 arg27, A28 arg28, A29 arg29, A30 arg30, A31 arg31);
    }
}
