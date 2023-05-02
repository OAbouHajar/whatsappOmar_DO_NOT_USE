package X;

import java.util.Iterator;

/* renamed from: X.22x  reason: invalid class name and case insensitive filesystem */
public final class C441322x implements Iterator, C23861Dq {
    public final Iterator A00;
    public final /* synthetic */ AnonymousClass22w A01;

    public C441322x(AnonymousClass22w r2) {
        this.A01 = r2;
        this.A00 = r2.A01.iterator();
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public Object next() {
        return this.A01.A00.AIU(this.A00.next());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
