package com.facebook.redex;

import X.AnonymousClass0CL;
import X.C02210Ag;
import X.C02420Bv;
import X.C12520kX;
import android.support.v4.view.MotionEventCompat;
import android.view.animation.Animation;

public class IDxAListenerShape352S0100000_I1 implements Animation.AnimationListener {
    public Object A00;
    public final int A01;

    public IDxAListenerShape352S0100000_I1(C02420Bv r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public void onAnimationEnd(Animation animation) {
        C12520kX r0;
        if (this.A01 != 0) {
            C02420Bv r4 = (C02420Bv) this.A00;
            IDxAnimationShape17S0100000_I1 iDxAnimationShape17S0100000_I1 = new IDxAnimationShape17S0100000_I1(r4, 1);
            r4.A0J = iDxAnimationShape17S0100000_I1;
            iDxAnimationShape17S0100000_I1.setDuration(150);
            AnonymousClass0CL r1 = r4.A0K;
            r1.A01 = null;
            r1.clearAnimation();
            r1.startAnimation(r4.A0J);
            return;
        }
        C02420Bv r2 = (C02420Bv) this.A00;
        if (r2.A0R) {
            C02210Ag r12 = r2.A0L;
            r12.setAlpha(MotionEventCompat.ACTION_MASK);
            r12.start();
            if (r2.A0Q && (r0 = r2.A0N) != null) {
                r0.AVu();
            }
            r2.A07 = r2.A0K.getTop();
            return;
        }
        r2.A01();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
