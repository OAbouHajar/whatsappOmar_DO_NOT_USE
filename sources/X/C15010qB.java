package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0qB  reason: invalid class name and case insensitive filesystem */
public final class C15010qB extends ThreadPoolExecutor {
    public final /* synthetic */ C15000qA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15010qB(C15000qA r10) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.A00 = r10;
        setThreadFactory(new AnonymousClass58V((AnonymousClass44H) null));
        allowCoreThreadTimeOut(true);
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new AnonymousClass5CY(this, obj, runnable);
    }
}
