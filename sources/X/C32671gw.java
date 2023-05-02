package X;

import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.1gw  reason: invalid class name and case insensitive filesystem */
public final class C32671gw {
    public static final ThreadLocal A09 = new AnonymousClass5Ay();
    public static volatile C32671gw A0A;
    public C32871hP A00;
    public final SparseArray A01;
    public final C32751h7 A02;
    public final C32761h8 A03;
    public final MmapBufferManager A04;
    public final File A05;
    public final AtomicInteger A06 = new AtomicInteger(0);
    public final AtomicReference A07;
    public final AtomicReferenceArray A08 = new AtomicReferenceArray(2);

    public C32671gw(SparseArray sparseArray, C32771h9 r4, C32751h7 r5, C32761h8 r6, MmapBufferManager mmapBufferManager, File file) {
        this.A01 = sparseArray;
        this.A07 = new AtomicReference(r4);
        this.A04 = mmapBufferManager;
        this.A05 = file;
        this.A03 = r6;
        this.A02 = r5;
    }

    public final C32841hK A00(int i2, long j2) {
        if (this.A06.get() != 0) {
            int i3 = 0;
            do {
                C32841hK r3 = (C32841hK) this.A08.get(i3);
                if (!(r3 == null || (r3.A01 & i2) == 0)) {
                    long j3 = r3.A05;
                    if (r3.A0B == null && j3 == j2) {
                        return r3;
                    }
                }
                i3++;
            } while (i3 < 2);
        }
        return null;
    }

    public final C32841hK A01(long j2) {
        if (this.A06.get() != 0) {
            int i2 = 0;
            do {
                C32841hK r3 = (C32841hK) this.A08.get(i2);
                if (r3 != null && r3.A06 == j2) {
                    return r3;
                }
                i2++;
            } while (i2 < 2);
        }
        return null;
    }

    public final void A02() {
        C83204Ft r2;
        HandlerThread handlerThread;
        if (this.A00 == null) {
            C32751h7 r3 = this.A02;
            synchronized (C83204Ft.class) {
                r2 = C83204Ft.A01;
                if (r2 == null) {
                    r2 = new C83204Ft();
                    C83204Ft.A01 = r2;
                }
            }
            synchronized (r2) {
                if (r2.A00 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("Prflo:TraceCtl");
                    r2.A00 = handlerThread2;
                    handlerThread2.start();
                }
                handlerThread = r2.A00;
            }
            this.A00 = new C32871hP(handlerThread.getLooper(), r3, this.A03);
        }
    }

    public final void A03(int i2, int i3, int i4, long j2) {
        C32841hK A002 = A00(i2, j2);
        if (A002 != null) {
            A05(A002);
            StringBuilder sb = new StringBuilder("STOP PROFILO_TRACEID: ");
            long j3 = A002.A06;
            sb.append(AnonymousClass033.A00(j3));
            Log.w("Profilo/TraceControl", sb.toString());
            synchronized (this) {
                A02();
                if (i3 != 0) {
                    BufferLogger.writeStandardEntry(A002.A09, 6, 61, 0, 0, 0, 0, j3);
                    this.A00.A02(A002);
                } else {
                    BufferLogger.writeStandardEntry(A002.A09, 6, 37, 0, 0, 0, 0, j3);
                    this.A00.A01(new C32841hK(A002, i4));
                }
            }
        }
    }

    public void A04(long j2, int i2) {
        C32841hK A012 = A01(j2);
        if (A012 != null && A012.A06 == j2) {
            A05(A012);
            synchronized (this) {
                A02();
                this.A00.A01(new C32841hK(A012, i2));
            }
        }
    }

    public final void A05(C32841hK r6) {
        AtomicInteger atomicInteger;
        int i2;
        int i3 = 0;
        while (i3 < 2) {
            if (!this.A08.compareAndSet(i3, r6, (Object) null)) {
                i3++;
            } else {
                do {
                    atomicInteger = this.A06;
                    i2 = atomicInteger.get();
                } while (!atomicInteger.compareAndSet(i2, (1 << i3) ^ i2));
                return;
            }
        }
        Log.w("Profilo/TraceControl", "Could not reset Trace Context to null");
    }
}
