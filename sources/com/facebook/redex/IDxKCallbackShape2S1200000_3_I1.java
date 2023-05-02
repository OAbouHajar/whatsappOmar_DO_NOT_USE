package com.facebook.redex;

import X.AnonymousClass5wV;
import X.AnonymousClass60t;
import X.AnonymousClass68W;
import X.AnonymousClass68X;
import X.C117915tl;
import X.C118365uZ;
import X.C1202160u;

public class IDxKCallbackShape2S1200000_3_I1 implements AnonymousClass68W {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxKCallbackShape2S1200000_3_I1(AnonymousClass68X r1, AnonymousClass5wV r2, String str, int i2) {
        this.A03 = i2;
        this.A00 = r2;
        this.A02 = str;
        this.A01 = r1;
    }

    public final void AWM(C117915tl r7) {
        AnonymousClass5wV r5;
        String str;
        AnonymousClass68X r3;
        C118365uZ r2;
        int i2;
        switch (this.A03) {
            case 0:
                AnonymousClass5wV r4 = (AnonymousClass5wV) this.A00;
                r4.A06.A00(new AnonymousClass60t((AnonymousClass68X) this.A01, r4, r7), r7, this.A02);
                return;
            case 1:
                r5 = (AnonymousClass5wV) this.A00;
                str = this.A02;
                r3 = (AnonymousClass68X) this.A01;
                r2 = r5.A06;
                i2 = 0;
                break;
            case 2:
                r5 = (AnonymousClass5wV) this.A00;
                str = this.A02;
                r3 = (AnonymousClass68X) this.A01;
                r2 = r5.A06;
                i2 = 1;
                break;
            default:
                AnonymousClass5wV r42 = (AnonymousClass5wV) this.A00;
                r42.A06.A00(new C1202160u((AnonymousClass68X) this.A01, r42, r7), r7, this.A02);
                return;
        }
        r2.A00(new IDxTCallbackShape44S0300000_3_I1(r3, r5, r7, i2), r7, str);
    }
}
