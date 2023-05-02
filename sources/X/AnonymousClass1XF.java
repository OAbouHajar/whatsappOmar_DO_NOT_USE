package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.1XF  reason: invalid class name */
public abstract class AnonymousClass1XF<E> extends AbstractList<E> implements AnonymousClass1XE<E> {
    public boolean A00 = true;

    public void A00() {
        if (!this.A00) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(Object obj) {
        A00();
        return super.add(obj);
    }

    public boolean addAll(int i2, Collection collection) {
        A00();
        return super.addAll(i2, collection);
    }

    public boolean addAll(Collection collection) {
        A00();
        return super.addAll(collection);
    }

    public void clear() {
        A00();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                if (!(obj instanceof RandomAccess)) {
                    return super.equals(obj);
                }
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    int i2 = 0;
                    while (i2 < size) {
                        if (get(i2).equals(list.get(i2))) {
                            i2++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public boolean remove(Object obj) {
        A00();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        A00();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        A00();
        return super.retainAll(collection);
    }
}
