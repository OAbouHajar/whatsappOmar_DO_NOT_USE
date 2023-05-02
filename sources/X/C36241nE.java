package X;

/* renamed from: X.1nE  reason: invalid class name and case insensitive filesystem */
public class C36241nE {
    public static C36251nF A00(byte[] bArr) {
        byte b2 = bArr[0] & 255;
        if (b2 == 5) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 1, bArr2, 0, 32);
            return new C36251nF(bArr2);
        }
        StringBuilder sb = new StringBuilder("Bad key type: ");
        sb.append(b2);
        throw new C36291nJ(sb.toString());
    }

    public static C36491nd A01() {
        AnonymousClass5T9 r0 = C36471nb.A00().A00;
        byte[] A9P = r0.A9P();
        return new C36491nd(new C36411nV(A9P), new C36251nF(r0.generatePublicKey(A9P)));
    }

    public static byte[] A02(C36411nV r3, C36251nF r4) {
        return C36471nb.A00().A02(r4.A00, r3.A00);
    }
}
