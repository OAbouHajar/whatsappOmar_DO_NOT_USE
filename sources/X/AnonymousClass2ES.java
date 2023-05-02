package X;

import android.text.TextUtils;

/* renamed from: X.2ES  reason: invalid class name */
public class AnonymousClass2ES extends C30111bl implements AnonymousClass2EI {
    public final C16040sK A00;
    public final C16820th A01;
    public final AnonymousClass17B A02;
    public final C24761He A03;
    public final C218715t A04;

    public AnonymousClass2ES(C16040sK r3, C16820th r4, AnonymousClass17B r5, C24761He r6, C218715t r7, C24821Hk r8) {
        super(r8, "receipt_device", Integer.MIN_VALUE);
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r7;
        this.A03 = r6;
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0193, code lost:
        if (X.C16030sJ.A0Q(r12) != false) goto L_0x0195;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x039f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x03ab */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C49522Tm A09(android.database.Cursor r46) {
        /*
            r45 = this;
            java.lang.String r0 = "_id"
            r10 = r46
            int r34 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "key_remote_jid"
            int r33 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "key_from_me"
            int r32 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "key_id"
            int r31 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "remote_resource"
            int r30 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "status"
            int r29 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "receipt_device_timestamp"
            int r28 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "read_device_timestamp"
            int r27 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "played_device_timestamp"
            int r26 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "participant_hash"
            int r25 = r10.getColumnIndexOrThrow(r0)
            r24 = 0
            r0 = -1
        L_0x0043:
            boolean r2 = r10.moveToNext()
            if (r2 == 0) goto L_0x03dc
            r0 = r34
            long r0 = r10.getLong(r0)
            int r24 = r24 + 1
            r2 = r32
            long r5 = r10.getLong(r2)
            r3 = 1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0043
            r2 = r33
            java.lang.String r2 = r10.getString(r2)
            X.0rv r11 = X.C15830rv.A02(r2)
            java.lang.String r5 = ", messageRowId="
            java.lang.String r4 = "receipt-device-db-migration/process-batch: chatJid="
            if (r11 != 0) goto L_0x0091
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r2 = r33
            java.lang.String r2 = r10.getString(r2)
            r3.append(r2)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r2 = " SKIP Due to invalid chatJid."
            r3.append(r2)
        L_0x0089:
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x0043
        L_0x0091:
            r2 = r29
            int r3 = r10.getInt(r2)
            r2 = 6
            if (r3 == r2) goto L_0x0043
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r11)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            boolean r2 = X.C16030sJ.A0L(r11)
            java.lang.String r23 = ", userJid="
            r18 = 20
            java.lang.String r9 = "receipt-device-db-migration/process-batch: failed to insert blank receipt for messageRowId="
            r4 = 1
            r8 = r45
            if (r2 != 0) goto L_0x0172
            boolean r2 = X.C16030sJ.A0Q(r11)
            if (r2 != 0) goto L_0x0172
            boolean r2 = X.C16030sJ.A0H(r11)
            if (r2 != 0) goto L_0x0043
            r2 = r28
            long r16 = r10.getLong(r2)
            r2 = r27
            long r14 = r10.getLong(r2)
            r2 = r26
            long r12 = r10.getLong(r2)
            r5 = 0
            int r2 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0043
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0043
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0043
            r2 = r30
            java.lang.String r2 = r10.getString(r2)
            com.whatsapp.jid.Jid r7 = com.whatsapp.jid.Jid.getNullable(r2)
            X.0rv r7 = (X.C15830rv) r7
            boolean r2 = X.C16030sJ.A0H(r7)
            if (r2 == 0) goto L_0x013f
            r2 = r31
            java.lang.String r3 = r10.getString(r2)
            X.0th r6 = r8.A01     // Catch:{ SQLiteException -> 0x0390 }
            X.1Vw r2 = new X.1Vw     // Catch:{ SQLiteException -> 0x0390 }
            r2.<init>(r7, r3, r4)     // Catch:{ SQLiteException -> 0x0390 }
            X.0tZ r5 = r6.A03(r2)     // Catch:{ SQLiteException -> 0x0390 }
            if (r5 == 0) goto L_0x0043
            X.17B r4 = r8.A02
            long r2 = r5.A13
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            boolean r2 = X.AnonymousClass17B.A00(r4, r11, r2)
            if (r2 != 0) goto L_0x0138
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r0)
            java.lang.String r2 = ", broadcastJid="
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0138:
            X.1Vw r2 = r5.A11
            r6.A05(r2)
            goto L_0x0043
        L_0x013f:
            boolean r2 = r11 instanceof com.whatsapp.jid.UserJid
            X.AnonymousClass00B.A0G(r2)
            int r3 = r11.getType()
            r2 = 11
            if (r3 == r2) goto L_0x0043
            r2 = 7
            if (r3 == r2) goto L_0x0043
            r2 = 8
            if (r3 == r2) goto L_0x0043
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            X.17B r2 = r8.A02
            boolean r2 = X.AnonymousClass17B.A00(r2, r11, r0)
            if (r2 != 0) goto L_0x0043
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r0)
            r2 = r23
            r3.append(r2)
            r3.append(r11)
            goto L_0x0089
        L_0x0172:
            X.0th r2 = r8.A01     // Catch:{ SQLiteException -> 0x03b1 }
            r44 = r2
            X.0tZ r4 = r2.A00(r0)     // Catch:{ SQLiteException -> 0x03b1 }
            r2 = r25
            java.lang.String r7 = r10.getString(r2)
            if (r4 == 0) goto L_0x0043
            X.1Vw r2 = r4.A11
            r43 = r2
            X.0rv r12 = r2.A00
            boolean r2 = X.C16030sJ.A0L(r12)
            if (r2 != 0) goto L_0x0195
            boolean r2 = X.C16030sJ.A0Q(r12)
            r5 = 0
            if (r2 == 0) goto L_0x0196
        L_0x0195:
            r5 = 1
        L_0x0196:
            java.lang.String r2 = "chatJid="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r11)
            java.lang.String r2 = "; jid="
            r6.append(r2)
            r6.append(r12)
            java.lang.String r2 = "; messageRowId="
            r6.append(r2)
            r6.append(r0)
            java.lang.String r2 = "; remoteResourceJid="
            r6.append(r2)
            X.0rv r2 = r4.A0B()
            r6.append(r2)
            java.lang.String r2 = "; status="
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = "; type="
            r6.append(r2)
            byte r2 = r4.A10
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            X.AnonymousClass00B.A0C(r2, r5)
            X.15t r3 = r8.A04
            r2 = r43
            X.21M r22 = r3.A01(r2)
            X.1He r6 = r8.A03
            java.lang.String r21 = "new_phash"
            java.lang.String r20 = "old_phash"
            java.lang.String r19 = "action"
            java.lang.String r5 = "jid"
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.0tq r14 = r6.A05
            X.0tf r12 = r14.get()
            X.0tg r13 = r12.A02     // Catch:{ all -> 0x03ac }
            java.lang.String r36 = "group_participants"
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x03ac }
            r16 = 0
            r3[r16] = r5     // Catch:{ all -> 0x03ac }
            java.lang.String r38 = "gjid = ?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x03ac }
            java.lang.String r15 = r11.getRawString()     // Catch:{ all -> 0x03ac }
            r2[r16] = r15     // Catch:{ all -> 0x03ac }
            r40 = 0
            r42 = r40
            r35 = r13
            r37 = r3
            r39 = r2
            r41 = r40
            android.database.Cursor r13 = r35.A09(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x03ac }
            int r3 = r13.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x03a5 }
        L_0x021b:
            boolean r2 = r13.moveToNext()     // Catch:{ all -> 0x03a5 }
            if (r2 == 0) goto L_0x0241
            java.lang.String r15 = r13.getString(r3)     // Catch:{ all -> 0x03a5 }
            boolean r2 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x03a5 }
            if (r2 == 0) goto L_0x0239
            X.0sK r2 = r6.A01     // Catch:{ all -> 0x03a5 }
            r2.A0B()     // Catch:{ all -> 0x03a5 }
            X.1ZT r2 = r2.A05     // Catch:{ all -> 0x03a5 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x03a5 }
            r4.add(r2)     // Catch:{ all -> 0x03a5 }
            goto L_0x021b
        L_0x0239:
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.get(r15)     // Catch:{ 1W4 -> 0x021b }
            r4.add(r2)     // Catch:{ 1W4 -> 0x021b }
            goto L_0x021b
        L_0x0241:
            r13.close()     // Catch:{ all -> 0x03ac }
            r12.close()
            java.lang.String r2 = X.C30361cE.A00(r4)
            boolean r2 = android.text.TextUtils.equals(r2, r7)
            if (r2 != 0) goto L_0x0336
            X.0tf r18 = r14.get()
            r2 = r18
            X.0tg r12 = r2.A02     // Catch:{ all -> 0x03a0 }
            java.lang.String r36 = "group_participants_history"
            r2 = 4
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x03a0 }
            r3[r16] = r5     // Catch:{ all -> 0x03a0 }
            r2 = 1
            r3[r2] = r19     // Catch:{ all -> 0x03a0 }
            r13 = 2
            r3[r13] = r20     // Catch:{ all -> 0x03a0 }
            r13 = 3
            r3[r13] = r21     // Catch:{ all -> 0x03a0 }
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x03a0 }
            java.lang.String r11 = r11.getRawString()     // Catch:{ all -> 0x03a0 }
            r2[r16] = r11     // Catch:{ all -> 0x03a0 }
            java.lang.String r41 = "_id DESC"
            r35 = r12
            r37 = r3
            r39 = r2
            android.database.Cursor r3 = r35.A09(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x03a0 }
        L_0x027d:
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0399 }
            if (r2 == 0) goto L_0x032f
            int r2 = r3.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0399 }
            java.lang.String r13 = r3.getString(r2)     // Catch:{ all -> 0x0399 }
            r2 = r19
            int r2 = r3.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0399 }
            int r12 = r3.getInt(r2)     // Catch:{ all -> 0x0399 }
            r2 = r20
            int r2 = r3.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0399 }
            java.lang.String r17 = r3.getString(r2)     // Catch:{ all -> 0x0399 }
            r2 = r21
            int r2 = r3.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0399 }
            java.lang.String r2 = r3.getString(r2)     // Catch:{ all -> 0x0399 }
            boolean r2 = android.text.TextUtils.equals(r2, r7)     // Catch:{ all -> 0x0399 }
            if (r2 != 0) goto L_0x032b
            java.lang.String r14 = ""
            boolean r2 = r13.equals(r14)     // Catch:{ all -> 0x0399 }
            if (r2 == 0) goto L_0x02c3
            X.0sK r2 = r6.A01     // Catch:{ all -> 0x0399 }
            r2.A0B()     // Catch:{ all -> 0x0399 }
            X.1ZT r2 = r2.A05     // Catch:{ all -> 0x0399 }
            java.util.List r11 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x0399 }
            goto L_0x02f3
        L_0x02c3:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0399 }
            r11.<init>()     // Catch:{ all -> 0x0399 }
            java.lang.String r2 = ","
            java.lang.String[] r13 = android.text.TextUtils.split(r13, r2)     // Catch:{ all -> 0x0399 }
            int r2 = r13.length     // Catch:{ all -> 0x0399 }
            r35 = r2
            r15 = 0
        L_0x02d2:
            r2 = r35
            if (r15 >= r2) goto L_0x02f3
            r2 = r13[r15]     // Catch:{ all -> 0x0399 }
            boolean r16 = r2.equals(r14)     // Catch:{ all -> 0x0399 }
            if (r16 == 0) goto L_0x02e9
            X.0sK r2 = r6.A01     // Catch:{ all -> 0x0399 }
            r2.A0B()     // Catch:{ all -> 0x0399 }
            X.1ZT r2 = r2.A05     // Catch:{ all -> 0x0399 }
            r11.add(r2)     // Catch:{ all -> 0x0399 }
            goto L_0x02f0
        L_0x02e9:
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.get(r2)     // Catch:{ 1W4 -> 0x02f0 }
            r11.add(r2)     // Catch:{ 1W4 -> 0x02f0 }
        L_0x02f0:
            int r15 = r15 + 1
            goto L_0x02d2
        L_0x02f3:
            r14 = 1
            if (r12 == r14) goto L_0x0312
            r13 = 2
            if (r12 == r13) goto L_0x0316
            r2 = 3
            if (r12 != r2) goto L_0x032f
            int r2 = r11.size()     // Catch:{ all -> 0x0399 }
            if (r2 != r13) goto L_0x032f
            java.lang.Object r2 = r11.get(r14)     // Catch:{ all -> 0x0399 }
            r4.remove(r2)     // Catch:{ all -> 0x0399 }
            r2 = 0
            java.lang.Object r2 = r11.get(r2)     // Catch:{ all -> 0x0399 }
            r4.add(r2)     // Catch:{ all -> 0x0399 }
            goto L_0x0319
        L_0x0312:
            r4.removeAll(r11)     // Catch:{ all -> 0x0399 }
            goto L_0x0319
        L_0x0316:
            r4.addAll(r11)     // Catch:{ all -> 0x0399 }
        L_0x0319:
            r2 = r17
            boolean r2 = android.text.TextUtils.equals(r2, r7)     // Catch:{ all -> 0x0399 }
            if (r2 != 0) goto L_0x032b
            java.lang.String r2 = X.C30361cE.A00(r4)     // Catch:{ all -> 0x0399 }
            boolean r2 = android.text.TextUtils.equals(r2, r7)     // Catch:{ all -> 0x0399 }
            if (r2 == 0) goto L_0x027d
        L_0x032b:
            r3.close()     // Catch:{ all -> 0x03a0 }
            goto L_0x0333
        L_0x032f:
            r3.close()     // Catch:{ all -> 0x03a0 }
            goto L_0x0384
        L_0x0333:
            r18.close()
        L_0x0336:
            java.util.Iterator r5 = r4.iterator()
        L_0x033a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0387
            java.lang.Object r4 = r5.next()
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.0sK r2 = r8.A00
            boolean r2 = r2.A0I(r4)
            if (r2 != 0) goto L_0x033a
            r2 = r22
            java.util.concurrent.ConcurrentHashMap r2 = r2.A00
            java.lang.Object r2 = r2.get(r4)
            X.21N r2 = (X.AnonymousClass21N) r2
            if (r2 == 0) goto L_0x0361
            int r3 = r2.A00()
            r2 = 4
            if (r3 != r2) goto L_0x033a
        L_0x0361:
            X.17B r2 = r8.A02
            boolean r2 = X.AnonymousClass17B.A00(r2, r4, r0)
            if (r2 != 0) goto L_0x033a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r0)
            r2 = r23
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x033a
        L_0x0384:
            r18.close()
        L_0x0387:
            r3 = r44
            r2 = r43
            r3.A05(r2)
            goto L_0x0043
        L_0x0390:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "receipt-device-db-migration/process-batch fail to read from message store, e="
            goto L_0x03b9
        L_0x0399:
            r0 = move-exception
            if (r3 == 0) goto L_0x039f
            r3.close()     // Catch:{ all -> 0x039f }
        L_0x039f:
            throw r0     // Catch:{ all -> 0x03a0 }
        L_0x03a0:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x03b0 }
            throw r0
        L_0x03a5:
            r0 = move-exception
            if (r13 == 0) goto L_0x03ab
            r13.close()     // Catch:{ all -> 0x03ab }
        L_0x03ab:
            throw r0     // Catch:{ all -> 0x03ac }
        L_0x03ac:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x03b0 }
        L_0x03b0:
            throw r0
        L_0x03b1:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "receipt-device-db-migration/process-batch fail to read from message store for group/status chat, e="
        L_0x03b9:
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            long r1 = r8.A07()
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x03db
            r1 = -1
            r0 = 0
            X.2Tm r3 = new X.2Tm
            r3.<init>(r1, r0)
            return r3
        L_0x03db:
            throw r3
        L_0x03dc:
            X.2Tm r3 = new X.2Tm
            r2 = r24
            r3.<init>(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ES.A09(android.database.Cursor):X.2Tm");
    }

    public void A0G() {
        super.A0G();
        this.A06.A04("receipt_device_migration_complete", 1);
    }

    public boolean A0T(C30101bk r5) {
        C16800tf A012 = this.A05.get();
        try {
            if (TextUtils.isEmpty(C33961jT.A00(A012.A02, "table", "messages"))) {
                A0G();
                A012.close();
                return true;
            }
            A012.close();
            return super.A0T(r5);
        } catch (Throwable unused) {
        }
        throw th;
    }

    public /* synthetic */ void AMJ() {
    }

    public /* synthetic */ void ANa() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRollback() {
        /*
            r5 = this;
            X.0tq r0 = r5.A05
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0037 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "receipt_device"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0032 }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "receipt_device_migration_complete"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "migration_receipt_device_index"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "migration_receipt_device_retry"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            r3.A00()     // Catch:{ all -> 0x0032 }
            r3.close()     // Catch:{ all -> 0x0037 }
            r4.close()
            java.lang.String r0 = "ReceiptDeviceStore/ReceiptDeviceDatabaseMigration/resetMigration/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0032:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ES.onRollback():void");
    }
}
