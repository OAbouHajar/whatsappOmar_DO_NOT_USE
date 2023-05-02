package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.apache.commons.io.FileUtils;

/* renamed from: X.4c6  reason: invalid class name and case insensitive filesystem */
public final class C89404c6 {
    public static final AnonymousClass4QY A04 = new AnonymousClass4QY("REMOVE_FROZEN");
    public static final /* synthetic */ AtomicLongFieldUpdater A05;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A06;
    public final int A00;
    public final int A01;
    public final boolean A02;
    public /* synthetic */ AtomicReferenceArray A03;
    public volatile /* synthetic */ Object _next = null;
    public volatile /* synthetic */ long _state = 0;

    static {
        Class<C89404c6> cls = C89404c6.class;
        A06 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        A05 = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C89404c6(int i2, boolean z2) {
        this.A00 = i2;
        this.A02 = z2;
        int i3 = i2 - 1;
        this.A01 = i3;
        this.A03 = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823) || (i2 & i3) != 0) {
            throw AnonymousClass000.A0V("Check failed.");
        }
    }

    public final int A00(Object obj) {
        while (true) {
            C89404c6 r11 = this;
            long j2 = r11._state;
            if ((3458764513820540928L & j2) == 0) {
                int i2 = (int) ((1073741823 & j2) >> 0);
                int i3 = (int) ((1152921503533105152L & j2) >> 30);
                int i4 = r11.A01;
                if (((i3 + 2) & i4) != (i2 & i4)) {
                    if (!r11.A02 && r11.A03.get(i3 & i4) != null) {
                        int i5 = r11.A00;
                        if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                            break;
                        }
                    } else if (A05.compareAndSet(r11, j2, (j2 & -1152921503533105153L) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                        Object obj2 = obj;
                        r11.A03.set(i3 & i4, obj2);
                        while ((r11._state & FileUtils.ONE_EB) != 0) {
                            r11 = r11.A02();
                            AtomicReferenceArray atomicReferenceArray = r11.A03;
                            int i6 = r11.A01 & i3;
                            Object obj3 = atomicReferenceArray.get(i6);
                            if (!(obj3 instanceof C83174Fq) || ((C83174Fq) obj3).A00 != i3) {
                                break;
                            }
                            atomicReferenceArray.set(i6, obj2);
                        }
                        return 0;
                    }
                } else {
                    break;
                }
            } else {
                return C13690nt.A00(((j2 & 2305843009213693952L) > 0 ? 1 : ((j2 & 2305843009213693952L) == 0 ? 0 : -1)));
            }
        }
        return 1;
    }

    public final Object A01() {
        while (true) {
            C89404c6 r12 = this;
            long j2 = r12._state;
            if ((FileUtils.ONE_EB & j2) == 0) {
                int i2 = (int) ((1073741823 & j2) >> 0);
                int i3 = r12.A01;
                int i4 = i2 & i3;
                if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) != i4) {
                    AtomicReferenceArray atomicReferenceArray = r12.A03;
                    Object obj = atomicReferenceArray.get(i4);
                    if (obj != null) {
                        if (obj instanceof C83174Fq) {
                            break;
                        }
                        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
                        long j3 = ((long) ((i2 + 1) & 1073741823)) << 0;
                        if (atomicLongFieldUpdater.compareAndSet(r12, j2, (j2 & -1073741824) | j3)) {
                            atomicReferenceArray.set(i4, (Object) null);
                            return obj;
                        } else if (r12.A02) {
                            while (true) {
                                long j4 = r12._state;
                                int i5 = (int) ((1073741823 & j4) >> 0);
                                if ((FileUtils.ONE_EB & j4) != 0) {
                                    r12 = r12.A02();
                                } else if (atomicLongFieldUpdater.compareAndSet(r12, j4, (j4 & -1073741824) | j3)) {
                                    r12.A03.set(r12.A01 & i5, (Object) null);
                                    return obj;
                                }
                            }
                        }
                    } else if (r12.A02) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return A04;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C89404c6 A02() {
        /*
            r13 = this;
        L_0x0000:
            r8 = r13
            long r9 = r13._state
            r5 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r3 = r9 & r5
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0018
            long r11 = r9 | r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = A05
            boolean r0 = r7.compareAndSet(r8, r9, r11)
            if (r0 == 0) goto L_0x0000
            r9 = r11
        L_0x0018:
            java.lang.Object r0 = r13._next
            X.4c6 r0 = (X.C89404c6) r0
            if (r0 == 0) goto L_0x001f
            return r0
        L_0x001f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = A06
            r5 = 0
            int r0 = r13.A00
            int r1 = r0 << 1
            boolean r0 = r13.A02
            X.4c6 r4 = new X.4c6
            r4.<init>(r1, r0)
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r9
            r2 = 0
            long r0 = r0 >> r2
            int r3 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r9
            r2 = 30
            long r0 = r0 >> r2
            int r7 = (int) r0
        L_0x003e:
            int r2 = r13.A01
            r1 = r3 & r2
            r0 = r7 & r2
            if (r1 == r0) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.A03
            r2 = r2 & r3
            java.lang.Object r2 = r0.get(r2)
            if (r2 != 0) goto L_0x0054
            X.4Fq r2 = new X.4Fq
            r2.<init>(r3)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.A03
            int r0 = r4.A01
            r0 = r0 & r3
            r1.set(r0, r2)
            int r3 = r3 + 1
            goto L_0x003e
        L_0x005f:
            r2 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r0 = r9 & r2
            r4._state = r0
            X.AnonymousClass0LG.A00(r13, r5, r4, r6)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89404c6.A02():X.4c6");
    }

    public final boolean A03() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                break;
            } else if ((FileUtils.ONE_EB & j2) != 0) {
                return false;
            }
        } while (!A05.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final boolean A04() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }
}
