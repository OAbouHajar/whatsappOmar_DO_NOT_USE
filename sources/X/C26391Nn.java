package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.1Nn  reason: invalid class name and case insensitive filesystem */
public final class C26391Nn implements C18540wr {
    public final AnonymousClass1CX A00;

    public C26391Nn(AnonymousClass1CX r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public void AUu(C75983t2 r8) {
        int i2;
        C18450wi.A0H(r8, 0);
        AnonymousClass1CX r1 = this.A00;
        List A08 = r1.A08();
        List<C37771pi> A0A = r1.A0A((C38381qh) null);
        int i3 = 0;
        List<C34151jm> A09 = r1.A09(0);
        r8.A0p = Long.valueOf((long) A08.size());
        if (!(A0A instanceof Collection) || !A0A.isEmpty()) {
            i2 = 0;
            for (C37771pi r0 : A0A) {
                if (r0.A0P && (i2 = i2 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        } else {
            i2 = 0;
        }
        r8.A0o = Long.valueOf((long) i2);
        r8.A0q = Long.valueOf(((long) A08.size()) + ((long) A0A.size()));
        if (!(A09 instanceof Collection) || !A09.isEmpty()) {
            for (C34151jm r02 : A09) {
                AnonymousClass1XO r03 = r02.A04;
                if (r03 != null && r03.A07 && (i3 = i3 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        r8.A0k = Long.valueOf((long) i3);
        r8.A0l = Long.valueOf((long) A09.size());
    }
}
