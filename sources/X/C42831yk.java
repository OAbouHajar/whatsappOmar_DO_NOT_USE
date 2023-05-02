package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.1yk  reason: invalid class name and case insensitive filesystem */
public final class C42831yk implements C42371xg {
    public Set ADX(C16740tZ r2) {
        if (r2.A0x) {
            return Collections.singleton("s");
        }
        return null;
    }

    public String ADr() {
        return "m";
    }

    public C42401xj ADs(C42391xi r4) {
        if (r4.A08 == null) {
            return null;
        }
        boolean booleanValue = r4.A01().booleanValue();
        C42401xj r1 = new C42401xj();
        Set singleton = Collections.singleton("s");
        if (booleanValue) {
            r1.A00 = singleton;
            return r1;
        }
        r1.A01 = singleton;
        return r1;
    }
}
