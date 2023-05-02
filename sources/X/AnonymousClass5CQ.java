package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5CQ  reason: invalid class name */
public final class AnonymousClass5CQ<K, V> extends LinkedHashMap<K, V> {
    public static final AnonymousClass5CQ A00;
    public boolean zzfa = true;

    static {
        AnonymousClass5CQ r1 = new AnonymousClass5CQ();
        A00 = r1;
        r1.zzfa = false;
    }

    public AnonymousClass5CQ() {
    }

    public AnonymousClass5CQ(Map map) {
        super(map);
    }

    public static int A00(Object obj) {
        if (obj instanceof byte[]) {
            int i2 = r3;
            for (byte b2 : (byte[]) obj) {
                i2 = (i2 * 31) + b2;
            }
            if (i2 == 0) {
                return 1;
            }
            return i2;
        } else if (!(obj instanceof C107865Ls)) {
            return obj.hashCode();
        } else {
            throw C13680ns.A0m();
        }
    }

    public final void clear() {
        if (this.zzfa) {
            super.clear();
            return;
        }
        throw C13680ns.A0m();
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator A0j = C13690nt.A0j(this);
                    while (A0j.hasNext()) {
                        Map.Entry A0z = AnonymousClass000.A0z(A0j);
                        if (map.containsKey(A0z.getKey())) {
                            Object value = A0z.getValue();
                            Object obj2 = map.get(A0z.getKey());
                            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                                equals = value.equals(obj2);
                                continue;
                            } else {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator A0j = C13690nt.A0j(this);
        int i2 = 0;
        while (A0j.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0j);
            i2 += A00(A0z.getValue()) ^ A00(A0z.getKey());
        }
        return i2;
    }

    public final Object put(Object obj, Object obj2) {
        if (this.zzfa) {
            return super.put(obj, obj2);
        }
        throw C13680ns.A0m();
    }

    public final void putAll(Map map) {
        if (this.zzfa) {
            Iterator A0I = C13700nu.A0I(map);
            while (A0I.hasNext()) {
                map.get(A0I.next());
            }
            super.putAll(map);
            return;
        }
        throw C13680ns.A0m();
    }

    public final Object remove(Object obj) {
        if (this.zzfa) {
            return super.remove(obj);
        }
        throw C13680ns.A0m();
    }
}
