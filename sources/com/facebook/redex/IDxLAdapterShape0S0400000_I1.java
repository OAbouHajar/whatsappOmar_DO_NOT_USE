package com.facebook.redex;

import X.AnonymousClass0Fr;
import X.C005602k;
import X.C05250Pw;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public class IDxLAdapterShape0S0400000_I1 extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxLAdapterShape0S0400000_I1(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass0Fr r3, C005602k r4, int i2) {
        this.A04 = i2;
        this.A00 = r3;
        this.A02 = r4;
        if (i2 != 0) {
            this.A03 = view;
            this.A01 = viewPropertyAnimator;
        } else {
            this.A01 = viewPropertyAnimator;
            this.A03 = view;
        }
    }

    public IDxLAdapterShape0S0400000_I1(View view, ViewPropertyAnimator viewPropertyAnimator, C05250Pw r3, AnonymousClass0Fr r4, int i2) {
        this.A04 = i2;
        this.A00 = r4;
        this.A01 = r3;
        if (2 - i2 != 0) {
            this.A03 = viewPropertyAnimator;
            this.A02 = view;
        } else {
            this.A02 = viewPropertyAnimator;
            this.A03 = view;
        }
    }

    public void onAnimationCancel(Animator animator) {
        if (1 - this.A04 != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((View) this.A03).setAlpha(1.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0078, code lost:
        r2.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        r2.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0035, code lost:
        if (r3.A0B() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        r3.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006f, code lost:
        r0.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0076, code lost:
        if (r2.A0B() != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r5) {
        /*
            r4 = this;
            int r0 = r4.A04
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x005a;
                case 2: goto L_0x007c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A03
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            r0 = 0
            r1.setTranslationX(r0)
            r1.setTranslationY(r0)
            java.lang.Object r3 = r4.A00
            X.0Fr r3 = (X.AnonymousClass0Fr) r3
            java.lang.Object r1 = r4.A01
            X.0Pw r1 = (X.C05250Pw) r1
            X.02k r0 = r1.A04
            r3.A03(r0)
            java.util.ArrayList r2 = r3.A02
            X.02k r0 = r1.A04
        L_0x002e:
            r2.remove(r0)
            boolean r0 = r3.A0B()
            if (r0 != 0) goto L_0x003a
            r3.A02()
        L_0x003a:
            return
        L_0x003b:
            java.lang.Object r1 = r4.A01
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r1 = r4.A03
            android.view.View r1 = (android.view.View) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            java.lang.Object r2 = r4.A00
            X.0Fr r2 = (X.AnonymousClass0Fr) r2
            java.lang.Object r1 = r4.A02
            X.02k r1 = (X.C005602k) r1
            r2.A03(r1)
            java.util.ArrayList r0 = r2.A0A
            goto L_0x006f
        L_0x005a:
            java.lang.Object r1 = r4.A01
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r2 = r4.A00
            X.0Fr r2 = (X.AnonymousClass0Fr) r2
            java.lang.Object r1 = r4.A02
            X.02k r1 = (X.C005602k) r1
            r2.A03(r1)
            java.util.ArrayList r0 = r2.A00
        L_0x006f:
            r0.remove(r1)
            boolean r0 = r2.A0B()
            if (r0 != 0) goto L_0x003a
            r2.A02()
            return
        L_0x007c:
            java.lang.Object r1 = r4.A02
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r1 = r4.A03
            android.view.View r1 = (android.view.View) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            r0 = 0
            r1.setTranslationX(r0)
            r1.setTranslationY(r0)
            java.lang.Object r3 = r4.A00
            X.0Fr r3 = (X.AnonymousClass0Fr) r3
            java.lang.Object r1 = r4.A01
            X.0Pw r1 = (X.C05250Pw) r1
            X.02k r0 = r1.A05
            r3.A03(r0)
            java.util.ArrayList r2 = r3.A02
            X.02k r0 = r1.A05
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLAdapterShape0S0400000_I1.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
    }
}
