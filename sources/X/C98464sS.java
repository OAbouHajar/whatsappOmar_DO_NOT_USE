package X;

import java.util.AbstractMap;

/* renamed from: X.4sS  reason: invalid class name and case insensitive filesystem */
public final class C98464sS implements AnonymousClass5O7 {
    public final Object Aio(Object obj, Object obj2) {
        AnonymousClass5CR r0;
        AnonymousClass5CR r3 = (AnonymousClass5CR) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!r3.zza) {
                if (!r3.isEmpty()) {
                    r0 = new AnonymousClass5CR(r3);
                }
                r3 = r0;
            }
            if (!r3.zza) {
                throw C13680ns.A0m();
            } else if (!abstractMap.isEmpty()) {
                r3.putAll(abstractMap);
            }
        }
        return r3;
    }
}
