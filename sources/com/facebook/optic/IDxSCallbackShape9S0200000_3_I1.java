package com.facebook.optic;

import X.AnonymousClass5xH;
import X.C118595uw;
import X.C118645v1;
import X.C119305ws;

public class IDxSCallbackShape9S0200000_3_I1 extends C118595uw {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSCallbackShape9S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A01(IDxSCallbackShape9S0200000_3_I1 iDxSCallbackShape9S0200000_3_I1, Exception exc) {
        C119305ws r1 = (C119305ws) iDxSCallbackShape9S0200000_3_I1.A00;
        r1.A0G = false;
        AnonymousClass5xH.A00();
        r1.A04((C118645v1) iDxSCallbackShape9S0200000_3_I1.A01, exc);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        ((java.util.concurrent.CountDownLatch) r5.A01).countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.Exception r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0038;
                default: goto L_0x0005;
            }
        L_0x0005:
            A01(r5, r6)
            return
        L_0x0009:
            java.lang.Object r4 = r5.A00
            X.5yh r4 = (X.C119575yh) r4
            java.lang.Object r3 = r4.A0U
            monitor-enter(r3)
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0016:
            r0 = 0
            r4.A0X = r0     // Catch:{ all -> 0x0035 }
            X.5qf r2 = r4.A0W     // Catch:{ all -> 0x0035 }
            r0 = 0
            r4.A0W = r0     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object[] r1 = X.C13690nt.A1Z()     // Catch:{ all -> 0x0035 }
            X.C13690nt.A1L(r2, r6, r1)     // Catch:{ all -> 0x0035 }
            r0 = 10
            X.C119575yh.A00(r4, r1, r0)     // Catch:{ all -> 0x0035 }
        L_0x002c:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r5.A01
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            java.lang.Object r1 = r5.A00
            X.5zC r1 = (X.AnonymousClass5zC) r1
            r0 = 0
            r1.A0e = r0
            java.lang.Object r0 = r5.A01
            X.5uw r0 = (X.C118595uw) r0
            r0.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.optic.IDxSCallbackShape9S0200000_3_I1.A02(java.lang.Exception):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        ((java.util.concurrent.CountDownLatch) r5.A01).countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A03(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0038;
                default: goto L_0x0005;
            }
        L_0x0005:
            ((X.C119305ws) r5.A00).A0G = false
            return
        L_0x0009:
            java.lang.Object r4 = r5.A00
            X.5yh r4 = (X.C119575yh) r4
            java.lang.Object r3 = r4.A0U
            monitor-enter(r3)
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0016:
            r0 = 0
            r4.A0X = r0     // Catch:{ all -> 0x0035 }
            X.5qf r2 = r4.A0W     // Catch:{ all -> 0x0035 }
            r0 = 0
            r4.A0W = r0     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object[] r1 = X.C13690nt.A1Z()     // Catch:{ all -> 0x0035 }
            X.C13690nt.A1L(r2, r6, r1)     // Catch:{ all -> 0x0035 }
            r0 = 9
            X.C119575yh.A00(r4, r1, r0)     // Catch:{ all -> 0x0035 }
        L_0x002c:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r5.A01
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            java.lang.Object r0 = r5.A01
            X.5uw r0 = (X.C118595uw) r0
            r0.A03(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.optic.IDxSCallbackShape9S0200000_3_I1.A03(java.lang.Object):void");
    }
}
