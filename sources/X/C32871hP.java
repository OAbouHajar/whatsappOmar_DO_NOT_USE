package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.LongSparseArray;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.writer.NativeTraceWriter;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.1hP  reason: invalid class name and case insensitive filesystem */
public class C32871hP extends Handler {
    public final C32881hQ A00 = new C32881hQ();
    public final C32751h7 A01;
    public final C32761h8 A02;
    public final HashSet A03 = new HashSet();
    public final Random A04 = new Random();

    public C32871hP(Looper looper, C32751h7 r3, C32761h8 r4) {
        super(looper);
        this.A01 = r3;
        this.A02 = r4;
    }

    public static final void A00(C32841hK r9) {
        BufferLogger.writeStandardEntry(r9.A09, 6, 98, 0, 0, r9.A08.A00("trace_config.logger_priority", 5), 0, r9.A06);
    }

    public synchronized void A01(C32841hK r4) {
        HashSet hashSet = this.A03;
        Long valueOf = Long.valueOf(r4.A06);
        if (hashSet.contains(valueOf)) {
            sendMessage(obtainMessage(3, r4));
            hashSet.remove(valueOf);
        }
    }

    public synchronized void A02(C32841hK r4) {
        HashSet hashSet = this.A03;
        Long valueOf = Long.valueOf(r4.A06);
        if (hashSet.contains(valueOf)) {
            sendMessage(obtainMessage(2, r4));
            hashSet.remove(valueOf);
        }
    }

    public void handleMessage(Message message) {
        LongSparseArray longSparseArray;
        int i2;
        C32721h1[] r4;
        C32721h1[] r5;
        AnonymousClass4JO r3;
        C32721h1[] r7;
        C32721h1[] r6;
        int i3;
        C32721h1[] r62;
        Message message2 = message;
        int i4 = message2.what;
        if (i4 != 7) {
            C32841hK r0 = (C32841hK) message2.obj;
            switch (i4) {
                case 0:
                    long j2 = r0.A06;
                    C32671gw r32 = C32671gw.A0A;
                    C32841hK A012 = r32.A01(j2);
                    if (A012 != null) {
                        BufferLogger.writeStandardEntry(A012.A09, 6, 41, 0, 0, 0, 0, A012.A06);
                        r32.A04(j2, 4);
                        return;
                    }
                    return;
                case 1:
                    if ((r0.A03 & 2) == 0) {
                        r0.A0G.start();
                        A00(r0);
                    }
                    C32751h7 r72 = this.A01;
                    if (r72 != null) {
                        synchronized (r72) {
                            r62 = r72.A03;
                        }
                        for (C32721h1 r33 : r62) {
                            if ((r0.A02 & r33.getSupportedProviders()) != 0) {
                                r33.A00().addBuffer(r0.A09);
                                r33.A01();
                                r33.A02(r0);
                                r33.onTraceStarted(r0, r72);
                            }
                        }
                        C32791hC r1 = r72.A05;
                        r1.AVR(r0);
                        r1.AZ2(r0);
                        return;
                    }
                    return;
                case 2:
                    synchronized (this) {
                        removeMessages(0, r0);
                        int i5 = r0.A03;
                        if ((i5 & 2) != 0) {
                            if (r0.A0G != null) {
                                r0.A0G.start();
                                A00(r0);
                                NativeTraceWriter nativeTraceWriter = r0.A0G.A02;
                                Buffer buffer = r0.A09;
                                long j3 = r0.A06;
                                BufferLogger.writeAndWakeupTraceWriter(nativeTraceWriter, buffer, j3, 40, 0, i5, j3);
                            } else {
                                throw new IllegalStateException("Trace stopped but never started");
                            }
                        }
                        sendMessageDelayed(obtainMessage(4, r0), (long) r0.A08.A00("trace_config.post_trace_extension_ms", 0));
                    }
                    return;
                case 3:
                    synchronized (this) {
                        removeMessages(0, r0);
                    }
                    C32751h7 r8 = this.A01;
                    if (r8 != null) {
                        synchronized (r8) {
                            r7 = r8.A03;
                            r6 = r8.A04;
                        }
                        r8.A05.AYz(r0);
                        int i6 = r0.A02;
                        synchronized (TraceEvents.class) {
                            TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i6);
                        }
                        synchronized (r8.A06) {
                            for (C32721h1 A032 : r6) {
                                A032.A03(r0, r8);
                            }
                        }
                        for (C32721h1 A033 : r7) {
                            A033.A03(r0, r8);
                        }
                        return;
                    }
                    return;
                case 4:
                    C32751h7 r34 = this.A01;
                    if (r34 != null) {
                        synchronized (r34) {
                            r4 = r34.A03;
                            r5 = r34.A04;
                        }
                        BufferLogger.writeStandardEntry(r0.A09, 6, 52, 0, 0, 8126470, 0, 0);
                        int i7 = 0;
                        for (C32721h1 r2 : r4) {
                            i7 |= (r2.A03 == null || r2.A04) ? r2.getTracingProviders() : 0;
                        }
                        for (C32721h1 r22 : r5) {
                            i7 |= (r22.A03 == null || r22.A04) ? r22.getTracingProviders() : 0;
                        }
                        int i8 = r0.A02;
                        synchronized (TraceEvents.class) {
                            TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i8);
                        }
                        synchronized (r34.A06) {
                            for (C32721h1 A034 : r5) {
                                A034.A03(r0, r34);
                            }
                        }
                        for (C32721h1 A035 : r4) {
                            A035.A03(r0, r34);
                        }
                        C32791hC r12 = r34.A05;
                        r12.AVS(r0, i7);
                        r12.AZ3(r0);
                    }
                    BufferLogger.writeStandardEntry(r0.A09, 6, 38, 0, 0, 0, 0, r0.A06);
                    return;
                case 5:
                    long j4 = (long) message2.arg1;
                    C32881hQ r63 = this.A00;
                    long j5 = r0.A06;
                    synchronized (r63) {
                        C32891hR r02 = (C32891hR) r63.A00.get(j5);
                        if (!(r02 == null || (r3 = r02.A01) == null || j4 <= r3.A00)) {
                            r3.A00 = j4;
                        }
                    }
                    return;
                case 6:
                    C32881hQ r23 = this.A00;
                    long j6 = r0.A06;
                    synchronized (r23) {
                        longSparseArray = r23.A00;
                        C32891hR r9 = (C32891hR) longSparseArray.get(j6);
                        if (r9 != null) {
                            AnonymousClass4LM r82 = r9.A00;
                            if (r82 != null) {
                                HashSet hashSet = r82.A02;
                                synchronized (hashSet) {
                                    if (!r82.A01.A8j(hashSet, r82.A03)) {
                                        i2 = r82.A00;
                                        if (i2 != 1) {
                                        }
                                    }
                                }
                            }
                            AnonymousClass4JO r122 = r9.A01;
                            if (r122 != null) {
                                int i9 = 0;
                                i2 = 0;
                                int i10 = -1;
                                while (true) {
                                    int[] iArr = r122.A01;
                                    if (i9 < iArr.length) {
                                        if (r122.A00 > ((long) iArr[i9]) && iArr[i9] > i10) {
                                            i10 = iArr[i9];
                                            i2 = r122.A02[i9];
                                        }
                                        i9++;
                                    }
                                }
                            }
                        }
                        i2 = 1;
                    }
                    if (i2 == 0 || this.A04.nextInt(i2) != 0) {
                        BufferLogger.writeStandardEntry(r0.A09, 6, 37, 0, 0, 0, 0, r0.A06);
                        A01(new C32841hK(r0, 6));
                    } else {
                        Buffer buffer2 = r0.A09;
                        BufferLogger.writeStandardEntry(buffer2, 6, 99, 0, 0, 0, 0, (long) i2);
                        BufferLogger.writeStandardEntry(buffer2, 6, 61, 0, 0, 0, 0, r0.A06);
                        A02(r0);
                    }
                    synchronized (r23) {
                        longSparseArray.delete(r0.A06);
                    }
                    return;
                case 7:
                    break;
                default:
                    return;
            }
        }
        throw new NullPointerException("mTraceContext");
    }
}
