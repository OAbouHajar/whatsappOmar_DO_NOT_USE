package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4uJ  reason: invalid class name and case insensitive filesystem */
public class C99614uJ implements AnonymousClass5OS {
    public Object AIZ(AnonymousClass552 r5, C89314bx r6, Object obj, String str, List list) {
        StringBuilder A0o = AnonymousClass000.A0o();
        C109755Tl r1 = r6.A01.A00;
        if (obj instanceof List) {
            for (Object next : r1.Ago(obj)) {
                if (next instanceof String) {
                    AnonymousClass000.A1I(next, A0o);
                }
            }
        }
        if (list != null) {
            Iterator it = C90454eA.A00(r6, String.class, list).iterator();
            while (it.hasNext()) {
                A0o.append(AnonymousClass000.A0m(it));
            }
        }
        return A0o.toString();
    }
}
