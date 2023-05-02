package com.facebook.redex;

import X.C108715Pb;
import X.C17020u3;
import X.C37781pj;
import X.C57732rf;
import X.C61953Bb;

public class IDxSListenerShape437S0100000_2_I1 implements C108715Pb {
    public Object A00;
    public final int A01;

    public IDxSListenerShape437S0100000_2_I1(C57732rf r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final void AXI(int[] iArr) {
        int i2 = this.A01;
        C57732rf r3 = (C57732rf) this.A00;
        C37781pj r2 = new C37781pj(iArr);
        r3.A05.AQJ(r2, r3.A00);
        int i3 = r3.A00;
        r3.A01 = r2;
        r3.A00 = i3;
        C17020u3 r0 = r3.A06;
        if (i2 != 0) {
            C61953Bb.A02(r0, iArr);
        } else {
            C61953Bb.A01(r0, iArr);
        }
        r3.A08();
    }
}
