package X;

/* renamed from: X.2Gu  reason: invalid class name and case insensitive filesystem */
public class C46922Gu implements C46932Gv {
    public byte[] A00;

    public C46922Gu(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C46922Gu(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        this.A00 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }
}
