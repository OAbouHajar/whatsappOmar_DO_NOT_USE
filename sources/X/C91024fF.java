package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* renamed from: X.4fF  reason: invalid class name and case insensitive filesystem */
public class C91024fF implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass1V8 A00;

    public C91024fF(AnonymousClass1V8 r1) {
        this.A00 = r1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass1V8 r5 = this.A00;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r5.A08.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, AnonymousClass000.A0D(valueAnimator.getAnimatedValue()), layoutParams.rightMargin, layoutParams.bottomMargin);
        r5.A08.setLayoutParams(layoutParams);
    }
}
