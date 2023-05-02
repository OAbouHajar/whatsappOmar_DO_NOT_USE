package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.58R  reason: invalid class name */
public class AnonymousClass58R implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = new AtomicInteger(1);

    public AnonymousClass58R(String str) {
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        RunnableRunnableShape12S0200000_I1 runnableRunnableShape12S0200000_I1 = new RunnableRunnableShape12S0200000_I1(this, 0, runnable);
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A00);
        A0o.append("-");
        return new Thread(runnableRunnableShape12S0200000_I1, AnonymousClass000.A0l(A0o, this.A01.getAndIncrement()));
    }
}
