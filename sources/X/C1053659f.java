package X;

/* renamed from: X.59f  reason: invalid class name and case insensitive filesystem */
public class C1053659f implements C46932Gv {
    public byte[] A00;

    public C1053659f(byte[] bArr) {
        int length = bArr.length;
        if (length <= 255) {
            byte[] bArr2 = new byte[length];
            this.A00 = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        throw AnonymousClass000.A0T("RC5 key length can be no greater than 255");
    }
}
