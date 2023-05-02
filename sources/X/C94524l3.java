package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4l3  reason: invalid class name and case insensitive filesystem */
public class C94524l3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C614739b A01;
    public final /* synthetic */ AnonymousClass3T3 A02;

    public C94524l3(C614739b r1, AnonymousClass3T3 r2, int i2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i2;
    }

    public boolean onPreDraw() {
        C614739b r5 = this.A01;
        if (!r5.A0G) {
            AnonymousClass3T3 r1 = this.A02;
            if (r1.A09.A02 || r1.A0A.A02) {
                r5.A0G = true;
                r5.A02.requestLayout();
            }
            return false;
        }
        AnonymousClass3K2.A10(r5.A02, this);
        int i2 = r5.A02.getLayoutParams().height;
        int height = r5.A02.getHeight();
        r5.A02.getLayoutParams().height = this.A00;
        r5.A02.requestLayout();
        int transcriptMode = r5.A03.getTranscriptMode();
        AnonymousClass3NS r3 = new AnonymousClass3NS(this, i2, height);
        C70373gY r2 = new C70373gY(this, transcriptMode);
        r3.setDuration(300);
        r3.setAnimationListener(r2);
        r5.A02.startAnimation(r3);
        return false;
    }
}
