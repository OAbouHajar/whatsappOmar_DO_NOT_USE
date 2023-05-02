package X;

import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.58S  reason: invalid class name */
public class AnonymousClass58S implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(new RunnableRunnableShape1S0100000_I0(runnable));
        int andIncrement = this.A01.getAndIncrement();
        StringBuilder A0g = C13690nt.A0g("GAC_Executor".length() + 13);
        A0g.append("GAC_Executor");
        A0g.append("[");
        A0g.append(andIncrement);
        newThread.setName(AnonymousClass000.A0h("]", A0g));
        return newThread;
    }
}
