package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1JA  reason: invalid class name */
public class AnonymousClass1JA extends AnonymousClass1JB {
    public static final Collection A0O(Object[] objArr) {
        return new C52172dG(objArr, false);
    }

    public static final List A0P() {
        return C440222l.A00;
    }

    public static final List A0Q(List list) {
        C18450wi.A0H(list, 0);
        int size = list.size();
        if (size == 0) {
            return C440222l.A00;
        }
        if (size != 1) {
            return list;
        }
        List singletonList = Collections.singletonList(list.get(0));
        C18450wi.A0B(singletonList);
        return singletonList;
    }

    public static final List A0R(Object... objArr) {
        return objArr.length > 0 ? AnonymousClass080.A00(objArr) : C440222l.A00;
    }

    public static final List A0S(Object... objArr) {
        C18450wi.A0H(objArr, 0);
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C52172dG(objArr, true));
    }

    public static final void A0T() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
