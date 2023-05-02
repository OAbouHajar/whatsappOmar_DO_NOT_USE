package com.facebook.profilo.provider.systemcounters;

import X.C32721h1;
import X.C32841hK;
import X.C32851hM;
import X.C63743Li;
import X.C87334Wi;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.facebook.jni.HybridData;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.soloader.SoLoader;

public final class SystemCounterThread extends C32721h1 {
    public static final int PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    public static final int PROVIDER_SYSTEM_COUNTERS;
    public boolean mAllThreadsMode;
    public boolean mEnabled;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public volatile boolean mHighFrequencyMode;
    public HybridData mHybridData;
    public C87334Wi mSystemCounterLogger = new C87334Wi(A00());

    public class WhitelistApi {
        static {
            SoLoader.A06("profilo_systemcounters");
        }

        public static void add(int i2) {
            SystemCounterThread.nativeAddToWhitelist(i2);
        }

        public static void remove(int i2) {
            SystemCounterThread.nativeRemoveFromWhitelist(i2);
        }
    }

    static {
        C32851hM r1 = ProvidersRegistry.A00;
        PROVIDER_SYSTEM_COUNTERS = r1.A02("system_counters");
        PROVIDER_HIGH_FREQ_THREAD_COUNTERS = r1.A02("high_freq_main_thread_counters");
    }

    public SystemCounterThread() {
        super("profilo_systemcounters");
    }

    private native HybridData initHybrid(MultiBufferLogger multiBufferLogger);

    public static native void nativeAddToWhitelist(int i2);

    public static native void nativeRemoveFromWhitelist(int i2);

    public synchronized void disable() {
        if (this.mEnabled) {
            this.mSystemCounterLogger.A00();
            if (this.mAllThreadsMode) {
                logCounters();
                logExpensiveCounters();
            }
            if (this.mHighFrequencyMode) {
                logHighFrequencyThreadCounters();
                logTraceAnnotations();
            }
        }
        this.mEnabled = false;
        this.mAllThreadsMode = false;
        this.mHighFrequencyMode = false;
        nativeSetHighFrequencyMode(false);
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
            this.mHybridData = null;
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mHandler = null;
        Debug.stopAllocCounting();
    }

    public synchronized void enable() {
        synchronized (this) {
            this.mHybridData = initHybrid(A00());
            this.mEnabled = true;
            if (this.mHandler == null) {
                HandlerThread handlerThread = new HandlerThread("Prflo:Counters");
                this.mHandlerThread = handlerThread;
                handlerThread.start();
                this.mHandler = new C63743Li(this.mHandlerThread.getLooper(), this);
            }
            C32841hK r4 = this.A01;
            boolean z2 = false;
            if ((PROVIDER_SYSTEM_COUNTERS & TraceEvents.sProviders) != 0) {
                z2 = true;
            }
            if (z2) {
                this.mHighFrequencyMode = false;
                nativeSetHighFrequencyMode(false);
                this.mAllThreadsMode = true;
                Debug.startAllocCounting();
                C87334Wi r2 = this.mSystemCounterLogger;
                r2.A00 = 0;
                r2.A01 = 0;
                r2.A04 = 0;
                r2.A05 = 0;
                r2.A02 = 0;
                r2.A03 = 0;
                r2.A06 = 0;
                r2.A07 = 0;
                r2.A08 = 0;
                r2.A09 = 0;
                int i2 = 50;
                if (r4 != null) {
                    i2 = r4.A08.A00("provider.system_counters.sampling_rate_ms", 50);
                }
                this.mHandler.obtainMessage(1, i2, 0).sendToTarget();
                int i3 = 1000;
                if (r4 != null) {
                    i3 = r4.A08.A00("provider.system_counters.expensive_sampling_rate_ms", 1000);
                }
                this.mHandler.obtainMessage(3, i3, 0).sendToTarget();
            }
            if ((PROVIDER_HIGH_FREQ_THREAD_COUNTERS & TraceEvents.sProviders) != 0) {
                nativeAddToWhitelist(Process.myPid());
                this.mHighFrequencyMode = true;
                nativeSetHighFrequencyMode(true);
                int i4 = 7;
                if (r4 != null) {
                    i4 = r4.A08.A00("provider.high_freq_main_thread_counters.sampling_rate_ms", 7);
                }
                this.mHandler.obtainMessage(2, i4, 0).sendToTarget();
            }
        }
    }

    public int getSupportedProviders() {
        return PROVIDER_SYSTEM_COUNTERS | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    }

    public int getTracingProviders() {
        int i2 = 0;
        if (!this.mEnabled) {
            return 0;
        }
        if (this.mAllThreadsMode) {
            i2 = 0 | PROVIDER_SYSTEM_COUNTERS;
        }
        return this.mHighFrequencyMode ? i2 | PROVIDER_HIGH_FREQ_THREAD_COUNTERS : i2;
    }

    public native void logCounters();

    public native void logExpensiveCounters();

    public native void logHighFrequencyThreadCounters();

    public native void logTraceAnnotations();

    public native void nativeSetHighFrequencyMode(boolean z2);
}
