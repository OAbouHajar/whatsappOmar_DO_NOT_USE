package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4fJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91064fJ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C91064fJ(View view, boolean z2) {
        this.A00 = view;
        this.A01 = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.A00;
        boolean z2 = this.A01;
        int A0D = AnonymousClass000.A0D(valueAnimator.getAnimatedValue());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = A0D;
            view.setLayoutParams(layoutParams);
        }
        view.setAlpha(z2 ? valueAnimator.getAnimatedFraction() : 1.0f - valueAnimator.getAnimatedFraction());
    }
}
