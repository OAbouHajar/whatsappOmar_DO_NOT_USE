package X;

import java.util.Iterator;

/* renamed from: X.58x  reason: invalid class name and case insensitive filesystem */
public final class C1052858x implements AnonymousClass22G {
    public final AnonymousClass22J A00;
    public final AnonymousClass22G A01;

    public C1052858x(AnonymousClass22J r1, AnonymousClass22G r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public Iterator iterator() {
        return new C1049157k(this.A01.iterator(), this.A00);
    }
}
