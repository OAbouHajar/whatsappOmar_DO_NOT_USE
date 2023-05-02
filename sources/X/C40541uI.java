package X;

/* renamed from: X.1uI  reason: invalid class name and case insensitive filesystem */
public class C40541uI {
    public static boolean A00(C14710pd r4, C16740tZ r5) {
        if (!(r5 instanceof C38681rF)) {
            return false;
        }
        C16730tY r2 = (C16730tY) r5;
        if (!C16030sJ.A0Q(r5.A11.A00) || !r4.A0E(C16620tM.A02, 252)) {
            return false;
        }
        C42591y4 A12 = r2.A12();
        AnonymousClass00B.A06(A12);
        C16750ta r0 = A12.A04.A02;
        AnonymousClass00B.A06(r0);
        return r0.A0M;
    }

    public static boolean A01(C14710pd r2, C16740tZ r3) {
        int i2;
        if (r3 instanceof C38631rA) {
            i2 = 253;
        } else if ((!(r3 instanceof C38681rF) && !(r3 instanceof C38721rJ)) || !C16030sJ.A0Q(r3.A11.A00)) {
            return true;
        } else {
            i2 = 252;
        }
        return !r2.A0E(C16620tM.A02, i2);
    }

    public static boolean A02(C14710pd r3, C16740tZ r4, boolean z2) {
        if (r4 instanceof C16730tY) {
            if ((r4 instanceof C38631rA) && r3.A0E(C16620tM.A02, 247)) {
                return true;
            }
            if (!r3.A0E(C16620tM.A02, 246) || (!(r4 instanceof C38731rK) && !(r4 instanceof C38681rF))) {
                return false;
            }
            return z2;
        }
        return false;
    }

    public static boolean A03(C16740tZ r2) {
        C42591y4 A12;
        if (!(r2 instanceof C38681rF) || (A12 = ((C16730tY) r2).A12()) == null) {
            return false;
        }
        C16750ta r0 = A12.A04.A02;
        AnonymousClass00B.A06(r0);
        return r0.A0M;
    }
}
