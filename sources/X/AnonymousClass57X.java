package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57X  reason: invalid class name */
public final class AnonymousClass57X implements Iterator {
    public boolean canRemove;
    public C87494Wz currentEntry;
    public final Iterator entryIterator;
    public int laterCount;
    public final C109985Uo multiset;
    public int totalCount;

    public AnonymousClass57X(C109985Uo r1, Iterator it) {
        this.multiset = r1;
        this.entryIterator = it;
    }

    public boolean hasNext() {
        return this.laterCount > 0 || this.entryIterator.hasNext();
    }

    public Object next() {
        if (hasNext()) {
            int i2 = this.laterCount;
            if (i2 == 0) {
                C87494Wz r0 = (C87494Wz) this.entryIterator.next();
                this.currentEntry = r0;
                i2 = r0.getCount();
                this.laterCount = i2;
                this.totalCount = i2;
            }
            this.laterCount = i2 - 1;
            this.canRemove = true;
            return this.currentEntry.getElement();
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        C29011Zs.checkRemove(this.canRemove);
        if (this.totalCount == 1) {
            this.entryIterator.remove();
        } else {
            this.multiset.remove(this.currentEntry.getElement());
        }
        this.totalCount--;
        this.canRemove = false;
    }
}
