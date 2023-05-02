package X;

/* renamed from: X.4Xk  reason: invalid class name and case insensitive filesystem */
public class C87564Xk {
    public static int A00(C14990q7 r1, C31201dg r2) {
        return A01(r1, r2, 0);
    }

    public static int A01(C14990q7 r0, C31201dg r1, int i2) {
        try {
            if (r0.A05) {
                String A0J = r1.A0J(35);
                return A0J != null ? C62163Bx.A05(A0J) : i2;
            }
            String A0J2 = r1.A0J(36);
            return A0J2 != null ? C62163Bx.A05(A0J2) : i2;
        } catch (AnonymousClass40K unused) {
            C29691b2.A00("ThemedColorUtils", "Error parsing themed color");
            return i2;
        }
    }
}
