package com.facebook.redex;

import X.AnonymousClass1ZP;
import X.C54292hA;

public class IDxCListenerShape263S0100000_2_I0 implements C54292hA {
    public Object A00;
    public final int A01;

    public IDxCListenerShape263S0100000_2_I0(AnonymousClass1ZP r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final void AOW() {
        int i2 = this.A01;
        AnonymousClass1ZP r0 = (AnonymousClass1ZP) this.A00;
        switch (i2) {
            case 0:
                r0.A6N();
                return;
            case 1:
                AnonymousClass1ZP.A02(r0);
                return;
            case 2:
                AnonymousClass1ZP.A03(r0);
                return;
            case 3:
                AnonymousClass1ZP.A05(r0);
                return;
            default:
                AnonymousClass1ZP.A06(r0);
                return;
        }
    }
}
