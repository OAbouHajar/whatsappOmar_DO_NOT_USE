package X;

import com.google.common.collect.IDxItrShape49S0100000_2_I1;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57e  reason: invalid class name and case insensitive filesystem */
public abstract class C1048557e implements Iterator {
    public int currentIndex;
    public int expectedMetadata;
    public int indexToRemove;
    public final /* synthetic */ C105935Bu this$0;

    public C1048557e(C105935Bu r2) {
        this.this$0 = r2;
        this.expectedMetadata = r2.metadata;
        this.currentIndex = r2.firstEntryIndex();
        this.indexToRemove = -1;
    }

    public /* synthetic */ C1048557e(C105935Bu r2, IDxItrShape49S0100000_2_I1 iDxItrShape49S0100000_2_I1) {
        this(r2);
    }

    private void checkForConcurrentModification() {
        if (this.this$0.metadata != this.expectedMetadata) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object getOutput(int i2);

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
            Object output = getOutput(i2);
            this.currentIndex = this.this$0.getSuccessor(i2);
            return output;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        checkForConcurrentModification();
        C29011Zs.checkRemove(C13700nu.A0f(this.indexToRemove));
        incrementExpectedModCount();
        C105935Bu r1 = this.this$0;
        r1.remove(r1.key(this.indexToRemove));
        this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
        this.indexToRemove = -1;
    }
}
