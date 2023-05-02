package X;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.57d  reason: invalid class name and case insensitive filesystem */
public class C1048457d implements Iterator {
    public final Iterator delegateIterator;
    public final Collection originalDelegate;
    public final /* synthetic */ C105845Bk this$1;

    public C1048457d(C105845Bk r2) {
        this.this$1 = r2;
        Collection collection = r2.delegate;
        this.originalDelegate = collection;
        this.delegateIterator = C67723cH.iteratorOrListIterator(collection);
    }

    public C1048457d(C105845Bk r2, Iterator it) {
        this.this$1 = r2;
        this.originalDelegate = r2.delegate;
        this.delegateIterator = it;
    }

    public Iterator getDelegateIterator() {
        validateIterator();
        return this.delegateIterator;
    }

    public boolean hasNext() {
        validateIterator();
        return this.delegateIterator.hasNext();
    }

    public Object next() {
        validateIterator();
        return this.delegateIterator.next();
    }

    public void remove() {
        this.delegateIterator.remove();
        C105845Bk r1 = this.this$1;
        C67723cH.access$210(r1.this$0);
        r1.removeIfEmpty();
    }

    public void validateIterator() {
        this.this$1.refreshIfEmpty();
        if (this.this$1.delegate != this.originalDelegate) {
            throw new ConcurrentModificationException();
        }
    }
}
