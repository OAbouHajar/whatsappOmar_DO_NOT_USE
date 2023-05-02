package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0hu  reason: invalid class name and case insensitive filesystem */
public final class C10920hu implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, AnonymousClass000.A0l(AnonymousClass000.A0r("ModernAsyncTask #"), this.A00.getAndIncrement()));
    }
}
