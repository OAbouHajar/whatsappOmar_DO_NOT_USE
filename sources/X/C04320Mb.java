package X;

/* renamed from: X.0Mb  reason: invalid class name and case insensitive filesystem */
public final class C04320Mb {
    public static void A00(Throwable th) {
        Class cls = Error.class;
        if (!cls.isInstance(th)) {
            cls = RuntimeException.class;
            if (!cls.isInstance(th)) {
                throw new RuntimeException(th);
            }
        }
        throw ((Throwable) cls.cast(th));
    }
}
