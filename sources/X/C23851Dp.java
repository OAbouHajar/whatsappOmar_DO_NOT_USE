package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Dp  reason: invalid class name and case insensitive filesystem */
public final class C23851Dp implements Set, Serializable, C23861Dq {
    public static final C23851Dp A00 = new C23851Dp();
    public static final long serialVersionUID = 3406603774387020532L;

    private final Object readResolve() {
        return A00;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    public boolean containsAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return AnonymousClass2KK.A00;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public Object[] toArray() {
        return C89694ck.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        C18450wi.A0H(objArr, 0);
        return C89694ck.A01(this, objArr);
    }

    public String toString() {
        return "[]";
    }
}
