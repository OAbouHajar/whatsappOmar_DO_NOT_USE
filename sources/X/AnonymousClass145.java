package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.145  reason: invalid class name */
public class AnonymousClass145 {
    public final Object A00;
    public final Object A01;

    public AnonymousClass145(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static Map A00(Set set) {
        AnonymousClass00N r3 = new AnonymousClass00N();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass145 r0 = (AnonymousClass145) it.next();
            r3.put(r0.A00, r0.A01);
        }
        return r3;
    }
}
