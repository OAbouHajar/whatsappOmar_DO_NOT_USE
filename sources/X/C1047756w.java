package X;

import java.util.Comparator;

/* renamed from: X.56w  reason: invalid class name and case insensitive filesystem */
public class C1047756w implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C84394Kj r6 = (C84394Kj) obj;
        C84394Kj r7 = (C84394Kj) obj2;
        C39461sW r4 = r6.A00;
        int i2 = r4.A00;
        C39461sW r2 = r7.A00;
        int i3 = r2.A00;
        if (i2 == 3) {
            if (i2 != i3) {
                return -1;
            }
        } else if (i3 == 3 && i2 != i3) {
            return 1;
        }
        boolean z2 = r6.A02;
        boolean z3 = r7.A02;
        if (z2) {
            if (!z3) {
                return -1;
            }
        } else if (z3) {
            return 1;
        }
        return r4.A03.compareTo(r2.A03);
    }
}
