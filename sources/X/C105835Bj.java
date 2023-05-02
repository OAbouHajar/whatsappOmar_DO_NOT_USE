package X;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5Bj  reason: invalid class name and case insensitive filesystem */
public class C105835Bj<E> extends AbstractCollection<E> {
    public final AnonymousClass5OH predicate;
    public final Collection unfiltered;

    public C105835Bj(Collection collection, AnonymousClass5OH r2) {
        this.unfiltered = collection;
        this.predicate = r2;
    }

    public boolean add(Object obj) {
        if (this.predicate.A55(obj)) {
            return this.unfiltered.add(obj);
        }
        throw AnonymousClass3K3.A0f();
    }

    public boolean addAll(Collection collection) {
        for (Object A55 : collection) {
            if (!this.predicate.A55(A55)) {
                throw AnonymousClass3K3.A0f();
            }
        }
        return this.unfiltered.addAll(collection);
    }

    public void clear() {
        C90804eq.removeIf(this.unfiltered, this.predicate);
    }

    public boolean contains(Object obj) {
        if (C90534eK.safeContains(this.unfiltered, obj)) {
            return this.predicate.A55(obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        return C90534eK.containsAllImpl(this, collection);
    }

    public C105835Bj createCombined(AnonymousClass5OH r4) {
        Collection collection = this.unfiltered;
        AnonymousClass5OH[] r0 = new AnonymousClass5OH[2];
        AnonymousClass000.A1E(this.predicate, r4, r0);
        return new C105835Bj(collection, new C99034tN(Arrays.asList(r0)));
    }

    public boolean isEmpty() {
        return !C90804eq.any(this.unfiltered, this.predicate);
    }

    public Iterator iterator() {
        return C28021Ua.filter(this.unfiltered.iterator(), this.predicate);
    }

    public boolean remove(Object obj) {
        return contains(obj) && this.unfiltered.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        Iterator it = this.unfiltered.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.predicate.A55(next) && collection.contains(next)) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public boolean retainAll(Collection collection) {
        Iterator it = this.unfiltered.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.predicate.A55(next) && !collection.contains(next)) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public int size() {
        int i2 = 0;
        for (Object A55 : this.unfiltered) {
            if (this.predicate.A55(A55)) {
                i2++;
            }
        }
        return i2;
    }

    public Object[] toArray() {
        return AnonymousClass3Bv.newArrayList(iterator()).toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return AnonymousClass3Bv.newArrayList(iterator()).toArray(objArr);
    }
}
