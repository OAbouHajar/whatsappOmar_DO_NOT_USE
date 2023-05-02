package com.obwhatsapp;

import X.C53072ew;
import X.C94294kg;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;

public class WaRoundCornerImageView extends WaImageView {
    public float A00;
    public Path A01;
    public C94294kg A02;
    public boolean A03;

    public WaRoundCornerImageView(Context context) {
        super(context);
        A02();
        A02(context, (AttributeSet) null);
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A02(context, attributeSet);
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        A02(context, attributeSet);
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    private void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0X);
            try {
                this.A00 = obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A02 = new C94294kg(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    public void onDetachedFromWindow() {
        getViewTreeObserver().removeGlobalOnLayoutListener(this.A02);
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        Path path = this.A01;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }
}
