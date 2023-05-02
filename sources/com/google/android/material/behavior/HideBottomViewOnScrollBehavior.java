package com.google.android.material.behavior;

import X.AnonymousClass000;
import X.AnonymousClass06y;
import X.C53572fv;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.redex.IDxLAdapterShape4S0100000_2_I1;

public class HideBottomViewOnScrollBehavior extends AnonymousClass06y {
    public int A00 = 2;
    public int A01 = 0;
    public ViewPropertyAnimator A02;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A00(View view, View view2, CoordinatorLayout coordinatorLayout, int i2, int i3, int i4, int i5) {
        if (this.A00 != 1) {
            if (i3 > 0) {
                A0I(view);
            }
        } else if (i3 < 0) {
            A0J(view);
        }
    }

    public boolean A04(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i2) {
        return AnonymousClass000.A1R(i2, 2);
    }

    public boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
        this.A01 = view.getMeasuredHeight();
        return false;
    }

    public void A0I(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.A00 = 1;
        int i2 = this.A01;
        this.A02 = view.animate().translationY((float) i2).setInterpolator(C53572fv.A01).setDuration(175).setListener(new IDxLAdapterShape4S0100000_2_I1(this, 0));
    }

    public void A0J(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.A00 = 2;
        this.A02 = view.animate().translationY((float) 0).setInterpolator(C53572fv.A04).setDuration(225).setListener(new IDxLAdapterShape4S0100000_2_I1(this, 0));
    }
}
