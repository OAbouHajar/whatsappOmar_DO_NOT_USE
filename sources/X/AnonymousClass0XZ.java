package X;

import android.animation.ValueAnimator;

/* renamed from: X.0XZ  reason: invalid class name */
public class AnonymousClass0XZ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C02810Fi A00;

    public AnonymousClass0XZ(C02810Fi r1) {
        this.A00 = r1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A03 = (int) (AnonymousClass000.A03(valueAnimator) * 255.0f);
        C02810Fi r1 = this.A00;
        r1.A0O.setAlpha(A03);
        r1.A0M.setAlpha(A03);
        r1.A0B.invalidate();
    }
}
