package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.09r  reason: invalid class name and case insensitive filesystem */
public final class C020909r extends AnimatorListenerAdapter {
    public final /* synthetic */ C14990q7 A00;
    public final /* synthetic */ String A01;

    public C020909r(C14990q7 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void A00() {
        C62183Bz.A09(this.A00, this.A01);
    }

    public void onAnimationCancel(Animator animator) {
        A00();
    }

    public void onAnimationEnd(Animator animator) {
        A00();
    }
}
