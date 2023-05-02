package X;

/* renamed from: X.4Xj  reason: invalid class name and case insensitive filesystem */
public final class C87554Xj {
    public static /* synthetic */ float A00(C31201dg r3, int i2) {
        String A0J = r3.A0J(i2);
        try {
            return C62163Bx.A03(A0J, 0.0f);
        } catch (AnonymousClass40K unused) {
            C29691b2.A00("BloksModelUtils", AnonymousClass000.A0h(A0J, AnonymousClass000.A0r("Error parsing pixel value ")));
            return 0.0f;
        }
    }

    public static final C05480Rp A01(C31201dg r6) {
        return new C05480Rp((int) A00(r6, 42), (int) A00(r6, 40), (int) A00(r6, 41), (int) A00(r6, 35), (int) A00(r6, 36), (int) A00(r6, 38));
    }
}
