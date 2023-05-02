package X;

import java.io.Closeable;

/* renamed from: X.0ev  reason: invalid class name and case insensitive filesystem */
public class C09110ev implements Closeable, Cloneable {
    public static final C12870l6 A04 = new C08810eN();
    public static final C12880l7 A05 = new C08820eO();
    public boolean A00 = false;
    public final C12870l6 A01;
    public final C06180Up A02;
    public final Throwable A03;

    public C09110ev(C12870l6 r2, C06180Up r3, Throwable th) {
        this.A02 = r3;
        synchronized (r3) {
            r3.A01();
            r3.A00++;
        }
        this.A01 = r2;
        this.A03 = th;
    }

    public C09110ev(C12870l6 r3, C12880l7 r4, Object obj) {
        this.A02 = new C06180Up(r4, obj);
        this.A01 = r3;
        this.A03 = null;
    }

    public static C09110ev A00(C12880l7 r2, Object obj) {
        C12870l6 r1 = A04;
        if (obj != null) {
            return new C09110ev(r1, r2, obj);
        }
        return null;
    }

    public static boolean A01(C09110ev r2) {
        boolean z2;
        if (r2 != null) {
            synchronized (r2) {
                z2 = !r2.A00;
            }
            return z2;
        }
    }

    /* renamed from: A02 */
    public C09110ev clone() {
        boolean z2;
        synchronized (this) {
            z2 = !this.A00;
        }
        AnonymousClass0T3.A01(z2);
        return new C09110ev(this.A01, this.A02, this.A03);
    }

    public synchronized C09110ev A03() {
        C09110ev A022;
        synchronized (this) {
            A022 = this.A00 ^ true ? clone() : null;
        }
        return A022;
    }

    public synchronized Object A04() {
        AnonymousClass0T3.A01(AnonymousClass000.A1P(this.A00 ? 1 : 0));
        return this.A02.A00();
    }

    public void A05() {
        try {
            synchronized (this) {
                if (!this.A00) {
                    this.A01.AcC(this.A02, this.A03);
                    close();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.AnonymousClass0T3.A00(X.AnonymousClass000.A1Q(r2.A00));
        r0 = r2.A00 - 1;
        r2.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r0 != 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6 = r2.A01;
        r2.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        r2.A02.Abg(r6);
        r5 = X.C06180Up.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0 = (java.lang.Integer) r5.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        if (r0 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        X.AnonymousClass0X1.A04("SharedReference", "No entry in sLiveObjects for value of type %s", r6.getClass());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        r0 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r0 != 1) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        r5.remove(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        r5.put(r6, java.lang.Integer.valueOf(r0 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        monitor-enter(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.A00     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x006a }
            return
        L_0x0007:
            r0 = 1
            r7.A00 = r0     // Catch:{ all -> 0x006a }
            monitor-exit(r7)     // Catch:{ all -> 0x006a }
            X.0Up r2 = r7.A02
            monitor-enter(r2)
            r2.A01()     // Catch:{ all -> 0x0067 }
            int r0 = r2.A00     // Catch:{ all -> 0x0067 }
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            X.AnonymousClass0T3.A00(r0)     // Catch:{ all -> 0x0067 }
            int r0 = r2.A00     // Catch:{ all -> 0x0067 }
            int r0 = r0 - r1
            r2.A00 = r0     // Catch:{ all -> 0x0067 }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0066
            monitor-enter(r2)
            java.lang.Object r6 = r2.A01     // Catch:{ all -> 0x0063 }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x0063 }
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            X.0l7 r0 = r2.A02
            r0.Abg(r6)
            java.util.Map r5 = X.C06180Up.A03
            monitor-enter(r5)
            java.lang.Object r0 = r5.get(r6)     // Catch:{ all -> 0x0060 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x004c
            java.lang.String r4 = "SharedReference"
            java.lang.String r3 = "No entry in sLiveObjects for value of type %s"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0060 }
            r1 = 0
            java.lang.Class r0 = r6.getClass()     // Catch:{ all -> 0x0060 }
            r2[r1] = r0     // Catch:{ all -> 0x0060 }
            X.AnonymousClass0X1.A04(r4, r3, r2)     // Catch:{ all -> 0x0060 }
        L_0x004a:
            monitor-exit(r5)     // Catch:{ all -> 0x0060 }
            goto L_0x005f
        L_0x004c:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0060 }
            if (r0 != r1) goto L_0x0056
            r5.remove(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x004a
        L_0x0056:
            int r0 = r0 - r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0060 }
            r5.put(r6, r0)     // Catch:{ all -> 0x0060 }
            goto L_0x004a
        L_0x005f:
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0060 }
            throw r0
        L_0x0063:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            throw r0
        L_0x0066:
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x006a:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09110ev.close():void");
    }

    public void finalize() {
        try {
            synchronized (this) {
                if (!this.A00) {
                    Object[] objArr = new Object[3];
                    AnonymousClass000.A1M(objArr, System.identityHashCode(this), 0);
                    C06180Up r2 = this.A02;
                    AnonymousClass000.A1M(objArr, System.identityHashCode(r2), 1);
                    objArr[2] = AnonymousClass000.A0d(r2.A00());
                    AnonymousClass0X1.A03("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                    this.A01.AcC(r2, this.A03);
                    close();
                }
            }
            A05();
        } catch (Throwable th) {
            A05();
            throw th;
        }
    }
}
