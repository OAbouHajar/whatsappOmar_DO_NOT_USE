package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.23d  reason: invalid class name and case insensitive filesystem */
public class C441923d {
    public static List A00(List list, Set set) {
        if (set.size() == 0) {
            return new ArrayList();
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C39631sn r1 = (C39631sn) it.next();
            if (set.contains(r1.A02)) {
                long j2 = r1.A01;
                if (j2 != -1) {
                    hashSet.add(Long.valueOf(j2));
                }
            }
        }
        return new ArrayList(hashSet);
    }
}
