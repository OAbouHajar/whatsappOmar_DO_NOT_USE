package X;

import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Uf  reason: invalid class name and case insensitive filesystem */
public class C28061Uf implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public C28061Uf(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public Thread newThread(Runnable runnable) {
        RunnableRunnableShape11S0200000_I0_9 runnableRunnableShape11S0200000_I0_9 = new RunnableRunnableShape11S0200000_I0_9(this, 24, runnable);
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" #");
        sb.append(this.A02.getAndIncrement());
        return new AnonymousClass1ZS(runnableRunnableShape11S0200000_I0_9, sb.toString());
    }
}
