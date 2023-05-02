package X;

import java.util.Iterator;

/* renamed from: X.57Y  reason: invalid class name */
public abstract class AnonymousClass57Y implements Iterator {
    public final Iterator backingIterator;

    public AnonymousClass57Y(Iterator it) {
        this.backingIterator = it;
    }

    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }

    public final Object next() {
        return transform(this.backingIterator.next());
    }

    public final void remove() {
        this.backingIterator.remove();
    }

    public abstract Object transform(Object obj);
}
