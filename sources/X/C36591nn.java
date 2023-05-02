package X;

/* renamed from: X.1nn  reason: invalid class name and case insensitive filesystem */
public class C36591nn {
    public final C36571nl A00;
    public final byte[] A01;

    public C36591nn(C36571nl r1, byte[] bArr) {
        this.A00 = r1;
        this.A01 = bArr;
    }

    public C36611np A00(C36251nF r6, C36491nd r7) {
        byte[] A02 = C36241nE.A02(r7.A00, r6);
        C36571nl r4 = this.A00;
        byte[][] A012 = C36581nm.A01(r4.A02(A02, this.A01, "WhisperRatchet".getBytes(), 64), 32, 32);
        return new C36611np(new C36591nn(r4, A012[0]), new C36601no(r4, A012[1], 0));
    }
}
