package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5Cn  reason: invalid class name and case insensitive filesystem */
public final class C106105Cn<E> extends AnonymousClass5C0<E> implements Set<E>, Serializable, AnonymousClass5VE {
    public final AnonymousClass28m backing;

    public C106105Cn() {
        this.backing = new AnonymousClass28m(8);
    }

    public C106105Cn(int i2) {
        this.backing = new AnonymousClass28m(i2);
    }

    private final Object writeReplace() {
        if (this.backing.isReadOnly) {
            return new AnonymousClass54X(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean add(Object obj) {
        return C13700nu.A0f(this.backing.A00(obj));
    }

    public boolean addAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        this.backing.A02();
        return super.addAll(collection);
    }

    public void clear() {
        this.backing.clear();
    }

    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public Iterator iterator() {
        return new C106135Cq(this.backing);
    }

    public boolean remove(Object obj) {
        AnonymousClass28m r1 = this.backing;
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
        this.backing.A02();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        this.backing.A02();
        return super.retainAll(collection);
    }
}
