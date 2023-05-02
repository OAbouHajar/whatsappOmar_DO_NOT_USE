package com.facebook.redex;

import X.C108615Or;
import X.C14950q3;
import X.C31201dg;

public class IDxMWrapperShape226S0100000_2_I0 implements C108615Or {
    public Object A00;
    public final int A01;

    public IDxMWrapperShape226S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final C31201dg A9T() {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
            case 1:
                obj = ((C14950q3) obj).A00.get(0);
                break;
        }
        return (C31201dg) obj;
    }
}
