package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.2TC  reason: invalid class name */
public class AnonymousClass2TC implements Iterator {
    public Iterator iterator = C28021Ua.emptyIterator();
    public Deque metaIterators;
    public Iterator toRemove;
    public Iterator topMetaIterator;

    public AnonymousClass2TC(Iterator it) {
        this.topMetaIterator = it;
    }

    private Iterator getTopMetaIterator() {
        while (true) {
            Iterator it = this.topMetaIterator;
            if (it != null && it.hasNext()) {
                return this.topMetaIterator;
            }
            Deque deque = this.metaIterators;
            if (deque == null || deque.isEmpty()) {
                return null;
            }
            this.topMetaIterator = (Iterator) this.metaIterators.removeFirst();
        }
    }

    public boolean hasNext() {
        while (!this.iterator.hasNext()) {
            Iterator topMetaIterator2 = getTopMetaIterator();
            this.topMetaIterator = topMetaIterator2;
            if (topMetaIterator2 == null) {
                return false;
            }
            Iterator it = (Iterator) topMetaIterator2.next();
            this.iterator = it;
            if (it instanceof AnonymousClass2TC) {
                AnonymousClass2TC r2 = (AnonymousClass2TC) it;
                this.iterator = r2.iterator;
                Deque deque = this.metaIterators;
                if (deque == null) {
                    deque = new ArrayDeque();
                    this.metaIterators = deque;
                }
                deque.addFirst(this.topMetaIterator);
                if (r2.metaIterators != null) {
                    while (!r2.metaIterators.isEmpty()) {
                        this.metaIterators.addFirst(r2.metaIterators.removeLast());
                    }
                }
                this.topMetaIterator = r2.topMetaIterator;
            }
        }
        return true;
    }

    public Object next() {
        if (hasNext()) {
            Iterator it = this.iterator;
            this.toRemove = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        Iterator it = this.toRemove;
        if (it != null) {
            it.remove();
            this.toRemove = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
