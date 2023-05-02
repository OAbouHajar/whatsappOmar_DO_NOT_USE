package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.12E  reason: invalid class name */
public class AnonymousClass12E {
    public volatile AtomicReference A00;

    public AnonymousClass12E(C19490yW r4) {
        this.A00 = new AtomicReference(new AnonymousClass1yO((AnonymousClass1yP) null, r4, false));
    }

    public AnonymousClass1yO A00() {
        Object obj = this.A00.get();
        AnonymousClass00B.A06(obj);
        return (AnonymousClass1yO) obj;
    }
}
