package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.18D  reason: invalid class name */
public class AnonymousClass18D {
    public final Map A00 = new HashMap();

    public synchronized void A00(int i2, int i3, int i4) {
        Map map = (Map) this.A00.get(Integer.valueOf(i2));
        if (map != null) {
            Integer valueOf = Integer.valueOf(i3);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, Integer.valueOf(i4));
            }
        }
    }
}
