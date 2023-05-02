package X;

import java.util.Iterator;

/* renamed from: X.0hb  reason: invalid class name and case insensitive filesystem */
public abstract class C10730hb implements Iterator, C011605p {
    public AnonymousClass060 A00;
    public AnonymousClass060 A01;

    public C10730hb(AnonymousClass060 r1, AnonymousClass060 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public abstract AnonymousClass060 A00(AnonymousClass060 r1);

    public abstract AnonymousClass060 A01(AnonymousClass060 r1);

    public void AgW(AnonymousClass060 r3) {
        AnonymousClass060 r1 = this.A00;
        if (r1 == r3 && r3 == this.A01) {
            r1 = null;
            this.A01 = null;
            this.A00 = null;
        }
        if (r1 == r3) {
            r1 = A00(r1);
            this.A00 = r1;
        }
        AnonymousClass060 r0 = this.A01;
        if (r0 == r3) {
            this.A01 = (r0 == r1 || r1 == null) ? null : A01(r0);
        }
    }

    public boolean hasNext() {
        return AnonymousClass000.A1V(this.A01);
    }

    public /* bridge */ /* synthetic */ Object next() {
        AnonymousClass060 r1 = this.A01;
        AnonymousClass060 r0 = this.A00;
        this.A01 = (r1 == r0 || r0 == null) ? null : A01(r1);
        return r1;
    }
}
