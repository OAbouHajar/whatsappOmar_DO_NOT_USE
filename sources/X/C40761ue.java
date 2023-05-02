package X;

import java.util.Random;

/* renamed from: X.1ue  reason: invalid class name and case insensitive filesystem */
public class C40761ue {
    public int A00 = 0;
    public boolean A01 = false;
    public final int A02;
    public final long A03;
    public final Random A04;

    public C40761ue(Random random) {
        this.A04 = random;
        this.A02 = 20;
        this.A03 = 3600000;
    }

    public C40761ue(Random random, int i2, long j2) {
        this.A04 = random;
        this.A02 = i2;
        this.A03 = j2;
    }

    public synchronized Long A00() {
        Long l2;
        int i2 = this.A00;
        if (i2 >= this.A02) {
            l2 = null;
        } else {
            int i3 = i2 + 1;
            this.A00 = i3;
            if (!this.A01) {
                long min = (1 << Math.min(i3, 50)) * 1000;
                long abs = (min / 2) + Math.abs(this.A04.nextLong() % min);
                long j2 = this.A03;
                if (abs >= j2) {
                    this.A01 = true;
                    l2 = Long.valueOf(j2);
                } else {
                    l2 = Long.valueOf(abs);
                }
            } else {
                l2 = Long.valueOf(this.A03);
            }
        }
        return l2;
    }

    public synchronized void A01() {
        this.A00 = 0;
    }
}
