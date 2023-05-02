package com.facebook.redex;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

public class IDxObjectShape30S0000000_I0 implements TimeInterpolator, Interpolator {
    public final int A00;

    public IDxObjectShape30S0000000_I0(int i2) {
        this.A00 = i2;
    }

    public float getInterpolation(float f2) {
        float f3 = f2 - 1.0f;
        return (f3 * f3 * f3 * f3 * f3) + 1.0f;
    }
}
