package X;

/* renamed from: X.45b  reason: invalid class name and case insensitive filesystem */
public final class C806845b {
    public static final int A00(C31201dg r2) {
        String A0J = r2.A0J(42);
        if (A0J == null || A0J.equals("column")) {
            return 1;
        }
        if (A0J.equals("row")) {
            return 0;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(A0J, AnonymousClass000.A0r("Unknown direction ")));
    }
}
