package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.3KA  reason: invalid class name */
public class AnonymousClass3KA extends AnimatorListenerAdapter {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C53802gK A01;
    public final /* synthetic */ C109475Sg A02;

    public AnonymousClass3KA(C53802gK r1, C109475Sg r2, float f2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = f2;
    }

    public void onAnimationCancel(Animator animator) {
        this.A02.setBackgroundScale(this.A00);
    }
}
