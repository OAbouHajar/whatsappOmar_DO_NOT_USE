package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.09x  reason: invalid class name and case insensitive filesystem */
public class C021309x extends AnimatorListenerAdapter implements C019509b, C13050lO {
    public boolean A00 = false;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final ViewGroup A04;
    public final boolean A05;

    public C021309x(View view, int i2) {
        this.A03 = view;
        this.A02 = i2;
        this.A04 = (ViewGroup) view.getParent();
        this.A05 = true;
        A00(true);
    }

    public final void A00(boolean z2) {
        ViewGroup viewGroup;
        if (this.A05 && this.A01 != z2 && (viewGroup = this.A04) != null) {
            this.A01 = z2;
            AnonymousClass0We.A03(viewGroup, z2);
        }
    }

    public void AZB(C015707n r1) {
    }

    public void AZC(C015707n r4) {
        if (!this.A00) {
            C06430Vt.A02.A07(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
        r4.A09(this);
    }

    public void AZD(C015707n r2) {
        A00(false);
    }

    public void AZE(C015707n r2) {
        A00(true);
    }

    public void AZF(C015707n r1) {
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A00) {
            C06430Vt.A02.A07(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
    }

    public void onAnimationPause(Animator animator) {
        if (!this.A00) {
            C06430Vt.A02.A07(this.A03, this.A02);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationResume(Animator animator) {
        if (!this.A00) {
            C06430Vt.A02.A07(this.A03, 0);
        }
    }

    public void onAnimationStart(Animator animator) {
    }
}
