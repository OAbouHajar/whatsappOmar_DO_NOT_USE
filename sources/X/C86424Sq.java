package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: X.4Sq  reason: invalid class name and case insensitive filesystem */
public class C86424Sq {
    public final Set A00 = C13680ns.A0o();

    public void A00() {
        Set<C14810pn> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                LinkedList linkedList = null;
                for (C14810pn r1 : set) {
                    if (r1.AMG()) {
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                        }
                        linkedList.add(r1);
                    }
                }
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        set.remove((C14810pn) it.next());
                    }
                }
            }
        }
    }

    public void A01(C14810pn r3) {
        Set set = this.A00;
        synchronized (set) {
            set.add(r3);
        }
    }
}
