package X;

/* renamed from: X.4nA  reason: invalid class name and case insensitive filesystem */
public class C95734nA implements AnonymousClass5Kx {
    public static C95734nA A00;

    public static synchronized C95734nA A00() {
        C95734nA r0;
        synchronized (C95734nA.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new C95734nA();
                A00 = r0;
            }
        }
        return r0;
    }
}
