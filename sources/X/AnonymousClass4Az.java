package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Az  reason: invalid class name */
public final class AnonymousClass4Az {
    public static final BlockingQueue A00;
    public static final ThreadFactory A01;
    public static final ThreadPoolExecutor A02;

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(4);
        A00 = linkedBlockingQueue;
        AnonymousClass58Q r8 = new AnonymousClass58Q();
        A01 = r8;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 1, TimeUnit.SECONDS, linkedBlockingQueue, r8);
        A02 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new AnonymousClass58N());
    }
}
