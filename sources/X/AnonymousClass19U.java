package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.19U  reason: invalid class name */
public class AnonymousClass19U {
    public final Map A00 = new HashMap();
    public final Set A01 = new LinkedHashSet();

    public C31721ev A00(C28861Yb r3) {
        C31721ev r0;
        Map map = this.A00;
        synchronized (map) {
            this.A01.remove(r3);
            r0 = (C31721ev) map.get(r3);
        }
        return r0;
    }

    public Set A01(List list) {
        HashSet hashSet = new HashSet(list.size());
        Map map = this.A00;
        synchronized (map) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C28861Yb r1 = (C28861Yb) it.next();
                C31721ev r0 = (C31721ev) map.get(r1);
                if (r0 != null && r0.A00) {
                    hashSet.add(r1);
                }
            }
        }
        return hashSet;
    }

    public Set A02(List list) {
        HashSet hashSet = new HashSet(list.size());
        Map map = this.A00;
        synchronized (map) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C28861Yb r1 = (C28861Yb) it.next();
                if (!map.containsKey(r1)) {
                    hashSet.add(r1);
                }
            }
        }
        return hashSet;
    }

    public void A03(C31721ev r7, C28861Yb r8) {
        Map map = this.A00;
        synchronized (map) {
            if (map.size() > 1000) {
                Set set = this.A01;
                int min = Math.min(map.size() - 1000, set.size());
                if (min > 0) {
                    StringBuilder sb = new StringBuilder("SessionCache/trimming session cache by removing ");
                    sb.append(min);
                    sb.append(" from last ");
                    sb.append(set.size());
                    sb.append(" updated entries");
                    Log.i(sb.toString());
                }
                Iterator it = set.iterator();
                while (it.hasNext() && map.size() > 1000) {
                    map.remove(it.next());
                    it.remove();
                }
            }
            if (map.containsKey(r8)) {
                this.A01.add(r8);
            }
            map.put(r8, r7);
        }
    }

    public void A04(Collection collection) {
        Map map = this.A00;
        synchronized (map) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C28861Yb r1 = (C28861Yb) it.next();
                if (!map.containsKey(r1)) {
                    map.put(r1, new C31721ev());
                }
            }
        }
    }
}
