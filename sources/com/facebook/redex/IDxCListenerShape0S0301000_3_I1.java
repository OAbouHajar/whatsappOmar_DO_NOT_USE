package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1Vt;
import X.AnonymousClass61S;
import X.C110755em;
import X.C110875ey;
import X.C111055fG;
import X.C114425nk;
import X.C117725tS;
import X.C118275uQ;
import X.C13680ns;
import X.C13700nu;
import X.C209712h;
import X.C30671cl;
import X.C35361lo;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class IDxCListenerShape0S0301000_3_I1 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCListenerShape0S0301000_3_I1(Object obj, Object obj2, Object obj3, int i2, int i3) {
        this.A04 = i3;
        this.A01 = obj3;
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onClick(View view) {
        if (this.A04 != 0) {
            C117725tS A002 = C117725tS.A00(this.A00);
            A002.A04 = (C30671cl) this.A02;
            A002.A05 = (AnonymousClass1Vt) this.A03;
            C110755em.A01((C110755em) this.A01, A002);
            return;
        }
        C110875ey r4 = (C110875ey) this.A01;
        int i2 = this.A00;
        C111055fG r7 = (C111055fG) this.A02;
        C118275uQ r6 = (C118275uQ) this.A03;
        List list = r4.A05;
        if (((C118275uQ) list.get(i2)).A01) {
            C118275uQ r2 = (C118275uQ) list.get(i2);
            C35361lo r5 = r2.A03;
            if (r5 != null) {
                r7.A02.setVisibility(8);
                r7.A03.setVisibility(0);
                C209712h r42 = r7.A05;
                AnonymousClass61S r3 = new AnonymousClass61S(r2, r7);
                if (TextUtils.isEmpty(r5.A05)) {
                    C13700nu.A0W(new C114425nk(r5, r3, r42), r42.A0D);
                    return;
                }
                r42.A0D.Acl(new RunnableRunnableShape1S0300000_I0_1(r42, r5, r3, 36));
                return;
            }
            throw AnonymousClass000.A0V("Default theme should not have download failed state");
        } else if (r4.A00 != i2) {
            ArrayList A0n = C13680ns.A0n(list);
            C118275uQ r1 = new C118275uQ(((C118275uQ) list.get(r4.A00)).A03);
            r1.A02 = false;
            r1.A00 = ((C118275uQ) list.get(r4.A00)).A00;
            r1.A01 = ((C118275uQ) list.get(r4.A00)).A01;
            A0n.set(r4.A00, r1);
            C35361lo r22 = r6.A03;
            C118275uQ r12 = new C118275uQ(r22);
            r12.A02 = true;
            r12.A00 = r6.A00;
            r12.A01 = r6.A01;
            A0n.set(i2, r12);
            r4.A01 = r22;
            r4.A00 = i2;
            r4.A04.AYn(r22);
            r4.A0E(A0n);
        }
    }
}
