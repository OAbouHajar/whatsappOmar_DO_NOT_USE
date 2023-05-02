package X;

import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.58Q  reason: invalid class name */
public class AnonymousClass58Q implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        return new AnonymousClass1ZS(new RunnableRunnableShape17S0100000_I1((Object) runnable, 18), AnonymousClass000.A0l(AnonymousClass000.A0r("Google Drive Checksum Calculation Worker #"), this.A00.getAndIncrement()));
    }
}
