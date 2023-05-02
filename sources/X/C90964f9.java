package X;

import android.animation.Animator;
import android.view.View;

/* renamed from: X.4f9  reason: invalid class name and case insensitive filesystem */
public class C90964f9 implements Animator.AnimatorListener {
    public final /* synthetic */ AnonymousClass1V8 A00;

    public C90964f9(AnonymousClass1V8 r1) {
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        View view;
        int i2;
        AnonymousClass1V8 r1 = this.A00;
        if (!r1.A0g.isEmpty()) {
            view = r1.A06;
            i2 = 0;
        } else {
            view = r1.A05;
            i2 = 4;
        }
        view.setVisibility(i2);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        View view;
        int i2;
        AnonymousClass1V8 r1 = this.A00;
        if (!r1.A0g.isEmpty()) {
            view = r1.A05;
            i2 = 0;
        } else {
            view = r1.A06;
            i2 = 8;
        }
        view.setVisibility(i2);
    }
}
