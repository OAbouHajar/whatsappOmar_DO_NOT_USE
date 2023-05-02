package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0iV  reason: invalid class name and case insensitive filesystem */
public class C11290iV extends AbstractExecutorService {
    public final C09690fv A00;
    public final String A01 = "SerialExecutor";
    public final BlockingQueue A02;
    public final Executor A03;
    public final AtomicInteger A04;
    public final AtomicInteger A05;
    public volatile int A06;

    public C11290iV(BlockingQueue blockingQueue, Executor executor) {
        this.A03 = executor;
        this.A06 = 1;
        this.A02 = blockingQueue;
        this.A00 = new C09690fv(this);
        this.A05 = new AtomicInteger(0);
        this.A04 = new AtomicInteger(0);
    }

    public final void A00() {
        AtomicInteger atomicInteger = this.A05;
        while (true) {
            int i2 = atomicInteger.get();
            if (i2 < this.A06) {
                int i3 = i2 + 1;
                Class<C11290iV> cls = C11290iV.class;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    AnonymousClass0X1.A00(cls, this.A01, Integer.valueOf(i3), Integer.valueOf(this.A06), "%s: starting worker %d of %d");
                    this.A03.execute(this.A00);
                    return;
                }
                AnonymousClass0X1.A02(cls, this.A01, "%s: race in startWorkerIfNeeded; retrying");
            } else {
                return;
            }
        }
    }

    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        if (runnable != null) {
            BlockingQueue blockingQueue = this.A02;
            if (blockingQueue.offer(runnable)) {
                int size = blockingQueue.size();
                AtomicInteger atomicInteger = this.A04;
                int i2 = atomicInteger.get();
                if (size > i2 && atomicInteger.compareAndSet(i2, size)) {
                    AnonymousClass0X1.A01(C11290iV.class, this.A01, Integer.valueOf(size), "%s: max pending work in queue = %d");
                }
                A00();
                return;
            }
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(this.A01);
            A0o.append(" queue is full, size=");
            throw new RejectedExecutionException(AnonymousClass000.A0l(A0o, blockingQueue.size()));
        }
        throw AnonymousClass000.A0W("runnable parameter is null");
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
