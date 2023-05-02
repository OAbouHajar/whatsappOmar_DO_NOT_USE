package X;

import java.util.Iterator;

/* renamed from: X.4tw  reason: invalid class name and case insensitive filesystem */
public class C99384tw implements AnonymousClass5OR {
    public boolean A8k(C89494cI r6, C89494cI r7, C84634Lh r8) {
        C70183gF A06 = r7.A06();
        if (r6 instanceof C70163gD) {
            C89494cI A00 = C70163gD.A00(r6);
            if (!(A00 instanceof C70183gF)) {
                return true;
            }
            C70183gF A062 = A00.A06();
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                if (!A062.A00.contains(it.next())) {
                }
            }
            return true;
        }
        return false;
    }
}
