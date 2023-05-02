package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.5xr  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5xr implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;

    public /* synthetic */ AnonymousClass5xr(View view, float f2) {
        this.A01 = view;
        this.A00 = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.setTranslationX(valueAnimator.getAnimatedFraction() * this.A00);
    }
}
