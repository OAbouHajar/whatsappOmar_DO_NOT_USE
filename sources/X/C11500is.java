package X;

/* renamed from: X.0is  reason: invalid class name and case insensitive filesystem */
public final class C11500is extends C11340ia implements Runnable, C12910lA {
    public final int A00;
    public final Object A01;
    public final C11340ia A02;
    public final C89124bd A03;
    public final /* synthetic */ C12910lA A04;
    public volatile int runningWorkers;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = (X.C12910lA) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11500is(X.C11340ia r2, int r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.A02 = r2
            r1.A00 = r3
            boolean r0 = r2 instanceof X.C12910lA
            if (r0 == 0) goto L_0x000f
            X.0lA r2 = (X.C12910lA) r2
            if (r2 != 0) goto L_0x0013
        L_0x000f:
            X.0lA r2 = X.C87754Yk.A00()
        L_0x0013:
            r1.A04 = r2
            X.4bd r0 = new X.4bd
            r0.<init>()
            r1.A03 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11500is.<init>(X.0ia, int):void");
    }

    public C11340ia A02(int i2) {
        AnonymousClass487.A00(i2);
        return i2 >= this.A00 ? this : super.A02(i2);
    }

    public void A05(Runnable runnable, AnonymousClass1UM r5) {
        if (!A06(runnable)) {
            synchronized (this.A01) {
                if (this.runningWorkers < this.A00) {
                    this.runningWorkers++;
                    this.A02.A05(this, this);
                }
            }
        }
    }

    public final boolean A06(Runnable runnable) {
        this.A03.A02(runnable);
        return this.runningWorkers >= this.A00;
    }

    public void Ad6(AnonymousClass5GN r4, long j2) {
        this.A04.Ad6(r4, 500);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r2.A00() != 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4.runningWorkers++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
        L_0x0000:
            r3 = 0
        L_0x0001:
            X.4bd r2 = r4.A03
            java.lang.Object r0 = r2.A01()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0027
            r0.run()     // Catch:{ all -> 0x000f }
            goto L_0x0015
        L_0x000f:
            r1 = move-exception
            X.58r r0 = X.C1052258r.A00
            X.AnonymousClass484.A00(r0, r1)
        L_0x0015:
            int r3 = r3 + 1
            r0 = 16
            if (r3 < r0) goto L_0x0001
            X.0ia r1 = r4.A02
            boolean r0 = r1.A03(r4)
            if (r0 == 0) goto L_0x0001
            r1.A05(r4, r4)
            return
        L_0x0027:
            java.lang.Object r1 = r4.A01
            monitor-enter(r1)
            int r0 = r4.runningWorkers     // Catch:{ all -> 0x0041 }
            int r0 = r0 + -1
            r4.runningWorkers = r0     // Catch:{ all -> 0x0041 }
            int r0 = r2.A00()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            int r0 = r4.runningWorkers     // Catch:{ all -> 0x0041 }
            int r0 = r0 + 1
            r4.runningWorkers = r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            goto L_0x0000
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11500is.run():void");
    }
}
