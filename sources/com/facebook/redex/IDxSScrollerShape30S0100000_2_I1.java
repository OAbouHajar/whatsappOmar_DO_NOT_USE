package com.facebook.redex;

import X.AnonymousClass0Fo;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class IDxSScrollerShape30S0100000_2_I1 extends AnonymousClass0Fo {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSScrollerShape30S0100000_2_I1(Context context, Object obj, int i2) {
        super(context);
        this.A01 = i2;
        this.A00 = obj;
    }

    public float A04(DisplayMetrics displayMetrics) {
        return 40.0f / TypedValue.applyDimension(1, 40.0f, displayMetrics);
    }
}
