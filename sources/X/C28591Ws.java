package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1Ws  reason: invalid class name and case insensitive filesystem */
public abstract class C28591Ws implements C28561Wp, Cloneable {
    public static void A01(Iterable iterable, Collection collection) {
        boolean z2 = iterable instanceof Collection;
        Iterator it = iterable.iterator();
        if (z2) {
            while (it.hasNext()) {
                it.next();
            }
            collection.addAll((Collection) iterable);
            return;
        }
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        throw null;
    }
}
