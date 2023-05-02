package X;

import android.animation.ValueAnimator;

/* renamed from: X.0fc  reason: invalid class name and case insensitive filesystem */
public class C09500fc implements Runnable {
    public final /* synthetic */ C02810Fi A00;

    public C09500fc(C02810Fi r1) {
        this.A00 = r1;
    }

    public void run() {
        C02810Fi r2 = this.A00;
        int i2 = r2.A02;
        if (i2 == 1) {
            r2.A0K.cancel();
        } else if (i2 != 2) {
            return;
        }
        r2.A02 = 3;
        ValueAnimator valueAnimator = r2.A0K;
        valueAnimator.setFloatValues(new float[]{AnonymousClass000.A03(valueAnimator), 0.0f});
        valueAnimator.setDuration((long) 500);
        valueAnimator.start();
    }
}
