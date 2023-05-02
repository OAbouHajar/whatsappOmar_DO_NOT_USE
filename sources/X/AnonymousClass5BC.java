package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5BC  reason: invalid class name */
public abstract class AnonymousClass5BC extends PhantomReference {
    public AnonymousClass5BC A00;
    public AnonymousClass5BC A01;

    public AnonymousClass5BC() {
        super((Object) null, AnonymousClass4Z9.A03);
    }

    public AnonymousClass5BC(Object obj) {
        super(obj, AnonymousClass4Z9.A03);
        AtomicReference atomicReference;
        AnonymousClass5BC r0;
        C82114Bg r2 = AnonymousClass4Z9.A01;
        do {
            atomicReference = r2.A00;
            r0 = (AnonymousClass5BC) atomicReference.get();
            this.A00 = r0;
        } while (!atomicReference.compareAndSet(r0, this));
    }

    public abstract void destruct();
}
