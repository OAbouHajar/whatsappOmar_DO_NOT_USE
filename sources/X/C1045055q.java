package X;

import android.view.View;
import android.view.animation.AlphaAnimation;

/* renamed from: X.55q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1045055q implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ View A03;

    public /* synthetic */ C1045055q(View view, float f2, float f3, int i2) {
        this.A03 = view;
        this.A02 = i2;
        this.A00 = f2;
        this.A01 = f3;
    }

    public final void run() {
        View view = this.A03;
        int i2 = this.A02;
        float f2 = this.A00;
        float f3 = this.A01;
        if (view.getVisibility() != i2) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
            alphaAnimation.setDuration(200);
            view.startAnimation(alphaAnimation);
            view.setVisibility(i2);
        }
    }
}
