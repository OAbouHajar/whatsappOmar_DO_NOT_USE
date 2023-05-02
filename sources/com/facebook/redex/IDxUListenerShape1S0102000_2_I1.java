package com.facebook.redex;

import X.AnonymousClass000;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector;

public class IDxUListenerShape1S0102000_2_I1 implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public IDxUListenerShape1S0102000_2_I1(Object obj, int i2, int i3, int i4) {
        this.A03 = i4;
        this.A02 = obj;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A03 != 0) {
            View view = (View) this.A02;
            int i2 = this.A00;
            int i3 = this.A01;
            view.setBackgroundColor(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
            if (i2 == R.color.color065f && AnonymousClass000.A0D(valueAnimator.getAnimatedValue()) == i3) {
                view.setBackgroundResource(0);
                return;
            }
            return;
        }
        QuantitySelector quantitySelector = (QuantitySelector) this.A02;
        int i4 = this.A00;
        int i5 = this.A01;
        int A0D = AnonymousClass000.A0D(valueAnimator.getAnimatedValue());
        if (A0D == i4) {
            quantitySelector.A0A = true;
        }
        ViewGroup.LayoutParams layoutParams = quantitySelector.getLayoutParams();
        layoutParams.width = A0D;
        quantitySelector.setLayoutParams(layoutParams);
        TextView textView = quantitySelector.A0E;
        if (A0D < (textView.getMeasuredWidth() << 1) + i5 + (((i5 - textView.getMeasuredWidth()) >> 1) >> 1)) {
            quantitySelector.A01();
        }
        if (A0D == i5) {
            quantitySelector.A0A = false;
            quantitySelector.A02.removeAllUpdateListeners();
        }
    }
}
