package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.67J  reason: invalid class name */
public class AnonymousClass67J implements AnonymousClass01J {
    public AnonymousClass01T A00;

    public AnonymousClass67J(AnonymousClass01J r4) {
        this.A00 = new AnonymousClass01T((Object) null, new AnonymousClass67I(r4));
    }

    public Object get() {
        return ((AtomicReference) this.A00.get()).get();
    }
}
