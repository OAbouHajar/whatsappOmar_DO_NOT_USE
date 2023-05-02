package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.05E  reason: invalid class name */
public final class AnonymousClass05E implements Set {
    public final /* synthetic */ AnonymousClass05D A00;

    public AnonymousClass05E(AnonymousClass05D r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.A00.A06();
    }

    public boolean contains(Object obj) {
        return this.A00.A02(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        Map A05 = this.A00.A05();
        for (Object containsKey : collection) {
            if (!A05.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        AnonymousClass05D r4 = this.A00;
        int i2 = 0;
        for (int A01 = r4.A01() - 1; A01 >= 0; A01--) {
            Object A03 = r4.A03(A01, 0);
            i2 += A03 == null ? 0 : A03.hashCode();
        }
        return i2;
    }

    public boolean isEmpty() {
        return this.A00.A01() == 0;
    }

    public Iterator iterator() {
        return new AnonymousClass05F(this.A00, 0);
    }

    public boolean remove(Object obj) {
        AnonymousClass05D r1 = this.A00;
        int A02 = r1.A02(obj);
        if (A02 < 0) {
            return false;
        }
        r1.A07(A02);
        return true;
    }

    public boolean removeAll(Collection collection) {
        Map A05 = this.A00.A05();
        int size = A05.size();
        for (Object remove : collection) {
            A05.remove(remove);
        }
        return size != A05.size();
    }

    public boolean retainAll(Collection collection) {
        return AnonymousClass05D.A00(collection, this.A00.A05());
    }

    public int size() {
        return this.A00.A01();
    }

    public Object[] toArray() {
        AnonymousClass05D r5 = this.A00;
        int A01 = r5.A01();
        Object[] objArr = new Object[A01];
        for (int i2 = 0; i2 < A01; i2++) {
            objArr[i2] = r5.A03(i2, 0);
        }
        return objArr;
    }

    public Object[] toArray(Object[] objArr) {
        return this.A00.A08(objArr, 0);
    }
}
