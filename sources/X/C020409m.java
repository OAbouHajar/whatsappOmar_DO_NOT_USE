package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.09m  reason: invalid class name and case insensitive filesystem */
public class C020409m extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C02740Eq A02;
    public final /* synthetic */ C02790Ey A03;
    public final /* synthetic */ AnonymousClass0S3 A04;
    public final /* synthetic */ boolean A05;

    public C020409m(View view, ViewGroup viewGroup, C02740Eq r3, C02790Ey r4, AnonymousClass0S3 r5, boolean z2) {
        this.A03 = r4;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A05 = z2;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.A01;
        View view = this.A00;
        viewGroup.endViewTransition(view);
        if (this.A05) {
            this.A04.A01.A02(view);
        }
        this.A02.A00();
    }
}
