package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0PF;
import X.C02210Ag;
import X.C07380bE;
import X.C11870jT;
import android.animation.ValueAnimator;
import android.view.View;

public class IDxUListenerShape87S0200000_I1 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxUListenerShape87S0200000_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A02 != 0) {
            float A03 = AnonymousClass000.A03(valueAnimator);
            C02210Ag r2 = (C02210Ag) this.A00;
            AnonymousClass0PF r1 = (AnonymousClass0PF) this.A01;
            r2.A01(r1, A03);
            r2.A02(r1, A03, false);
            r2.invalidateSelf();
            return;
        }
        ((View) ((C07380bE) ((C11870jT) this.A00)).A00.A09.getParent()).invalidate();
    }
}
