package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.3KE  reason: invalid class name */
public class AnonymousClass3KE extends AnimatorListenerAdapter {
    public final /* synthetic */ TransitionValues A00;
    public final /* synthetic */ AnonymousClass4VD A01;
    public final /* synthetic */ AnonymousClass3MX A02;

    public AnonymousClass3KE(TransitionValues transitionValues, AnonymousClass4VD r2, AnonymousClass3MX r3) {
        this.A02 = r3;
        this.A00 = transitionValues;
        this.A01 = r2;
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        TransitionValues transitionValues = this.A00;
        transitionValues.view.setAlpha(1.0f);
        AnonymousClass4VD r2 = this.A01;
        if (((float) r2.A07) / ((float) r2.A06) < 1.0f || ((float) r2.A04) / ((float) r2.A05) < 1.0f) {
            ViewParent parent = transitionValues.view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setClipChildren(false);
            }
        }
    }
}
