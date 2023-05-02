package X;

import java.io.File;

/* renamed from: X.1cu  reason: invalid class name and case insensitive filesystem */
public class C30761cu {
    public int A00;
    public int A01;
    public C31701et A02;
    public File A03;
    public Boolean A04;
    public Boolean A05 = Boolean.FALSE;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Long A0D;
    public Long A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I = false;
    public byte[] A0J;
    public byte[] A0K;

    public C30761cu() {
        Boolean bool = Boolean.TRUE;
        this.A06 = bool;
        this.A04 = bool;
        this.A01 = 0;
    }

    public synchronized int A00() {
        return this.A01;
    }

    public synchronized C31701et A01() {
        return this.A02;
    }

    public synchronized C30761cu A02() {
        C30761cu r1;
        r1 = new C30761cu();
        r1.A05 = this.A05;
        r1.A06 = this.A06;
        r1.A04 = this.A04;
        r1.A0I = this.A0I;
        r1.A02 = this.A02;
        r1.A01 = this.A01;
        r1.A03 = this.A03;
        r1.A0E = this.A0E;
        r1.A0F = this.A0F;
        r1.A0K = this.A0K;
        r1.A0J = this.A0J;
        r1.A0C = this.A0C;
        r1.A0B = this.A0B;
        r1.A09 = this.A09;
        r1.A0A = this.A0A;
        r1.A0D = this.A0D;
        r1.A00 = this.A00;
        r1.A0H = this.A0H;
        r1.A0G = this.A0G;
        r1.A07 = this.A07;
        return r1;
    }

    public synchronized File A03() {
        return this.A03;
    }

    public synchronized Boolean A04() {
        return this.A05;
    }

    public synchronized void A05() {
        this.A04 = false;
    }

    public synchronized void A06() {
        this.A0I = true;
    }

    public synchronized void A07() {
        this.A06 = false;
    }

    public synchronized void A08(int i2) {
        this.A0B = Integer.valueOf(i2);
    }

    public synchronized void A09(int i2) {
        this.A01 = i2;
    }

    public synchronized void A0A(int i2) {
        this.A0C = Integer.valueOf(i2);
    }

    public synchronized void A0B(long j2) {
        this.A0D = Long.valueOf(j2);
    }

    public synchronized void A0C(C31701et r2, int i2, boolean z2) {
        this.A05 = Boolean.valueOf(z2);
        this.A06 = Boolean.FALSE;
        this.A02 = r2;
        this.A00 = i2;
    }

    public synchronized void A0D(File file) {
        this.A03 = file;
    }

    public synchronized void A0E(boolean z2) {
        this.A05 = Boolean.valueOf(z2);
    }

    public synchronized void A0F(byte[] bArr) {
        this.A0J = bArr;
    }

    public synchronized byte[] A0G() {
        return this.A0J;
    }
}
