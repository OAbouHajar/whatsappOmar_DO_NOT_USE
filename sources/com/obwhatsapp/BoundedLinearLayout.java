package com.obwhatsapp;

import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class BoundedLinearLayout extends WaLinearLayout {
    public int A00;
    public int A01;
    public boolean A02;

    public BoundedLinearLayout(Context context) {
        super(context);
        A00();
    }

    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A00(context, attributeSet);
    }

    public BoundedLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A00(context, attributeSet);
    }

    public BoundedLinearLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        A00(context, attributeSet);
    }

    public BoundedLinearLayout(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A02);
            this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }

    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int i4 = this.A01;
        if (size > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, mode);
        } else if (mode == 0 && i4 < Integer.MAX_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i5 = this.A00;
        if (size2 > i5) {
            i3 = View.MeasureSpec.makeMeasureSpec(i5, mode2);
        } else if (mode2 == 0 && i5 < Integer.MAX_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxHeight(int i2) {
        this.A00 = i2;
    }

    public void setMaxWidth(int i2) {
        this.A01 = i2;
    }
}
