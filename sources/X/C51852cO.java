package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.obwhatsapp.HomeActivity;

/* renamed from: X.2cO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51852cO implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FrameLayout.LayoutParams A00;
    public final /* synthetic */ LinearLayout.LayoutParams A01;
    public final /* synthetic */ HomeActivity A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C51852cO(FrameLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, HomeActivity homeActivity, boolean z2) {
        this.A02 = homeActivity;
        this.A03 = z2;
        this.A00 = layoutParams;
        this.A01 = layoutParams2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        HomeActivity homeActivity = this.A02;
        boolean z2 = this.A03;
        FrameLayout.LayoutParams layoutParams = this.A00;
        LinearLayout.LayoutParams layoutParams2 = this.A01;
        int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
        if (z2) {
            layoutParams.height = intValue;
        } else {
            layoutParams2.height = intValue;
        }
        homeActivity.A0F.setLayoutParams(layoutParams2);
        homeActivity.A09.setLayoutParams(layoutParams);
    }
}
