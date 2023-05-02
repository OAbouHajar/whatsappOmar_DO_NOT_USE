package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.facebook.redex.IDxUListenerShape139S0100000_I1;

/* renamed from: X.0XS  reason: invalid class name */
public class AnonymousClass0XS implements Animator.AnimatorListener {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05 = false;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final ValueAnimator A0B;
    public final C005602k A0C;

    public AnonymousClass0XS(C005602k r4, float f2, float f3, float f4, float f5, int i2) {
        this.A0A = i2;
        this.A0C = r4;
        this.A06 = f2;
        this.A07 = f3;
        this.A08 = f4;
        this.A09 = f5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0B = ofFloat;
        ofFloat.addUpdateListener(new IDxUListenerShape139S0100000_I1(this, 0));
        ofFloat.setTarget(r4.A0H);
        ofFloat.addListener(this);
        this.A00 = 0.0f;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = 1.0f;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A03) {
            this.A0C.A04(true);
        }
        this.A03 = true;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
