package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1zF  reason: invalid class name and case insensitive filesystem */
public class C43041zF {
    public static int A00(Object obj, Object[] objArr) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (objArr[i2].equals(obj)) {
                return i2;
            }
        }
        return -1;
    }

    public static Map A01(AnonymousClass025 r5, List list) {
        HashMap hashMap = new HashMap();
        for (Object next : list) {
            Object apply = r5.apply(next);
            Object obj = hashMap.get(apply);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(apply, obj);
            }
            ((List) obj).add(next);
        }
        return hashMap;
    }

    public static void A02(AnonymousClass03O r2, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (r2.test(it.next())) {
                it.remove();
            }
        }
    }

    public static boolean A03(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
            if (obj != null && obj2 != null && obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A04(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }
}
