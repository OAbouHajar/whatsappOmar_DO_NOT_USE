package com.facebook.redex;

import X.C004601z;
import X.C12540kZ;
import android.view.View;

public class IDxPTransformerShape46S0000000_2_I0 implements C12540kZ {
    public final int A00;

    public IDxPTransformerShape46S0000000_2_I0(int i2) {
        this.A00 = i2;
    }

    public final void Ah2(View view, float f2) {
        if (this.A00 != 0) {
            boolean z2 = true;
            if (f2 != 0.0f) {
                if (f2 == 1.0f || f2 == -1.0f) {
                    z2 = false;
                } else {
                    return;
                }
            }
            C004601z.A0p(view, z2);
            view.requestLayout();
        } else if (f2 < 0.0f || f2 >= 1.0f) {
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else {
            view.setTranslationX((-f2) * ((float) view.getWidth()));
            view.setAlpha(Math.max(0.0f, 1.0f - f2));
            float max = Math.max(0.0f, 1.0f - (f2 * 0.3f));
            view.setScaleX(max);
            view.setScaleY(max);
        }
    }
}
