package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.3KI  reason: invalid class name */
public class AnonymousClass3KI extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass1ZK A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass3KI(AnonymousClass1ZK r1, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A02 = z2;
        this.A01 = z3;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A0U(this.A02, this.A01, false, false);
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass2P3 r0 = this.A00.A0O;
        if (r0 != null) {
            r0.A03();
        }
    }
}
