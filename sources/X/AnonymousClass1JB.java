package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1JB  reason: invalid class name */
public class AnonymousClass1JB {
    public static final List A0U() {
        return new C52182dH((C52182dH) null, (C52182dH) null, new Object[10], 0, 0, false);
    }

    public static final List A0V(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C18450wi.A0B(singletonList);
        return singletonList;
    }

    public static final void A0W(List list) {
        C52182dH r1 = (C52182dH) list;
        if (r1.backing == null) {
            r1.A04();
            r1.isReadOnly = true;
            return;
        }
        throw new IllegalStateException();
    }
}
