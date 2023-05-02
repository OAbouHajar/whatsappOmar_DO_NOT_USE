package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.2dh  reason: invalid class name and case insensitive filesystem */
public class C52372dh {
    public final Map A00 = new HashMap();
    public final Map A01 = new WeakHashMap();

    public synchronized void A00(C52412dl r4, Class cls, Object obj) {
        synchronized (this) {
            Map map = this.A00;
            Map map2 = (Map) map.get(cls);
            if (map2 == null) {
                map2 = new WeakHashMap();
                map.put(cls, map2);
            }
            map2.put(obj, r4);
            Map map3 = this.A01;
            Set set = (Set) map3.get(obj);
            if (set == null) {
                set = new HashSet();
                map3.put(obj, set);
            }
            set.add(cls);
        }
    }

    public synchronized void A01(C52392dj r4) {
        String.format("UIObserver.fire: %s", new Object[]{r4});
        Map map = (Map) this.A00.get(r4.getClass());
        if (map != null) {
            for (Object obj : map.keySet()) {
                C52412dl r0 = (C52412dl) map.get(obj);
                if (r0 != null) {
                    r0.AQk(r4);
                }
            }
        }
    }

    public synchronized void A02(Class cls, Object obj) {
        Map map = (Map) this.A00.get(cls);
        if (map != null) {
            map.remove(obj);
        }
        Set set = (Set) this.A01.get(obj);
        if (set != null) {
            set.remove(cls);
        }
    }

    public synchronized void A03(Object obj) {
        Set set = (Set) this.A01.get(obj);
        if (set != null) {
            Iterator it = new HashSet(set).iterator();
            while (it.hasNext()) {
                A02((Class) it.next(), obj);
            }
        }
    }
}
