package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.TransitionDrawable;
import org.npci.commonlibrary.GetCredential;

/* renamed from: X.5dZ  reason: invalid class name and case insensitive filesystem */
public class C110135dZ extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GetCredential A01;
    public final /* synthetic */ boolean A02;

    public C110135dZ(GetCredential getCredential, int i2, boolean z2) {
        this.A01 = getCredential;
        this.A02 = z2;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.A02) {
            GetCredential getCredential = this.A01;
            getCredential.A02.setVisibility(8);
            getCredential.A03.setVisibility(8);
            getCredential.A01.resetTransition();
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        boolean z2 = this.A02;
        GetCredential getCredential = this.A01;
        TransitionDrawable transitionDrawable = getCredential.A01;
        if (z2) {
            transitionDrawable.startTransition(300);
            getCredential.A02.setVisibility(0);
            getCredential.A03.setVisibility(0);
            if (getCredential.A02.getY() == 0.0f) {
                getCredential.A02.setY((float) (-this.A00));
                return;
            }
            return;
        }
        transitionDrawable.reverseTransition(300);
    }
}
