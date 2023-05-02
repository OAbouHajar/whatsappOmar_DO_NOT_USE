package X;

import java.util.Map;

/* renamed from: X.2bk  reason: invalid class name and case insensitive filesystem */
public class C51482bk extends C51442bg {
    public final C16040sK A00;
    public final C54182gw A01;
    public final C16440t3 A02;
    public final C15860rz A03;
    public final C16490t9 A04;
    public final AnonymousClass2H7 A05;
    public final C207911p A06;
    public final C18310wU A07;
    public final C18290wS A08;
    public final AnonymousClass1HB A09;
    public final C222617g A0A;

    public C51482bk(C16300so r8, C16040sK r9, C54182gw r10, C16440t3 r11, C15860rz r12, C14710pd r13, C16490t9 r14, AnonymousClass2H7 r15, C207911p r16, C18310wU r17, C18290wS r18, AnonymousClass1HB r19, C222617g r20, Map map) {
        super(r8, r13, r14, r15, map);
        this.A02 = r11;
        this.A00 = r9;
        this.A04 = r14;
        this.A0A = r20;
        this.A08 = r18;
        this.A09 = r19;
        this.A03 = r12;
        this.A06 = r16;
        this.A07 = r17;
        this.A01 = r10;
        this.A05 = r15;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00c1, code lost:
        if (r32 == null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0718, code lost:
        if (r3.A09 == null) goto L_0x071a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C28371Vv r63) {
        /*
            r62 = this;
            r0 = 0
            r2 = r62
            X.0t3 r1 = r2.A02
            r61 = r1
            long r50 = android.os.SystemClock.uptimeMillis()
            java.lang.String r3 = "id"
            r1 = r63
            java.lang.String r17 = r1.A0M(r3)
            java.lang.String r3 = "t"
            java.lang.String r12 = r1.A0N(r3, r0)
            java.lang.Class<com.whatsapp.jid.Jid> r8 = com.whatsapp.jid.Jid.class
            X.0so r5 = r2.A01
            java.lang.String r3 = "from"
            com.whatsapp.jid.Jid r18 = r1.A0F(r5, r8, r3)
            X.AnonymousClass00B.A06(r18)
            java.lang.String r16 = "offline"
            r3 = r16
            java.lang.String r11 = r1.A0N(r3, r0)
            java.lang.String r3 = "notify"
            java.lang.String r49 = r1.A0N(r3, r0)
            java.lang.String r3 = "display_name"
            java.lang.String r48 = r1.A0N(r3, r0)
            java.lang.String r3 = "sender_pn"
            java.lang.String r47 = r1.A0N(r3, r0)
            java.lang.String r3 = "participant_lid"
            r1.A0N(r3, r0)
            java.lang.String r3 = "recipient_pn"
            java.lang.String r46 = r1.A0N(r3, r0)
            java.lang.String r28 = "verified_name"
            r3 = r28
            java.lang.String r27 = r1.A0N(r3, r0)
            java.lang.String r3 = "verified_level"
            java.lang.String r45 = r1.A0N(r3, r0)
            java.lang.String r3 = "tb_expiration_ts"
            java.lang.String r44 = r1.A0N(r3, r0)
            java.lang.String r3 = "tb_cooldown"
            java.lang.String r43 = r1.A0N(r3, r0)
            java.lang.String r3 = "edit"
            java.lang.String r22 = r1.A0N(r3, r0)
            java.lang.String r29 = "category"
            r3 = r29
            java.lang.String r26 = r1.A0N(r3, r0)
            java.lang.String r3 = "dhash"
            java.lang.String r25 = r1.A0N(r3, r0)
            X.41t r10 = X.C798941t.NONE
            java.lang.String r42 = "biz"
            r3 = r42
            X.1Vv r7 = r1.A0J(r3)
            if (r7 == 0) goto L_0x01cc
            java.lang.String r3 = "host_storage"
            java.lang.String r24 = r7.A0N(r3, r0)
            java.lang.String r3 = "actual_actors"
            java.lang.String r15 = r7.A0N(r3, r0)
            java.lang.String r3 = "privacy_mode_ts"
            java.lang.String r13 = r7.A0N(r3, r0)
            r9 = r7
            java.lang.String r3 = "interactive"
            X.1Vv r6 = r7.A0J(r3)
            if (r6 == 0) goto L_0x01c8
            java.lang.String r3 = "type"
            java.lang.String r4 = r6.A0N(r3, r0)
            java.lang.String r3 = "native_flow"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x01c8
            X.1Vv r9 = r6.A0J(r3)
            if (r9 == 0) goto L_0x01c4
            java.lang.String r3 = "name"
        L_0x00bd:
            java.lang.String r32 = r9.A0N(r3, r0)
            if (r32 != 0) goto L_0x01c0
        L_0x00c3:
            java.lang.String r3 = "buttons"
            X.1Vv r3 = r7.A0J(r3)
            if (r3 != 0) goto L_0x01c0
            java.lang.String r3 = "list"
            X.1Vv r3 = r7.A0J(r3)
            if (r3 == 0) goto L_0x01bc
            X.41t r10 = X.C798941t.LIST
        L_0x00d5:
            java.lang.String r41 = "meta"
            r3 = r41
            X.1Vv r4 = r1.A0J(r3)
            if (r4 == 0) goto L_0x01b5
            java.lang.String r3 = "tm_csat_exp_ts"
            java.lang.String r40 = r4.A0N(r3, r0)
            java.lang.String r3 = "tm_csat_cooldown"
            java.lang.String r23 = r4.A0N(r3, r0)
            java.lang.String r3 = "pollType"
            java.lang.String r14 = r4.A0N(r3, r0)
        L_0x00f3:
            java.lang.String r4 = "expiration"
            r3 = 0
            int r39 = r1.A0A(r4, r3)
            java.lang.String r33 = "type"
            r3 = r33
            java.lang.String r6 = r1.A0N(r3, r0)
            java.lang.String r3 = "eph_setting"
            java.lang.String r38 = r1.A0N(r3, r0)
            java.lang.String r34 = "count"
            r4 = 0
            r3 = r34
            int r21 = r1.A0A(r3, r4)
            boolean r4 = X.C16030sJ.A0I(r18)
            java.lang.String r3 = "participant"
            if (r4 == 0) goto L_0x01ab
            r19 = 1
            com.whatsapp.jid.Jid r20 = r1.A0F(r5, r8, r3)
            X.AnonymousClass00B.A06(r20)
            r9 = r18
        L_0x0125:
            r3 = 0
            int r3 = X.C29501aj.A00(r11, r3)
            java.lang.Integer r53 = java.lang.Integer.valueOf(r3)
            r8 = 1
            java.lang.Integer r54 = java.lang.Integer.valueOf(r8)
            X.0rv r3 = X.C16030sJ.A00(r20)
            int r3 = X.C18020w1.A04(r3)
            java.lang.Integer r56 = java.lang.Integer.valueOf(r3)
            java.lang.String r18 = "message"
            r59 = r0
            r60 = r0
            r52 = r2
            r55 = r0
            r57 = r18
            r58 = r6
            r52.A01(r53, r54, r55, r56, r57, r58, r59, r60)
            java.lang.String r37 = "text"
            r3 = r37
            boolean r3 = r3.equals(r6)
            java.lang.String r36 = "media"
            java.lang.String r35 = "pay"
            if (r3 != 0) goto L_0x0187
            r3 = r36
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x0187
            r3 = r35
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x0187
            java.lang.String r3 = "reaction"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x0187
            java.lang.String r3 = "poll"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x0187
            java.lang.String r3 = "medianotify"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0815
        L_0x0187:
            long r3 = r61.A00()
            r30 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r30
            long r57 = X.C29501aj.A01(r12, r3)
            long r57 = r57 * r30
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            java.lang.String r3 = "recipient"
            com.whatsapp.jid.Jid r4 = r1.A0F(r5, r4, r3)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            if (r4 == 0) goto L_0x01d4
            if (r9 == 0) goto L_0x01d4
            java.lang.String r1 = "Message cannot have both a recipient and a participant attribute"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01ab:
            r19 = 0
            com.whatsapp.jid.Jid r9 = r1.A0F(r5, r8, r3)
            r20 = r18
            goto L_0x0125
        L_0x01b5:
            r14 = 0
            r40 = 0
            r23 = 0
            goto L_0x00f3
        L_0x01bc:
            X.41t r10 = X.C798941t.BIZ
            goto L_0x00d5
        L_0x01c0:
            X.41t r10 = X.C798941t.BUTTON
            goto L_0x00d5
        L_0x01c4:
            r32 = 0
            goto L_0x00c3
        L_0x01c8:
            java.lang.String r3 = "native_flow_name"
            goto L_0x00bd
        L_0x01cc:
            r15 = 0
            r32 = 0
            r13 = 0
            r24 = 0
            goto L_0x00d5
        L_0x01d4:
            r3 = r20
            boolean r3 = r3 instanceof com.whatsapp.jid.GroupJid
            if (r3 != 0) goto L_0x01e0
            r3 = r20
            boolean r3 = r3 instanceof X.C34771kq
            if (r3 == 0) goto L_0x024e
        L_0x01e0:
            boolean r3 = r9 instanceof com.whatsapp.jid.DeviceJid
            if (r3 == 0) goto L_0x023e
            X.0sK r5 = r2.A00
            r3 = r9
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            com.whatsapp.jid.UserJid r3 = r3.getUserJid()
            boolean r3 = r5.A0I(r3)
            if (r3 == 0) goto L_0x023e
        L_0x01f3:
            X.17g r5 = r2.A0A
            java.lang.Long r12 = java.lang.Long.valueOf(r57)
            r4 = 0
            if (r20 == 0) goto L_0x01fd
            r4 = 1
        L_0x01fd:
            java.lang.String r3 = "remoteJid must be provided"
            X.AnonymousClass00B.A0C(r3, r4)
            r4 = 1
            java.lang.String r3 = "id must be provided"
            X.AnonymousClass00B.A0C(r3, r8)
            if (r12 != 0) goto L_0x020b
            r4 = 0
        L_0x020b:
            java.lang.String r3 = "timestampMillis must be provided"
            X.AnonymousClass00B.A0C(r3, r4)
            java.lang.String r3 = "fromMe must be provided"
            X.AnonymousClass00B.A0C(r3, r8)
            X.1br r3 = new X.1br
            r59 = 1
            r52 = r3
            r53 = r20
            r54 = r0
            r55 = r5
            r56 = r17
            r52.<init>(r53, r54, r55, r56, r57, r59)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r3.A0I = r4
        L_0x022d:
            long r4 = r61.A00()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.A0L = r4
            r3.A0b = r6
            r3.A0Y = r14
            if (r11 == 0) goto L_0x029c
            goto L_0x0283
        L_0x023e:
            boolean r3 = r9 instanceof com.whatsapp.jid.UserJid
            if (r3 == 0) goto L_0x024e
            X.0sK r5 = r2.A00
            r3 = r9
            X.0rv r3 = (X.C15830rv) r3
            boolean r3 = r5.A0I(r3)
            if (r3 == 0) goto L_0x024e
            goto L_0x01f3
        L_0x024e:
            X.17g r12 = r2.A0A
            java.lang.Long r21 = java.lang.Long.valueOf(r57)
            r5 = 0
            if (r20 == 0) goto L_0x0258
            r5 = 1
        L_0x0258:
            java.lang.String r3 = "remoteJid must be provided"
            X.AnonymousClass00B.A0C(r3, r5)
            r5 = 1
            java.lang.String r3 = "id must be provided"
            X.AnonymousClass00B.A0C(r3, r8)
            if (r21 != 0) goto L_0x0266
            r5 = 0
        L_0x0266:
            java.lang.String r3 = "timestampMillis must be provided"
            X.AnonymousClass00B.A0C(r3, r5)
            java.lang.String r3 = "fromMe must be provided"
            X.AnonymousClass00B.A0C(r3, r8)
            r59 = 0
            X.1br r3 = new X.1br
            r52 = r3
            r53 = r20
            r54 = r4
            r55 = r12
            r56 = r17
            r52.<init>(r53, r54, r55, r56, r57, r59)
            goto L_0x022d
        L_0x0283:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x028a }
            r3.A0H = r4     // Catch:{ NumberFormatException -> 0x028a }
            goto L_0x029c
        L_0x028a:
            r12 = move-exception
            java.lang.String r5 = "connection/handleMessage: got bad offline="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.e(r4, r12)
        L_0x029c:
            r4 = r25
            r3.A0T = r4
            r4 = r19
            r3.A0c = r4
            r4 = r49
            r3.A0V = r4
            r4 = r48
            r3.A0U = r4
            r4 = r47
            r3.A0a = r4
            r4 = r46
            r3.A0Z = r4
            r4 = r26
            r3.A0R = r4
            r4 = r32
            r3.A0X = r4
            r3.A0D = r10
            if (r9 == 0) goto L_0x02c2
            r3.A08 = r9
        L_0x02c2:
            java.lang.String r12 = "' is not numeric"
            if (r27 == 0) goto L_0x02ed
            long r4 = java.lang.Long.parseLong(r27)     // Catch:{ NumberFormatException -> 0x02d3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x02d3 }
            r3.A0P = r4     // Catch:{ NumberFormatException -> 0x02d3 }
            r3.A0V = r0     // Catch:{ NumberFormatException -> 0x02d3 }
            goto L_0x02ed
        L_0x02d3:
            java.lang.String r0 = "verified name serial number value '"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r27
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02ed:
            if (r45 == 0) goto L_0x02f7
            int r4 = X.C53782gH.A00(r45)
            r3.A05 = r4
            r3.A0V = r0
        L_0x02f7:
            if (r13 == 0) goto L_0x0302
            X.1ta r5 = new X.1ta
            r4 = r24
            r5.<init>((java.lang.String) r4, (java.lang.String) r15, (java.lang.String) r13)
            r3.A0E = r5
        L_0x0302:
            if (r44 == 0) goto L_0x0329
            long r4 = java.lang.Long.parseLong(r44)     // Catch:{ NumberFormatException -> 0x030f }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x030f }
            r3.A0O = r4     // Catch:{ NumberFormatException -> 0x030f }
            goto L_0x0329
        L_0x030f:
            java.lang.String r0 = "tb_expiration_ts value '"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r44
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0329:
            if (r43 == 0) goto L_0x0350
            long r4 = java.lang.Long.parseLong(r43)     // Catch:{ NumberFormatException -> 0x0336 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0336 }
            r3.A0N = r4     // Catch:{ NumberFormatException -> 0x0336 }
            goto L_0x0350
        L_0x0336:
            java.lang.String r0 = "tb_cooldown value '"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r43
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0350:
            if (r40 == 0) goto L_0x03dc
            if (r23 == 0) goto L_0x03dc
            long r25 = java.lang.Long.parseLong(r23)     // Catch:{ NumberFormatException -> 0x03c2 }
            long r25 = r25 * r30
            long r23 = java.lang.Long.parseLong(r40)     // Catch:{ NumberFormatException -> 0x03c2 }
            long r23 = r23 * r30
            r10 = 0
            int r4 = (r23 > r10 ? 1 : (r23 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x03dc
            int r4 = (r25 > r10 ? 1 : (r25 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x03dc
            long r4 = r61.A00()     // Catch:{ NumberFormatException -> 0x03c2 }
            X.0rz r15 = r2.A03     // Catch:{ NumberFormatException -> 0x03c2 }
            X.01D r10 = r15.A01     // Catch:{ NumberFormatException -> 0x03c2 }
            java.lang.Object r11 = r10.get()     // Catch:{ NumberFormatException -> 0x03c2 }
            android.content.SharedPreferences r11 = (android.content.SharedPreferences) r11     // Catch:{ NumberFormatException -> 0x03c2 }
            java.lang.String r10 = "cooldown_expiry_time_millis"
            r13 = -1
            long r13 = r11.getLong(r10, r13)     // Catch:{ NumberFormatException -> 0x03c2 }
            int r11 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x03dc
            android.content.SharedPreferences$Editor r11 = r15.A0K()     // Catch:{ NumberFormatException -> 0x03c2 }
            long r4 = r4 + r25
            android.content.SharedPreferences$Editor r4 = r11.putLong(r10, r4)     // Catch:{ NumberFormatException -> 0x03c2 }
            r4.apply()     // Catch:{ NumberFormatException -> 0x03c2 }
            X.3sF r5 = new X.3sF     // Catch:{ NumberFormatException -> 0x03c2 }
            r5.<init>()     // Catch:{ NumberFormatException -> 0x03c2 }
            com.whatsapp.jid.Jid r4 = r3.A01()     // Catch:{ NumberFormatException -> 0x03c2 }
            X.0rv r4 = X.C16030sJ.A00(r4)     // Catch:{ NumberFormatException -> 0x03c2 }
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r4)     // Catch:{ NumberFormatException -> 0x03c2 }
            java.lang.String r4 = X.C16030sJ.A03(r4)     // Catch:{ NumberFormatException -> 0x03c2 }
            r5.A05 = r4     // Catch:{ NumberFormatException -> 0x03c2 }
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x03c2 }
            r5.A03 = r4     // Catch:{ NumberFormatException -> 0x03c2 }
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x03c2 }
            r5.A02 = r4     // Catch:{ NumberFormatException -> 0x03c2 }
            X.0t9 r4 = r2.A04     // Catch:{ NumberFormatException -> 0x03c2 }
            r4.A04(r5)     // Catch:{ NumberFormatException -> 0x03c2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r23)     // Catch:{ NumberFormatException -> 0x03c2 }
            r3.A0M = r4     // Catch:{ NumberFormatException -> 0x03c2 }
            goto L_0x03dc
        L_0x03c2:
            java.lang.String r0 = "trigger_csat_expiration_ts value '"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r40
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x03dc:
            if (r39 <= 0) goto L_0x03e2
            r4 = r39
            r3.A02 = r4
        L_0x03e2:
            r4 = r38
            r3.A0Q = r4
            java.lang.String r13 = "rcat"
            X.1Vv r4 = r1.A0J(r13)
            if (r4 == 0) goto L_0x058f
            byte[] r5 = r4.A01
            if (r5 == 0) goto L_0x058f
            r4 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r5, r4)
        L_0x03f8:
            r3.A0S = r4
            X.1Vv[] r12 = r1.A03
            r15 = r12
            if (r12 != 0) goto L_0x0402
            r4 = 0
            X.1Vv[] r15 = new X.C28371Vv[r4]
        L_0x0402:
            X.2gw r4 = r2.A01
            X.0sK r4 = r4.A01
            boolean r4 = r4.A0G()
            if (r4 == 0) goto L_0x044c
            r4 = r16
            java.lang.String r4 = r1.A0N(r4, r0)
            if (r4 != 0) goto L_0x044c
            r4 = r29
            java.lang.String r5 = r1.A0N(r4, r0)
            java.lang.String r4 = "peer"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x044c
            r4 = r33
            java.lang.String r5 = r1.A0N(r4, r0)
            if (r12 == 0) goto L_0x044a
            r4 = r37
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x052c
            r4 = r36
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x052c
            java.lang.String r4 = "reaction"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x052c
            java.lang.String r4 = "poll"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x052c
        L_0x044a:
            r3.A0d = r8
        L_0x044c:
            r4 = r35
            boolean r4 = r4.equals(r6)
            java.lang.String r14 = "enc"
            int r11 = r15.length
            if (r4 == 0) goto L_0x059a
            r10 = 0
            r12 = 0
            r21 = 0
            r23 = 0
            r13 = 0
        L_0x045e:
            if (r10 >= r11) goto L_0x06c7
            r7 = r15[r10]
            boolean r4 = X.C28371Vv.A07(r7, r14)
            if (r4 == 0) goto L_0x048d
            r5 = 0
            r4 = r34
            int r4 = r7.A0A(r4, r5)
            if (r12 != 0) goto L_0x0485
            if (r4 <= 0) goto L_0x0485
            X.0wS r4 = r2.A08
            r4.A06()
            X.16r r5 = r4.A08
            java.lang.String r4 = r3.A0o
            X.1Vt r4 = r5.A0M(r4, r0)
            if (r4 == 0) goto L_0x0592
            r3.A07 = r4
            r12 = 1
        L_0x0485:
            r2.A02(r3, r7)
            r23 = 1
        L_0x048a:
            int r10 = r10 + 1
            goto L_0x045e
        L_0x048d:
            if (r21 != 0) goto L_0x0516
            r4 = r35
            boolean r4 = X.C28371Vv.A07(r7, r4)
            if (r4 == 0) goto L_0x0516
            java.lang.String r5 = "IN"
            java.lang.String r4 = "country"
            java.lang.String r5 = r7.A0N(r4, r5)
            java.lang.String r4 = "version"
            java.lang.String r4 = r7.A0N(r4, r0)
            int r4 = X.C29501aj.A00(r4, r8)
            boolean r4 = X.AnonymousClass1W1.A0A(r5, r4)
            if (r4 != 0) goto L_0x04bc
            X.1HB r12 = r2.A09
            long r4 = r3.A0j
            X.1Vt r4 = r12.A03(r7, r4)
        L_0x04b8:
            r3.A07 = r4
        L_0x04ba:
            r12 = 1
            goto L_0x048a
        L_0x04bc:
            r4 = r33
            java.lang.String r5 = r7.A0N(r4, r0)
            java.lang.String r4 = "request"
            boolean r4 = r4.equals(r5)
            X.1HB r12 = r2.A09
            if (r4 == 0) goto L_0x04fe
            X.1Vt r4 = r3.A07
            if (r4 == 0) goto L_0x04dd
            java.lang.String r5 = "request-id"
            java.lang.String r5 = r7.A0N(r5, r0)
            X.AnonymousClass00B.A06(r5)
            r4.A06(r5)
            goto L_0x04ba
        L_0x04dd:
            com.whatsapp.jid.Jid r4 = r3.A0k
            X.0rv r4 = X.C16030sJ.A00(r4)
            com.whatsapp.jid.UserJid r25 = com.whatsapp.jid.UserJid.of(r4)
            com.whatsapp.jid.Jid r4 = r3.A08
            X.0rv r4 = X.C16030sJ.A00(r4)
            com.whatsapp.jid.UserJid r26 = com.whatsapp.jid.UserJid.of(r4)
            long r4 = r3.A0j
            r27 = r7
            r28 = r4
            r24 = r12
            X.1Vt r4 = r24.A00(r25, r26, r27, r28)
            goto L_0x04b8
        L_0x04fe:
            com.whatsapp.jid.Jid r4 = r3.A0k
            X.0rv r4 = X.C16030sJ.A00(r4)
            com.whatsapp.jid.UserJid r13 = com.whatsapp.jid.UserJid.of(r4)
            long r4 = r3.A0j
            X.1Vt r4 = r12.A01(r13, r7, r4)
            if (r4 == 0) goto L_0x0512
            r3.A07 = r4
        L_0x0512:
            r23 = 1
            r13 = 1
            goto L_0x04ba
        L_0x0516:
            if (r13 != 0) goto L_0x048a
            java.lang.String r4 = "transaction"
            boolean r4 = X.C28371Vv.A07(r7, r4)
            if (r4 == 0) goto L_0x048a
            X.0wU r5 = r2.A07
            X.2H7 r4 = r2.A05
            r5.A0L(r4, r3, r7, r0)
            r21 = 1
            goto L_0x048a
        L_0x052c:
            int r11 = r12.length
            r10 = 0
        L_0x052e:
            if (r10 >= r11) goto L_0x044c
            r5 = r12[r10]
            java.lang.String r4 = "enc"
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            java.lang.String r4 = "device-identity"
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            r4 = r28
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            java.lang.String r4 = "url_text"
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            java.lang.String r4 = "url_number"
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            java.lang.String r4 = "padding"
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            r4 = r42
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            r4 = r41
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            java.lang.String r4 = "automated"
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            java.lang.String r4 = "multicast"
            boolean r4 = X.C28371Vv.A07(r5, r4)
            if (r4 != 0) goto L_0x058c
            boolean r4 = X.C28371Vv.A07(r5, r13)
            if (r4 != 0) goto L_0x058c
            goto L_0x044a
        L_0x058c:
            int r10 = r10 + 1
            goto L_0x052e
        L_0x058f:
            r4 = 0
            goto L_0x03f8
        L_0x0592:
            java.lang.String r1 = "MessageStanzaHandler/paymentTransactionInfo is null"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x059a:
            r13 = 0
            r23 = 0
        L_0x059d:
            if (r13 >= r11) goto L_0x06d7
            r12 = r15[r13]
            java.lang.String r4 = "body"
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 != 0) goto L_0x0693
            r4 = r36
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 != 0) goto L_0x0693
            boolean r4 = X.C28371Vv.A07(r12, r14)
            if (r4 == 0) goto L_0x05bf
            r2.A02(r3, r12)
        L_0x05ba:
            r23 = 1
        L_0x05bc:
            int r13 = r13 + 1
            goto L_0x059d
        L_0x05bf:
            java.lang.String r4 = "registration"
            boolean r4 = X.C28371Vv.A07(r12, r4)
            r10 = 4
            if (r4 == 0) goto L_0x05d2
            byte[] r5 = r12.A01
            if (r5 == 0) goto L_0x05d2
            int r4 = r5.length
            if (r4 != r10) goto L_0x05d2
            r3.A0h = r5
            goto L_0x05bc
        L_0x05d2:
            r4 = r28
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 == 0) goto L_0x0605
            if (r27 == 0) goto L_0x0605
            java.lang.String r4 = "v"
            java.lang.String r5 = r12.A0N(r4, r0)
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x05f2
            byte[] r4 = r12.A01
            if (r4 == 0) goto L_0x05f2
            r3.A0i = r4
            goto L_0x05bc
        L_0x05f2:
            java.lang.String r10 = "unknown vname cert payload version: "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r10)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.w((java.lang.String) r4)
            goto L_0x05bc
        L_0x0605:
            java.lang.String r4 = "device-identity"
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 == 0) goto L_0x0612
            byte[] r4 = r12.A01
            r3.A0g = r4
            goto L_0x05bc
        L_0x0612:
            java.lang.String r4 = "multicast"
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 == 0) goto L_0x0622
            r5 = 64
        L_0x061c:
            int r4 = r3.A03
            r5 = r5 | r4
            r3.A03 = r5
            goto L_0x05bc
        L_0x0622:
            java.lang.String r4 = "bypassed"
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 == 0) goto L_0x062d
            r5 = 16
            goto L_0x061c
        L_0x062d:
            java.lang.String r4 = "hsm"
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 == 0) goto L_0x0670
            if (r7 == 0) goto L_0x063d
            if (r32 == 0) goto L_0x063d
            X.41t r4 = X.C798941t.BIZ
            r3.A0D = r4
        L_0x063d:
            r5 = 32
            int r4 = r3.A03
            r5 = r5 | r4
            r3.A03 = r5
            r4 = r29
            java.lang.String r12 = r12.A0N(r4, r0)
            if (r12 != 0) goto L_0x0651
            r10 = r0
        L_0x064d:
            r3.A0W = r10
            goto L_0x05bc
        L_0x0651:
            java.lang.String r10 = "TRANSACTIONAL"
            boolean r21 = r10.equals(r12)
            java.lang.String r5 = "OTP"
            java.lang.String r4 = "NON_TRANSACTIONAL"
            if (r21 != 0) goto L_0x064d
            boolean r10 = r4.equals(r12)
            if (r10 == 0) goto L_0x0665
            r10 = r4
            goto L_0x064d
        L_0x0665:
            boolean r4 = r5.equals(r12)
            if (r4 == 0) goto L_0x066d
            r10 = r5
            goto L_0x064d
        L_0x066d:
            java.lang.String r10 = "OTHER"
            goto L_0x064d
        L_0x0670:
            java.lang.String r4 = "url_text"
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 == 0) goto L_0x067b
            r5 = 2
            goto L_0x061c
        L_0x067b:
            java.lang.String r4 = "url_number"
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 == 0) goto L_0x0686
            r5 = 4
            goto L_0x061c
        L_0x0686:
            java.lang.String r4 = "unavailable"
            boolean r4 = X.C28371Vv.A07(r12, r4)
            if (r4 == 0) goto L_0x05bc
            r3.A0e = r8
            goto L_0x05ba
        L_0x0693:
            X.1kL r3 = new X.1kL
            r3.<init>()
            r0 = r20
            if (r19 == 0) goto L_0x069d
            r0 = r9
        L_0x069d:
            r3.A01 = r0
            r0 = r18
            r3.A05 = r0
            r0 = r17
            r3.A07 = r0
            r3.A08 = r6
            if (r19 != 0) goto L_0x06ad
            r20 = r9
        L_0x06ad:
            r0 = r20
            r3.A02 = r0
            java.lang.String r1 = "error"
            java.lang.String r0 = "406"
            r3.A01(r1, r0)
            X.1ci r1 = r3.A00()
            X.2H7 r0 = r2.A05
            r0.A01(r1)
            java.lang.String r0 = "connection/handleMessage: received plaintext message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06c7:
            X.1Vt r4 = r3.A07
            if (r4 != 0) goto L_0x06d7
            if (r12 != 0) goto L_0x06cf
            if (r21 == 0) goto L_0x06d7
        L_0x06cf:
            long r4 = r3.A0j
            X.1Vt r4 = X.AnonymousClass1W1.A00(r4)
            r3.A07 = r4
        L_0x06d7:
            boolean r4 = android.text.TextUtils.isEmpty(r22)
            if (r4 == 0) goto L_0x0783
            r4 = 0
            r3.A01 = r4
        L_0x06e0:
            X.0pd r7 = r2.A02
            r5 = 296(0x128, float:4.15E-43)
            X.0tM r4 = X.C16620tM.A02
            boolean r4 = r7.A0E(r4, r5)
            if (r4 == 0) goto L_0x073c
            X.11p r7 = r2.A06
            java.util.concurrent.atomic.AtomicLong r4 = r7.A04
            long r4 = r4.getAndIncrement()
            X.0t3 r14 = r7.A02
            X.0so r13 = r7.A01
            X.0t9 r12 = r7.A00
            X.11o r8 = r7.A03
            java.lang.String r11 = r3.A0o
            java.lang.Integer r10 = r3.A0H
            int r7 = r3.A02
            r52 = 0
            if (r7 <= 0) goto L_0x0708
            r52 = 1
        L_0x0708:
            int r7 = r3.A01
            r53 = 0
            if (r7 <= 0) goto L_0x0710
            r53 = 1
        L_0x0710:
            X.1d1 r7 = r3.A0A
            if (r7 == 0) goto L_0x071a
            X.1d1 r7 = r3.A09
            r54 = 1
            if (r7 != 0) goto L_0x071c
        L_0x071a:
            r54 = 0
        L_0x071c:
            boolean r7 = r3.A0c
            if (r7 == 0) goto L_0x0765
            r47 = 3
        L_0x0722:
            X.1d3 r7 = new X.1d3
            r41 = r13
            r42 = r14
            r43 = r12
            r44 = r8
            r45 = r10
            r46 = r11
            r48 = r4
            r40 = r7
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            r3.A06 = r4
            r8.A04(r7, r4)
        L_0x073c:
            if (r23 == 0) goto L_0x0815
            X.2H7 r8 = r2.A05
            X.1lL[] r9 = r1.A0Q()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r9 == 0) goto L_0x07b1
            int r6 = r9.length
            r5 = 0
        L_0x074d:
            if (r5 >= r6) goto L_0x07b1
            r4 = r9[r5]
            java.lang.String r2 = r4.A02
            r1 = r16
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0762
            java.lang.String r2 = r4.A02
            java.lang.String r1 = r4.A03
            r7.put(r2, r1)
        L_0x0762:
            int r5 = r5 + 1
            goto L_0x074d
        L_0x0765:
            com.whatsapp.jid.Jid r7 = r3.A0k
            X.0rv r15 = X.C16030sJ.A00(r7)
            boolean r15 = X.C16030sJ.A0L(r15)
            if (r15 == 0) goto L_0x0774
            r47 = 2
            goto L_0x0722
        L_0x0774:
            X.0rv r7 = X.C16030sJ.A00(r7)
            boolean r7 = X.C16030sJ.A0Q(r7)
            r47 = 1
            if (r7 == 0) goto L_0x0722
            r47 = 4
            goto L_0x0722
        L_0x0783:
            X.AnonymousClass00B.A06(r22)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            int r5 = r4.intValue()
            r4 = 8
            if (r5 == r4) goto L_0x07ad
            r4 = 7
            if (r5 == r4) goto L_0x07ad
            if (r5 == r8) goto L_0x07ad
            java.lang.String r0 = "MessageStanzaHandler/handleStanza unrecognizededit "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r22
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x07ad:
            r3.A01 = r5
            goto L_0x06e0
        L_0x07b1:
            long r4 = java.lang.System.currentTimeMillis()
            long r1 = r3.A0j
            long r4 = r4 - r1
            java.lang.String r1 = "xmpp/reader/read/message "
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            com.whatsapp.jid.Jid r1 = r3.A0k
            X.0rv r1 = X.C16030sJ.A00(r1)
            r9.append(r1)
            java.lang.String r6 = " "
            r9.append(r6)
            java.lang.String r1 = r3.A0o
            r9.append(r1)
            r9.append(r6)
            com.whatsapp.jid.Jid r2 = r3.A08
            X.0rv r1 = X.C16030sJ.A00(r2)
            if (r1 != 0) goto L_0x0810
            java.lang.String r1 = "none"
        L_0x07e0:
            r9.append(r1)
            r9.append(r6)
            r9.append(r4)
            r9.append(r6)
            java.lang.Integer r1 = r3.A0H
            r9.append(r1)
            r9.append(r6)
            int r1 = r3.A01
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2H8 r4 = r8.A01
            X.2eO r2 = new X.2eO
            r2.<init>(r3, r7)
            r1 = 0
            android.os.Message r0 = android.os.Message.obtain(r0, r1, r1, r1, r2)
            r4.AZq(r0)
            return
        L_0x0810:
            X.0rv r1 = X.C16030sJ.A00(r2)
            goto L_0x07e0
        L_0x0815:
            X.1kL r3 = new X.1kL
            r3.<init>()
            r0 = r20
            if (r19 == 0) goto L_0x081f
            r0 = r9
        L_0x081f:
            r3.A01 = r0
            r0 = r18
            r3.A05 = r0
            r0 = r17
            r3.A07 = r0
            r3.A08 = r6
            if (r19 != 0) goto L_0x082f
            r20 = r9
        L_0x082f:
            r0 = r20
            r3.A02 = r0
            java.lang.String r1 = "error"
            java.lang.String r0 = "487"
            r3.A01(r1, r0)
            X.1ci r1 = r3.A00()
            X.2H7 r0 = r2.A05
            r0.A01(r1)
            X.3r4 r1 = new X.3r4
            r1.<init>()
            r0 = r18
            r1.A00 = r0
            r1.A01 = r6
            X.0t9 r0 = r2.A04
            r0.A06(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51482bk.A00(X.1Vv):void");
    }

    public void A02(C30161br r7, C28371Vv r8) {
        C30821d1 r0;
        String A0N = r8.A0N("mediatype", (String) null);
        C30821d1 A002 = C53622g0.A00(r8);
        if (A002.A02 != null || "livelocation".equals(A0N) || !this.A02.A0E(C16620tM.A02, 2187)) {
            if (A002.A00 == 2) {
                r7.A0A = A002;
            } else {
                r7.A09 = A002;
            }
            int A0A2 = r8.A0A("count", 0);
            if (r7.A0J == null || r7.A00() == A0A2) {
                r7.A0J = Integer.valueOf(A0A2);
                String A0N2 = r8.A0N("mediareason", (String) null);
                if (A0N2 != null) {
                    if (A0N2.equals("retry")) {
                        Boolean bool = r7.A0F;
                        if (bool == null || bool.booleanValue()) {
                            r7.A0F = true;
                        } else {
                            throw new AnonymousClass1W9("mediareason retry may not mismatch between two enc nodes in the same message");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("unknown mediareason ");
                        sb.append(A0N2);
                        throw new AnonymousClass1W9(sb.toString());
                    }
                }
                int A0A3 = r8.A0A("duration", -1);
                if (A0A3 >= 0) {
                    r7.A0G = Integer.valueOf(A0A3);
                }
                C30821d1 r1 = r7.A0A;
                if (r1 != null && (r0 = r7.A09) != null && r1.A01 != r0.A01) {
                    throw new AnonymousClass1W9("ciphertext version may not mismatch between two enc nodes in the same message");
                } else if ("hide".equals(r8.A0N("decrypt-fail", (String) null)) || "peer".equals(r7.A0R)) {
                    r7.A00 = 1;
                } else {
                    r7.A00 = 0;
                }
            } else {
                throw new AnonymousClass1W9("retry count may not mismatch between two enc nodes in the same message");
            }
        } else {
            C16300so r3 = this.A01;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A002.A00);
            sb2.append(":");
            int i2 = A002.A01;
            sb2.append(i2);
            r3.AcB("missing-ciphertext", sb2.toString(), true);
            StringBuilder sb3 = new StringBuilder("missing ciphertext ");
            sb3.append(i2);
            throw new AnonymousClass1W9(sb3.toString());
        }
    }
}
