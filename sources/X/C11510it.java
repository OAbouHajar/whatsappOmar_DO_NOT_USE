package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0it  reason: invalid class name and case insensitive filesystem */
public abstract class C11510it extends AnonymousClass5GQ implements C12910lA {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01;
    public volatile /* synthetic */ Object _delayed = null;
    public volatile /* synthetic */ int _isCompleted = 0;
    public volatile /* synthetic */ Object _queue = null;

    static {
        Class<Object> cls = Object.class;
        Class<C11510it> cls2 = C11510it.class;
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    public final void A05(Runnable runnable, AnonymousClass1UM r2) {
        A0K(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (((X.C89404c6) r3).A04() == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06() {
        /*
            r6 = this;
            long r1 = super.A06()
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            java.lang.Object r3 = r6._queue
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L_0x0027
            boolean r0 = r3 instanceof X.C89404c6
            if (r0 == 0) goto L_0x0020
            X.4c6 r3 = (X.C89404c6) r3
            boolean r0 = r3.A04()
            if (r0 != 0) goto L_0x0027
        L_0x001f:
            return r4
        L_0x0020:
            X.4QY r0 = X.AnonymousClass4Z3.A00
            if (r3 != r0) goto L_0x001f
            return r1
        L_0x0027:
            java.lang.Object r0 = r6._delayed
            X.4XI r0 = (X.AnonymousClass4XI) r0
            if (r0 == 0) goto L_0x0043
            X.5NL r0 = r0.A02()
            X.56e r0 = (X.C1046256e) r0
            if (r0 == 0) goto L_0x0043
            long r2 = r0.A01
            long r0 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            r2 = 0
        L_0x0042:
            return r2
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11510it.A06():long");
    }

    public void A08() {
        C89704cl.A01();
        this._isCompleted = 1;
        A0I();
        do {
        } while (A0G() <= 0);
        A0J();
    }

    public final int A0F(C1046256e r4, long j2) {
        if (this._isCompleted != 0) {
            return 1;
        }
        C107185Gt r0 = (C107185Gt) this._delayed;
        if (r0 == null) {
            AnonymousClass0LG.A00(this, (Object) null, new C107185Gt(j2), A00);
            Object obj = this._delayed;
            C18450wi.A0F(obj);
            r0 = (C107185Gt) obj;
        }
        return r4.A00(r0, this, j2);
    }

    public long A0G() {
        if (A0B()) {
            return 0;
        }
        AnonymousClass4XI r6 = (AnonymousClass4XI) this._delayed;
        if (r6 != null && !r6.A06()) {
            long nanoTime = System.nanoTime();
            while (true) {
                synchronized (r6) {
                    AnonymousClass5NL A012 = r6.A01();
                    if (A012 != null) {
                        C1046256e r4 = (C1046256e) A012;
                        AnonymousClass5NL A04 = (!r4.A01(nanoTime) || !A0N(r4)) ? null : r6.A04(0);
                        if (A04 == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        Runnable A0H = A0H();
        if (A0H == null) {
            return A06();
        }
        A0H.run();
        return 0;
    }

    public final Runnable A0H() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C89404c6) {
                C89404c6 r2 = (C89404c6) obj;
                Object A012 = r2.A01();
                if (A012 != C89404c6.A04) {
                    return (Runnable) A012;
                }
                AnonymousClass0LG.A00(this, obj, r2.A02(), A01);
            } else if (obj == AnonymousClass4Z3.A00) {
                return null;
            } else {
                if (AnonymousClass0LG.A00(this, obj, (Object) null, A01)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public final void A0I() {
        boolean A002;
        do {
            Object obj = this._queue;
            if (obj == null) {
                A002 = AnonymousClass0LG.A00(this, (Object) null, AnonymousClass4Z3.A00, A01);
                continue;
            } else if (obj instanceof C89404c6) {
                ((C89404c6) obj).A03();
                return;
            } else if (obj != AnonymousClass4Z3.A00) {
                C89404c6 r1 = new C89404c6(8, true);
                r1.A00(obj);
                A002 = AnonymousClass0LG.A00(this, obj, r1, A01);
                continue;
            } else {
                return;
            }
        } while (!A002);
    }

    public final void A0J() {
        C1046256e r0;
        long nanoTime = System.nanoTime();
        while (true) {
            AnonymousClass4XI r02 = (AnonymousClass4XI) this._delayed;
            if (r02 != null && (r0 = (C1046256e) r02.A03()) != null) {
                A0E(r0, nanoTime);
            } else {
                return;
            }
        }
    }

    public void A0K(Runnable runnable) {
        if (A0N(runnable)) {
            A0D();
        } else {
            AnonymousClass5GP.A01.A0K(runnable);
        }
    }

    public final void A0L(C1046256e r3, long j2) {
        int A0F = A0F(r3, j2);
        if (A0F != 0) {
            if (A0F == 1) {
                A0E(r3, j2);
            }
        } else if (A0O(r3)) {
            A0D();
        }
    }

    public boolean A0M() {
        AnonymousClass4XI r0;
        if (A0A() && ((r0 = (AnonymousClass4XI) this._delayed) == null || r0.A06())) {
            Object obj = this._queue;
            if (obj == null) {
                return true;
            }
            if (obj instanceof C89404c6) {
                return ((C89404c6) obj).A04();
            }
            if (obj == AnonymousClass4Z3.A00) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0N(java.lang.Runnable r6) {
        /*
            r5 = this;
        L_0x0000:
            java.lang.Object r4 = r5._queue
            int r0 = r5._isCompleted
            r1 = 0
            if (r0 != 0) goto L_0x0047
            r3 = 1
            if (r4 != 0) goto L_0x0014
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = A01
            r0 = 0
            boolean r0 = X.AnonymousClass0LG.A00(r5, r0, r6, r1)
        L_0x0011:
            if (r0 == 0) goto L_0x0000
        L_0x0013:
            return r3
        L_0x0014:
            boolean r0 = r4 instanceof X.C89404c6
            if (r0 == 0) goto L_0x002d
            r2 = r4
            X.4c6 r2 = (X.C89404c6) r2
            int r0 = r2.A00(r6)
            if (r0 == 0) goto L_0x0013
            if (r0 != r3) goto L_0x0047
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = A01
            X.4c6 r0 = r2.A02()
            X.AnonymousClass0LG.A00(r5, r4, r0, r1)
            goto L_0x0000
        L_0x002d:
            X.4QY r0 = X.AnonymousClass4Z3.A00
            if (r4 == r0) goto L_0x0047
            r0 = 8
            X.4c6 r1 = new X.4c6
            r1.<init>(r0, r3)
            r1.A00(r4)
            r1.A00(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01
            boolean r0 = X.AnonymousClass0LG.A00(r5, r4, r1, r0)
            goto L_0x0011
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11510it.A0N(java.lang.Runnable):boolean");
    }

    public final boolean A0O(C1046256e r2) {
        AnonymousClass4XI r0 = (AnonymousClass4XI) this._delayed;
        return AnonymousClass000.A1Y(r0 == null ? null : r0.A02(), r2);
    }

    public void Ad6(AnonymousClass5GN r6, long j2) {
        long nanoTime = System.nanoTime();
        C1046256e r0 = new C1046256e(r6, this, 500000000 + nanoTime);
        AnonymousClass482.A00(r6, r0);
        A0L(r0, nanoTime);
    }
}
