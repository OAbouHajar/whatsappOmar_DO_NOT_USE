package X;

import android.animation.Animator;
import android.widget.ImageButton;

/* renamed from: X.4fA  reason: invalid class name and case insensitive filesystem */
public class C90974fA implements Animator.AnimatorListener {
    public final /* synthetic */ C47572Jn A00;

    public C90974fA(C47572Jn r1) {
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C47572Jn r0 = this.A00;
        r0.A0F();
        ImageButton imageButton = r0.A0I;
        if (imageButton != null) {
            imageButton.setAlpha(1.0f);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
