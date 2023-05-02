package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.03N  reason: invalid class name */
public class AnonymousClass03N {
    public static String[] A00(Collection collection) {
        String[] strArr = new String[(collection.size() * 3)];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C28861Yb r3 = (C28861Yb) it.next();
            int i3 = i2 * 3;
            strArr[i3] = r3.A02();
            strArr[i3 + 1] = String.valueOf(r3.A01());
            strArr[i3 + 2] = String.valueOf(r3.A00());
            i2++;
        }
        return strArr;
    }
}
