package com.facebook.redex;

import X.AnonymousClass027;
import X.C109255Ri;
import X.C35641mG;
import X.C450626x;

public class IDxCListenerShape105S0200000_2_I0 implements C109255Ri {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape105S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void AVp() {
        AnonymousClass027 r0;
        int i2 = this.A02;
        C450626x r3 = (C450626x) this.A00;
        C35641mG r2 = (C35641mG) this.A01;
        C450626x.A00(r2, r3, 48);
        r2.A00 = System.currentTimeMillis();
        if (i2 != 0) {
            r3.A01(r2);
            r0 = r3.A02;
        } else {
            r3.A01(r2);
            r0 = r3.A01;
        }
        r0.A0B(r2);
    }

    public void AVq() {
        C450626x r2 = (C450626x) this.A00;
        C35641mG r1 = (C35641mG) this.A01;
        C450626x.A00(r1, r2, 49);
        r2.A02(r1);
    }
}
