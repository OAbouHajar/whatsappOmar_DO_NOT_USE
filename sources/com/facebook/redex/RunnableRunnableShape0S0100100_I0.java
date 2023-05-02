package com.facebook.redex;

public class RunnableRunnableShape0S0100100_I0 implements Runnable {
    public long A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape0S0100100_I0(Object obj, long j2, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r0 != 0) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A02
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x009f;
                case 2: goto L_0x008a;
                case 3: goto L_0x0077;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.1w2 r0 = (X.C41501w2) r0
            long r1 = r13.A00
            java.lang.ref.WeakReference r0 = r0.A0C
            java.lang.Object r0 = r0.get()
            X.1w4 r0 = (X.C41521w4) r0
            if (r0 == 0) goto L_0x0018
            r0.A02(r1)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r1 = r13.A01
            X.2UO r1 = (X.AnonymousClass2UO) r1
            long r11 = r13.A00
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0018
            X.2UP r8 = r1.A06
            X.4M6 r9 = r1.A00
            java.lang.String r1 = "CompanionDeviceQrHandler/onRetry retryTs="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Ui r5 = r8.A00
            X.2UO r1 = r5.A01
            if (r1 == 0) goto L_0x0041
            r0 = 0
            r1.A02 = r0
        L_0x0041:
            X.27H r0 = r5.A04
            X.0t3 r3 = r0.A00
            long r0 = r3.A01
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0072
            long r0 = r3.A01
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r2
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0072
        L_0x0058:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r3 = 86400(0x15180, double:4.26873E-319)
            long r3 = r3 + r0
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x00af
            r5.A00()
            X.0sq r0 = r5.A0I
            r10 = 1
            com.facebook.redex.RunnableRunnableShape0S0200100_I0 r7 = new com.facebook.redex.RunnableRunnableShape0S0200100_I0
            r7.<init>(r8, r9, r10, r11)
            r0.Acl(r7)
            return
        L_0x0072:
            long r0 = java.lang.System.currentTimeMillis()
            goto L_0x0058
        L_0x0077:
            java.lang.Object r5 = r13.A01
            com.obwhatsapp.migration.export.ui.ExportMigrationActivity r5 = (com.obwhatsapp.migration.export.ui.ExportMigrationActivity) r5
            long r3 = r13.A00
            X.1Vg r2 = r5.A0I
            java.lang.String r1 = r5.A0J
            r0 = 9
            r2.A00(r1, r0)
            r5.A36(r3)
            return
        L_0x008a:
            java.lang.Object r0 = r13.A01
            X.1Pq r0 = (X.C26891Pq) r0
            long r2 = r13.A00
            X.03L r1 = r0.A00
            monitor-enter(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x009c }
            r1.A03(r0)     // Catch:{ all -> 0x009c }
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            return
        L_0x009c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            throw r0
        L_0x009f:
            java.lang.Object r0 = r13.A01
            X.17A r0 = (X.AnonymousClass17A) r0
            long r2 = r13.A00
            X.03L r1 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A03(r0)
            return
        L_0x00af:
            java.lang.String r2 = "CompanionDeviceAdvUtil/isRetryTimestampValid retryTs="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r11)
            java.lang.String r2 = "; ntpTs="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "CompanionDeviceQrHandler/onRetry invalid local ts"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2Uf r0 = r5.A0G
            r0.ASJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0100100_I0.run():void");
    }
}
