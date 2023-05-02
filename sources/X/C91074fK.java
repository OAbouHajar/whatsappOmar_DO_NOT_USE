package X;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.4fK  reason: invalid class name and case insensitive filesystem */
public class C91074fK implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout A00;
    public final /* synthetic */ AppBarLayout.BaseBehavior A01;
    public final /* synthetic */ AppBarLayout A02;

    public C91074fK(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.A01 = baseBehavior;
        this.A00 = coordinatorLayout;
        this.A02 = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A0M(this.A02, this.A00, AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
    }
}
