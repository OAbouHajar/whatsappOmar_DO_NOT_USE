package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2dG  reason: invalid class name and case insensitive filesystem */
public final class C52172dG<T> implements Collection<T>, C23861Dq {
    public final boolean A00;
    public final Object[] A01;

    public C52172dG(Object[] objArr, boolean z2) {
        this.A01 = objArr;
        this.A00 = z2;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.A01;
        int i2 = 0;
        int length = objArr.length;
        if (obj != null) {
            while (true) {
                if (i2 >= length) {
                    break;
                }
                int i3 = i2 + 1;
                if (obj.equals(objArr[i2])) {
                    break;
                }
                i2 = i3;
            }
        } else {
            while (true) {
                if (i2 >= length) {
                    break;
                }
                int i4 = i2 + 1;
                if (objArr[i2] == null) {
                    break;
                }
                i2 = i4;
            }
        }
        return i2 >= 0;
    }

    public boolean containsAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.A01.length == 0;
    }

    public Iterator iterator() {
        return new C1048857h(this.A01);
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
        return this.A01.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.A01;
        Class<Object[]> cls = Object[].class;
        if (this.A00 && C18450wi.A0R(objArr.getClass(), cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        C18450wi.A0B(copyOf);
        return copyOf;
    }

    public Object[] toArray(Object[] objArr) {
        C18450wi.A0H(objArr, 0);
        return C89694ck.A01(this, objArr);
    }
}
