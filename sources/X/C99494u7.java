package X;

import java.util.Iterator;

/* renamed from: X.4u7  reason: invalid class name and case insensitive filesystem */
public class C99494u7 implements AnonymousClass5OR {
    public boolean A8k(C89494cI r7, C89494cI r8, C84634Lh r9) {
        if (r8 instanceof C70163gD) {
            r8 = C70163gD.A00(r8);
            if (r8 instanceof C70093g6) {
                return false;
            }
        }
        C70183gF A06 = r8.A06();
        if (r7 instanceof C70163gD) {
            r7 = C70163gD.A00(r7);
            if (r7 instanceof C70093g6) {
                return false;
            }
        }
        Iterator it = r7.A06().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Iterator it2 = A06.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (next.equals(it2.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
