package X;

import android.animation.Animator;

/* renamed from: X.0XR  reason: invalid class name */
public class AnonymousClass0XR implements Animator.AnimatorListener {
    public final /* synthetic */ C09040eo A00;
    public final /* synthetic */ C14960q4 A01;
    public final /* synthetic */ C14950q3 A02;
    public final /* synthetic */ C14930q1 A03;

    public AnonymousClass0XR(C09040eo r1, C14960q4 r2, C14950q3 r3, C14930q1 r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C14930q1 r2 = this.A03;
        C14980q6.A00(this.A01, this.A02, r2);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
