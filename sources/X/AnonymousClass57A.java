package X;

import java.util.Comparator;

/* renamed from: X.57A  reason: invalid class name */
public class AnonymousClass57A implements Comparator {
    public final C15810rt A00;

    public AnonymousClass57A(C15810rt r1) {
        this.A00 = r1;
    }

    /* renamed from: A00 */
    public int compare(C39461sW r8, C39461sW r9) {
        int i2 = r8.A00;
        int i3 = r9.A00;
        if (i2 != 3 || i2 == i3) {
            if (i3 == 3 && i2 != i3) {
                return 1;
            }
            C15810rt r1 = this.A00;
            long A05 = r1.A05(r8.A02);
            long A052 = r1.A05(r9.A02);
            if (A05 == A052) {
                return r8.A03.compareTo(r9.A03);
            }
            if (A05 < A052) {
                return 1;
            }
        }
        return -1;
    }
}
