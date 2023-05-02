package com.facebook.redex;

public class RunnableRunnableShape1S0100100_I1 implements Runnable {
    public long A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape1S0100100_I1(Object obj, long j2, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        r1.A09(java.lang.Long.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r3.A0f(r0);
        r3.A14("business_activity_report_timestamp", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0013;
                case 2: goto L_0x002c;
                case 3: goto L_0x0045;
                case 4: goto L_0x0071;
                case 5: goto L_0x007f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A01
            X.4L7 r2 = (X.AnonymousClass4L7) r2
            long r0 = r5.A00
            monitor-enter(r2)
            r2.A00 = r0     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)
            return
        L_0x0010:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0013:
            java.lang.Object r2 = r5.A01
            X.373 r2 = (X.AnonymousClass373) r2
            long r3 = r5.A00
            java.lang.ref.WeakReference r0 = r2.A0A
            java.lang.Object r1 = r0.get()
            X.3Q1 r1 = (X.AnonymousClass3Q1) r1
            if (r1 == 0) goto L_0x0070
            boolean r0 = X.C16690tT.A02(r2)
            if (r0 != 0) goto L_0x0070
            X.027 r1 = r1.A06
            goto L_0x005d
        L_0x002c:
            java.lang.Object r2 = r5.A01
            X.373 r2 = (X.AnonymousClass373) r2
            long r3 = r5.A00
            java.lang.ref.WeakReference r0 = r2.A0A
            java.lang.Object r1 = r0.get()
            X.3Q1 r1 = (X.AnonymousClass3Q1) r1
            if (r1 == 0) goto L_0x0070
            boolean r0 = X.C16690tT.A02(r2)
            if (r0 != 0) goto L_0x0070
            X.027 r1 = r1.A09
            goto L_0x005d
        L_0x0045:
            java.lang.Object r2 = r5.A01
            X.373 r2 = (X.AnonymousClass373) r2
            long r3 = r5.A00
            java.lang.ref.WeakReference r0 = r2.A0A
            java.lang.Object r1 = r0.get()
            X.3Q1 r1 = (X.AnonymousClass3Q1) r1
            if (r1 == 0) goto L_0x0070
            boolean r0 = X.C16690tT.A02(r2)
            if (r0 != 0) goto L_0x0070
            X.027 r1 = r1.A08
        L_0x005d:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.A09(r0)
            return
        L_0x0065:
            java.lang.Object r0 = r5.A01
            X.4TD r0 = (X.AnonymousClass4TD) r0
            long r1 = r5.A00
            X.5TI r0 = r0.A01
            r0.AMq(r1)
        L_0x0070:
            return
        L_0x0071:
            java.lang.Object r0 = r5.A01
            X.3GZ r0 = (X.AnonymousClass3GZ) r0
            long r1 = r5.A00
            X.4F1 r0 = r0.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            X.0rz r3 = r0.A04
            r0 = 1
            goto L_0x0097
        L_0x007f:
            java.lang.Object r0 = r5.A01
            X.3Ga r0 = (X.C63073Ga) r0
            long r1 = r5.A00
            X.4F0 r0 = r0.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel r4 = r0.A00
            X.027 r3 = r4.A01
            r0 = 0
            X.C13680ns.A1O(r3, r0)
            X.027 r3 = r4.A02
            r0 = 1
            X.C13680ns.A1O(r3, r0)
            X.0rz r3 = r4.A04
        L_0x0097:
            r3.A0f(r0)
            java.lang.String r0 = "business_activity_report_timestamp"
            r3.A14(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S0100100_I1.run():void");
    }
}
