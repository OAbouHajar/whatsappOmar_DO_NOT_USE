package com.facebook.redex;

import X.C07800cU;
import android.view.View;
import android.view.ViewGroup;

public class IDxSHorizontalShape6S0000000_I1 extends C07800cU {
    public final int A00;

    public IDxSHorizontalShape6S0000000_I1(int i2) {
        this.A00 = i2;
    }

    public float ACT(View view, ViewGroup viewGroup) {
        int i2 = this.A00;
        float translationX = view.getTranslationX();
        float width = (float) viewGroup.getWidth();
        return i2 != 0 ? translationX + width : translationX - width;
    }
}
