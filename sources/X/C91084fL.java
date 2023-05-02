package X;

import android.animation.ValueAnimator;

/* renamed from: X.4fL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91084fL implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C85234Nq A02;

    public /* synthetic */ C91084fL(C85234Nq r1, float f2, float f3) {
        this.A02 = r1;
        this.A00 = f2;
        this.A01 = f3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C85234Nq r6 = this.A02;
        float f2 = this.A00;
        float f3 = this.A01;
        float A03 = AnonymousClass000.A03(valueAnimator);
        r6.A00 = Math.min(r6.A00, Math.max(f2, f3 - ((f3 - f2) * (0.5f * A03))));
        float f4 = (float) r6.A01;
        r6.A01 = (int) Math.max(f4 - (A03 * f4), 0.0f);
    }
}
