package X;

import java.util.Iterator;

/* renamed from: X.57Q  reason: invalid class name */
public final class AnonymousClass57Q implements Iterator {
    public Iterator A00;
    public final /* synthetic */ C105885Bo A01;

    public AnonymousClass57Q(C105885Bo r2) {
        this.A01 = r2;
        this.A00 = r2.A00.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        throw C13680ns.A0m();
    }
}
