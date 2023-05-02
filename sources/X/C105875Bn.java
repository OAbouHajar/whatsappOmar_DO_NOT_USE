package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.5Bn  reason: invalid class name and case insensitive filesystem */
public abstract class C105875Bn<E> extends AbstractList<E> implements C110015Ur<E> {
    public boolean A00 = true;

    public static void A01(Object obj, int i2, int i3) {
        if (i3 < i2 - 1) {
            System.arraycopy(obj, i3 + 1, obj, i3, i2 - i3);
        }
    }

    public final void A02() {
        if (!this.A00) {
            throw C13680ns.A0m();
        }
    }

    public boolean add(Object obj) {
        A02();
        return super.add(obj);
    }

    public boolean addAll(int i2, Collection collection) {
        A02();
        return super.addAll(i2, collection);
    }

    public boolean addAll(Collection collection) {
        A02();
        return super.addAll(collection);
    }

    public void clear() {
        A02();
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
            i2 = AnonymousClass3K2.A06(get(i3), i2 * 31);
        }
        return i2;
    }

    public boolean remove(Object obj) {
        A02();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        A02();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        A02();
        return super.retainAll(collection);
    }
}
