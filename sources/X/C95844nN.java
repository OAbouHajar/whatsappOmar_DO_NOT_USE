package X;

import android.os.Process;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4nN  reason: invalid class name and case insensitive filesystem */
public class C95844nN implements C15780rq {
    public Pair A00 = null;
    public RunnableFuture A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public C95844nN(C14990q7 r8, AnonymousClass4CF r9, AnonymousClass4TL r10, Map map) {
        this.A01 = new FutureTask(new C63403Ia(r8, r9, this, r10, map));
    }

    public Pair AcU() {
        RunnableFuture runnableFuture;
        Pair pair;
        synchronized (this) {
            runnableFuture = this.A01;
            pair = this.A00;
        }
        if (pair != null) {
            return pair;
        }
        if (runnableFuture != null) {
            AtomicInteger atomicInteger = this.A02;
            if (atomicInteger.compareAndSet(-1, Process.myTid())) {
                runnableFuture.run();
            }
            Pair pair2 = (Pair) C62003Bg.A01(runnableFuture, atomicInteger.get());
            synchronized (this) {
                this.A00 = pair2;
                this.A01 = null;
            }
            return pair2;
        }
        throw AnonymousClass000.A0V("The future task is null but there is no computed result");
    }
}
