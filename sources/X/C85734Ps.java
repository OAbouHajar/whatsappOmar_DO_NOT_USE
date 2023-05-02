package X;

import java.io.EOFException;

/* renamed from: X.4Ps  reason: invalid class name and case insensitive filesystem */
public final class C85734Ps {
    public final C90504eH A00 = C90504eH.A05(10);

    public C93724jf A00(C55142iu r10, C108305Nl r11) {
        C93724jf r8 = null;
        int i2 = 0;
        while (true) {
            try {
                C90504eH r5 = this.A00;
                r10.AaL(r5.A02, 0, 10);
                r5.A0S(0);
                if (r5.A0D() != 4801587) {
                    break;
                }
                r5.A0T(3);
                int A0B = r5.A0B();
                int i3 = A0B + 10;
                if (r8 == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(r5.A02, 0, bArr, 0, 10);
                    r10.AaL(bArr, 10, A0B);
                    r8 = new AnonymousClass3V3(r11).A06(bArr, i3);
                } else {
                    r10.A4m(A0B);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        r10.AcS();
        r10.A4m(i2);
        return r8;
    }
}
