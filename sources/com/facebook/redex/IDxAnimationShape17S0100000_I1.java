package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0PF;
import X.C02210Ag;
import X.C02420Bv;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class IDxAnimationShape17S0100000_I1 extends Animation {
    public Object A00;
    public final int A01;

    public IDxAnimationShape17S0100000_I1(C02420Bv r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        switch (this.A01) {
            case 0:
                ((C02420Bv) this.A00).setAnimationProgress(f2);
                return;
            case 1:
                ((C02420Bv) this.A00).setAnimationProgress(1.0f - f2);
                return;
            case 2:
                C02420Bv r2 = (C02420Bv) this.A00;
                r2.setTargetOffsetTopAndBottom(AnonymousClass000.A06(f2, r2.A0C - Math.abs(r2.A0B), r2.A09) - r2.A0K.getTop());
                C02210Ag r3 = r2.A0L;
                float f3 = 1.0f - f2;
                AnonymousClass0PF r1 = r3.A05;
                if (f3 != r1.A00) {
                    r1.A00 = f3;
                }
                r3.invalidateSelf();
                return;
            default:
                C02420Bv r22 = (C02420Bv) this.A00;
                r22.setTargetOffsetTopAndBottom(AnonymousClass000.A06(f2, r22.A0B, r22.A09) - r22.A0K.getTop());
                return;
        }
    }
}
