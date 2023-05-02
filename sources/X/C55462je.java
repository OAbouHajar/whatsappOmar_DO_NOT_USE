package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2je  reason: invalid class name and case insensitive filesystem */
public class C55462je extends C16690tT {
    public final AnonymousClass025 A00;
    public final C17230uk A01;
    public final AnonymousClass119 A02;
    public final Set A03;

    public C55462je(AnonymousClass025 r2, C001300o r3, C17230uk r4, AnonymousClass119 r5, Set set) {
        super(r3, true);
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = set;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2;
        C16050sL A022;
        Set set = this.A03;
        C16050sL r3 = null;
        if (set.size() == 1) {
            C16050sL r6 = (C16050sL) set.toArray()[0];
            i2 = this.A02.A00(r6);
            C17230uk r5 = this.A01;
            C15810rt r4 = r5.A06;
            if ((r4.A02(r6) == 2 || r4.A02(r6) == 3) && (A022 = r5.A02(r6)) != null && r5.A03.A00(A022).size() == 1) {
                r3 = A022;
            }
        } else {
            i2 = 0;
            Iterator it = this.A02.A01().iterator();
            while (it.hasNext()) {
                if (set.contains(((C16740tZ) it.next()).A11.A00)) {
                    i2++;
                }
            }
        }
        return new C56062kt(r3, i2);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        this.A00.apply(obj);
    }
}
