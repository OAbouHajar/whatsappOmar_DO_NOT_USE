package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.5uR  reason: invalid class name and case insensitive filesystem */
public class C118285uR {
    public final AnonymousClass14M A00;
    public final C116895s7 A01;
    public final Map A02 = new AnonymousClass00N();
    public final Map A03 = new AnonymousClass00N();

    public C118285uR(AnonymousClass14M r6, C116895s7 r7, Map map, Map map2) {
        this.A00 = r6;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            Object key = A0z.getKey();
            Object value = A0z.getValue();
            AnonymousClass00B.A06(key);
            for (Object put : (Set) key) {
                this.A02.put(put, value);
            }
        }
        Iterator A0y2 = AnonymousClass000.A0y(map2);
        while (A0y2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass000.A0z(A0y2);
            Object key2 = A0z2.getKey();
            Object value2 = A0z2.getValue();
            AnonymousClass00B.A06(key2);
            for (Object put2 : (Set) key2) {
                this.A03.put(put2, value2);
            }
        }
        this.A01 = r7;
    }

    public final C116895s7 A00(String str) {
        Object value;
        Map map = this.A02;
        if (map.containsKey(str)) {
            value = map.get(str);
        } else {
            Iterator A0y = AnonymousClass000.A0y(this.A03);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                if (((Pattern) A0z.getKey()).matcher(str).matches()) {
                    value = A0z.getValue();
                }
            }
            return this.A01;
        }
        return (C116895s7) value;
    }
}
