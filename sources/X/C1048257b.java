package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57b  reason: invalid class name and case insensitive filesystem */
public abstract class C1048257b implements Iterator {
    public int entryIndex;
    public int expectedModCount;
    public final /* synthetic */ C67733cI this$0;
    public int toRemove = -1;

    public C1048257b(C67733cI r3) {
        this.this$0 = r3;
        C90894f1 r1 = r3.backingMap;
        this.entryIndex = r1.firstIndex();
        this.expectedModCount = r1.modCount;
    }

    private void checkForConcurrentModification() {
        if (this.this$0.backingMap.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        checkForConcurrentModification();
        return C13700nu.A0f(this.entryIndex);
    }

    public Object next() {
        if (hasNext()) {
            Object result = result(this.entryIndex);
            int i2 = this.entryIndex;
            this.toRemove = i2;
            this.entryIndex = this.this$0.backingMap.nextIndex(i2);
            return result;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        checkForConcurrentModification();
        C29011Zs.checkRemove(AnonymousClass3K2.A1X(this.toRemove, -1));
        C67733cI r4 = this.this$0;
        r4.size -= (long) r4.backingMap.removeEntry(this.toRemove);
        C90894f1 r2 = this.this$0.backingMap;
        this.entryIndex = r2.nextIndexAfterRemove(this.entryIndex, this.toRemove);
        this.toRemove = -1;
        this.expectedModCount = r2.modCount;
    }

    public abstract Object result(int i2);
}
