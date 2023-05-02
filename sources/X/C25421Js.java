package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.1Js  reason: invalid class name and case insensitive filesystem */
public class C25421Js extends C25431Jt {
    public static final int A07(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map A08() {
        return new AnonymousClass28m(8);
    }

    public static final Map A09(C25401Jq r2) {
        C18450wi.A0H(r2, 0);
        Map singletonMap = Collections.singletonMap(r2.first, r2.second);
        C18450wi.A0B(singletonMap);
        return singletonMap;
    }

    public static final void A0A(Map map) {
        AnonymousClass28m r1 = (AnonymousClass28m) map;
        r1.A02();
        r1.isReadOnly = true;
    }
}
