package com.facebook.redex;

import X.AnonymousClass0Ak;
import X.AnonymousClass0Rs;
import X.C12620kh;

public class IDxCTaskShape17S0101000_I1 implements C12620kh {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxCTaskShape17S0101000_I1(AnonymousClass0Ak r1, int i2, int i3) {
        this.A02 = i3;
        this.A01 = r1;
        this.A00 = i2;
    }

    public void Aci(AnonymousClass0Rs r4) {
        int i2 = this.A02;
        AnonymousClass0Ak r1 = (AnonymousClass0Ak) this.A01;
        int i3 = this.A00;
        switch (i2) {
            case 0:
                r1.A08(i3);
                return;
            case 1:
                r1.A0A(i3);
                return;
            default:
                r1.A09(i3);
                return;
        }
    }
}
