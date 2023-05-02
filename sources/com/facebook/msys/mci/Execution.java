package com.facebook.msys.mci;

import X.C004201v;
import X.C48852Pq;
import X.C48862Pr;
import X.C48872Ps;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape0S0001000_I0;
import com.facebook.simplejni.NativeHolder;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class Execution {
    public static final int INVALID_THREAD_PRIORITY = Integer.MIN_VALUE;
    public static volatile boolean sInitialized;
    public static final Set sThreadIds = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final ThreadLocal sThreadLocalExecutionContext = new C48852Pq();
    public static final AtomicInteger sThreadPriority = new AtomicInteger(Integer.MIN_VALUE);
    public static Executor sUiThreadSchedulingExecutor;

    public static void assertInitialized(String str) {
        if (!sInitialized) {
            StringBuilder sb = new StringBuilder("Execution was called by ");
            sb.append(str);
            sb.append(" but was not initialized before being used");
            throw new RuntimeException(sb.toString());
        }
    }

    public static boolean callingThreadMatchesExecutionContext(int i2) {
        try {
            return getExecutionContext() == i2;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static void ensureNotOnDiskIoThread() {
        if (sInitialized && getExecutionContext() == 2) {
            throw new IllegalStateException("The task can not run on DiskIO thread");
        }
    }

    public static void ensureNotOnMsysThread() {
        if (isOnMsysThread()) {
            throw new IllegalStateException("The task cannot run on any MSYS thread");
        }
    }

    public static void executeAfter(C48862Pr r1, int i2, long j2) {
        executeAfterWithPriority(r1, i2, 0, j2);
    }

    public static void executeAfterWithPriority(C48862Pr r2, int i2, int i3, long j2) {
        assertInitialized(r2.toString());
        if (sUiThreadSchedulingExecutor == null || Looper.myLooper() != Looper.getMainLooper()) {
            executeAfterWithPriorityInternal(r2, i2, i3, j2);
        } else {
            sUiThreadSchedulingExecutor.execute(new C48872Ps(r2, i2, i3, j2));
        }
    }

    public static void executeAfterWithPriorityInternal(C48862Pr r6, int i2, int i3, long j2) {
        if (!nativeScheduleTask(r6, i2, i3, ((double) j2) / 1000.0d, r6.toString())) {
            StringBuilder sb = new StringBuilder("UNKNOWN execution context ");
            sb.append(i2);
            throw new RuntimeException(sb.toString());
        }
    }

    public static void executeAsync(C48862Pr r1, int i2) {
        executeAsyncWithPriority(r1, i2, 0);
    }

    public static void executeAsyncWithPriority(C48862Pr r2, int i2, int i3) {
        assertInitialized(r2.toString());
        executeAfterWithPriority(r2, i2, i3, 0);
    }

    public static void executePossiblySync(C48862Pr r1, int i2) {
        assertInitialized(r1.toString());
        if (callingThreadMatchesExecutionContext(i2)) {
            r1.run();
        } else {
            executeAsyncWithPriority(r1, i2, 0);
        }
    }

    public static int getExecutionContext() {
        return ((Number) sThreadLocalExecutionContext.get()).intValue();
    }

    public static synchronized boolean initialize() {
        boolean initialize;
        synchronized (Execution.class) {
            initialize = initialize((Executor) null);
        }
        return initialize;
    }

    public static synchronized boolean initialize(Executor executor) {
        boolean z2;
        synchronized (Execution.class) {
            C004201v.A01("Execution.initialize");
            try {
                if (sInitialized) {
                    z2 = false;
                } else {
                    sUiThreadSchedulingExecutor = executor;
                    nativeInitialize();
                    synchronized (TaskTracker.class) {
                        int i2 = 0;
                        if (!TaskTracker.sInitialized) {
                            TaskTracker[] taskTrackerArr = {TaskTracker.TRACKER_MAIN, TaskTracker.TRACKER_DISK_IO, TaskTracker.TRACKER_NETWORK, TaskTracker.TRACKER_DECODING, TaskTracker.TRACKER_CRYPTO};
                            int[] iArr = new int[5];
                            String[] strArr = new String[5];
                            int i3 = 0;
                            do {
                                iArr[i3] = taskTrackerArr[i3].mExecutionContext;
                                strArr[i3] = taskTrackerArr[i3].mQueueName;
                                i3++;
                            } while (i3 < 5);
                            NativeHolder[] initNativeHolders = TaskTracker.initNativeHolders(iArr, strArr);
                            do {
                                taskTrackerArr[i2].mNativeHolder = initNativeHolders[i2];
                                i2++;
                            } while (i2 < 5);
                            TaskTracker.sInitialized = true;
                        }
                    }
                    z2 = true;
                    sInitialized = true;
                }
                C004201v.A00();
            } catch (Throwable th) {
                C004201v.A00();
                throw th;
            }
        }
        return z2;
    }

    public static boolean isOnMsysThread() {
        return sInitialized && getExecutionContext() != 0;
    }

    public static native int nativeGetExecutionContext();

    public static native void nativeInitialize();

    public static native void nativeResetExecutorsTestingOnly();

    public static native boolean nativeScheduleTask(Runnable runnable, int i2, int i3, double d2, String str);

    public static native void nativeStartExecutor(int i2);

    public static void resetExecutorsForTestingOnly() {
        sThreadIds.clear();
        nativeResetExecutorsTestingOnly();
    }

    public static boolean setInitializedForTestingOnly(boolean z2) {
        boolean z3 = sInitialized;
        sInitialized = z2;
        return z3;
    }

    public static native void setLoggingThresholds(double d2, double d3);

    public static void setThreadPriorities(Integer num) {
        sThreadPriority.set(num.intValue());
    }

    public static Executor setUiThreadSchedulingExecutorForTestingOnly(Executor executor) {
        Executor executor2 = sUiThreadSchedulingExecutor;
        sUiThreadSchedulingExecutor = executor;
        return executor2;
    }

    public static void startExecutorThread(int i2, String str) {
        RunnableRunnableShape0S0001000_I0 runnableRunnableShape0S0001000_I0 = new RunnableRunnableShape0S0001000_I0(i2, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Context");
        new Thread(runnableRunnableShape0S0001000_I0, sb.toString()).start();
    }
}
