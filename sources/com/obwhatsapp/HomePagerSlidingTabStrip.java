package com.obwhatsapp;

import X.C53032es;
import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class HomePagerSlidingTabStrip extends PagerSlidingTabStrip {
    public boolean A00;

    public HomePagerSlidingTabStrip(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A02(View view, int i2) {
        LayoutTransition layoutTransition;
        super.A02(view, i2);
        if (view instanceof ViewGroup) {
            View childAt = ((ViewGroup) view).getChildAt(0);
            if ((childAt instanceof ViewGroup) && (layoutTransition = ((ViewGroup) childAt).getLayoutTransition()) != null) {
                layoutTransition.addTransitionListener(new C53032es(this));
            }
        }
    }
}
