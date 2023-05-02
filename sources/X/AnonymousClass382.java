package X;

import java.util.List;

/* renamed from: X.382  reason: invalid class name */
public class AnonymousClass382 {
    public static C31201dg A00(AnonymousClass5RK r11, C31201dg r12) {
        C31201dg A51 = r11.A51(r12);
        boolean A1V = AnonymousClass000.A1V(A51.A02.get(135));
        int[] A01 = C90154da.A00().A06().A01(A51);
        for (int i2 = 0; i2 < A01.length; i2++) {
            C31201dg A0G = A51.A0G(A01[i2]);
            if (A0G != null) {
                C31201dg A00 = A00(r11, A0G);
                if (A00 != A0G) {
                    if (A51 == r12) {
                        A51 = new C31201dg(r12, (C31201dg) null, r12.A05, r12.A00);
                    }
                    A51.A02.put(A01[i2], A00);
                }
                A1V |= A00.A0P(148, true);
            }
        }
        int[] A002 = C90154da.A00().A06().A00(A51);
        for (int i3 = 0; i3 < A002.length; i3++) {
            List A0M = A51.A0M(A002[i3]);
            List list = A0M;
            for (int i4 = 0; i4 < A0M.size(); i4++) {
                C31201dg A0Q = C13690nt.A0Q(A0M, i4);
                if (A0Q != null) {
                    C31201dg A003 = A00(r11, A0Q);
                    if (A003 != A0Q) {
                        if (list == A0M) {
                            list = C13680ns.A0n(A0M);
                        }
                        list.set(i4, A003);
                    }
                    A1V |= A003.A0P(148, true);
                }
            }
            if (list != A0M) {
                if (A51 == r12) {
                    A51 = new C31201dg(r12, (C31201dg) null, r12.A05, r12.A00);
                }
                A51.A02.put(A002[i3], list);
            }
        }
        if (A51 != r12) {
            A51.A02.put(148, Boolean.valueOf(A1V));
        }
        r11.AZQ(A51);
        return A51;
    }
}
