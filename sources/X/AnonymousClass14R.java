package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.14R  reason: invalid class name */
public abstract class AnonymousClass14R {
    public Map A00;

    public final Object A00(Object obj) {
        Map map = this.A00;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return A01(this.A00, obj);
    }

    public Object A01(Map map, Object obj) {
        if (this instanceof AnonymousClass1AV) {
            C18450wi.A0H(map, 0);
            Iterator it = map.values().iterator();
            return Integer.valueOf(it.hasNext() ? ((C32121fg) it.next()).A01 : 1);
        } else if (this instanceof C23001Ac) {
            C18450wi.A0H(map, 0);
            Iterator it2 = map.values().iterator();
            return Integer.valueOf(it2.hasNext() ? ((C32121fg) it2.next()).A01 : 1);
        } else if (this instanceof C50332Zb) {
            C18450wi.A0H(map, 0);
            Iterator it3 = map.values().iterator();
            return Integer.valueOf(it3.hasNext() ? ((C32121fg) it3.next()).A01 : 1);
        } else if (this instanceof AnonymousClass1JU) {
            return null;
        } else {
            if (this instanceof AnonymousClass1I6) {
                int i2 = 4;
                if (!map.containsKey(2498024)) {
                    i2 = 3;
                    if (!map.containsKey(2498023)) {
                        if (!map.containsKey(2498022)) {
                            return null;
                        }
                        i2 = 2;
                    }
                }
                return Integer.valueOf(i2);
            } else if (this instanceof AnonymousClass1JS) {
                return null;
            } else {
                if (this instanceof C27501Rz) {
                    return "Unable to fetch configuration.";
                }
                if (!(this instanceof AnonymousClass14Q)) {
                    return this instanceof C26731Ox ? null : null;
                }
                AnonymousClass14Q r3 = (AnonymousClass14Q) this;
                C18450wi.A0H(map, 0);
                if (!(!map.isEmpty())) {
                    return new C77823we();
                }
                int size = map.size();
                Collection<C32121fg> values = map.values();
                if (size <= 1) {
                    return new C77843wg(r3.A02(((C32121fg) C003101j.A01(values)).A01));
                }
                ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(values, 10));
                for (C32121fg r0 : values) {
                    arrayList.add(r3.A02(r0.A01));
                }
                return new C77853wh(arrayList);
            }
        }
    }
}
