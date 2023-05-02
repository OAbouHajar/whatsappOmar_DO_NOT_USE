package X;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.05a  reason: invalid class name and case insensitive filesystem */
public class C010505a {
    public final HashMap A00 = new HashMap();

    public final void A00() {
        HashMap hashMap = this.A00;
        for (C003401n r3 : hashMap.values()) {
            r3.A02 = true;
            Map map = r3.A00;
            synchronized (map) {
                for (Object A002 : map.values()) {
                    C003401n.A00(A002);
                }
            }
            Set<Closeable> set = r3.A01;
            synchronized (set) {
                for (Closeable A003 : set) {
                    C003401n.A00(A003);
                }
            }
            r3.A04();
        }
        hashMap.clear();
    }
}
