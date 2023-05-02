package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.3KC  reason: invalid class name */
public class AnonymousClass3KC extends AnimatorListenerAdapter {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;

    public AnonymousClass3KC(View view, float f2) {
        this.A01 = view;
        this.A00 = f2;
    }

    public void onAnimationCancel(Animator animator) {
        this.A01.setX(this.A00);
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.setX(this.A00);
    }
}
