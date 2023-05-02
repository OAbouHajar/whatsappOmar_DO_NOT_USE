package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2VZ  reason: invalid class name */
public class AnonymousClass2VZ {
    public final Map A00 = new HashMap();
    public volatile Class A01;

    public AnonymousClass2VZ(List list) {
        for (Object next : list) {
            if (next != null) {
                Map map = this.A00;
                Class<?> cls = next.getClass();
                if (!map.containsKey(cls)) {
                    this.A00.put(cls, next);
                }
            }
            StringBuilder sb = new StringBuilder("Invalid banner ");
            sb.append(next);
            throw new RuntimeException(sb.toString());
        }
    }
}
