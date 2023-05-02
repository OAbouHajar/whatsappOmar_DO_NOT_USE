package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Ug  reason: invalid class name and case insensitive filesystem */
public class C28071Ug extends C28081Uh {
    public C28071Ug(BlockingQueue blockingQueue, ThreadFactory threadFactory, TimeUnit timeUnit) {
        super(5, 128, 1, timeUnit, blockingQueue, threadFactory);
    }

    public void afterExecute(Runnable runnable, Throwable th) {
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
    }

    public void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
