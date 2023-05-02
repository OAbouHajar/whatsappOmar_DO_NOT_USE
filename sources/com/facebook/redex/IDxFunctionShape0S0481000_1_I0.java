package com.facebook.redex;

import X.AnonymousClass025;

public class IDxFunctionShape0S0481000_1_I0 implements AnonymousClass025 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;

    public IDxFunctionShape0S0481000_1_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A0D = i3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i2;
        this.A03 = obj4;
        this.A04 = obj3;
        this.A0A = z2;
        this.A0B = z3;
        this.A0C = z4;
        this.A05 = z5;
        this.A06 = z6;
        this.A07 = z7;
        this.A08 = z8;
        this.A09 = z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r2 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (r14 == false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r28) {
        /*
            r27 = this;
            r13 = r28
            r3 = r27
            int r0 = r3.A0D
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r3.A01
            r20 = r0
            r0 = r20
            X.1xs r0 = (X.C42481xs) r0
            r20 = r0
            java.lang.Object r10 = r3.A02
            X.1kz r10 = (X.C34861kz) r10
            boolean r11 = r3.A07
            boolean r9 = r3.A08
            boolean r8 = r3.A09
            boolean r7 = r3.A0A
            boolean r6 = r3.A0B
            boolean r5 = r3.A0C
            boolean r2 = r3.A05
            boolean r0 = r3.A06
            r22 = r0
            int r0 = r3.A00
            r21 = r0
            java.lang.Object r1 = r3.A03
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r3.A04
            X.27b r4 = (X.C451027b) r4
            java.lang.String r13 = (java.lang.String) r13
            long r18 = android.os.SystemClock.elapsedRealtime()
            if (r11 == 0) goto L_0x004a
            if (r9 != 0) goto L_0x004a
            if (r8 != 0) goto L_0x004a
            if (r7 != 0) goto L_0x004a
            if (r6 != 0) goto L_0x004a
            if (r5 != 0) goto L_0x004a
            r17 = 1
            if (r2 == 0) goto L_0x004c
        L_0x004a:
            r17 = 0
        L_0x004c:
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            r0 = r20
            X.0rs r0 = r0.A0C
            java.util.Set r16 = r0.A0A()
            java.util.Iterator r15 = r1.iterator()
        L_0x005c:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00d6
            X.0sH r1 = X.C13680ns.A0U(r15)
            X.0rv r0 = r1.A0E
            boolean r0 = X.AnonymousClass288.A04(r0)
            if (r0 != 0) goto L_0x005c
            X.1ko r0 = r1.A0D
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007e
        L_0x007a:
            r14 = 0
            if (r17 == 0) goto L_0x008f
            goto L_0x005c
        L_0x007e:
            X.0rv r12 = r1.A0E
            r0 = r16
            boolean r0 = r0.contains(r12)
            if (r0 != 0) goto L_0x008e
            boolean r0 = r1.A0H()
            if (r0 == 0) goto L_0x007a
        L_0x008e:
            r14 = 1
        L_0x008f:
            X.1qw r12 = new X.1qw
            r12.<init>(r1)
            r12.A0I = r9
            r12.A0G = r8
            r12.A08 = r7
            r12.A0D = r14
            if (r11 == 0) goto L_0x00a1
            r0 = 1
            if (r14 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            r12.A0H = r0
            r12.A0B = r6
            int r0 = X.C16010sH.A00(r1, r10)
            r12.A00 = r0
            r12.A0F = r5
            r12.A0C = r2
            r0 = r22
            r12.A0E = r0
            if (r7 == 0) goto L_0x00bf
            r0 = r20
            java.util.Map r14 = r0.A0M
            com.whatsapp.jid.UserJid r1 = r12.A0K
            X.C38531qw.A00(r0, r12, r1, r14)
        L_0x00bf:
            if (r6 == 0) goto L_0x00cd
            r0 = r20
            X.0z2 r1 = r0.A0G
            com.whatsapp.jid.UserJid r0 = r12.A0K
            long r0 = X.C19810z2.A00(r12, r1, r0)
            r12.A01 = r0
        L_0x00cd:
            r0 = r20
            X.C13680ns.A1R(r0, r12, r5)
            X.C38531qw.A01(r12, r3)
            goto L_0x005c
        L_0x00d6:
            boolean r0 = X.C451027b.A00(r4, r3)
            if (r0 == 0) goto L_0x00df
            X.284 r3 = X.AnonymousClass284.A08
            return r3
        L_0x00df:
            X.283 r2 = r20.A01()
            java.lang.String r1 = "sync_sid_full"
            r0 = r21
            java.util.concurrent.Future r1 = X.AnonymousClass283.A03(r10, r2, r1, r3, r0)
            r0 = r20
            boolean r0 = r0.A03(r4, r13, r1)
            if (r0 != 0) goto L_0x00f7
            X.284 r3 = X.AnonymousClass284.A03
            return r3
        L_0x00f7:
            r2 = r20
            r0 = r18
            X.AnonymousClass167.A00(r2, r4, r3, r0)
            X.284 r3 = X.AnonymousClass284.A06
            return r3
        L_0x0101:
            java.lang.Object r12 = r3.A01
            X.1xs r12 = (X.C42481xs) r12
            java.lang.Object r11 = r3.A02
            X.1kz r11 = (X.C34861kz) r11
            int r0 = r3.A00
            r26 = r0
            java.lang.Object r1 = r3.A03
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r10 = r3.A04
            X.27b r10 = (X.C451027b) r10
            boolean r0 = r3.A0A
            r23 = r0
            boolean r0 = r3.A0B
            r22 = r0
            boolean r0 = r3.A0C
            r21 = r0
            boolean r0 = r3.A05
            r18 = r0
            boolean r9 = r3.A06
            boolean r8 = r3.A07
            boolean r0 = r3.A08
            r20 = r0
            boolean r0 = r3.A09
            r19 = r0
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r17 = "sync/syncMultiProtocolsInternal/time/"
            java.lang.String r7 = "multi_protocols"
            java.lang.String r6 = " scope="
            long r24 = android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0245 }
            java.util.HashSet r4 = X.C13680ns.A0o()     // Catch:{ all -> 0x0245 }
            if (r1 == 0) goto L_0x01e6
            java.util.Iterator r16 = r1.iterator()     // Catch:{ all -> 0x0245 }
        L_0x014c:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x01e6
            X.0sH r1 = X.C13680ns.A0U(r16)     // Catch:{ all -> 0x0245 }
            X.0rv r0 = r1.A0E     // Catch:{ all -> 0x0245 }
            boolean r0 = X.AnonymousClass288.A04(r0)     // Catch:{ all -> 0x0245 }
            if (r0 != 0) goto L_0x014c
            X.1qw r3 = new X.1qw     // Catch:{ all -> 0x0245 }
            r3.<init>(r1)     // Catch:{ all -> 0x0245 }
            com.whatsapp.jid.UserJid r2 = r3.A0K     // Catch:{ all -> 0x0245 }
            if (r2 == 0) goto L_0x01cb
            r0 = r23
            r3.A09 = r0     // Catch:{ all -> 0x0245 }
            r0 = r22
            r3.A0I = r0     // Catch:{ all -> 0x0245 }
            r0 = r21
            r3.A0G = r0     // Catch:{ all -> 0x0245 }
            int r0 = X.C16010sH.A00(r1, r11)     // Catch:{ all -> 0x0245 }
            r3.A00 = r0     // Catch:{ all -> 0x0245 }
            r0 = r18
            r3.A08 = r0     // Catch:{ all -> 0x0245 }
            r3.A0B = r9     // Catch:{ all -> 0x0245 }
            r3.A0F = r8     // Catch:{ all -> 0x0245 }
            r0 = r20
            r3.A0C = r0     // Catch:{ all -> 0x0245 }
            r0 = r19
            r3.A0E = r0     // Catch:{ all -> 0x0245 }
            if (r18 == 0) goto L_0x0190
            java.util.Map r0 = r12.A0M     // Catch:{ all -> 0x0245 }
            X.C38531qw.A00(r12, r3, r2, r0)     // Catch:{ all -> 0x0245 }
        L_0x0190:
            if (r9 == 0) goto L_0x01bf
            X.0z2 r0 = r12.A0G     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = ""
            java.util.Set r15 = r0.A0D(r2)     // Catch:{ all -> 0x0245 }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ all -> 0x0245 }
            r14.<init>(r15)     // Catch:{ all -> 0x0245 }
            boolean r15 = r14.isEmpty()     // Catch:{ all -> 0x0245 }
            if (r15 != 0) goto L_0x01a9
            java.lang.String r1 = X.C37431p9.A00(r14)     // Catch:{ all -> 0x0245 }
        L_0x01a9:
            r3.A06 = r1     // Catch:{ all -> 0x0245 }
            long r14 = r0.A04(r2)     // Catch:{ all -> 0x0245 }
            r3.A02 = r14     // Catch:{ all -> 0x0245 }
            X.1p6 r0 = r0.A09(r2)     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x01bc
            long r0 = r0.A01     // Catch:{ all -> 0x0245 }
        L_0x01b9:
            r3.A01 = r0     // Catch:{ all -> 0x0245 }
            goto L_0x01bf
        L_0x01bc:
            r0 = 0
            goto L_0x01b9
        L_0x01bf:
            if (r8 == 0) goto L_0x01c4
            X.C18290wS.A00(r12, r3, r2)     // Catch:{ all -> 0x0245 }
        L_0x01c4:
            X.C38531qw.A01(r3, r5)     // Catch:{ all -> 0x0245 }
            r4.add(r2)     // Catch:{ all -> 0x0245 }
            goto L_0x014c
        L_0x01cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "sync/syncMultiProtocolsInternal/request invalid jid, contact="
            r1.append(r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = r3.A0L     // Catch:{ all -> 0x0245 }
            r1.append(r0)     // Catch:{ all -> 0x0245 }
            r1.append(r6)     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r1)     // Catch:{ all -> 0x0245 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0245 }
            goto L_0x014c
        L_0x01e6:
            r5.size()     // Catch:{ all -> 0x0245 }
            boolean r0 = X.C451027b.A00(r10, r5)     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x01f2
            X.284 r3 = X.AnonymousClass284.A08     // Catch:{ all -> 0x0245 }
            goto L_0x022d
        L_0x01f2:
            X.283 r2 = r12.A01()     // Catch:{ all -> 0x0245 }
            java.lang.String r1 = "sync_sid_multi_protocols"
            r0 = r26
            java.util.concurrent.Future r0 = X.AnonymousClass283.A03(r11, r2, r1, r5, r0)     // Catch:{ all -> 0x0245 }
            boolean r0 = r12.A03(r10, r13, r0)     // Catch:{ all -> 0x0245 }
            if (r0 != 0) goto L_0x0208
            X.284 r3 = X.AnonymousClass284.A03     // Catch:{ all -> 0x0245 }
            goto L_0x022d
        L_0x0208:
            X.27c r0 = r12.A01     // Catch:{ all -> 0x0245 }
            X.C451227d.A00(r0, r10)     // Catch:{ all -> 0x0245 }
            X.167 r3 = r12.A07     // Catch:{ all -> 0x0245 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0245 }
            X.27e r2 = r0.A00     // Catch:{ all -> 0x0245 }
            java.util.Map r1 = r12.A0N     // Catch:{ all -> 0x0245 }
            java.util.Map r0 = r12.A0O     // Catch:{ all -> 0x0245 }
            r18 = r3
            r19 = r2
            r20 = r10
            r21 = r5
            r22 = r1
            r23 = r0
            r18.A02(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0245 }
            r0 = 3
            X.284 r3 = new X.284     // Catch:{ all -> 0x0245 }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0245 }
        L_0x022d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r17)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r24
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r3
        L_0x0245:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r17)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r24
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFunctionShape0S0481000_1_I0.apply(java.lang.Object):java.lang.Object");
    }
}
