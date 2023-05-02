package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1F9  reason: invalid class name */
public class AnonymousClass1F9 extends AnonymousClass1FA {
    public static final Set A00() {
        return C23851Dp.A00;
    }

    public static final Set A01(Set set) {
        int size = set.size();
        if (size == 0) {
            return C23851Dp.A00;
        }
        if (size != 1) {
            return set;
        }
        Set singleton = Collections.singleton(set.iterator().next());
        C18450wi.A0B(singleton);
        return singleton;
    }

    public static final Set A02(Object... objArr) {
        int length = objArr.length;
        LinkedHashSet linkedHashSet = new LinkedHashSet(C25421Js.A07(length));
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static final Set A03(Object... objArr) {
        int length = objArr.length;
        if (length <= 0) {
            return C23851Dp.A00;
        }
        int i2 = 0;
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(C25421Js.A07(length));
            do {
                Object obj = objArr[i2];
                i2++;
                linkedHashSet.add(obj);
            } while (i2 < length);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        C18450wi.A0B(singleton);
        return singleton;
    }
}
