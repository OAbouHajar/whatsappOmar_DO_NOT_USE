package X;

/* renamed from: X.1Sd  reason: invalid class name and case insensitive filesystem */
public class C27541Sd {
    public final C16460t6 A00;
    public final AnonymousClass1T5 A01;
    public final C27631Sn A02;
    public final C27531Sc A03;
    public final AnonymousClass189 A04;
    public final C27591Sj A05;
    public final C14710pd A06;
    public final C209212c A07;
    public final AnonymousClass1T4 A08;
    public final C222517f A09;
    public final C207811o A0A;

    public C27541Sd(C16460t6 r1, AnonymousClass1T5 r2, C27631Sn r3, C27531Sc r4, AnonymousClass189 r5, C27591Sj r6, C14710pd r7, C209212c r8, AnonymousClass1T4 r9, C222517f r10, C207811o r11) {
        this.A06 = r7;
        this.A09 = r10;
        this.A00 = r1;
        this.A02 = r3;
        this.A08 = r9;
        this.A0A = r11;
        this.A03 = r4;
        this.A07 = r8;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:343:0x08e3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x08e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x098e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0993, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0997, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0212, code lost:
        if (r10 == 3) goto L_0x0214;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:302:0x0809, B:325:0x08a4] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:362:0x0931, B:379:0x097f, B:388:0x0992] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x02bf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:289:0x07fd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:294:0x0802 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:299:0x0807 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:388:0x0992 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C16740tZ r93, X.C30161br r94) {
        /*
            r92 = this;
            r0 = r93
            r17 = 0
            r6 = r94
            java.lang.String r2 = r6.A0R
            java.lang.String r1 = "peer"
            boolean r1 = r1.equals(r2)
            r3 = r92
            if (r1 == 0) goto L_0x088b
            X.1T4 r2 = r3.A08
            boolean r1 = r0 instanceof X.C37571pN
            if (r1 == 0) goto L_0x00d5
            X.1pN r0 = (X.C37571pN) r0
            java.lang.String r1 = "PeerMessageHandler/handleKeyShareMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.19W r8 = r2.A04     // Catch:{ 1X9 -> 0x00c0 }
            com.whatsapp.jid.DeviceJid r7 = r0.A19     // Catch:{ 1X9 -> 0x00c0 }
            r11 = 0
            if (r7 == 0) goto L_0x0885
            java.util.HashMap r3 = r0.A12()     // Catch:{ 1X9 -> 0x00c0 }
            java.util.Collection r1 = r3.values()     // Catch:{ 1X9 -> 0x00c0 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ 1X9 -> 0x00c0 }
            r4.<init>(r1)     // Catch:{ 1X9 -> 0x00c0 }
            r1 = r17
            r4.remove(r1)     // Catch:{ 1X9 -> 0x00c0 }
            r8.A09(r4)     // Catch:{ 1X9 -> 0x00c0 }
            java.util.Set r9 = r3.keySet()     // Catch:{ 1X9 -> 0x00c0 }
            java.lang.String r3 = "SyncdKeyManager/handleAppStateSyncKeyShareMessage syncdKeyIds = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1X9 -> 0x00c0 }
            r1.<init>(r3)     // Catch:{ 1X9 -> 0x00c0 }
            r1.append(r9)     // Catch:{ 1X9 -> 0x00c0 }
            java.lang.String r1 = r1.toString()     // Catch:{ 1X9 -> 0x00c0 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1X9 -> 0x00c0 }
            int r3 = r9.size()     // Catch:{ 1X9 -> 0x00c0 }
            int r1 = r4.size()     // Catch:{ 1X9 -> 0x00c0 }
            if (r3 != r1) goto L_0x005b
            r11 = 1
        L_0x005b:
            X.19M r6 = r8.A07     // Catch:{ 1X9 -> 0x00c0 }
            r1 = 39
            java.util.List r1 = r6.A04(r1)     // Catch:{ 1X9 -> 0x00c0 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ 1X9 -> 0x00c0 }
            r5.<init>()     // Catch:{ 1X9 -> 0x00c0 }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ 1X9 -> 0x00c0 }
        L_0x006c:
            boolean r1 = r10.hasNext()     // Catch:{ 1X9 -> 0x00c0 }
            if (r1 == 0) goto L_0x0098
            java.lang.Object r3 = r10.next()     // Catch:{ 1X9 -> 0x00c0 }
            X.1pQ r3 = (X.C37601pQ) r3     // Catch:{ 1X9 -> 0x00c0 }
            if (r11 != 0) goto L_0x0082
            com.whatsapp.jid.DeviceJid r1 = r3.A00     // Catch:{ 1X9 -> 0x00c0 }
            boolean r1 = r7.equals(r1)     // Catch:{ 1X9 -> 0x00c0 }
            if (r1 == 0) goto L_0x006c
        L_0x0082:
            java.util.Set r1 = r3.A00     // Catch:{ 1X9 -> 0x00c0 }
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ 1X9 -> 0x00c0 }
            boolean r1 = r9.equals(r1)     // Catch:{ 1X9 -> 0x00c0 }
            if (r1 == 0) goto L_0x006c
            long r3 = r3.A13     // Catch:{ 1X9 -> 0x00c0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ 1X9 -> 0x00c0 }
            r5.add(r1)     // Catch:{ 1X9 -> 0x00c0 }
            goto L_0x006c
        L_0x0098:
            r6.A06(r5)     // Catch:{ 1X9 -> 0x00c0 }
            boolean r1 = r8.A0B()     // Catch:{ 1X9 -> 0x00c0 }
            if (r1 != 0) goto L_0x00b6
            java.lang.String r1 = "PeerMessageHandler/handleKeyShareMessage trySync"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1X9 -> 0x00c0 }
            X.0sq r5 = r2.A06     // Catch:{ 1X9 -> 0x00c0 }
            X.0xU r4 = r2.A03     // Catch:{ 1X9 -> 0x00c0 }
            r3 = 25
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r1 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10     // Catch:{ 1X9 -> 0x00c0 }
            r1.<init>((java.lang.Object) r4, (int) r3)     // Catch:{ 1X9 -> 0x00c0 }
            r5.Acl(r1)     // Catch:{ 1X9 -> 0x00c0 }
            goto L_0x0885
        L_0x00b6:
            r4 = 30
            X.1X9 r3 = new X.1X9     // Catch:{ 1X9 -> 0x00c0 }
            r1 = r17
            r3.<init>(r4, r1)     // Catch:{ 1X9 -> 0x00c0 }
            throw r3     // Catch:{ 1X9 -> 0x00c0 }
        L_0x00c0:
            r1 = move-exception
            X.0xU r3 = r2.A03     // Catch:{ all -> 0x00ce }
            int r1 = r1.errorCode     // Catch:{ all -> 0x00ce }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00ce }
            r3.A0Q(r1)     // Catch:{ all -> 0x00ce }
            goto L_0x0885
        L_0x00ce:
            r3 = move-exception
            X.17f r1 = r2.A05
            r1.A03(r0)
            throw r3
        L_0x00d5:
            boolean r1 = r0 instanceof X.C37601pQ
            if (r1 == 0) goto L_0x010b
            X.1pQ r0 = (X.C37601pQ) r0
            java.lang.String r1 = "PeerMessageHandler/handleKeyRequestMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.19W r7 = r2.A04
            com.whatsapp.jid.DeviceJid r6 = r0.A19
            r5 = 0
            if (r6 == 0) goto L_0x0105
            java.util.Set r1 = r0.A00
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            java.util.HashMap r4 = r7.A03(r1)
            java.lang.String r3 = "SyncdKeyManager/handleAppStateSyncKeyRequestMessage syncdKeyMap = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r7.A08(r6, r4, r5)
        L_0x0105:
            X.17f r1 = r2.A05
            r1.A03(r0)
            return
        L_0x010b:
            boolean r1 = r0 instanceof X.C37621pS
            if (r1 == 0) goto L_0x0189
            X.1pS r0 = (X.C37621pS) r0
            r1 = 2
            java.lang.Object[] r5 = new java.lang.Object[r1]
            long r3 = r0.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1 = 0
            r5[r1] = r3
            java.util.Set r3 = r0.A01
            r1 = 1
            r5[r1] = r3
            java.lang.String r1 = "PeerMessageHandler/handleFatalExceptionNotificationMessage: time = %s; collectionNames=%s"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0xU r6 = r2.A03
            monitor-enter(r6)
            com.whatsapp.jid.DeviceJid r1 = r0.A19     // Catch:{ all -> 0x0186 }
            if (r1 == 0) goto L_0x016e
            X.0yO r4 = r6.A0c     // Catch:{ all -> 0x0186 }
            byte r1 = r1.device     // Catch:{ all -> 0x0186 }
            X.1WN r5 = r4.A05(r1)     // Catch:{ all -> 0x0186 }
            if (r5 == 0) goto L_0x016e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0186 }
            r4.<init>()     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "sync-manager/handleFatalExceptionOnCompanion companion: "
            r4.append(r1)     // Catch:{ all -> 0x0186 }
            com.whatsapp.jid.DeviceJid r1 = r5.A06     // Catch:{ all -> 0x0186 }
            byte r1 = r1.device     // Catch:{ all -> 0x0186 }
            r4.append(r1)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "; ["
            r4.append(r1)     // Catch:{ all -> 0x0186 }
            X.1p8 r1 = r5.A07     // Catch:{ all -> 0x0186 }
            r4.append(r1)     // Catch:{ all -> 0x0186 }
            r1 = 40
            r4.append(r1)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = r5.A08     // Catch:{ all -> 0x0186 }
            r4.append(r1)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = ")]"
            r4.append(r1)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0186 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0186 }
        L_0x016e:
            X.0so r5 = r6.A06     // Catch:{ all -> 0x0186 }
            java.lang.String r4 = "app-sate-sync-handle-fatal-exception-on-companion"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0186 }
            r1 = 0
            r5.AcB(r4, r3, r1)     // Catch:{ all -> 0x0186 }
            r1 = r17
            r6.A0Q(r1)     // Catch:{ all -> 0x0186 }
            monitor-exit(r6)     // Catch:{ all -> 0x0186 }
            X.17f r1 = r2.A05
            r1.A03(r0)
            return
        L_0x0186:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0186 }
            throw r0
        L_0x0189:
            boolean r1 = r0 instanceof X.C37561pM
            if (r1 == 0) goto L_0x01ef
            X.1pM r0 = (X.C37561pM) r0
            java.lang.String r1 = "PeerMessageHandler/handleInitialSecurityNotificationSettingSyncMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.11V r7 = r2.A02
            java.lang.Object r5 = r7.A04
            monitor-enter(r5)
            X.0sK r1 = r7.A00     // Catch:{ all -> 0x01ec }
            boolean r1 = r1.A0G()     // Catch:{ all -> 0x01ec }
            if (r1 == 0) goto L_0x01e5
            X.11R r8 = r7.A02     // Catch:{ all -> 0x01ec }
            android.content.SharedPreferences r3 = r8.A00()     // Catch:{ all -> 0x01ec }
            java.lang.String r6 = "has_received_security_notification_setting"
            r1 = 0
            boolean r1 = r3.getBoolean(r6, r1)     // Catch:{ all -> 0x01ec }
            if (r1 != 0) goto L_0x01e5
            X.0rz r1 = r7.A03     // Catch:{ all -> 0x01ec }
            boolean r4 = r0.A00     // Catch:{ all -> 0x01ec }
            android.content.SharedPreferences$Editor r3 = r1.A0K()     // Catch:{ all -> 0x01ec }
            java.lang.String r1 = "security_notifications"
            android.content.SharedPreferences$Editor r1 = r3.putBoolean(r1, r4)     // Catch:{ all -> 0x01ec }
            r1.apply()     // Catch:{ all -> 0x01ec }
            android.content.SharedPreferences r1 = r8.A00()     // Catch:{ all -> 0x01ec }
            android.content.SharedPreferences$Editor r3 = r1.edit()     // Catch:{ all -> 0x01ec }
            r1 = 1
            android.content.SharedPreferences$Editor r1 = r3.putBoolean(r6, r1)     // Catch:{ all -> 0x01ec }
            r1.apply()     // Catch:{ all -> 0x01ec }
            X.2dr r4 = r7.A01     // Catch:{ all -> 0x01ec }
            monitor-enter(r4)     // Catch:{ all -> 0x01ec }
            X.2dt r1 = r4.A00     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x01e4
            X.1WD r3 = r1.A00     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01e1 }
            r3.A02(r1)     // Catch:{ all -> 0x01e1 }
            goto L_0x01e4
        L_0x01e1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ec }
            throw r0     // Catch:{ all -> 0x01ec }
        L_0x01e4:
            monitor-exit(r4)     // Catch:{ all -> 0x01ec }
        L_0x01e5:
            monitor-exit(r5)     // Catch:{ all -> 0x01ec }
            X.17f r1 = r2.A05
            r1.A03(r0)
            return
        L_0x01ec:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01ec }
            throw r0
        L_0x01ef:
            boolean r1 = r0 instanceof X.C29871bM
            if (r1 == 0) goto L_0x02e0
            X.1bM r0 = (X.C29871bM) r0
            java.lang.String r1 = "PeerMessageHandler/handleHistorySyncNoticationMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.11U r4 = r2.A01
            X.0sK r1 = r4.A00
            boolean r1 = r1.A0G()
            if (r1 != 0) goto L_0x020a
            java.lang.String r0 = "ReceiveHistorySyncManager/ Received history sync as primary device"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x020a:
            int r10 = r0.A03
            r1 = 2
            r8 = 0
            if (r10 == r1) goto L_0x0214
            r1 = 3
            r7 = 0
            if (r10 != r1) goto L_0x0215
        L_0x0214:
            r7 = 1
        L_0x0215:
            X.1Cd r5 = r4.A02
            int r1 = r0.A01
            long r1 = (long) r1
            X.2du r3 = new X.2du
            r3.<init>()
            java.lang.String r6 = r5.A00()
            r3.A04 = r6
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A02 = r1
            X.0t3 r1 = r5.A03
            long r1 = r1.A00()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A03 = r1
            java.lang.Integer r1 = X.AnonymousClass19E.A01(r10)
            r3.A00 = r1
            java.lang.Integer r1 = X.AnonymousClass19E.A00(r10)
            r3.A01 = r1
            X.0t9 r1 = r5.A06
            r1.A06(r3)
            long r1 = r0.A05
            if (r7 == 0) goto L_0x029f
            int r9 = r0.A00
        L_0x024e:
            byte[] r7 = r0.A0H
            java.lang.String r6 = r0.A0D
            java.lang.String r5 = r0.A0B
            java.lang.String r3 = r0.A0C
            X.1Vw r0 = r0.A11
            java.lang.String r11 = r0.A01
            X.0t3 r0 = r4.A06
            long r23 = r0.A00()
            X.2dg r12 = new X.2dg
            r13 = r17
            r14 = r6
            r15 = r5
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r10
            r20 = r9
            r21 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r23)
            if (r10 != 0) goto L_0x0298
            X.11R r2 = r4.A05
            org.json.JSONObject r0 = r2.A01()
            if (r0 != 0) goto L_0x0298
            org.json.JSONObject r1 = X.AnonymousClass11U.A00(r8, r8)
            android.content.SharedPreferences r0 = r2.A00()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "history_sync_companion_state"
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)
            r0.apply()
        L_0x0298:
            X.1Hw r6 = r4.A09
            X.AnonymousClass00B.A00()
            r5 = 1
            goto L_0x02a1
        L_0x029f:
            r9 = 0
            goto L_0x024e
        L_0x02a1:
            X.19K r0 = r6.A01     // Catch:{ SQLiteConstraintException -> 0x02c0 }
            X.0tf r2 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x02c0 }
            X.1y0 r1 = r6.A02     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = "INSERT INTO history_sync_companion (message_id, sync_type, chunk_order, media_key, media_hash, media_enc_hash, file_size, direct_path, local_path, start_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            X.1ou r0 = r1.A00(r0, r5)     // Catch:{ all -> 0x02bb }
            X.C24941Hw.A00(r0, r12)     // Catch:{ all -> 0x02bb }
            android.database.sqlite.SQLiteStatement r0 = r0.A00     // Catch:{ all -> 0x02bb }
            r0.executeInsert()     // Catch:{ all -> 0x02bb }
            r2.close()     // Catch:{ SQLiteConstraintException -> 0x02c0 }
            goto L_0x02dc
        L_0x02bb:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x02bf }
        L_0x02bf:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x02c0 }
        L_0x02c0:
            r3 = move-exception
            X.1y0 r1 = r6.A02
            java.lang.String r0 = "UPDATE history_sync_companion SET message_id = ?, sync_type = ?, chunk_order = ?, media_key = ?, media_hash = ?, media_enc_hash = ?, file_size = ?, direct_path = ?, local_path = ?, start_time = ?  WHERE message_id = ?"
            X.1ou r2 = r1.A00(r0, r5)
            X.C24941Hw.A00(r2, r12)
            r1 = 11
            java.lang.String r0 = r12.A08
            r2.A02(r1, r0)
            android.database.sqlite.SQLiteStatement r0 = r2.A00
            int r0 = r0.executeUpdateDelete()
            if (r0 == r5) goto L_0x02dc
            throw r3
        L_0x02dc:
            r4.A01()
            return
        L_0x02e0:
            boolean r1 = r0 instanceof X.C37471pD
            if (r1 == 0) goto L_0x0593
            X.1pD r0 = (X.C37471pD) r0
            java.lang.String r1 = "PeerMessageHandler/handleNonMessageDataRequestMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1Ci r1 = r2.A00
            int r4 = r0.A00
            if (r4 != 0) goto L_0x04a8
            X.0pd r5 = r1.A0B
            r4 = 1829(0x725, float:2.563E-42)
            X.0tM r3 = X.C16620tM.A02
            int r4 = r5.A03(r3, r4)
            r3 = 4
            if (r4 < r3) goto L_0x0588
            com.whatsapp.jid.DeviceJid r7 = r0.A19
            X.1Vw r3 = r0.A11
            java.lang.String r6 = r3.A01
            java.util.Set r5 = r0.A01
            java.lang.String r3 = "NonMessageDataRequestManager/handleStickerReUploadRequest handle sticker upload request, id="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r6)
            java.lang.String r3 = "; size="
            r4.append(r3)
            int r3 = r5.size()
            r4.append(r3)
            java.lang.String r3 = "; remoteDeviceJid"
            r4.append(r3)
            r4.append(r7)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x058d
            if (r7 == 0) goto L_0x058d
            X.2dw r10 = new X.2dw
            r10.<init>(r1, r7, r6, r5)
            X.0sq r3 = r1.A0I
            r7 = 0
            X.1WA r9 = new X.1WA
            r9.<init>(r3, r7)
            java.util.Set r3 = r10.A07
            java.util.Iterator r16 = r3.iterator()
        L_0x0346:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x058d
            java.lang.Object r6 = r16.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x0369
            java.lang.String r3 = "NonMessageDataRequestManager/uploadSticker/empty file hash"
            com.whatsapp.util.Log.e((java.lang.String) r3)
        L_0x035d:
            X.1pH r4 = X.C37511pH.A03
            r5 = 0
        L_0x0360:
            com.facebook.redex.RunnableRunnableShape0S1300000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S1300000_I0
            r3.<init>((X.C52522dw) r10, (X.C37511pH) r4, (X.C34151jm) r5, (java.lang.String) r6)
            r9.execute(r3)
            goto L_0x0346
        L_0x0369:
            X.1RM r4 = r1.A0H
            monitor-enter(r4)
            X.03L r3 = r4.A00     // Catch:{ all -> 0x04a5 }
            if (r3 != 0) goto L_0x0371
            goto L_0x0378
        L_0x0371:
            java.lang.Object r5 = r3.A02(r6)     // Catch:{ all -> 0x04a5 }
            X.1jm r5 = (X.C34151jm) r5     // Catch:{ all -> 0x04a5 }
            goto L_0x0379
        L_0x0378:
            r5 = 0
        L_0x0379:
            monitor-exit(r4)
            if (r5 != 0) goto L_0x039a
            X.13k r3 = r1.A0F
            java.util.List r3 = r3.A0C()
            java.util.Iterator r4 = r3.iterator()
        L_0x0386:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x03ff
            java.lang.Object r5 = r4.next()
            X.1jm r5 = (X.C34151jm) r5
            java.lang.String r3 = r5.A0D
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0386
        L_0x039a:
            java.lang.String r4 = "rmr_sticker_upload_job_id_"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            byte[] r3 = r3.getBytes()
            java.util.UUID r3 = java.util.UUID.nameUUIDFromBytes(r3)
            java.lang.String r8 = r3.toString()
            X.1RN r13 = r1.A0D
            X.1OJ r3 = r13.A01
            X.1f1 r12 = r3.A02(r8, r7)
            java.lang.String r11 = "; jobId="
            if (r12 == 0) goto L_0x041a
            r18 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r12.A05
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r3
            int r3 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r3 < 0) goto L_0x03fb
            long r18 = java.lang.System.currentTimeMillis()
            long r3 = r12.A04
            long r18 = r18 - r3
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            int r3 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x041a
            int r4 = r12.A01
            r3 = 15
            if (r4 < r3) goto L_0x041a
            java.lang.String r4 = "NonMessageDataRequestManager/uploadSticker has reached the maximum retry in a day, hash="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r6)
            r3.append(r11)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r3)
        L_0x03fb:
            X.1pH r4 = X.C37511pH.A04
            goto L_0x0360
        L_0x03ff:
            X.1Go r3 = r1.A0G
            X.1jm r5 = r3.A00(r6)
            if (r5 != 0) goto L_0x039a
            java.lang.String r4 = "NonMessageDataRequestManager/uploadSticker not find the sticker. hash="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r3)
            goto L_0x035d
        L_0x041a:
            X.01Z r3 = r1.A02
            java.io.File r12 = r3.A03(r6)
            java.lang.String r4 = "NonMessageDataRequestManager/uploadSticker start upload the sticker, hash="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r6)
            r3.append(r11)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r3 = 32
            byte[] r3 = new byte[r3]
            X.01D r4 = r1.A0J
            java.lang.Object r4 = r4.get()
            java.util.Random r4 = (java.util.Random) r4
            r4.nextBytes(r3)
            r4 = 1
            X.1XJ r14 = new X.1XJ
            r14.<init>(r7, r7, r4)
            X.1XK r22 = X.AnonymousClass1XK.A0S
            android.net.Uri r18 = android.net.Uri.fromFile(r12)
            r28 = 1
            X.0t3 r4 = r1.A06
            long r11 = r4.A00()
            X.1XM r4 = new X.1XM
            r4.<init>(r3, r11)
            r23 = r17
            r25 = 0
            r26 = 0
            r27 = 0
            r20 = r17
            r21 = r14
            r24 = r8
            r19 = r4
            X.1XL r4 = X.AnonymousClass1XL.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.0wL r11 = r1.A0C
            X.1XP r8 = r11.A04(r4, r7)
            java.lang.String r4 = "mms"
            r8.A0U = r4
            X.1f1 r4 = r8.A0J
            X.AnonymousClass00B.A06(r4)
            r13.A00(r4)
            X.2e0 r4 = new X.2e0
            r18 = r4
            r19 = r10
            r20 = r1
            r21 = r8
            r22 = r5
            r23 = r6
            r24 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.1XS r3 = r8.A0A
            r3.A03(r4, r9)
            java.lang.String r3 = "rmr upload sticker"
            r11.A0D(r8, r3)
            goto L_0x0346
        L_0x04a5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x04a8:
            r3 = 1
            if (r4 != r3) goto L_0x04ba
            com.whatsapp.jid.DeviceJid r4 = r0.A19
            X.1Vw r3 = r0.A11
            java.lang.String r5 = r3.A01
            if (r4 != 0) goto L_0x04ca
            java.lang.String r1 = "NonMessageDataRequestManager/handleRecentStickerInitRequest empty jid"
        L_0x04b5:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x058d
        L_0x04ba:
            r3 = 2
            if (r4 != r3) goto L_0x0579
            com.whatsapp.jid.DeviceJid r7 = r0.A19
            X.1Vw r3 = r0.A11
            java.lang.String r6 = r3.A01
            java.util.Set r5 = r0.A01
            if (r7 != 0) goto L_0x053c
            java.lang.String r1 = "NonMessageDataRequestManager/handleLinkPreviewRequest no deviceJid"
            goto L_0x04b5
        L_0x04ca:
            X.0pd r7 = r1.A0B
            r6 = 1829(0x725, float:2.563E-42)
            X.0tM r3 = X.C16620tM.A02
            int r6 = r7.A03(r3, r6)
            r3 = 3
            r7 = 0
            if (r6 < r3) goto L_0x04d9
            r7 = 1
        L_0x04d9:
            java.lang.String r3 = "NonMessageDataRequestManager/handleRecentStickerInitRequest jid="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r4)
            java.lang.String r3 = "; enabled="
            r6.append(r3)
            r6.append(r7)
            java.lang.String r3 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            if (r7 == 0) goto L_0x058d
            X.1Bn r13 = r1.A0E
            X.0sK r3 = r13.A01
            boolean r3 = r3.A0G()
            if (r3 != 0) goto L_0x052f
            X.1bP r3 = X.C29901bP.A0D     // Catch:{ Exception -> 0x0529 }
            X.1Wr r3 = r3.A0U()     // Catch:{ Exception -> 0x0529 }
            X.1bQ r3 = (X.C29911bQ) r3     // Catch:{ Exception -> 0x0529 }
            X.1bR r6 = X.C29921bR.A04     // Catch:{ Exception -> 0x0529 }
            r3.A07(r6)     // Catch:{ Exception -> 0x0529 }
            r13.A04(r3)     // Catch:{ Exception -> 0x0529 }
            r18 = 0
            r19 = 5
            r20 = 100
            r22 = -1
            r28 = 0
            r21 = 0
            r24 = -1
            r26 = -1
            r30 = 0
            r14 = r17
            r15 = r4
            r16 = r3
            r13.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r30)     // Catch:{ Exception -> 0x0529 }
            goto L_0x052f
        L_0x0529:
            r4 = move-exception
            java.lang.String r3 = "history-sync-send-methods/sendNonBlockingDataMessages: error"
            com.whatsapp.util.Log.e(r3, r4)
        L_0x052f:
            X.1RL r1 = r1.A04
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = 1
            r4 = r1
            r4.A00(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x058d
        L_0x053c:
            X.0pd r8 = r1.A0B
            r4 = 2156(0x86c, float:3.021E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r3 = r8.A0E(r3, r4)
            if (r3 != 0) goto L_0x054b
            java.lang.String r1 = "NonMessageDataRequestManager/handleLinkPreviewRequest abprop disabled"
            goto L_0x058a
        L_0x054b:
            java.lang.String r3 = "NonMessageDataRequestManager/handleLinkPreviewRequest size="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r3 = r5.size()
            r4.append(r3)
            java.lang.String r3 = "; jid="
            r4.append(r3)
            r4.append(r7)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.0sq r4 = r1.A0I
            r9 = 6
            com.facebook.redex.RunnableRunnableShape0S1300000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S1300000_I0
            r8 = r3
            r10 = r6
            r11 = r1
            r12 = r5
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r4.Acl(r3)
            goto L_0x058d
        L_0x0579:
            java.lang.String r3 = "NonMessageDataRequestManager/handleNonMessageDataRequestMessage unknown type="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x058a
        L_0x0588:
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestMessage abprop not enabled"
        L_0x058a:
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x058d:
            X.17f r1 = r2.A05
            r1.A03(r0)
            return
        L_0x0593:
            boolean r1 = r0 instanceof X.C37501pG
            if (r1 == 0) goto L_0x087d
            X.1pG r0 = (X.C37501pG) r0
            java.lang.String r1 = "PeerMessageHandler/handleNonMessageDataRequestResponseMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = r0 instanceof X.C37491pF
            if (r1 == 0) goto L_0x0859
            X.1Ci r6 = r2.A00
            r5 = r0
            X.1pF r5 = (X.C37491pF) r5
            X.0pd r4 = r6.A0B
            r3 = 2155(0x86b, float:3.02E-42)
            X.0tM r22 = X.C16620tM.A02
            r1 = r22
            boolean r1 = r4.A0E(r1, r3)
            if (r1 == 0) goto L_0x0872
            X.0t3 r1 = r6.A06
            long r17 = r1.A00()
            java.util.Map r1 = r5.A00
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r21 = r1.iterator()
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
        L_0x05ca:
            boolean r1 = r21.hasNext()
            if (r1 == 0) goto L_0x080d
            java.lang.Object r12 = r21.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r1 = r12.getValue()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r3 = r1.first
            X.1pH r1 = X.C37511pH.A04
            if (r3 != r1) goto L_0x06d9
            int r10 = r10 + 1
            java.lang.Object r1 = r12.getValue()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r14 = r1.second
            X.1pI r14 = (X.C37521pI) r14
            if (r14 != 0) goto L_0x0608
            java.lang.String r3 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage no sticker for successful fileHash="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x05ca
        L_0x0608:
            X.1jm r12 = new X.1jm
            r12.<init>()
            int r4 = r14.A00
            r3 = 1
            r1 = r4 & 1
            if (r1 != r3) goto L_0x0618
            java.lang.String r1 = r14.A0F
            r12.A0G = r1
        L_0x0618:
            r3 = 2
            r1 = r4 & 2
            r15 = 0
            if (r1 != r3) goto L_0x061f
            r15 = 1
        L_0x061f:
            r4 = 2
            if (r15 == 0) goto L_0x062e
            X.1Ww r1 = r14.A08
            byte[] r1 = r1.A04()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            r12.A0D = r1
        L_0x062e:
            int r1 = r14.A00
            r3 = 4
            r1 = r1 & 4
            if (r1 != r3) goto L_0x0641
            X.1Ww r1 = r14.A07
            byte[] r1 = r1.A04()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r4)
            r12.A08 = r1
        L_0x0641:
            int r1 = r14.A00
            r3 = 8
            r1 = r1 & 8
            if (r1 != r3) goto L_0x0656
            X.1Ww r1 = r14.A0A
            byte[] r3 = r1.A04()
            r1 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r3, r1)
            r12.A0B = r1
        L_0x0656:
            int r4 = r14.A00
            r3 = 16
            r1 = r4 & 16
            if (r1 != r3) goto L_0x0662
            java.lang.String r1 = r14.A0E
            r12.A0C = r1
        L_0x0662:
            int r1 = r14.A02
            r12.A02 = r1
            int r1 = r14.A03
            r12.A03 = r1
            r1 = 128(0x80, float:1.794E-43)
            r4 = r4 & r1
            if (r4 != r1) goto L_0x0673
            java.lang.String r1 = r14.A0D
            r12.A06 = r1
        L_0x0673:
            long r3 = r14.A04
            int r1 = (int) r3
            r12.A00 = r1
            java.lang.String r1 = r12.A0D
            X.0xU r3 = r6.A00
            if (r3 == 0) goto L_0x0685
            if (r1 != 0) goto L_0x0691
            java.lang.String r1 = "SyncManager/onReceiveRmrFavoriteResponse receive empty fileHash"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0685:
            X.1RK r1 = r6.A0A
            X.AnonymousClass00B.A00()
            X.19K r1 = r1.A00
            X.0tf r12 = r1.A02()
            goto L_0x06c1
        L_0x0691:
            X.15h r4 = r3.A0T
            java.lang.String r1 = "favoriteSticker"
            java.lang.Object r1 = r4.A02(r1)
            if (r1 == 0) goto L_0x0685
            boolean r1 = r3.A0X()
            if (r1 == 0) goto L_0x0685
            X.0sq r14 = r3.A0n
            r1 = 23
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r4 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r4.<init>(r3, r1, r12)
            java.lang.String r3 = "rmrFavoriteStickerResponse_"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = r12.A0D
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r14.Acm(r4, r1)
            int r9 = r9 + 1
            goto L_0x0685
        L_0x06c1:
            X.0tg r14 = r12.A02     // Catch:{ all -> 0x0808 }
            java.lang.String r4 = "rmr_response_error"
            java.lang.String r3 = "file_key = ?  AND rmr_source =? "
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0808 }
            r1[r11] = r13     // Catch:{ all -> 0x0808 }
            r15 = 1
            java.lang.String r13 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0808 }
            r1[r15] = r13     // Catch:{ all -> 0x0808 }
            r14.A01(r4, r3, r1)     // Catch:{ all -> 0x0808 }
            goto L_0x07c8
        L_0x06d9:
            X.1pH r1 = X.C37511pH.A02
            java.lang.String r4 = "; result="
            if (r3 != r1) goto L_0x07cd
            int r8 = r8 + 1
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage general fail fileHash="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r13)
            r3.append(r4)
            java.lang.Object r1 = r12.getValue()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            com.whatsapp.jid.DeviceJid r1 = r5.A19
            X.1RK r12 = r6.A0A
            if (r1 == 0) goto L_0x0715
            byte r1 = r1.device
        L_0x0704:
            X.28B r14 = new X.28B
            r3 = r17
            r14.<init>(r1, r13, r3)
            X.AnonymousClass00B.A00()
            X.19K r4 = r12.A00
            X.0tf r12 = r4.A02()
            goto L_0x0717
        L_0x0715:
            r1 = 0
            goto L_0x0704
        L_0x0717:
            X.1cj r20 = r12.A00()     // Catch:{ all -> 0x0808 }
            java.lang.String r3 = r14.A04     // Catch:{ all -> 0x0803 }
            int r1 = r14.A02     // Catch:{ all -> 0x0803 }
            r23 = r1
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x0803 }
            X.0tf r1 = r4.get()     // Catch:{ all -> 0x0803 }
            X.0tg r15 = r1.A02     // Catch:{ all -> 0x07fe }
            java.lang.String r13 = "SELECT file_key, rmr_source, failure_count, response_device_id, last_fetch_timestamp FROM rmr_response_error WHERE file_key = ?  AND rmr_source =?  AND response_device_id =? "
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x07fe }
            r4[r11] = r3     // Catch:{ all -> 0x07fe }
            r19 = 1
            java.lang.String r16 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x07fe }
            r4[r19] = r16     // Catch:{ all -> 0x07fe }
            r19 = 2
            java.lang.String r16 = java.lang.String.valueOf(r23)     // Catch:{ all -> 0x07fe }
            r4[r19] = r16     // Catch:{ all -> 0x07fe }
            android.database.Cursor r15 = r15.A08(r13, r4)     // Catch:{ all -> 0x07fe }
            r13 = 0
            if (r15 == 0) goto L_0x0755
            boolean r4 = r15.moveToNext()     // Catch:{ all -> 0x07f9 }
            if (r4 == 0) goto L_0x0752
            X.28B r13 = X.AnonymousClass28B.A00(r15)     // Catch:{ all -> 0x07f9 }
        L_0x0752:
            r15.close()     // Catch:{ all -> 0x07fe }
        L_0x0755:
            r1.close()     // Catch:{ all -> 0x0803 }
            r4 = 1
            if (r13 == 0) goto L_0x075e
            int r1 = r13.A00     // Catch:{ all -> 0x0803 }
            int r4 = r4 + r1
        L_0x075e:
            r14.A00 = r4     // Catch:{ all -> 0x0803 }
            if (r13 == 0) goto L_0x0786
            java.lang.String r4 = r13.A04     // Catch:{ all -> 0x0803 }
            int r1 = r13.A03     // Catch:{ all -> 0x0803 }
            r16 = r1
            int r1 = r13.A02     // Catch:{ all -> 0x0803 }
            X.0tg r15 = r12.A02     // Catch:{ all -> 0x0803 }
            r13 = 3
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ all -> 0x0803 }
            r13[r11] = r4     // Catch:{ all -> 0x0803 }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0803 }
            r4 = 1
            r13[r4] = r16     // Catch:{ all -> 0x0803 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0803 }
            r13[r19] = r1     // Catch:{ all -> 0x0803 }
            java.lang.String r4 = "rmr_response_error"
            java.lang.String r1 = "file_key = ?  AND rmr_source =?  AND response_device_id =? "
            r15.A01(r4, r1, r13)     // Catch:{ all -> 0x0803 }
        L_0x0786:
            r1 = 5
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x0803 }
            r13.<init>(r1)     // Catch:{ all -> 0x0803 }
            java.lang.String r1 = "file_key"
            r13.put(r1, r3)     // Catch:{ all -> 0x0803 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0803 }
            java.lang.String r1 = "rmr_source"
            r13.put(r1, r3)     // Catch:{ all -> 0x0803 }
            int r1 = r14.A00     // Catch:{ all -> 0x0803 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0803 }
            java.lang.String r1 = "failure_count"
            r13.put(r1, r3)     // Catch:{ all -> 0x0803 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0803 }
            java.lang.String r1 = "response_device_id"
            r13.put(r1, r3)     // Catch:{ all -> 0x0803 }
            long r3 = r14.A01     // Catch:{ all -> 0x0803 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0803 }
            java.lang.String r1 = "last_fetch_timestamp"
            r13.put(r1, r3)     // Catch:{ all -> 0x0803 }
            X.0tg r3 = r12.A02     // Catch:{ all -> 0x0803 }
            java.lang.String r1 = "rmr_response_error"
            r3.A02(r13, r1)     // Catch:{ all -> 0x0803 }
            r20.A00()     // Catch:{ all -> 0x0803 }
            r20.close()     // Catch:{ all -> 0x0808 }
        L_0x07c8:
            r12.close()
            goto L_0x05ca
        L_0x07cd:
            int r7 = r7 + 1
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage non-retry fail fileHash="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r13)
            r3.append(r4)
            java.lang.Object r1 = r12.getValue()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            com.whatsapp.jid.DeviceJid r1 = r5.A19
            X.1RK r3 = r6.A0A
            if (r1 == 0) goto L_0x07f7
            byte r1 = r1.device
        L_0x07f2:
            r3.A00(r11, r13, r1)
            goto L_0x05ca
        L_0x07f7:
            r1 = 0
            goto L_0x07f2
        L_0x07f9:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x07fd }
        L_0x07fd:
            throw r0     // Catch:{ all -> 0x07fe }
        L_0x07fe:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0802 }
        L_0x0802:
            throw r0     // Catch:{ all -> 0x0803 }
        L_0x0803:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x0807 }
        L_0x0807:
            throw r0     // Catch:{ all -> 0x0808 }
        L_0x0808:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0997 }
            throw r0
        L_0x080d:
            X.1RL r6 = r6.A04
            java.util.Map r1 = r5.A00
            int r4 = r1.size()
            java.lang.String r5 = r5.A00
            X.0pd r12 = r6.A00
            r3 = 2573(0xa0d, float:3.606E-42)
            r1 = r22
            boolean r1 = r12.A0E(r1, r3)
            if (r1 == 0) goto L_0x0877
            X.2e8 r1 = new X.2e8
            r1.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r1.A00 = r3
            long r3 = (long) r4
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.A03 = r3
            long r3 = (long) r10
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.A05 = r3
            long r3 = (long) r9
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.A04 = r3
            long r3 = (long) r8
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.A01 = r3
            long r3 = (long) r7
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.A02 = r3
            r1.A06 = r5
            X.0t9 r3 = r6.A01
            r3.A06(r1)
            goto L_0x0877
        L_0x0859:
            java.lang.String r1 = "PeerMessageHandler/handleNonMessageDataRequestResponseMessage unexpected type="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            boolean r1 = r0 instanceof X.C37531pJ
            if (r1 == 0) goto L_0x0870
            r1 = -1
        L_0x0865:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0877
        L_0x0870:
            r1 = 2
            goto L_0x0865
        L_0x0872:
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage not enabled"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0877:
            X.17f r1 = r2.A05
            r1.A03(r0)
            return
        L_0x087d:
            if (r93 == 0) goto L_0x088a
            X.17f r1 = r2.A05
            r1.A03(r0)
            return
        L_0x0885:
            X.17f r1 = r2.A05
            r1.A03(r0)
        L_0x088a:
            return
        L_0x088b:
            X.11o r5 = r3.A0A
            long r1 = r6.A06
            r4 = 0
            X.1d2 r2 = r5.A00(r4, r1)
            if (r2 == 0) goto L_0x089a
            r1 = 4
            r2.A00(r1)
        L_0x089a:
            if (r93 != 0) goto L_0x08e8
            X.1T5 r2 = r3.A01
            X.0tq r0 = r2.A01
            X.0tf r7 = r0.A02()
            X.0t6 r5 = r2.A00     // Catch:{ all -> 0x08e3 }
            X.1Vw r1 = r6.A0C     // Catch:{ all -> 0x08e3 }
            if (r1 != 0) goto L_0x08ac
            X.1Vw r1 = r6.A0m     // Catch:{ all -> 0x08e3 }
        L_0x08ac:
            X.0th r0 = r5.A0K     // Catch:{ all -> 0x08e3 }
            X.0tZ r0 = r0.A03(r1)     // Catch:{ all -> 0x08e3 }
            if (r0 == 0) goto L_0x08be
            boolean r0 = r6.A0f     // Catch:{ all -> 0x08e3 }
            if (r0 != 0) goto L_0x08df
            X.17f r0 = r2.A02     // Catch:{ all -> 0x08e3 }
            r0.A07(r6)     // Catch:{ all -> 0x08e3 }
            goto L_0x08df
        L_0x08be:
            X.17g r4 = r2.A03     // Catch:{ all -> 0x08e3 }
            X.1Vw r3 = r6.A0C     // Catch:{ all -> 0x08e3 }
            if (r3 != 0) goto L_0x08c6
            X.1Vw r3 = r6.A0m     // Catch:{ all -> 0x08e3 }
        L_0x08c6:
            long r1 = r6.A0j     // Catch:{ all -> 0x08e3 }
            r0 = 11
            X.0tZ r2 = r4.A01(r3, r0, r1)     // Catch:{ all -> 0x08e3 }
            r6.A03(r2)     // Catch:{ all -> 0x08e3 }
            boolean r0 = r2 instanceof X.C38781rP     // Catch:{ all -> 0x08e3 }
            if (r0 == 0) goto L_0x08dc
            r1 = r2
            X.1rP r1 = (X.C38781rP) r1     // Catch:{ all -> 0x08e3 }
            int r0 = r6.A04     // Catch:{ all -> 0x08e3 }
            r1.A00 = r0     // Catch:{ all -> 0x08e3 }
        L_0x08dc:
            r5.A0u(r2)     // Catch:{ all -> 0x08e3 }
        L_0x08df:
            r7.close()
            return
        L_0x08e3:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0997 }
            throw r0
        L_0x08e8:
            boolean r1 = X.C38621r6.A0o(r0)
            if (r1 == 0) goto L_0x08fa
            X.1Sn r2 = r3.A02
            X.AnonymousClass00B.A06(r0)
            X.1rU r0 = (X.C38831rU) r0
            r1 = 1
            r2.A03(r0, r1)
            return
        L_0x08fa:
            boolean r1 = r0 instanceof X.C38971ri
            if (r1 == 0) goto L_0x0936
            X.189 r7 = r3.A04
            r5 = r0
            X.1ri r5 = (X.C38971ri) r5
            X.10R r8 = r7.A01
            int r1 = r5.A00
            boolean r1 = r8.A01(r1)
            if (r1 == 0) goto L_0x0cf2
            X.0rx r2 = r7.A01(r5)
            if (r2 == 0) goto L_0x0936
            X.1WV r10 = r2.A0X
            X.1Vw r1 = r5.A11
            X.0rv r9 = r1.A00
            long r13 = r5.A0I
            int r12 = r5.A00
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            boolean r1 = r8.A03(r9, r10, r11, r12, r13)
            if (r1 != 0) goto L_0x0936
            int r1 = r5.A0B
            if (r1 != 0) goto L_0x0936
            X.0tq r1 = r7.A04
            X.0tf r4 = r1.A02()
            X.1cj r1 = r4.A00()     // Catch:{ all -> 0x0993 }
            goto L_0x0983
        L_0x0936:
            X.0pd r4 = r3.A06
            r2 = 2714(0xa9a, float:3.803E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r2 = r4.A0E(r1, r2)
            if (r2 == 0) goto L_0x0998
            boolean r2 = r0 instanceof X.C39231s8
            if (r2 == 0) goto L_0x0998
            X.189 r8 = r3.A04
            r7 = r0
            X.1s8 r7 = (X.C39231s8) r7
            X.10R r9 = r8.A01
            int r2 = r7.A00
            boolean r2 = r9.A01(r2)
            if (r2 == 0) goto L_0x0cf2
            X.0rx r2 = r8.A01(r7)
            if (r2 == 0) goto L_0x0998
            X.1WV r11 = r2.A0X
            X.1Vw r4 = r7.A11
            X.0rv r10 = r4.A00
            long r14 = r7.A0I
            int r13 = r7.A00
            long r4 = r7.A01
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            boolean r4 = r9.A03(r10, r11, r12, r13, r14)
            if (r4 != 0) goto L_0x0998
            int r4 = r7.A0B
            if (r4 != 0) goto L_0x0998
            X.0tq r1 = r8.A04
            X.0tf r4 = r1.A02()
            X.1cj r1 = r4.A00()     // Catch:{ all -> 0x0993 }
            r8.A05(r2, r7)     // Catch:{ all -> 0x098e }
            goto L_0x0986
        L_0x0983:
            r7.A04(r2, r5)     // Catch:{ all -> 0x098e }
        L_0x0986:
            r1.A00()     // Catch:{ all -> 0x098e }
            r1.close()     // Catch:{ all -> 0x0993 }
            goto L_0x0cef
        L_0x098e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0992 }
        L_0x0992:
            throw r0     // Catch:{ all -> 0x0993 }
        L_0x0993:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0997 }
        L_0x0997:
            throw r0
        L_0x0998:
            boolean r2 = r0 instanceof X.C38541qx
            if (r2 == 0) goto L_0x09ad
            X.1Sj r4 = r3.A05
            X.126 r3 = r4.A04
            r2 = 8
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r1 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r1.<init>(r4, r2, r0)
            r0 = 52
            r3.A01(r1, r0)
            return
        L_0x09ad:
            boolean r2 = r0 instanceof X.C39201s5
            if (r2 == 0) goto L_0x0cce
            X.1s5 r0 = (X.C39201s5) r0
            java.lang.String r5 = r0.A03
            java.lang.String r4 = r0.A01
            java.lang.String r9 = r0.A02
            long r7 = r0.A00
            r18 = r7
            if (r5 == 0) goto L_0x0a46
            if (r4 == 0) goto L_0x0a46
            if (r9 == 0) goto L_0x0a46
            X.12c r0 = r3.A07
            X.0pd r8 = r0.A0M
            X.0tM r7 = X.C16620tM.A01
            r2 = 1539(0x603, float:2.157E-42)
            boolean r2 = r8.A0E(r7, r2)
            if (r2 == 0) goto L_0x0aa0
            X.0xf r7 = r0.A0f
            java.lang.Object r11 = r7.A0H
            monitor-enter(r11)
            android.net.Uri r13 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0a43 }
            java.lang.String r12 = r13.getHost()     // Catch:{ all -> 0x0a43 }
            X.1qE r2 = r7.A00     // Catch:{ all -> 0x0a43 }
            r10 = 0
            if (r2 == 0) goto L_0x0a3d
            java.lang.String r2 = r13.getHost()     // Catch:{ all -> 0x0a43 }
            if (r2 == 0) goto L_0x0a3d
            X.1qE r2 = r7.A00     // Catch:{ all -> 0x0a43 }
            java.util.List r2 = r2.A0A     // Catch:{ all -> 0x0a43 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ all -> 0x0a43 }
        L_0x09f1:
            boolean r2 = r16.hasNext()     // Catch:{ all -> 0x0a43 }
            if (r2 == 0) goto L_0x0a3d
            java.lang.Object r13 = r16.next()     // Catch:{ all -> 0x0a43 }
            X.1qQ r13 = (X.C38211qQ) r13     // Catch:{ all -> 0x0a43 }
            java.lang.String r14 = r13.A04     // Catch:{ all -> 0x0a43 }
            boolean r2 = r12.equals(r14)     // Catch:{ all -> 0x0a43 }
            if (r2 != 0) goto L_0x0a3b
            java.lang.String r13 = r13.A00     // Catch:{ all -> 0x0a43 }
            boolean r2 = r12.equals(r13)     // Catch:{ all -> 0x0a43 }
            if (r2 != 0) goto L_0x0a3b
            X.0pd r15 = r7.A09     // Catch:{ all -> 0x0a43 }
            r2 = 2397(0x95d, float:3.359E-42)
            boolean r2 = r15.A0E(r1, r2)     // Catch:{ all -> 0x0a43 }
            if (r2 == 0) goto L_0x09f1
            if (r14 == 0) goto L_0x0a29
            java.lang.String r2 = "^media-([a-zA-Z]{3})([0-9]*-[0-9]*)\\.cdn.whatsapp.net$"
            boolean r2 = r14.matches(r2)     // Catch:{ all -> 0x0a43 }
            if (r2 == 0) goto L_0x0a29
            r2 = 9
            boolean r2 = r12.regionMatches(r10, r14, r10, r2)     // Catch:{ all -> 0x0a43 }
            if (r2 != 0) goto L_0x0a3b
        L_0x0a29:
            if (r13 == 0) goto L_0x09f1
            java.lang.String r2 = "^media-([a-zA-Z]{3})([0-9]*-[0-9]*)\\.cdn.whatsapp.net$"
            boolean r2 = r13.matches(r2)     // Catch:{ all -> 0x0a43 }
            if (r2 == 0) goto L_0x09f1
            r2 = 9
            boolean r2 = r12.regionMatches(r10, r13, r10, r2)     // Catch:{ all -> 0x0a43 }
            if (r2 == 0) goto L_0x09f1
        L_0x0a3b:
            monitor-exit(r11)     // Catch:{ all -> 0x0a43 }
            goto L_0x0a4c
        L_0x0a3d:
            monitor-exit(r11)     // Catch:{ all -> 0x0a43 }
            X.0w1 r5 = r0.A07
            r0 = 23
            goto L_0x0a79
        L_0x0a43:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0a43 }
            throw r0
        L_0x0a46:
            java.lang.String r0 = "DecryptMessageHandler/handleMediaNotifyMessage wrong data in medianotify message"
        L_0x0a48:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0aa0
        L_0x0a4c:
            java.lang.String r2 = "/express/document/"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0c85
            X.1XK r2 = X.AnonymousClass1XK.A08
        L_0x0a56:
            X.14u r10 = r0.A0V
            r40 = r10
            r53 = 1
            r50 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r48 = r10
            r49 = r2
            r51 = r18
            boolean r10 = r48.A02(r49, r50, r51, r53, r54, r55, r56)
            if (r10 != 0) goto L_0x0ab0
            java.lang.String r2 = "mediadownloadmanager/queueexpresspathdownload auto download not enabled, ignore ep download  "
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0w1 r5 = r0.A07
            r0 = 24
        L_0x0a79:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.2e9 r4 = new X.2e9
            r4.<init>()
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0D = r0
            r4.A0G = r2
            X.AnonymousClass00B.A06(r0)
            X.AnonymousClass00B.A06(r2)
            X.0t9 r2 = r5.A0C
            r0 = 2810(0xafa, float:3.938E-42)
            boolean r0 = r8.A0E(r1, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0aaa
            r2.A06(r4)
        L_0x0aa0:
            X.17f r2 = r3.A09
            java.lang.String r1 = "medianotify"
            r0 = r17
            r2.A08(r6, r1, r0)
            return
        L_0x0aaa:
            X.00F r0 = X.C52622eA.A00
            r2.A0A(r4, r0)
            goto L_0x0aa0
        L_0x0ab0:
            java.util.HashMap r10 = r0.A0s
            monitor-enter(r10)
            boolean r1 = r10.containsKey(r9)     // Catch:{ all -> 0x0ccb }
            if (r1 == 0) goto L_0x0ad3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ccb }
            r1.<init>()     // Catch:{ all -> 0x0ccb }
            java.lang.String r0 = "MediaDownloadManager/isExpressPathDownloadDuplicated Existing regular download job "
            r1.append(r0)     // Catch:{ all -> 0x0ccb }
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x0ccb }
            r1.append(r0)     // Catch:{ all -> 0x0ccb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ccb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0ccb }
            monitor-exit(r10)     // Catch:{ all -> 0x0ccb }
            goto L_0x0aa0
        L_0x0ad3:
            monitor-exit(r10)     // Catch:{ all -> 0x0ccb }
            java.util.HashMap r1 = r0.A0t
            monitor-enter(r1)
            boolean r10 = r1.containsKey(r4)     // Catch:{ all -> 0x0cc8 }
            if (r10 == 0) goto L_0x0af7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cc8 }
            r2.<init>()     // Catch:{ all -> 0x0cc8 }
            java.lang.String r0 = "MediaDownloadManager/isExpressPathDownloadDuplicated Existing express path download job "
            r2.append(r0)     // Catch:{ all -> 0x0cc8 }
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x0cc8 }
            r2.append(r0)     // Catch:{ all -> 0x0cc8 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0cc8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cc8 }
            monitor-exit(r1)     // Catch:{ all -> 0x0cc8 }
            goto L_0x0aa0
        L_0x0af7:
            monitor-exit(r1)     // Catch:{ all -> 0x0cc8 }
            X.0sb r10 = r0.A04
            r91 = r10
            java.lang.String r65 = "application/octet-stream"
            X.1XK r10 = X.AnonymousClass1XK.A08
            r74 = 8
            if (r2 == r10) goto L_0x0b0a
            X.1XK r10 = X.AnonymousClass1XK.A0X
            if (r2 != r10) goto L_0x0c1d
            r74 = 3
        L_0x0b0a:
            r15 = 0
            r16 = 0
            r10 = r91
            r11 = r2
            r12 = r4
            r13 = r9
            r14 = r5
            java.io.File r59 = r10.A0D(r11, r12, r13, r14, r15, r16)
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r63 = r10.toString()
            r79 = 0
            r73 = 2
            r76 = 3
            X.1qT r41 = new X.1qT
            r57 = r17
            r58 = r17
            r62 = r17
            r66 = r17
            r67 = r17
            r68 = r17
            r69 = r17
            r70 = r17
            r71 = 0
            r72 = 0
            r75 = 1
            r81 = 0
            r82 = 0
            r83 = 0
            r84 = 0
            r85 = 0
            r86 = 0
            r87 = 0
            r88 = 0
            r89 = 0
            r90 = 0
            r54 = r41
            r55 = r17
            r56 = r2
            r60 = r5
            r61 = r9
            r64 = r4
            r77 = r18
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90)
            X.0t3 r2 = r0.A0E
            r65 = r2
            com.whatsapp.Mp4Ops r2 = r0.A08
            r64 = r2
            X.0pt r2 = r0.A05
            r63 = r2
            X.0tz r2 = r0.A0F
            r62 = r2
            X.0so r2 = r0.A03
            r61 = r2
            X.0sq r9 = r0.A0n
            X.0ua r2 = r0.A0B
            r60 = r2
            X.10M r2 = r0.A02
            r59 = r2
            X.0s5 r2 = r0.A0A
            r58 = r2
            X.1QZ r2 = r0.A0p
            r29 = r2
            X.0wK r2 = r0.A0P
            r28 = r2
            X.0pf r2 = r0.A0G
            r27 = r2
            X.0xJ r2 = r0.A0j
            r26 = r2
            X.0w1 r2 = r0.A07
            r25 = r2
            X.1QT r2 = r0.A0a
            r24 = r2
            X.0xK r2 = r0.A0m
            r23 = r2
            X.0xL r2 = r0.A0i
            r22 = r2
            X.12P r2 = r0.A0q
            r21 = r2
            X.14n r2 = r0.A0R
            r20 = r2
            X.0sf r2 = r0.A0h
            r19 = r2
            X.0t8 r2 = r0.A0I
            r18 = r2
            X.1OJ r2 = r0.A0U
            r16 = r2
            X.14r r15 = r0.A0S
            X.14p r14 = r0.A0l
            X.0vT r13 = r0.A0O
            X.0zs r12 = r0.A0N
            X.0u3 r11 = r0.A0c
            android.os.ConditionVariable r10 = r0.A01
            X.0zY r5 = r0.A0T
            r55 = -1
            X.1co r2 = new X.1co
            r54 = 1
            r57 = 1
            r30 = r27
            r31 = r18
            r32 = r8
            r33 = r12
            r34 = r13
            r35 = r28
            r36 = r20
            r37 = r15
            r38 = r5
            r39 = r16
            r42 = r24
            r43 = r11
            r44 = r7
            r45 = r19
            r46 = r22
            r47 = r26
            r48 = r14
            r49 = r23
            r50 = r9
            r51 = r29
            r52 = r21
            r18 = r2
            r19 = r10
            r20 = r59
            r21 = r61
            r22 = r91
            r23 = r63
            r24 = r25
            r25 = r64
            r26 = r58
            r27 = r60
            r28 = r65
            r29 = r62
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r57)
            X.2eB r5 = new X.2eB
            r5.<init>(r2, r0, r4)
            r2.A4Z(r5)
            monitor-enter(r1)
            goto L_0x0c3d
        L_0x0c1d:
            X.1XK r10 = X.AnonymousClass1XK.A0B
            if (r2 != r10) goto L_0x0c25
            r74 = 2
            goto L_0x0b0a
        L_0x0c25:
            X.1XK r10 = X.AnonymousClass1XK.A05
            if (r2 != r10) goto L_0x0c2d
            r74 = 4
            goto L_0x0b0a
        L_0x0c2d:
            X.1XK r10 = X.AnonymousClass1XK.A04
            if (r2 != r10) goto L_0x0c35
            r74 = 11
            goto L_0x0b0a
        L_0x0c35:
            X.1XK r10 = X.AnonymousClass1XK.A0S
            if (r2 != r10) goto L_0x0b0a
            r74 = 16
            goto L_0x0b0a
        L_0x0c3d:
            boolean r0 = r1.containsKey(r4)     // Catch:{ all -> 0x0cc5 }
            if (r0 != 0) goto L_0x0c68
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cc5 }
            r5.<init>()     // Catch:{ all -> 0x0cc5 }
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload enqueue media job: "
            r5.append(r0)     // Catch:{ all -> 0x0cc5 }
            r5.append(r2)     // Catch:{ all -> 0x0cc5 }
            java.lang.String r0 = " enc hash: "
            r5.append(r0)     // Catch:{ all -> 0x0cc5 }
            r5.append(r4)     // Catch:{ all -> 0x0cc5 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0cc5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cc5 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0cc5 }
            r9.Acl(r2)     // Catch:{ all -> 0x0cc5 }
        L_0x0c65:
            monitor-exit(r1)     // Catch:{ all -> 0x0cc5 }
            goto L_0x0aa0
        L_0x0c68:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cc5 }
            r5.<init>()     // Catch:{ all -> 0x0cc5 }
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload media job: "
            r5.append(r0)     // Catch:{ all -> 0x0cc5 }
            r5.append(r2)     // Catch:{ all -> 0x0cc5 }
            java.lang.String r0 = " already exists enc hash: "
            r5.append(r0)     // Catch:{ all -> 0x0cc5 }
            r5.append(r4)     // Catch:{ all -> 0x0cc5 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0cc5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cc5 }
            goto L_0x0c65
        L_0x0c85:
            java.lang.String r2 = "/express/image/"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0c91
            X.1XK r2 = X.AnonymousClass1XK.A0B
            goto L_0x0a56
        L_0x0c91:
            java.lang.String r2 = "/express/video/"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0c9d
            X.1XK r2 = X.AnonymousClass1XK.A0X
            goto L_0x0a56
        L_0x0c9d:
            java.lang.String r2 = "/express/audio/"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0ca9
            X.1XK r2 = X.AnonymousClass1XK.A05
            goto L_0x0a56
        L_0x0ca9:
            java.lang.String r2 = "/express/gif/"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0cb5
            X.1XK r2 = X.AnonymousClass1XK.A04
            goto L_0x0a56
        L_0x0cb5:
            java.lang.String r2 = "/express/sticker/"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0cc1
            X.1XK r2 = X.AnonymousClass1XK.A0S
            goto L_0x0a56
        L_0x0cc1:
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload invalid expressPathUrl stop"
            goto L_0x0a48
        L_0x0cc5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0cc5 }
            throw r0
        L_0x0cc8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0cc8 }
            throw r0
        L_0x0ccb:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0ccb }
            throw r0
        L_0x0cce:
            r1 = 131072(0x20000, float:1.83671E-40)
            boolean r1 = r0.A10(r1)
            if (r1 == 0) goto L_0x0cf8
            X.1Sc r5 = r3.A03
            r4 = 0
            r5.A01(r0, r4)     // Catch:{ IllegalArgumentException -> 0x0cdd }
            goto L_0x0cec
        L_0x0cdd:
            r2 = move-exception
            java.lang.String r1 = "EditMessageManager/handleIncomingEditedMessage"
            com.whatsapp.util.Log.e(r1, r2)
            X.0so r3 = r5.A00
            java.lang.String r2 = "EditMessageManager/handleIncomingEditedMessage/invalidMessage"
            r1 = r17
            r3.AcB(r2, r1, r4)
        L_0x0cec:
            X.17f r1 = r5.A0J
            goto L_0x0cf4
        L_0x0cef:
            r4.close()
        L_0x0cf2:
            X.17f r1 = r3.A09
        L_0x0cf4:
            r1.A03(r0)
            return
        L_0x0cf8:
            X.0t6 r1 = r3.A00
            r1.A0u(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27541Sd.A00(X.0tZ, X.1br):void");
    }
}
