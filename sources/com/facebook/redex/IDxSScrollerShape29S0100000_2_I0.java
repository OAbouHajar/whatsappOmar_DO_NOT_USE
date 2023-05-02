package com.facebook.redex;

import X.AnonymousClass0Fo;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class IDxSScrollerShape29S0100000_2_I0 extends AnonymousClass0Fo {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSScrollerShape29S0100000_2_I0(Context context, Object obj, int i2) {
        super(context);
        this.A01 = i2;
        this.A00 = obj;
    }

    public float A04(DisplayMetrics displayMetrics) {
        float f2;
        float f3;
        switch (this.A01) {
            case 0:
                f3 = (float) displayMetrics.densityDpi;
                f2 = 150.0f;
                break;
            case 2:
                f2 = 40.0f;
                f3 = TypedValue.applyDimension(1, 40.0f, displayMetrics);
                break;
            default:
                return super.A04(displayMetrics);
        }
        return f2 / f3;
    }

    public int A05() {
        if (2 - this.A01 != 0) {
            return super.A05();
        }
        return -1;
    }

    public int A06() {
        if (1 - this.A01 != 0) {
            return super.A06();
        }
        return -1;
    }
}
