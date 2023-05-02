package X;

import android.os.Process;
import com.whatsapp.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.00D  reason: invalid class name */
public class AnonymousClass00D extends Thread {
    public static final Runnable A05 = new AnonymousClass00E();
    public static final String A06;
    public AnonymousClass01K A00;
    public final AnonymousClass00F A01 = new AnonymousClass00F(20, 20);
    public final BlockingQueue A02 = new ArrayBlockingQueue(2048, true);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicInteger A04 = new AtomicInteger(0);

    static {
        StringBuilder sb = new StringBuilder("Logger (");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("2.23.1.76");
        sb2.append("(");
        sb2.append(438774090);
        sb2.append(")");
        sb.append(sb2.toString());
        sb.append(')');
        A06 = sb.toString();
    }

    public AnonymousClass00D() {
        super(A06);
    }

    public final void A00() {
        AnonymousClass01K r3;
        Object obj = null;
        do {
            try {
                obj = this.A02.take();
                continue;
            } catch (InterruptedException unused) {
            }
        } while (obj == null);
        if (obj instanceof String) {
            Log.doLogToFile((String) obj);
        } else if (obj instanceof FutureTask) {
            ((FutureTask) obj).run();
        } else {
            throw new IllegalStateException("Invalid log item type");
        }
        AtomicBoolean atomicBoolean = this.A03;
        if (atomicBoolean.get() && this.A02.isEmpty()) {
            Log.blockingLog(2, "==========log/emptyingqueue/end==========");
            StringBuilder sb = new StringBuilder("==========log/emptyingqueue/skipped ");
            AtomicInteger atomicInteger = this.A04;
            sb.append(atomicInteger);
            sb.append(" entries==========");
            Log.blockingLog(2, sb.toString());
            atomicInteger.set(0);
            atomicBoolean.set(false);
            if (this.A01.A00()) {
                synchronized (this) {
                    r3 = this.A00;
                    if (r3 == null) {
                        throw new NullPointerException();
                    }
                }
                r3.AcB("Log/doLogLoop", "Logging queue became full", true);
            }
        }
    }

    public final void A01(Object obj) {
        if (Thread.currentThread() != this) {
            AtomicBoolean atomicBoolean = this.A03;
            if (!atomicBoolean.get()) {
                if (this.A02.offer(obj)) {
                    return;
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    Log.blockingLog(2, "==========log/emptyingqueue/start==========");
                }
            }
            this.A04.incrementAndGet();
            return;
        }
        Log.blockingLog(1, "Cannot add a log item from the logging thread. Attempting to crash.");
        throw new AssertionError("Cannot add a log item from the logging thread.");
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            A00();
        }
    }
}
