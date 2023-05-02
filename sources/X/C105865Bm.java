package X;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractMutableCollection;

/* renamed from: X.5Bm  reason: invalid class name and case insensitive filesystem */
public final class C105865Bm<V> extends AbstractMutableCollection<V> implements Collection<V>, C52202dJ {
    public final AnonymousClass28m A00;

    public C105865Bm(AnonymousClass28m r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw C13680ns.A0m();
    }

    public boolean addAll(Collection collection) {
        throw C13680ns.A0m();
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new C106145Cr(this.A00);
    }

    public boolean remove(Object obj) {
        AnonymousClass28m r2 = this.A00;
        r2.A02();
        int i2 = r2.length;
        while (true) {
            i2--;
            if (i2 < 0) {
                return false;
            }
            if (r2.presenceArray[i2] >= 0) {
                Object[] objArr = r2.valuesArray;
                C18450wi.A0F(objArr);
                if (C18450wi.A0R(objArr[i2], obj)) {
                    r2.A05(i2);
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.5Bm] */
    public boolean removeAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        this.A00.A02();
        return C105865Bm.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.5Bm] */
    public boolean retainAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        this.A00.A02();
        return C105865Bm.super.retainAll(collection);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }
}
