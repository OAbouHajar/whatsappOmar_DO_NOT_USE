package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4a7  reason: invalid class name and case insensitive filesystem */
public class C88204a7 {
    public AnonymousClass260 A00;
    public List A01 = AnonymousClass000.A0u();
    public final C25591Kj A02;
    public final List A03 = AnonymousClass000.A0u();

    public C88204a7(C25601Kk r2) {
        this.A02 = r2.A00;
    }

    public static final List A00(List list, Map map) {
        C87014Va r0;
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1US r2 = (AnonymousClass1US) it.next();
            if (!(r2.A01 == 1 || (r0 = (C87014Va) map.get(r2.A0B)) == null)) {
                r2 = r2.A01(r0.A01);
            }
            A0u.add(r2);
        }
        return A0u;
    }
}
