package com.facebook.redex;

import X.C07810cV;
import android.view.View;
import android.view.ViewGroup;

public class IDxSVerticalShape7S0000000_I1 extends C07810cV {
    public final int A00;

    public IDxSVerticalShape7S0000000_I1(int i2) {
        this.A00 = i2;
    }

    public float ACU(View view, ViewGroup viewGroup) {
        int i2 = this.A00;
        float translationY = view.getTranslationY();
        float height = (float) viewGroup.getHeight();
        return i2 != 0 ? translationY + height : translationY - height;
    }
}
