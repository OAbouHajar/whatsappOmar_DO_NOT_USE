package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.C13690nt;
import X.C52662eE;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimatingArrowsLayout extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public List A01;
    public boolean A02;
    public final AnimatorSet A03;

    public AnimatingArrowsLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.A03 = new AnimatorSet();
    }

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A03.start();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.A03;
        animatorSet.removeAllListeners();
        animatorSet.end();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = 0;
        this.A01 = Arrays.asList(new View[]{getChildAt(3), getChildAt(2), getChildAt(1), getChildAt(0)});
        ArrayList A0i = C13690nt.A0i(4);
        do {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A01.get(i2), "alpha", new float[]{0.0f, 0.6f, 0.0f});
            ofFloat.setDuration(750);
            ofFloat.setStartDelay((long) (i2 * 100));
            A0i.add(ofFloat);
            i2++;
        } while (i2 < 4);
        AnimatorSet animatorSet = this.A03;
        animatorSet.playTogether(A0i);
        C13690nt.A0o(animatorSet, this, 6);
        animatorSet.start();
    }
}
