package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* renamed from: X.2ni  reason: invalid class name */
public final class AnonymousClass2ni extends Handler implements Runnable {
    public int A00;
    public C15090qJ A01;
    public IOException A02;
    public Thread A03;
    public boolean A04;
    public final long A05;
    public final AnonymousClass5RC A06;
    public volatile boolean A07;
    public final /* synthetic */ C88124Zz A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2ni(Looper looper, C15090qJ r2, AnonymousClass5RC r3, C88124Zz r4, long j2) {
        super(looper);
        this.A08 = r4;
        this.A06 = r3;
        this.A01 = r2;
        this.A05 = j2;
    }

    public void A00(boolean z2) {
        this.A07 = z2;
        this.A02 = null;
        if (hasMessages(0)) {
            this.A04 = true;
            removeMessages(0);
            if (!z2) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            synchronized (this) {
                this.A04 = true;
                ((AnonymousClass3E8) this.A06).A0D = true;
                Thread thread = this.A03;
                if (thread != null) {
                    thread.interrupt();
                }
            }
            if (!z2) {
                return;
            }
        }
        this.A08.A00 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A01.ASj(this.A06, elapsedRealtime, elapsedRealtime - this.A05, true);
        this.A01 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r36) {
        /*
            r35 = this;
            r1 = r35
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0018
            r5 = r36
            int r4 = r5.what
            if (r4 != 0) goto L_0x0019
            r0 = 0
            r1.A02 = r0
            X.4Zz r0 = r1.A08
            java.util.concurrent.ExecutorService r1 = r0.A02
            X.2ni r0 = r0.A00
            r1.execute(r0)
        L_0x0018:
            return
        L_0x0019:
            r0 = 3
            if (r4 == r0) goto L_0x021d
            X.4Zz r0 = r1.A08
            r34 = r0
            r2 = 0
            r0.A00 = r2
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r2 = r1.A05
            long r8 = r6 - r2
            X.0qJ r0 = r1.A01
            boolean r2 = r1.A04
            if (r2 == 0) goto L_0x003a
            X.5RC r1 = r1.A06
            r10 = 0
            r4 = r0
            r5 = r1
            r4.ASj(r5, r6, r8, r10)
            return
        L_0x003a:
            r10 = 1
            if (r4 == r10) goto L_0x019c
            r2 = 2
            if (r4 != r2) goto L_0x0018
            java.lang.Object r9 = r5.obj
            java.io.IOException r9 = (java.io.IOException) r9
            r1.A02 = r9
            int r2 = r1.A00
            int r7 = r2 + 1
            r1.A00 = r7
            X.5RC r6 = r1.A06
            X.0qF r0 = (X.C15050qF) r0
            X.3E8 r6 = (X.AnonymousClass3E8) r6
            long r2 = r0.A05
            r11 = -1
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x005e
            long r2 = r6.A00
            r0.A05 = r2
        L_0x005e:
            X.4qJ r4 = r6.A0B
            X.3AL r11 = r6.A03
            android.net.Uri r8 = r4.A01
            java.util.Map r5 = r4.A02
            X.1c1 r23 = new X.1c1
            r4 = r23
            r4.<init>(r8, r11, r5)
            long r4 = r6.A01
            r21 = r4
            long r30 = X.C90604eR.A02(r21)
            long r4 = r0.A03
            long r32 = X.C90604eR.A02(r4)
            r28 = -1
            r20 = 0
            r15 = 0
            X.1c2 r4 = new X.1c2
            r26 = r20
            r27 = 1
            r29 = 0
            r24 = r4
            r25 = r20
            r24.<init>(r25, r26, r27, r28, r29, r30, r32)
            X.4LZ r8 = new X.4LZ
            r5 = r23
            r8.<init>(r5, r4, r9, r7)
            java.io.IOException r5 = r8.A03
            boolean r4 = r5 instanceof X.AnonymousClass40M
            if (r4 != 0) goto L_0x00d0
            boolean r4 = r5 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x00d0
            boolean r4 = r5 instanceof X.C65613Vl
            if (r4 != 0) goto L_0x00d0
            boolean r4 = r5 instanceof X.AnonymousClass408
            if (r4 != 0) goto L_0x00d0
            int r4 = r8.A00
            int r4 = r4 + -1
            int r5 = r4 * 1000
            r4 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r5, r4)
            long r4 = (long) r4
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x00d0
            X.2ip[] r12 = r0.A0L
            int r11 = r12.length
            r14 = 0
            r13 = 0
        L_0x00c3:
            if (r14 >= r11) goto L_0x00d3
            r7 = r12[r14]
            int r8 = r7.A00
            int r7 = r7.A02
            int r8 = r8 + r7
            int r13 = r13 + r8
            int r14 = r14 + 1
            goto L_0x00c3
        L_0x00d0:
            X.4GP r6 = X.C88124Zz.A04
            goto L_0x00f7
        L_0x00d3:
            int r7 = r0.A02
            boolean r7 = X.C13700nu.A0g(r13, r7)
            r16 = -1
            int r8 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r8 != 0) goto L_0x00f0
            X.1gD r2 = r0.A07
            if (r2 == 0) goto L_0x0125
            long r18 = r2.ABr()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x0125
        L_0x00f0:
            r0.A02 = r13
        L_0x00f2:
            X.4GP r6 = new X.4GP
            r6.<init>(r7, r4)
        L_0x00f7:
            int r8 = r6.A00
            r2 = 1
            if (r8 == 0) goto L_0x00ff
            if (r8 == r10) goto L_0x00ff
            r2 = 0
        L_0x00ff:
            r11 = r2 ^ 1
            X.1bz r7 = r0.A0R
            long r4 = r0.A03
            r2 = r21
            long r30 = r7.A00(r2)
            long r32 = r7.A00(r4)
            X.1c2 r0 = new X.1c2
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r32)
            r2 = r23
            r7.A04(r2, r0, r9, r11)
            r0 = 3
            if (r8 != r0) goto L_0x0158
            java.io.IOException r1 = r1.A02
            r0 = r34
            r0.A01 = r1
            return
        L_0x0125:
            boolean r3 = r0.A0G
            r13 = 0
            if (r3 == 0) goto L_0x0139
            boolean r2 = r0.A0E
            if (r2 != 0) goto L_0x0139
            boolean r2 = r0.A07()
            if (r2 != 0) goto L_0x0139
            r0.A0F = r10
            X.4GP r6 = X.C88124Zz.A03
            goto L_0x00f7
        L_0x0139:
            r0.A0E = r3
            r2 = 0
            r0.A04 = r2
            r0.A02 = r15
        L_0x0141:
            if (r13 >= r11) goto L_0x014b
            r8 = r12[r13]
            r8.A04(r15)
            int r13 = r13 + 1
            goto L_0x0141
        L_0x014b:
            X.4Bt r8 = r6.A09
            r8.A00 = r2
            r6.A01 = r2
            r21 = 0
            r6.A04 = r10
            r6.A05 = r15
            goto L_0x00f2
        L_0x0158:
            r0 = 2
            if (r8 == r0) goto L_0x0018
            if (r8 != r10) goto L_0x015f
            r1.A00 = r10
        L_0x015f:
            long r2 = r6.A01
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0177
            int r0 = r1.A00
            int r0 = r0 + -1
            int r2 = r0 * 1000
            r0 = 5000(0x1388, float:7.006E-42)
            int r0 = java.lang.Math.min(r2, r0)
            long r2 = (long) r0
        L_0x0177:
            r0 = r34
            X.2ni r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1W(r0)
            X.C90524eJ.A04(r0)
            r0 = r34
            r0.A00 = r1
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0190
            r1.sendEmptyMessageDelayed(r15, r2)
            return
        L_0x0190:
            r0 = r20
            r1.A02 = r0
            r0 = r34
            java.util.concurrent.ExecutorService r0 = r0.A02
            r0.execute(r1)
            return
        L_0x019c:
            X.5RC r6 = r1.A06     // Catch:{ RuntimeException -> 0x020b }
            X.0qF r0 = (X.C15050qF) r0     // Catch:{ RuntimeException -> 0x020b }
            X.3E8 r6 = (X.AnonymousClass3E8) r6     // Catch:{ RuntimeException -> 0x020b }
            long r4 = r0.A03     // Catch:{ RuntimeException -> 0x020b }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x01ce
            X.1gD r1 = r0.A07     // Catch:{ RuntimeException -> 0x020b }
            if (r1 == 0) goto L_0x01ce
            boolean r7 = r1.AJe()     // Catch:{ RuntimeException -> 0x020b }
            long r2 = r0.A00()     // Catch:{ RuntimeException -> 0x020b }
            r4 = -9223372036854775808
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x01c2
            r2 = 0
            goto L_0x01c5
        L_0x01c2:
            r4 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 + r4
        L_0x01c5:
            r0.A03 = r2     // Catch:{ RuntimeException -> 0x020b }
            X.5Nn r4 = r0.A0T     // Catch:{ RuntimeException -> 0x020b }
            boolean r1 = r0.A0C     // Catch:{ RuntimeException -> 0x020b }
            r4.AXL(r2, r7, r1)     // Catch:{ RuntimeException -> 0x020b }
        L_0x01ce:
            X.4qJ r1 = r6.A0B     // Catch:{ RuntimeException -> 0x020b }
            X.3AL r3 = r6.A03     // Catch:{ RuntimeException -> 0x020b }
            android.net.Uri r2 = r1.A01     // Catch:{ RuntimeException -> 0x020b }
            java.util.Map r1 = r1.A02     // Catch:{ RuntimeException -> 0x020b }
            X.1c1 r7 = new X.1c1     // Catch:{ RuntimeException -> 0x020b }
            r7.<init>(r2, r3, r1)     // Catch:{ RuntimeException -> 0x020b }
            X.1bz r5 = r0.A0R     // Catch:{ RuntimeException -> 0x020b }
            r12 = 0
            long r1 = r6.A01     // Catch:{ RuntimeException -> 0x020b }
            long r3 = r0.A03     // Catch:{ RuntimeException -> 0x020b }
            r15 = -1
            r16 = 0
            long r17 = r5.A00(r1)     // Catch:{ RuntimeException -> 0x020b }
            long r19 = r5.A00(r3)     // Catch:{ RuntimeException -> 0x020b }
            r14 = 1
            X.1c2 r11 = new X.1c2     // Catch:{ RuntimeException -> 0x020b }
            r13 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)     // Catch:{ RuntimeException -> 0x020b }
            r5.A02(r7, r11)     // Catch:{ RuntimeException -> 0x020b }
            long r4 = r0.A05     // Catch:{ RuntimeException -> 0x020b }
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0203
            long r1 = r6.A00     // Catch:{ RuntimeException -> 0x020b }
            r0.A05 = r1     // Catch:{ RuntimeException -> 0x020b }
        L_0x0203:
            r0.A0D = r10     // Catch:{ RuntimeException -> 0x020b }
            X.0qM r1 = r0.A09     // Catch:{ RuntimeException -> 0x020b }
            r1.AP8(r0)     // Catch:{ RuntimeException -> 0x020b }
            return
        L_0x020b:
            r2 = move-exception
            java.lang.String r1 = "LoadTask"
            java.lang.String r0 = "Unexpected exception handling load completed"
            X.C89504cL.A01(r1, r0, r2)
            X.408 r1 = new X.408
            r1.<init>(r2)
            r0 = r34
            r0.A01 = r1
            return
        L_0x021d:
            java.lang.Object r0 = r5.obj
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ni.handleMessage(android.os.Message):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:63|64) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c3, code lost:
        if (r19.A02 != r5) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c5, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r3 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0224, code lost:
        if (r3 == null) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0226, code lost:
        r3 = r3.AF7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x022c, code lost:
        if (r3 == -1) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x022e, code lost:
        r30.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0235, code lost:
        if (r10 == 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0242, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x024d, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x024f, code lost:
        X.C90524eJ.A04(r17);
        r19.AcS();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0255, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0281, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0282, code lost:
        if (r10 != 1) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r0 = ((X.C55122is) r1.A0A).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x028a, code lost:
        if (r0 != null) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x028c, code lost:
        r3 = r0.AF7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0292, code lost:
        if (r3 != -1) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0294, code lost:
        r1.A09.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        r1.A0B.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02b7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        X.C90224dm.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0235, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        android.util.Log.w("IcyHeaders", X.AnonymousClass000.A0h(r3, X.AnonymousClass000.A0q("Invalid metadata interval: ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        if (r14 == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b7, code lost:
        if (r7.A00 == null) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01bc, code lost:
        if (r7.A00 == null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01be, code lost:
        r3 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x023c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:180:0x029d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x011c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01b5 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5 A[Catch:{ EOFException -> 0x01b5, all -> 0x0242, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[Catch:{ EOFException -> 0x01b5, all -> 0x0242, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3 A[Catch:{ EOFException -> 0x01b5, all -> 0x0242, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e2 A[Catch:{ EOFException -> 0x01b5, all -> 0x0242, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f7 A[Catch:{ EOFException -> 0x01b5, all -> 0x0242, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc A[Catch:{ EOFException -> 0x01b5, all -> 0x0242, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ff A[Catch:{ EOFException -> 0x01b5, all -> 0x0242, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102 A[Catch:{ EOFException -> 0x01b5, all -> 0x0242, all -> 0x0281 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r31 = this;
            r2 = r31
            monitor-enter(r2)     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            boolean r0 = r2.A04     // Catch:{ all -> 0x02b4 }
            r13 = 1
            boolean r1 = X.AnonymousClass000.A1P(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x02b4 }
            r2.A03 = r0     // Catch:{ all -> 0x02b4 }
            monitor-exit(r2)     // Catch:{ all -> 0x02b4 }
            if (r1 == 0) goto L_0x02a1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            java.lang.String r0 = "load:"
            r3.append(r0)     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            X.5RC r1 = r2.A06     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            java.lang.String r0 = X.AnonymousClass000.A0c(r1)     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            X.C90224dm.A02(r0)     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            X.3E8 r1 = (X.AnonymousClass3E8) r1     // Catch:{ all -> 0x02b7 }
            r18 = 0
            r0 = 0
            r10 = 0
        L_0x002f:
            boolean r3 = r1.A0D     // Catch:{ all -> 0x02b7 }
            if (r3 != 0) goto L_0x029e
            r27 = -1
            X.4Bt r3 = r1.A09     // Catch:{ all -> 0x0281 }
            r30 = r3
            long r5 = r3.A00     // Catch:{ all -> 0x0281 }
            android.net.Uri r3 = r1.A07     // Catch:{ all -> 0x0281 }
            r29 = r3
            X.0qF r9 = r1.A0E     // Catch:{ all -> 0x0281 }
            java.util.Map r19 = X.C15050qF.A0c     // Catch:{ all -> 0x0281 }
            r23 = 0
            r22 = 6
            X.3AL r3 = new X.3AL     // Catch:{ all -> 0x0281 }
            r21 = 1
            r16 = r3
            r17 = r29
            r20 = r18
            r25 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r27)     // Catch:{ all -> 0x0281 }
            r1.A03 = r3     // Catch:{ all -> 0x0281 }
            X.4qJ r4 = r1.A0B     // Catch:{ all -> 0x0281 }
            r26 = r4
            long r3 = r4.AZr(r3)     // Catch:{ all -> 0x0281 }
            r1.A00 = r3     // Catch:{ all -> 0x0281 }
            int r7 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r7 == 0) goto L_0x0069
            long r3 = r3 + r5
            r1.A00 = r3     // Catch:{ all -> 0x0281 }
        L_0x0069:
            java.util.Map r3 = r26.AFZ()     // Catch:{ all -> 0x0281 }
            java.lang.String r15 = "Invalid metadata interval: "
            java.lang.String r4 = "icy-br"
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x0281 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0281 }
            java.lang.String r7 = "IcyHeaders"
            r24 = -1
            if (r4 == 0) goto L_0x00a8
            java.lang.String r8 = X.AnonymousClass000.A0n(r4, r0)     // Catch:{ all -> 0x0281 }
            int r4 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x009c }
            int r12 = r4 * 1000
            if (r12 <= 0) goto L_0x008b
            r14 = 1
            goto L_0x00aa
        L_0x008b:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0o()     // Catch:{ NumberFormatException -> 0x009d }
            java.lang.String r11 = "Invalid bitrate: "
            r4.append(r11)     // Catch:{ NumberFormatException -> 0x009d }
            java.lang.String r4 = X.AnonymousClass000.A0h(r8, r4)     // Catch:{ NumberFormatException -> 0x009d }
            android.util.Log.w(r7, r4)     // Catch:{ NumberFormatException -> 0x009d }
            goto L_0x00a8
        L_0x009c:
            r12 = -1
        L_0x009d:
            java.lang.String r4 = "Invalid bitrate header: "
            java.lang.String r4 = X.C13680ns.A0h(r4, r8)     // Catch:{ all -> 0x0281 }
            android.util.Log.w(r7, r4)     // Catch:{ all -> 0x0281 }
            r14 = 0
            goto L_0x00aa
        L_0x00a8:
            r14 = 0
            r12 = -1
        L_0x00aa:
            java.lang.String r4 = "icy-genre"
            java.lang.Object r8 = r3.get(r4)     // Catch:{ all -> 0x0281 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0281 }
            r4 = 0
            if (r8 == 0) goto L_0x00ba
            java.lang.String r20 = X.AnonymousClass000.A0n(r8, r0)     // Catch:{ all -> 0x0281 }
            r14 = 1
        L_0x00ba:
            java.lang.String r8 = "icy-name"
            java.lang.Object r8 = r3.get(r8)     // Catch:{ all -> 0x0281 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0281 }
            if (r8 == 0) goto L_0x0102
            java.lang.String r21 = X.AnonymousClass000.A0n(r8, r0)     // Catch:{ all -> 0x0281 }
            r14 = 1
        L_0x00c9:
            java.lang.String r8 = "icy-url"
            java.lang.Object r8 = r3.get(r8)     // Catch:{ all -> 0x0281 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0281 }
            if (r8 == 0) goto L_0x00ff
            java.lang.String r22 = X.AnonymousClass000.A0n(r8, r0)     // Catch:{ all -> 0x0281 }
            r14 = 1
        L_0x00d8:
            java.lang.String r8 = "icy-pub"
            java.lang.Object r8 = r3.get(r8)     // Catch:{ all -> 0x0281 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0281 }
            if (r8 == 0) goto L_0x00fc
            java.lang.String r11 = X.AnonymousClass000.A0n(r8, r0)     // Catch:{ all -> 0x0281 }
            java.lang.String r8 = "1"
            boolean r25 = r11.equals(r8)     // Catch:{ all -> 0x0281 }
            r14 = 1
        L_0x00ed:
            java.lang.String r8 = "icy-metaint"
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0281 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0281 }
            if (r3 == 0) goto L_0x0127
            java.lang.String r3 = X.AnonymousClass000.A0n(r3, r0)     // Catch:{ all -> 0x0281 }
            goto L_0x0105
        L_0x00fc:
            r25 = 0
            goto L_0x00ed
        L_0x00ff:
            r22 = r4
            goto L_0x00d8
        L_0x0102:
            r21 = r4
            goto L_0x00c9
        L_0x0105:
            int r11 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x011c }
            if (r11 <= 0) goto L_0x010e
            r24 = r11
            goto L_0x0129
        L_0x010e:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0q(r15)     // Catch:{ NumberFormatException -> 0x011a }
            java.lang.String r8 = X.AnonymousClass000.A0h(r3, r8)     // Catch:{ NumberFormatException -> 0x011a }
            android.util.Log.w(r7, r8)     // Catch:{ NumberFormatException -> 0x011a }
            goto L_0x0127
        L_0x011a:
            r24 = r11
        L_0x011c:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0q(r15)     // Catch:{ all -> 0x0281 }
            java.lang.String r3 = X.AnonymousClass000.A0h(r3, r8)     // Catch:{ all -> 0x0281 }
            android.util.Log.w(r7, r3)     // Catch:{ all -> 0x0281 }
        L_0x0127:
            if (r14 == 0) goto L_0x0132
        L_0x0129:
            X.1mO r4 = new X.1mO     // Catch:{ all -> 0x0281 }
            r19 = r4
            r23 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0281 }
        L_0x0132:
            r9.A08 = r4     // Catch:{ all -> 0x0281 }
            r11 = r26
            if (r4 == 0) goto L_0x0154
            int r4 = r4.A01     // Catch:{ all -> 0x0281 }
            r3 = -1
            if (r4 == r3) goto L_0x0154
            X.3E4 r11 = new X.3E4     // Catch:{ all -> 0x0281 }
            r3 = r26
            r11.<init>(r1, r3, r4)     // Catch:{ all -> 0x0281 }
            X.4TG r3 = new X.4TG     // Catch:{ all -> 0x0281 }
            r3.<init>(r0, r13)     // Catch:{ all -> 0x0281 }
            X.1gS r4 = r9.A01(r3)     // Catch:{ all -> 0x0281 }
            r1.A02 = r4     // Catch:{ all -> 0x0281 }
            X.1gT r3 = X.C15050qF.A0b     // Catch:{ all -> 0x0281 }
            r4.A9D(r3)     // Catch:{ all -> 0x0281 }
        L_0x0154:
            X.2ir r7 = r1.A0A     // Catch:{ all -> 0x0281 }
            java.util.Map r4 = r26.AFZ()     // Catch:{ all -> 0x0281 }
            long r14 = r1.A00     // Catch:{ all -> 0x0281 }
            X.0qG r3 = r1.A08     // Catch:{ all -> 0x0281 }
            r25 = r3
            X.2is r7 = (X.C55122is) r7     // Catch:{ all -> 0x0281 }
            X.4od r8 = new X.4od     // Catch:{ all -> 0x0281 }
            r19 = r8
            r20 = r11
            r21 = r5
            r23 = r14
            r19.<init>(r20, r21, r23)     // Catch:{ all -> 0x0281 }
            r7.A01 = r8     // Catch:{ all -> 0x0281 }
            X.2it r3 = r7.A00     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x018b
            X.5Ng r11 = r7.A02     // Catch:{ all -> 0x0281 }
            r3 = r29
            X.2it[] r12 = r11.A7N(r3, r4)     // Catch:{ all -> 0x0281 }
            int r11 = r12.length     // Catch:{ all -> 0x0281 }
            r17 = 0
            if (r11 != r13) goto L_0x01a7
            r4 = r12[r0]     // Catch:{ all -> 0x0281 }
            r7.A00 = r4     // Catch:{ all -> 0x0281 }
        L_0x0186:
            r3 = r25
            r4.AHx(r3)     // Catch:{ all -> 0x0281 }
        L_0x018b:
            X.1mO r3 = r9.A08     // Catch:{ all -> 0x0281 }
            if (r3 == 0) goto L_0x0199
            X.2it r4 = r7.A00     // Catch:{ all -> 0x0281 }
            boolean r3 = r4 instanceof X.C96564oX     // Catch:{ all -> 0x0281 }
            if (r3 == 0) goto L_0x0199
            X.4oX r4 = (X.C96564oX) r4     // Catch:{ all -> 0x0281 }
            r4.A0A = r13     // Catch:{ all -> 0x0281 }
        L_0x0199:
            boolean r3 = r1.A04     // Catch:{ all -> 0x0281 }
            if (r3 == 0) goto L_0x01e2
            long r3 = r1.A01     // Catch:{ all -> 0x0281 }
            X.2it r8 = r7.A00     // Catch:{ all -> 0x0281 }
            r8.AdC(r5, r3)     // Catch:{ all -> 0x0281 }
            r1.A04 = r0     // Catch:{ all -> 0x0281 }
            goto L_0x01e2
        L_0x01a7:
            r4 = 0
        L_0x01a8:
            if (r4 >= r11) goto L_0x01d2
            r3 = r12[r4]     // Catch:{ all -> 0x0281 }
            boolean r14 = r3.Afz(r8)     // Catch:{ EOFException -> 0x01b5, all -> 0x0242 }
            if (r14 == 0) goto L_0x01ba
            r7.A00 = r3     // Catch:{ EOFException -> 0x01b5, all -> 0x0242 }
            goto L_0x01cf
        L_0x01b5:
            X.2it r3 = r7.A00     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x01c5
            goto L_0x01be
        L_0x01ba:
            X.2it r3 = r7.A00     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x01c5
        L_0x01be:
            long r14 = r8.A02     // Catch:{ all -> 0x0281 }
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            r3 = 0
            if (r16 != 0) goto L_0x01c6
        L_0x01c5:
            r3 = 1
        L_0x01c6:
            X.C90524eJ.A04(r3)     // Catch:{ all -> 0x0281 }
            r8.AcS()     // Catch:{ all -> 0x0281 }
            int r4 = r4 + 1
            goto L_0x01a8
        L_0x01cf:
            r8.AcS()     // Catch:{ all -> 0x0281 }
        L_0x01d2:
            X.2it r4 = r7.A00     // Catch:{ all -> 0x0281 }
            if (r4 != 0) goto L_0x0186
            java.lang.String r0 = "None of the available extractors ("
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0281 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0281 }
            r3 = 0
            goto L_0x0256
        L_0x01e2:
            r14 = r5
        L_0x01e3:
            if (r10 != 0) goto L_0x021e
            boolean r3 = r1.A0D     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x0222
            X.4GQ r8 = r1.A0C     // Catch:{ InterruptedException -> 0x023c }
            monitor-enter(r8)     // Catch:{ InterruptedException -> 0x023c }
        L_0x01ec:
            boolean r3 = r8.A00     // Catch:{ all -> 0x0239 }
            if (r3 != 0) goto L_0x01f4
            r8.wait()     // Catch:{ all -> 0x0239 }
            goto L_0x01ec
        L_0x01f4:
            monitor-exit(r8)     // Catch:{ InterruptedException -> 0x023c }
            X.2it r5 = r7.A00     // Catch:{ all -> 0x0281 }
            X.2iu r4 = r7.A01     // Catch:{ all -> 0x0281 }
            r3 = r30
            int r10 = r5.AbN(r4, r3)     // Catch:{ all -> 0x0281 }
            X.2iu r3 = r7.A01     // Catch:{ all -> 0x0281 }
            if (r3 == 0) goto L_0x0210
            long r5 = r3.AF7()     // Catch:{ all -> 0x0281 }
        L_0x0207:
            long r3 = r9.A0M     // Catch:{ all -> 0x0281 }
            long r3 = r3 + r14
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x01e3
            monitor-enter(r8)     // Catch:{ all -> 0x0281 }
            goto L_0x0213
        L_0x0210:
            r5 = -1
            goto L_0x0207
        L_0x0213:
            r8.A00 = r0     // Catch:{ all -> 0x027e }
            monitor-exit(r8)     // Catch:{ all -> 0x0281 }
            android.os.Handler r4 = r9.A0O     // Catch:{ all -> 0x0281 }
            java.lang.Runnable r3 = r9.A0a     // Catch:{ all -> 0x0281 }
            r4.post(r3)     // Catch:{ all -> 0x0281 }
            goto L_0x01e2
        L_0x021e:
            if (r10 != r13) goto L_0x0222
            r10 = 0
            goto L_0x0232
        L_0x0222:
            X.2iu r3 = r7.A01     // Catch:{ all -> 0x02b7 }
            if (r3 == 0) goto L_0x0232
            long r3 = r3.AF7()     // Catch:{ all -> 0x02b7 }
            int r5 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r5 == 0) goto L_0x0232
            r5 = r30
            r5.A00 = r3     // Catch:{ all -> 0x02b7 }
        L_0x0232:
            r26.close()     // Catch:{ IOException -> 0x0235 }
        L_0x0235:
            if (r10 != 0) goto L_0x029e
            goto L_0x002f
        L_0x0239:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ InterruptedException -> 0x023c }
            throw r0     // Catch:{ InterruptedException -> 0x023c }
        L_0x023c:
            java.io.InterruptedIOException r4 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0281 }
            r4.<init>()     // Catch:{ all -> 0x0281 }
            goto L_0x0280
        L_0x0242:
            r9 = move-exception
            X.2it r0 = r7.A00     // Catch:{ all -> 0x0281 }
            if (r0 != 0) goto L_0x024d
            long r3 = r8.A02     // Catch:{ all -> 0x0281 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x024f
        L_0x024d:
            r17 = 1
        L_0x024f:
            X.C90524eJ.A04(r17)     // Catch:{ all -> 0x0281 }
            r8.AcS()     // Catch:{ all -> 0x0281 }
            throw r9     // Catch:{ all -> 0x0281 }
        L_0x0256:
            if (r3 >= r11) goto L_0x026d
            r0 = r12[r3]     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = X.AnonymousClass000.A0c(r0)     // Catch:{ all -> 0x0281 }
            r4.append(r0)     // Catch:{ all -> 0x0281 }
            int r0 = r11 + -1
            if (r3 >= r0) goto L_0x026a
            java.lang.String r0 = ", "
            r4.append(r0)     // Catch:{ all -> 0x0281 }
        L_0x026a:
            int r3 = r3 + 1
            goto L_0x0256
        L_0x026d:
            X.AnonymousClass000.A1I(r4, r5)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = ") could read the stream."
            java.lang.String r3 = X.AnonymousClass000.A0h(r0, r5)     // Catch:{ all -> 0x0281 }
            X.3UM r4 = new X.3UM     // Catch:{ all -> 0x0281 }
            r0 = r29
            r4.<init>(r3, r0)     // Catch:{ all -> 0x0281 }
            goto L_0x0280
        L_0x027e:
            r4 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0281 }
        L_0x0280:
            throw r4     // Catch:{ all -> 0x0281 }
        L_0x0281:
            r5 = move-exception
            if (r10 == r13) goto L_0x0298
            X.2ir r0 = r1.A0A     // Catch:{ all -> 0x02b7 }
            X.2is r0 = (X.C55122is) r0     // Catch:{ all -> 0x02b7 }
            X.2iu r0 = r0.A01     // Catch:{ all -> 0x02b7 }
            if (r0 == 0) goto L_0x0298
            long r3 = r0.AF7()     // Catch:{ all -> 0x02b7 }
            int r0 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r0 == 0) goto L_0x0298
            X.4Bt r0 = r1.A09     // Catch:{ all -> 0x02b7 }
            r0.A00 = r3     // Catch:{ all -> 0x02b7 }
        L_0x0298:
            X.4qJ r0 = r1.A0B     // Catch:{ all -> 0x02b7 }
            r0.close()     // Catch:{ IOException -> 0x029d }
        L_0x029d:
            throw r5     // Catch:{ all -> 0x02b7 }
        L_0x029e:
            X.C90224dm.A00()     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
        L_0x02a1:
            monitor-enter(r2)     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            r0 = 0
            r2.A03 = r0     // Catch:{ all -> 0x02b1 }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x02b1 }
            monitor-exit(r2)     // Catch:{ all -> 0x02b1 }
            boolean r0 = r2.A07     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            if (r0 != 0) goto L_0x0302
            r2.sendEmptyMessage(r13)     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
            return
        L_0x02b1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02b1 }
            goto L_0x02bb
        L_0x02b4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02b4 }
            goto L_0x02bb
        L_0x02b7:
            r0 = move-exception
            X.C90224dm.A00()     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
        L_0x02bb:
            throw r0     // Catch:{ IOException -> 0x02e3, Exception -> 0x02e9, OutOfMemoryError -> 0x02d1, Error -> 0x02bc }
        L_0x02bc:
            r3 = move-exception
            java.lang.String r1 = "LoadTask"
            java.lang.String r0 = "Unexpected error loading stream"
            X.C89504cL.A01(r1, r0, r3)
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x02d0
            r0 = 3
            android.os.Message r0 = r2.obtainMessage(r0, r3)
            r0.sendToTarget()
        L_0x02d0:
            throw r3
        L_0x02d1:
            r3 = move-exception
            java.lang.String r1 = "LoadTask"
            java.lang.String r0 = "OutOfMemory error loading stream"
            X.C89504cL.A01(r1, r0, r3)
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x0302
            X.408 r1 = new X.408
            r1.<init>(r3)
            goto L_0x02fa
        L_0x02e3:
            r1 = move-exception
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x0302
            goto L_0x02fa
        L_0x02e9:
            r3 = move-exception
            java.lang.String r1 = "LoadTask"
            java.lang.String r0 = "Unexpected exception loading stream"
            X.C89504cL.A01(r1, r0, r3)
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x0302
            X.408 r1 = new X.408
            r1.<init>(r3)
        L_0x02fa:
            r0 = 2
            android.os.Message r0 = r2.obtainMessage(r0, r1)
            r0.sendToTarget()
        L_0x0302:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ni.run():void");
    }
}
