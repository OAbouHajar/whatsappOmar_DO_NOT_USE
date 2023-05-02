package X;

/* renamed from: X.1Wy  reason: invalid class name and case insensitive filesystem */
public class C28651Wy {
    public final C28481Wg A00;
    public final AnonymousClass1WK A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C28651Wy(C28481Wg r5, AnonymousClass1WK r6, byte[] bArr, byte[] bArr2) {
        this.A01 = r6;
        this.A03 = bArr;
        this.A00 = r5;
        this.A02 = bArr2;
        byte[] bArr3 = new byte[32];
        int length = bArr2.length;
        if (length < 32) {
            System.arraycopy(bArr2, 0, bArr3, 32 - length, length);
        } else {
            System.arraycopy(bArr2, length - 32, bArr3, 0, 32);
        }
        this.A04 = bArr3;
    }
}
