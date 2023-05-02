package X;

import android.os.SystemClock;

/* renamed from: X.4WP  reason: invalid class name */
public class AnonymousClass4WP {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;

    public AnonymousClass4WP(long j2) {
        this.A00 = j2;
    }

    public long A00() {
        long j2 = this.A01;
        return this.A03 ? j2 + (SystemClock.elapsedRealtime() - this.A02) : j2;
    }

    public void A01() {
        if (!this.A03) {
            this.A02 = SystemClock.elapsedRealtime();
        }
        this.A03 = true;
    }

    public void A02() {
        if (this.A03) {
            this.A01 += SystemClock.elapsedRealtime() - this.A02;
        }
        this.A03 = false;
    }
}
