package X;

import java.io.File;

/* renamed from: X.0xO  reason: invalid class name and case insensitive filesystem */
public class C18870xO {
    public final C18860xN A00;
    public final C18850xM A01;

    public C18870xO(C18860xN r1, C18850xM r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = (X.C16730tY) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(X.C16740tZ r6) {
        /*
            boolean r0 = r6 instanceof X.C16730tY
            r5 = 0
            if (r0 == 0) goto L_0x0028
            X.0tY r6 = (X.C16730tY) r6
            X.0ta r0 = r6.A02
            if (r0 == 0) goto L_0x0028
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0028
            X.0ta r0 = r6.A02
            java.io.File r0 = r0.A0F
            long r3 = r0.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            X.0ta r0 = r6.A02
            java.io.File r0 = r0.A0F
            return r0
        L_0x0028:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18870xO.A00(X.0tZ):java.io.File");
    }

    public byte[] A01(C16740tZ r9) {
        C42051x9 A002;
        C18860xN r5 = this.A00;
        byte[] A09 = r5.A09(r9);
        if (A09 == null) {
            if (r9.A08() == 1 && r9.A13 > 0) {
                if (r9 instanceof C16730tY) {
                    C16730tY r2 = (C16730tY) r9;
                    File A003 = A00(r2);
                    if (!(A003 == null || (A002 = this.A01.A00(new C42031x7(C31831f6.A01(r2.A10, r2.A08), A003, r2.A06, false))) == null || (A09 = A002.A02) == null)) {
                        r5.A02(r9, A09);
                    }
                }
            }
            return null;
        }
        return A09;
    }
}
