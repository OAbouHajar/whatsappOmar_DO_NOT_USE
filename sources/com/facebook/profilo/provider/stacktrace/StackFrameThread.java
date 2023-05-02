package com.facebook.profilo.provider.stacktrace;

import X.C32721h1;
import X.C32751h7;
import X.C32841hK;
import X.C32851hM;
import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class StackFrameThread extends C32721h1 {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public C32841hK mSavedTraceContext;
    public int mSystemClockTimeIntervalMs = -1;

    static {
        C32851hM r1 = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = r1.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = r1.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = r1.A02("native_stack_trace");
    }

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null || !(context instanceof Application)) {
            this.mContext = applicationContext;
        } else {
            this.mContext = context;
        }
    }

    public static native int nativeCpuClockResolutionMicros();

    public void disable() {
        if (this.mEnabled) {
            this.mSavedTraceContext = null;
            this.mEnabled = false;
            synchronized (CPUProfiler.class) {
                if (CPUProfiler.sInitialized) {
                    CPUProfiler.nativeStopProfiling();
                }
            }
            Thread thread = this.mProfilerThread;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                return;
            }
        }
        this.mProfilerThread = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010d, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010f, code lost:
        r0.mSavedTraceContext = r1;
        r1 = new java.lang.Thread(new com.facebook.redex.RunnableRunnableShape1S0100000_I0((java.lang.Object) r0, 0), "Prflo:Profiler");
        r0.mProfilerThread = r1;
        r1.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0122, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enable() {
        /*
            r17 = this;
            r0 = r17
            X.1hK r1 = r0.A01
            int r5 = r1.A02
            int r4 = PROVIDER_STACK_FRAME
            int r2 = PROVIDER_WALL_TIME_STACK_TRACE
            r4 = r4 | r2
            r4 = r4 & r5
            r3 = 0
            if (r4 == 0) goto L_0x0011
            r3 = 32753(0x7ff1, float:4.5897E-41)
        L_0x0011:
            int r2 = PROVIDER_NATIVE_STACK_TRACE
            r5 = r5 & r2
            if (r5 == 0) goto L_0x0018
            r3 = r3 | 4
        L_0x0018:
            if (r3 == 0) goto L_0x0025
            java.lang.Thread r2 = r0.mProfilerThread
            if (r2 == 0) goto L_0x0026
            java.lang.String r1 = "StackFrameThread"
            java.lang.String r0 = "Duplicate attempt to enable sampling profiler."
            android.util.Log.e(r1, r0)
        L_0x0025:
            return
        L_0x0026:
            X.1hN r2 = r1.A08
            java.lang.String r3 = "provider.stack_trace.time_source"
            java.util.TreeMap r2 = r2.A04
            if (r2 == 0) goto L_0x0047
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0047
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0047
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x004a }
            java.lang.String r2 = r3.toUpperCase(r2)     // Catch:{ IllegalArgumentException -> 0x004a }
            X.415 r10 = X.AnonymousClass415.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x004a }
            goto L_0x0056
        L_0x0047:
            X.415 r10 = X.AnonymousClass415.NONE
            goto L_0x0056
        L_0x004a:
            r4 = move-exception
            java.lang.String r3 = r4.getMessage()
            java.lang.String r2 = "StackFrameThread"
            android.util.Log.e(r2, r3, r4)
            X.415 r10 = X.AnonymousClass415.NONE
        L_0x0056:
            X.1hN r9 = r1.A08
            java.lang.String r3 = "provider.stack_trace.cpu_sampling_rate_ms"
            r2 = 0
            int r3 = r9.A00(r3, r2)
            java.lang.String r4 = "provider.stack_trace.thread_detect_interval_ms"
            int r8 = r9.A00(r4, r2)
            int r6 = r1.A02
            java.lang.String r4 = "provider.native_stack_trace.unwind_dex_frames"
            r13 = 0
            java.util.TreeMap r7 = r9.A00
            if (r7 == 0) goto L_0x007a
            java.lang.Object r4 = r7.get(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x007a
            boolean r13 = r4.booleanValue()
        L_0x007a:
            r5 = 5
            java.lang.String r4 = "provider.native_stack_trace.unwinder_thread_pri"
            int r14 = r9.A00(r4, r5)
            r5 = 256(0x100, float:3.59E-43)
            java.lang.String r4 = "provider.native_stack_trace.unwinder_queue_size"
            int r15 = r9.A00(r4, r5)
            java.lang.String r4 = "provider.native_stack_trace.log_partial_stacks"
            r16 = 0
            if (r7 == 0) goto L_0x009b
            java.lang.Object r4 = r7.get(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x009b
            boolean r16 = r4.booleanValue()
        L_0x009b:
            monitor-enter(r0)
            android.content.Context r11 = r0.mContext     // Catch:{ Exception -> 0x0123 }
            com.facebook.profilo.logger.MultiBufferLogger r12 = r0.A00()     // Catch:{ Exception -> 0x0123 }
            boolean r4 = com.facebook.profilo.provider.stacktrace.CPUProfiler.init(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0123 }
            if (r4 == 0) goto L_0x012d
            r11 = 23
            if (r3 > 0) goto L_0x00ae
            r3 = 23
        L_0x00ae:
            if (r8 <= 0) goto L_0x00b1
            r11 = r8
        L_0x00b1:
            int r7 = PROVIDER_WALL_TIME_STACK_TRACE     // Catch:{ all -> 0x0134 }
            r4 = r6 & r7
            r5 = 1
            if (r4 != 0) goto L_0x00c4
            int r4 = r10.ordinal()     // Catch:{ all -> 0x0134 }
            switch(r4) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00c6;
                default: goto L_0x00bf;
            }     // Catch:{ all -> 0x0134 }
        L_0x00bf:
            r10 = 0
            goto L_0x00c2
        L_0x00c1:
            r10 = 1
        L_0x00c2:
            r9 = 0
            goto L_0x00c8
        L_0x00c4:
            r10 = 0
            goto L_0x00c7
        L_0x00c6:
            r10 = 1
        L_0x00c7:
            r9 = 1
        L_0x00c8:
            int r4 = PROVIDER_STACK_FRAME     // Catch:{ all -> 0x0134 }
            r4 = r4 | r7
            r4 = r4 & r6
            r8 = 0
            if (r4 == 0) goto L_0x00d1
            r8 = 32753(0x7ff1, float:4.5897E-41)
        L_0x00d1:
            int r4 = PROVIDER_NATIVE_STACK_TRACE     // Catch:{ all -> 0x0134 }
            r6 = r6 & r4
            if (r6 == 0) goto L_0x00d8
            r8 = r8 | 4
        L_0x00d8:
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r7 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r7)     // Catch:{ all -> 0x0134 }
            r6 = 0
            if (r10 != 0) goto L_0x00e1
            if (r9 != 0) goto L_0x00e1
            goto L_0x00f3
        L_0x00e1:
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x0131 }
            com.facebook.profilo.provider.stacktrace.StackTraceWhitelist.nativeAddToWhitelist(r4)     // Catch:{ all -> 0x0131 }
            boolean r4 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x00f3
            boolean r4 = com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeStartProfiling(r8, r3, r11, r10, r9)     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x00f3
            r6 = 1
        L_0x00f3:
            monitor-exit(r7)     // Catch:{ all -> 0x0134 }
            if (r6 == 0) goto L_0x012d
            com.facebook.profilo.logger.MultiBufferLogger r6 = r0.A00()     // Catch:{ all -> 0x0134 }
            r7 = 6
            r8 = 52
            r9 = 0
            r12 = 8126495(0x7c001f, float:1.1387645E-38)
            long r14 = (long) r3     // Catch:{ all -> 0x0134 }
            r11 = 0
            r13 = 0
            r6.writeStandardEntry(r7, r8, r9, r11, r12, r13, r14)     // Catch:{ all -> 0x0134 }
            r0.mEnabled = r5     // Catch:{ all -> 0x0134 }
            boolean r3 = r0.mEnabled     // Catch:{ all -> 0x0134 }
            monitor-exit(r0)
            if (r3 == 0) goto L_0x0025
            r0.mSavedTraceContext = r1
            com.facebook.redex.RunnableRunnableShape1S0100000_I0 r3 = new com.facebook.redex.RunnableRunnableShape1S0100000_I0
            r3.<init>((java.lang.Object) r0, (int) r2)
            java.lang.String r2 = "Prflo:Profiler"
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r3, r2)
            r0.mProfilerThread = r1
            r1.start()
            return
        L_0x0123:
            r3 = move-exception
            java.lang.String r2 = "StackFrameThread"
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x012f }
            android.util.Log.e(r2, r1, r3)     // Catch:{ all -> 0x012f }
        L_0x012d:
            monitor-exit(r0)
            return
        L_0x012f:
            r1 = move-exception
            goto L_0x0133
        L_0x0131:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0134 }
        L_0x0133:
            throw r1     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }

    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if ((r2 & r1) != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTracingProviders() {
        /*
            r4 = this;
            X.1hK r1 = r4.mSavedTraceContext
            boolean r0 = r4.mEnabled
            r3 = 0
            if (r0 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            int r2 = r1.A02
            int r1 = PROVIDER_WALL_TIME_STACK_TRACE
            r0 = r2 & r1
            if (r0 != 0) goto L_0x0017
            int r1 = PROVIDER_STACK_FRAME
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = r3 | r1
        L_0x0018:
            int r0 = PROVIDER_NATIVE_STACK_TRACE
            r2 = r2 & r0
            r2 = r2 | r3
            return r2
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.getTracingProviders():int");
    }

    public final void logAnnotation(String str, String str2) {
        MultiBufferLogger A00 = A00();
        A00.writeBytesEntry(0, 57, A00.writeBytesEntry(0, 56, A00.writeStandardEntry(6, 52, 0, 0, 0, 0, 0), str), str2);
    }

    public void onTraceEnded(C32841hK r5, C32751h7 r6) {
        int i2;
        int i3 = r5.A02;
        int i4 = PROVIDER_STACK_FRAME;
        int i5 = PROVIDER_WALL_TIME_STACK_TRACE;
        if (((i4 | i5) & i3) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int i6 = (PROVIDER_STACK_FRAME | i5) & i3;
            int i7 = 0;
            if (i6 != 0) {
                i7 = 32753;
            }
            if ((PROVIDER_NATIVE_STACK_TRACE & i3) != 0) {
                i7 |= 4;
            }
            synchronized (CPUProfiler.class) {
                i2 = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(i7 & i2));
        }
        if ((i3 & getSupportedProviders()) != 0) {
            logAnnotation("provider.stack_trace.cpu_timer_res_us", Integer.toString(nativeCpuClockResolutionMicros()));
        }
    }

    public void onTraceStarted(C32841hK r2, C32751h7 r3) {
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
    }
}
