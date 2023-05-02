package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.58U  reason: invalid class name */
public final class AnonymousClass58U implements ThreadFactory {
    public int A00 = 10;
    public final String A01;
    public final ThreadGroup A02 = Thread.currentThread().getThreadGroup();
    public final AtomicInteger A03 = new AtomicInteger(1);

    public AnonymousClass58U(C47742Kf r3) {
        StringBuilder A0r = AnonymousClass000.A0r("cask-");
        A0r.append(r3.name());
        this.A01 = AnonymousClass000.A0h("-pool--thread-", A0r);
        if (r3 == C47742Kf.IDLE) {
            this.A00 = 19;
        }
    }

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.A02;
        RunnableRunnableShape12S0200000_I1 runnableRunnableShape12S0200000_I1 = new RunnableRunnableShape12S0200000_I1(this, 3, runnable);
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A01);
        Thread thread = new Thread(threadGroup, runnableRunnableShape12S0200000_I1, AnonymousClass000.A0l(A0o, this.A03.getAndIncrement()), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
