package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4ei  reason: invalid class name and case insensitive filesystem */
public final class C90734ei {
    public static boolean equalsImpl(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static int hashCodeImpl(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ((i2 + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i2;
    }

    public static C105965By intersection(Set set, Set set2) {
        String str = "set1";
        if (set != null) {
            str = "set2";
            if (set2 != null) {
                return new C68113cu(set, set2);
            }
        }
        throw AnonymousClass000.A0W(String.valueOf(str));
    }

    public static HashSet newHashSet() {
        return C13680ns.A0o();
    }

    public static HashSet newHashSetWithExpectedSize(int i2) {
        return new HashSet(C90814er.capacity(i2));
    }

    public static boolean removeAllImpl(Set set, Collection collection) {
        if (collection instanceof C109985Uo) {
            collection = ((C109985Uo) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? removeAllImpl(set, collection.iterator()) : C28021Ua.removeAll(set.iterator(), collection);
    }

    public static boolean removeAllImpl(Set set, Iterator it) {
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= set.remove(it.next());
        }
        return z2;
    }
}
