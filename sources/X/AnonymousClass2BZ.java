package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.2BZ  reason: invalid class name */
public class AnonymousClass2BZ implements Comparator {
    public final C16040sK A00;
    public final C16080sP A01;
    public final Collator A02;
    public final boolean A03;

    public AnonymousClass2BZ(C16040sK r3, C16080sP r4, boolean z2) {
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = z2;
        Collator instance = Collator.getInstance(AnonymousClass013.A00(r4.A07.A00));
        instance.setDecomposition(1);
        this.A02 = instance;
    }

    /* renamed from: A00 */
    public int compare(C16010sH r7, C16010sH r8) {
        char c2;
        char c3;
        C16040sK r2 = this.A00;
        boolean A0I = r2.A0I(r7.A0E);
        if (A0I == r2.A0I(r8.A0E)) {
            C16080sP r3 = this.A01;
            if (r3.A0S(r7, 1)) {
                c2 = 2;
            } else {
                c2 = 0;
                if (C16080sP.A02(r7)) {
                    c2 = 1;
                }
            }
            if (r3.A0S(r8, 1)) {
                c3 = 2;
            } else {
                c3 = 0;
                if (C16080sP.A02(r8)) {
                    c3 = 1;
                }
            }
            if (c2 == c3) {
                Collator collator = this.A02;
                boolean z2 = this.A03;
                return collator.compare(r3.A0H(r7, z2), r3.A0H(r8, z2));
            } else if (c2 < c3) {
                return -1;
            }
        } else if (A0I) {
            return -1;
        }
        return 1;
    }
}
