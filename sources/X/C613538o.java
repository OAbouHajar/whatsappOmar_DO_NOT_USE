package X;

import android.content.Context;
import android.os.Process;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.38o  reason: invalid class name and case insensitive filesystem */
public class C613538o {
    public final int A00;
    public final int A01;
    public final int A02;
    public final RunnableFuture A03;
    public final AtomicInteger A04 = new AtomicInteger(-1);
    public volatile C89994dK A05;

    public C613538o(Context context, C89994dK r4, C15780rq r5, Object obj, int i2, int i3, int i4) {
        this.A05 = r4;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A03 = new FutureTask(new AnonymousClass3IZ(context, this, r5, obj));
    }

    public C89994dK A00() {
        RuntimeException runtimeException;
        AtomicInteger atomicInteger = this.A04;
        boolean compareAndSet = atomicInteger.compareAndSet(-1, Process.myTid());
        RunnableFuture runnableFuture = this.A03;
        if (!compareAndSet) {
            return (C89994dK) C62003Bg.A01(runnableFuture, atomicInteger.get());
        }
        runnableFuture.run();
        try {
            C89994dK r0 = (C89994dK) runnableFuture.get();
            this.A05 = null;
            return r0;
        } catch (InterruptedException e2) {
            runtimeException = new RuntimeException(e2);
        } catch (ExecutionException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            runtimeException = new RuntimeException(e3.getCause());
        } catch (Throwable th) {
            this.A05 = null;
            throw th;
        }
        throw runtimeException;
    }
}
