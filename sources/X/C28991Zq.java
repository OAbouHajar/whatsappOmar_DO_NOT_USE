package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Zq  reason: invalid class name and case insensitive filesystem */
public final class C28991Zq {
    public static final C29001Zr A01 = new C29001Zr((Object) null);
    public final Map A00 = new HashMap();

    public final void A00(int i2, Object obj) {
        if (obj == null) {
            this.A00.remove(Integer.valueOf(i2));
            return;
        }
        C29001Zr r3 = new C29001Zr(obj);
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(i2);
        if (!map.containsKey(valueOf) || !map.get(valueOf).equals(r3)) {
            map.put(valueOf, r3);
        }
    }
}
