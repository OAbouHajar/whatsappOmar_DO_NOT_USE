package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5rF  reason: invalid class name and case insensitive filesystem */
public class C116355rF {
    public final Map A00 = new AnonymousClass00N();

    public C116355rF(Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            Object key = A0z.getKey();
            Object value = A0z.getValue();
            AnonymousClass00B.A06(key);
            for (Object put : (Set) key) {
                this.A00.put(put, value);
            }
        }
    }
}
