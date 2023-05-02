package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Ui  reason: invalid class name and case insensitive filesystem */
public class C28091Ui implements RejectedExecutionHandler {
    public final AtomicBoolean A00 = new AtomicBoolean();

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C16300so r2;
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (!this.A00.getAndSet(true) && (r2 = C23291Bk.A04) != null) {
            r2.AcB("waworkers-task-queued", String.valueOf(threadPoolExecutor.getActiveCount()), true);
        }
    }
}
