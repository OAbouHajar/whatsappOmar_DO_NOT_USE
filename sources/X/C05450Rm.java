package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Rm  reason: invalid class name and case insensitive filesystem */
public abstract class C05450Rm {
    public final AnonymousClass0SM A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final C15220qW A02 = C32521gW.A00(new C11380ig(this));

    public C05450Rm(AnonymousClass0SM r3) {
        this.A00 = r3;
    }

    public C13500mT A00() {
        AnonymousClass0SM r3 = this.A00;
        r3.A08();
        return this.A01.compareAndSet(false, true) ? A01() : r3.A01(A02());
    }

    public final C13500mT A01() {
        return (C13500mT) this.A02.getValue();
    }

    public abstract String A02();

    public void A03(C13500mT r3) {
        C18450wi.A0H(r3, 0);
        if (r3 == A01()) {
            this.A01.set(false);
        }
    }
}
