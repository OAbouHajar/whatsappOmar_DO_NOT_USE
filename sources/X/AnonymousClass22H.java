package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.22H  reason: invalid class name */
public final class AnonymousClass22H implements AnonymousClass22G {
    public final AtomicReference A00;

    public AnonymousClass22H(AnonymousClass22G r2) {
        this.A00 = new AtomicReference(r2);
    }

    public Iterator iterator() {
        AnonymousClass22G r0 = (AnonymousClass22G) this.A00.getAndSet((Object) null);
        if (r0 != null) {
            return r0.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
