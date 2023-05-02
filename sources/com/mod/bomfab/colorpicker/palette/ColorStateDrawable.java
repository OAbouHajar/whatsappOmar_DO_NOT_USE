package com.mod.bomfab.colorpicker.palette;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

public class ColorStateDrawable extends LayerDrawable {
    private int mColor;

    public ColorStateDrawable(Drawable[] drawableArr, int i2) {
        super(drawableArr);
        this.mColor = i2;
    }

    private int getPressedColor(int i2) {
        float[] fArr = new float[3];
        Color.colorToHSV(i2, fArr);
        fArr[2] = 0.7f * fArr[2];
        return Color.HSVToColor(fArr);
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842919 || i2 == 16842908) {
                z2 = true;
            }
        }
        if (z2) {
            super.setColorFilter(getPressedColor(this.mColor), PorterDuff.Mode.SRC_ATOP);
        } else {
            super.setColorFilter(this.mColor, PorterDuff.Mode.SRC_ATOP);
        }
        return super.onStateChange(iArr);
    }
}
