package X;

import java.util.Map;

/* renamed from: X.4Ql  reason: invalid class name and case insensitive filesystem */
public class C85904Ql {
    public final Map A00 = AnonymousClass000.A0x();
    public final Map A01 = AnonymousClass000.A0x();

    public void A00(Object obj, Object obj2) {
        Map map = this.A01;
        if (map.containsKey(obj2) && !C34901l3.A00(map.get(obj2), obj)) {
            map.put(obj2, obj);
            Object obj3 = this.A00.get(obj2);
            AnonymousClass00B.A06(obj3);
            ((AnonymousClass023) obj3).AOH(obj);
        }
    }
}
