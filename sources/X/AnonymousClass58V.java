package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.58V  reason: invalid class name */
public final class AnonymousClass58V implements ThreadFactory {
    public static final AtomicInteger A00 = new AtomicInteger();

    public AnonymousClass58V() {
    }

    public /* synthetic */ AnonymousClass58V(AnonymousClass44H r2) {
    }

    public final Thread newThread(Runnable runnable) {
        return new C105685At(runnable, C13680ns.A0i("measurement-", C13690nt.A0g(23), A00.incrementAndGet()));
    }
}
