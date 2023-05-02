package com.obwhatsapp.components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;

public class RoundCornerProgressBarV2 extends RoundCornerProgressBar {
    public ValueAnimator A00;
    public boolean A01;

    public RoundCornerProgressBarV2(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public RoundCornerProgressBarV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public RoundCornerProgressBarV2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public RoundCornerProgressBarV2(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
