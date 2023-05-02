package com.facebook.redex;

import X.AnonymousClass69X;
import android.graphics.drawable.Drawable;
import android.view.View;

public class IDxCListenerShape0S2400000_3_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06;

    public IDxCListenerShape0S2400000_3_I1(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i2) {
        this.A06 = i2;
        this.A00 = obj3;
        this.A01 = obj4;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public void onClick(View view) {
        String str;
        Object obj;
        AnonymousClass69X r1 = (AnonymousClass69X) this.A01;
        if (r1.Agx()) {
            str = this.A04;
            obj = this.A02;
        } else {
            str = this.A05;
            obj = this.A03;
        }
        r1.Agw((Drawable) obj, this, str, 0, true, true);
    }
}
