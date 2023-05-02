package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.1Jr  reason: invalid class name and case insensitive filesystem */
public class C25411Jr extends C25421Js {
    public static final Object A00(Map map, Object obj) {
        C18450wi.A0H(map, 0);
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder("Key ");
        sb.append(obj);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }

    public static final Map A01() {
        return AnonymousClass1Z8.A00;
    }

    public static final Map A02(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C25421Js.A07(collection.size()));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        C25401Jq r0 = (C25401Jq) it.next();
                        linkedHashMap.put(r0.first, r0.second);
                    }
                    return linkedHashMap;
                }
                return C25421Js.A09((C25401Jq) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                C25401Jq r02 = (C25401Jq) it2.next();
                linkedHashMap2.put(r02.first, r02.second);
            }
            int size2 = linkedHashMap2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashMap2;
                }
                Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                C18450wi.A0B(singletonMap);
                return singletonMap;
            }
        }
        return AnonymousClass1Z8.A00;
    }

    public static final Map A03(Map map) {
        int size = map.size();
        if (size == 0) {
            return AnonymousClass1Z8.A00;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C18450wi.A0B(singletonMap);
        return singletonMap;
    }

    public static final Map A04(Map map, C25401Jq r4) {
        if (map.isEmpty()) {
            return C25421Js.A09(r4);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(r4.first, r4.second);
        return linkedHashMap;
    }

    public static final Map A05(C25401Jq... r5) {
        int length = r5.length;
        if (length <= 0) {
            return AnonymousClass1Z8.A00;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C25421Js.A07(length));
        int i2 = 0;
        do {
            C25401Jq r0 = r5[i2];
            i2++;
            linkedHashMap.put(r0.first, r0.second);
        } while (i2 < length);
        return linkedHashMap;
    }

    public static final Map A06(C25401Jq... r5) {
        int length = r5.length;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C25421Js.A07(length));
        int i2 = 0;
        while (i2 < length) {
            C25401Jq r0 = r5[i2];
            i2++;
            linkedHashMap.put(r0.first, r0.second);
        }
        return linkedHashMap;
    }
}
