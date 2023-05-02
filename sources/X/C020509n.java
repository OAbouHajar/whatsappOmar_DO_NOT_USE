package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.09n  reason: invalid class name and case insensitive filesystem */
public class C020509n extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final /* synthetic */ C02810Fi A01;

    public C020509n(C02810Fi r2) {
        this.A01 = r2;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00) {
            this.A00 = false;
            return;
        }
        C02810Fi r2 = this.A01;
        if (AnonymousClass000.A03(r2.A0K) == 0.0f) {
            r2.A02 = 0;
            r2.A05(0);
            return;
        }
        r2.A02 = 2;
        r2.A0B.invalidate();
    }
}
