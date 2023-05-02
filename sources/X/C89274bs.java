package X;

/* renamed from: X.4bs  reason: invalid class name and case insensitive filesystem */
public class C89274bs {
    public static final byte[] A04 = {78, 111, 105, 115, 101, 95, 88, 88, 102, 97, 108, 108, 98, 97, 99, 107, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54};
    public static final byte[] A05 = {78, 111, 105, 115, 101, 95, 88, 88, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public static final byte[] A06 = {78, 111, 105, 115, 101, 95, 73, 75, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public long A00;
    public C46972Gz A01;
    public byte[] A02;
    public final AnonymousClass4QZ A03;

    public C89274bs(byte[] bArr, byte[] bArr2) {
        AnonymousClass4QZ r1 = new AnonymousClass4QZ(bArr);
        this.A03 = r1;
        this.A02 = r1.A00;
        r1.A00(bArr2);
    }

    public void A00(byte[] bArr) {
        byte[][] A052 = C28641Wx.A05(C40771uf.A01(bArr, this.A02, (byte[]) null, 64), 32, 32);
        this.A02 = A052[0];
        this.A01 = new C46972Gz(A052[1]);
        this.A00 = 0;
    }

    public byte[] A01(byte[] bArr) {
        byte[] bArr2;
        C46972Gz r5 = this.A01;
        if (r5 != null) {
            long j2 = this.A00;
            this.A00 = 1 + j2;
            bArr2 = r5.A02(this.A03.A00, bArr, j2);
        } else {
            bArr2 = bArr;
        }
        this.A03.A00(bArr);
        return bArr2;
    }

    public byte[] A02(byte[] bArr) {
        byte[] bArr2 = bArr;
        C46972Gz r2 = this.A01;
        if (r2 != null) {
            long j2 = this.A00;
            this.A00 = 1 + j2;
            bArr2 = r2.A01(this.A03.A00, bArr2, bArr.length, j2);
        }
        this.A03.A00(bArr2);
        return bArr2;
    }
}
