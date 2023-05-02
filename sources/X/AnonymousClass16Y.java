package X;

import java.util.Map;

/* renamed from: X.16Y  reason: invalid class name */
public class AnonymousClass16Y {
    public final ThreadLocal A00 = new C29391aY(this);

    public synchronized String A00(String str) {
        Map map;
        map = (Map) this.A00.get();
        AnonymousClass00B.A06(map);
        return (String) map.get(str);
    }
}
