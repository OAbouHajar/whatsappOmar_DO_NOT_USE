package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.0Yx  reason: invalid class name and case insensitive filesystem */
public class C07040Yx implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C02740Eq A02;
    public final /* synthetic */ C02790Ey A03;

    public C07040Yx(View view, ViewGroup viewGroup, C02740Eq r3, C02790Ey r4) {
        this.A03 = r4;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A02 = r3;
    }

    public void onAnimationEnd(Animation animation) {
        this.A01.post(new C09440fV(this));
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
