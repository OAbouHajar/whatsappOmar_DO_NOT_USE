package X;

import java.util.Comparator;

/* renamed from: X.57B  reason: invalid class name */
public class AnonymousClass57B implements Comparator {
    public final C16000sG A00;
    public final C16080sP A01;

    public AnonymousClass57B(C16000sG r1, C16080sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* renamed from: A00 */
    public int compare(C38581r1 r8, C38581r1 r9) {
        C16000sG r1 = this.A00;
        C16010sH A0A = r1.A0A(r8.A02);
        C16010sH A0A2 = r1.A0A(r9.A02);
        C34751ko r4 = A0A.A0D;
        boolean z2 = false;
        boolean A1V = AnonymousClass000.A1V(r4);
        if (A0A2.A0D != null) {
            z2 = true;
        }
        if (A1V != z2) {
            return r4 != null ? -1 : 1;
        }
        C16080sP r0 = this.A01;
        String A08 = r0.A08(A0A);
        String A082 = r0.A08(A0A2);
        if (A08 == null) {
            return -1;
        }
        if (A082 != null) {
            return A08.compareTo(A082);
        }
        return 1;
    }
}
