package X;

import java.util.Iterator;

/* renamed from: X.57g  reason: invalid class name and case insensitive filesystem */
public final class C1048757g implements Iterator, C23861Dq {
    public int A00;
    public final Iterator A01;

    public C1048757g(Iterator it) {
        C18450wi.A0H(it, 1);
        this.A01 = it;
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i2 = this.A00;
        this.A00 = i2 + 1;
        if (i2 >= 0) {
            return new C87194Vu(i2, this.A01.next());
        }
        AnonymousClass1JA.A0T();
        throw AnonymousClass000.A0Z();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
