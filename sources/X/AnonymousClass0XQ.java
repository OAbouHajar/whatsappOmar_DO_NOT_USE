package X;

import android.animation.Animator;

/* renamed from: X.0XQ  reason: invalid class name */
public class AnonymousClass0XQ implements Animator.AnimatorListener {
    public final /* synthetic */ AnonymousClass0PF A00;
    public final /* synthetic */ C02210Ag A01;

    public AnonymousClass0XQ(AnonymousClass0PF r1, C02210Ag r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
        C02210Ag r4 = this.A01;
        AnonymousClass0PF r3 = this.A00;
        r4.A02(r3, 1.0f, true);
        r3.A07 = r3.A04;
        r3.A05 = r3.A01;
        r3.A06 = r3.A03;
        int[] iArr = r3.A0G;
        int length = (r3.A0C + 1) % iArr.length;
        r3.A0C = length;
        r3.A0D = iArr[length];
        if (r4.A04) {
            r4.A04 = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            if (r3.A0F) {
                r3.A0F = false;
                return;
            }
            return;
        }
        r4.A01 += 1.0f;
    }

    public void onAnimationStart(Animator animator) {
        this.A01.A01 = 0.0f;
    }
}
