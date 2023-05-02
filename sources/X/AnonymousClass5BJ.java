package X;

import java.security.MessageDigest;

/* renamed from: X.5BJ  reason: invalid class name */
public class AnonymousClass5BJ extends MessageDigest {
    public int A00;
    public AnonymousClass5T8 A01;

    public AnonymousClass5BJ(AnonymousClass5T8 r2) {
        super(r2.A9q());
        this.A01 = r2;
        this.A00 = r2.ABn();
    }

    public byte[] engineDigest() {
        byte[] bArr = new byte[this.A00];
        this.A01.A8A(bArr, 0);
        return bArr;
    }

    public int engineGetDigestLength() {
        return this.A00;
    }

    public void engineReset() {
        this.A01.reset();
    }

    public void engineUpdate(byte b2) {
        this.A01.AhH(b2);
    }

    public void engineUpdate(byte[] bArr, int i2, int i3) {
        this.A01.update(bArr, i2, i3);
    }
}
