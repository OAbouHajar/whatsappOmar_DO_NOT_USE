package X;

import java.security.SecureRandom;

/* renamed from: X.4U8  reason: invalid class name */
public class AnonymousClass4U8 {
    public int A00;
    public SecureRandom A01;

    public void A00(AnonymousClass4JE r2) {
        this.A01 = r2.A01;
        this.A00 = (r2.A00 + 7) >> 3;
    }

    public byte[] A01() {
        byte[] bArr = new byte[this.A00];
        this.A01.nextBytes(bArr);
        return bArr;
    }
}
