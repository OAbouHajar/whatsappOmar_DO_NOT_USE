package com.facebook.redex;

import X.AnonymousClass3BH;
import X.C108715Pb;
import X.C17020u3;
import X.C56562nu;
import X.C61953Bb;

public class IDxSListenerShape99S0200000_2_I1 implements C108715Pb {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSListenerShape99S0200000_2_I1(C56562nu r1, AnonymousClass3BH r2, int i2) {
        this.A02 = i2;
        this.A00 = r2;
        this.A01 = r1;
    }

    public final void AXI(int[] iArr) {
        int i2 = this.A02;
        AnonymousClass3BH r0 = (AnonymousClass3BH) this.A00;
        C56562nu r1 = (C56562nu) this.A01;
        r0.A02(iArr);
        r1.setEmoji(iArr);
        C17020u3 r02 = r0.A0P;
        if (i2 != 0) {
            C61953Bb.A01(r02, iArr);
        } else {
            C61953Bb.A02(r02, iArr);
        }
        r1.invalidate();
    }
}
