package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import com.facebook.profilo.provider.stacktrace.StackFrameThread;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;
import com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider;
import com.facebook.redex.RunnableRunnableShape0S1201000_I0;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.facebook.soloader.SoLoader;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.10F  reason: invalid class name */
public class AnonymousClass10F {
    public static volatile boolean A0U;
    public int A00 = -1;
    public int A01 = 1;
    public AnonymousClass00F A02;
    public C31081dR A03;
    public C32831hJ A04;
    public C32821hI A05;
    public Long A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A = new Handler(Looper.getMainLooper());
    public final C24391Ft A0B;
    public final C15900s5 A0C;
    public final C16440t3 A0D;
    public final C16980tz A0E;
    public final AnonymousClass013 A0F;
    public final C14710pd A0G;
    public final C16490t9 A0H;
    public final AnonymousClass008 A0I;
    public final AnonymousClass1FS A0J;
    public final AnonymousClass00F A0K = new AnonymousClass00F(1, 200, 1000);
    public final AnonymousClass00F A0L = new AnonymousClass00F(10, 2000, SearchActionVerificationClientService.NOTIFICATION_ID);
    public final AnonymousClass00F A0M = new AnonymousClass00F(10, 1000, 25000);
    public final AnonymousClass00F A0N = new AnonymousClass00F(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000);
    public final AnonymousClass00F A0O = new AnonymousClass00F(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000);
    public final AnonymousClass00F A0P = new AnonymousClass00F(10, 2000, SearchActionVerificationClientService.NOTIFICATION_ID);
    public final AnonymousClass01b A0Q;
    public final AnonymousClass17S A0R;
    public final C19500yX A0S;
    public final C16320sq A0T;

    public AnonymousClass10F(C24391Ft r7, C15900s5 r8, C16440t3 r9, C16980tz r10, AnonymousClass013 r11, C14710pd r12, C16490t9 r13, AnonymousClass008 r14, AnonymousClass1FS r15, AnonymousClass01b r16, AnonymousClass17S r17, C19500yX r18, C16320sq r19) {
        this.A0D = r9;
        this.A0G = r12;
        this.A0E = r10;
        this.A0T = r19;
        this.A0B = r7;
        this.A0H = r13;
        this.A0C = r8;
        this.A0I = r14;
        this.A0F = r11;
        this.A0J = r15;
        this.A0Q = r16;
        this.A0S = r18;
        this.A0R = r17;
    }

    public void A00() {
        C004201v.A01("wa_startup_complete");
        C004201v.A00();
        C31081dR r1 = this.A03;
        if (r1 != null) {
            r1.A07("render");
            C31081dR r3 = this.A03;
            if (r3 != null) {
                r3.A0A("locale", this.A0F.A07(), true);
                this.A03.A0C(2);
            }
        }
    }

    public void A01() {
        if (C32701gz.A00()) {
            C14710pd r2 = this.A0G;
            C16620tM r1 = C16620tM.A02;
            if (r2.A0E(r1, 2794) && r2.A0E(r1, 2395)) {
                new AnonymousClass1ZS(new RunnableRunnableShape12S0100000_I0_11(this, 10), "startup preload worker").start();
                return;
            }
            return;
        }
        A02();
        C14710pd r22 = this.A0G;
        C16620tM r12 = C16620tM.A02;
        if (!r22.A0E(r12, 2794) && r22.A0E(r12, 2395)) {
            new AnonymousClass1ZS(new RunnableRunnableShape12S0100000_I0_11(this, 10), "startup preload worker").start();
        }
        this.A0A.post(new RunnableRunnableShape12S0100000_I0_11(this, 12));
        this.A02 = this.A0K;
        this.A01 = 1;
        A03(24772609, "AppInit");
    }

    public final void A02() {
        C31081dR r2 = this.A03;
        if (r2 == null) {
            C31081dR r0 = new C31081dR(this.A0D, this.A0H, this.A0R, this.A0S, "StartupTracker", 703928054);
            this.A03 = r0;
            r0.A06.A03 = true;
            return;
        }
        r2.A0B("is_object_already_create", true, true);
    }

    public final void A03(int i2, String str) {
        long j2;
        String str2;
        AnonymousClass00F r0;
        C32711h0 r02;
        Long l2;
        C32671gw r03;
        C32671gw r4;
        long abs;
        String str3;
        int length;
        Buffer buffer;
        int i3;
        long j3;
        long j4;
        boolean z2;
        boolean z3;
        C32721h1[] r13;
        ArrayList arrayList;
        Boolean bool;
        IllegalStateException th;
        C32771h9 r8;
        IllegalStateException th2;
        int i4 = i2;
        this.A00 = i4;
        this.A07 = str;
        AnonymousClass008 r3 = this.A0I;
        if (i4 != 24772609) {
            r3.A00 = SystemClock.elapsedRealtime();
            r3.A01 = SystemClock.uptimeMillis();
            r3.A02 = System.nanoTime();
            j2 = -1;
            switch (i2) {
                case 24772610:
                    str2 = "lukewarm";
                    break;
                default:
                    str2 = "warm";
                    break;
            }
        } else {
            j2 = r3.A02;
            str2 = "cold";
        }
        C31081dR r10 = this.A03;
        if (r10 != null) {
            if (j2 > 0) {
                r10.A0D("StartupTracker", j2);
            } else {
                r10.A08.AKz(r10.A06.A05, 4);
                r10.A0D("StartupTracker", -1);
            }
            this.A03.A0A("startup_type", str2, true);
        }
        switch (i2) {
            case 24772609:
                r0 = this.A0M;
                break;
            case 24772610:
                r0 = this.A0O;
                break;
            default:
                r0 = this.A0N;
                break;
        }
        boolean A002 = r0.A00();
        this.A09 = A002;
        if (A002 && this.A0C.A05(C15910s6.A0t)) {
            Context context = this.A0E.A00;
            int i5 = C32661gv.A00;
            if (i5 == 0) {
                try {
                    C31131dW.A00(context);
                    SparseArray sparseArray = new SparseArray(1);
                    sparseArray.put(C32681gx.A02, new C32681gx());
                    C32711h0 r1 = new C32711h0();
                    C32661gv.A01 = r1;
                    C32751h7 r9 = new C32751h7(context, new C32741h6(), new File(context.getCacheDir(), "profilo"), new C32721h1[]{r1, new SystemCounterThread(), new ThreadMetadataProvider(), new StackFrameThread(context), new C32731h5()});
                    if (C32751h7.A09.compareAndSet((Object) null, r9)) {
                        synchronized (r9) {
                            try {
                                r8 = C32741h6.A00;
                            } catch (Throwable th3) {
                                while (true) {
                                    th = th3;
                                }
                            }
                        }
                        synchronized (r9) {
                            try {
                                C32781hA r32 = r9.A01;
                                File file = r32.A06;
                                MmapBufferManager mmapBufferManager = new MmapBufferManager(r32.A04);
                                r9.A02 = mmapBufferManager;
                                if (C32671gw.A0A == null) {
                                    synchronized (C32671gw.class) {
                                        try {
                                            if (C32671gw.A0A == null) {
                                                C32671gw.A0A = new C32671gw(sparseArray, r8, r9, r9, mmapBufferManager, file);
                                            } else {
                                                throw new IllegalStateException("TraceControl already initialized");
                                            }
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                        }
                                    }
                                    SoLoader.A06("profilo");
                                    if (!r8.equals(r9.A08)) {
                                        r9.A08 = r8;
                                        C32671gw r04 = C32671gw.A0A;
                                        if (r04 != null) {
                                            AtomicReference atomicReference = r04.A07;
                                            if (!atomicReference.compareAndSet(atomicReference.get(), r8)) {
                                                Log.d("Profilo/TraceControl", "Tried to update the config and failed due to CAS");
                                            }
                                        } else {
                                            throw new IllegalStateException("Performing config change before TraceControl has been initialized");
                                        }
                                    }
                                    r32.A01 = TimeUnit.DAYS.toSeconds(1) * 1000;
                                    r32.A00 = 10;
                                    r9.A05.A00.add(new C32811hE());
                                } else {
                                    th2 = new IllegalStateException("TraceControl already initialized");
                                    throw th2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        i5 = 2;
                        C32661gv.A00 = 2;
                    } else {
                        th = new IllegalStateException("Orchestrator already initialized");
                        throw th;
                    }
                } catch (IOException e2) {
                    com.whatsapp.util.Log.e("profilo/SoLoader initialization failed", e2);
                    C32661gv.A00 = 1;
                }
            }
            if (!(i5 == 1 || (r4 = C32671gw.A0A) == null)) {
                int i6 = C32681gx.A02;
                long j5 = (long) i4;
                AtomicInteger atomicInteger = r4.A06;
                int i7 = atomicInteger.get() | 1;
                int i8 = (1 << 2) - 1;
                if (((i7 ^ -1) & (i7 + 1) & i8) != 0) {
                    C32681gx r82 = (C32681gx) r4.A01.get(i6);
                    if (r82 == null) {
                        StringBuilder sb = new StringBuilder("Unregistered controller for id = ");
                        sb.append(i6);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (r4.A00(i6, j5) == null) {
                        C32771h9 r16 = (C32771h9) r4.A07.get();
                        ArrayList arrayList2 = r82.A00;
                        C32851hM r6 = ProvidersRegistry.A00;
                        int A003 = r6.A00(arrayList2);
                        if (A003 != 0) {
                            do {
                                abs = Math.abs(((Random) C32671gw.A09.get()).nextLong());
                            } while (abs <= 0);
                            String A004 = AnonymousClass033.A00(abs);
                            StringBuilder sb2 = new StringBuilder("START PROFILO_TRACEID: ");
                            sb2.append(A004);
                            Log.w("Profilo/TraceControl", sb2.toString());
                            TreeMap treeMap = new TreeMap();
                            int i9 = 31;
                            if (r82.A01) {
                                i9 = 13;
                            }
                            treeMap.put("provider.stack_trace.cpu_sampling_rate_ms", Integer.valueOf(i9));
                            treeMap.put("provider.native_stack_trace.unwinder_thread_pri", 19);
                            treeMap.put("provider.native_stack_trace.unwinder_queue_size", 512);
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put("provider.native_stack_trace.unwind_dex_frames", Boolean.TRUE);
                            C32861hN r102 = new C32861hN(treeMap, treeMap2);
                            int A005 = r102.A00("trace_config.buffers", 1);
                            int i10 = 0;
                            boolean z4 = false;
                            TreeMap treeMap3 = r102.A00;
                            if (!(treeMap3 == null || (bool = (Boolean) treeMap3.get("trace_config.mmap_buffer")) == null)) {
                                z4 = bool.booleanValue();
                            }
                            TreeMap treeMap4 = r102.A01;
                            int[] iArr = treeMap4 == null ? null : (int[]) treeMap4.get("trace_config.buffer_sizes");
                            Buffer[] bufferArr = new Buffer[A005];
                            while (i10 < A005) {
                                bufferArr[i10] = r4.A04.allocateBuffer((iArr == null || i10 >= iArr.length) ? 5000 : iArr[i10], z4);
                                i10++;
                            }
                            C32841hK r21 = new C32841hK(r16, r102, bufferArr[0], new File(r4.A05, A004.replaceAll("[^a-zA-Z0-9\\-_.]", "_")), r82, A004, bufferArr, i6, A003, abs, j5);
                            Buffer[] bufferArr2 = r21.A0F;
                            int i11 = 0;
                            if (bufferArr2 == null || (length = bufferArr2.length) == 0 || (buffer = r21.A09) == null) {
                                StringBuilder sb3 = new StringBuilder("No buffer was allocated for trace ");
                                sb3.append(r21.A0D);
                                sb3.append(", failing startTrace");
                                str3 = sb3.toString();
                            } else {
                                while (true) {
                                    int i12 = atomicInteger.get();
                                    int i13 = i12 | 1;
                                    int i14 = (i13 ^ -1) & (i13 + 1) & i8;
                                    if (i14 == 0) {
                                        Log.d("Profilo/TraceControl", "Tried to start a trace and failed because no free slots were left");
                                    } else {
                                        if (atomicInteger.compareAndSet(i12, i12 | i14)) {
                                            AtomicReferenceArray atomicReferenceArray = r4.A08;
                                            int i15 = -1;
                                            while (i14 != 0) {
                                                i15++;
                                                i14 >>= 1;
                                            }
                                            if (!atomicReferenceArray.compareAndSet(i15, (Object) null, r21)) {
                                                throw new RuntimeException("ORDERING VIOLATION - ACQUIRED SLOT BUT SLOT NOT EMPTY");
                                            }
                                            do {
                                                Buffer buffer2 = bufferArr2[i11];
                                                i3 = r21.A02;
                                                j3 = r21.A05;
                                                j4 = r21.A06;
                                                buffer2.updateHeader(i3, j3, j4, 0);
                                                i11++;
                                            } while (i11 < length);
                                            int i16 = r21.A03;
                                            int i17 = i16 & 3;
                                            int A006 = i17 != 0 ? Integer.MAX_VALUE : r21.A08.A00("trace_config.trace_timeout_ms", 30000);
                                            synchronized (r4) {
                                                r4.A02();
                                                if (r4.A01(j4) != null) {
                                                    C32871hP r83 = r4.A00;
                                                    synchronized (r83) {
                                                        C32881hQ r132 = r83.A00;
                                                        synchronized (r132) {
                                                            try {
                                                                C32891hR r14 = new C32891hR(r21);
                                                                if (r14.A02) {
                                                                    z3 = false;
                                                                } else {
                                                                    if (r14.A03) {
                                                                        r132.A00.put(j4, r14);
                                                                    }
                                                                    z3 = true;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                throw th;
                                                            }
                                                        }
                                                        z2 = false;
                                                        if (z3) {
                                                            try {
                                                                C32911hU r212 = new C32911hU(new C32901hS(r83, r21), r21.A0A.getCanonicalPath(), r21.A0E, bufferArr2, j4);
                                                                r21.A0G = r212;
                                                                if ((i16 & 2) == 0) {
                                                                    BufferLogger.writeAndWakeupTraceWriter(r212.A02, buffer, j4, 39, i17 != 0 ? Integer.MAX_VALUE : r21.A08.A00("trace_config.trace_timeout_ms", 30000), i16, j4);
                                                                }
                                                                r83.A03.add(Long.valueOf(j4));
                                                                C32751h7 r11 = r83.A01;
                                                                if (r11 != null) {
                                                                    Class<TraceEvents> cls = TraceEvents.class;
                                                                    synchronized (cls) {
                                                                        try {
                                                                            ArrayList arrayList3 = r6.A01;
                                                                            int A007 = r6.A00(arrayList3);
                                                                            if (A007 != TraceEvents.sLastNameRefreshProvidersState) {
                                                                                TraceEvents.sLastNameRefreshProvidersState = A007;
                                                                                synchronized (arrayList3) {
                                                                                    arrayList = new ArrayList(arrayList3);
                                                                                }
                                                                                int size = arrayList.size();
                                                                                int[] iArr2 = new int[size];
                                                                                String[] strArr = new String[size];
                                                                                int i18 = 0;
                                                                                Iterator it = arrayList.iterator();
                                                                                while (it.hasNext()) {
                                                                                    String str4 = (String) it.next();
                                                                                    strArr[i18] = str4;
                                                                                    iArr2[i18] = r6.A01(str4);
                                                                                    i18++;
                                                                                }
                                                                                TraceEvents.nativeRefreshProviderNames(iArr2, strArr);
                                                                            }
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    synchronized (cls) {
                                                                        TraceEvents.sProviders = TraceEvents.nativeEnableProviders(i3);
                                                                    }
                                                                    synchronized (r11) {
                                                                        try {
                                                                            r13 = r11.A04;
                                                                        } catch (Throwable th8) {
                                                                            while (true) {
                                                                                th = th8;
                                                                            }
                                                                        }
                                                                    }
                                                                    synchronized (r11.A06) {
                                                                        try {
                                                                            for (C32721h1 r12 : r13) {
                                                                                if ((i3 & r12.getSupportedProviders()) != 0) {
                                                                                    r12.A00().addBuffer(buffer);
                                                                                    r12.A01();
                                                                                    r12.A02(r21);
                                                                                    r12.onTraceStarted(r21, r11);
                                                                                }
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            while (true) {
                                                                                th = th9;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                r83.sendMessage(r83.obtainMessage(1, r21));
                                                                r83.sendMessageDelayed(r83.obtainMessage(0, r21), (long) A006);
                                                            } catch (IOException e3) {
                                                                StringBuilder sb4 = new StringBuilder();
                                                                sb4.append("Could not get canonical path of trace directory ");
                                                                sb4.append(r21.A0A);
                                                                th = new IllegalArgumentException(sb4.toString(), e3);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                }
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                StringBuilder sb5 = new StringBuilder("Failed to start trace ");
                                                sb5.append(r21.A0D);
                                                sb5.append(" due to malformed config for context ");
                                                sb5.append(j3);
                                                str3 = sb5.toString();
                                            }
                                        }
                                    }
                                }
                            }
                            Log.e("Profilo/TraceControl", str3);
                        }
                    }
                }
            }
            if (C32661gv.A00 == 2 && (r02 = C32661gv.A01) != null) {
                MultiBufferLogger A008 = r02.A00();
                this.A05 = new C32821hI(A008);
                C16150sX r15 = this.A0B.A00.A01;
                this.A04 = new C32831hJ(A008, (AnonymousClass01V) r15.AOi.get(), (C17020u3) r15.AMG.get());
                C32821hI r5 = this.A05;
                if (C32661gv.A00 != 2 || (r03 = C32671gw.A0A) == null || r03.A06.get() == 0) {
                    l2 = null;
                } else {
                    long nextInt = (((long) r5.A01.nextInt(Integer.MAX_VALUE)) << 16) & 281474976645120L;
                    r5.A00.writeStandardEntry(7, 46, 0, 0, i4, 0, nextInt | 562949953421312L);
                    l2 = Long.valueOf(nextInt);
                }
                this.A06 = l2;
                return;
            }
            return;
        }
        return;
    }

    public void A04(View view, Runnable runnable, String str, int i2) {
        RunnableRunnableShape0S1201000_I0 runnableRunnableShape0S1201000_I0 = new RunnableRunnableShape0S1201000_I0(this, runnable, str, i2, 3);
        view.getViewTreeObserver().addOnPreDrawListener(new C32691gy(this.A0A, view, runnableRunnableShape0S1201000_I0));
    }

    public void A05(View view, Runnable runnable, String str, int i2) {
        if (this.A00 != -1) {
            A0A(str, "onRestart", "_start");
        } else if (!this.A08) {
            this.A08 = true;
            A02();
            A04(view, runnable, str, i2);
            this.A01 = 2;
            this.A02 = this.A0L;
            A03(24772611, str);
        }
    }

    public void A06(String str) {
        C32671gw r2;
        int i2 = this.A00;
        if (i2 != -1) {
            if (this.A09 && C32661gv.A00 == 2 && (r2 = C32671gw.A0A) != null) {
                r2.A03(C32681gx.A02, 0, 2, (long) i2);
            }
            if (this.A03 != null && this.A0G.A0E(C16620tM.A02, 1807)) {
                this.A03.A0A("abort_reason", str, true);
            }
            C31081dR r3 = this.A03;
            if (r3 != null) {
                r3.A0A("locale", this.A0F.A07(), true);
                this.A03.A0C(105);
            }
            this.A00 = -1;
            this.A07 = null;
            this.A09 = false;
            this.A06 = null;
        }
    }

    public void A07(String str) {
        C31081dR r0 = this.A03;
        if (r0 != null) {
            r0.A07(str);
        }
    }

    public void A08(String str) {
        C31081dR r0 = this.A03;
        if (r0 != null) {
            r0.A08(str);
        }
    }

    public void A09(String str) {
        if (this.A00 != -1) {
            A0A(str, "onCreate", "_start");
        } else if (!this.A08) {
            this.A08 = true;
            A02();
            this.A01 = 3;
            this.A02 = this.A0P;
            A03(24772610, str);
        }
    }

    public void A0A(String str, String str2, String str3) {
        Long l2;
        int i2 = this.A00;
        if (i2 != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(str3);
            String obj2 = sb2.toString();
            if (this.A09 && (l2 = this.A06) != null) {
                C32821hI r0 = this.A05;
                long longValue = l2.longValue();
                MultiBufferLogger multiBufferLogger = r0.A00;
                multiBufferLogger.writeBytesEntry(1, 83, multiBufferLogger.writeStandardEntry(7, 50, 0, 0, i2, 0, longValue), obj2);
            }
        }
    }
}
