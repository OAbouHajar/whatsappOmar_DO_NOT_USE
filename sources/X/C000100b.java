package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.00b  reason: invalid class name and case insensitive filesystem */
public class C000100b implements Executor {
    public final Handler A00;

    public C000100b(Handler handler) {
        this.A00 = handler;
    }

    public void execute(Runnable runnable) {
        Handler handler = this.A00;
        if (!handler.post(runnable)) {
            StringBuilder sb = new StringBuilder();
            sb.append(handler);
            sb.append(" is shutting down");
            throw new RejectedExecutionException(sb.toString());
        }
    }
}
