package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.47r  reason: invalid class name and case insensitive filesystem */
public final class C813147r {
    public static final void A00(Map map) {
        C18450wi.A0H(map, 0);
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Object value = AnonymousClass000.A0z(A0y).getValue();
            if (value != null && (value instanceof Map)) {
                Map map2 = (Map) value;
                if (!map2.isEmpty()) {
                    A00(C90284dt.A00(value));
                    if (!map2.isEmpty()) {
                    }
                }
                A0y.remove();
            }
        }
    }
}
