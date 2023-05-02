package X;

import com.facebook.redex.IDxCallableShape147S0100000_I1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0hN  reason: invalid class name and case insensitive filesystem */
public final class C10590hN implements Runnable {
    public static AnonymousClass0BF A07;
    public static final BlockingQueue A08;
    public static final Executor A09;
    public static final ThreadFactory A0A;
    public static volatile Executor A0B;
    public final IDxCallableShape147S0100000_I1 A00;
    public final CountDownLatch A01;
    public final FutureTask A02;
    public final AtomicBoolean A03 = new AtomicBoolean();
    public final AtomicBoolean A04 = new AtomicBoolean();
    public volatile C03660Jj A05 = C03660Jj.PENDING;
    public final /* synthetic */ AnonymousClass0F8 A06;

    static {
        C10920hu r7 = new C10920hu();
        A0A = r7;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        A08 = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, r7);
        A09 = threadPoolExecutor;
        A0B = threadPoolExecutor;
    }

    public C10590hN(AnonymousClass0F8 r3) {
        this.A06 = r3;
        IDxCallableShape147S0100000_I1 iDxCallableShape147S0100000_I1 = new IDxCallableShape147S0100000_I1(this, 0);
        this.A00 = iDxCallableShape147S0100000_I1;
        this.A02 = new C11310iX(this, iDxCallableShape147S0100000_I1);
        this.A01 = new CountDownLatch(1);
    }

    public void A00(Object obj) {
        AnonymousClass0BF r3;
        synchronized (C10590hN.class) {
            r3 = A07;
            if (r3 == null) {
                r3 = new AnonymousClass0BF();
                A07 = r3;
            }
        }
        r3.obtainMessage(1, new C04780Nx(this, obj)).sendToTarget();
    }

    public void run() {
        this.A06.A08();
    }
}
