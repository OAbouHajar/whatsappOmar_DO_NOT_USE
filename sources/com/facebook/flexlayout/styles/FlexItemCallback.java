package com.facebook.flexlayout.styles;

import X.AnonymousClass000;
import X.C12900l9;
import com.facebook.flexlayout.layoutoutput.MeasureOutput;

public class FlexItemCallback {
    public final C12900l9 mMeasureFunction;

    public FlexItemCallback(C12900l9 r1) {
        this.mMeasureFunction = r1;
    }

    public final float baseline(float f2, float f3) {
        throw AnonymousClass000.A0a("Baseline function isn't defined!");
    }

    public final MeasureOutput measure(float f2, float f3, float f4, float f5, float f6, float f7) {
        C12900l9 r0 = this.mMeasureFunction;
        if (r0 != null) {
            return r0.ALX(f2, f3, f4, f5, f6, f7);
        }
        throw AnonymousClass000.A0a("Measure function isn't defined!");
    }
}
