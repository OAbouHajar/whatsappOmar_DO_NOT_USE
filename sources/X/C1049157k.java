package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57k  reason: invalid class name and case insensitive filesystem */
public final class C1049157k implements Iterator, C23861Dq {
    public Object A00;
    public C799241w A01 = C799241w.NotReady;
    public final HashSet A02;
    public final Iterator A03;
    public final AnonymousClass22J A04;

    public C1049157k(Iterator it, AnonymousClass22J r3) {
        C18450wi.A0H(it, 1);
        this.A03 = it;
        this.A04 = r3;
        this.A02 = C13680ns.A0o();
    }

    public boolean hasNext() {
        C799241w r1;
        C799241w r0 = this.A01;
        C799241w r12 = C799241w.Failed;
        if (r0 != r12) {
            switch (r0.ordinal()) {
                case 0:
                    break;
                case 2:
                    return false;
                default:
                    this.A01 = r12;
                    while (true) {
                        Iterator it = this.A03;
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (this.A02.add(this.A04.AIU(next))) {
                                this.A00 = next;
                                r1 = C799241w.Ready;
                            }
                        } else {
                            r1 = C799241w.Done;
                        }
                    }
                    this.A01 = r1;
                    return r1 == C799241w.Ready;
            }
        }
        throw AnonymousClass000.A0T("Failed requirement.");
    }

    public Object next() {
        if (hasNext()) {
            this.A01 = C799241w.NotReady;
            return this.A00;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
