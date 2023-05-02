package X;

/* renamed from: X.1QO  reason: invalid class name */
public class AnonymousClass1QO {
    public final AnonymousClass17J A00;
    public final C14710pd A01;

    public AnonymousClass1QO(AnonymousClass17J r1, C14710pd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public synchronized void A00(C42591y4 r5) {
        C42581y3 A002;
        C16730tY r3 = r5.A04;
        if (!r5.A04() && (A002 = this.A00.A00(r3.A11)) != null) {
            byte[] bArr = A002.A00;
            int[] iArr = A002.A01;
            synchronized (r5) {
                if (!r5.A00) {
                    r5.A02(bArr, iArr);
                }
            }
            r5.A05 = C40541uI.A00(this.A01, r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r0 = ((X.C16730tY) r2).A12();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A01(X.C16740tZ r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L_0x0006
            r0 = 0
        L_0x0004:
            monitor-exit(r1)
            return r0
        L_0x0006:
            boolean r0 = r2 instanceof X.C16730tY     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            r0 = r2
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ all -> 0x0024 }
            X.1y4 r0 = r0.A12()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.A04()     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001b
            r0 = 1
            goto L_0x0004
        L_0x001b:
            X.0tZ r0 = r2.A0D()     // Catch:{ all -> 0x0024 }
            boolean r0 = r1.A01(r0)     // Catch:{ all -> 0x0024 }
            goto L_0x0004
        L_0x0024:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QO.A01(X.0tZ):boolean");
    }
}
