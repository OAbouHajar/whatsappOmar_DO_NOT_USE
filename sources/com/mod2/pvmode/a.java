package com.mod2.pvmode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.bbm.design.widget.CoordinatorLayout;

class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout f471a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LockActivity f472b;

    a(LockActivity lockActivity, CoordinatorLayout coordinatorLayout) {
        this.f472b = lockActivity;
        this.f471a = coordinatorLayout;
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationEnd(animator);
        this.f471a.setVisibility(0);
    }
}
