package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.3KL  reason: invalid class name */
public class AnonymousClass3KL extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener A02;
    public final /* synthetic */ C614739b A03;
    public final /* synthetic */ AnonymousClass3T3 A04;

    public AnonymousClass3KL(View view, View view2, ViewTreeObserver.OnPreDrawListener onPreDrawListener, C614739b r4, AnonymousClass3T3 r5) {
        this.A03 = r4;
        this.A02 = onPreDrawListener;
        this.A00 = view;
        this.A01 = view2;
        this.A04 = r5;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.animate().alpha(1.0f).setDuration(100).start();
        this.A04.animate().alpha(1.0f).setDuration(100).start();
    }

    public void onAnimationStart(Animator animator) {
        this.A03.A02.getViewTreeObserver().addOnPreDrawListener(this.A02);
        View view = this.A00;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        View view2 = this.A01;
        view2.setAlpha(0.0f);
        view2.setVisibility(0);
        AnonymousClass3T3 r0 = this.A04;
        r0.setAlpha(0.0f);
        r0.setVisibility(0);
    }
}
