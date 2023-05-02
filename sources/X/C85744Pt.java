package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4Pt  reason: invalid class name and case insensitive filesystem */
public final class C85744Pt {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public void A00(AnonymousClass5LW r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A00;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C84084Je r1 = (C84084Je) it.next();
            if (r1.A02 == r5) {
                r1.A00 = true;
                copyOnWriteArrayList.remove(r1);
            }
        }
    }
}
