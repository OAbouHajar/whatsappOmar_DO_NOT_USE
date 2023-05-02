package com.obwhatsapp.status;

import X.C55372jR;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class ScalingContactStatusThumbnail extends C55372jR {
    public boolean A00 = false;

    public ScalingContactStatusThumbnail(Context context) {
        super(context);
    }

    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A04(Canvas canvas) {
        if (this.A00) {
            super.A04(canvas);
        }
    }

    public void A05(int i2, int i3) {
        if (this.A02 == 0) {
            requestLayout();
        }
        super.A05(i2, i3);
    }

    public int getBorderSizeAdjustment() {
        return (int) this.A01;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A02 > 0) {
            this.A01 = ((float) getMeasuredWidth()) * 0.04f;
        }
    }

    public void setShowRing(boolean z2) {
        this.A00 = z2;
    }
}
