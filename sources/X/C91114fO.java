package X;

import android.animation.ValueAnimator;

/* renamed from: X.4fO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91114fO implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C85234Nq A03;

    public /* synthetic */ C91114fO(C85234Nq r1, float f2, float f3, int i2) {
        this.A03 = r1;
        this.A00 = f2;
        this.A01 = f3;
        this.A02 = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C85234Nq r4 = this.A03;
        float f2 = this.A00;
        float f3 = this.A01;
        int i2 = this.A02;
        float A032 = AnonymousClass000.A03(valueAnimator);
        r4.A00 = Math.max(f2, ((f3 - f2) * A032) + f2);
        float f4 = (float) i2;
        r4.A01 = (int) Math.min(f4, Math.min(1.2f * A032, A032) * f4);
    }
}
