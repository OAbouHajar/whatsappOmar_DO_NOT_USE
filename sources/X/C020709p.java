package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.09p  reason: invalid class name and case insensitive filesystem */
public class C020709p extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass00N A00;
    public final /* synthetic */ C015707n A01;

    public C020709p(AnonymousClass00N r1, C015707n r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.remove(animator);
        this.A01.A0C.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.A01.A0C.add(animator);
    }
}
