package X;

/* renamed from: X.16i  reason: invalid class name and case insensitive filesystem */
public class C220216i {
    public static C220216i A00;

    public static synchronized C220216i A00() {
        C220216i r0;
        synchronized (C220216i.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new C220216i();
                A00 = r0;
            }
        }
        return r0;
    }
}
