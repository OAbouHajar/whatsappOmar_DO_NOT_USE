package com.obwhatsapp.biz.catalog.view;

import X.AnonymousClass3O9;
import X.AnonymousClass4BW;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class AspectRatioFrameLayout extends AnonymousClass3O9 {
    public float A00;

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A00 = 1.0f;
        A02(context, attributeSet);
    }

    public void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4BW.A00, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getFloat(0, this.A00);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i2)) / this.A00), 1073741824);
        } else if (mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i3)) * this.A00), 1073741824);
        }
        super.onMeasure(i2, i3);
    }
}
