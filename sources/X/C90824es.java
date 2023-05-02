package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4es  reason: invalid class name and case insensitive filesystem */
public final class C90824es {
    public static boolean addAllImpl(C109985Uo r1, C67733cI r2) {
        if (r2.isEmpty()) {
            return false;
        }
        r2.addTo(r1);
        return true;
    }

    public static boolean addAllImpl(C109985Uo r3, C109985Uo r4) {
        if (r4 instanceof C67733cI) {
            return addAllImpl(r3, (C67733cI) r4);
        }
        if (r4.isEmpty()) {
            return false;
        }
        for (C87494Wz r0 : r4.entrySet()) {
            r3.add(r0.getElement(), r0.getCount());
        }
        return true;
    }

    public static boolean addAllImpl(C109985Uo r1, Collection collection) {
        if (collection instanceof C109985Uo) {
            return addAllImpl(r1, cast(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C28021Ua.addAll(r1, collection.iterator());
    }

    public static C109985Uo cast(Iterable iterable) {
        return (C109985Uo) iterable;
    }

    public static boolean equalsImpl(C109985Uo r6, Object obj) {
        if (obj != r6) {
            if (obj instanceof C109985Uo) {
                C109985Uo r7 = (C109985Uo) obj;
                if (r6.size() == r7.size() && r6.entrySet().size() == r7.entrySet().size()) {
                    for (C87494Wz r2 : r7.entrySet()) {
                        if (r6.count(r2.getElement()) != r2.getCount()) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static Iterator iteratorImpl(C109985Uo r2) {
        return new AnonymousClass57X(r2, r2.entrySet().iterator());
    }

    public static boolean removeAllImpl(C109985Uo r1, Collection collection) {
        if (collection instanceof C109985Uo) {
            collection = ((C109985Uo) collection).elementSet();
        }
        return r1.elementSet().removeAll(collection);
    }

    public static boolean retainAllImpl(C109985Uo r1, Collection collection) {
        if (collection instanceof C109985Uo) {
            collection = ((C109985Uo) collection).elementSet();
        }
        return r1.elementSet().retainAll(collection);
    }
}
