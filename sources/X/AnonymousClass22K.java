package X;

import java.util.Iterator;

/* renamed from: X.22K  reason: invalid class name */
public final class AnonymousClass22K implements AnonymousClass22G {
    public final AnonymousClass22J A00;
    public final AnonymousClass22G A01;
    public final boolean A02;

    public AnonymousClass22K(AnonymousClass22J r1, AnonymousClass22G r2, boolean z2) {
        this.A01 = r2;
        this.A02 = z2;
        this.A00 = r1;
    }

    public Iterator iterator() {
        return new AnonymousClass22L(this);
    }
}
