package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.0on  reason: invalid class name and case insensitive filesystem */
public final class C14210on {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final C14240oq A03 = new C14240oq();
    public final Object A04 = new Object();
    public volatile boolean A05;

    public final Exception A00() {
        Exception exc;
        synchronized (this.A04) {
            exc = this.A00;
        }
        return exc;
    }

    public final Object A01() {
        Object obj;
        synchronized (this.A04) {
            C13710nw.A04("Task is not yet complete", this.A02);
            if (!this.A05) {
                Exception exc = this.A00;
                if (exc == null) {
                    obj = this.A01;
                } else {
                    throw new C105565Ac(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return obj;
    }

    public final void A02() {
        synchronized (this.A04) {
            if (!this.A02) {
                this.A02 = true;
                this.A05 = true;
                this.A03.A01(this);
            }
        }
    }

    public final void A03() {
        String str;
        if (this.A02) {
            if (!A09()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception A002 = A00();
            if (A002 != null) {
                str = "failure";
            } else if (A0A()) {
                String valueOf = String.valueOf(A01());
                StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                sb.append("result ");
                sb.append(valueOf);
                str = sb.toString();
            } else {
                str = this.A05 ? "cancellation" : "unknown issue";
            }
            String valueOf2 = String.valueOf(str);
            throw new AnonymousClass445(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), A002);
        }
    }

    public final void A04() {
        synchronized (this.A04) {
            if (this.A02) {
                this.A03.A01(this);
            }
        }
    }

    public final void A05(C14270ot r3, Executor executor) {
        this.A03.A00(new C98884t8(r3, executor));
        A04();
    }

    public final void A06(C14280ou r3, Executor executor) {
        this.A03.A00(new C98894t9(r3, executor));
        A04();
    }

    public final void A07(Exception exc) {
        C13710nw.A02(exc, "Exception must not be null");
        synchronized (this.A04) {
            A03();
            this.A02 = true;
            this.A00 = exc;
        }
        this.A03.A01(this);
    }

    public final void A08(Object obj) {
        synchronized (this.A04) {
            A03();
            this.A02 = true;
            this.A01 = obj;
        }
        this.A03.A01(this);
    }

    public final boolean A09() {
        boolean z2;
        synchronized (this.A04) {
            z2 = this.A02;
        }
        return z2;
    }

    public final boolean A0A() {
        boolean z2;
        synchronized (this.A04) {
            z2 = false;
            if (this.A02 && !this.A05 && this.A00 == null) {
                z2 = true;
            }
        }
        return z2;
    }
}
