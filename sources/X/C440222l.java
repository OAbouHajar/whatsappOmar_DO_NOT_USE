package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.22l  reason: invalid class name and case insensitive filesystem */
public final class C440222l implements List, Serializable, RandomAccess, C23861Dq {
    public static final C440222l A00 = new C440222l();
    public static final long serialVersionUID = -7390468764508069838L;

    private final Object readResolve() {
        return A00;
    }

    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
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
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        StringBuilder sb = new StringBuilder("Empty list doesn't contain element at index ");
        sb.append(i2);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return AnonymousClass2KK.A00;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        return -1;
    }

    public ListIterator listIterator() {
        return AnonymousClass2KK.A00;
    }

    public ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return AnonymousClass2KK.A00;
        }
        throw new IndexOutOfBoundsException(C18450wi.A06("Index: ", Integer.valueOf(i2)));
    }

    public /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder("fromIndex: ");
        sb.append(i2);
        sb.append(", toIndex: ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
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
