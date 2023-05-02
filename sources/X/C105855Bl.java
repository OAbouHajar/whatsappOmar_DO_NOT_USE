package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5Bl  reason: invalid class name and case insensitive filesystem */
public abstract class C105855Bl<E> extends AbstractCollection<E> implements C109985Uo<E> {
    public transient Set elementSet;
    public transient Set entrySet;

    public abstract int add(Object obj, int i2);

    public final boolean add(Object obj) {
        add(obj, 1);
        return true;
    }

    public final boolean addAll(Collection collection) {
        return C90824es.addAllImpl((C109985Uo) this, collection);
    }

    public abstract void clear();

    public boolean contains(Object obj) {
        return AnonymousClass000.A1Q(count(obj));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3cr, java.util.Set] */
    public Set createElementSet() {
        return new C68083cr(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3cq, java.util.Set] */
    public Set createEntrySet() {
        return new C68073cq(this);
    }

    public abstract int distinctElements();

    public abstract Iterator elementIterator();

    public Set elementSet() {
        Set set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set createElementSet = createElementSet();
        this.elementSet = createElementSet;
        return createElementSet;
    }

    public abstract Iterator entryIterator();

    public Set entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public final boolean equals(Object obj) {
        return C90824es.equalsImpl(this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public abstract int remove(Object obj, int i2);

    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public final boolean removeAll(Collection collection) {
        return C90824es.removeAllImpl(this, collection);
    }

    public final boolean retainAll(Collection collection) {
        return C90824es.retainAllImpl(this, collection);
    }

    public abstract boolean setCount(Object obj, int i2, int i3);

    public final String toString() {
        return entrySet().toString();
    }
}
