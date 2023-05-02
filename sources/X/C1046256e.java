package X;

/* renamed from: X.56e  reason: invalid class name and case insensitive filesystem */
public final class C1046256e implements Runnable, Comparable, C109115Qt, AnonymousClass5NL {
    public int A00 = -1;
    public long A01;
    public Object A02;
    public final AnonymousClass5GN A03;
    public final /* synthetic */ C11510it A04;

    public C1046256e(AnonymousClass5GN r2, C11510it r3, long j2) {
        this.A04 = r3;
        this.A01 = j2;
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        if ((r11 - r3) > 0) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A00(X.C107185Gt r9, X.C11510it r10, long r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Object r0 = r8.A02     // Catch:{ all -> 0x008a }
            X.4QY r5 = X.AnonymousClass4Z3.A01     // Catch:{ all -> 0x008a }
            if (r0 != r5) goto L_0x0008
            goto L_0x007d
        L_0x0008:
            monitor-enter(r9)     // Catch:{ all -> 0x008a }
            X.5NL r1 = r9.A01()     // Catch:{ all -> 0x0087 }
            X.56e r1 = (X.C1046256e) r1     // Catch:{ all -> 0x0087 }
            int r0 = r10._isCompleted     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0016
            r0 = 1
            monitor-exit(r9)     // Catch:{ all -> 0x008a }
            goto L_0x007e
        L_0x0016:
            r6 = 0
            if (r1 == 0) goto L_0x002b
            long r1 = r1.A01     // Catch:{ all -> 0x0087 }
            long r3 = r1 - r11
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0023
            r11 = r1
        L_0x0023:
            long r3 = r9.A00     // Catch:{ all -> 0x0087 }
            long r1 = r11 - r3
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
        L_0x002b:
            r9.A00 = r11     // Catch:{ all -> 0x0087 }
            r3 = r11
        L_0x002e:
            long r1 = r8.A01     // Catch:{ all -> 0x0087 }
            long r1 = r1 - r3
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0037
            r8.A01 = r3     // Catch:{ all -> 0x0087 }
        L_0x0037:
            java.lang.Object r0 = r8.A02     // Catch:{ all -> 0x0087 }
            if (r0 == r5) goto L_0x0080
            r8.A02 = r9     // Catch:{ all -> 0x0087 }
            X.5NL[] r0 = r9.A00     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x0051
            r0 = 4
            X.5NL[] r0 = new X.AnonymousClass5NL[r0]     // Catch:{ all -> 0x0087 }
        L_0x0044:
            r9.A00 = r0     // Catch:{ all -> 0x0087 }
        L_0x0046:
            int r3 = r9._size     // Catch:{ all -> 0x0087 }
            int r1 = r3 + 1
            r9._size = r1     // Catch:{ all -> 0x0087 }
            r0[r3] = r8     // Catch:{ all -> 0x0087 }
            r8.A00 = r3     // Catch:{ all -> 0x0087 }
            goto L_0x0064
        L_0x0051:
            int r2 = r9._size     // Catch:{ all -> 0x0087 }
            int r1 = r0.length     // Catch:{ all -> 0x0087 }
            if (r2 < r1) goto L_0x0046
            int r1 = r9._size     // Catch:{ all -> 0x0087 }
            int r1 = r1 << 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x0087 }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x0087 }
            X.5NL[] r0 = (X.AnonymousClass5NL[]) r0     // Catch:{ all -> 0x0087 }
            goto L_0x0044
        L_0x0064:
            if (r3 <= 0) goto L_0x007a
            X.5NL[] r2 = r9.A00     // Catch:{ all -> 0x0087 }
            X.C18450wi.A0F(r2)     // Catch:{ all -> 0x0087 }
            int r0 = r3 + -1
            int r1 = r0 >> 1
            int r0 = X.AnonymousClass4XI.A00(r2, r1, r3)     // Catch:{ all -> 0x0087 }
            if (r0 <= 0) goto L_0x007a
            r9.A05(r3, r1)     // Catch:{ all -> 0x0087 }
            r3 = r1
            goto L_0x0064
        L_0x007a:
            monitor-exit(r9)     // Catch:{ all -> 0x008a }
            r0 = 0
            goto L_0x007e
        L_0x007d:
            r0 = 2
        L_0x007e:
            monitor-exit(r8)
            return r0
        L_0x0080:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x0087 }
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1046256e.A00(X.5Gt, X.0it, long):int");
    }

    public final boolean A01(long j2) {
        return C13700nu.A0f(((j2 - this.A01) > 0 ? 1 : ((j2 - this.A01) == 0 ? 0 : -1)));
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j2 = this.A01 - ((C1046256e) obj).A01;
        if (j2 > 0) {
            return 1;
        }
        return j2 < 0 ? -1 : 0;
    }

    public final synchronized void dispose() {
        C107185Gt r3;
        Object obj = this.A02;
        AnonymousClass4QY r2 = AnonymousClass4Z3.A01;
        if (obj != r2) {
            if ((obj instanceof C107185Gt) && (r3 = (C107185Gt) obj) != null) {
                synchronized (r3) {
                    Object obj2 = this.A02;
                    if ((obj2 instanceof AnonymousClass4XI) && ((AnonymousClass4XI) obj2) != null) {
                        r3.A04(this.A00);
                    }
                }
            }
            this.A02 = r2;
        }
    }

    public void run() {
        this.A03.A0B(AnonymousClass22M.A00, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Delayed[nanos=");
        A0r.append(this.A01);
        return C18450wi.A06(AnonymousClass3K2.A0m(A0r), this.A03);
    }
}
