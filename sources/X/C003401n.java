package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.01n  reason: invalid class name and case insensitive filesystem */
public abstract class C003401n {
    public final Map A00 = new HashMap();
    public final Set A01 = new LinkedHashSet();
    public volatile boolean A02 = false;

    public static void A00(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public Object A01(Object obj, String str) {
        Object obj2;
        Map map = this.A00;
        synchronized (map) {
            obj2 = map.get(str);
            if (obj2 == null) {
                map.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.A02) {
            A00(obj);
        }
        return obj;
    }

    public void A04() {
    }
}
