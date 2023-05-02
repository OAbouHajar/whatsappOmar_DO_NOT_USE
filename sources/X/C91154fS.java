package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

/* renamed from: X.4fS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91154fS implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ ObjectAnimator A03;
    public final /* synthetic */ AnonymousClass3MW A04;

    public /* synthetic */ C91154fS(ObjectAnimator objectAnimator, AnonymousClass3MW r2, float f2, int i2, int i3) {
        this.A04 = r2;
        this.A03 = objectAnimator;
        this.A00 = f2;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass3MW.A00(this.A03, this.A04, this.A00, this.A01, this.A02);
    }
}
