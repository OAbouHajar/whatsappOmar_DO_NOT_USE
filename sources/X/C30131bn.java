package X;

import android.os.SystemClock;

/* renamed from: X.1bn  reason: invalid class name and case insensitive filesystem */
public class C30131bn implements C30091bj {
    public long A00 = 0;
    public boolean A01 = false;
    public final C210812s A02;
    public final C16440t3 A03;

    public C30131bn(C210812s r3, C16440t3 r4) {
        this.A03 = r4;
        this.A02 = r3;
    }

    public Integer A7v() {
        return 1;
    }

    public synchronized boolean isValid() {
        boolean z2;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.A00 < 5000) {
            z2 = this.A01;
        } else {
            this.A00 = uptimeMillis;
            try {
                C46192Cv r3 = this.A02.A00;
                int i2 = r3.A00;
                if (i2 != 1 || r3.A01 > 0 || r3.A03 > 0 || r3.A02 != Integer.MIN_VALUE) {
                    if (!r3.A02() || i2 != 2) {
                        z2 = false;
                        this.A01 = z2;
                    }
                }
                z2 = true;
                this.A01 = z2;
            } catch (Exception unused) {
                z2 = false;
                this.A01 = false;
            }
        }
        return z2;
    }
}
