package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57c  reason: invalid class name and case insensitive filesystem */
public class C1048357c implements Iterator {
    public int currentIndex;
    public int expectedMetadata;
    public int indexToRemove = -1;
    public final /* synthetic */ C105975Bz this$0;

    public C1048357c(C105975Bz r2) {
        this.this$0 = r2;
        this.expectedMetadata = r2.metadata;
        this.currentIndex = r2.firstEntryIndex();
    }

    private void checkForConcurrentModification() {
        if (this.this$0.metadata != this.expectedMetadata) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return C13700nu.A0f(this.currentIndex);
    }

    public void incrementExpectedModCount() {
        this.expectedMetadata += 32;
    }

    public Object next() {
        checkForConcurrentModification();
        if (hasNext()) {
            int i2 = this.currentIndex;
            this.indexToRemove = i2;
            C105975Bz r0 = this.this$0;
            Object access$100 = r0.element(i2);
            this.currentIndex = r0.getSuccessor(i2);
            return access$100;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        checkForConcurrentModification();
        C29011Zs.checkRemove(C13700nu.A0f(this.indexToRemove));
        incrementExpectedModCount();
        C105975Bz r1 = this.this$0;
        r1.remove(r1.element(this.indexToRemove));
        this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
        this.indexToRemove = -1;
    }
}
