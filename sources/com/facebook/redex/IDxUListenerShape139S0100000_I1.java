package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0A0;
import X.AnonymousClass0Ah;
import X.AnonymousClass0Ai;
import X.AnonymousClass0Ak;
import X.AnonymousClass0MU;
import X.AnonymousClass0NY;
import X.AnonymousClass0XS;
import X.C02160Aa;
import X.C03050Ha;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

public class IDxUListenerShape139S0100000_I1 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public IDxUListenerShape139S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass0XS) this.A00).A00 = valueAnimator.getAnimatedFraction();
                return;
            case 1:
                AnonymousClass0Ak r0 = (AnonymousClass0Ak) this.A00;
                C03050Ha r1 = r0.A08;
                if (r1 != null) {
                    r1.A06(AnonymousClass0A0.A00(r0.A0K));
                    return;
                }
                return;
            case 2:
                long animatedFraction = (long) (valueAnimator.getAnimatedFraction() * ((float) valueAnimator.getDuration()));
                C02160Aa r6 = (C02160Aa) this.A00;
                AnonymousClass0NY[] r10 = r6.A0D;
                int length = r10.length - 1;
                int i2 = 0;
                int max = Math.max(Math.min((int) (animatedFraction / 3000), length), 0);
                if (max != length) {
                    i2 = max + 1;
                }
                r6.A04 = r10[max];
                r6.A05 = r10[i2];
                r6.A00 = ((float) (animatedFraction - (((long) max) * 3000))) / 3000.0f;
                r6.invalidateSelf();
                return;
            case 3:
                AnonymousClass0Ai r3 = (AnonymousClass0Ai) this.A00;
                r3.A05.setColor(AnonymousClass0MU.A00(r3.A02, AnonymousClass000.A03(valueAnimator)));
                r3.invalidateSelf();
                return;
            default:
                float A03 = AnonymousClass000.A03(valueAnimator) * 4.0f;
                int i3 = (int) A03;
                float f2 = A03 - ((float) i3);
                float[] fArr = AnonymousClass0Ah.A0C;
                Interpolator interpolator = AnonymousClass0Ah.A0A;
                float f3 = fArr[i3];
                int i4 = i3 + 1;
                float f4 = fArr[i4 % fArr.length];
                float interpolation = interpolator.getInterpolation(f2);
                float f5 = (f3 * (1.0f - interpolation)) + (f4 * interpolation);
                float[] fArr2 = AnonymousClass0Ah.A0D;
                Interpolator interpolator2 = AnonymousClass0Ah.A09;
                float f6 = fArr2[i3];
                float f7 = fArr2[i4 % fArr2.length];
                float interpolation2 = interpolator2.getInterpolation(f2);
                float f8 = (f6 * (1.0f - interpolation2)) + (f7 * interpolation2);
                float[] fArr3 = AnonymousClass0Ah.A0B;
                float f9 = fArr3[i3];
                float f10 = fArr3[i4 % fArr3.length];
                float interpolation3 = interpolator2.getInterpolation(f2);
                AnonymousClass0Ah r32 = (AnonymousClass0Ah) this.A00;
                r32.A01 = ((f8 * 360.0f) + f5) - 90.0f;
                r32.A00 = (((f9 * (1.0f - interpolation3)) + (f10 * interpolation3)) - f8) * 360.0f;
                r32.invalidateSelf();
                return;
        }
    }
}
