package com.facebook.redex;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class IDxAnimationShape3S0101000_2_I1 extends Animation {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxAnimationShape3S0101000_2_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        int i2;
        int i3;
        Object obj;
        if (this.A02 != 0) {
            i3 = f2 == 1.0f ? this.A00 : (int) (f2 * ((float) this.A00));
            obj = ((IDxDListenerShape58S0200000_2_I1) this.A01).A00;
        } else {
            if (f2 < 1.0f) {
                int i4 = this.A00;
                i2 = i4 - ((int) (((float) i4) * f2));
            } else {
                i2 = 0;
            }
            obj = this.A01;
        }
        View view = (View) obj;
        view.getLayoutParams().height = i3;
        view.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
