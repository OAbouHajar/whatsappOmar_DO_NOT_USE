package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4TM  reason: invalid class name */
public class AnonymousClass4TM {
    public final List A00 = AnonymousClass000.A0u();
    public final Map A01 = AnonymousClass000.A0x();

    public final AnonymousClass22B A00(C14910pz r6, Object obj, String str, String str2) {
        C84294Jz r3;
        List list = this.A00;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                r3 = new C84294Jz(r6);
                list.add(r3);
                break;
            }
            r3 = (C84294Jz) it.next();
            Object obj2 = r3.A01.get();
            if (r3.A00.A00 || obj2 == null) {
                it.remove();
            } else if (obj2 == r6) {
                break;
            }
        }
        Map map = r3.A02;
        Set set = (Set) map.get(str);
        HashSet hashSet = set;
        if (set == null) {
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(str2);
            map.put(str, hashSet2);
            hashSet = hashSet2;
        }
        hashSet.add(str2);
        return new AnonymousClass22B(r3.A00, obj);
    }

    public synchronized void A01(String str, Object obj) {
        Map map;
        if (obj == null) {
            map = this.A01;
            if (!map.containsKey(str)) {
            }
        } else {
            map = this.A01;
            if (obj.equals(map.get(str))) {
            }
        }
        map.put(str, obj);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C84294Jz r1 = (C84294Jz) it.next();
            C14910pz r2 = (C14910pz) r1.A01.get();
            if (r1.A00.A00 || r2 == null) {
                it.remove();
            } else {
                Set set = (Set) r1.A02.get(str);
                if (set != null) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        r2.A07(AnonymousClass000.A0m(it2), obj);
                    }
                }
            }
        }
    }
}
