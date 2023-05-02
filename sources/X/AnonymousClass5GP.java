package X;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.5GP  reason: invalid class name */
public final class AnonymousClass5GP extends C11510it implements Runnable {
    public static final long A00;
    public static final AnonymousClass5GP A01;
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    static {
        Long l2;
        AnonymousClass5GP r4 = new AnonymousClass5GP();
        A01 = r4;
        r4.A00++;
        r4.A02 = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        A00 = timeUnit.toNanos(l2.longValue());
    }

    public void A08() {
        debugStatus = 4;
        super.A08();
    }

    public Thread A0C() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public void A0E(C1046256e r3, long j2) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public void A0K(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A0K(runnable);
    }

    public final synchronized void A0P() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            this._queue = null;
            this._delayed = null;
            notifyAll();
        }
    }

    public void run() {
        boolean z2;
        C89704cl.A00.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    z2 = false;
                } else {
                    z2 = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (z2) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long A0G = A0G();
                    if (A0G == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = A00 + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            break;
                        } else if (A0G > j3) {
                            A0G = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (A0G > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            break;
                        }
                        LockSupport.parkNanos(this, A0G);
                    }
                }
            }
            _thread = null;
            A0P();
            if (!A0M()) {
                A0C();
            }
        } catch (Throwable th) {
            _thread = null;
            A0P();
            if (!A0M()) {
                A0C();
            }
            throw th;
        }
    }
}
