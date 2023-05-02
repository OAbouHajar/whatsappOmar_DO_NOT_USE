package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;

/* renamed from: X.2cB  reason: invalid class name and case insensitive filesystem */
public class C51732cB implements View.OnLayoutChangeListener {
    public final /* synthetic */ HomeActivity A00;

    public C51732cB(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        HomeActivity homeActivity = this.A00;
        int A35 = homeActivity.A35() + homeActivity.getResources().getDimensionPixelSize(R.dimen.dimen07cb);
        if (homeActivity.A07 == null) {
            int i10 = i5 - A35;
            int i11 = i5 - i3;
            Pair A03 = HomeActivity.A03(HomeActivity.A2A, Math.abs(i4 - i2), i11, i11);
            Animator animator = homeActivity.A06;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = homeActivity.A05;
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator A37 = homeActivity.A37(i10);
            homeActivity.A06 = A37;
            if (A37 == null) {
                homeActivity.A0G.removeOnLayoutChangeListener(homeActivity.A1x);
                return;
            }
            int height = homeActivity.A09.getHeight();
            homeActivity.A09.clearAnimation();
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{height, i5});
            ofInt.addUpdateListener(new C51852cO(new FrameLayout.LayoutParams(-1, -2), new LinearLayout.LayoutParams(-1, 0, 1.0f), homeActivity, true));
            homeActivity.A05 = ofInt;
            AnimatorSet animatorSet = new AnimatorSet();
            homeActivity.A07 = animatorSet;
            animatorSet.setStartDelay((long) ((Number) A03.second).intValue());
            homeActivity.A07.setDuration((long) ((Number) A03.first).intValue());
            homeActivity.A07.setInterpolator(homeActivity.A1y);
            homeActivity.A07.playTogether(new Animator[]{homeActivity.A05, homeActivity.A06});
            homeActivity.A07.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 2));
            homeActivity.A07.start();
        }
    }
}
