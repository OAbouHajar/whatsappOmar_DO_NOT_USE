package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57j  reason: invalid class name and case insensitive filesystem */
public final class C1049057j implements Iterator, C23861Dq {
    public int A00 = 50;
    public final Iterator A01;
    public final /* synthetic */ C1052758w A02;

    public C1049057j(C1052758w r2) {
        this.A02 = r2;
        this.A01 = r2.A00.iterator();
    }

    public boolean hasNext() {
        return this.A00 > 0 && this.A01.hasNext();
    }

    public Object next() {
        int i2 = this.A00;
        if (i2 != 0) {
            this.A00 = i2 - 1;
            return this.A01.next();
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
