package X;

import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2PZ  reason: invalid class name */
public class AnonymousClass2PZ implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        RunnableRunnableShape11S0200000_I0_9 runnableRunnableShape11S0200000_I0_9 = new RunnableRunnableShape11S0200000_I0_9(this, 37, runnable);
        StringBuilder sb = new StringBuilder("JobRunner");
        sb.append(" #");
        sb.append(this.A00.getAndIncrement());
        return new Thread(runnableRunnableShape11S0200000_I0_9, sb.toString());
    }
}
