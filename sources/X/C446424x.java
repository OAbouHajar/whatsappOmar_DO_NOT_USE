package X;

import com.whatsapp.jid.DeviceJid;
import java.io.File;

/* renamed from: X.24x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C446424x implements AnonymousClass1WE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ long A09;
    public final /* synthetic */ AnonymousClass1WM A0A;
    public final /* synthetic */ DeviceJid A0B;
    public final /* synthetic */ AnonymousClass1XP A0C;
    public final /* synthetic */ C23321Bn A0D;
    public final /* synthetic */ C29911bQ A0E;
    public final /* synthetic */ File A0F;
    public final /* synthetic */ String A0G;

    public /* synthetic */ C446424x(AnonymousClass1WM r3, DeviceJid deviceJid, AnonymousClass1XP r5, C23321Bn r6, C29911bQ r7, File file, String str, int i2, int i3, int i4, int i5, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A0D = r6;
        this.A0F = file;
        this.A0C = r5;
        this.A02 = i2;
        this.A0A = r3;
        this.A03 = i3;
        this.A0E = r7;
        this.A08 = j2;
        this.A09 = j3;
        this.A0B = deviceJid;
        this.A00 = i4;
        this.A01 = i5;
        this.A04 = j4;
        this.A05 = j5;
        this.A06 = j6;
        this.A0G = str;
        this.A07 = j7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r35) {
        /*
            r34 = this;
            r4 = r35
            r5 = r34
            X.1Bn r0 = r5.A0D
            r33 = r0
            java.io.File r3 = r5.A0F
            X.1XP r2 = r5.A0C
            int r10 = r5.A02
            X.1WM r9 = r5.A0A
            int r7 = r5.A03
            X.1bQ r6 = r5.A0E
            long r0 = r5.A08
            r31 = r0
            long r0 = r5.A09
            r29 = r0
            com.whatsapp.jid.DeviceJid r0 = r5.A0B
            r28 = r0
            int r0 = r5.A00
            r27 = r0
            int r0 = r5.A01
            r26 = r0
            long r0 = r5.A04
            r24 = r0
            long r0 = r5.A05
            r22 = r0
            long r0 = r5.A06
            r20 = r0
            java.lang.String r0 = r5.A0G
            r19 = r0
            long r0 = r5.A07
            r17 = r0
            java.lang.Number r4 = (java.lang.Number) r4
            boolean r0 = r3.delete()
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "history-sync-send-methods/failed to delete temp file: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0055:
            r0 = r33
            X.0t9 r5 = r0.A0O
            X.0wL r3 = r0.A0S
            int r1 = r4.intValue()
            r0 = 8
            X.21I r0 = r3.A02(r2, r1, r0)
            r5.A06(r0)
            r2.A02()
            if (r1 != 0) goto L_0x00b7
            X.1XS r0 = r2.A0H
            java.lang.Object r2 = r0.A00()
            X.21B r2 = (X.AnonymousClass21B) r2
            if (r2 == 0) goto L_0x00b7
            if (r10 != 0) goto L_0x0081
            r0 = r33
            X.16Q r1 = r0.A0L
            r0 = 1
            r1.A01(r0)
        L_0x0081:
            X.1ez r0 = r2.A02
            java.lang.String r13 = r0.A03()
            java.lang.String r12 = r0.A05()
            java.lang.String r11 = r0.A04()
            X.1XM r2 = r0.A00()
            if (r2 == 0) goto L_0x016c
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x016c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x016c
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x016c
            r0 = r33
            X.0sK r0 = r0.A01
            r0.A0B()
            X.1ZT r15 = r0.A05
            if (r15 != 0) goto L_0x00e0
            java.lang.String r0 = "history-sync-send-methods/no my user id (unregistered?)."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00b7:
            long r0 = (long) r7
            X.1Wm r2 = r6.A00
            X.1bP r2 = (X.C29901bP) r2
            X.1XE r2 = r2.A07
            int r2 = r2.size()
            long r2 = (long) r2
            r7 = 3
        L_0x00c4:
            if (r10 != 0) goto L_0x00ce
            r4 = r33
            X.16Q r5 = r4.A0L
            r4 = 0
            r5.A01(r4)
        L_0x00ce:
            r4 = r33
            X.19E r4 = r4.A04
            r16 = 0
            r5 = r9
            r6 = r10
            r8 = r0
            r10 = r2
            r12 = r31
            r14 = r29
            r4.A0A(r5, r6, r7, r8, r10, r12, r14, r16)
            return
        L_0x00e0:
            r0 = r33
            X.17g r14 = r0.A0U
            X.0t3 r0 = r0.A07
            long r0 = r0.A00()
            byte[] r2 = r2.A01
            r16 = r2
            X.1Wm r2 = r6.A00
            X.1bP r2 = (X.C29901bP) r2
            X.1XE r2 = r2.A07
            int r2 = r2.size()
            long r3 = (long) r2
            if (r9 == 0) goto L_0x0169
            java.lang.String r8 = r9.A01
            java.lang.String r5 = r9.A00
        L_0x00ff:
            X.18b r14 = r14.A05
            r2 = 1
            X.1Vw r14 = r14.A02(r15, r2)
            X.1bM r2 = new X.1bM
            r2.<init>(r14, r0)
            r0 = r28
            r2.A00 = r0
            r2.A0B = r13
            r2.A0D = r12
            r2.A0C = r11
            r0 = r16
            r2.A0H = r0
            r0 = r29
            r2.A05 = r0
            r0 = r27
            r2.A00 = r0
            r2.A01 = r7
            r2.A03 = r10
            r0 = r26
            r2.A02 = r0
            r0 = r24
            r2.A08 = r0
            r0 = r20
            r2.A09 = r0
            r0 = r22
            r2.A06 = r0
            r0 = r19
            r2.A0E = r0
            r2.A04 = r3
            r0 = r31
            r2.A07 = r0
            r2.A0G = r8
            r2.A0F = r5
            r0 = r17
            r2.A0A = r0
            r0 = r33
            X.19M r0 = r0.A0M
            long r11 = r0.A01(r2)
            r3 = 0
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x017b
            java.lang.String r0 = "history-sync-send-methods/failed to add peer message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            long r0 = (long) r7
            X.1Wm r2 = r6.A00
            X.1bP r2 = (X.C29901bP) r2
            X.1XE r2 = r2.A07
            int r2 = r2.size()
            long r2 = (long) r2
            r7 = 5
            goto L_0x00c4
        L_0x0169:
            r8 = 0
            r5 = 0
            goto L_0x00ff
        L_0x016c:
            long r0 = (long) r7
            X.1Wm r2 = r6.A00
            X.1bP r2 = (X.C29901bP) r2
            X.1XE r2 = r2.A07
            int r2 = r2.size()
            long r2 = (long) r2
            r7 = 4
            goto L_0x00c4
        L_0x017b:
            r0 = r33
            X.0xb r5 = r0.A03
            r4 = 0
            r3 = 0
            com.obwhatsapp.jobqueue.job.SendPeerMessageJob r1 = new com.obwhatsapp.jobqueue.job.SendPeerMessageJob
            r0 = r28
            r1.<init>(r0, r2, r4, r3)
            r5.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C446424x.accept(java.lang.Object):void");
    }
}
