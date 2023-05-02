package X;

import android.animation.ValueAnimator;
import android.transition.TransitionValues;

/* renamed from: X.4fI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91054fI implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TransitionValues A00;
    public final /* synthetic */ C56532no A01;

    public /* synthetic */ C91054fI(TransitionValues transitionValues, C56532no r2) {
        this.A01 = r2;
        this.A00 = transitionValues;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C56532no.A00(valueAnimator, this.A00, this.A01);
    }
}
