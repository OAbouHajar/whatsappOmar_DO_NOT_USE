package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1NI  reason: invalid class name */
public class AnonymousClass1NI {
    public final Map A00 = new HashMap();

    public final AtomicInteger A00(String str) {
        AtomicInteger atomicInteger;
        synchronized (this) {
            Map map = this.A00;
            atomicInteger = (AtomicInteger) map.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                map.put(str, atomicInteger);
            }
        }
        return atomicInteger;
    }
}
