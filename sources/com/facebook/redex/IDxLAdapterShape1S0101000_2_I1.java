package com.facebook.redex;

import X.C15540rI;
import X.C56892oy;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

public class IDxLAdapterShape1S0101000_2_I1 extends AnimatorListenerAdapter {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxLAdapterShape1S0101000_2_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animator animator) {
        int i2 = this.A02;
        Object obj = this.A01;
        if (i2 != 0) {
            C56892oy r1 = (C56892oy) obj;
            r1.A05 = this.A00;
            r1.A00 = 0.0f;
            return;
        }
        ((C15540rI) obj).A01();
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) ((C15540rI) this.A01).A06;
        snackbarContentLayout.A03.setAlpha(1.0f);
        long j2 = (long) 180;
        long j3 = (long) 0;
        snackbarContentLayout.A03.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        if (snackbarContentLayout.A02.getVisibility() == 0) {
            snackbarContentLayout.A02.setAlpha(1.0f);
            snackbarContentLayout.A02.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }
}
