package com.facebook.redex;

import X.AnonymousClass3K2;
import X.C28381Vw;
import X.C30031bd;
import android.view.View;
import android.view.ViewTreeObserver;

public class IDxDListenerShape38S0300000_2_I0 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxDListenerShape38S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public boolean onPreDraw() {
        if (this.A03 != 0) {
            View view = (View) this.A01;
            int height = view.getHeight();
            View view2 = (View) this.A02;
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom() + height);
            AnonymousClass3K2.A10(view, this);
            return false;
        }
        C30031bd r1 = (C30031bd) this.A02;
        AnonymousClass3K2.A10(r1, this);
        r1.A0i((C28381Vw) this.A01);
        return true;
    }
}
