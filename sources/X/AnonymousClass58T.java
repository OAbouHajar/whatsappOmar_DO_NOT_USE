package X;

import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.58T  reason: invalid class name */
public final class AnonymousClass58T implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = new AtomicInteger(0);

    public AnonymousClass58T(String str) {
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        RunnableRunnableShape17S0100000_I1 runnableRunnableShape17S0100000_I1 = new RunnableRunnableShape17S0100000_I1((Object) runnable, 17);
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A00);
        return new AnonymousClass1ZS(runnableRunnableShape17S0100000_I1, AnonymousClass000.A0l(A0o, this.A01.getAndIncrement()));
    }
}
