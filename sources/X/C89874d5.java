package X;

/* renamed from: X.4d5  reason: invalid class name and case insensitive filesystem */
public final class C89874d5 {
    public static C89874d5 A01;
    public static final C65933Xd A02 = new C65933Xd(0, 0, 0, false, false);
    public C65933Xd A00;

    public static synchronized C89874d5 A00() {
        C89874d5 r0;
        synchronized (C89874d5.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C89874d5();
                A01 = r0;
            }
        }
        return r0;
    }
}
