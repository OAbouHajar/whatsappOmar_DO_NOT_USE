package com.facebook.redex;

import X.AnonymousClass0Ak;
import X.AnonymousClass0Rs;
import X.C12620kh;

public class IDxCTaskShape7S1100000_I1 implements C12620kh {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCTaskShape7S1100000_I1(AnonymousClass0Ak r1, String str, int i2) {
        this.A02 = i2;
        this.A00 = r1;
        this.A01 = str;
    }

    public void Aci(AnonymousClass0Rs r4) {
        int i2 = this.A02;
        AnonymousClass0Ak r1 = (AnonymousClass0Ak) this.A00;
        String str = this.A01;
        switch (i2) {
            case 0:
                r1.A0F(str);
                return;
            case 1:
                r1.A0G(str);
                return;
            default:
                r1.A0E(str);
                return;
        }
    }
}
