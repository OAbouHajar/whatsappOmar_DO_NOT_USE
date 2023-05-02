package X;

import com.facebook.redex.RunnableRunnableShape0S0400100_I0;

/* renamed from: X.1Nu  reason: invalid class name and case insensitive filesystem */
public class C26461Nu implements C23541Cj {
    public final C15900s5 A00;
    public final C26451Nt A01;
    public final C18930xU A02;
    public final AnonymousClass19E A03;
    public final AnonymousClass139 A04;
    public final C23451Ca A05;
    public final AnonymousClass19W A06;
    public final AnonymousClass11R A07;
    public final C16440t3 A08;
    public final C15860rz A09;
    public final C16460t6 A0A;
    public final C16320sq A0B;

    public C26461Nu(C15900s5 r1, C26451Nt r2, C18930xU r3, AnonymousClass19E r4, AnonymousClass139 r5, C23451Ca r6, AnonymousClass19W r7, AnonymousClass11R r8, C16440t3 r9, C15860rz r10, C16460t6 r11, C16320sq r12) {
        this.A08 = r9;
        this.A0B = r12;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A0A = r11;
        this.A01 = r2;
        this.A03 = r4;
        this.A09 = r10;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = r8;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:144|145|146|147|148) */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x035a, code lost:
        if (r1 != null) goto L_0x035c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x0357 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0397 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x03a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:170:0x03b2 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:147:0x0397=Splitter:B:147:0x0397, B:136:0x035f=Splitter:B:136:0x035f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0051=Splitter:B:8:0x0051, B:170:0x03b2=Splitter:B:170:0x03b2} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APJ() {
        /*
            r30 = this;
            r4 = r30
            X.11R r0 = r4.A07
            android.content.SharedPreferences r0 = r0.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "companion_rollout_random"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "previously_accessed_companion_mode"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            X.19E r9 = r4.A03
            X.139 r1 = r9.A01
            java.lang.String r0 = "mutation_counter"
            long r28 = r1.A00(r0)
            java.lang.String r0 = "invalid_action_counter"
            long r26 = r1.A00(r0)
            X.0zv r8 = r9.A04
            X.19K r2 = r8.A01
            X.0tf r5 = r2.get()
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x03b3 }
            java.lang.String r3 = "SELECT COUNT(*) as count FROM syncd_mutations"
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x03b3 }
            android.database.Cursor r3 = r6.A08(r3, r0)     // Catch:{ all -> 0x03b3 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x03ac }
            if (r0 != 0) goto L_0x0047
            r24 = -1
            goto L_0x0051
        L_0x0047:
            java.lang.String r0 = "count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03ac }
            long r24 = r3.getLong(r0)     // Catch:{ all -> 0x03ac }
        L_0x0051:
            r3.close()     // Catch:{ all -> 0x03b3 }
            r5.close()
            java.lang.String r0 = "upload_conflict_counter"
            long r22 = r1.A00(r0)
            java.lang.String r0 = "unsupported_action_counter"
            long r20 = r1.A00(r0)
            java.lang.String r0 = "cross_index_conflict_counter"
            long r18 = r1.A00(r0)
            java.lang.String r0 = "unset_action_mutation_counter"
            long r16 = r1.A00(r0)
            java.lang.String r0 = "key_rotation_remove_counter"
            long r14 = r1.A00(r0)
            java.lang.String r0 = "missing_key_counter"
            long r12 = r1.A00(r0)
            r7 = 9
            long[] r3 = new long[r7]
            r0 = 0
            r3[r0] = r28
            r0 = 1
            r3[r0] = r12
            r0 = 2
            r3[r0] = r26
            r0 = 3
            r3[r0] = r24
            r0 = 4
            r3[r0] = r22
            r0 = 5
            r3[r0] = r14
            r0 = 6
            r3[r0] = r20
            r0 = 7
            r3[r0] = r18
            r0 = 8
            r3[r0] = r16
            r1 = 0
        L_0x009f:
            r5 = r3[r1]
            r10 = 0
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x012e
            X.3sZ r1 = new X.3sZ
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r28)
            r1.A04 = r0
            r3 = 0
            int r0 = (r26 > r10 ? 1 : (r26 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0129
            r0 = r3
        L_0x00b8:
            r1.A01 = r0
            r5 = -1
            int r0 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0124
            r0 = r3
        L_0x00c1:
            r1.A05 = r0
            int r0 = (r22 > r10 ? 1 : (r22 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x011f
            r0 = r3
        L_0x00c8:
            r1.A08 = r0
            int r0 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x011a
            r0 = r3
        L_0x00cf:
            r1.A07 = r0
            int r0 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0115
            r0 = r3
        L_0x00d6:
            r1.A00 = r0
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0110
            r0 = r3
        L_0x00dd:
            r1.A06 = r0
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x010b
            r0 = r3
        L_0x00e4:
            r1.A02 = r0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00ee
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
        L_0x00ee:
            r1.A03 = r3
            X.0t9 r0 = r9.A06
            r0.A06(r1)
        L_0x00f5:
            X.0pd r1 = r9.A05
            r0 = 1221(0x4c5, float:1.711E-42)
            X.0tM r10 = X.C16620tM.A02
            boolean r0 = r1.A0E(r10, r0)
            if (r0 == 0) goto L_0x0205
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            X.0tf r6 = r2.get()
            goto L_0x0134
        L_0x010b:
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            goto L_0x00e4
        L_0x0110:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            goto L_0x00dd
        L_0x0115:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            goto L_0x00d6
        L_0x011a:
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            goto L_0x00cf
        L_0x011f:
            java.lang.Long r0 = java.lang.Long.valueOf(r22)
            goto L_0x00c8
        L_0x0124:
            java.lang.Long r0 = java.lang.Long.valueOf(r24)
            goto L_0x00c1
        L_0x0129:
            java.lang.Long r0 = java.lang.Long.valueOf(r26)
            goto L_0x00b8
        L_0x012e:
            int r1 = r1 + 1
            if (r1 >= r7) goto L_0x00f5
            goto L_0x009f
        L_0x0134:
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x03a7 }
            java.lang.String r1 = "SELECT mutation_name, are_dependencies_missing, COUNT(*) AS mutation_count FROM syncd_mutations GROUP BY mutation_name, are_dependencies_missing"
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x03a7 }
            android.database.Cursor r5 = r2.A08(r1, r0)     // Catch:{ all -> 0x03a7 }
        L_0x013f:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "mutation_name"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r3 = r5.getString(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "are_dependencies_missing"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01fd }
            long r11 = r5.getLong(r0)     // Catch:{ all -> 0x01fd }
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0161
            r1 = 1
        L_0x0161:
            java.lang.String r0 = "mutation_count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01fd }
            long r11 = r5.getLong(r0)     // Catch:{ all -> 0x01fd }
            java.lang.Object r2 = r7.get(r3)     // Catch:{ all -> 0x01fd }
            X.4Kb r2 = (X.C84314Kb) r2     // Catch:{ all -> 0x01fd }
            if (r2 != 0) goto L_0x0178
            X.4Kb r2 = new X.4Kb     // Catch:{ all -> 0x01fd }
            r2.<init>()     // Catch:{ all -> 0x01fd }
        L_0x0178:
            if (r1 != 0) goto L_0x017b
            goto L_0x018f
        L_0x017b:
            X.15i r0 = r8.A02     // Catch:{ all -> 0x01fd }
            boolean r0 = r0.A02(r3)     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x0189
            long r0 = r2.A01     // Catch:{ all -> 0x01fd }
            long r0 = r0 + r11
            r2.A01 = r0     // Catch:{ all -> 0x01fd }
            goto L_0x0194
        L_0x0189:
            long r0 = r2.A02     // Catch:{ all -> 0x01fd }
            long r0 = r0 + r11
            r2.A02 = r0     // Catch:{ all -> 0x01fd }
            goto L_0x0194
        L_0x018f:
            long r0 = r2.A00     // Catch:{ all -> 0x01fd }
            long r0 = r0 + r11
            r2.A00 = r0     // Catch:{ all -> 0x01fd }
        L_0x0194:
            r7.put(r3, r2)     // Catch:{ all -> 0x01fd }
            goto L_0x013f
        L_0x0198:
            r5.close()     // Catch:{ all -> 0x03a7 }
            r6.close()
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r18 = r0.iterator()
        L_0x01a6:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0205
            java.lang.Object r11 = r18.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r1 = r11.getValue()
            X.4Kb r1 = (X.C84314Kb) r1
            r15 = 3
            long[] r14 = new long[r15]
            r0 = 0
            long r7 = r1.A00
            r14[r0] = r7
            r0 = 1
            long r5 = r1.A01
            r14[r0] = r5
            r0 = 2
            long r2 = r1.A02
            r14[r0] = r2
            r1 = 0
        L_0x01cb:
            r16 = r14[r1]
            r12 = 0
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f8
            X.3rb r1 = new X.3rb
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass19E.A02(r7)
            r1.A00 = r0
            java.lang.Integer r0 = X.AnonymousClass19E.A02(r5)
            r1.A01 = r0
            java.lang.Integer r0 = X.AnonymousClass19E.A02(r2)
            r1.A02 = r0
            java.lang.Object r0 = r11.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1.A03 = r0
            X.0t9 r0 = r9.A06
            r0.A06(r1)
            goto L_0x01a6
        L_0x01f8:
            int r1 = r1 + 1
            if (r1 >= r15) goto L_0x01a6
            goto L_0x01cb
        L_0x01fd:
            r0 = move-exception
            if (r5 == 0) goto L_0x03a6
            r5.close()     // Catch:{ all -> 0x03a6 }
            goto L_0x03a6
        L_0x0205:
            X.19W r7 = r4.A06
            java.lang.String r0 = "SyncdKeyManager/dailyCronJob"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19V r8 = r7.A08
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.19K r3 = r8.A00
            X.0tf r6 = r3.get()
            X.0tg r5 = r6.A02     // Catch:{ all -> 0x03a7 }
            java.lang.String r1 = "SELECT crypto_info.device_id,  crypto_info.epoch FROM crypto_info LEFT JOIN syncd_mutations on crypto_info.device_id = syncd_mutations.device_id AND crypto_info.epoch = syncd_mutations.epoch WHERE syncd_mutations._id IS NULL AND crypto_info.stale_timestamp = 0 "
            r0 = 0
            android.database.Cursor r9 = r5.A08(r1, r0)     // Catch:{ all -> 0x03a7 }
        L_0x0222:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x03a0 }
            if (r0 == 0) goto L_0x0247
            java.lang.String r0 = "device_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03a0 }
            long r0 = r9.getLong(r0)     // Catch:{ all -> 0x03a0 }
            int r11 = (int) r0     // Catch:{ all -> 0x03a0 }
            java.lang.String r0 = "epoch"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03a0 }
            long r0 = r9.getLong(r0)     // Catch:{ all -> 0x03a0 }
            int r5 = (int) r0     // Catch:{ all -> 0x03a0 }
            X.1WK r0 = new X.1WK     // Catch:{ all -> 0x03a0 }
            r0.<init>(r11, r5)     // Catch:{ all -> 0x03a0 }
            r2.add(r0)     // Catch:{ all -> 0x03a0 }
            goto L_0x0222
        L_0x0247:
            r9.close()     // Catch:{ all -> 0x03a7 }
            r6.close()
            X.1WY r0 = r7.A01()
            if (r0 == 0) goto L_0x0258
            X.1WK r0 = r0.A01
            r2.remove(r0)
        L_0x0258:
            X.0t3 r0 = r7.A04
            long r5 = r0.A00()
            r8.A03(r2, r5)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            X.0s5 r1 = r7.A01
            X.0tC r0 = X.C15910s6.A1X
            int r0 = r1.A02(r0)
            long r0 = (long) r0
            long r0 = r2.toMillis(r0)
            long r5 = r5 - r0
            X.0tf r8 = r3.A02()
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x039b }
            java.lang.String r3 = "DELETE FROM crypto_info WHERE stale_timestamp != 0  AND stale_timestamp <= ? "
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x039b }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x039b }
            r2[r1] = r0     // Catch:{ all -> 0x039b }
            r7.A0C(r3, r2)     // Catch:{ all -> 0x039b }
            r8.close()
            X.1Ca r5 = r4.A05
            java.lang.String r0 = "SyncEncryptionHelper/dailyCronJob"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pd r9 = r5.A0B
            r8 = 1104(0x450, float:1.547E-42)
            int r0 = r9.A03(r10, r8)
            if (r0 == 0) goto L_0x02cb
            X.0t3 r0 = r5.A07
            long r6 = r0.A00()
            X.139 r0 = r5.A04
            android.content.SharedPreferences r3 = r0.A01()
            java.lang.String r2 = "syncd_last_lthash_consistency_check_time"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            long r6 = r6 - r0
            int r0 = r9.A03(r10, r8)
            long r2 = (long) r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r2 = r2 * r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x02cb
            X.0sq r2 = r5.A0C
            r0 = 31
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r1 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r1.<init>(r5, r0)
            java.lang.String r0 = "SyncEncryptionHelper/checkLtHashConsistency"
            r2.Acm(r1, r0)
        L_0x02cb:
            X.0xU r2 = r4.A02
            monitor-enter(r2)
            X.0yb r8 = r2.A0D     // Catch:{ all -> 0x0398 }
            X.139 r0 = r8.A05     // Catch:{ all -> 0x0398 }
            android.content.SharedPreferences r1 = r0.A01()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "syncd_last_companion_dereg_time"
            r6 = 0
            long r4 = r1.getLong(r0, r6)     // Catch:{ all -> 0x0398 }
            r3 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x031e
            boolean r0 = r8.A05()     // Catch:{ all -> 0x0398 }
            if (r0 != 0) goto L_0x02f9
            X.0yO r0 = r8.A08     // Catch:{ all -> 0x0398 }
            java.util.List r0 = r0.A07()     // Catch:{ all -> 0x0398 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0398 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02f9
            r3 = 1
        L_0x02f9:
            java.lang.String r1 = "SyncdDeleteAllDataApiHandler/shouldCleanUpSyncd: shouldCleanUpSyncd = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0398 }
            r0.<init>(r1)     // Catch:{ all -> 0x0398 }
            r0.append(r3)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0398 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0398 }
            if (r3 == 0) goto L_0x031e
            X.0sK r0 = r2.A07     // Catch:{ all -> 0x0398 }
            boolean r1 = r0.A0G()     // Catch:{ all -> 0x0398 }
            r0 = 0
            if (r1 != 0) goto L_0x0316
            r0 = 1
        L_0x0316:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0398 }
            r0 = 3
            r2.A0P(r0)     // Catch:{ all -> 0x0398 }
            goto L_0x0391
        L_0x031e:
            X.19W r8 = r2.A0S     // Catch:{ all -> 0x0398 }
            X.19M r0 = r8.A07     // Catch:{ all -> 0x0398 }
            r7 = 39
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x0398 }
            X.19K r0 = r0.A00     // Catch:{ all -> 0x0398 }
            X.0tf r5 = r0.get()     // Catch:{ all -> 0x0398 }
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x0393 }
            java.lang.String r4 = "SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE message_type = ?  ORDER BY timestamp ASC  LIMIT 1"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0393 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0393 }
            r3[r1] = r0     // Catch:{ all -> 0x0393 }
            android.database.Cursor r1 = r6.A08(r4, r3)     // Catch:{ all -> 0x0393 }
            if (r1 == 0) goto L_0x0358
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0353 }
            if (r0 == 0) goto L_0x0358
            java.lang.String r0 = "timestamp"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0353 }
            long r6 = r1.getLong(r0)     // Catch:{ all -> 0x0353 }
            goto L_0x035c
        L_0x0353:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0357 }
        L_0x0357:
            throw r0     // Catch:{ all -> 0x0393 }
        L_0x0358:
            r6 = 0
            if (r1 == 0) goto L_0x035f
        L_0x035c:
            r1.close()     // Catch:{ all -> 0x0393 }
        L_0x035f:
            r5.close()     // Catch:{ all -> 0x0398 }
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0391
            X.0t3 r0 = r8.A04     // Catch:{ all -> 0x0398 }
            long r4 = r0.A00()     // Catch:{ all -> 0x0398 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x0398 }
            X.0s5 r1 = r8.A01     // Catch:{ all -> 0x0398 }
            X.0tC r0 = X.C15910s6.A1a     // Catch:{ all -> 0x0398 }
            int r0 = r1.A02(r0)     // Catch:{ all -> 0x0398 }
            long r0 = (long) r0     // Catch:{ all -> 0x0398 }
            long r0 = r3.toMillis(r0)     // Catch:{ all -> 0x0398 }
            long r6 = r6 + r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0391
            java.lang.String r0 = "sync-manager/deleteSyncdIfWaitForKeyTimedOut: fatal exception because wait for key timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0398 }
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0398 }
            r2.A0Q(r0)     // Catch:{ all -> 0x0398 }
        L_0x0391:
            monitor-exit(r2)     // Catch:{ all -> 0x0398 }
            return
        L_0x0393:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0397 }
        L_0x0397:
            throw r0     // Catch:{ all -> 0x0398 }
        L_0x0398:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0398 }
            throw r0
        L_0x039b:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x03b7 }
            throw r0
        L_0x03a0:
            r0 = move-exception
            if (r9 == 0) goto L_0x03a6
            r9.close()     // Catch:{ all -> 0x03a6 }
        L_0x03a6:
            throw r0     // Catch:{ all -> 0x03a7 }
        L_0x03a7:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x03b7 }
            throw r0
        L_0x03ac:
            r0 = move-exception
            if (r3 == 0) goto L_0x03b2
            r3.close()     // Catch:{ all -> 0x03b2 }
        L_0x03b2:
            throw r0     // Catch:{ all -> 0x03b3 }
        L_0x03b3:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x03b7 }
        L_0x03b7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26461Nu.APJ():void");
    }

    public void APK() {
        this.A0B.Acl(new RunnableRunnableShape0S0400100_I0(this.A08, this.A0A, this.A01, this.A09, 0, ((long) this.A00.A02(C15910s6.A21)) * 1000));
    }
}
