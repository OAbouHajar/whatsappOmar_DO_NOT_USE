package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4PZ  reason: invalid class name */
public final class AnonymousClass4PZ {
    public final C88114Zy A00(String str, Map map) {
        Set set;
        C88114Zy r0;
        C18450wi.A0H(str, 0);
        ArrayList A0u = AnonymousClass000.A0u();
        if (map == null || (set = map.entrySet()) == null) {
            set = C23851Dp.A00;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(it);
            if (A0z.getValue() == null || !(A0z.getValue() instanceof Map)) {
                r0 = new C88114Zy((String) A0z.getKey(), (C88114Zy[]) null);
            } else {
                String str2 = (String) A0z.getKey();
                Object obj = map == null ? null : map.get(A0z.getKey());
                r0 = A00(str2, obj instanceof Map ? (Map) obj : null);
            }
            A0u.add(r0);
        }
        Object[] array = A0u.toArray(new C88114Zy[0]);
        if (array != null) {
            return new C88114Zy(str, (C88114Zy[]) array);
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
