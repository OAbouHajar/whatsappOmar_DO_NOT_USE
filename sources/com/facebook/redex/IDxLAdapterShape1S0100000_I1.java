package com.facebook.redex;

import X.AnonymousClass0CB;
import X.C12720kr;
import X.C12730ks;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarOverlayLayout;

public class IDxLAdapterShape1S0100000_I1 extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public IDxLAdapterShape1S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A01) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A00;
                actionBarOverlayLayout.A05 = null;
                actionBarOverlayLayout.A0F = false;
                return;
            case 2:
                C12730ks r0 = ((AnonymousClass0CB) this.A00).A07;
                if (r0 != null) {
                    r0.AXC();
                    return;
                }
                return;
            case 3:
                C12720kr r02 = ((AnonymousClass0CB) this.A00).A06;
                if (r02 != null) {
                    r02.APv();
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A01) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A00;
                actionBarOverlayLayout.A05 = null;
                actionBarOverlayLayout.A0F = false;
                return;
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.A00;
                if (viewGroup.getChildCount() > 0) {
                    viewGroup.removeViewAt(0);
                    return;
                }
                return;
            case 2:
                C12730ks r0 = ((AnonymousClass0CB) this.A00).A07;
                if (r0 != null) {
                    r0.AXC();
                    return;
                }
                return;
            default:
                C12720kr r02 = ((AnonymousClass0CB) this.A00).A06;
                if (r02 != null) {
                    r02.APv();
                    return;
                }
                return;
        }
    }
}
