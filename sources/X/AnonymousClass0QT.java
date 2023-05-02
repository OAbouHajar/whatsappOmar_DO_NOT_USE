package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0QT  reason: invalid class name */
public abstract class AnonymousClass0QT {
    public AnonymousClass0QT A00;
    public AnonymousClass0PW A01;
    public AtomicInteger A02 = new AtomicInteger(0);
    public boolean A03;

    public void A00() {
        AnonymousClass0QT r1 = this.A00;
        if (r1 != null) {
            throw AnonymousClass000.A0V(AnonymousClass000.A0g("Already added to ", r1));
        }
    }

    public void A01(AnonymousClass0PW r4) {
        String str;
        int incrementAndGet = this.A02.incrementAndGet();
        if (incrementAndGet == 1) {
            this.A01 = r4;
            if (!this.A03) {
                this.A03 = true;
                return;
            }
            str = "Internal bug, expected object to be immutable";
        } else {
            str = AnonymousClass000.A0l(AnonymousClass000.A0r("Acquired object with non-zero initial refCount current = "), incrementAndGet);
        }
        throw AnonymousClass000.A0V(str);
    }
}
