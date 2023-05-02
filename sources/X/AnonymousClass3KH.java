package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.3KH  reason: invalid class name */
public class AnonymousClass3KH extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C63313Gy A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass3KH(C63313Gy r1, int i2, boolean z2) {
        this.A01 = r1;
        this.A02 = z2;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A01.setVisibility(this.A00);
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02) {
            this.A01.A01.setVisibility(0);
        }
    }
}
