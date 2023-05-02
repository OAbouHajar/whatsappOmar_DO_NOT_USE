package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

/* renamed from: X.4fP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91124fP implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ObjectAnimator A02;
    public final /* synthetic */ AnonymousClass3MV A03;

    public /* synthetic */ C91124fP(ObjectAnimator objectAnimator, AnonymousClass3MV r2, int i2, int i3) {
        this.A03 = r2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = objectAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass3MV.A00(this.A02, this.A03, this.A00, this.A01);
    }
}
