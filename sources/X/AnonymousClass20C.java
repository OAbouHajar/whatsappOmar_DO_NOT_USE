package X;

/* renamed from: X.20C  reason: invalid class name */
public class AnonymousClass20C {
    public static boolean A00(byte b2) {
        return b2 == 3 || b2 == 28 || b2 == 62 || b2 == 43;
    }

    public static boolean A01(C14710pd r2, C16740tZ r3) {
        if (r3 instanceof C38711rI) {
            C42591y4 A12 = ((C16730tY) r3).A12();
            AnonymousClass00B.A06(A12);
            C16750ta r0 = A12.A04.A02;
            AnonymousClass00B.A06(r0);
            return r0.A0M && (C41971wz.A0B(r2.A06(C16620tM.A02, 2917)) ^ true);
        }
    }

    public static boolean A02(C14710pd r5, C38731rK r6) {
        C16750ta r4 = r6.A02;
        A01(r5, r6);
        boolean z2 = r6.A11.A02;
        if (r4 == null || !A01(r5, r6)) {
            return false;
        }
        return (!z2 || A03(r6)) && !r4.A0P && r4.A07 == 0;
    }

    public static boolean A03(C38731rK r3) {
        C16750ta r2 = r3.A02;
        return A00(r3.A10) && r2 != null && r3.A11.A02 && r3.A10(1) && !r2.A0P && r3.A08 != null;
    }
}
