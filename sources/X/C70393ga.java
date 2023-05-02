package X;

import android.view.animation.Animation;

/* renamed from: X.3ga  reason: invalid class name and case insensitive filesystem */
public class C70393ga extends C30551cZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C614739b A01;
    public final /* synthetic */ AnonymousClass3T3 A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;

    public C70393ga(C614739b r1, AnonymousClass3T3 r2, Runnable runnable, Runnable runnable2, int i2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = runnable;
        this.A00 = i2;
        this.A03 = runnable2;
    }

    public void onAnimationEnd(Animation animation) {
        C614739b r2 = this.A01;
        r2.A02.setVisibility(8);
        r2.A02.getLayoutParams().height = this.A00;
        this.A03.run();
        this.A02.setEnabled(true);
        r2.A0D = false;
    }

    public void onAnimationStart(Animation animation) {
        this.A02.setEnabled(false);
        this.A04.run();
    }
}
