package X;

/* renamed from: X.2eH  reason: invalid class name and case insensitive filesystem */
public final class C52682eH implements C30881d7 {
    public final int A00;
    public final C30861d5 A01;
    public final C27541Sd A02;
    public final C222517f A03;
    public final C30841d3 A04;
    public final C30161br A05;
    public final boolean A06;

    public C52682eH(C30861d5 r1, C27541Sd r2, C222517f r3, C30841d3 r4, C30161br r5, int i2, boolean z2) {
        this.A00 = i2;
        this.A06 = z2;
        this.A03 = r3;
        this.A01 = r1;
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
    }

    public void AHO(byte[] bArr) {
        C30841d3 r1 = this.A04;
        if (r1 != null) {
            r1.A02 = true;
        }
        byte[] bArr2 = bArr;
        if (bArr != null && bArr.length != 0) {
            C30861d5 r12 = this.A01;
            r12.A00 = Boolean.TRUE;
            r12.A08 = 12;
            C30161br r13 = this.A05;
            int i2 = this.A00;
            C28381Vw r3 = r13.A0C;
            if (r3 == null) {
                r3 = r13.A0m;
            }
            C38791rQ r2 = new C38791rQ(r3, bArr2, i2, r13.A0j);
            r13.A03(r2);
            this.A02.A00(r2, r13);
        } else if (this.A06) {
            this.A03.A07(this.A05);
        }
    }
}
