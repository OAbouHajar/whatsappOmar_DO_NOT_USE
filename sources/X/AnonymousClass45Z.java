package X;

/* renamed from: X.45Z  reason: invalid class name */
public class AnonymousClass45Z {
    public static int A00(C31201dg r1) {
        String A0J = r1.A0J(42);
        if (A0J == null || A0J.equals("column")) {
            return 1;
        }
        if (A0J.equals("row")) {
            return 0;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(A0J, AnonymousClass000.A0r("Unknown direction: ")));
    }
}
