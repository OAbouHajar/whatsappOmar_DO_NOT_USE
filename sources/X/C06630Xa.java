package X;

import android.animation.ValueAnimator;

/* renamed from: X.0Xa  reason: invalid class name and case insensitive filesystem */
public final class C06630Xa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C14960q4 A00;
    public final /* synthetic */ C14950q3 A01;
    public final /* synthetic */ C31421e9 A02;

    public C06630Xa(C14960q4 r1, C14950q3 r2, C31421e9 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C31421e9 r2 = this.A02;
        C14980q6.A00(this.A00, this.A01, r2);
    }
}
