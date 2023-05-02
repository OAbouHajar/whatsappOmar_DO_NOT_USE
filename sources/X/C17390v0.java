package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: X.0v0  reason: invalid class name and case insensitive filesystem */
public abstract class C17390v0<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] EMPTY_ARRAY = new Object[0];

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public C34641kb asList() {
        return isEmpty() ? C34641kb.of() : C34641kb.asImmutableList(toArray());
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public abstract int copyIntoArray(Object[] objArr, int i2);

    public Object[] internalArray() {
        return null;
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isPartialView();

    public abstract C28031Ub iterator();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    public final Object[] toArray(Object[] objArr) {
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return C90254dq.copy(internalArray, internalArrayStart(), internalArrayEnd(), objArr);
            }
            objArr = AnonymousClass2CC.newArray(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        copyIntoArray(objArr, 0);
        return objArr;
    }

    public Object writeReplace() {
        return new C1041554d(toArray());
    }
}
