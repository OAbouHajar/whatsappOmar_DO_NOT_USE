package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.2Fl  reason: invalid class name and case insensitive filesystem */
public class C46682Fl extends ScheduledThreadPoolExecutor {
    public final /* synthetic */ C23291Bk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46682Fl(C23291Bk r2, ThreadFactory threadFactory) {
        super(1, threadFactory);
        this.A00 = r2;
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (runnable instanceof Future) {
            Future future = (Future) runnable;
            if (future.isDone()) {
                try {
                    future.get();
                } catch (InterruptedException unused) {
                } catch (ExecutionException e2) {
                    th = e2.getCause();
                }
            }
        }
        if (th != null) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
    }
}
