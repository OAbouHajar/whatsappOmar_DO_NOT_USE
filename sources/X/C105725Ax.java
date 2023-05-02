package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.5Ax  reason: invalid class name and case insensitive filesystem */
public final class C105725Ax extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A07 = AtomicIntegerFieldUpdater.newUpdater(C105725Ax.class, "workerCtl");
    public int A00 = C88474aZ.A01.A00();
    public long A01;
    public long A02;
    public AnonymousClass421 A03 = AnonymousClass421.DORMANT;
    public boolean A04;
    public final C89294bv A05 = new C89294bv();
    public final /* synthetic */ AnonymousClass58L A06;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker = AnonymousClass58L.A06;
    public volatile /* synthetic */ int workerCtl = 0;

    public C105725Ax(AnonymousClass58L r2, int i2) {
        this.A06 = r2;
        this.A06 = r2;
        setDaemon(true);
        A03(i2);
    }

    public final AnonymousClass55A A00() {
        C107165Gq r0;
        int i2 = this.A00;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.A00 = i5;
        int i6 = i5 & 1;
        AnonymousClass58L r1 = this.A06;
        if (i6 == 0) {
            AnonymousClass55A r02 = (AnonymousClass55A) r1.A05.A01();
            if (r02 != null) {
                return r02;
            }
            r0 = r1.A04;
        } else {
            AnonymousClass55A r03 = (AnonymousClass55A) r1.A04.A01();
            if (r03 != null) {
                return r03;
            }
            r0 = r1.A05;
        }
        return (AnonymousClass55A) r0.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r3 == false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass55A A01(boolean r11) {
        /*
            r10 = this;
            X.421 r0 = r10.A03
            X.421 r3 = X.AnonymousClass421.CPU_ACQUIRED
            if (r0 == r3) goto L_0x004c
            X.58L r5 = r10.A06
        L_0x0008:
            long r6 = r5.controlState
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r6
            r0 = 42
            long r1 = r1 >> r0
            int r0 = (int) r1
            if (r0 != 0) goto L_0x003b
            if (r11 == 0) goto L_0x002b
            X.4bv r2 = r10.A05
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C89294bv.A04
            r0 = 0
            java.lang.Object r0 = r1.getAndSet(r2, r0)
            X.55A r0 = (X.AnonymousClass55A) r0
            if (r0 != 0) goto L_0x003a
            X.55A r0 = r2.A01()
            if (r0 != 0) goto L_0x003a
        L_0x002b:
            X.5Gq r0 = r5.A04
            java.lang.Object r0 = r0.A01()
            X.55A r0 = (X.AnonymousClass55A) r0
            if (r0 != 0) goto L_0x003a
            r0 = 1
            X.55A r0 = r10.A02(r0)
        L_0x003a:
            return r0
        L_0x003b:
            r0 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r8 = r6 - r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = X.AnonymousClass58L.A08
            boolean r0 = r4.compareAndSet(r5, r6, r8)
            if (r0 == 0) goto L_0x0008
            r10.A03 = r3
        L_0x004c:
            r4 = 0
            if (r11 == 0) goto L_0x0088
            X.58L r0 = r10.A06
            int r0 = r0.A00
            int r3 = r0 << 1
            int r2 = r10.A00
            int r0 = r2 << 13
            r2 = r2 ^ r0
            int r0 = r2 >> 17
            r2 = r2 ^ r0
            int r0 = r2 << 5
            r2 = r2 ^ r0
            r10.A00 = r2
            int r1 = r3 + -1
            r0 = r1 & r3
            if (r0 != 0) goto L_0x0093
            r2 = r2 & r1
        L_0x0069:
            r3 = 0
            if (r2 != 0) goto L_0x0073
            r3 = 1
            X.55A r0 = r10.A00()
            if (r0 != 0) goto L_0x003a
        L_0x0073:
            X.4bv r2 = r10.A05
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C89294bv.A04
            r0 = 0
            java.lang.Object r0 = r1.getAndSet(r2, r0)
            X.55A r0 = (X.AnonymousClass55A) r0
            if (r0 != 0) goto L_0x003a
            X.55A r0 = r2.A01()
            if (r0 != 0) goto L_0x003a
            if (r3 != 0) goto L_0x008e
        L_0x0088:
            X.55A r0 = r10.A00()
            if (r0 != 0) goto L_0x003a
        L_0x008e:
            X.55A r0 = r10.A02(r4)
            return r0
        L_0x0093:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r0
            int r2 = r2 % r3
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105725Ax.A01(boolean):X.55A");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass55A A02(boolean r22) {
        /*
            r21 = this;
            r12 = r21
            X.58L r11 = r12.A06
            long r2 = r11.controlState
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r0
            int r10 = (int) r2
            r0 = 2
            r9 = 0
            if (r10 < r0) goto L_0x00ba
            int r8 = r12.A00
            int r0 = r8 << 13
            r8 = r8 ^ r0
            int r0 = r8 >> 17
            r8 = r8 ^ r0
            int r0 = r8 << 5
            r8 = r8 ^ r0
            r12.A00 = r8
            int r1 = r10 + -1
            r0 = r1 & r10
            if (r0 != 0) goto L_0x00ab
            r8 = r8 & r1
        L_0x0023:
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L_0x002e:
            r16 = 0
            if (r7 >= r10) goto L_0x00b2
            int r7 = r7 + 1
            int r8 = r8 + 1
            if (r8 <= r10) goto L_0x0039
            r8 = 1
        L_0x0039:
            X.4T9 r0 = r11.A03
            java.lang.Object r0 = r0.A00(r8)
            X.5Ax r0 = (X.C105725Ax) r0
            if (r0 == 0) goto L_0x002e
            if (r0 == r12) goto L_0x002e
            X.4bv r6 = r12.A05
            X.4bv r14 = r0.A05
            if (r22 == 0) goto L_0x0091
            r13 = 1
            int r5 = r14.consumerIndex
            int r0 = r14.producerIndex
            r20 = r0
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.A00
        L_0x0054:
            r0 = r20
            if (r5 == r0) goto L_0x008c
            r1 = r5 & 127(0x7f, float:1.78E-43)
            int r0 = r14.blockingTasksInBuffer
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r4.get(r1)
            X.55A r0 = (X.AnonymousClass55A) r0
            if (r0 == 0) goto L_0x0089
            X.4Fr r15 = r0.A01
            int r15 = r15.A00
            if (r15 != r13) goto L_0x0089
            boolean r1 = r4.compareAndSet(r1, r0, r9)
            if (r1 == 0) goto L_0x0089
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = X.C89294bv.A01
            r1.decrementAndGet(r14)
        L_0x0077:
            r6.A02(r0)
        L_0x007a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C89294bv.A04
            java.lang.Object r0 = r0.getAndSet(r6, r9)
            X.55A r0 = (X.AnonymousClass55A) r0
            if (r0 != 0) goto L_0x0088
            X.55A r0 = r6.A01()
        L_0x0088:
            return r0
        L_0x0089:
            int r5 = r5 + 1
            goto L_0x0054
        L_0x008c:
            long r0 = r6.A00(r14, r13)
            goto L_0x009c
        L_0x0091:
            r1 = 0
            X.55A r0 = r14.A01()
            if (r0 != 0) goto L_0x0077
            long r0 = r6.A00(r14, r1)
        L_0x009c:
            r13 = -1
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x007a
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x002e
            long r2 = java.lang.Math.min(r2, r0)
            goto L_0x002e
        L_0x00ab:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r0
            int r8 = r8 % r10
            goto L_0x0023
        L_0x00b2:
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x00b8
            r2 = 0
        L_0x00b8:
            r12.A01 = r2
        L_0x00ba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105725Ax.A02(boolean):X.55A");
    }

    public final void A03(int i2) {
        StringBuilder A0r = AnonymousClass000.A0r("DefaultDispatcher");
        A0r.append("-worker-");
        setName(AnonymousClass000.A0h(i2 == 0 ? "TERMINATED" : String.valueOf(i2), A0r));
        this.indexInArray = i2;
    }

    public final boolean A04(AnonymousClass421 r7) {
        AnonymousClass421 r5 = this.A03;
        boolean z2 = false;
        if (r5 == AnonymousClass421.CPU_ACQUIRED) {
            z2 = true;
            AnonymousClass58L.A08.addAndGet(this.A06, 4398046511104L);
        }
        if (r5 != r7) {
            this.A03 = r7;
        }
        return z2;
    }

    public void run() {
        AnonymousClass421 r8;
        long j2;
        int i2;
        loop0:
        while (true) {
            boolean z2 = false;
            while (true) {
                AnonymousClass58L r15 = this.A06;
                if (r15._isTerminated != 0 || this.A03 == (r8 = AnonymousClass421.TERMINATED)) {
                    A04(AnonymousClass421.TERMINATED);
                } else {
                    AnonymousClass55A A012 = A01(this.A04);
                    if (A012 != null) {
                        this.A01 = 0;
                        int i3 = A012.A01.A00;
                        this.A02 = 0;
                        if (this.A03 == AnonymousClass421.PARKING) {
                            this.A03 = AnonymousClass421.BLOCKING;
                        }
                        if (i3 != 0 && A04(AnonymousClass421.BLOCKING) && !r15.A04() && !r15.A05(r15.controlState)) {
                            r15.A04();
                        }
                        AnonymousClass58L.A00(A012);
                        if (i3 != 0) {
                            AnonymousClass58L.A08.addAndGet(r15, -2097152);
                            if (this.A03 != r8) {
                                this.A03 = AnonymousClass421.DORMANT;
                            }
                        }
                    } else {
                        this.A04 = false;
                        if (this.A01 != 0) {
                            if (z2) {
                                A04(AnonymousClass421.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.A01);
                                this.A01 = 0;
                                break;
                            }
                            z2 = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            AnonymousClass4QY r9 = AnonymousClass58L.A06;
                            if (obj != r9) {
                                this.workerCtl = -1;
                                while (this.nextParkedWorker != r9 && this.workerCtl == -1 && r15._isTerminated == 0 && this.A03 != r8) {
                                    A04(AnonymousClass421.PARKING);
                                    Thread.interrupted();
                                    if (this.A02 == 0) {
                                        this.A02 = System.nanoTime() + r15.A02;
                                    }
                                    LockSupport.parkNanos(r15.A02);
                                    if (System.nanoTime() - this.A02 >= 0) {
                                        this.A02 = 0;
                                        AnonymousClass4T9 r11 = r15.A03;
                                        synchronized (r11) {
                                            if (r15._isTerminated == 0 && ((int) (r15.controlState & 2097151)) > r15.A00 && A07.compareAndSet(this, -1, 1)) {
                                                int i4 = this.indexInArray;
                                                A03(0);
                                                r15.A03(this, i4, 0);
                                                int andDecrement = (int) (2097151 & AnonymousClass58L.A08.getAndDecrement(r15));
                                                if (andDecrement != i4) {
                                                    Object A002 = r11.A00(andDecrement);
                                                    C18450wi.A0F(A002);
                                                    C105725Ax r0 = (C105725Ax) A002;
                                                    r11.A01(i4, r0);
                                                    r0.A03(i4);
                                                    r15.A03(r0, andDecrement, i4);
                                                }
                                                r11.A01(andDecrement, (Object) null);
                                                this.A03 = r8;
                                            }
                                        }
                                    }
                                }
                            } else if (this.nextParkedWorker == r9) {
                                do {
                                    j2 = r15.parkedWorkersStack;
                                    i2 = this.indexInArray;
                                    this.nextParkedWorker = r15.A03.A00((int) (2097151 & j2));
                                } while (!AnonymousClass58L.A09.compareAndSet(r15, j2, ((long) i2) | ((2097152 + j2) & -2097152)));
                            }
                        }
                    }
                }
            }
        }
        A04(AnonymousClass421.TERMINATED);
    }
}
