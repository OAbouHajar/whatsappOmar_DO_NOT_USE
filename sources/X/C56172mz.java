package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;

/* renamed from: X.2mz  reason: invalid class name and case insensitive filesystem */
public class C56172mz extends AnimatorListenerAdapter {
    public final /* synthetic */ C53802gK A00;
    public final /* synthetic */ boolean A01;

    public C56172mz(C53802gK r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public void onAnimationStart(Animator animator) {
        C53802gK r8;
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            r8 = this.A00;
            if (i4 >= r8.getChildCount()) {
                break;
            }
            View childAt = r8.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = r8.A0A[i4];
            childAt.setLayoutParams(layoutParams);
            i4++;
        }
        r8.setChildrenVisibility(0);
        boolean z2 = this.A01;
        int childCount = r8.getChildCount();
        int i5 = -1;
        if (z2 == C13680ns.A1Z(r8.A02)) {
            i2 = r8.getChildCount() - 1;
            i3 = -1;
        } else {
            i5 = childCount;
            i2 = 0;
            i3 = 1;
        }
        int i6 = 0;
        while (i2 != i5) {
            if (!(r8.getChildAt(i2) instanceof C109475Sg)) {
                AnonymousClass00B.A08("Given view is not ReactionTrayItem.");
            }
            C109475Sg r11 = (C109475Sg) r8.getChildAt(i2);
            r11.setForegroundScale(0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r11, "foregroundScale", new float[]{0.0f, 1.1f});
            ofFloat.setDuration(160);
            Interpolator interpolator = C53802gK.A0D;
            ofFloat.setInterpolator(interpolator);
            ObjectAnimator duration = ObjectAnimator.ofFloat(r11, "foregroundAlpha", new float[]{0.0f, 1.0f}).setDuration(120);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r11, "foregroundScale", new float[]{1.1f, 1.0f});
            ofFloat2.setDuration(160);
            ofFloat2.setInterpolator(interpolator);
            animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
            r11.setBackgroundAlpha(0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r11, "backgroundAlpha", new float[]{0.0f, 1.0f});
            ofFloat3.setInterpolator(C53802gK.A0B);
            ofFloat3.setDuration(320);
            animatorSet.playTogether(new Animator[]{ofFloat, duration, ofFloat3});
            animatorSet.setStartDelay(((long) i6) * 35);
            animatorSet.start();
            i2 += i3;
            i6++;
        }
    }
}
