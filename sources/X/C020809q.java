package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.09q  reason: invalid class name and case insensitive filesystem */
public final class C020809q extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ Animator A01;
    public final /* synthetic */ C14990q7 A02;
    public final /* synthetic */ C14960q4 A03;
    public final /* synthetic */ C14930q1 A04;

    public C020809q(Animator animator, C14990q7 r2, C14960q4 r3, C14930q1 r4) {
        this.A04 = r4;
        this.A01 = animator;
        this.A02 = r2;
        this.A03 = r3;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationEnd(Animator animator) {
        C14930q1 r4 = this.A04;
        if (r4 != null) {
            C14940q2 r3 = new C14940q2();
            r3.A02(this.A01, 0);
            r3.A02(Boolean.valueOf(!this.A00), 1);
            r3.A02(this.A02, 2);
            C14980q6.A00(this.A03, r3.A01(), r4);
            this.A00 = false;
        }
    }
}
