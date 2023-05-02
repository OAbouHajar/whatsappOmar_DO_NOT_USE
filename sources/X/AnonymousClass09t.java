package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.09t  reason: invalid class name */
public class AnonymousClass09t extends AnimatorListenerAdapter {
    public int A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ C020109j A02;

    public AnonymousClass09t(C020109j r2) {
        this.A02 = r2;
    }

    public void onAnimationCancel(Animator animator) {
        this.A01 = true;
        C020109j r2 = this.A02;
        ArrayList<Animator.AnimatorListener> listeners = r2.getListeners();
        if (listeners != null) {
            Iterator<Animator.AnimatorListener> it = listeners.iterator();
            while (it.hasNext()) {
                it.next().onAnimationCancel(r2);
            }
        }
    }

    public void onAnimationEnd(Animator animator) {
        int i2;
        int i3 = this.A00 + 1;
        this.A00 = i3;
        if (this.A01 || ((i2 = this.A02.A00) != -1 && i3 >= i2)) {
            C020109j r2 = this.A02;
            ArrayList<Animator.AnimatorListener> listeners = r2.getListeners();
            if (listeners != null) {
                Iterator<Animator.AnimatorListener> it = listeners.iterator();
                while (it.hasNext()) {
                    it.next().onAnimationEnd(r2);
                }
                return;
            }
            return;
        }
        animator.start();
    }

    public void onAnimationStart(Animator animator) {
        C020109j r2 = this.A02;
        ArrayList<Animator.AnimatorListener> listeners = r2.getListeners();
        if (this.A00 == 0 && listeners != null) {
            Iterator<Animator.AnimatorListener> it = listeners.iterator();
            while (it.hasNext()) {
                it.next().onAnimationStart(r2);
            }
        }
    }
}
