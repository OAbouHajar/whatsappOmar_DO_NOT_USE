package X;

/* renamed from: X.59l  reason: invalid class name and case insensitive filesystem */
public class C1054259l implements C46932Gv {
    public C46932Gv A00;
    public byte[] A01;

    public C1054259l(C46932Gv r3, byte[] bArr) {
        this(r3, bArr, 0, bArr.length);
    }

    public C1054259l(C46932Gv r3, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.A01 = bArr2;
        this.A00 = r3;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
    }
}
