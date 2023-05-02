package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1MK  reason: invalid class name */
public final class AnonymousClass1MK {
    public static final C34151jm A00(Integer num, String str, List list) {
        Object obj;
        C18450wi.A0H(list, 0);
        boolean z2 = false;
        if (str != null) {
            z2 = true;
        }
        if (z2) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C18450wi.A0R(str, ((C34151jm) obj).A05)) {
                    break;
                }
            }
            C34151jm r2 = (C34151jm) obj;
            if (r2 != null) {
                return r2;
            }
        }
        int size = list.size();
        int intValue = num.intValue();
        if (size > intValue) {
            return (C34151jm) list.get(intValue);
        }
        return null;
    }
}
