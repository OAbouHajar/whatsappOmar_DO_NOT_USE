package X;

/* renamed from: X.48B  reason: invalid class name */
public final class AnonymousClass48B {
    public static final void A00(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder A0r = AnonymousClass000.A0r("size=");
            A0r.append(j2);
            A0r.append(" offset=");
            A0r.append(j3);
            A0r.append(" byteCount=");
            throw new ArrayIndexOutOfBoundsException(C13680ns.A0j(A0r, j4));
        }
    }
}
