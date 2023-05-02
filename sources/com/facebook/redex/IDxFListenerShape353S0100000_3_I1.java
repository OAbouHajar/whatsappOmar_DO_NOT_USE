package com.facebook.redex;

import X.AnonymousClass688;

public class IDxFListenerShape353S0100000_3_I1 implements AnonymousClass688 {
    public Object A00;
    public final int A01;

    public IDxFListenerShape353S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (0 < r1.size()) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011a, code lost:
        if (0 < r1.size()) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AVF(X.C118895va r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0077;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            X.5rY r0 = (X.C116545rY) r0
            java.util.Map r3 = r0.A01
            r5 = 0
            java.lang.Object r0 = X.AnonymousClass000.A0Y(r3, r5)
            X.5vM r0 = (X.C118855vM) r0
            r2 = 1
            if (r0 == 0) goto L_0x00c8
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x00c8
        L_0x001d:
            r1.get(r5)
            java.lang.String r0 = "shouldCheckCondition"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x0027:
            java.lang.Object r0 = r14.A00
            X.5yh r0 = (X.C119575yh) r0
            X.5qc r5 = r0.A09
            X.69e r1 = r0.A0N
            if (r1 == 0) goto L_0x00dd
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x00dd
            int r0 = r1.AAP()
            if (r5 == 0) goto L_0x00dd
            r1.AFv(r0)
            r11 = 0
            X.5uB[] r6 = r15.A0C
            if (r6 == 0) goto L_0x005d
            int r4 = r6.length
            X.5zB[] r11 = new X.AnonymousClass5zB[r4]
            r3 = 0
        L_0x0049:
            if (r3 >= r4) goto L_0x005d
            r0 = r6[r3]
            if (r0 == 0) goto L_0x005a
            java.nio.ByteBuffer r2 = r0.A02
            int r1 = r0.A01
            X.5zB r0 = new X.5zB
            r0.<init>(r2, r1)
            r11[r3] = r0
        L_0x005a:
            int r3 = r3 + 1
            goto L_0x0049
        L_0x005d:
            byte[] r9 = r15.A0A
            float[] r10 = r15.A0B
            android.util.Pair r8 = r15.A05
            int r12 = r15.A02
            int r13 = r15.A00
            X.5sz r7 = new X.5sz
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.5wU r6 = r5.A00
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r5 = r6.A06
            monitor-enter(r5)
            goto L_0x012a
        L_0x0077:
            java.lang.Object r1 = r14.A00
            X.5zC r1 = (X.AnonymousClass5zC) r1
            X.688 r0 = r1.A0H
            r1.Abz(r0)
            X.5uK r4 = r1.A0L
            X.5v2 r3 = r4.A00
            java.util.concurrent.locks.ReentrantLock r2 = r3.A01
            r2.lock()
            r2.lock()     // Catch:{ all -> 0x0167 }
            int r0 = r3.A00     // Catch:{ all -> 0x0162 }
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x0094
            r1 = 0
        L_0x0094:
            r2.unlock()     // Catch:{ all -> 0x0167 }
            r2.lock()     // Catch:{ all -> 0x0167 }
            boolean r0 = r3.A01()     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x00a8
            int r0 = r3.A00     // Catch:{ all -> 0x0162 }
            r0 = r0 | 2
            r0 = r0 & -2
            r3.A00 = r0     // Catch:{ all -> 0x0162 }
        L_0x00a8:
            r2.unlock()     // Catch:{ all -> 0x0167 }
            r2.unlock()
            if (r1 == 0) goto L_0x00dd
            X.AnonymousClass5xH.A00()
            X.5vM r1 = r4.A01
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00dd
            java.util.List r1 = r1.A00
            X.657 r0 = new X.657
            r0.<init>(r4, r1)
            X.AnonymousClass5xT.A00(r0)
            return
        L_0x00c8:
            java.lang.Integer r0 = X.C13680ns.A0a()
            java.lang.Object r9 = r3.get(r0)
            X.5vM r9 = (X.C118855vM) r9
            r0 = 2
            java.lang.Object r7 = X.AnonymousClass000.A0Y(r3, r0)
            X.5vM r7 = (X.C118855vM) r7
            if (r9 != 0) goto L_0x00de
            if (r7 != 0) goto L_0x00de
        L_0x00dd:
            return
        L_0x00de:
            int r0 = r15.A01
            if (r0 != r2) goto L_0x015a
            int r8 = r15.A00
            int r6 = r15.A02
            X.5uB[] r10 = r15.A0C
            if (r10 == 0) goto L_0x0112
            r0 = r10[r5]
            java.nio.ByteBuffer r4 = r0.A02
            if (r4 == 0) goto L_0x0112
            r3 = 0
        L_0x00f1:
            if (r3 >= r8) goto L_0x0112
            r2 = 0
        L_0x00f4:
            if (r2 >= r6) goto L_0x010f
            r0 = r10[r5]
            int r1 = r0.A01
            int r1 = r1 * r3
            int r0 = r0.A00
            int r0 = r0 * r2
            int r1 = r1 + r0
            r4.get(r1)
            int r0 = r1 + 1
            r4.get(r0)
            int r0 = r1 + 2
            r4.get(r0)
            int r2 = r2 + 1
            goto L_0x00f4
        L_0x010f:
            int r3 = r3 + 1
            goto L_0x00f1
        L_0x0112:
            if (r9 == 0) goto L_0x011e
            java.util.List r1 = r9.A00
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x011e
            goto L_0x001d
        L_0x011e:
            if (r7 == 0) goto L_0x00dd
            java.util.List r1 = r7.A00
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x00dd
            goto L_0x001d
        L_0x012a:
            boolean r0 = r6.A07     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0155
            X.5sc r4 = r6.A02     // Catch:{ all -> 0x0157 }
            byte[] r3 = r7.A03     // Catch:{ all -> 0x0157 }
            X.67p[] r2 = r7.A05     // Catch:{ all -> 0x0157 }
            int r1 = r7.A01     // Catch:{ all -> 0x0157 }
            int r0 = r7.A00     // Catch:{ all -> 0x0157 }
            r4.A02 = r3     // Catch:{ all -> 0x0157 }
            r4.A03 = r2     // Catch:{ all -> 0x0157 }
            r4.A01 = r1     // Catch:{ all -> 0x0157 }
            r4.A00 = r0     // Catch:{ all -> 0x0157 }
            r0 = 1
            r6.A09 = r0     // Catch:{ all -> 0x0157 }
            r5.notify()     // Catch:{ all -> 0x0157 }
        L_0x0146:
            boolean r0 = r6.A07     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0152
            boolean r0 = r6.A08     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0152
            r5.wait()     // Catch:{ InterruptedException -> 0x0146 }
            goto L_0x0146
        L_0x0152:
            r0 = 0
            r6.A09 = r0     // Catch:{ all -> 0x0157 }
        L_0x0155:
            monitor-exit(r5)     // Catch:{ all -> 0x0157 }
            return
        L_0x0157:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0157 }
            throw r0
        L_0x015a:
            java.lang.String r1 = "Clipping detection is not support when preview frame data is not in RGBA pixel format"
            X.67P r0 = new X.67P
            r0.<init>(r1)
            throw r0
        L_0x0162:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x0167 }
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFListenerShape353S0100000_3_I1.AVF(X.5va):void");
    }
}
