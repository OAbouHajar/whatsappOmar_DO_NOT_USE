package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;

/* renamed from: X.3MX  reason: invalid class name */
public class AnonymousClass3MX extends Transition {
    public static final String[] A02 = {"circleTransition:transforms"};
    public final boolean A00;
    public final boolean A01;

    public AnonymousClass3MX(boolean z2, boolean z3) {
        this.A01 = z2;
        this.A00 = z3;
    }

    public void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("circleTransition:transforms", new AnonymousClass4VD(transitionValues.view));
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("circleTransition:transforms", new AnonymousClass4VD(transitionValues.view));
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues != null) {
            TransitionValues transitionValues4 = transitionValues2;
            if (transitionValues2 != null) {
                AnonymousClass4VD r1 = (AnonymousClass4VD) transitionValues3.values.get("circleTransition:transforms");
                AnonymousClass4VD r7 = (AnonymousClass4VD) transitionValues4.values.get("circleTransition:transforms");
                if (!(r1 == null || r7 == null || r1.equals(r7))) {
                    float f2 = ((float) r1.A07) * r1.A00;
                    int i2 = r7.A07;
                    int i3 = i2;
                    float f3 = (float) i2;
                    float f4 = r7.A00;
                    float f5 = f3 * f4;
                    int i4 = r7.A06;
                    float f6 = (float) i4;
                    float f7 = ((float) ((-r7.A08) + r1.A08)) + ((f2 - f5) / 2.0f) + r1.A02 + ((f5 - (f6 * f4)) / 2.0f);
                    float f8 = (float) ((-r7.A09) + r1.A09);
                    float f9 = ((float) r1.A04) * r1.A01;
                    int i5 = r7.A04;
                    float f10 = (float) i5;
                    float f11 = r7.A01;
                    float f12 = f10 * f11;
                    float f13 = f8 + ((f9 - f12) / 2.0f) + r1.A03;
                    int i6 = r7.A05;
                    float f14 = (float) i6;
                    float f15 = f13 + ((f12 - (f14 * f11)) / 2.0f);
                    float f16 = r7.A02 + (f3 / f6 < 1.0f ? (((f5 - f6) / 2.0f) + f5) * f4 : 0.0f);
                    float f17 = r7.A03;
                    float f18 = f10 / f14 < 1.0f ? (((f12 - f14) / 2.0f) + f12) * f11 : 0.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(transitionValues4.view, View.TRANSLATION_X, View.TRANSLATION_Y, getPathMotion().getPath(f7, f15, f16, f17 + f18));
                    transitionValues4.view.setTranslationX(f7);
                    transitionValues4.view.setTranslationY(f15);
                    float min = Math.min(f2 / f6, f9 / f14);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(transitionValues4.view, View.SCALE_X, new float[]{min, f5 / f6});
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(transitionValues4.view, View.SCALE_Y, new float[]{min, f12 / f14});
                    float max = (float) Math.max(i3, i4);
                    float max2 = (float) Math.max(i5, i6);
                    float min2 = Math.min(max, max2) / 2.0f;
                    float sqrt = (float) (Math.sqrt((double) ((max * max) + (max2 * max2))) / 2.0d);
                    View view = transitionValues4.view;
                    int i7 = ((int) max) / 2;
                    int i8 = ((int) max2) / 2;
                    float f19 = sqrt;
                    if (this.A01) {
                        f19 = min2;
                    }
                    boolean z2 = this.A00;
                    if (!z2) {
                        min2 = sqrt;
                    }
                    AnonymousClass3K6 r8 = new AnonymousClass3K6(ViewAnimationUtils.createCircularReveal(view, i7, i8, f19, min2));
                    transitionValues4.view.setAlpha(0.0f);
                    r8.addListener(new AnonymousClass3KE(transitionValues4, r7, this));
                    if (z2) {
                        transitionValues4.view.setOutlineProvider(new AnonymousClass3ND(r7, this));
                        transitionValues4.view.setClipToOutline(true);
                        transitionValues4.view.invalidateOutline();
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Animator[] animatorArr = new Animator[4];
                    animatorArr[0] = ofFloat;
                    AnonymousClass3K2.A1N(r8, ofFloat2, ofFloat3, animatorArr);
                    animatorSet.playTogether(animatorArr);
                    animatorSet.setInterpolator(getInterpolator());
                    return animatorSet;
                }
            }
        }
        return null;
    }

    public String[] getTransitionProperties() {
        return A02;
    }
}
