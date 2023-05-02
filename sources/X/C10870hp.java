package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0hp  reason: invalid class name and case insensitive filesystem */
public final class C10870hp implements Executor {
    public Runnable A00;
    public final Object A01 = new Object();
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public C10870hp(Executor executor) {
        this.A03 = executor;
    }

    public final void A00() {
        synchronized (this.A01) {
            Object poll = this.A02.poll();
            Runnable runnable = (Runnable) poll;
            this.A00 = runnable;
            if (poll != null) {
                this.A03.execute(runnable);
            }
        }
    }

    public void execute(Runnable runnable) {
        C18450wi.A0H(runnable, 0);
        synchronized (this.A01) {
            this.A02.offer(new C09900gG(this, runnable));
            if (this.A00 == null) {
                A00();
            }
        }
    }
}
