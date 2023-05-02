package com.facebook.redex;

import X.AnonymousClass261;
import X.AnonymousClass3FH;
import X.AnonymousClass4P1;
import X.C13690nt;
import X.C62923Fl;
import X.C85444Ol;
import X.C87124Vm;
import X.C87314Wg;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class IDxRCallbackShape41S0300000_2_I1 implements AnonymousClass261 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxRCallbackShape41S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void AVc() {
        int i2 = this.A03;
        Object obj = this.A00;
        if (i2 != 0) {
            AnonymousClass3FH r4 = (AnonymousClass3FH) obj;
            C87314Wg r3 = (C87314Wg) this.A01;
            List list = r3.A07;
            list.clear();
            list.addAll((Collection) this.A02);
            AnonymousClass4P1 r1 = r4.A09;
            r1.A04 = r3;
            r1.A02 = 1;
            r4.A05();
            r4.A09();
            if (list.isEmpty()) {
                r1.A02 = 6;
                r4.A05();
            } else {
                r4.A07();
            }
            r4.A0B(r3);
            return;
        }
        C62923Fl r42 = (C62923Fl) obj;
        C85444Ol r2 = (C85444Ol) this.A02;
        C85444Ol r12 = r42.A00;
        r12.A09.addAll((Collection) this.A01);
        C87124Vm r0 = r2.A01;
        if (r0 != null) {
            r12.A01 = r0;
        }
        Set set = r42.A01;
        set.add(Integer.valueOf(r2.A00));
        if (r42.A01()) {
            r42.A00(C13690nt.A1V(set, 1));
        }
    }
}
