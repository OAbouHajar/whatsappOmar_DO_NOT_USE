package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Rl  reason: invalid class name */
public final class AnonymousClass0Rl {
    public final Object A00 = new Object();
    public final Map A01 = new LinkedHashMap();

    public final AnonymousClass0NV A00(AnonymousClass0R5 r3) {
        AnonymousClass0NV r0;
        C18450wi.A0H(r3, 0);
        synchronized (this.A00) {
            r0 = (AnonymousClass0NV) this.A01.remove(r3);
        }
        return r0;
    }

    public final AnonymousClass0NV A01(AnonymousClass0R5 r4) {
        AnonymousClass0NV r0;
        synchronized (this.A00) {
            Map map = this.A01;
            Object obj = map.get(r4);
            if (obj == null) {
                obj = new AnonymousClass0NV(r4);
                map.put(r4, obj);
            }
            r0 = (AnonymousClass0NV) obj;
        }
        return r0;
    }

    public final List A02(String str) {
        List A0A;
        C18450wi.A0H(str, 0);
        synchronized (this.A00) {
            Map map = this.A01;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                if (C18450wi.A0R(((AnonymousClass0R5) A0z.getKey()).A01, str)) {
                    linkedHashMap.put(A0z.getKey(), A0z.getValue());
                }
            }
            for (AnonymousClass0R5 remove : linkedHashMap.keySet()) {
                map.remove(remove);
            }
            A0A = C003101j.A0A(linkedHashMap.values());
        }
        return A0A;
    }

    public final boolean A03(AnonymousClass0R5 r3) {
        boolean containsKey;
        synchronized (this.A00) {
            containsKey = this.A01.containsKey(r3);
        }
        return containsKey;
    }
}
