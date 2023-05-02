package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3cc  reason: invalid class name and case insensitive filesystem */
public final class C67933cc<E> extends C67943cd<E> {
    public static final C67933cc NATURAL_EMPTY_SET = new C67933cc(C34641kb.of(), AnonymousClass57I.natural());
    public final transient C34641kb elements;

    public C67933cc(C34641kb r1, Comparator comparator) {
        super(comparator);
        this.elements = r1;
    }

    private int unsafeBinarySearch(Object obj) {
        return Collections.binarySearch(this.elements, obj, unsafeComparator());
    }

    public C34641kb asList() {
        return this.elements;
    }

    public Object ceiling(Object obj) {
        int tailIndex = tailIndex(obj, true);
        if (tailIndex == size()) {
            return null;
        }
        return this.elements.get(tailIndex);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return unsafeBinarySearch(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection collection) {
        if (collection instanceof C109985Uo) {
            collection = ((C109985Uo) collection).elementSet();
        }
        if (!C87544Xi.hasSameComparator(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C28031Ub it = iterator();
        Iterator it2 = collection.iterator();
        if (it.hasNext()) {
            Object next = it2.next();
            Object next2 = it.next();
            while (true) {
                try {
                    int unsafeCompare = unsafeCompare(next2, next);
                    if (unsafeCompare >= 0) {
                        if (unsafeCompare != 0) {
                            break;
                        } else if (!it2.hasNext()) {
                            return true;
                        } else {
                            next = it2.next();
                        }
                    } else if (!it.hasNext()) {
                        break;
                    } else {
                        next2 = it.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i2) {
        return this.elements.copyIntoArray(objArr, i2);
    }

    public C67943cd createDescendingSet() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        return isEmpty() ? C67943cd.emptySet(reverseOrder) : new C67933cc(this.elements.reverse(), reverseOrder);
    }

    public C28031Ub descendingIterator() {
        return this.elements.reverse().iterator();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 == r6) goto L_0x0048
            boolean r0 = r7 instanceof java.util.Set
            r4 = 0
            if (r0 == 0) goto L_0x0047
            java.util.Set r7 = (java.util.Set) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 != r0) goto L_0x0047
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0048
            java.util.Comparator r0 = r6.comparator
            boolean r0 = X.C87544Xi.hasSameComparator(r0, r7)
            if (r0 == 0) goto L_0x0042
            java.util.Iterator r3 = r7.iterator()
            X.1Ub r2 = r6.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
        L_0x002a:
            boolean r0 = r2.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
            java.lang.Object r0 = r3.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
            if (r0 == 0) goto L_0x0047
            int r0 = r6.unsafeCompare(r1, r0)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
            if (r0 == 0) goto L_0x002a
            return r4
        L_0x0041:
            return r4
        L_0x0042:
            boolean r0 = r6.containsAll(r7)
            return r0
        L_0x0047:
            return r4
        L_0x0048:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67933cc.equals(java.lang.Object):boolean");
    }

    public Object first() {
        if (!isEmpty()) {
            return C13690nt.A0Z(this.elements);
        }
        throw new NoSuchElementException();
    }

    public Object floor(Object obj) {
        int headIndex = headIndex(obj, true) - 1;
        if (headIndex == -1) {
            return null;
        }
        return this.elements.get(headIndex);
    }

    public C67933cc getSubSet(int i2, int i3) {
        return (i2 == 0 && i3 == size()) ? this : i2 < i3 ? new C67933cc(this.elements.subList(i2, i3), this.comparator) : C67943cd.emptySet(this.comparator);
    }

    public int headIndex(Object obj, boolean z2) {
        int binarySearch = Collections.binarySearch(this.elements, obj, comparator());
        return binarySearch >= 0 ? z2 ? binarySearch + 1 : binarySearch : binarySearch ^ -1;
    }

    public C67943cd headSetImpl(Object obj, boolean z2) {
        return getSubSet(0, headIndex(obj, z2));
    }

    public Object higher(Object obj) {
        int tailIndex = tailIndex(obj, false);
        if (tailIndex == size()) {
            return null;
        }
        return this.elements.get(tailIndex);
    }

    public Object[] internalArray() {
        return this.elements.internalArray();
    }

    public int internalArrayEnd() {
        return this.elements.internalArrayEnd();
    }

    public int internalArrayStart() {
        return this.elements.internalArrayStart();
    }

    public boolean isPartialView() {
        return this.elements.isPartialView();
    }

    public C28031Ub iterator() {
        return this.elements.iterator();
    }

    public Object last() {
        if (!isEmpty()) {
            return this.elements.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public Object lower(Object obj) {
        int headIndex = headIndex(obj, false) - 1;
        if (headIndex == -1) {
            return null;
        }
        return this.elements.get(headIndex);
    }

    public int size() {
        return this.elements.size();
    }

    public C67943cd subSetImpl(Object obj, boolean z2, Object obj2, boolean z3) {
        return tailSetImpl(obj, z2).headSetImpl(obj2, z3);
    }

    public int tailIndex(Object obj, boolean z2) {
        int binarySearch = Collections.binarySearch(this.elements, obj, comparator());
        return binarySearch >= 0 ? !z2 ? binarySearch + 1 : binarySearch : binarySearch ^ -1;
    }

    public C67943cd tailSetImpl(Object obj, boolean z2) {
        return getSubSet(tailIndex(obj, z2), size());
    }

    public Comparator unsafeComparator() {
        return this.comparator;
    }
}
