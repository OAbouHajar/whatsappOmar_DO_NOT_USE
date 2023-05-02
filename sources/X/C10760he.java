package X;

import com.facebook.redex.IDxMCollectionsShape20S0100000_I0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0he  reason: invalid class name and case insensitive filesystem */
public final class C10760he implements Set {
    public final /* synthetic */ AnonymousClass05D A00;

    public C10760he(AnonymousClass05D r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        AnonymousClass05D r5 = this.A00;
        int A01 = r5.A01();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(it);
            ((AnonymousClass00O) ((IDxMCollectionsShape20S0100000_I0) r5).A00).put(A0z.getKey(), A0z.getValue());
        }
        return A01 != r5.A01();
    }

    public void clear() {
        this.A00.A06();
    }

    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            AnonymousClass05D r2 = this.A00;
            int A02 = r2.A02(entry.getKey());
            if (A02 >= 0) {
                Object A03 = r2.A03(A02, 1);
                Object value = entry.getValue();
                if (A03 != value) {
                    return A03 != null && A03.equals(value);
                }
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
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
        AnonymousClass05D r6 = this.A00;
        int i2 = 0;
        for (int A01 = r6.A01() - 1; A01 >= 0; A01--) {
            i2 += AnonymousClass000.A0C(r6.A03(A01, 0)) ^ AnonymousClass000.A0C(r6.A03(A01, 1));
        }
        return i2;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(this.A00.A01());
    }

    public Iterator iterator() {
        return new C10740hc(this.A00);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.A00.A01();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
