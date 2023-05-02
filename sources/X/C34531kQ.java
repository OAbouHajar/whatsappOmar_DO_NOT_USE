package X;

/* renamed from: X.1kQ  reason: invalid class name and case insensitive filesystem */
public class C34531kQ {
    public long A00;
    public long A01;
    public long A02;
    public final long A03;
    public final long A04;

    public C34531kQ(long j2, long j3) {
        boolean z2 = true;
        AnonymousClass00B.A0G(j2 > 0);
        AnonymousClass00B.A0G(j3 <= 0 ? false : z2);
        this.A04 = j3;
        this.A03 = j2;
        A02();
    }

    public synchronized long A00() {
        return this.A02;
    }

    public synchronized long A01() {
        long j2;
        this.A02++;
        long j3 = this.A00;
        j2 = this.A04;
        if (j3 <= j2) {
            long j4 = this.A01 + j3;
            this.A01 = j4;
            long j5 = j4 - j3;
            this.A00 = j5;
            j2 = j4 - j5;
        }
        return j2;
    }

    public synchronized void A02() {
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = this.A03;
    }

    public synchronized void A03(long j2) {
        boolean z2 = false;
        if (j2 >= 0) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        if (j2 < this.A02) {
            A02();
        }
        while (this.A02 < j2) {
            A01();
        }
    }
}
