package X;

/* renamed from: X.1nH  reason: invalid class name and case insensitive filesystem */
public class C36271nH {
    public final int A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public C36271nH(int i2, byte[] bArr) {
        byte[][] A012 = C36581nm.A01(new C36561nk().A02(bArr, new byte[32], "WhisperGroup".getBytes(), 48), 16, 32);
        this.A00 = i2;
        this.A03 = bArr;
        this.A02 = A012[0];
        this.A01 = A012[1];
    }
}
