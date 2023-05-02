package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5CR  reason: invalid class name */
public final class AnonymousClass5CR<K, V> extends LinkedHashMap<K, V> {
    public static final AnonymousClass5CR A00;
    public boolean zza = true;

    static {
        AnonymousClass5CR r1 = new AnonymousClass5CR();
        A00 = r1;
        r1.zza = false;
    }

    public AnonymousClass5CR() {
    }

    public AnonymousClass5CR(Map map) {
        super(map);
    }

    public final void clear() {
        if (this.zza) {
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
        int i2;
        int i3;
        Iterator A0j = C13690nt.A0j(this);
        int i4 = 0;
        while (A0j.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0j);
            Object key = A0z.getKey();
            if (key instanceof byte[]) {
                i2 = r2;
                for (byte b2 : (byte[]) key) {
                    i2 = (i2 * 31) + b2;
                }
                if (i2 == 0) {
                    i2 = 1;
                }
            } else {
                i2 = key.hashCode();
            }
            Object value = A0z.getValue();
            if (value instanceof byte[]) {
                i3 = r3;
                for (byte b3 : (byte[]) value) {
                    i3 = (i3 * 31) + b3;
                }
                if (i3 == 0) {
                    i3 = 1;
                }
            } else {
                i3 = value.hashCode();
            }
            i4 += i3 ^ i2;
        }
        return i4;
    }

    public final Object put(Object obj, Object obj2) {
        if (this.zza) {
            return super.put(obj, obj2);
        }
        throw C13680ns.A0m();
    }

    public final void putAll(Map map) {
        if (this.zza) {
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
        if (this.zza) {
            return super.remove(obj);
        }
        throw C13680ns.A0m();
    }
}
