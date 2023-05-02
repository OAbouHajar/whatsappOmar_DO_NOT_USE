package X;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: X.0Up  reason: invalid class name and case insensitive filesystem */
public class C06180Up {
    public static final Map A03 = new IdentityHashMap();
    public int A00 = 1;
    public Object A01;
    public final C12880l7 A02;

    public C06180Up(C12880l7 r4, Object obj) {
        this.A01 = obj;
        this.A02 = r4;
        Map map = A03;
        synchronized (map) {
            Integer num = (Integer) map.get(obj);
            if (num == null) {
                map.put(obj, 1);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    public synchronized Object A00() {
        return this.A01;
    }

    public final void A01() {
        boolean A1Q;
        synchronized (this) {
            A1Q = AnonymousClass000.A1Q(this.A00);
        }
        if (!A1Q) {
            throw new C11130iF();
        }
    }
}
