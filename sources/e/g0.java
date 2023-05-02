package e;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: XFMFile */
public final class g0 extends ThreadPoolExecutor {
    public g0() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new n0());
    }

    public final Future submit(Runnable runnable) {
        f0 f0Var = new f0((i) runnable);
        execute(f0Var);
        return f0Var;
    }
}
