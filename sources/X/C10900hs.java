package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0hs  reason: invalid class name and case insensitive filesystem */
public class C10900hs implements RunnableFuture, ScheduledFuture {
    public final Handler A00;
    public final FutureTask A01;

    public C10900hs(Handler handler, Object obj, Runnable runnable) {
        this.A00 = handler;
        this.A01 = new FutureTask(runnable, obj);
    }

    public C10900hs(Handler handler, Callable callable) {
        this.A00 = handler;
        this.A01 = new FutureTask(callable);
    }

    public boolean cancel(boolean z2) {
        return this.A01.cancel(z2);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object get() {
        return this.A01.get();
    }

    public Object get(long j2, TimeUnit timeUnit) {
        return this.A01.get(j2, timeUnit);
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean isCancelled() {
        return this.A01.isCancelled();
    }

    public boolean isDone() {
        return this.A01.isDone();
    }

    public void run() {
        this.A01.run();
    }
}
