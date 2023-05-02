package com.facebook.redex;

import X.AnonymousClass0Rs;
import X.C12630ki;
import com.airbnb.lottie.LottieAnimationView;

public class IDxLListenerShape398S0100000_I1 implements C12630ki {
    public Object A00;
    public final int A01;

    public IDxLListenerShape398S0100000_I1(LottieAnimationView lottieAnimationView, int i2) {
        this.A01 = i2;
        this.A00 = lottieAnimationView;
    }

    public /* bridge */ /* synthetic */ void AWP(Object obj) {
        if (this.A01 != 0) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A00;
            int i2 = lottieAnimationView.A02;
            if (i2 != 0) {
                lottieAnimationView.setImageResource(i2);
            }
            C12630ki r0 = lottieAnimationView.A04;
            if (r0 == null) {
                r0 = LottieAnimationView.A0J;
            }
            r0.AWP(obj);
            return;
        }
        ((LottieAnimationView) this.A00).setComposition((AnonymousClass0Rs) obj);
    }
}
