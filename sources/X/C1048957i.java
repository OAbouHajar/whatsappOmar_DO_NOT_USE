package X;

import java.util.Iterator;

/* renamed from: X.57i  reason: invalid class name and case insensitive filesystem */
public final class C1048957i implements Iterator, C23861Dq {
    public int A00;
    public final Iterator A01;
    public final /* synthetic */ C1052658v A02;

    public C1048957i(C1052658v r2) {
        this.A02 = r2;
        this.A01 = r2.A00.iterator();
    }

    public boolean hasNext() {
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
