package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0y5;
import X.AnonymousClass5wV;
import X.AnonymousClass68W;
import X.AnonymousClass68X;
import X.C112105hx;
import X.C116325rC;
import X.C117915tl;
import X.C118245uN;
import X.C118365uZ;
import X.C118465uj;
import X.C1202260v;
import X.C1202460x;
import X.C1222268t;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C16320sq;
import X.C18300wT;
import java.util.ArrayList;

public class IDxKCallbackShape0S2200000_3_I1 implements AnonymousClass68W {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public IDxKCallbackShape0S2200000_3_I1(Object obj, Object obj2, String str, String str2, int i2) {
        this.A04 = i2;
        this.A00 = obj2;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = obj;
    }

    public final void AWM(C117915tl r15) {
        if (this.A04 != 0) {
            AnonymousClass5wV r5 = (AnonymousClass5wV) this.A00;
            r5.A06.A00(new C1202260v(r5, r15, (C118465uj) this.A01, this.A03), r15, this.A02);
            return;
        }
        AnonymousClass5wV r7 = (AnonymousClass5wV) this.A00;
        String str = this.A02;
        String str2 = this.A03;
        C118365uZ r3 = r7.A06;
        String[] strArr = new String[2];
        C13690nt.A1L(str, str2, strArr);
        C1202460x r52 = new C1202460x((AnonymousClass68X) this.A01, r7, r15);
        if ("token".equals(r15.A00.A03)) {
            C118245uN r8 = new C118245uN(r52);
            int i2 = 0;
            do {
                ArrayList A0u = AnonymousClass000.A0u();
                C13680ns.A1W("fbpay_pin", strArr[i2], A0u);
                C16320sq r0 = r3.A05;
                C116325rC r10 = r3.A03;
                C18300wT r6 = r3.A01;
                AnonymousClass0y5 r11 = r3.A04;
                C13700nu.A0W(new C112105hx(r3.A00, r6, r3.A02, r8, (C1222268t) null, r10, r11, A0u, i2), r0);
                i2++;
            } while (i2 < 2);
            return;
        }
        r52.AYF(strArr);
    }
}
