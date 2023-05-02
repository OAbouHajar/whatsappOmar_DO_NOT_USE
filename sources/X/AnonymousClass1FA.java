package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.1FA  reason: invalid class name */
public class AnonymousClass1FA {
    public static final Set A04() {
        return new C106105Cn();
    }

    public static final Set A05(Object obj) {
        Set singleton = Collections.singleton(obj);
        C18450wi.A0B(singleton);
        return singleton;
    }

    public static final void A06(Set set) {
        AnonymousClass28m r1 = ((C106105Cn) set).backing;
        r1.A02();
        r1.isReadOnly = true;
    }
}
