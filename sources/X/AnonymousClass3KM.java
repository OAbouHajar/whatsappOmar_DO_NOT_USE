package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.3KM  reason: invalid class name */
public class AnonymousClass3KM extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ C005602k A04;
    public final /* synthetic */ C57772rm A05;

    public AnonymousClass3KM(View view, ViewPropertyAnimator viewPropertyAnimator, C005602k r3, C57772rm r4, int i2, int i3) {
        this.A05 = r4;
        this.A04 = r3;
        this.A00 = i2;
        this.A02 = view;
        this.A01 = i3;
        this.A03 = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.A03.setListener((Animator.AnimatorListener) null);
        C57772rm r2 = this.A05;
        C005602k r1 = this.A04;
        r2.A03(r1);
        r2.A05.remove(r1);
        r2.A0H();
    }

    public void onAnimationStart(Animator animator) {
        this.A05.A0C = true;
    }
}
