package X;

import java.util.Map;

/* renamed from: X.45f  reason: invalid class name and case insensitive filesystem */
public class C807245f {
    public static Object A00(C14970q5 r2, Map map) {
        if (!map.containsKey("initial_lispy")) {
            return map.get("initial");
        }
        try {
            return C807345g.A00(C14950q3.A01, C87574Xm.A01(C13690nt.A0e("initial_lispy", map)), r2);
        } catch (AnonymousClass43P e2) {
            C29691b2.A01("StateModule", "Exception gettin initial_lispy value", e2);
            return null;
        }
    }
}
