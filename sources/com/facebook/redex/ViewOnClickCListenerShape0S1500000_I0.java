package com.facebook.redex;

import X.AnonymousClass1Vt;
import X.AnonymousClass2SE;
import X.AnonymousClass3GG;
import X.C1222969a;
import X.C16740tZ;
import X.C228019i;
import android.content.Context;
import android.view.View;

public class ViewOnClickCListenerShape0S1500000_I0 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public ViewOnClickCListenerShape0S1500000_I0(Context context, AnonymousClass1Vt r2, AnonymousClass2SE r3, C228019i r4, C16740tZ r5, String str, int i2) {
        this.A06 = i2;
        this.A00 = r4;
        this.A05 = str;
        this.A01 = context;
        this.A02 = r2;
        this.A03 = r5;
        this.A04 = r3;
    }

    public final void onClick(View view) {
        boolean z2;
        C1222969a ACC;
        C1222969a ACC2;
        int i2 = this.A06;
        C228019i r7 = (C228019i) this.A00;
        String str = this.A05;
        Context context = (Context) this.A01;
        AnonymousClass1Vt r5 = (AnonymousClass1Vt) this.A02;
        C16740tZ r8 = (C16740tZ) this.A03;
        AnonymousClass2SE r6 = (AnonymousClass2SE) this.A04;
        if (i2 != 0) {
            if (!(str == null || (ACC2 = r7.A0B.A03().ACC()) == null)) {
                ACC2.AKS(1, 41, str, (String) null);
            }
            z2 = false;
        } else {
            if (!(str == null || (ACC = r7.A0B.A03().ACC()) == null)) {
                ACC.AKS(1, 42, str, (String) null);
            }
            z2 = true;
        }
        r7.A01(context, r5, new AnonymousClass3GG(context, r5, r6, r7, r8, str, z2), z2);
    }
}
