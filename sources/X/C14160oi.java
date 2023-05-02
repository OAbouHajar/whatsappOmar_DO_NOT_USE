package X;

import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.0oi  reason: invalid class name and case insensitive filesystem */
public class C14160oi implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public C14160oi(String str) {
        C13710nw.A02(str, "Name must not be null");
        this.A00 = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new RunnableRunnableShape1S0100000_I0(runnable));
        newThread.setName(this.A00);
        return newThread;
    }
}
