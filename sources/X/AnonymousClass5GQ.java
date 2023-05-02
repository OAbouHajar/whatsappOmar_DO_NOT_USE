package X;

import java.util.concurrent.locks.LockSupport;

/* renamed from: X.5GQ  reason: invalid class name */
public abstract class AnonymousClass5GQ extends AnonymousClass5GR {
    public abstract Thread A0C();

    public final void A0D() {
        Thread A0C = A0C();
        if (Thread.currentThread() != A0C) {
            LockSupport.unpark(A0C);
        }
    }

    public void A0E(C1046256e r2, long j2) {
        AnonymousClass5GP.A01.A0L(r2, j2);
    }
}
