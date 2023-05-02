package X;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Bk  reason: invalid class name and case insensitive filesystem */
public class C23291Bk implements C16320sq {
    public static C16300so A04;
    public static C28081Uh A05;
    public static final C28051Ue A06;
    public static final BlockingQueue A07;
    public static final Executor A08 = new C28041Ud();
    public static final ThreadPoolExecutor A09;
    public Handler A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    static {
        BlockingQueue r4 = Build.VERSION.SDK_INT >= 21 ? new AnonymousClass1Uc() : new C28101Uj();
        A07 = r4;
        C28051Ue r3 = new C28051Ue();
        A06 = r3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C28071Ug r1 = new C28071Ug(r4, new C28061Uf(10, "OBWhatsApp Worker"), timeUnit);
        A05 = r1;
        r1.setRejectedExecutionHandler(new C28091Ui());
        r3.A00(A05);
        A09 = new C28081Uh(1, Integer.MAX_VALUE, 120, timeUnit, new SynchronousQueue(), new C28061Uf(0, "High Pri Worker"));
    }

    public ThreadPoolExecutor A7d(String str, BlockingQueue blockingQueue, int i2, int i3, int i4, long j2) {
        BlockingQueue blockingQueue2 = blockingQueue;
        C28111Uk r1 = new C28111Uk(this, blockingQueue2, new C28061Uf(i4, str), TimeUnit.SECONDS, i2, i3, j2, true);
        A06.A00(r1);
        return r1;
    }

    public synchronized void Ac3(Runnable runnable) {
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public final void Ack(C16690tT r3, Object... objArr) {
        r3.A02.executeOnExecutor(A05, objArr);
    }

    public void Acl(Runnable runnable) {
        A05.execute(runnable);
    }

    public void Acm(Runnable runnable, String str) {
        Set set = this.A03;
        synchronized (set) {
            if (set.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("WaWorkers/runIfNotRunning/");
                sb.append(str);
                sb.toString();
                Acl(new C28121Ul(this, runnable, str, set));
            }
        }
    }

    public final void Acn(C16690tT r3, Object... objArr) {
        r3.A02.executeOnExecutor(A09, objArr);
    }

    public void Aco(Runnable runnable) {
        A09.execute(runnable);
    }

    public boolean Acp(Runnable runnable, String str) {
        boolean z2;
        Set set = this.A02;
        synchronized (set) {
            if (set.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("WaWorkers/runLatencySensitiveIfNotRunning/");
                sb.append(str);
                sb.toString();
                Aco(new C28121Ul(this, runnable, str, set));
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public synchronized Runnable Ad4(Runnable runnable, String str, long j2) {
        RunnableRunnableShape11S0200000_I0_9 runnableRunnableShape11S0200000_I0_9;
        Handler handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("OBWhatsApp Worker Scheduler", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        runnableRunnableShape11S0200000_I0_9 = new RunnableRunnableShape11S0200000_I0_9(this, 23, runnable);
        handler.postDelayed(runnableRunnableShape11S0200000_I0_9, j2);
        return runnableRunnableShape11S0200000_I0_9;
    }
}
