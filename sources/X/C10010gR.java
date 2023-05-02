package X;

/* renamed from: X.0gR  reason: invalid class name and case insensitive filesystem */
public class C10010gR implements Runnable {
    public final /* synthetic */ C08070cz A00;
    public final /* synthetic */ String A01;

    public C10010gR(C08070cz r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        r0 = (X.C10630hR) r3.A06.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            X.0cz r4 = r5.A00
            X.022 r0 = r4.A01
            X.0d0 r3 = r0.A03
            java.lang.String r2 = r5.A01
            java.lang.Object r1 = r3.A0A
            monitor-enter(r1)
            java.util.Map r0 = r3.A07     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0048 }
            X.0hR r0 = (X.C10630hR) r0     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0021
            java.util.Map r0 = r3.A06     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0048 }
            X.0hR r0 = (X.C10630hR) r0     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0021
            r3 = 0
            goto L_0x0023
        L_0x0021:
            X.03i r3 = r0.A08     // Catch:{ all -> 0x0048 }
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0047
            boolean r0 = r3.A03()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r2 = r4.A06
            monitor-enter(r2)
            java.util.Map r1 = r4.A08     // Catch:{ all -> 0x0044 }
            X.0R5 r0 = X.AnonymousClass0MO.A00(r3)     // Catch:{ all -> 0x0044 }
            r1.put(r0, r3)     // Catch:{ all -> 0x0044 }
            java.util.Set r1 = r4.A09     // Catch:{ all -> 0x0044 }
            r1.add(r3)     // Catch:{ all -> 0x0044 }
            X.0lV r0 = r4.A04     // Catch:{ all -> 0x0044 }
            r0.Ac9(r1)     // Catch:{ all -> 0x0044 }
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0044:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r0
        L_0x0047:
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10010gR.run():void");
    }
}
