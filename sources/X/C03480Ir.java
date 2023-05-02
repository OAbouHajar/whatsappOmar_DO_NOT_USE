package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.0Ir  reason: invalid class name and case insensitive filesystem */
public class C03480Ir extends C11290iV implements ExecutorService {
    public C03480Ir(Executor executor) {
        super(new LinkedBlockingQueue(), executor);
    }

    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
