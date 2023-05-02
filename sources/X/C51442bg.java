package X;

import java.util.Map;

/* renamed from: X.2bg  reason: invalid class name and case insensitive filesystem */
public abstract class C51442bg {
    public Map A00;
    public final C16300so A01;
    public final C14710pd A02;
    public final C16490t9 A03;
    public final AnonymousClass2H7 A04;

    public C51442bg(C16300so r1, C14710pd r2, C16490t9 r3, AnonymousClass2H7 r4, Map map) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C28371Vv r40) {
        /*
            r39 = this;
            r7 = r39
            X.2bp r7 = (X.C51532bp) r7
            long r36 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "offline"
            r1 = 0
            r2 = r40
            java.lang.String r3 = r2.A0N(r0, r1)
            r0 = 0
            r10 = 0
            if (r3 == 0) goto L_0x002d
            r10 = 1
            java.lang.Integer r31 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x001b }
            goto L_0x002f
        L_0x001b:
            r5 = move-exception
            java.lang.String r4 = "connection/handleNotification: got bad offline="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.e(r3, r5)
        L_0x002d:
            r31 = 0
        L_0x002f:
            java.lang.String r3 = "e"
            java.lang.String r3 = r2.A0N(r3, r1)
            if (r3 == 0) goto L_0x016d
            int r6 = java.lang.Integer.parseInt(r3)
        L_0x003b:
            java.lang.String r3 = "t"
            java.lang.String r5 = r2.A0N(r3, r1)
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L_0x0169
            long r24 = java.lang.Long.parseLong(r5)
            long r24 = r24 * r3
        L_0x004c:
            java.lang.Class<com.whatsapp.jid.Jid> r4 = com.whatsapp.jid.Jid.class
            X.0so r5 = r7.A01
            java.lang.String r3 = "from"
            com.whatsapp.jid.Jid r3 = r2.A0G(r5, r4, r3)
            boolean r4 = X.C16030sJ.A0J(r3)
            if (r4 == 0) goto L_0x0180
            boolean r4 = r3 instanceof com.whatsapp.jid.UserJid
            if (r4 == 0) goto L_0x0066
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            com.whatsapp.jid.DeviceJid r3 = r3.getPrimaryDevice()
        L_0x0066:
            java.lang.String r4 = "id"
            java.lang.String r14 = r2.A0M(r4)
            java.lang.String r4 = "platform"
            java.lang.String r22 = r2.A0N(r4, r1)
            java.lang.String r4 = "version"
            java.lang.String r23 = r2.A0N(r4, r1)
            X.1Vv r4 = r2.A0I(r0)
            if (r4 == 0) goto L_0x0178
            java.lang.String r0 = "call-id"
            java.lang.String r21 = r4.A0N(r0, r1)
            if (r21 == 0) goto L_0x0170
            java.lang.String r13 = r4.A00
            boolean r15 = X.C78093x7.A00(r13)
            if (r15 != 0) goto L_0x0164
            X.11p r0 = r7.A01
            java.util.concurrent.atomic.AtomicLong r1 = r0.A04
            long r1 = r1.getAndIncrement()
            X.0t3 r12 = r0.A02
            X.0so r11 = r0.A01
            X.0t9 r9 = r0.A00
            X.11o r8 = r0.A03
            X.3v1 r0 = new X.3v1
            r26 = r0
            r27 = r11
            r28 = r12
            r29 = r9
            r30 = r8
            r32 = r14
            r33 = r13
            r34 = r1
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r36)
            r8.A04(r0, r1)
            long r1 = r0.A03
        L_0x00b9:
            X.1kL r8 = new X.1kL
            r8.<init>()
            r8.A01 = r3
            java.lang.String r12 = "call"
            r8.A05 = r12
            r8.A07 = r14
            r8.A08 = r13
            r8.A00 = r1
            X.1ci r11 = r8.A00()
            com.whatsapp.protocol.VoipStanzaChildNode r19 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r4)
            java.lang.Class<com.whatsapp.jid.DeviceJid> r9 = com.whatsapp.jid.DeviceJid.class
            java.lang.String r8 = "call-creator"
            com.whatsapp.jid.Jid r4 = r4.A0F(r5, r9, r8)
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            long r5 = (long) r6
            r26 = 1000(0x3e8, double:4.94E-321)
            long r26 = r26 * r5
            X.3x7 r5 = new X.3x7
            r28 = r1
            r30 = r10
            r18 = r3
            r20 = r14
            r16 = r5
            r17 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30)
            if (r0 == 0) goto L_0x00f8
            r1 = 2
            r0.A00(r1)
        L_0x00f8:
            X.2H7 r2 = r7.A04
            java.lang.String r1 = "xmpp/reader/on-call-incoming-stanza-"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            com.whatsapp.protocol.VoipStanzaChildNode r4 = r5.A01
            java.lang.String r1 = r4.tag
            r3.append(r1)
            java.lang.String r1 = " from="
            r3.append(r1)
            com.whatsapp.jid.Jid r1 = r5.A00
            r3.append(r1)
            java.lang.String r1 = " callId="
            r3.append(r1)
            java.lang.String r1 = r5.A02
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2H8 r8 = r2.A01
            r3 = 0
            r6 = 0
            r1 = 192(0xc0, float:2.69E-43)
            android.os.Message r1 = android.os.Message.obtain(r3, r6, r1, r6, r5)
            r8.AZq(r1)
            if (r15 != 0) goto L_0x0161
            int r1 = X.C76973v1.A00(r13)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r1)
        L_0x013b:
            r1 = 3
            java.lang.Integer r32 = java.lang.Integer.valueOf(r1)
            r36 = r3
            r37 = r3
            r38 = r3
            r30 = r7
            r34 = r3
            r35 = r12
            r30.A01(r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.String r1 = r4.tag
            boolean r1 = X.C78093x7.A00(r1)
            if (r1 == 0) goto L_0x0160
            if (r0 == 0) goto L_0x015d
            r1 = 4
            r0.A00(r1)
        L_0x015d:
            r2.A01(r11)
        L_0x0160:
            return
        L_0x0161:
            r33 = 0
            goto L_0x013b
        L_0x0164:
            r0 = 0
            r1 = 0
            goto L_0x00b9
        L_0x0169:
            r24 = 0
            goto L_0x004c
        L_0x016d:
            r6 = 0
            goto L_0x003b
        L_0x0170:
            java.lang.String r1 = "no call-id in the payload of incoming <call> node"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0178:
            java.lang.String r1 = "no payload of incoming <call> node"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0180:
            java.lang.String r1 = "CallStanza from invalid jid "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51442bg.A00(X.1Vv):void");
    }

    public void A01(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 11) {
                C16300so r2 = this.A01;
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("-");
                    sb.append(str2);
                    str = sb.toString();
                }
                r2.AcB("offline-count-11", str, false);
            } else if (intValue <= 10) {
                return;
            }
            C75433s9 r22 = new C75433s9();
            r22.A03 = Long.valueOf(num.longValue());
            r22.A02 = num2;
            r22.A00 = num3;
            r22.A04 = str3;
            r22.A05 = str4;
            r22.A01 = num4;
            this.A03.A06(r22);
        }
    }
}
