package com.facebook.redex;

import X.C14550pN;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import com.obwhatsapp.profile.ProfileInfoActivity;
import com.whatsapp.util.FloatingChildLayout;

public class IDxLAdapterShape0S0210000_2_I0 extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03 = 0;

    public IDxLAdapterShape0S0210000_2_I0(ProfileInfoActivity profileInfoActivity, Runnable runnable) {
        this.A00 = profileInfoActivity;
        this.A01 = runnable;
        this.A02 = true;
    }

    public IDxLAdapterShape0S0210000_2_I0(FloatingChildLayout floatingChildLayout, Runnable runnable, boolean z2) {
        this.A00 = floatingChildLayout;
        this.A02 = z2;
        this.A01 = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        int i2;
        if (this.A03 != 0) {
            FloatingChildLayout floatingChildLayout = (FloatingChildLayout) this.A00;
            floatingChildLayout.A09.setLayerType(0, (Paint) null);
            boolean z2 = this.A02;
            int i3 = floatingChildLayout.A03;
            if (z2) {
                if (i3 == 3) {
                    i2 = 4;
                } else {
                    return;
                }
            } else if (i3 == 1) {
                i2 = 2;
            } else {
                return;
            }
            floatingChildLayout.A03 = i2;
        } else if (this.A02) {
            this.A02 = false;
            if (!((C14550pN) this.A00).A0E) {
                return;
            }
        } else {
            return;
        }
        ((Runnable) this.A01).run();
    }
}
