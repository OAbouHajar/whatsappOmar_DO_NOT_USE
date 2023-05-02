package X;

import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;

/* renamed from: X.1kj  reason: invalid class name and case insensitive filesystem */
public class C34701kj extends C34711kk {
    public final C16320sq A00;
    public final Runnable A01 = new RunnableRunnableShape4S0100000_I0_3(this, 35);
    public volatile Runnable A02;

    public C34701kj(C17010u2 r3, C214414c r4, C16320sq r5, String str, int i2) {
        super(r3, r4, str, i2);
        this.A00 = r5;
    }

    public final void A04() {
        int i2;
        C34731km r1 = this.A02;
        synchronized (r1) {
            i2 = r1.A05;
        }
        if (i2 > 0 && this.A02 == null) {
            this.A02 = this.A00.Ad4(this.A01, "TrackedBitmapCache/clean", 60000);
        }
    }
}
