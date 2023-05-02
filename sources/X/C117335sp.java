package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5sp  reason: invalid class name and case insensitive filesystem */
public class C117335sp {
    public final int A00;
    public final int A01;
    public final String A02;
    public final Map A03 = new ConcurrentHashMap();

    public C117335sp(String str, Map map, int i2, int i3) {
        this.A00 = i2;
        this.A02 = str;
        this.A01 = i3;
        if (map != null) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                this.A03.put(A0z.getKey(), A0z.getValue());
            }
        }
    }
}
