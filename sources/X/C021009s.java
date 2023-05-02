package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.09s  reason: invalid class name and case insensitive filesystem */
public class C021009s extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass0SH A01;
    public final /* synthetic */ C13190lc A02;

    public C021009s(View view, AnonymousClass0SH r2, C13190lc r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.A02.AMR(this.A00);
    }

    public void onAnimationEnd(Animator animator) {
        this.A02.AMS(this.A00);
    }

    public void onAnimationStart(Animator animator) {
        this.A02.AMT(this.A00);
    }
}
