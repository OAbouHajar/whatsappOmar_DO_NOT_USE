package com.facebook.redex;

import X.AnonymousClass2VV;
import X.C46172Ct;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.obwhatsapp.mentions.MentionPickerView;

public class IDxLAdapterShape0S0101000_2_I0 extends AnimatorListenerAdapter {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxLAdapterShape0S0101000_2_I0(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animator animator) {
        int i2 = this.A02;
        Object obj = this.A01;
        if (i2 != 0) {
            View view = (View) obj;
            int i3 = this.A00;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i3;
                view.setLayoutParams(layoutParams);
            }
            view.setAlpha(1.0f);
            return;
        }
        AnonymousClass2VV r2 = (AnonymousClass2VV) obj;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r2.getLayoutParams();
        int i4 = this.A00;
        layoutParams2.height = i4;
        r2.setLayoutParams(layoutParams2);
        if (i4 == 0) {
            r2.setVisibility(8);
            C46172Ct r0 = ((MentionPickerView) r2).A0B;
            if (r0 != null) {
                r0.AOF(false);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        AnonymousClass2VV r2 = (AnonymousClass2VV) this.A01;
        if (r2.getVisibility() != 0) {
            r2.A02();
            r2.setVisibility(0);
            C46172Ct r0 = ((MentionPickerView) r2).A0B;
            if (r0 != null) {
                r0.AOF(true);
            }
        }
    }
}
