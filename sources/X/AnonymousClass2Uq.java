package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.2Uq  reason: invalid class name */
public class AnonymousClass2Uq implements Comparator {
    public final C16040sK A00;
    public final C16080sP A01;
    public final Collator A02;

    public AnonymousClass2Uq(C16040sK r3, C16080sP r4) {
        this.A00 = r3;
        this.A01 = r4;
        Collator instance = Collator.getInstance(AnonymousClass013.A00(r4.A07.A00));
        instance.setDecomposition(1);
        this.A02 = instance;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        char c2;
        char c3;
        C86954Uu r9 = (C86954Uu) obj;
        C86954Uu r10 = (C86954Uu) obj2;
        C16010sH r6 = r9.A02;
        if (r6 == null) {
            r6 = new C16010sH(r9.A03);
        }
        C16010sH r5 = r10.A02;
        if (r5 == null) {
            r5 = new C16010sH(r10.A03);
        }
        C16040sK r1 = this.A00;
        boolean A0I = r1.A0I(r6.A0E);
        if (A0I == r1.A0I(r5.A0E)) {
            A0I = false;
            if (r9.A01 != 0) {
                A0I = true;
            }
            boolean z2 = false;
            if (r10.A01 != 0) {
                z2 = true;
            }
            if (A0I == z2) {
                C16080sP r3 = this.A01;
                if (r3.A0S(r6, 1)) {
                    c2 = 2;
                } else {
                    c2 = 0;
                    if (C16080sP.A02(r6)) {
                        c2 = 1;
                    }
                }
                if (r3.A0S(r5, 1)) {
                    c3 = 2;
                } else {
                    c3 = 0;
                    if (C16080sP.A02(r5)) {
                        c3 = 1;
                    }
                }
                return c2 == c3 ? this.A02.compare(r3.A0H(r6, false), r3.A0H(r5, false)) : c2 < c3 ? -1 : 1;
            }
        }
        return A0I ? -1 : 1;
    }
}
