package com.facebook.redex;

import X.AnonymousClass3LG;
import X.C42821yj;
import X.C614739b;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class IDxAnimationShape2S0101000_2_I0 extends Animation {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxAnimationShape2S0101000_2_I0(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        if (this.A02 != 0) {
            C614739b r3 = (C614739b) this.A01;
            ViewGroup.LayoutParams layoutParams = r3.A02.getLayoutParams();
            int i2 = this.A00;
            layoutParams.height = i2 - ((int) (((float) i2) * f2));
            r3.A02.requestLayout();
            return;
        }
        int i3 = (int) (((float) this.A00) * f2);
        Drawable background = ((C42821yj) this.A01).A08.getBackground();
        if (background instanceof AnonymousClass3LG) {
            AnonymousClass3LG r1 = (AnonymousClass3LG) background;
            r1.A00 = i3;
            r1.invalidateSelf();
        }
    }

    public boolean willChangeBounds() {
        return this.A02 != 0;
    }
}
