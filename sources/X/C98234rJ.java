package X;

import java.util.AbstractMap;

/* renamed from: X.4rJ  reason: invalid class name and case insensitive filesystem */
public final class C98234rJ implements AnonymousClass5O2 {
    public final Object Aj8(Object obj, Object obj2) {
        AnonymousClass5CQ r0;
        AnonymousClass5CQ r3 = (AnonymousClass5CQ) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!r3.zzfa) {
                if (!r3.isEmpty()) {
                    r0 = new AnonymousClass5CQ(r3);
                }
                r3 = r0;
            }
            if (!r3.zzfa) {
                throw C13680ns.A0m();
            } else if (!abstractMap.isEmpty()) {
                r3.putAll(abstractMap);
            }
        }
        return r3;
    }
}
