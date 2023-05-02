package X;

import android.transition.Transition;

/* renamed from: X.0YQ  reason: invalid class name */
public class AnonymousClass0YQ implements Transition.TransitionListener {
    public final /* synthetic */ C02770Ew A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass0YQ(C02770Ew r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        this.A01.run();
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
