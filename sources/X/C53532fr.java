package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.2fr  reason: invalid class name and case insensitive filesystem */
public class C53532fr extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ C53462fk A01;
    public final /* synthetic */ boolean A02;

    public C53532fr(C53462fk r1, boolean z2) {
        this.A01 = r1;
        this.A02 = z2;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationEnd(Animator animator) {
        C53462fk r1 = this.A01;
        r1.A05 = 0;
        r1.A07 = null;
        if (!this.A00) {
            AnonymousClass2WL r2 = r1.A0N;
            boolean z2 = this.A02;
            int i2 = 4;
            if (z2) {
                i2 = 8;
            }
            r2.A00(i2, z2);
        }
    }

    public void onAnimationStart(Animator animator) {
        C53462fk r3 = this.A01;
        r3.A0N.A00(0, this.A02);
        r3.A05 = 1;
        r3.A07 = animator;
        this.A00 = false;
    }
}
