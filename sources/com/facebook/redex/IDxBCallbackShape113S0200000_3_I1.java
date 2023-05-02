package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1Z7;
import X.AnonymousClass2HJ;
import X.AnonymousClass608;
import X.AnonymousClass68M;
import X.C110105dW;
import X.C112855jo;
import X.C35391lr;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IDxBCallbackShape113S0200000_3_I1 implements AnonymousClass68M {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxBCallbackShape113S0200000_3_I1(AnonymousClass1Z7 r1, BrazilPayBloksActivity brazilPayBloksActivity, int i2) {
        this.A02 = i2;
        this.A00 = brazilPayBloksActivity;
        this.A01 = r1;
    }

    public final void APf(C35391lr r14, AnonymousClass2HJ r15, ArrayList arrayList, boolean z2) {
        AnonymousClass1Z7 r3;
        Map map;
        int i2;
        int i3 = this.A02;
        C35391lr r4 = r14;
        ArrayList arrayList2 = arrayList;
        boolean z3 = z2;
        Object obj = this.A00;
        if (i3 != 0) {
            C112855jo r5 = (C112855jo) obj;
            r3 = (AnonymousClass1Z7) this.A01;
            HashMap A0x = AnonymousClass000.A0x();
            if (r15 != null) {
                C110105dW.A1I(r15, A0x);
                r3.A01("on_failure", A0x);
                return;
            }
            A0x.put("verified_state", z2 ? "1" : "0");
            if (z2) {
                r5.A0G.A01().A02(new IDxSListenerShape12S0400000_3_I1(r3, r4, r5, A0x, 1), r14);
                return;
            } else if (r14 == null || arrayList == null || arrayList2.isEmpty()) {
                map = null;
                i2 = -233;
            } else {
                r5.A0G.A01().A02(new IDxSListenerShape12S0400000_3_I1(A0x, arrayList2, r5, r3, 2), r14);
                return;
            }
        } else {
            BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) obj;
            r3 = (AnonymousClass1Z7) this.A01;
            if (r15 != null) {
                map = null;
                i2 = r15.A00;
            } else {
                brazilPayBloksActivity.A0G.A01().A02(new AnonymousClass608(r3, r4, brazilPayBloksActivity, arrayList2, z3), r14);
                return;
            }
        }
        C112855jo.A09(r3, map, i2);
    }
}
