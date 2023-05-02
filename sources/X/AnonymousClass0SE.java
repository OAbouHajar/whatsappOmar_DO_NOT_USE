package X;

/* renamed from: X.0SE  reason: invalid class name */
public class AnonymousClass0SE {
    public long A00 = 0;
    public AnonymousClass0SE A01;

    public int A00(int i2) {
        long j2;
        AnonymousClass0SE r1 = this.A01;
        if (r1 == null) {
            if (i2 >= 64) {
                j2 = this.A00;
            }
            j2 = this.A00 & ((1 << i2) - 1);
        } else {
            if (i2 >= 64) {
                return r1.A00(i2 - 64) + Long.bitCount(this.A00);
            }
            j2 = this.A00 & ((1 << i2) - 1);
        }
        return Long.bitCount(j2);
    }

    public void A01() {
        this.A00 = 0;
        AnonymousClass0SE r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void A02() {
        if (this.A01 == null) {
            this.A01 = new AnonymousClass0SE();
        }
    }

    public void A03(int i2) {
        if (i2 >= 64) {
            AnonymousClass0SE r0 = this.A01;
            if (r0 != null) {
                r0.A03(i2 - 64);
                return;
            }
            return;
        }
        this.A00 &= (1 << i2) ^ -1;
    }

    public void A04(int i2) {
        if (i2 >= 64) {
            A02();
            this.A01.A04(i2 - 64);
            return;
        }
        this.A00 |= 1 << i2;
    }

    public void A05(int i2, boolean z2) {
        if (i2 >= 64) {
            A02();
            this.A01.A05(i2 - 64, z2);
            return;
        }
        long j2 = this.A00;
        boolean A1O = AnonymousClass000.A1O(((Long.MIN_VALUE & j2) > 0 ? 1 : ((Long.MIN_VALUE & j2) == 0 ? 0 : -1)));
        long j3 = (1 << i2) - 1;
        this.A00 = ((j2 & (j3 ^ -1)) << 1) | (j2 & j3);
        if (z2) {
            A04(i2);
        } else {
            A03(i2);
        }
        if (A1O || this.A01 != null) {
            A02();
            this.A01.A05(0, A1O);
        }
    }

    public boolean A06(int i2) {
        if (i2 < 64) {
            return AnonymousClass000.A1O(((this.A00 & (1 << i2)) > 0 ? 1 : ((this.A00 & (1 << i2)) == 0 ? 0 : -1)));
        }
        A02();
        return this.A01.A06(i2 - 64);
    }

    public boolean A07(int i2) {
        if (i2 >= 64) {
            A02();
            return this.A01.A07(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.A00;
        boolean A1O = AnonymousClass000.A1O(((j3 & j2) > 0 ? 1 : ((j3 & j2) == 0 ? 0 : -1)));
        long j4 = j3 & (j2 ^ -1);
        this.A00 = j4;
        long j5 = j2 - 1;
        this.A00 = (j4 & j5) | Long.rotateRight((j5 ^ -1) & j4, 1);
        AnonymousClass0SE r0 = this.A01;
        if (r0 != null) {
            if (r0.A06(0)) {
                A04(63);
            }
            this.A01.A07(0);
        }
        return A1O;
    }

    public String toString() {
        AnonymousClass0SE r0 = this.A01;
        if (r0 == null) {
            return Long.toBinaryString(this.A00);
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1I(r0, A0o);
        A0o.append("xx");
        return AnonymousClass000.A0h(Long.toBinaryString(this.A00), A0o);
    }
}
