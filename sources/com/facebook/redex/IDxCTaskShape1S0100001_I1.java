package com.facebook.redex;

import X.AnonymousClass0Ak;
import X.AnonymousClass0Rs;
import X.C12620kh;

public class IDxCTaskShape1S0100001_I1 implements C12620kh {
    public float A00;
    public Object A01;
    public final int A02;

    public IDxCTaskShape1S0100001_I1(AnonymousClass0Ak r1, float f2, int i2) {
        this.A02 = i2;
        this.A01 = r1;
        this.A00 = f2;
    }

    public void Aci(AnonymousClass0Rs r4) {
        int i2 = this.A02;
        AnonymousClass0Ak r1 = (AnonymousClass0Ak) this.A01;
        float f2 = this.A00;
        switch (i2) {
            case 0:
                r1.A06(f2);
                return;
            case 1:
                r1.A05(f2);
                return;
            default:
                r1.A04(f2);
                return;
        }
    }
}
