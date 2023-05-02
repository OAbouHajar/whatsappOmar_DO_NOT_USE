package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.16o  reason: invalid class name and case insensitive filesystem */
public class C220816o {
    public final C16440t3 A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public C220816o(C16440t3 r2) {
        this.A00 = r2;
    }

    public void A00(String[] strArr) {
        Set set = this.A03;
        synchronized (set) {
            set.removeAll(C16030sJ.A09(strArr));
        }
    }

    public boolean A01(C28381Vw r3) {
        boolean add;
        Set set = this.A02;
        synchronized (set) {
            add = set.add(r3);
        }
        return add;
    }
}
