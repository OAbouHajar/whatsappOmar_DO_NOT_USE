package X;

import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.2Pa  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Pa implements RejectedExecutionHandler {
    public final /* synthetic */ AnonymousClass1Z5 A00;
    public final /* synthetic */ C28811Xu A01;

    public /* synthetic */ AnonymousClass2Pa(AnonymousClass1Z5 r1, C28811Xu r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AnonymousClass1Z5 r3 = this.A00;
        C28811Xu r2 = this.A01;
        if (runnable instanceof RunnableRunnableShape11S0200000_I0_9) {
            RunnableRunnableShape11S0200000_I0_9 runnableRunnableShape11S0200000_I0_9 = (RunnableRunnableShape11S0200000_I0_9) runnable;
            if (runnableRunnableShape11S0200000_I0_9.A02 == 36) {
                Job job = (Job) runnableRunnableShape11S0200000_I0_9.A00;
                r2.A02(job);
                String str = job.parameters.groupId;
                if (str != null) {
                    synchronized (r2) {
                        r2.A03.remove(str);
                        r2.A05.A00.open();
                    }
                }
            }
        }
        try {
            r3.A00.getQueue().put(new RunnableRunnableShape0S0000000_I0(14));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
