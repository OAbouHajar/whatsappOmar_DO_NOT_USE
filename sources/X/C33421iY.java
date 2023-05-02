package X;

import java.util.Collection;

/* renamed from: X.1iY  reason: invalid class name and case insensitive filesystem */
public abstract class C33421iY {
    public void A00() {
    }

    public void A01(Collection collection, boolean z2) {
        C33411iX r0 = (C33411iX) this;
        if (z2) {
            C16000sG r1 = r0.A00;
            r1.A04.A01.clear();
            C17140ub r2 = r1.A07;
            C33251iH r02 = r2.A00;
            if (r02 != null) {
                C16080sP r12 = r02.A00;
                r12.A0C.clear();
                r12.A0D.clear();
                for (C33481ie A06 : r2.A01()) {
                    A06.A06(collection);
                }
                return;
            }
            throw new IllegalStateException("observer not set");
        }
    }
}
