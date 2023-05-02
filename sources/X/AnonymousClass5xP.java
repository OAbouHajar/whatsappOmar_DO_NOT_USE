package X;

/* renamed from: X.5xP  reason: invalid class name */
public class AnonymousClass5xP {
    public static AnonymousClass2St A00(C16440t3 r7, C28401Vy r8, C53322fW r9, String str, boolean z2) {
        AnonymousClass2St[] r0;
        C53302fU r5;
        int A00;
        if (r9 == null || (r5 = r9.A01) == null || (A00 = r9.A00(C110105dW.A03(r7))) == 0 || A00 == 3) {
            r0 = new AnonymousClass2St[0];
        } else {
            C112525id r4 = new C112525id();
            r4.A02("is_ended_early", AnonymousClass000.A1R(A00, 4));
            if (z2) {
                r4.A02("is_sender_receiver_eligible", AnonymousClass000.A1P(r9.A00));
            }
            C28401Vy r02 = r5.A09.A00.A02;
            if (r8 != null) {
                boolean z3 = false;
                if (r8.A00.compareTo(r02.A00) < 0) {
                    z3 = true;
                }
                r4.A02("is_amount_low", z3);
            }
            r0 = new AnonymousClass2St[]{r4};
        }
        AnonymousClass2St r1 = new AnonymousClass2St(r0);
        if (str != null) {
            r1.A01("section", str);
        }
        if (r1.A01.length() > 0) {
            return r1;
        }
        return null;
    }

    public static void A01(AnonymousClass2St r2, C1222969a r3, Integer num, String str, String str2, int i2) {
        C1222969a r1 = r3;
        AnonymousClass00B.A06(r3);
        if (r2 != null) {
            r1.AKU(r2, Integer.valueOf(i2), num, str, str2);
        } else {
            r3.AKS(Integer.valueOf(i2), num, str, str2);
        }
    }

    public static void A02(AnonymousClass2St r6, C1222969a r7, String str, String str2) {
        A01(r6, r7, (Integer) null, str, str2, 0);
    }
}
