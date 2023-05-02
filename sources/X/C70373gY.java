package X;

import android.view.animation.Animation;

/* renamed from: X.3gY  reason: invalid class name and case insensitive filesystem */
public class C70373gY extends C30551cZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C94524l3 A01;

    public C70373gY(C94524l3 r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animation animation) {
        C614739b r2 = this.A01.A01;
        r2.A03.setTranscriptMode(this.A00);
        r2.A0D = false;
    }

    public void onAnimationStart(Animation animation) {
        this.A01.A01.A03.setTranscriptMode(2);
    }
}
