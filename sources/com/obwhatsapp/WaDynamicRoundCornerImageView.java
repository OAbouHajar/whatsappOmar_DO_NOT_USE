package com.obwhatsapp;

import X.C15450qv;
import X.C53072ew;
import X.C55352jN;
import X.C70623hN;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewOutlineProvider;

public class WaDynamicRoundCornerImageView extends C70623hN {
    public float A00;

    public WaDynamicRoundCornerImageView(Context context) {
        super(context);
    }

    public WaDynamicRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }

    public WaDynamicRoundCornerImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02(context, attributeSet);
    }

    private void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0R);
            try {
                setRadius(obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics())));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setRadius(float f2) {
        if (this.A00 != f2 && Build.VERSION.SDK_INT >= 21) {
            this.A00 = f2;
            if (f2 != 0.0f) {
                C55352jN.A01(this, f2);
            } else if (C15450qv.A03()) {
                if (getClipToOutline()) {
                    setClipToOutline(false);
                }
                setOutlineProvider((ViewOutlineProvider) null);
            }
            invalidateOutline();
        }
    }
}
