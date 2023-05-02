package com.facebook.redex;

import X.AnonymousClass2P3;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public class IDxLAdapterShape0S0200000_2_I0 extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLAdapterShape0S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A02) {
            case 0:
                ((View) this.A01).setSelected(false);
                return;
            case 1:
                ((Runnable) this.A01).run();
                super.onAnimationEnd(animator);
                return;
            case 2:
                AnonymousClass2P3 r2 = (AnonymousClass2P3) this.A00;
                if (r2.A09 < 0.15f) {
                    r2.A06();
                }
                Runnable runnable = (Runnable) this.A01;
                if (runnable != null) {
                    r2.post(runnable);
                    return;
                }
                return;
            case 3:
                AnonymousClass2P3 r1 = (AnonymousClass2P3) this.A00;
                r1.A03();
                r1.post((Runnable) this.A01);
                return;
            default:
                View view = (View) this.A01;
                view.setVisibility(8);
                view.setAlpha(1.0f);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (2 - this.A02 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        AnonymousClass2P3 r1 = (AnonymousClass2P3) this.A00;
        r1.setVisibility(0);
        r1.A0d = true;
    }
}
