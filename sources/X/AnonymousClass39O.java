package X;

import android.os.Build;

/* renamed from: X.39O  reason: invalid class name */
public class AnonymousClass39O {
    public String A00;
    public final C216514x A01;
    public final C17650vQ A02;
    public final C19610yi A03;
    public final AnonymousClass013 A04;
    public final AnonymousClass15N A05;
    public final C218415q A06;
    public final C16740tZ A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass39O(C216514x r1, C17650vQ r2, C19610yi r3, AnonymousClass013 r4, AnonymousClass15N r5, C218415q r6, C16740tZ r7, boolean z2, boolean z3, boolean z4) {
        this.A02 = r2;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A01 = r1;
        this.A0A = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A07 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e8, code lost:
        if (r15.A0B() == false) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C007503l A00(android.app.PendingIntent r21, android.app.PendingIntent r22, android.content.Context r23, X.C16010sH r24, X.C37871ps r25, X.AnonymousClass1WS r26, X.AnonymousClass1WS r27, java.lang.CharSequence r28, java.lang.CharSequence r29, java.lang.StringBuilder r30, int r31, int r32, boolean r33, boolean r34) {
        /*
            r20 = this;
            r5 = r31
            r6 = r28
            r14 = r20
            X.0vQ r0 = r14.A02
            boolean r18 = r0.A00()
            X.0tZ r0 = r14.A07
            r13 = r25
            if (r0 == 0) goto L_0x0176
            r19 = 1
            long r0 = java.lang.System.currentTimeMillis()
        L_0x0018:
            X.03l r4 = X.C218415q.A00(r23)
            r2 = r29
            r4.A0A(r2)
            r4.A09(r6)
            r2 = r21
            r4.A09 = r2
            android.app.Notification r2 = r4.A07
            r3 = r22
            r2.deleteIntent = r3
            java.lang.String r3 = "msg"
            r4.A0I = r3
            r4.A05(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0078
            X.03l r7 = X.C218415q.A00(r23)
            r7.A0I = r3
            X.15q r0 = r14.A06
            X.0tz r0 = r0.A09
            android.content.Context r1 = r0.A00
            r0 = 2131893493(0x7f121cf5, float:1.9421764E38)
            java.lang.String r0 = r1.getString(r0)
            r7.A0A(r0)
            r3 = 1
            if (r5 != r3) goto L_0x0064
            X.013 r9 = r14.A04
            r8 = 2131755243(0x7f1000eb, float:1.914136E38)
            long r0 = (long) r5
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r3 = 0
            X.AnonymousClass000.A1M(r6, r5, r3)
            java.lang.String r6 = r9.A0J(r6, r8, r0)
        L_0x0064:
            r7.A09(r6)
            r1 = 2131232243(0x7f0805f3, float:1.808059E38)
            int r1 = com.obwhatsapp.yo.yo.getNIcon(r1)
            android.app.Notification r0 = r7.A07
            r0.icon = r1
            android.app.Notification r0 = r7.A01()
            r4.A08 = r0
        L_0x0078:
            boolean r0 = r14.A0A
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "group_key_messages"
            r4.A0K = r0
            r0 = 1
            r4.A0S = r0
        L_0x0083:
            r0 = 2131232243(0x7f0805f3, float:1.808059E38)
            int r0 = com.obwhatsapp.yo.yo.getNIcon(r0)
            r2.icon = r0
            boolean r9 = r14.A08
            if (r9 != 0) goto L_0x00c4
            X.15q r10 = r14.A06
            X.0tZ r0 = r13.A00
            X.1Vw r1 = r0.A11
            X.0rv r1 = r1.A00
            boolean r1 = X.C16030sJ.A0L(r1)
            r8 = 1
            r7 = 2
            if (r1 == 0) goto L_0x00a1
            r7 = 1
        L_0x00a1:
            r12 = r24
            boolean r1 = r12.A0J()
            r6 = 0
            if (r1 != 0) goto L_0x0112
            X.0tz r0 = r10.A09
            android.content.Context r1 = r0.A00
            r0 = 2131889764(0x7f120e64, float:1.94142E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            X.0sP r3 = r10.A06
            java.lang.String r3 = r3.A0G(r12, r7, r6)
            java.lang.String r0 = X.C13680ns.A0d(r1, r3, r2, r6, r0)
        L_0x00bd:
            java.lang.String r0 = X.C40651uT.A03(r0)
            r4.A0B(r0)
        L_0x00c4:
            java.lang.String r0 = r13.A04()
            if (r0 == 0) goto L_0x00cd
            r4.A0C(r0)
        L_0x00cd:
            r15 = r26
            r17 = r33
            if (r34 != 0) goto L_0x00ed
            if (r9 != 0) goto L_0x00ed
            if (r33 != 0) goto L_0x00ed
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x00ed
            if (r19 == 0) goto L_0x00ed
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x00ea
            boolean r1 = r15.A0B()
            r0 = 0
            if (r1 != 0) goto L_0x00eb
        L_0x00ea:
            r0 = 1
        L_0x00eb:
            r4.A03 = r0
        L_0x00ed:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0111
            r16 = r27
            java.lang.String r1 = r14.A01(r15, r16, r17, r18, r19)
            r14.A00 = r1
            X.AnonymousClass00B.A06(r1)
            r4.A0J = r1
            r0 = 1
            r4.A01 = r0
            int r5 = r31 + r32
            r4.A02 = r5
            java.lang.String r0 = " channelId="
            r2 = r30
            r2.append(r0)
            r2.append(r1)
        L_0x0111:
            return r4
        L_0x0112:
            boolean r1 = r0 instanceof X.AnonymousClass1WU
            if (r1 == 0) goto L_0x011f
            X.15Z r1 = r10.A03
            X.1WU r0 = (X.AnonymousClass1WU) r0
            java.lang.String r0 = r1.A0C(r0, r6)
            goto L_0x00bd
        L_0x011f:
            X.0rv r3 = r0.A0B()
            java.lang.String r2 = " @ "
            if (r3 == 0) goto L_0x0154
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            X.0sP r0 = r10.A06
            X.0sG r11 = r10.A05
            X.0sH r3 = r11.A0A(r3)
            java.lang.String r3 = r0.A0G(r3, r7, r6)
            r1.append(r3)
            r1.append(r2)
        L_0x013d:
            java.lang.String r0 = r0.A0G(r12, r7, r6)
            java.lang.String r3 = X.AnonymousClass000.A0h(r0, r1)
            X.0tz r0 = r10.A09
            android.content.Context r2 = r0.A00
            r1 = 2131889764(0x7f120e64, float:1.94142E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r0 = X.C13680ns.A0d(r2, r3, r0, r6, r1)
            goto L_0x00bd
        L_0x0154:
            java.lang.String r1 = "getNotificationTicker/missing_rmt_src:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            java.lang.String r0 = X.C38621r6.A0J(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            X.0tz r0 = r10.A09
            android.content.Context r3 = r0.A00
            r0 = 2131887425(0x7f120541, float:1.9409457E38)
            X.C13690nt.A0t(r3, r2, r1, r0)
            X.0sP r0 = r10.A06
            goto L_0x013d
        L_0x0176:
            r19 = 0
            X.0tZ r0 = r13.A00
            long r0 = r0.A0I
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39O.A00(android.app.PendingIntent, android.app.PendingIntent, android.content.Context, X.0sH, X.1ps, X.1WS, X.1WS, java.lang.CharSequence, java.lang.CharSequence, java.lang.StringBuilder, int, int, boolean, boolean):X.03l");
    }

    public final String A01(AnonymousClass1WS r4, AnonymousClass1WS r5, boolean z2, boolean z3, boolean z4) {
        AnonymousClass2DT r0;
        return (this.A08 || z2 || this.A09 || "Silent".equalsIgnoreCase(r4.A07()) || !z4 || (z3 && (Build.VERSION.SDK_INT < 28 || !(this.A01.A04().A07.isEmpty() ^ true))) || ((r0 = this.A03.A00) != null && r0.A0w) || this.A05.A00) ? ((C41001v2) r4).A0D() : r5 != null ? ((C41001v2) r5).A0C() : ((C41001v2) r4).A0C();
    }
}
