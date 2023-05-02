package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1Ua  reason: invalid class name and case insensitive filesystem */
public final class C28021Ua {
    public static boolean addAll(Collection collection, Iterator it) {
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= collection.add(it.next());
        }
        return z2;
    }

    public static boolean any(Iterator it, AnonymousClass5OH r2) {
        return indexOf(it, r2) != -1;
    }

    public static void clear(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Iterator concat(Iterator it) {
        return new AnonymousClass2TC(it);
    }

    public static Iterator concat(Iterator it, Iterator it2) {
        return concat(consumingForArray(it, it2));
    }

    public static Iterator consumingForArray(Iterator... itArr) {
        return new AnonymousClass2TB(itArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean elementsEqual(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L_0x0000:
            boolean r1 = r3.hasNext()
            boolean r0 = r4.hasNext()
            if (r1 == 0) goto L_0x001c
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r3.next()
            java.lang.Object r0 = r4.next()
            boolean r0 = X.AnonymousClass45Q.A00(r1, r0)
            if (r0 != 0) goto L_0x0000
        L_0x001b:
            return r2
        L_0x001c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28021Ua.elementsEqual(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static C28031Ub emptyIterator() {
        return emptyListIterator();
    }

    public static AnonymousClass2NP emptyListIterator() {
        return AnonymousClass2TD.EMPTY;
    }

    public static Iterator emptyModifiableIterator() {
        return AnonymousClass43G.INSTANCE;
    }

    public static C28031Ub filter(Iterator it, AnonymousClass5OH r2) {
        return new AnonymousClass3c2(it, r2);
    }

    public static Object getLast(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object getNext(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static int indexOf(Iterator it, AnonymousClass5OH r3) {
        if (r3 != null) {
            int i2 = 0;
            while (it.hasNext()) {
                if (r3.A55(it.next())) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        throw new NullPointerException(String.valueOf("predicate"));
    }

    public static Object pollNext(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean removeAll(Iterator it, Collection collection) {
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean removeIf(Iterator it, AnonymousClass5OH r3) {
        boolean z2 = false;
        while (it.hasNext()) {
            if (r3.A55(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static C28031Ub singletonIterator(Object obj) {
        return new C68143cx(obj);
    }

    public static String toString(Iterator it) {
        StringBuilder sb = new StringBuilder("[");
        boolean z2 = true;
        while (it.hasNext()) {
            if (!z2) {
                sb.append(", ");
            }
            z2 = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    public static Iterator transform(Iterator it, C49762Vq r2) {
        return new C68123cv(it, r2);
    }

    public static C28031Ub unmodifiableIterator(Iterator it) {
        return new AnonymousClass2TE(it);
    }
}
