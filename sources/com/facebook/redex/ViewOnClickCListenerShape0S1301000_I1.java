package com.facebook.redex;

import X.AnonymousClass028;
import X.AnonymousClass1YK;
import X.AnonymousClass4Y3;
import X.C14750ph;
import X.C15830rv;
import X.C16490t9;
import X.C28711Xg;
import X.C64893Sb;
import X.C64943Sg;
import X.C75573sN;
import android.view.View;

public class ViewOnClickCListenerShape0S1301000_I1 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public ViewOnClickCListenerShape0S1301000_I1(Object obj, Object obj2, Object obj3, String str, int i2, int i3) {
        this.A05 = i3;
        this.A01 = obj;
        this.A04 = str;
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onClick(View view) {
        int i2 = this.A05;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                C64893Sb r5 = (C64893Sb) obj;
                String str = this.A04;
                int i3 = this.A00;
                C28711Xg r4 = (C28711Xg) this.A02;
                C16490t9 r2 = r5.A07;
                C75573sN r1 = new C75573sN();
                AnonymousClass4Y3.A01(r1, str, 3, i3);
                r2.A06(r1);
                ((AnonymousClass028) this.A03).A0B(C14750ph.A0L(r5.A0H.getContext(), r4.A01(), str, 0, i3, r4.A00.A0G));
                return;
            case 1:
                C64943Sg r52 = (C64943Sg) obj;
                String str2 = this.A04;
                int i4 = this.A00;
                C16490t9 r22 = r52.A06;
                C75573sN r12 = new C75573sN();
                AnonymousClass4Y3.A01(r12, str2, 5, i4);
                r22.A06(r12);
                ((AnonymousClass028) this.A03).A0B(C14750ph.A0L(r52.A0H.getContext(), (C15830rv) null, str2, 1, i4, ((AnonymousClass1YK) this.A02).A01));
                return;
            default:
                C64943Sg r53 = (C64943Sg) obj;
                String str3 = this.A04;
                int i5 = this.A00;
                C16490t9 r23 = r53.A06;
                C75573sN r13 = new C75573sN();
                AnonymousClass4Y3.A01(r13, str3, 4, i5);
                r23.A06(r13);
                ((AnonymousClass028) this.A03).A0B(C14750ph.A0L(r53.A0H.getContext(), (C15830rv) null, str3, 2, i5, ((AnonymousClass1YK) this.A02).A01));
                return;
        }
    }
}
