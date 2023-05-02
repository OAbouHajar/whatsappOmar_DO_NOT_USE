package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0iW  reason: invalid class name and case insensitive filesystem */
public class C11300iW extends AbstractExecutorService implements ScheduledExecutorService {
    public static C11300iW A01;
    public final Handler A00 = AnonymousClass000.A0L();

    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C10900hs(this.A00, obj, runnable);
    }

    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return new C10900hs(this.A00, callable);
    }

    public ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        Handler handler = this.A00;
        C10900hs r2 = new C10900hs(handler, (Object) null, runnable);
        handler.postDelayed(r2, timeUnit.toMillis(j2));
        return r2;
    }

    public ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        Handler handler = this.A00;
        C10900hs r2 = new C10900hs(handler, callable);
        handler.postDelayed(r2, timeUnit.toMillis(j2));
        return r2;
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        C10900hs r0 = new C10900hs(this.A00, (Object) null, runnable);
        execute(r0);
        return r0;
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        C10900hs r0 = new C10900hs(this.A00, obj, runnable);
        execute(r0);
        return r0;
    }

    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        C10900hs r0 = new C10900hs(this.A00, callable);
        execute(r0);
        return r0;
    }
}
