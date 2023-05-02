package X;

/* renamed from: X.4oc  reason: invalid class name and case insensitive filesystem */
public final class C96614oc implements C55142iu {
    public final long A00;
    public final C55142iu A01;

    public C96614oc(C55142iu r4, long j2) {
        this.A01 = r4;
        C90524eJ.A03(C13700nu.A0f((r4.AF7() > j2 ? 1 : (r4.AF7() == j2 ? 0 : -1))));
        this.A00 = j2;
    }

    public void A4m(int i2) {
        this.A01.A4m(i2);
    }

    public long AEy() {
        return this.A01.AEy() - this.A00;
    }

    public long AF7() {
        return this.A01.AF7() - this.A00;
    }

    public int AaH(byte[] bArr, int i2, int i3) {
        return this.A01.AaH(bArr, i2, i3);
    }

    public void AaL(byte[] bArr, int i2, int i3) {
        this.A01.AaL(bArr, i2, i3);
    }

    public boolean AaM(byte[] bArr, int i2, int i3, boolean z2) {
        return this.A01.AaM(bArr, 0, i3, z2);
    }

    public boolean AbV(byte[] bArr, int i2, int i3, boolean z2) {
        return this.A01.AbV(bArr, 0, i3, z2);
    }

    public void AcS() {
        this.A01.AcS();
    }

    public int Afv(int i2) {
        return this.A01.Afv(1);
    }

    public void Afx(int i2) {
        this.A01.Afx(i2);
    }

    public long getLength() {
        return this.A01.getLength() - this.A00;
    }

    public int read(byte[] bArr, int i2, int i3) {
        return this.A01.read(bArr, i2, i3);
    }

    public void readFully(byte[] bArr, int i2, int i3) {
        this.A01.readFully(bArr, i2, i3);
    }
}
