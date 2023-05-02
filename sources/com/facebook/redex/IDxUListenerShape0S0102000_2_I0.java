package com.facebook.redex;

import X.AnonymousClass000;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector;

public class IDxUListenerShape0S0102000_2_I0 implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public IDxUListenerShape0S0102000_2_I0(Object obj, int i2, int i3, int i4) {
        this.A03 = i4;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A03 != 0) {
            int i2 = this.A00;
            int i3 = this.A01;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            ((ViewGroup.MarginLayoutParams) this.A02).setMargins(0, (int) ((animatedFraction * ((float) i2)) + ((1.0f - animatedFraction) * ((float) i3))), 0, 0);
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
        int measuredWidth = quantitySelector.A0G.getMeasuredWidth();
        TextView textView = quantitySelector.A0E;
        if (A0D > i4 + (textView.getMeasuredWidth() << 1) + (((measuredWidth - textView.getMeasuredWidth()) >> 1) >> 1)) {
            quantitySelector.A02();
        }
        if (A0D == i5) {
            quantitySelector.A0A = false;
            quantitySelector.A02.removeAllUpdateListeners();
        }
    }
}
