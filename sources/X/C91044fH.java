package X;

import android.animation.ValueAnimator;
import android.widget.RelativeLayout;

/* renamed from: X.4fH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91044fH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ RelativeLayout.LayoutParams A00;
    public final /* synthetic */ AnonymousClass2V5 A01;

    public /* synthetic */ C91044fH(RelativeLayout.LayoutParams layoutParams, AnonymousClass2V5 r2) {
        this.A01 = r2;
        this.A00 = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass2V5 r5 = this.A01;
        RelativeLayout.LayoutParams layoutParams = this.A00;
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
        r5.A0C.setLayoutParams(layoutParams);
    }
}
