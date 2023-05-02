package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.0wN  reason: invalid class name and case insensitive filesystem */
public abstract class C18240wN {
    public final AnonymousClass01D A00;
    public final Map A01 = new HashMap();

    public C18240wN(AnonymousClass01D r2) {
        this.A00 = r2;
    }

    public synchronized Runnable A00(Object obj) {
        C43321zo r0;
        r0 = (C43321zo) this.A01.get(obj);
        return r0 != null ? r0.A02 : null;
    }

    /* JADX WARNING: type inference failed for: r8v16, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r17v12, types: [X.206] */
    /* JADX WARNING: type inference failed for: r17v13, types: [X.204] */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r17v14, types: [X.200] */
    /* JADX WARNING: type inference failed for: r17v15, types: [X.1zw] */
    /* JADX WARNING: type inference failed for: r17v16, types: [X.1zs] */
    /* JADX WARNING: type inference failed for: r17v17, types: [X.1er] */
    /* JADX WARNING: type inference failed for: r17v18, types: [X.1eq] */
    /* JADX WARNING: type inference failed for: r17v19, types: [X.1zr] */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Runnable A01(java.lang.Object r45, java.lang.Object r46) {
        /*
            r44 = this;
            r1 = r44
            monitor-enter(r1)
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x03f9 }
            r43 = r0
            r16 = r45
            r2 = r0
            r0 = r16
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x03f9 }
            X.1zo r3 = (X.C43321zo) r3     // Catch:{ all -> 0x03f9 }
            if (r3 != 0) goto L_0x003d
            boolean r0 = r1 instanceof X.C43331zp     // Catch:{ all -> 0x03f9 }
            r2 = r46
            if (r0 == 0) goto L_0x0041
            r3 = r1
            X.1zp r3 = (X.C43331zp) r3     // Catch:{ all -> 0x03f9 }
            r0 = r16
            X.0tZ r0 = (X.C16740tZ) r0     // Catch:{ all -> 0x03f9 }
            X.1zq r8 = new X.1zq     // Catch:{ all -> 0x03f9 }
            r8.<init>(r0, r3)     // Catch:{ all -> 0x03f9 }
        L_0x0026:
            X.1zo r3 = new X.1zo     // Catch:{ all -> 0x03f9 }
            r0 = r16
            r3.<init>(r1, r0, r2, r8)     // Catch:{ all -> 0x03f9 }
            r2 = r43
            r2.put(r0, r3)     // Catch:{ all -> 0x03f9 }
            X.01D r0 = r1.A00     // Catch:{ all -> 0x03f9 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03f9 }
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch:{ all -> 0x03f9 }
            r0.execute(r3)     // Catch:{ all -> 0x03f9 }
        L_0x003d:
            java.lang.Runnable r0 = r3.A02     // Catch:{ all -> 0x03f9 }
            goto L_0x03ec
        L_0x0041:
            boolean r0 = r1 instanceof X.C27411Rq     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x0259
            r3 = r1
            X.1Rq r3 = (X.C27411Rq) r3     // Catch:{ all -> 0x03f9 }
            r4 = r2
            X.1f0 r4 = (X.C31771f0) r4     // Catch:{ all -> 0x03f9 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x03f9 }
            int r5 = r4.A00()     // Catch:{ all -> 0x03f9 }
            r0 = 2
            X.0wK r3 = r3.A00     // Catch:{ all -> 0x03f9 }
            if (r5 == r0) goto L_0x01e2
            X.1qS r0 = r4.A02     // Catch:{ all -> 0x03f9 }
            java.lang.String r5 = r0.A09     // Catch:{ all -> 0x03f9 }
            java.lang.String r0 = "express"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x00e6
            X.0pd r5 = r3.A0C     // Catch:{ all -> 0x03f9 }
            X.0tM r6 = X.C16620tM.A01     // Catch:{ all -> 0x03f9 }
            r0 = 1539(0x603, float:2.157E-42)
            boolean r0 = r5.A0E(r6, r0)     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x00e6
            X.0tz r0 = r3.A09     // Catch:{ all -> 0x03f9 }
            r27 = r0
            X.0t3 r0 = r3.A08     // Catch:{ all -> 0x03f9 }
            r26 = r0
            X.0pt r0 = r3.A03     // Catch:{ all -> 0x03f9 }
            r25 = r0
            X.0so r0 = r3.A01     // Catch:{ all -> 0x03f9 }
            r24 = r0
            X.0sq r0 = r3.A0Q     // Catch:{ all -> 0x03f9 }
            r21 = r0
            X.0sb r0 = r3.A02     // Catch:{ all -> 0x03f9 }
            r20 = r0
            X.0ua r0 = r3.A07     // Catch:{ all -> 0x03f9 }
            r23 = r0
            X.0s5 r0 = r3.A06     // Catch:{ all -> 0x03f9 }
            r22 = r0
            X.0xf r0 = r3.A0P     // Catch:{ all -> 0x03f9 }
            r19 = r0
            X.1AO r0 = r3.A0G     // Catch:{ all -> 0x03f9 }
            r18 = r0
            X.14n r0 = r3.A0I     // Catch:{ all -> 0x03f9 }
            r17 = r0
            X.1QX r15 = r3.A0L     // Catch:{ all -> 0x03f9 }
            X.0t8 r14 = r3.A0A     // Catch:{ all -> 0x03f9 }
            X.1QW r13 = r3.A0M     // Catch:{ all -> 0x03f9 }
            X.17J r12 = r3.A0B     // Catch:{ all -> 0x03f9 }
            X.1QV r11 = r3.A0H     // Catch:{ all -> 0x03f9 }
            X.0vT r10 = r3.A0F     // Catch:{ all -> 0x03f9 }
            X.0vU r9 = r3.A0D     // Catch:{ all -> 0x03f9 }
            X.0zs r7 = r3.A0E     // Catch:{ all -> 0x03f9 }
            X.0u3 r6 = r3.A0N     // Catch:{ all -> 0x03f9 }
            X.1QU r0 = r3.A0K     // Catch:{ all -> 0x03f9 }
            X.01Z r3 = r3.A05     // Catch:{ all -> 0x03f9 }
            X.1zr r8 = new X.1zr     // Catch:{ all -> 0x03f9 }
            r29 = r9
            r30 = r7
            r31 = r10
            r32 = r18
            r33 = r11
            r34 = r17
            r35 = r4
            r36 = r0
            r37 = r15
            r38 = r13
            r39 = r6
            r40 = r19
            r41 = r21
            r17 = r8
            r18 = r24
            r19 = r20
            r20 = r25
            r21 = r3
            r24 = r26
            r25 = r27
            r26 = r14
            r27 = r12
            r28 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x00e6:
            java.lang.Boolean r0 = r3.A04()     // Catch:{ all -> 0x03f9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x016d
            X.0tz r0 = r3.A09     // Catch:{ all -> 0x03f9 }
            r28 = r0
            X.0t3 r0 = r3.A08     // Catch:{ all -> 0x03f9 }
            r27 = r0
            X.0pd r0 = r3.A0C     // Catch:{ all -> 0x03f9 }
            r26 = r0
            X.0pt r0 = r3.A03     // Catch:{ all -> 0x03f9 }
            r25 = r0
            X.0so r0 = r3.A01     // Catch:{ all -> 0x03f9 }
            r22 = r0
            X.0sq r0 = r3.A0Q     // Catch:{ all -> 0x03f9 }
            r21 = r0
            X.0sb r0 = r3.A02     // Catch:{ all -> 0x03f9 }
            r20 = r0
            X.0ua r0 = r3.A07     // Catch:{ all -> 0x03f9 }
            r24 = r0
            X.10M r0 = r3.A00     // Catch:{ all -> 0x03f9 }
            r19 = r0
            X.0s5 r0 = r3.A06     // Catch:{ all -> 0x03f9 }
            r23 = r0
            X.0xf r0 = r3.A0P     // Catch:{ all -> 0x03f9 }
            r18 = r0
            X.1AO r0 = r3.A0G     // Catch:{ all -> 0x03f9 }
            r17 = r0
            X.14n r15 = r3.A0I     // Catch:{ all -> 0x03f9 }
            X.1QX r14 = r3.A0L     // Catch:{ all -> 0x03f9 }
            X.0t8 r13 = r3.A0A     // Catch:{ all -> 0x03f9 }
            X.1QW r12 = r3.A0M     // Catch:{ all -> 0x03f9 }
            X.17J r11 = r3.A0B     // Catch:{ all -> 0x03f9 }
            X.1QV r10 = r3.A0H     // Catch:{ all -> 0x03f9 }
            X.0vT r9 = r3.A0F     // Catch:{ all -> 0x03f9 }
            X.0vU r7 = r3.A0D     // Catch:{ all -> 0x03f9 }
            X.0zs r6 = r3.A0E     // Catch:{ all -> 0x03f9 }
            X.0u3 r5 = r3.A0N     // Catch:{ all -> 0x03f9 }
            X.1QU r0 = r3.A0K     // Catch:{ all -> 0x03f9 }
            X.01Z r3 = r3.A05     // Catch:{ all -> 0x03f9 }
            X.1eq r8 = new X.1eq     // Catch:{ all -> 0x03f9 }
            r29 = r26
            r30 = r7
            r31 = r6
            r32 = r9
            r33 = r17
            r34 = r10
            r35 = r15
            r36 = r4
            r37 = r0
            r38 = r14
            r39 = r12
            r40 = r5
            r41 = r18
            r42 = r21
            r17 = r8
            r18 = r19
            r19 = r22
            r21 = r25
            r22 = r3
            r25 = r27
            r26 = r28
            r27 = r13
            r28 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x016d:
            X.0tz r0 = r3.A09     // Catch:{ all -> 0x03f9 }
            r26 = r0
            X.0t3 r0 = r3.A08     // Catch:{ all -> 0x03f9 }
            r25 = r0
            X.0pd r0 = r3.A0C     // Catch:{ all -> 0x03f9 }
            r28 = r0
            X.0pt r0 = r3.A03     // Catch:{ all -> 0x03f9 }
            r24 = r0
            X.0so r0 = r3.A01     // Catch:{ all -> 0x03f9 }
            r21 = r0
            X.0sq r0 = r3.A0Q     // Catch:{ all -> 0x03f9 }
            r20 = r0
            X.0sb r0 = r3.A02     // Catch:{ all -> 0x03f9 }
            r19 = r0
            X.0ua r0 = r3.A07     // Catch:{ all -> 0x03f9 }
            r23 = r0
            X.0s5 r0 = r3.A06     // Catch:{ all -> 0x03f9 }
            r22 = r0
            X.0xf r0 = r3.A0P     // Catch:{ all -> 0x03f9 }
            r18 = r0
            X.1AO r0 = r3.A0G     // Catch:{ all -> 0x03f9 }
            r17 = r0
            X.14n r15 = r3.A0I     // Catch:{ all -> 0x03f9 }
            X.1QX r14 = r3.A0L     // Catch:{ all -> 0x03f9 }
            X.0t8 r13 = r3.A0A     // Catch:{ all -> 0x03f9 }
            X.1QW r12 = r3.A0M     // Catch:{ all -> 0x03f9 }
            X.17J r11 = r3.A0B     // Catch:{ all -> 0x03f9 }
            X.1QV r10 = r3.A0H     // Catch:{ all -> 0x03f9 }
            X.0vT r9 = r3.A0F     // Catch:{ all -> 0x03f9 }
            X.0vU r7 = r3.A0D     // Catch:{ all -> 0x03f9 }
            X.0zs r6 = r3.A0E     // Catch:{ all -> 0x03f9 }
            X.0u3 r5 = r3.A0N     // Catch:{ all -> 0x03f9 }
            X.1QU r0 = r3.A0K     // Catch:{ all -> 0x03f9 }
            X.01Z r3 = r3.A05     // Catch:{ all -> 0x03f9 }
            X.1er r8 = new X.1er     // Catch:{ all -> 0x03f9 }
            r29 = r7
            r30 = r6
            r31 = r9
            r32 = r17
            r33 = r10
            r34 = r15
            r35 = r4
            r36 = r0
            r37 = r14
            r38 = r12
            r39 = r5
            r40 = r18
            r41 = r20
            r17 = r8
            r18 = r21
            r20 = r24
            r21 = r3
            r24 = r25
            r25 = r26
            r26 = r13
            r27 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x01e2:
            X.1zS r4 = (X.C43171zS) r4     // Catch:{ all -> 0x03f9 }
            X.0tz r0 = r3.A09     // Catch:{ all -> 0x03f9 }
            r26 = r0
            X.0t3 r0 = r3.A08     // Catch:{ all -> 0x03f9 }
            r25 = r0
            X.0pd r0 = r3.A0C     // Catch:{ all -> 0x03f9 }
            r28 = r0
            X.0pt r0 = r3.A03     // Catch:{ all -> 0x03f9 }
            r24 = r0
            X.0so r0 = r3.A01     // Catch:{ all -> 0x03f9 }
            r21 = r0
            X.0sq r0 = r3.A0Q     // Catch:{ all -> 0x03f9 }
            r20 = r0
            X.0sb r0 = r3.A02     // Catch:{ all -> 0x03f9 }
            r19 = r0
            X.0ua r0 = r3.A07     // Catch:{ all -> 0x03f9 }
            r23 = r0
            X.0s5 r0 = r3.A06     // Catch:{ all -> 0x03f9 }
            r22 = r0
            X.0xf r0 = r3.A0P     // Catch:{ all -> 0x03f9 }
            r18 = r0
            X.1AO r0 = r3.A0G     // Catch:{ all -> 0x03f9 }
            r17 = r0
            X.14n r15 = r3.A0I     // Catch:{ all -> 0x03f9 }
            X.1QX r14 = r3.A0L     // Catch:{ all -> 0x03f9 }
            X.0t8 r13 = r3.A0A     // Catch:{ all -> 0x03f9 }
            X.1QW r12 = r3.A0M     // Catch:{ all -> 0x03f9 }
            X.17J r11 = r3.A0B     // Catch:{ all -> 0x03f9 }
            X.1QV r10 = r3.A0H     // Catch:{ all -> 0x03f9 }
            X.0vT r9 = r3.A0F     // Catch:{ all -> 0x03f9 }
            X.0vU r7 = r3.A0D     // Catch:{ all -> 0x03f9 }
            X.0zs r6 = r3.A0E     // Catch:{ all -> 0x03f9 }
            X.0u3 r5 = r3.A0N     // Catch:{ all -> 0x03f9 }
            X.1QU r0 = r3.A0K     // Catch:{ all -> 0x03f9 }
            X.01Z r3 = r3.A05     // Catch:{ all -> 0x03f9 }
            X.1zs r8 = new X.1zs     // Catch:{ all -> 0x03f9 }
            r29 = r7
            r30 = r6
            r31 = r9
            r32 = r17
            r33 = r10
            r34 = r15
            r35 = r4
            r36 = r0
            r37 = r14
            r38 = r12
            r39 = r5
            r40 = r18
            r41 = r20
            r17 = r8
            r18 = r21
            r20 = r24
            r21 = r3
            r24 = r25
            r25 = r26
            r26 = r13
            r27 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x0259:
            boolean r0 = r1 instanceof X.C43371zt     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x03a9
            r0 = r1
            X.1zt r0 = (X.C43371zt) r0     // Catch:{ all -> 0x03f9 }
            r7 = r2
            X.1zu r7 = (X.C43381zu) r7     // Catch:{ all -> 0x03f9 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x03f9 }
            X.1RZ r8 = r0.A00     // Catch:{ all -> 0x03f9 }
            monitor-enter(r8)     // Catch:{ all -> 0x03f9 }
            android.os.PowerManager$WakeLock r0 = r8.A00     // Catch:{ all -> 0x03f6 }
            if (r0 != 0) goto L_0x027a
            X.01V r0 = r8.A07     // Catch:{ all -> 0x03f6 }
            android.os.PowerManager r4 = r0.A0I()     // Catch:{ all -> 0x03f6 }
            if (r4 != 0) goto L_0x027f
            java.lang.String r0 = "media-transcode-queue/get-transcode-wakelock pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x03f6 }
        L_0x027a:
            android.os.PowerManager$WakeLock r0 = r8.A00     // Catch:{ all -> 0x03f6 }
            r18 = r0
            goto L_0x0289
        L_0x027f:
            r3 = 1
            java.lang.String r0 = "mediatranscode"
            android.os.PowerManager$WakeLock r0 = X.C43421zy.A00(r4, r0, r3)     // Catch:{ all -> 0x03f6 }
            r8.A00 = r0     // Catch:{ all -> 0x03f6 }
            goto L_0x027a
        L_0x0289:
            monitor-exit(r8)     // Catch:{ all -> 0x03f9 }
            boolean r0 = r7 instanceof X.C43391zv     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x02cb
            X.0tz r14 = r8.A08     // Catch:{ all -> 0x03f9 }
            com.whatsapp.Mp4Ops r13 = r8.A03     // Catch:{ all -> 0x03f9 }
            X.0pd r12 = r8.A0D     // Catch:{ all -> 0x03f9 }
            X.0so r11 = r8.A01     // Catch:{ all -> 0x03f9 }
            X.0sb r10 = r8.A02     // Catch:{ all -> 0x03f9 }
            X.0s5 r9 = r8.A05     // Catch:{ all -> 0x03f9 }
            X.1QT r6 = r8.A0F     // Catch:{ all -> 0x03f9 }
            X.0zN r5 = r8.A0B     // Catch:{ all -> 0x03f9 }
            X.12W r4 = r8.A06     // Catch:{ all -> 0x03f9 }
            X.1QS r3 = r8.A0N     // Catch:{ all -> 0x03f9 }
            X.0rz r0 = r8.A09     // Catch:{ all -> 0x03f9 }
            X.1RY r15 = r8.A0G     // Catch:{ all -> 0x03f9 }
            X.1zv r7 = (X.C43391zv) r7     // Catch:{ all -> 0x03f9 }
            X.1zw r8 = new X.1zw     // Catch:{ all -> 0x03f9 }
            r17 = r8
            r19 = r11
            r20 = r10
            r21 = r13
            r22 = r9
            r23 = r4
            r24 = r14
            r25 = r0
            r26 = r5
            r27 = r12
            r28 = r7
            r29 = r6
            r30 = r15
            r31 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x02cb:
            boolean r0 = r7 instanceof X.C43431zz     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x0320
            X.0tz r0 = r8.A08     // Catch:{ all -> 0x03f9 }
            r24 = r0
            com.whatsapp.Mp4Ops r0 = r8.A03     // Catch:{ all -> 0x03f9 }
            r21 = r0
            X.0pd r0 = r8.A0D     // Catch:{ all -> 0x03f9 }
            r28 = r0
            X.0so r0 = r8.A01     // Catch:{ all -> 0x03f9 }
            r19 = r0
            X.0sb r0 = r8.A02     // Catch:{ all -> 0x03f9 }
            r20 = r0
            X.0t9 r14 = r8.A0E     // Catch:{ all -> 0x03f9 }
            X.0s5 r13 = r8.A05     // Catch:{ all -> 0x03f9 }
            X.1A9 r12 = r8.A0M     // Catch:{ all -> 0x03f9 }
            X.1QT r11 = r8.A0F     // Catch:{ all -> 0x03f9 }
            X.0zN r10 = r8.A0B     // Catch:{ all -> 0x03f9 }
            X.0t8 r9 = r8.A0C     // Catch:{ all -> 0x03f9 }
            X.12W r6 = r8.A06     // Catch:{ all -> 0x03f9 }
            X.1QS r5 = r8.A0N     // Catch:{ all -> 0x03f9 }
            X.0rz r4 = r8.A09     // Catch:{ all -> 0x03f9 }
            X.0tB r3 = r8.A0L     // Catch:{ all -> 0x03f9 }
            X.1RY r0 = r8.A0G     // Catch:{ all -> 0x03f9 }
            X.18C r15 = r8.A0I     // Catch:{ all -> 0x03f9 }
            X.1zz r7 = (X.C43431zz) r7     // Catch:{ all -> 0x03f9 }
            X.200 r8 = new X.200     // Catch:{ all -> 0x03f9 }
            r29 = r14
            r30 = r7
            r31 = r11
            r32 = r0
            r33 = r15
            r34 = r3
            r35 = r12
            r36 = r5
            r17 = r8
            r22 = r13
            r23 = r6
            r25 = r4
            r26 = r10
            r27 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x0320:
            boolean r0 = r7 instanceof X.AnonymousClass201     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x033c
            X.0tz r5 = r8.A08     // Catch:{ all -> 0x03f9 }
            X.0so r4 = r8.A01     // Catch:{ all -> 0x03f9 }
            X.0sb r3 = r8.A02     // Catch:{ all -> 0x03f9 }
            X.1QS r0 = r8.A0N     // Catch:{ all -> 0x03f9 }
            X.201 r7 = (X.AnonymousClass201) r7     // Catch:{ all -> 0x03f9 }
            X.202 r8 = new X.202     // Catch:{ all -> 0x03f9 }
            r9 = r18
            r10 = r4
            r11 = r3
            r12 = r5
            r13 = r7
            r14 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x033c:
            boolean r0 = r7 instanceof X.AnonymousClass203     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x036d
            X.0pd r11 = r8.A0D     // Catch:{ all -> 0x03f9 }
            X.0so r10 = r8.A01     // Catch:{ all -> 0x03f9 }
            X.0pf r9 = r8.A0A     // Catch:{ all -> 0x03f9 }
            X.1A9 r6 = r8.A0M     // Catch:{ all -> 0x03f9 }
            X.01V r5 = r8.A07     // Catch:{ all -> 0x03f9 }
            X.0t8 r4 = r8.A0C     // Catch:{ all -> 0x03f9 }
            X.18C r3 = r8.A0I     // Catch:{ all -> 0x03f9 }
            X.1QO r0 = r8.A0H     // Catch:{ all -> 0x03f9 }
            X.203 r7 = (X.AnonymousClass203) r7     // Catch:{ all -> 0x03f9 }
            X.204 r8 = new X.204     // Catch:{ all -> 0x03f9 }
            r17 = r8
            r19 = r10
            r20 = r5
            r21 = r9
            r22 = r4
            r23 = r11
            r24 = r7
            r25 = r0
            r26 = r3
            r27 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x036d:
            boolean r0 = r7 instanceof X.AnonymousClass205     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x039a
            X.0so r10 = r8.A01     // Catch:{ all -> 0x03f9 }
            X.0tz r9 = r8.A08     // Catch:{ all -> 0x03f9 }
            X.0sb r6 = r8.A02     // Catch:{ all -> 0x03f9 }
            X.0xJ r5 = r8.A0K     // Catch:{ all -> 0x03f9 }
            X.0xK r4 = r8.A0O     // Catch:{ all -> 0x03f9 }
            X.0xL r3 = r8.A0J     // Catch:{ all -> 0x03f9 }
            X.01Z r0 = r8.A04     // Catch:{ all -> 0x03f9 }
            X.205 r7 = (X.AnonymousClass205) r7     // Catch:{ all -> 0x03f9 }
            X.206 r8 = new X.206     // Catch:{ all -> 0x03f9 }
            r17 = r8
            r18 = r10
            r19 = r6
            r20 = r0
            r21 = r9
            r22 = r7
            r23 = r3
            r24 = r5
            r25 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x039a:
            boolean r0 = r7 instanceof X.AnonymousClass207     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x03ee
            X.0tz r0 = r8.A08     // Catch:{ all -> 0x03f9 }
            X.207 r7 = (X.AnonymousClass207) r7     // Catch:{ all -> 0x03f9 }
            X.208 r8 = new X.208     // Catch:{ all -> 0x03f9 }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x03a9:
            boolean r0 = r1 instanceof X.C23021Ae     // Catch:{ all -> 0x03f9 }
            if (r0 != 0) goto L_0x03e7
            boolean r0 = r1 instanceof X.C215214k     // Catch:{ all -> 0x03f9 }
            if (r0 != 0) goto L_0x03e7
            boolean r0 = r1 instanceof X.C18230wM     // Catch:{ all -> 0x03f9 }
            if (r0 != 0) goto L_0x03e7
            boolean r0 = r1 instanceof X.C27281Rd     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x03df
            r0 = r1
            X.1Rd r0 = (X.C27281Rd) r0     // Catch:{ all -> 0x03f9 }
            r5 = r2
            X.209 r5 = (X.AnonymousClass209) r5     // Catch:{ all -> 0x03f9 }
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x03f9 }
            X.1Rb r0 = r0.A00     // Catch:{ all -> 0x03f9 }
            X.0un r0 = r0.A00     // Catch:{ all -> 0x03f9 }
            X.0sX r4 = r0.A01     // Catch:{ all -> 0x03f9 }
            X.01J r0 = r4.AQB     // Catch:{ all -> 0x03f9 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x03f9 }
            X.0tz r3 = (X.C16980tz) r3     // Catch:{ all -> 0x03f9 }
            X.01J r0 = r4.A5p     // Catch:{ all -> 0x03f9 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03f9 }
            X.0so r0 = (X.C16300so) r0     // Catch:{ all -> 0x03f9 }
            X.20A r8 = new X.20A     // Catch:{ all -> 0x03f9 }
            r8.<init>(r0, r3, r5)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x03df:
            r8 = r2
            java.lang.Runnable r8 = (java.lang.Runnable) r8     // Catch:{ all -> 0x03f9 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x03e7:
            r8 = r2
            X.1cp r8 = (X.C30711cp) r8     // Catch:{ all -> 0x03f9 }
            goto L_0x0026
        L_0x03ec:
            monitor-exit(r1)
            return r0
        L_0x03ee:
            java.lang.String r0 = "Unreachable code"
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ all -> 0x03f9 }
            r2.<init>(r0)     // Catch:{ all -> 0x03f9 }
            goto L_0x03f8
        L_0x03f6:
            r2 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03f9 }
        L_0x03f8:
            throw r2     // Catch:{ all -> 0x03f9 }
        L_0x03f9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18240wN.A01(java.lang.Object, java.lang.Object):java.lang.Runnable");
    }

    public void A02(AnonymousClass1WE r4) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.A01.keySet());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            r4.accept(it.next());
        }
    }

    public synchronized void A03(Runnable runnable) {
        synchronized (this) {
            Iterator it = new HashSet(this.A01.keySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (runnable.equals(A00(next))) {
                    A05(next);
                    break;
                }
            }
        }
    }

    public final synchronized boolean A04(C43321zo r3, Object obj) {
        boolean z2;
        Map map = this.A01;
        if (r3.equals(map.get(obj))) {
            map.remove(obj);
            ((ThreadPoolExecutor) this.A00.get()).remove(r3);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public synchronized boolean A05(Object obj) {
        boolean z2;
        Map map = this.A01;
        C43321zo r1 = (C43321zo) map.get(obj);
        if (r1 != null) {
            r1.cancel();
            ((ThreadPoolExecutor) this.A00.get()).remove(r1);
            map.remove(obj);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }
}
