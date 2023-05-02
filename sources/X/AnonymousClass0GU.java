package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.redex.IDxSHorizontalShape6S0000000_I1;
import com.facebook.redex.IDxSVerticalShape7S0000000_I1;
import com.obwhatsapp.R;

/* renamed from: X.0GU  reason: invalid class name */
public class AnonymousClass0GU extends AnonymousClass0GF {
    public static final TimeInterpolator A01 = new AccelerateInterpolator();
    public static final TimeInterpolator A02 = new DecelerateInterpolator();
    public static final C13070lQ A03 = new IDxSVerticalShape7S0000000_I1(1);
    public static final C13070lQ A04 = new IDxSHorizontalShape6S0000000_I1(0);
    public static final C13070lQ A05 = new IDxSHorizontalShape6S0000000_I1(1);
    public static final C13070lQ A06 = new IDxSVerticalShape7S0000000_I1(0);
    public C13070lQ A00 = A03;

    public AnonymousClass0GU() {
        A0Z(80);
    }

    public static Animator A04(TimeInterpolator timeInterpolator, View view, C015707n r16, C06230Uw r17, float f2, float f3, float f4, float f5, int i2, int i3) {
        View view2 = view;
        float f6 = f3;
        float f7 = f2;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        View view3 = r17.A00;
        int[] iArr = (int[]) view3.getTag(R.id.transition_position);
        if (iArr != null) {
            f7 = ((float) (iArr[0] - i2)) + translationX;
            f6 = ((float) (iArr[1] - i3)) + translationY;
        }
        int round = i2 + Math.round(f7 - translationX);
        int round2 = i3 + Math.round(f6 - translationY);
        view.setTranslationX(f7);
        view.setTranslationY(f6);
        if (f7 == f4 && f6 == f5) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f7, f4}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f5})});
        C021209w r7 = new C021209w(view2, view3, translationX, translationY, round, round2);
        r16.A08(r7);
        ofPropertyValuesHolder.addListener(r7);
        AnonymousClass0M9.A00(ofPropertyValuesHolder, r7);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public void A0V(C06230Uw r4) {
        AnonymousClass0GF.A03(r4);
        int[] iArr = new int[2];
        r4.A00.getLocationOnScreen(iArr);
        r4.A02.put("android:slide:screenPosition", iArr);
    }

    public void A0W(C06230Uw r4) {
        AnonymousClass0GF.A03(r4);
        int[] iArr = new int[2];
        r4.A00.getLocationOnScreen(iArr);
        r4.A02.put("android:slide:screenPosition", iArr);
    }

    public Animator A0X(View view, ViewGroup viewGroup, C06230Uw r14, C06230Uw r15) {
        int[] iArr = (int[]) r15.A02.get("android:slide:screenPosition");
        View view2 = view;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float ACT = this.A00.ACT(view, viewGroup);
        float ACU = this.A00.ACU(view, viewGroup);
        int i2 = iArr[0];
        int i3 = iArr[1];
        return A04(A02, view2, this, r15, ACT, ACU, translationX, translationY, i2, i3);
    }

    public Animator A0Y(View view, ViewGroup viewGroup, C06230Uw r14, C06230Uw r15) {
        int[] iArr = (int[]) r14.A02.get("android:slide:screenPosition");
        View view2 = view;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float ACT = this.A00.ACT(view, viewGroup);
        float ACU = this.A00.ACU(view, viewGroup);
        int i2 = iArr[0];
        int i3 = iArr[1];
        return A04(A01, view2, this, r14, translationX, translationY, ACT, ACU, i2, i3);
    }

    public void A0Z(int i2) {
        C13070lQ r0;
        if (i2 == 3) {
            r0 = A04;
        } else if (i2 == 5) {
            r0 = A05;
        } else if (i2 == 48) {
            r0 = A06;
        } else if (i2 != 80) {
            throw AnonymousClass000.A0T("Invalid slide direction");
        } else {
            r0 = A03;
        }
        this.A00 = r0;
        AnonymousClass0GM r02 = new AnonymousClass0GM();
        r02.A01 = i2;
        A0P(r02);
    }
}
