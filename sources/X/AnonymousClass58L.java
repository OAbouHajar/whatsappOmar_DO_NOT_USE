package X;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.58L  reason: invalid class name */
public final class AnonymousClass58L implements Executor, Closeable {
    public static final AnonymousClass4QY A06 = new AnonymousClass4QY("NOT_IN_STACK");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A07;
    public static final /* synthetic */ AtomicLongFieldUpdater A08;
    public static final /* synthetic */ AtomicLongFieldUpdater A09;
    public final int A00;
    public final int A01;
    public final long A02;
    public final AnonymousClass4T9 A03;
    public final C107165Gq A04;
    public final C107165Gq A05;
    public volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public volatile /* synthetic */ long parkedWorkersStack;

    static {
        Class<AnonymousClass58L> cls = AnonymousClass58L.class;
        A09 = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        A08 = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        A07 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public AnonymousClass58L(int i2, long j2, int i3) {
        String str;
        StringBuilder sb;
        String str2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = j2;
        boolean z2 = true;
        if (i2 >= 1) {
            if (!(i3 < i2 ? false : z2)) {
                StringBuilder A0q = AnonymousClass000.A0q("Max pool size ");
                A0q.append(i3);
                str = C13680ns.A0i(" should be greater than or equals to core pool size ", A0q, i2);
                throw AnonymousClass000.A0T(str);
            } else if (i3 > 2097150) {
                sb = AnonymousClass000.A0q("Max pool size ");
                sb.append(i3);
                str2 = " should not exceed maximal supported number of threads 2097150";
            } else if (j2 > 0) {
                this.A05 = new C107165Gq();
                this.A04 = new C107165Gq();
                this.parkedWorkersStack = 0;
                this.A03 = new AnonymousClass4T9(i2 + 1);
                this.controlState = ((long) i2) << 42;
                this._isTerminated = 0;
                return;
            } else {
                sb = AnonymousClass000.A0r("Idle worker keep alive time ");
                sb.append(j2);
                str2 = " must be positive";
            }
        } else {
            sb = AnonymousClass000.A0r("Core pool size ");
            sb.append(i2);
            str2 = " should be at least 1";
        }
        str = AnonymousClass000.A0h(str2, sb);
        throw AnonymousClass000.A0T(str);
    }

    public static final void A00(AnonymousClass55A r2) {
        try {
            r2.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01() {
        /*
            r9 = this;
            X.4T9 r6 = r9.A03
            monitor-enter(r6)
            int r0 = r9._isTerminated     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0009
            r0 = -1
            goto L_0x004e
        L_0x0009:
            long r1 = r9.controlState     // Catch:{ all -> 0x0060 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r7 = r1 & r3
            int r5 = (int) r7     // Catch:{ all -> 0x0060 }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r0 = 21
            long r1 = r1 >> r0
            int r0 = (int) r1     // Catch:{ all -> 0x0060 }
            int r7 = r5 - r0
            r1 = 0
            if (r7 >= r1) goto L_0x0021
            r7 = 0
        L_0x0021:
            int r0 = r9.A00     // Catch:{ all -> 0x0060 }
            if (r7 >= r0) goto L_0x005e
            int r0 = r9.A01     // Catch:{ all -> 0x0060 }
            if (r5 >= r0) goto L_0x005e
            long r1 = r9.controlState     // Catch:{ all -> 0x0060 }
            long r1 = r1 & r3
            int r0 = (int) r1     // Catch:{ all -> 0x0060 }
            int r5 = r0 + 1
            if (r5 <= 0) goto L_0x0057
            java.lang.Object r0 = r6.A00(r5)     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0057
            X.5Ax r2 = new X.5Ax     // Catch:{ all -> 0x0060 }
            r2.<init>(r9, r5)     // Catch:{ all -> 0x0060 }
            r6.A01(r5, r2)     // Catch:{ all -> 0x0060 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A08     // Catch:{ all -> 0x0060 }
            long r0 = r0.incrementAndGet(r9)     // Catch:{ all -> 0x0060 }
            long r3 = r3 & r0
            int r0 = (int) r3     // Catch:{ all -> 0x0060 }
            if (r5 != r0) goto L_0x0050
            r2.start()     // Catch:{ all -> 0x0060 }
            int r0 = r7 + 1
        L_0x004e:
            monitor-exit(r6)
            return r0
        L_0x0050:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x005d
        L_0x0057:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x0060 }
        L_0x005d:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x005e:
            monitor-exit(r6)
            return r1
        L_0x0060:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58L.A01():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r2 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Runnable r4, X.C83184Fr r5) {
        /*
            r3 = this;
            long r1 = java.lang.System.nanoTime()
            boolean r0 = r4 instanceof X.AnonymousClass55A
            if (r0 == 0) goto L_0x005f
            X.55A r4 = (X.AnonymousClass55A) r4
            r4.A00 = r1
            r4.A01 = r5
        L_0x000e:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            boolean r0 = r2 instanceof X.C105725Ax
            if (r0 == 0) goto L_0x0032
            X.5Ax r2 = (X.C105725Ax) r2
            if (r2 == 0) goto L_0x0032
            X.58L r0 = r2.A06
            boolean r0 = X.C18450wi.A0R(r0, r3)
            if (r0 == 0) goto L_0x0032
            X.421 r1 = r2.A03
            X.421 r0 = X.AnonymousClass421.TERMINATED
            if (r1 == r0) goto L_0x0032
            X.4Fr r0 = r4.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0053
            X.421 r0 = X.AnonymousClass421.BLOCKING
            if (r1 != r0) goto L_0x0053
        L_0x0032:
            r2 = r4
        L_0x0033:
            X.4Fr r0 = r2.A01
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0050
            X.5Gq r0 = r3.A04
        L_0x003c:
            boolean r0 = r0.A02(r2)
            if (r0 != 0) goto L_0x0066
            java.lang.String r1 = "DefaultDispatcher"
            java.lang.String r0 = " was terminated"
            java.lang.String r1 = X.C18450wi.A06(r1, r0)
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            r0.<init>(r1)
            throw r0
        L_0x0050:
            X.5Gq r0 = r3.A05
            goto L_0x003c
        L_0x0053:
            r0 = 1
            r2.A04 = r0
            X.4bv r0 = r2.A05
            X.55A r2 = r0.A02(r4)
            if (r2 == 0) goto L_0x0066
            goto L_0x0033
        L_0x005f:
            X.5Gu r0 = new X.5Gu
            r0.<init>(r4, r5, r1)
            r4 = r0
            goto L_0x000e
        L_0x0066:
            X.4Fr r0 = r4.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x007e
            boolean r0 = r3.A04()
            if (r0 != 0) goto L_0x007d
            long r0 = r3.controlState
            boolean r0 = r3.A05(r0)
        L_0x0078:
            if (r0 != 0) goto L_0x007d
            r3.A04()
        L_0x007d:
            return
        L_0x007e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = A08
            r0 = 2097152(0x200000, double:1.0361308E-317)
            long r1 = r2.addAndGet(r3, r0)
            boolean r0 = r3.A04()
            if (r0 != 0) goto L_0x007d
            boolean r0 = r3.A05(r1)
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58L.A02(java.lang.Runnable, X.4Fr):void");
    }

    public final void A03(C105725Ax r10, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                if (i3 == 0) {
                    C105725Ax r1 = r10;
                    while (true) {
                        Object obj = r1.nextParkedWorker;
                        if (obj != A06) {
                            if (obj != null) {
                                r1 = (C105725Ax) obj;
                                i4 = r1.indexInArray;
                                if (i4 != 0) {
                                    break;
                                }
                            } else {
                                i4 = 0;
                                break;
                            }
                        } else {
                            continue;
                            break;
                        }
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 < 0) {
                continue;
            }
            if (A09.compareAndSet(this, j2, j3 | ((long) i4))) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (A09.compareAndSet(r7, r8, ((long) r0) | r3) == false) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r5.nextParkedWorker = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0000, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04() {
        /*
            r12 = this;
        L_0x0000:
            r7 = r12
            long r8 = r12.parkedWorkersStack
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r1 = (int) r2
            X.4T9 r0 = r12.A03
            java.lang.Object r5 = r0.A00(r1)
            X.5Ax r5 = (X.C105725Ax) r5
            if (r5 != 0) goto L_0x0025
            r5 = 0
        L_0x0013:
            r2 = 0
            if (r5 != 0) goto L_0x0017
            return r2
        L_0x0017:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = X.C105725Ax.A07
            r0 = -1
            boolean r0 = r1.compareAndSet(r5, r0, r2)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r0 = 1
            return r0
        L_0x0025:
            r3 = 2097152(0x200000, double:1.0361308E-317)
            long r3 = r3 + r8
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r3 = r3 & r0
            r2 = r5
        L_0x002e:
            java.lang.Object r2 = r2.nextParkedWorker
            X.4QY r1 = A06
            if (r2 == r1) goto L_0x0000
            if (r2 != 0) goto L_0x0044
            r0 = 0
        L_0x0037:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = A09
            long r10 = (long) r0
            long r10 = r10 | r3
            boolean r0 = r6.compareAndSet(r7, r8, r10)
            if (r0 == 0) goto L_0x0000
            r5.nextParkedWorker = r1
            goto L_0x0013
        L_0x0044:
            X.5Ax r2 = (X.C105725Ax) r2
            int r0 = r2.indexInArray
            if (r0 == 0) goto L_0x002e
            if (r0 >= 0) goto L_0x0037
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58L.A04():boolean");
    }

    public final boolean A05(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.A00;
        if (i2 < i3) {
            int A012 = A01();
            if (A012 == 1) {
                if (i3 > 1) {
                    A01();
                }
                return true;
            } else if (A012 > 0) {
                return true;
            }
        }
        return false;
    }

    public void close() {
        int i2;
        AnonymousClass55A r0;
        C105725Ax r3;
        if (A07.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            C105725Ax r5 = null;
            if ((currentThread instanceof C105725Ax) && (r3 = (C105725Ax) currentThread) != null && C18450wi.A0R(r3.A06, this)) {
                r5 = r3;
            }
            AnonymousClass4T9 r8 = this.A03;
            synchronized (r8) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    Object A002 = r8.A00(i3);
                    C18450wi.A0F(A002);
                    C105725Ax r32 = (C105725Ax) A002;
                    if (r32 != r5) {
                        while (r32.isAlive()) {
                            LockSupport.unpark(r32);
                            r32.join(10000);
                        }
                        C89294bv r7 = r32.A05;
                        C107165Gq r4 = this.A04;
                        Object andSet = C89294bv.A04.getAndSet(r7, (Object) null);
                        if (andSet != null) {
                            r4.A02(andSet);
                        }
                        while (true) {
                            AnonymousClass55A A012 = r7.A01();
                            if (A012 == null) {
                                break;
                            }
                            r4.A02(A012);
                        }
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            C107165Gq r42 = this.A04;
            while (true) {
                C89404c6 r2 = (C89404c6) r42._cur;
                if (r2.A03()) {
                    break;
                }
                AnonymousClass0LG.A00(r42, r2, r2.A02(), C89124bd.A00);
            }
            C107165Gq r33 = this.A05;
            while (true) {
                C89404c6 r22 = (C89404c6) r33._cur;
                if (r22.A03()) {
                    break;
                }
                AnonymousClass0LG.A00(r33, r22, r22.A02(), C89124bd.A00);
            }
            while (true) {
                if (r5 != null) {
                    r0 = r5.A01(true);
                    if (r0 != null) {
                        continue;
                        A00(r0);
                    }
                }
                r0 = (AnonymousClass55A) r33.A01();
                if (r0 == null && (r0 = (AnonymousClass55A) r42.A01()) == null) {
                    break;
                }
                A00(r0);
            }
            if (r5 != null) {
                r5.A04(AnonymousClass421.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public void execute(Runnable runnable) {
        A02(runnable, AnonymousClass4BM.A06);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r13 = this;
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            X.4T9 r6 = r13.A03
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.array
            int r5 = r0.length()
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r2 = 0
            r0 = 1
        L_0x0012:
            if (r0 >= r5) goto L_0x0069
            int r12 = r0 + 1
            java.lang.Object r11 = r6.A00(r0)
            X.5Ax r11 = (X.C105725Ax) r11
            if (r11 == 0) goto L_0x0034
            X.4bv r0 = r11.A05
            java.lang.Object r3 = r0.lastScheduledTask
            int r4 = r0.producerIndex
            int r0 = r0.consumerIndex
            int r4 = r4 - r0
            if (r3 == 0) goto L_0x002b
            int r4 = r4 + 1
        L_0x002b:
            X.421 r0 = r11.A03
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x0047;
                case 2: goto L_0x0066;
                case 3: goto L_0x0039;
                case 4: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            r0 = r12
            goto L_0x0012
        L_0x0036:
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0039:
            int r7 = r7 + 1
            if (r4 <= 0) goto L_0x0034
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            r3.append(r4)
            r0 = 100
            goto L_0x005e
        L_0x0047:
            int r9 = r9 + 1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            r3.append(r4)
            r0 = 98
            goto L_0x005e
        L_0x0053:
            int r10 = r10 + 1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            r3.append(r4)
            r0 = 99
        L_0x005e:
            java.lang.String r0 = X.AnonymousClass3K3.A0p(r3, r0)
            r1.add(r0)
            goto L_0x0034
        L_0x0066:
            int r8 = r8 + 1
            goto L_0x0034
        L_0x0069:
            long r3 = r13.controlState
            java.lang.String r0 = "DefaultDispatcher"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)
            r0 = 64
            r5.append(r0)
            X.AnonymousClass000.A1G(r13, r5)
            java.lang.String r0 = "[Pool Size {core = "
            r5.append(r0)
            int r6 = r13.A00
            r5.append(r6)
            java.lang.String r0 = ", max = "
            r5.append(r0)
            int r0 = r13.A01
            r5.append(r0)
            java.lang.String r0 = "}, Worker States {CPU = "
            r5.append(r0)
            r5.append(r10)
            java.lang.String r0 = ", blocking = "
            r5.append(r0)
            r5.append(r9)
            java.lang.String r0 = ", parked = "
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = ", dormant = "
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = ", terminated = "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = "}, running workers queues = "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ", global CPU queue size = "
            r5.append(r0)
            X.5Gq r0 = r13.A05
            int r0 = r0.A00()
            r5.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r5.append(r0)
            X.5Gq r0 = r13.A04
            int r0 = r0.A00()
            r5.append(r0)
            java.lang.String r0 = ", Control State {created workers= "
            r5.append(r0)
            r1 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            int r0 = (int) r1
            r5.append(r0)
            java.lang.String r0 = ", blocking tasks = "
            r5.append(r0)
            r1 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r3
            r0 = 21
            long r1 = r1 >> r0
            int r0 = (int) r1
            r5.append(r0)
            java.lang.String r0 = ", CPUs acquired = "
            r5.append(r0)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r3
            r0 = 42
            long r1 = r1 >> r0
            int r0 = (int) r1
            int r6 = r6 - r0
            r5.append(r6)
            java.lang.String r0 = "}]"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58L.toString():java.lang.String");
    }
}
