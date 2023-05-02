package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1eR  reason: invalid class name and case insensitive filesystem */
public abstract class C31571eR extends PhantomReference {
    public C31571eR next;
    public C31571eR previous;

    public C31571eR() {
        super((Object) null, C48882Pt.A03);
    }

    public /* synthetic */ C31571eR(C48922Px r1) {
        this();
    }

    public C31571eR(Object obj) {
        super(obj, C48882Pt.A03);
        AtomicReference atomicReference;
        C31571eR r0;
        C48892Pu r2 = C48882Pt.A01;
        do {
            atomicReference = r2.A00;
            r0 = (C31571eR) atomicReference.get();
            this.next = r0;
        } while (!atomicReference.compareAndSet(r0, this));
    }

    public abstract void destruct();
}
