package com.obwhatsapp.yo;

import android.graphics.drawable.GradientDrawable;

public abstract /* synthetic */ class k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f794a;

    static {
        int[] iArr = new int[GradientDrawable.Orientation.values().length];
        f794a = iArr;
        try {
            iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f794a[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f794a[GradientDrawable.Orientation.TR_BL.ordinal()] = 3;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f794a[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 4;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f794a[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 5;
        } catch (NoSuchFieldError e6) {
        }
    }
}
