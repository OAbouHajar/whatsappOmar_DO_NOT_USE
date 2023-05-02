package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.1UY  reason: invalid class name */
public class AnonymousClass1UY implements Iterable {
    public final AnonymousClass01D A00;
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();

    public AnonymousClass1UY(AnonymousClass01D r2) {
        this.A00 = r2;
    }

    public Iterator iterator() {
        return C28021Ua.unmodifiableIterator(C28021Ua.concat(((Set) this.A00.get()).iterator(), this.A01.iterator()));
    }
}
