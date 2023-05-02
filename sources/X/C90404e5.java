package X;

/* renamed from: X.4e5  reason: invalid class name and case insensitive filesystem */
public final class C90404e5 {
    public static long A00;
    public static C89434cA A01;
    public static final C90404e5 A02 = new C90404e5();

    public static final C89434cA A00() {
        synchronized (A02) {
            C89434cA r4 = A01;
            if (r4 == null) {
                return new C89434cA();
            }
            A01 = r4.A02;
            r4.A02 = null;
            A00 -= (long) 8192;
            return r4;
        }
    }

    public static final void A01(C89434cA r7) {
        if (r7.A02 != null || r7.A03 != null) {
            throw AnonymousClass000.A0T("Failed requirement.");
        } else if (!r7.A05) {
            synchronized (A02) {
                long j2 = A00 + ((long) 8192);
                if (j2 <= 65536) {
                    A00 = j2;
                    r7.A02 = A01;
                    r7.A00 = 0;
                    r7.A01 = 0;
                    A01 = r7;
                }
            }
        }
    }
}
