package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5Co  reason: invalid class name and case insensitive filesystem */
public final class C106115Co<E> extends AnonymousClass5C0<E> implements Set<E>, AnonymousClass5VE {
    public final AnonymousClass28m A00;

    public C106115Co(AnonymousClass28m r1) {
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
        return this.A00.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new C106135Cq(this.A00);
    }

    public boolean remove(Object obj) {
        AnonymousClass28m r1 = this.A00;
        r1.A02();
        int A01 = r1.A01(obj);
        if (A01 < 0) {
            return false;
        }
        r1.A05(A01);
        return true;
    }

    public boolean removeAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        this.A00.A02();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        this.A00.A02();
        return super.retainAll(collection);
    }
}
