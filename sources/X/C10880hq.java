package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0hq  reason: invalid class name and case insensitive filesystem */
public class C10880hq implements Executor {
    public Runnable A00;
    public final Object A01 = new Object();
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public C10880hq(Executor executor) {
        this.A03 = executor;
    }

    public void A00() {
        Runnable runnable = (Runnable) this.A02.poll();
        this.A00 = runnable;
        if (runnable != null) {
            this.A03.execute(runnable);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.A01) {
            this.A02.add(new C10030gT(this, runnable));
            if (this.A00 == null) {
                A00();
            }
        }
    }
}
