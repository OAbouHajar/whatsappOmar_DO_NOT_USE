package X;

import java.util.List;

/* renamed from: X.3DV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DV implements AnonymousClass025 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42481xs A01;
    public final /* synthetic */ C34861kz A02;
    public final /* synthetic */ C451027b A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public /* synthetic */ AnonymousClass3DV(C42481xs r1, C34861kz r2, C451027b r3, List list, List list2, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A01 = r1;
        this.A02 = r2;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A09 = z5;
        this.A0A = z6;
        this.A0B = z7;
        this.A0C = z8;
        this.A0D = z9;
        this.A00 = i2;
        this.A04 = list;
        this.A05 = list2;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0129, code lost:
        if (r1.A0H() != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013e, code lost:
        if (r15 == false) goto L_0x0140;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r30) {
        /*
            r29 = this;
            r22 = r30
            r1 = r29
            X.1xs r7 = r1.A01
            X.1kz r11 = r1.A02
            boolean r0 = r1.A06
            r21 = r0
            boolean r12 = r1.A07
            boolean r0 = r1.A08
            r28 = r0
            boolean r10 = r1.A09
            boolean r9 = r1.A0A
            boolean r8 = r1.A0B
            boolean r0 = r1.A0C
            r27 = r0
            boolean r0 = r1.A0D
            r26 = r0
            int r0 = r1.A00
            r25 = r0
            java.util.List r3 = r1.A04
            java.util.List r0 = r1.A05
            r24 = r0
            X.27b r6 = r1.A03
            r0 = r22
            java.lang.String r0 = (java.lang.String) r0
            r22 = r0
            long r19 = android.os.SystemClock.elapsedRealtime()
            X.282 r2 = r7.A0A
            java.lang.String r1 = "sync/sync_all/"
            java.util.List r0 = java.util.Collections.emptyList()
            X.287 r5 = r2.A01(r1, r3, r0)
            if (r5 != 0) goto L_0x0050
            r0 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A09 = r0
            X.284 r0 = X.AnonymousClass284.A03
            return r0
        L_0x0050:
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.util.HashSet r18 = X.C13680ns.A0o()
            java.util.HashSet r13 = X.C13680ns.A0o()
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            java.util.List r3 = r5.A00
            r1.addAll(r3)
            java.util.List r2 = r5.A06
            r1.addAll(r2)
            java.util.List r0 = r5.A05
            r23 = r0
            r1.addAll(r0)
            java.util.Iterator r16 = r1.iterator()
        L_0x0075:
            boolean r0 = r16.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x00e0
            X.0sH r15 = X.C13680ns.A0U(r16)
            boolean r0 = X.AnonymousClass288.A03(r15, r1)
            if (r0 != 0) goto L_0x0075
            X.1qw r14 = new X.1qw
            r14.<init>(r15)
            r14.A09 = r1
            r14.A0I = r12
            r0 = r28
            r14.A0G = r0
            r14.A08 = r10
            r14.A0B = r9
            r14.A0F = r8
            r0 = r27
            r14.A0C = r0
            int r0 = X.C16010sH.A00(r15, r11)
            r14.A00 = r0
            r0 = r26
            r14.A0E = r0
            if (r10 == 0) goto L_0x00b0
            java.util.Map r1 = r7.A0M
            com.whatsapp.jid.UserJid r0 = r14.A0K
            X.C38531qw.A00(r7, r14, r0, r1)
        L_0x00b0:
            if (r9 == 0) goto L_0x00bc
            X.0z2 r1 = r7.A0G
            com.whatsapp.jid.UserJid r0 = r14.A0K
            long r0 = X.C19810z2.A00(r14, r1, r0)
            r14.A01 = r0
        L_0x00bc:
            X.C13680ns.A1R(r7, r14, r8)
            X.C38531qw.A01(r14, r4)
            X.1ko r0 = r15.A0D
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x00ce
            r13.add(r0)
        L_0x00ce:
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r15.A08(r1)
            if (r0 == 0) goto L_0x0075
            com.whatsapp.jid.Jid r1 = r15.A08(r1)
            r0 = r18
            r0.add(r1)
            goto L_0x0075
        L_0x00e0:
            if (r12 != 0) goto L_0x00e6
            if (r10 != 0) goto L_0x00e6
            if (r21 == 0) goto L_0x0171
        L_0x00e6:
            X.0rs r0 = r7.A0C
            java.util.Set r17 = r0.A0A()
            java.util.Iterator r16 = r24.iterator()
        L_0x00f0:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0171
            X.0sH r1 = X.C13680ns.A0U(r16)
            com.whatsapp.jid.Jid r14 = X.C16010sH.A03(r1)
            X.1ko r0 = r1.A0D
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = r0.A01
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x00f0
        L_0x010a:
            if (r14 != 0) goto L_0x00f0
            r0 = r18
            boolean r0 = r0.contains(r14)
            if (r0 != 0) goto L_0x00f0
            X.0rv r14 = r1.A0E
            boolean r0 = X.AnonymousClass288.A04(r14)
            if (r0 != 0) goto L_0x00f0
            r0 = r17
            boolean r0 = r0.contains(r14)
            if (r0 != 0) goto L_0x012b
            boolean r0 = r1.A0H()
            r15 = 0
            if (r0 == 0) goto L_0x012c
        L_0x012b:
            r15 = 1
        L_0x012c:
            X.1qw r14 = new X.1qw
            r14.<init>(r1)
            r14.A0I = r12
            r14.A08 = r10
            r0 = r28
            r14.A0G = r0
            r14.A0D = r15
            if (r21 == 0) goto L_0x0140
            r0 = 1
            if (r15 != 0) goto L_0x0141
        L_0x0140:
            r0 = 0
        L_0x0141:
            r14.A0H = r0
            r14.A0B = r9
            int r0 = X.C16010sH.A00(r1, r11)
            r14.A00 = r0
            r14.A0F = r8
            r0 = r27
            r14.A0C = r0
            r0 = r26
            r14.A0E = r0
            if (r10 == 0) goto L_0x015e
            java.util.Map r1 = r7.A0M
            com.whatsapp.jid.UserJid r0 = r14.A0K
            X.C38531qw.A00(r7, r14, r0, r1)
        L_0x015e:
            if (r9 == 0) goto L_0x016a
            X.0z2 r1 = r7.A0G
            com.whatsapp.jid.UserJid r0 = r14.A0K
            long r0 = X.C19810z2.A00(r14, r1, r0)
            r14.A01 = r0
        L_0x016a:
            X.C13680ns.A1R(r7, r14, r8)
            X.C38531qw.A01(r14, r4)
            goto L_0x00f0
        L_0x0171:
            boolean r0 = X.C451027b.A00(r6, r4)
            if (r0 == 0) goto L_0x017a
            X.284 r0 = X.AnonymousClass284.A08
            return r0
        L_0x017a:
            X.283 r8 = r7.A01()
            java.lang.String r1 = "sync_sid_full"
            r0 = r25
            java.util.concurrent.Future r1 = X.AnonymousClass283.A03(r11, r8, r1, r4, r0)
            r0 = r22
            boolean r0 = r7.A03(r6, r0, r1)
            if (r0 != 0) goto L_0x0192
            X.284 r0 = X.AnonymousClass284.A03
            return r0
        L_0x0192:
            java.util.Map r1 = r7.A0P
            r0 = 0
            r7.A02(r0, r3, r1)
            r7.A02(r0, r2, r1)
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            r0 = r23
            r7.A02(r8, r0, r1)
            java.util.List r0 = r5.A03
            boolean r2 = r7.A04(r3, r0, r2)
            java.lang.String r0 = "sync/sync_all/contacts update="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r2)
            X.C13680ns.A1V(r0)
            java.lang.String r0 = "sync/sync_all/contacts_changed_by_server"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x01ca
            X.0xU r1 = r7.A04
            r0 = 0
            r1.A0T(r8, r0)
            r2 = 1
        L_0x01ca:
            r0 = r19
            X.AnonymousClass167.A00(r7, r6, r4, r0)
            if (r2 == 0) goto L_0x01d4
            X.284 r0 = X.AnonymousClass284.A07
            return r0
        L_0x01d4:
            X.284 r0 = X.AnonymousClass284.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DV.apply(java.lang.Object):java.lang.Object");
    }
}
