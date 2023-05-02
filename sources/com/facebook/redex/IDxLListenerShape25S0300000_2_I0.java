package com.facebook.redex;

import X.AnonymousClass29S;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;

public class IDxLListenerShape25S0300000_2_I0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLListenerShape25S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void onGlobalLayout() {
        if (2 - this.A03 != 0) {
            View view = (View) this.A02;
            AnonymousClass3K3.A16(view, this);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setDuration(200);
            view.startAnimation(translateAnimation);
            ((View) this.A01).startAnimation(translateAnimation);
            return;
        }
        View view2 = (View) this.A01;
        AnonymousClass3K2.A0z(view2, this);
        ((AnonymousClass29S) this.A00).A0Q((Float) this.A02, view2.getMeasuredHeight(), false);
    }
}
