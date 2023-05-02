package X;

import com.whatsapp.util.RunnableTRunnableShape1S0200000_I0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.1WA  reason: invalid class name */
public class AnonymousClass1WA implements Executor {
    public Runnable A00;
    public final C16320sq A01;
    public final Object A02 = new Object();
    public final Queue A03 = new ArrayDeque();
    public final boolean A04;
    public volatile long A05;

    public AnonymousClass1WA(C16320sq r2, boolean z2) {
        this.A01 = r2;
        this.A04 = z2;
    }

    public synchronized void A00() {
        this.A03.clear();
    }

    public final synchronized void A01() {
        Runnable runnable = (Runnable) this.A03.poll();
        this.A00 = runnable;
        if (runnable != null) {
            if (this.A04) {
                this.A01.Aco(runnable);
            } else {
                this.A01.Acl(runnable);
            }
        }
    }

    public synchronized void A02(Runnable runnable, long j2) {
        C16320sq r2 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("SerialExecutor/executeDelayed/");
        sb.append(runnable.getClass().getName());
        sb.toString();
        r2.Ad4(new RunnableTRunnableShape1S0200000_I0(this, runnable, 6), "SerialExecutor/executeDelayed", j2);
    }

    public synchronized void execute(Runnable runnable) {
        Queue queue = this.A03;
        StringBuilder sb = new StringBuilder();
        sb.append("SerialExecutor/execute/");
        sb.append(runnable.getClass().getName());
        sb.toString();
        queue.offer(new RunnableTRunnableShape1S0200000_I0(this, runnable, 5));
        if (this.A00 == null) {
            A01();
        }
    }
}
