package com.facebook.redex;

import X.AnonymousClass1WE;

public class IDxNConsumerShape15S0300000_1_I0 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxNConsumerShape15S0300000_1_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d9, code lost:
        if ((X.AnonymousClass20B.A00(r7.A05, r7.A02.A04(false)) & 1) != 0) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e5, code lost:
        if (r6 == X.AnonymousClass1XK.A0S) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
        r4 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00e1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r17) {
        /*
            r16 = this;
            r8 = r17
            r2 = r16
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x00e7;
                case 1: goto L_0x0199;
                case 2: goto L_0x0229;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r5 = r2.A00
            X.1Ae r5 = (X.C23021Ae) r5
            java.lang.Object r6 = r2.A01
            X.0tZ r6 = (X.C16740tZ) r6
            java.lang.Object r7 = r2.A02
            X.1cv r7 = (X.C30771cv) r7
            X.1cu r8 = (X.C30761cu) r8
            X.0tm r0 = r6.A0F()
            if (r0 == 0) goto L_0x004c
            byte[] r0 = r8.A0G()
            if (r0 == 0) goto L_0x004c
            boolean r0 = r6 instanceof X.C16730tY
            if (r0 == 0) goto L_0x003c
            X.1Ld r0 = r5.A0W
            r0.A0D(r6)
            X.18C r1 = r5.A0R
            X.0tm r0 = r6.A0F()
            r9 = 29
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0
            r4.<init>(r5, r6, r7, r8, r9)
            r1.A02(r0, r4)
        L_0x003c:
            X.1et r0 = r8.A01()
            if (r0 == 0) goto L_0x02da
            int r1 = r0.A01
            r0 = 5
            if (r1 != r0) goto L_0x02da
            X.1O9 r1 = r5.A0E
            java.lang.String r5 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnail"
            goto L_0x009a
        L_0x004c:
            boolean r0 = r6 instanceof X.C30581cc
            r3 = -1
            if (r0 == 0) goto L_0x0090
            byte[] r0 = r8.A0G()
            if (r0 == 0) goto L_0x0090
            java.lang.String r1 = r7.A04
            if (r1 == 0) goto L_0x0090
            X.0sb r0 = r5.A02
            java.lang.String r2 = X.C004101u.A02(r1)
            X.1jH r0 = r0.A05()
            java.io.File r1 = r0.A0Q
            r0 = 0
            X.C16180sb.A04(r1, r0)
            X.AnonymousClass00B.A06(r2)
            java.io.File r2 = X.C16180sb.A00(r1, r2)
            byte[] r0 = r8.A0G()     // Catch:{ IOException -> 0x0085 }
            X.AnonymousClass1XI.A0G(r2, r0)     // Catch:{ IOException -> 0x0085 }
            r2.getAbsolutePath()     // Catch:{ IOException -> 0x0085 }
            r0 = 1
            r7.A08 = r0     // Catch:{ IOException -> 0x0085 }
            X.0t6 r0 = r5.A0B     // Catch:{ IOException -> 0x0085 }
            r0.A0e(r6, r3)     // Catch:{ IOException -> 0x0085 }
            goto L_0x003c
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = "ThumbnailDownloadMananger/whenDownloadComplete, exception when creating thumbnail file"
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r2)
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x003c
        L_0x0090:
            boolean r0 = r6 instanceof X.C16730tY
            if (r0 == 0) goto L_0x003c
            X.0t6 r0 = r5.A0B
            r0.A0e(r6, r3)
            goto L_0x003c
        L_0x009a:
            X.0tq r0 = r1.A04     // Catch:{ Exception -> 0x02d6 }
            X.0tf r4 = r0.A02()     // Catch:{ Exception -> 0x02d6 }
            X.1cj r8 = r4.A00()     // Catch:{ all -> 0x00e2 }
            r0 = 0
            r6.A0h(r0)     // Catch:{ all -> 0x00dd }
            X.0t6 r1 = r1.A02     // Catch:{ all -> 0x00dd }
            r0 = -1
            r1.A0y(r6, r0)     // Catch:{ all -> 0x00dd }
            long r6 = r6.A13     // Catch:{ all -> 0x00dd }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x00dd }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00dd }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "mms_thumbnail_metadata"
            java.lang.String r0 = "message_row_id = ?"
            int r2 = r3.A01(r1, r0, r2)     // Catch:{ all -> 0x00dd }
            r8.A00()     // Catch:{ all -> 0x00dd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnail deleting rows:"
            r1.append(r0)     // Catch:{ all -> 0x00dd }
            r1.append(r2)     // Catch:{ all -> 0x00dd }
            X.C13680ns.A1V(r1)     // Catch:{ all -> 0x00dd }
            r8.close()     // Catch:{ all -> 0x00e2 }
            r4.close()     // Catch:{ Exception -> 0x02d6 }
            return
        L_0x00dd:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            throw r0     // Catch:{ Exception -> 0x02d6 }
        L_0x00e7:
            java.lang.Object r5 = r2.A00
            X.11W r5 = (X.AnonymousClass11W) r5
            java.lang.Object r1 = r2.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r3 = r2.A02
            X.1WD r3 = (X.AnonymousClass1WD) r3
            java.util.List r8 = (java.util.List) r8
            X.0sq r0 = r5.A09
            r0.Ac3(r1)
            java.util.Iterator r2 = r8.iterator()
            r11 = 1
        L_0x00ff:
            r1 = 1
        L_0x0100:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r2.next()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r1 == 0) goto L_0x0113
            if (r0 == 0) goto L_0x0113
            goto L_0x00ff
        L_0x0113:
            r1 = 0
            goto L_0x0100
        L_0x0115:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A02(r0)
            if (r1 == 0) goto L_0x02da
            X.11S r3 = r5.A01
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startNonCriticalBootstrapPhase started"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sK r0 = r3.A00
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0139
            X.0sq r2 = r3.A05
            r1 = 20
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r0.<init>(r3, r1)
            r2.Acl(r0)
        L_0x0139:
            X.0ul r1 = r5.A08
            r0 = 3
            r1.A0E(r0, r11, r11)
            X.0sG r0 = r5.A05
            java.util.ArrayList r0 = r0.A0F()
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            java.util.Iterator r1 = r0.iterator()
        L_0x014d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015f
            X.0sH r0 = X.C13680ns.A0U(r1)
            com.whatsapp.jid.Jid r0 = X.C16010sH.A03(r0)
            r7.add(r0)
            goto L_0x014d
        L_0x015f:
            r6 = 500(0x1f4, float:7.0E-43)
            r4 = 0
            X.AnonymousClass00B.A0F(r11)
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            int r2 = r7.size()
        L_0x016d:
            if (r4 >= r2) goto L_0x017e
            int r1 = r4 + r6
            int r0 = java.lang.Math.min(r2, r1)
            java.util.List r0 = r7.subList(r4, r0)
            r3.add(r0)
            r4 = r1
            goto L_0x016d
        L_0x017e:
            java.util.Iterator r1 = r3.iterator()
        L_0x0182:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02da
            java.lang.Object r9 = r1.next()
            java.util.Collection r9 = (java.util.Collection) r9
            X.0xz r6 = r5.A06
            X.1kz r8 = X.C34861kz.A0K
            X.27w r7 = X.C453027w.A0A
            r10 = 0
            r6.A02(r7, r8, r9, r10, r11)
            goto L_0x0182
        L_0x0199:
            java.lang.Object r5 = r2.A00
            X.0wL r5 = (X.C18220wL) r5
            java.lang.Object r3 = r2.A01
            X.1XP r3 = (X.AnonymousClass1XP) r3
            java.lang.Object r2 = r2.A02
            X.213 r2 = (X.AnonymousClass213) r2
            X.21C r8 = (X.AnonymousClass21C) r8
            java.io.File r4 = r8.A01
            if (r4 == 0) goto L_0x01b6
            r0 = 0
            X.21L r1 = new X.21L
            r1.<init>(r4, r0)
            X.1XS r0 = r3.A08
            r0.A04(r1)
        L_0x01b6:
            X.1XS r0 = r3.A0D
            r0.A04(r8)
            X.14u r7 = r5.A0A
            X.210 r0 = r3.A01()
            X.1XK r6 = r0.A05
            boolean r0 = X.C31831f6.A02(r6)
            r4 = 1
            r1 = 0
            if (r0 == 0) goto L_0x01e3
            X.0wP r0 = r7.A02
            int r1 = r0.A04(r1)
            X.0rz r0 = r7.A05
            int r0 = X.AnonymousClass20B.A00(r0, r1)
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01e8
        L_0x01db:
            X.1zh r1 = r3.A0K
            X.AnonymousClass00B.A06(r1)
            monitor-enter(r1)
            r0 = 1
            goto L_0x01ea
        L_0x01e3:
            X.1XK r0 = X.AnonymousClass1XK.A0S
            if (r6 != r0) goto L_0x01e8
            goto L_0x01db
        L_0x01e8:
            r4 = 0
            goto L_0x01db
        L_0x01ea:
            r1.A0D = r0     // Catch:{ all -> 0x0226 }
            monitor-exit(r1)
            java.lang.String r0 = r3.A0U
            if (r0 != 0) goto L_0x0222
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0222
            if (r4 != 0) goto L_0x0222
            X.AnonymousClass00B.A06(r1)
            X.21E r0 = new X.21E
            r0.<init>()
            r1.A06(r0)
            r0 = 14
            X.1XS r1 = r3.A0A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04(r0)
        L_0x020d:
            X.1XS r0 = r2.A02
            r0.A01()
            X.1XS r0 = r2.A03
            r0.A01()
            X.1XS r0 = r2.A04
            r0.A01()
            X.1XS r0 = r2.A01
            r0.A01()
            return
        L_0x0222:
            r5.A0B(r3, r8)
            goto L_0x020d
        L_0x0226:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0229:
            java.lang.Object r0 = r2.A00
            X.1HE r0 = (X.AnonymousClass1HE) r0
            java.lang.Object r6 = r2.A01
            X.1zg r6 = (X.C43241zg) r6
            X.21L r8 = (X.AnonymousClass21L) r8
            java.util.concurrent.CopyOnWriteArrayList r7 = r6.A01
            r7.size()
            X.1Sv r2 = r0.A0E
            java.io.File r5 = r8.A01
            X.0tY r1 = r6.A00()
            monitor-enter(r1)
            X.0tY r0 = r6.A00()     // Catch:{ all -> 0x02db }
            X.0ta r0 = X.C16730tY.A00(r0)     // Catch:{ all -> 0x02db }
            java.io.File r11 = r0.A0F     // Catch:{ all -> 0x02db }
            monitor-exit(r1)     // Catch:{ all -> 0x02db }
            int r13 = r7.size()
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A03
            r0.addAndGet(r13)
            boolean r0 = r5.equals(r11)
            if (r0 == 0) goto L_0x0262
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.A02
            r0 = 1
            r1.set(r0)
            return
        L_0x0262:
            if (r13 == 0) goto L_0x02da
            X.01Z r10 = r2.A01
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            r10.A05(r5, r13, r0)
            long r2 = r8.A00
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x028a
            java.lang.String r0 = "sendmediamessagemanager/applyMediaFileReference file size from reference is 0.  filesize computed from file is = "
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r0)
            long r0 = r5.length()
            java.lang.String r0 = X.C13680ns.A0j(r4, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x028a:
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            java.util.Iterator r4 = r0.iterator()
        L_0x0292:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r1 = r4.next()
            X.0tY r1 = (X.C16730tY) r1
            monitor-enter(r1)
            X.0ta r0 = X.C16730tY.A00(r1)     // Catch:{ all -> 0x02a9 }
            r0.A0F = r5     // Catch:{ all -> 0x02a9 }
            r1.A01 = r2     // Catch:{ all -> 0x02a9 }
            monitor-exit(r1)     // Catch:{ all -> 0x02a9 }
            goto L_0x0292
        L_0x02a9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02a9 }
            throw r0
        L_0x02ac:
            if (r11 == 0) goto L_0x02da
            X.0tY r0 = r6.A00()
            byte r12 = r0.A10
            r14 = 0
            X.0sb r1 = r10.A00     // Catch:{ IOException -> 0x02cb }
            boolean r0 = r1.A0U(r11)     // Catch:{ IOException -> 0x02cb }
            if (r0 != 0) goto L_0x02c9
            boolean r0 = r1.A0T(r11)     // Catch:{ IOException -> 0x02cb }
            if (r0 == 0) goto L_0x02d1
            boolean r0 = r1.A0W(r11)     // Catch:{ IOException -> 0x02cb }
            if (r0 != 0) goto L_0x02d1
        L_0x02c9:
            r14 = 1
            goto L_0x02d1
        L_0x02cb:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/isPrivateManagedMediaFile "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02d1:
            r15 = 0
            r10.A00(r11, r12, r13, r14, r15)
            return
        L_0x02d6:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
        L_0x02da:
            return
        L_0x02db:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02db }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxNConsumerShape15S0300000_1_I0.accept(java.lang.Object):void");
    }
}
