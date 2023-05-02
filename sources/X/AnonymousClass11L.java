package X;

import com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob;

/* renamed from: X.11L  reason: invalid class name */
public class AnonymousClass11L {
    public final C19000xb A00;
    public final C16000sG A01;
    public final C19230xz A02;
    public final AnonymousClass11F A03;
    public final C18910xS A04;
    public final AnonymousClass11K A05;
    public final C18370wa A06;
    public final AnonymousClass11H A07;
    public final AnonymousClass11J A08;
    public final C16070sO A09;
    public final C16250si A0A;
    public final C18590ww A0B;
    public final C19650ym A0C;
    public final AnonymousClass11I A0D;
    public final AnonymousClass11G A0E;
    public final C19020xd A0F;
    public final C17240ul A0G;
    public final C18500wn A0H;
    public final C19450yS A0I;

    public AnonymousClass11L(C19000xb r2, C16000sG r3, C19230xz r4, AnonymousClass11F r5, C18910xS r6, AnonymousClass11K r7, C18370wa r8, AnonymousClass11H r9, AnonymousClass11J r10, C16070sO r11, C16250si r12, C18590ww r13, C19650ym r14, AnonymousClass11I r15, AnonymousClass11G r16, C19020xd r17, C17240ul r18, C18500wn r19, C19450yS r20) {
        this.A04 = r6;
        this.A0E = r16;
        this.A00 = r2;
        this.A0F = r17;
        this.A01 = r3;
        this.A07 = r9;
        this.A0G = r18;
        this.A0D = r15;
        this.A02 = r4;
        this.A0A = r12;
        this.A0H = r19;
        this.A08 = r10;
        this.A0I = r20;
        this.A03 = r5;
        this.A05 = r7;
        this.A09 = r11;
        this.A0B = r13;
        this.A0C = r14;
        this.A06 = r8;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0292 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x0297 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x029c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x02a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x02ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x02b0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x02b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00dc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00e1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0184 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x0189 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r31 = this;
            r2 = r31
            X.0xS r1 = r2.A04
            r0 = 0
            r1.A07(r0)
            X.0xd r9 = r2.A0F
            X.0tq r0 = r9.A02
            X.0tf r8 = r0.A02()
            X.1cj r7 = r8.A00()     // Catch:{ all -> 0x02b6 }
            X.19O r4 = r9.A03     // Catch:{ all -> 0x02b1 }
            X.0tq r0 = r4.A01     // Catch:{ all -> 0x02b1 }
            X.0tf r6 = r0.A02()     // Catch:{ all -> 0x02b1 }
            X.1cj r5 = r6.A00()     // Catch:{ all -> 0x02ac }
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x02a7 }
            java.lang.String r1 = "user_device_info"
            r0 = 0
            r3.A01(r1, r0, r0)     // Catch:{ all -> 0x02a7 }
            r5.A00()     // Catch:{ all -> 0x02a7 }
            r1 = 43
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x02a7 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x02a7 }
            r6.A03(r0)     // Catch:{ all -> 0x02a7 }
            r5.close()     // Catch:{ all -> 0x02ac }
            r6.close()     // Catch:{ all -> 0x02b1 }
            X.19P r4 = r9.A05     // Catch:{ all -> 0x02b1 }
            X.0tq r0 = r4.A01     // Catch:{ all -> 0x02b1 }
            X.0tf r6 = r0.A02()     // Catch:{ all -> 0x02b1 }
            X.1cj r5 = r6.A00()     // Catch:{ all -> 0x02ac }
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x02a7 }
            java.lang.String r1 = "user_device"
            r0 = 0
            r3.A01(r1, r0, r0)     // Catch:{ all -> 0x02a7 }
            r5.A00()     // Catch:{ all -> 0x02a7 }
            r1 = 49
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x02a7 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x02a7 }
            r6.A03(r0)     // Catch:{ all -> 0x02a7 }
            r5.close()     // Catch:{ all -> 0x02ac }
            r6.close()     // Catch:{ all -> 0x02b1 }
            r7.A00()     // Catch:{ all -> 0x02b1 }
            r7.close()     // Catch:{ all -> 0x02b6 }
            r8.close()
            X.0ym r0 = r2.A0C
            r0.A01()
            X.11F r1 = r2.A03
            java.lang.String r0 = "BroadcastListChatStore/getBroadcastLists"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.0tq r0 = r1.A00     // Catch:{ SQLiteDiskIOException -> 0x00e2 }
            X.0tf r9 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x00e2 }
            X.0tg r3 = r9.A02     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "SELECT raw_string_jid, subject, created_timestamp FROM chat_view WHERE raw_string_jid LIKE '%@broadcast' AND (chat_view.hidden IS NULL OR hidden=0)"
            r0 = 0
            android.database.Cursor r10 = r3.A08(r1, r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "raw_string_jid"
            int r11 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "subject"
            int r8 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "created_timestamp"
            int r7 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d6 }
        L_0x00a0:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = r10.getString(r11)     // Catch:{ all -> 0x00d6 }
            X.1kx r5 = X.C34841kx.A03(r0)     // Catch:{ all -> 0x00d6 }
            if (r5 != 0) goto L_0x00b6
            java.lang.String r0 = "BroadcastListChatStore/getBroadcastLists/jid is null or invalid!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x00a0
        L_0x00b6:
            java.lang.String r1 = r10.getString(r8)     // Catch:{ all -> 0x00d6 }
            r3 = 0
            boolean r0 = r10.isNull(r7)     // Catch:{ all -> 0x00d6 }
            if (r0 != 0) goto L_0x00c6
            long r3 = r10.getLong(r7)     // Catch:{ all -> 0x00d6 }
        L_0x00c6:
            X.2bT r0 = new X.2bT     // Catch:{ all -> 0x00d6 }
            r0.<init>(r5, r1, r3)     // Catch:{ all -> 0x00d6 }
            r6.add(r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x00a0
        L_0x00cf:
            r10.close()     // Catch:{ all -> 0x00dd }
            r9.close()     // Catch:{ SQLiteDiskIOException -> 0x00e2 }
            goto L_0x00e8
        L_0x00d6:
            r0 = move-exception
            if (r10 == 0) goto L_0x00dc
            r10.close()     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x00e2 }
        L_0x00e2:
            r1 = move-exception
            java.lang.String r0 = "BroadcastListChatStore/getBroadcastLists/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e8:
            X.0sG r15 = r2.A01
            java.lang.String r14 = "contactmanager/populateNamesFromBroadcasts"
            com.whatsapp.util.Log.i((java.lang.String) r14)
            java.util.Iterator r5 = r6.iterator()
        L_0x00f3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r5.next()
            X.2bT r0 = (X.C51342bT) r0
            X.1kx r4 = r0.A01
            java.lang.String r3 = r0.A02
            long r0 = r0.A00
            r15.A06(r4, r3, r0)
            goto L_0x00f3
        L_0x0109:
            X.11H r1 = r2.A07
            java.lang.String r0 = "msgstore/getPersistedGroupInfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.0tq r0 = r1.A05     // Catch:{ SQLiteDiskIOException -> 0x018a }
            X.0tf r9 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x018a }
            X.0tg r3 = r9.A02     // Catch:{ all -> 0x0185 }
            java.lang.String r1 = "SELECT raw_string_jid, subject, created_timestamp, ephemeral_expiration FROM chat_view WHERE raw_string_jid LIKE '%@g.us' AND (chat_view.hidden IS NULL OR chat_view.hidden = 0)"
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0185 }
            android.database.Cursor r10 = r3.A08(r1, r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = "raw_string_jid"
            int r11 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "subject"
            int r8 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "created_timestamp"
            int r6 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "ephemeral_expiration"
            int r5 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017e }
        L_0x013f:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0177
            java.lang.String r13 = r10.getString(r11)     // Catch:{ all -> 0x017e }
            java.lang.String r4 = r10.getString(r8)     // Catch:{ all -> 0x017e }
            r12 = 0
            boolean r0 = r10.isNull(r6)     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x015c
            long r0 = r10.getLong(r6)     // Catch:{ all -> 0x017e }
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x017e }
        L_0x015c:
            boolean r0 = r10.isNull(r5)     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x0175
            int r3 = r10.getInt(r5)     // Catch:{ all -> 0x017e }
        L_0x0166:
            X.0sL r1 = X.C16050sL.A05(r13)     // Catch:{ all -> 0x017e }
            if (r1 == 0) goto L_0x013f
            X.2bU r0 = new X.2bU     // Catch:{ all -> 0x017e }
            r0.<init>(r1, r12, r4, r3)     // Catch:{ all -> 0x017e }
            r7.add(r0)     // Catch:{ all -> 0x017e }
            goto L_0x013f
        L_0x0175:
            r3 = 0
            goto L_0x0166
        L_0x0177:
            r10.close()     // Catch:{ all -> 0x0185 }
            r9.close()     // Catch:{ SQLiteDiskIOException -> 0x018a }
            goto L_0x0190
        L_0x017e:
            r0 = move-exception
            if (r10 == 0) goto L_0x0184
            r10.close()     // Catch:{ all -> 0x0184 }
        L_0x0184:
            throw r0     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0189 }
        L_0x0189:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x018a }
        L_0x018a:
            r1 = move-exception
            java.lang.String r0 = "msgstore/groupinfo/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0190:
            com.whatsapp.util.Log.i((java.lang.String) r14)
            java.util.Iterator r5 = r7.iterator()
        L_0x0197:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r4 = r5.next()
            X.2bU r4 = (X.C51352bU) r4
            X.0sL r0 = r4.A01
            X.0sH r1 = new X.0sH
            r1.<init>(r0)
            java.lang.String r3 = r4.A03
            java.lang.Long r0 = r4.A02
            if (r0 != 0) goto L_0x01d2
            r22 = -9223372036854775808
        L_0x01b2:
            X.1cF r18 = X.C30371cF.A04
            r21 = 0
            int r0 = r4.A00
            r17 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r16 = r1
            r19 = r3
            r20 = r0
            r15.A0P(r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0197
        L_0x01d2:
            long r22 = r0.longValue()
            goto L_0x01b2
        L_0x01d7:
            X.0sO r1 = r2.A09
            X.0tq r0 = r1.A06
            X.0tf r10 = r0.A02()
            X.1cj r9 = r10.A00()     // Catch:{ all -> 0x02a2 }
            X.0us r5 = r1.A07     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "participant-user-store/resetSentSenderKeyForAllParticipants"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029d }
            X.0tq r0 = r5.A09     // Catch:{ all -> 0x029d }
            X.0tf r8 = r0.A02()     // Catch:{ all -> 0x029d }
            X.1cj r7 = r8.A00()     // Catch:{ all -> 0x0298 }
            X.193 r3 = r5.A0A     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = "participant-device-store/resetSentSenderKeyForAllParticipants"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0293 }
            r0 = 1
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0293 }
            r6.<init>(r0)     // Catch:{ all -> 0x0293 }
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = "sent_sender_key"
            r6.put(r0, r1)     // Catch:{ all -> 0x0293 }
            X.0tq r0 = r3.A03     // Catch:{ all -> 0x0293 }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x0293 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x028e }
            java.lang.String r1 = "group_participant_device"
            r0 = 0
            r3.A00(r1, r6, r0, r0)     // Catch:{ all -> 0x028e }
            r4.close()     // Catch:{ all -> 0x0293 }
            X.11J r0 = r5.A07     // Catch:{ all -> 0x0293 }
            java.util.concurrent.ConcurrentHashMap r3 = r0.A03     // Catch:{ all -> 0x0293 }
            java.util.Set r1 = r3.keySet()     // Catch:{ all -> 0x0293 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0293 }
            r0.<init>(r1)     // Catch:{ all -> 0x0293 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0293 }
        L_0x022e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0293 }
            if (r0 == 0) goto L_0x0246
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0293 }
            X.0sN r0 = (X.C16060sN) r0     // Catch:{ all -> 0x0293 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x0293 }
            X.1cE r0 = (X.C30361cE) r0     // Catch:{ all -> 0x0293 }
            if (r0 == 0) goto L_0x022e
            r5.A0A(r0)     // Catch:{ all -> 0x0293 }
            goto L_0x022e
        L_0x0246:
            r7.A00()     // Catch:{ all -> 0x0293 }
            r7.close()     // Catch:{ all -> 0x0298 }
            r8.close()     // Catch:{ all -> 0x029d }
            r9.A00()     // Catch:{ all -> 0x029d }
            r9.close()     // Catch:{ all -> 0x02a2 }
            r10.close()
            X.11K r0 = r2.A05
            r0.A00()
            X.0wa r1 = r2.A06
            X.0wZ r1 = (X.C18360wZ) r1
            r0 = 1
            r1.A00(r0)
            X.11I r1 = r2.A0D
            java.lang.String r0 = "async_init_migration_start_time"
            r1.A03(r0)
            X.0si r3 = r2.A0A
            X.0rz r1 = r3.A0G
            r0 = 512(0x200, float:7.175E-43)
            r1.A0e(r0)
            X.0pd r2 = r3.A0W
            r1 = 2660(0xa64, float:3.727E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x028d
            X.0sq r2 = r3.A0g
            r1 = 39
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r0.<init>(r3, r1)
            r2.Acl(r0)
        L_0x028d:
            return
        L_0x028e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0292 }
        L_0x0292:
            throw r0     // Catch:{ all -> 0x0293 }
        L_0x0293:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0297 }
        L_0x0297:
            throw r0     // Catch:{ all -> 0x0298 }
        L_0x0298:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x029c }
        L_0x029c:
            throw r0     // Catch:{ all -> 0x029d }
        L_0x029d:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x02a1 }
        L_0x02a1:
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x02a2:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x02ba }
            throw r0
        L_0x02a7:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x02ab }
        L_0x02ab:
            throw r0     // Catch:{ all -> 0x02ac }
        L_0x02ac:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x02b0 }
        L_0x02b0:
            throw r0     // Catch:{ all -> 0x02b1 }
        L_0x02b1:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x02b5 }
        L_0x02b5:
            throw r0     // Catch:{ all -> 0x02b6 }
        L_0x02b6:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x02ba }
        L_0x02ba:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11L.A00():void");
    }

    public void A01() {
        this.A02.A04();
        this.A08.A03.clear();
        this.A0G.A0E(3, true, false);
        this.A0H.A00();
        C16900tq r0 = this.A0B.A00;
        r0.A04();
        if (r0.A06.exists() && !this.A0E.A0G()) {
            this.A00.A00(GetStatusPrivacyJob.A00());
        }
    }
}
