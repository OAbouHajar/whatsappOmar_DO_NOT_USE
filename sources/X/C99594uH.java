package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4uH  reason: invalid class name and case insensitive filesystem */
public class C99594uH implements AnonymousClass5OS {
    public Object AIZ(AnonymousClass552 r6, C89314bx r7, Object obj, String str, List list) {
        C109755Tl r4 = r7.A01.A00;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C90454eA r2 = (C90454eA) it.next();
                if (obj instanceof List) {
                    r4.AdY(obj, r4.AK7(obj), r2.A01.get());
                }
            }
        }
        return obj;
    }
}
