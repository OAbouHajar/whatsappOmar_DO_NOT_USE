package com.mod2.pvmode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.bbm.design.widget.CoordinatorLayout;

class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout f473a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LockActivity f474b;

    b(LockActivity lockActivity, CoordinatorLayout coordinatorLayout) {
        this.f474b = lockActivity;
        this.f473a = coordinatorLayout;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f473a.setVisibility(8);
    }
}
