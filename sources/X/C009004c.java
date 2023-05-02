package X;

/* renamed from: X.04c  reason: invalid class name and case insensitive filesystem */
public abstract class C009004c implements Runnable {
    public final C08020cu A00 = new C08020cu();

    public abstract void A00();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (r2 != null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass022 r7, java.lang.String r8) {
        /*
            r6 = this;
            androidx.work.impl.WorkDatabase r0 = r7.A04
            X.0lu r5 = r0.A0J()
            X.0kf r4 = r0.A0E()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r3.add(r8)
        L_0x0012:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0037
            java.lang.Object r2 = r3.remove()
            java.lang.String r2 = (java.lang.String) r2
            X.0KV r1 = r5.AGF(r2)
            X.0KV r0 = X.AnonymousClass0KV.SUCCEEDED
            if (r1 == r0) goto L_0x002f
            X.0KV r0 = X.AnonymousClass0KV.FAILED
            if (r1 == r0) goto L_0x002f
            X.0KV r0 = X.AnonymousClass0KV.CANCELLED
            r5.Aeh(r0, r2)
        L_0x002f:
            java.util.List r0 = r4.ABk(r2)
            r3.addAll(r0)
            goto L_0x0012
        L_0x0037:
            X.0d0 r5 = r7.A03
            java.lang.Object r4 = r5.A0A
            monitor-enter(r4)
            X.0Wm r3 = X.C06530Wm.A00()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = X.C08080d0.A0C     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "Processor cancelling "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0096 }
            r3.A02(r2, r0)     // Catch:{ all -> 0x0096 }
            java.util.Set r0 = r5.A09     // Catch:{ all -> 0x0096 }
            r0.add(r8)     // Catch:{ all -> 0x0096 }
            java.util.Map r0 = r5.A07     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r0.remove(r8)     // Catch:{ all -> 0x0096 }
            X.0hR r2 = (X.C10630hR) r2     // Catch:{ all -> 0x0096 }
            r1 = 1
            if (r2 != 0) goto L_0x0071
            r1 = 0
            java.util.Map r0 = r5.A06     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r0.remove(r8)     // Catch:{ all -> 0x0096 }
            X.0hR r2 = (X.C10630hR) r2     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x0076
        L_0x0071:
            java.util.Map r0 = r5.A08     // Catch:{ all -> 0x0096 }
            r0.remove(r8)     // Catch:{ all -> 0x0096 }
        L_0x0076:
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            X.C08080d0.A00(r2, r8)
            if (r1 == 0) goto L_0x007f
            r5.A01()
        L_0x007f:
            java.util.List r0 = r7.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x0085:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r1.next()
            X.0lf r0 = (X.C13220lf) r0
            r0.A61(r8)
            goto L_0x0085
        L_0x0095:
            return
        L_0x0096:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009004c.A01(X.022, java.lang.String):void");
    }

    public void run() {
        try {
            A00();
            this.A00.A00(C13470m5.A01);
        } catch (Throwable th) {
            this.A00.A00(new C02930Gh(th));
        }
    }
}
