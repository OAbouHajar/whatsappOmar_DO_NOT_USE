package com.facebook.redex;

import X.AnonymousClass1KR;
import X.C13690nt;
import X.C19980zJ;
import X.C35661mI;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class ViewOnClickCListenerShape0S1630000_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;

    public ViewOnClickCListenerShape0S1630000_I1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i2, boolean z2, boolean z3, boolean z4) {
        this.A0A = i2;
        this.A00 = obj;
        this.A06 = str;
        this.A01 = obj2;
        this.A07 = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    public final void onClick(View view) {
        int i2 = this.A0A;
        AnonymousClass1KR r5 = (AnonymousClass1KR) this.A00;
        String str = this.A06;
        Integer num = (Integer) this.A01;
        boolean z2 = this.A07;
        boolean z3 = this.A08;
        boolean z4 = this.A09;
        C35661mI r4 = (C35661mI) this.A02;
        C19980zJ r3 = (C19980zJ) this.A03;
        if (i2 != 0) {
            View view2 = (View) this.A04;
            Uri uri = (Uri) this.A05;
            r5.A05((Integer) null, num, str, 6, z2, z3);
            if (z4) {
                r5.A01(r4, 9);
            }
            r3.A06(view2.getContext(), C13690nt.A0B(uri));
            return;
        }
        View view3 = (View) this.A04;
        Intent intent = (Intent) this.A05;
        r5.A05((Integer) null, num, str, 3, z2, z3);
        if (z4) {
            r5.A01(r4, 8);
        }
        r3.A06(view3.getContext(), intent);
    }
}
