package X;

import java.util.NoSuchElementException;

/* renamed from: X.3cz  reason: invalid class name and case insensitive filesystem */
public abstract class C68163cz extends C28031Ub {
    public Object next;
    public C801942x state = C801942x.NOT_READY;

    private boolean tryToComputeNext() {
        this.state = C801942x.FAILED;
        this.next = computeNext();
        if (this.state == C801942x.DONE) {
            return false;
        }
        this.state = C801942x.READY;
        return true;
    }

    public abstract Object computeNext();

    public final Object endOfData() {
        this.state = C801942x.DONE;
        return null;
    }

    public final boolean hasNext() {
        C801942x r3 = this.state;
        if (r3 != C801942x.FAILED) {
            switch (r3.ordinal()) {
                case 0:
                    return true;
                case 2:
                    return false;
                default:
                    return tryToComputeNext();
            }
        } else {
            throw AnonymousClass3K4.A0V();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.state = C801942x.NOT_READY;
            Object obj = this.next;
            this.next = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
