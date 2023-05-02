package com.facebook.redex;

import X.AnonymousClass000;
import X.C004601z;
import X.C15540rI;
import X.C34341k6;
import X.C63313Gy;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public class IDxUListenerShape11S0101000_2_I1 implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public Object A01;
    public final int A02 = 0;

    public IDxUListenerShape11S0101000_2_I1(C15540rI r2) {
        this.A01 = r2;
        this.A00 = 0;
    }

    public IDxUListenerShape11S0101000_2_I1(C63313Gy r2, int i2) {
        this.A01 = r2;
        this.A00 = i2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A02 != 0) {
            C63313Gy r3 = (C63313Gy) this.A01;
            int A03 = (int) (((float) this.A00) * (AnonymousClass000.A03(valueAnimator) / 100.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r3.A01.getLayoutParams();
            layoutParams.topMargin = -A03;
            r3.A01.setLayoutParams(layoutParams);
            return;
        }
        int A0D = AnonymousClass000.A0D(valueAnimator.getAnimatedValue());
        boolean z2 = C15540rI.A09;
        C34341k6 r1 = ((C15540rI) this.A01).A05;
        if (z2) {
            C004601z.A0b(r1, A0D - this.A00);
        } else {
            r1.setTranslationY((float) A0D);
        }
        this.A00 = A0D;
    }
}
