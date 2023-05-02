package X;

import android.util.Log;

/* renamed from: X.4ox  reason: invalid class name and case insensitive filesystem */
public final class C96824ox implements AnonymousClass5SL {
    public final int A00;
    public final int A01;
    public final C90504eH A02;

    public C96824ox(C32491gT r6, C65413Ur r7) {
        C90504eH r4 = r7.A00;
        this.A02 = r4;
        int A022 = C90504eH.A02(r4, 12);
        if ("audio/raw".equals(r6.A0T)) {
            int A023 = AnonymousClass3C1.A02(r6.A0B, r6.A06);
            if (A022 == 0 || A022 % A023 != 0) {
                StringBuilder A0r = AnonymousClass000.A0r("Audio sample size mismatch. stsd sample size: ");
                A0r.append(A023);
                Log.w("AtomParsers", C13680ns.A0i(", stsz sample size: ", A0r, A022));
                A022 = A023;
            }
            this.A00 = A022;
            this.A01 = r4.A0E();
        }
        if (A022 == 0) {
            A022 = -1;
        }
        this.A00 = A022;
        this.A01 = r4.A0E();
    }

    public int ACK() {
        return this.A00;
    }

    public int AFg() {
        return this.A01;
    }

    public int AbW() {
        int i2 = this.A00;
        return i2 == -1 ? this.A02.A0E() : i2;
    }
}
