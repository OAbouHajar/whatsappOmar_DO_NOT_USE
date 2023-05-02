package com.facebook.redex;

import X.C14930q1;
import X.C14950q3;
import X.C14960q4;
import X.C14980q6;
import android.animation.ValueAnimator;

public class IDxUListenerShape8S0400000_I1 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxUListenerShape8S0400000_I1(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A03 = obj4;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public static void A00(IDxUListenerShape8S0400000_I1 iDxUListenerShape8S0400000_I1) {
        C14950q3 r1 = (C14950q3) iDxUListenerShape8S0400000_I1.A01;
        C14980q6.A00((C14960q4) iDxUListenerShape8S0400000_I1.A02, r1, (C14930q1) iDxUListenerShape8S0400000_I1.A03);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        A00(this);
    }
}
