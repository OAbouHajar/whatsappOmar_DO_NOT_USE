package X;

import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.1Xx  reason: invalid class name and case insensitive filesystem */
public class C28831Xx implements Executor {
    public int A00;
    public final int A01;
    public final C16320sq A02;
    public final Queue A03 = new ArrayDeque();
    public final boolean A04;

    public C28831Xx(C16320sq r2, int i2, boolean z2) {
        this.A02 = r2;
        this.A01 = i2;
        this.A04 = z2;
    }

    public final void A00() {
        Runnable runnable = (Runnable) this.A03.poll();
        if (runnable != null) {
            this.A00++;
            boolean z2 = this.A04;
            C16320sq r0 = this.A02;
            if (z2) {
                r0.Aco(runnable);
            } else {
                r0.Acl(runnable);
            }
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.A03.offer(new RunnableRunnableShape11S0200000_I0_9(this, 22, runnable));
        if (this.A00 < this.A01) {
            A00();
        }
    }
}
