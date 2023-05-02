package X;

import java.util.Comparator;

/* renamed from: X.574  reason: invalid class name */
public final /* synthetic */ class AnonymousClass574 implements Comparator {
    public final /* synthetic */ boolean A00;

    public /* synthetic */ AnonymousClass574(boolean z2) {
        this.A00 = z2;
    }

    public final int compare(Object obj, Object obj2) {
        boolean z2 = this.A00;
        C30991dI r6 = (C30991dI) obj;
        C30991dI r7 = (C30991dI) obj2;
        if (r6.A0B()) {
            return -1;
        }
        if (r7.A0B()) {
            return 1;
        }
        if (z2) {
            if (C16030sJ.A0P(r6.A0B)) {
                return -1;
            }
            if (C16030sJ.A0P(r7.A0B)) {
                return 1;
            }
        }
        return -(r6.A04() > r7.A04() ? 1 : (r6.A04() == r7.A04() ? 0 : -1));
    }
}
