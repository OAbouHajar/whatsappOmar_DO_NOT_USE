package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: X.2fy  reason: invalid class name and case insensitive filesystem */
public abstract class C53602fy extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public float A01;
    public boolean A02;
    public final /* synthetic */ C53462fk A03;

    public C53602fy(C53462fk r1) {
        this.A03 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        C53712g9 r2 = this.A03.A0H;
        r2.A00(this.A00, r2.A01);
        this.A02 = false;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        float f3;
        float f4;
        if (!this.A02) {
            this.A01 = this.A03.A0H.A02;
            if (this instanceof C53632g1) {
                f2 = ((C53632g1) this).A00.A00;
            } else {
                if (this instanceof C53592fx) {
                    C53462fk r0 = ((C53592fx) this).A00;
                    f3 = r0.A00;
                    f4 = r0.A03;
                } else if (this instanceof C53612fz) {
                    C53462fk r02 = ((C53612fz) this).A00;
                    f3 = r02.A00;
                    f4 = r02.A01;
                } else {
                    f2 = 0.0f;
                }
                f2 = f3 + f4;
            }
            this.A00 = f2;
            this.A02 = true;
        }
        C53712g9 r3 = this.A03.A0H;
        float f5 = this.A01;
        r3.A00(f5 + ((this.A00 - f5) * valueAnimator.getAnimatedFraction()), r3.A01);
    }
}
