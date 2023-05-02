package X;

import java.util.ListIterator;

/* renamed from: X.57m  reason: invalid class name and case insensitive filesystem */
public final class C1049357m implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ C105905Bq A01;

    public C1049357m(C105905Bq r2, int i2) {
        this.A01 = r2;
        this.A00 = r2.A00.listIterator(i2);
    }

    public final /* synthetic */ void add(Object obj) {
        throw C13680ns.A0m();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    public final int previousIndex() {
        return this.A00.previousIndex();
    }

    public final void remove() {
        throw C13680ns.A0m();
    }

    public final /* synthetic */ void set(Object obj) {
        throw C13680ns.A0m();
    }
}
