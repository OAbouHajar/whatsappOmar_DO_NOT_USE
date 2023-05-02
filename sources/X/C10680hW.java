package X;

import com.facebook.redex.IDxMCollectionsShape20S0100000_I0;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0hW  reason: invalid class name and case insensitive filesystem */
public final class C10680hW implements Collection<V> {
    public final /* synthetic */ AnonymousClass05D A00;

    public C10680hW(AnonymousClass05D r1) {
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
        return ((AnonymousClass00O) ((IDxMCollectionsShape20S0100000_I0) this.A00).A00).A04(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(this.A00.A01());
    }

    public Iterator iterator() {
        return new AnonymousClass05F(this.A00, 1);
    }

    public boolean remove(Object obj) {
        AnonymousClass05D r1 = this.A00;
        int A04 = ((AnonymousClass00O) ((IDxMCollectionsShape20S0100000_I0) r1).A00).A04(obj);
        if (A04 < 0) {
            return false;
        }
        r1.A07(A04);
        return true;
    }

    public boolean removeAll(Collection collection) {
        AnonymousClass05D r4 = this.A00;
        int A01 = r4.A01();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < A01) {
            if (collection.contains(r4.A03(i2, 1))) {
                r4.A07(i2);
                i2--;
                A01--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    public boolean retainAll(Collection collection) {
        AnonymousClass05D r4 = this.A00;
        int A01 = r4.A01();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < A01) {
            if (!collection.contains(r4.A03(i2, 1))) {
                r4.A07(i2);
                i2--;
                A01--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    public int size() {
        return this.A00.A01();
    }

    public Object[] toArray() {
        AnonymousClass05D r5 = this.A00;
        int A01 = r5.A01();
        Object[] objArr = new Object[A01];
        for (int i2 = 0; i2 < A01; i2++) {
            objArr[i2] = r5.A03(i2, 1);
        }
        return objArr;
    }

    public Object[] toArray(Object[] objArr) {
        return this.A00.A08(objArr, 1);
    }
}
