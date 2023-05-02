package X;

import android.media.AudioTrack;

/* renamed from: X.4Wt  reason: invalid class name and case insensitive filesystem */
public final class C87434Wt {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final C86934Us A05;

    public C87434Wt(AudioTrack audioTrack) {
        if (AnonymousClass3C1.A01 >= 19) {
            this.A05 = new C86934Us(audioTrack);
            A02();
            return;
        }
        this.A05 = null;
        this.A00 = 3;
        this.A04 = 10000000;
    }

    public long A00() {
        C86934Us r0 = this.A05;
        if (r0 != null) {
            return r0.A00;
        }
        return -1;
    }

    public long A01() {
        C86934Us r0 = this.A05;
        if (r0 != null) {
            return r0.A00();
        }
        return -9223372036854775807L;
    }

    public void A02() {
        if (this.A05 != null) {
            this.A00 = 0;
            this.A03 = 0;
            this.A01 = -1;
            this.A02 = C13690nt.A09(System.nanoTime());
            this.A04 = 10000;
        }
    }

    public boolean A03(long j2) {
        long j3;
        C86934Us r8 = this.A05;
        if (r8 != null && j2 - this.A03 >= this.A04) {
            this.A03 = j2;
            boolean A012 = r8.A01();
            int i2 = this.A00;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                    }
                } else if (A012) {
                    if (r8.A00 > this.A01) {
                        this.A00 = 2;
                        j3 = 10000000;
                        this.A04 = j3;
                        return A012;
                    }
                }
                A02();
            } else if (A012) {
                if (r8.A00() >= this.A02) {
                    this.A01 = r8.A00;
                    this.A00 = 1;
                    j3 = 10000;
                    this.A04 = j3;
                    return A012;
                }
            } else if (j2 - this.A02 > 500000) {
                this.A00 = 3;
                j3 = 10000000;
                this.A04 = j3;
                return A012;
            }
            return A012;
        }
        return false;
    }
}
