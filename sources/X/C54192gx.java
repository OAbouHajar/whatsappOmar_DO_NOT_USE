package X;

import java.util.Map;

/* renamed from: X.2gx  reason: invalid class name and case insensitive filesystem */
public class C54192gx extends C51442bg {
    public C54192gx(C16300so r1, C14710pd r2, C16490t9 r3, AnonymousClass2H7 r4, Map map) {
        super(r1, r2, r3, r4, map);
    }

    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.os.Handler, com.whatsapp.jid.DeviceJid] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0274  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C28371Vv r21) {
        /*
            r20 = this;
            X.1kL r4 = new X.1kL
            r4.<init>()
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            r1 = r20
            X.0so r5 = r1.A01
            java.lang.String r0 = "from"
            r2 = r21
            com.whatsapp.jid.Jid r0 = r2.A0F(r5, r3, r0)
            r4.A01 = r0
            java.lang.String r19 = "participant"
            r0 = r19
            com.whatsapp.jid.Jid r0 = r2.A0F(r5, r3, r0)
            r4.A02 = r0
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.Jid r0 = r2.A0F(r5, r3, r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r4.A03 = r0
            java.lang.String r3 = "id"
            r0 = 0
            java.lang.String r0 = r2.A0N(r3, r0)
            r4.A07 = r0
            java.lang.String r3 = "class"
            r0 = 0
            java.lang.String r0 = r2.A0N(r3, r0)
            r4.A05 = r0
            java.lang.String r3 = "type"
            r0 = 0
            java.lang.String r0 = r2.A0N(r3, r0)
            r4.A08 = r0
            java.lang.String r18 = "edit"
            r3 = 0
            r0 = r18
            java.lang.String r0 = r2.A0N(r0, r3)
            r4.A06 = r0
            X.1ci r0 = r4.A00()
            java.lang.String r4 = r0.A05
            java.lang.String r3 = "message"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01e2
            com.whatsapp.jid.UserJid r5 = r0.A03
            if (r5 != 0) goto L_0x006a
            com.whatsapp.jid.Jid r3 = r0.A01
            X.0rv r5 = X.C16030sJ.A00(r3)
        L_0x006a:
            r4 = 1
            java.lang.String r3 = r0.A07
            X.1Vw r6 = new X.1Vw
            r6.<init>(r5, r3, r4)
            java.lang.String r3 = "error"
            r8 = 0
            java.lang.String r11 = r2.A0N(r3, r8)
            java.lang.String r12 = "phash"
            java.lang.String r7 = r2.A0N(r12, r8)
            java.lang.String r10 = "count"
            java.lang.String r3 = r2.A0N(r10, r8)
            r5 = 0
            int r9 = X.C29501aj.A00(r3, r5)
            java.lang.String r3 = "t"
            java.lang.String r13 = r2.A0N(r3, r8)
            r3 = 0
            long r3 = X.C29501aj.A01(r13, r3)
            r16 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r3
            java.lang.String r3 = "rcat"
            X.1Vv r2 = r2.A0J(r3)
            if (r2 == 0) goto L_0x00ab
            byte[] r3 = r2.A01
            r2 = 10
            java.lang.String r8 = android.util.Base64.encodeToString(r3, r2)
        L_0x00ab:
            if (r11 != 0) goto L_0x018f
            X.2H7 r5 = r1.A04
            com.whatsapp.jid.Jid r2 = r0.A02
            com.whatsapp.jid.DeviceJid r14 = com.whatsapp.jid.DeviceJid.of(r2)
            com.whatsapp.jid.Jid r2 = r0.A01
            com.whatsapp.jid.DeviceJid r13 = com.whatsapp.jid.DeviceJid.of(r2)
            java.lang.String r4 = r0.A06
            java.lang.String r2 = "xmpp/reader/read/message-received-by-server; key="
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r2)
            r11.append(r6)
            java.lang.String r2 = "; participant="
            r11.append(r2)
            r11.append(r14)
            java.lang.String r2 = "; remoteJid="
            r11.append(r2)
            r11.append(r13)
            java.lang.String r2 = "; serverParticipantHash="
            r11.append(r2)
            r11.append(r7)
            java.lang.String r2 = "; recipientCount="
            r11.append(r2)
            r11.append(r9)
            java.lang.String r2 = "; edit="
            r11.append(r2)
            r11.append(r4)
            java.lang.String r2 = "; counterAbuseToken="
            r11.append(r2)
            r11.append(r8)
            java.lang.String r2 = "; timestamp="
            r11.append(r2)
            r2 = r16
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.2H8 r11 = r5.A01
            r5 = 0
            r3 = 0
            r2 = 19
            android.os.Message r5 = android.os.Message.obtain(r5, r3, r2, r3)
            android.os.Bundle r15 = r5.getData()
            java.lang.String r3 = r6.A01
            java.lang.String r2 = "msgid"
            r15.putString(r2, r3)
            android.os.Bundle r15 = r5.getData()
            X.0rv r2 = r6.A00
            java.lang.String r3 = X.C16030sJ.A03(r2)
            java.lang.String r2 = "remote_chat_jid"
            r15.putString(r2, r3)
            android.os.Bundle r3 = r5.getData()
            r2 = r19
            X.AnonymousClass2RS.A01(r3, r14, r2)
            android.os.Bundle r3 = r5.getData()
            java.lang.String r2 = "remoteJid"
            X.AnonymousClass2RS.A01(r3, r13, r2)
            android.os.Bundle r2 = r5.getData()
            r2.putString(r12, r7)
            android.os.Bundle r2 = r5.getData()
            r2.putInt(r10, r9)
            android.os.Bundle r7 = r5.getData()
            java.lang.String r6 = "timestamp"
            r2 = r16
            r7.putLong(r6, r2)
            android.os.Bundle r3 = r5.getData()
            r2 = r18
            r3.putString(r2, r4)
            android.os.Bundle r3 = r5.getData()
            java.lang.String r2 = "counter_abuse_token"
            r3.putString(r2, r8)
        L_0x016b:
            r11.AZq(r5)
        L_0x016e:
            X.2H7 r3 = r1.A04
            java.lang.String r2 = "xmpp/reader/on-ack; stanzaKey="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2H8 r2 = r3.A01
            android.os.Handler r2 = (android.os.Handler) r2
            r1 = 5
            android.os.Message r0 = r2.obtainMessage(r1, r0)
            r0.sendToTarget()
            return
        L_0x018f:
            int r10 = X.C29501aj.A00(r11, r5)
            X.2H7 r4 = r1.A04
            com.whatsapp.jid.Jid r2 = r0.A02
            com.whatsapp.jid.DeviceJid r9 = com.whatsapp.jid.DeviceJid.of(r2)
            com.whatsapp.jid.Jid r2 = r0.A01
            com.whatsapp.jid.DeviceJid r8 = com.whatsapp.jid.DeviceJid.of(r2)
            java.lang.String r2 = "xmpp/reader/read/message-error; key="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r6)
            java.lang.String r2 = "; participant="
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = "; remoteJid="
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = "; code="
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = "; phash="
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.2H8 r11 = r4.A01
            X.2eL r4 = new X.2eL
            r4.<init>(r9, r8, r6, r10)
            r3 = 0
            r2 = 16
            android.os.Message r5 = android.os.Message.obtain(r3, r5, r2, r5, r4)
            goto L_0x016b
        L_0x01e2:
            java.lang.String r3 = "receipt"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02ee
            java.lang.String r6 = r0.A08
            java.lang.String r3 = "played"
            boolean r10 = r3.equals(r6)
            java.lang.String r9 = "played-self"
            java.lang.String r5 = "read"
            java.lang.String r8 = "server-error"
            if (r10 != 0) goto L_0x0215
            boolean r3 = r8.equals(r6)
            if (r3 != 0) goto L_0x0215
            boolean r3 = r5.equals(r6)
            if (r3 != 0) goto L_0x0215
            boolean r3 = r9.equals(r6)
            if (r3 != 0) goto L_0x0215
            java.lang.String r3 = "read-self"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x016e
        L_0x0215:
            com.whatsapp.jid.Jid r4 = r0.A01
            X.0rv r3 = X.C16030sJ.A00(r4)
            boolean r3 = X.C16030sJ.A0I(r3)
            r15 = 0
            if (r3 == 0) goto L_0x02e8
            com.whatsapp.jid.UserJid r4 = r0.A00()
        L_0x0226:
            java.lang.String r3 = r0.A07
            X.1Vw r7 = new X.1Vw
            r7.<init>(r4, r3, r15)
            if (r10 != 0) goto L_0x02c6
            boolean r3 = r9.equals(r6)
            if (r3 != 0) goto L_0x02c6
            boolean r3 = r8.equals(r6)
            if (r3 == 0) goto L_0x027d
            X.2H7 r5 = r1.A04
            java.lang.String r4 = "xmpp/reader/read/server-error-received-by-server "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.2H8 r5 = r5.A01
            r3 = 1
            X.1Vw[] r11 = new X.C28381Vw[r3]
            r11[r15] = r7
            X.0rv r8 = r7.A00
            r7 = 0
            r12 = 12
        L_0x025b:
            r13 = 0
            r10 = r7
            X.2Qr r6 = new X.2Qr
            r9 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15)
            android.os.Message r3 = android.os.Message.obtain(r7, r15, r3, r15, r6)
        L_0x0268:
            r5.AZq(r3)
        L_0x026b:
            java.lang.String r3 = "readreceipts"
            r5 = 0
            java.lang.String r3 = r2.A0N(r3, r5)
            if (r3 == 0) goto L_0x016e
            X.2H7 r4 = r1.A04
            r3 = 227(0xe3, float:3.18E-43)
            r4.A00(r2, r5, r3)
            goto L_0x016e
        L_0x027d:
            boolean r3 = r5.equals(r6)
            if (r3 == 0) goto L_0x026b
            X.2H7 r6 = r1.A04
            com.whatsapp.jid.Jid r3 = r0.A02
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r3)
            java.lang.String r3 = "xmpp/reader/read/read-receipt-received-by-server "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r7)
            java.lang.String r3 = " "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.2H8 r5 = r6.A01
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r4 = r7.A01
            java.lang.String r3 = "msgid"
            r6.putString(r3, r4)
            X.0rv r3 = r7.A00
            java.lang.String r4 = X.C16030sJ.A03(r3)
            java.lang.String r3 = "remote_jid"
            r6.putString(r3, r4)
            r4 = 0
            r3 = 86
            android.os.Message r3 = android.os.Message.obtain(r4, r15, r3, r15, r6)
            goto L_0x0268
        L_0x02c6:
            X.2H7 r5 = r1.A04
            java.lang.String r4 = "xmpp/reader/read/playback-received-by-server "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.2H8 r5 = r5.A01
            r3 = 1
            X.1Vw[] r11 = new X.C28381Vw[r3]
            r11[r15] = r7
            X.0rv r8 = r7.A00
            r7 = 0
            r12 = 10
            goto L_0x025b
        L_0x02e8:
            X.0rv r4 = X.C16030sJ.A00(r4)
            goto L_0x0226
        L_0x02ee:
            java.lang.String r3 = "call"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x016e
            com.whatsapp.jid.Jid r8 = r0.A01
            X.AnonymousClass00B.A06(r8)
            X.1Vv[] r7 = r2.A03
            r5 = 0
            if (r7 == 0) goto L_0x0311
            int r6 = r7.length
            com.whatsapp.protocol.VoipStanzaChildNode[] r11 = new com.whatsapp.protocol.VoipStanzaChildNode[r6]
            r4 = 0
        L_0x0304:
            if (r4 >= r6) goto L_0x0312
            r3 = r7[r4]
            com.whatsapp.protocol.VoipStanzaChildNode r3 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r3)
            r11[r4] = r3
            int r4 = r4 + 1
            goto L_0x0304
        L_0x0311:
            r11 = 0
        L_0x0312:
            java.lang.String r10 = r0.A08
            java.lang.String r3 = "error"
            int r12 = r2.A0A(r3, r5)
            java.lang.String r9 = r0.A07     // Catch:{ IllegalArgumentException -> 0x0371 }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalArgumentException -> 0x0371 }
            if (r2 != 0) goto L_0x0361
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalArgumentException -> 0x0371 }
            if (r2 != 0) goto L_0x0369
            X.2H7 r4 = r1.A04     // Catch:{ IllegalArgumentException -> 0x0371 }
            X.AnonymousClass00B.A06(r9)     // Catch:{ IllegalArgumentException -> 0x0371 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ IllegalArgumentException -> 0x0371 }
            X.4NT r7 = new X.4NT     // Catch:{ IllegalArgumentException -> 0x0371 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0371 }
            java.lang.String r2 = "xmpp/reader/on-call-incoming-ack-"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0371 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0371 }
            java.lang.String r2 = r7.A03     // Catch:{ IllegalArgumentException -> 0x0371 }
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x0371 }
            java.lang.String r2 = " from="
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x0371 }
            com.whatsapp.jid.Jid r2 = r7.A01     // Catch:{ IllegalArgumentException -> 0x0371 }
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x0371 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x0371 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalArgumentException -> 0x0371 }
            X.2H8 r4 = r4.A01     // Catch:{ IllegalArgumentException -> 0x0371 }
            r3 = 0
            r2 = 193(0xc1, float:2.7E-43)
            android.os.Message r2 = android.os.Message.obtain(r3, r5, r2, r5, r7)     // Catch:{ IllegalArgumentException -> 0x0371 }
            r4.AZq(r2)     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x016e
        L_0x0361:
            java.lang.String r0 = "bad call incoming ack, missing id"
            X.1W9 r1 = new X.1W9     // Catch:{ IllegalArgumentException -> 0x0371 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x0370
        L_0x0369:
            java.lang.String r0 = "bad call incoming ack, missing type"
            X.1W9 r1 = new X.1W9     // Catch:{ IllegalArgumentException -> 0x0371 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x0371 }
        L_0x0370:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0371 }
        L_0x0371:
            r2 = move-exception
            java.lang.String r1 = "bad call incoming ack"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            r0.initCause(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54192gx.A00(X.1Vv):void");
    }
}
