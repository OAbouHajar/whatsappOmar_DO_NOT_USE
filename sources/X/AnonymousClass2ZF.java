package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2ZF  reason: invalid class name */
public abstract class AnonymousClass2ZF extends C20010zM {
    public boolean A01(Map map) {
        C16750ta r1;
        C18450wi.A0H(map, 0);
        Collection values = map.values();
        if (values != null && values.isEmpty()) {
            return true;
        }
        Iterator it = values.iterator();
        if (!it.hasNext()) {
            return true;
        }
        C16740tZ r2 = (C16740tZ) it.next();
        if (!(r2 instanceof C16730tY) || ((r1 = ((C16730tY) r2).A02) != null && r1.A0O && !r1.A0Z && r1.A0P)) {
            return !C38621r6.A0o(r2);
        }
        return false;
    }
}
