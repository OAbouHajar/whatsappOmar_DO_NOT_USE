package com.facebook.redex;

import X.AnonymousClass000;
import android.animation.ValueAnimator;
import org.npci.commonlibrary.widget.FormItemEditText;

public class IDxUListenerShape142S0100000_3_I1 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public IDxUListenerShape142S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A01) {
            case 0:
                IDxUListenerShape142S0100000_3_I1.super.setTextSize(0, AnonymousClass000.A04(valueAnimator.getAnimatedValue()));
                return;
            case 1:
                FormItemEditText formItemEditText = (FormItemEditText) this.A00;
                formItemEditText.A09.setAlpha(((Number) valueAnimator.getAnimatedValue()).intValue());
                formItemEditText.invalidate();
                return;
            default:
                ((FormItemEditText) this.A00).A09.setAlpha(((Number) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
