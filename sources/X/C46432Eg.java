package X;

/* renamed from: X.2Eg  reason: invalid class name and case insensitive filesystem */
public class C46432Eg extends C30111bl {
    public final C16920ts A00;

    public C46432Eg(C16920ts r3, C24821Hk r4) {
        super(r4, "migration_chat_store", Integer.MIN_VALUE);
        AnonymousClass00B.A06(r3);
        this.A00 = r3;
    }

    public long A06() {
        return super.A06();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public boolean A0T(X.C30101bk r57) {
        /*
            r56 = this;
            r55 = r56
            r0 = r55
            X.0so r2 = r0.A01
            java.lang.String r1 = "chat-store-migration-pending"
            r41 = 0
            r12 = 0
            r0 = r41
            r2.AcB(r1, r0, r12)
            r0 = r55
            X.0ts r11 = r0.A00
            X.0tq r0 = r11.A04
            r54 = r0
            r54.A04()
            java.io.File r0 = r0.A06
            r53 = r0
            long r17 = r53.length()
            java.lang.String r0 = "ChatStore/populateChatTable/start/db size="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = r17
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "ChatStore/populate"
            X.1Zf r22 = new X.1Zf
            r0 = r22
            r0.<init>((java.lang.String) r1)
            r0 = 22
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r1 = "key_remote_jid"
            r2[r12] = r1
            java.lang.String r40 = "subject"
            r13 = 1
            r2[r13] = r40
            r0 = 2
            java.lang.String r39 = "creation"
            r2[r0] = r39
            r0 = 3
            java.lang.String r38 = "message_table_id"
            r2[r0] = r38
            r0 = 4
            java.lang.String r37 = "last_message_table_id"
            r2[r0] = r37
            r0 = 5
            java.lang.String r36 = "last_read_message_table_id"
            r2[r0] = r36
            r0 = 6
            java.lang.String r35 = "last_read_receipt_sent_message_table_id"
            r2[r0] = r35
            r0 = 7
            java.lang.String r34 = "last_important_message_table_id"
            r2[r0] = r34
            r0 = 8
            java.lang.String r33 = "archived"
            r2[r0] = r33
            r0 = 9
            java.lang.String r32 = "sort_timestamp"
            r2[r0] = r32
            r0 = 10
            java.lang.String r31 = "gen"
            r2[r0] = r31
            r0 = 11
            java.lang.String r30 = "my_messages"
            r2[r0] = r30
            r0 = 12
            java.lang.String r29 = "unseen_earliest_message_received_time"
            r2[r0] = r29
            r0 = 13
            java.lang.String r28 = "unseen_message_count"
            r2[r0] = r28
            r0 = 14
            java.lang.String r10 = "unseen_missed_calls_count"
            r2[r0] = r10
            r0 = 15
            java.lang.String r9 = "unseen_row_count"
            r2[r0] = r9
            r0 = 16
            java.lang.String r8 = "plaintext_disabled"
            r2[r0] = r8
            r0 = 17
            java.lang.String r7 = "vcard_ui_dismissed"
            r2[r0] = r7
            r0 = 18
            java.lang.String r27 = "change_number_notified_message_id"
            r2[r0] = r27
            r0 = 19
            java.lang.String r6 = "show_group_description"
            r2[r0] = r6
            r0 = 20
            java.lang.String r5 = "ephemeral_expiration"
            r2[r0] = r5
            r0 = 21
            java.lang.String r4 = "ephemeral_setting_timestamp"
            r2[r0] = r4
            X.0tf r24 = r54.A02()     // Catch:{ SQLiteException -> 0x04ae }
            X.1cj r23 = r24.A00()     // Catch:{ all -> 0x04a9 }
            X.11I r0 = r11.A05     // Catch:{ all -> 0x04a4 }
            r52 = r0
            java.lang.String r25 = "chat_ready"
            r3 = r0
            r0 = r25
            int r0 = r3.A00(r0, r12)     // Catch:{ all -> 0x04a4 }
            if (r0 != r13) goto L_0x00e6
            r0 = r24
            X.0tg r3 = r0.A02     // Catch:{ all -> 0x04a4 }
            java.lang.String r0 = "DELETE FROM chat_list WHERE  message_table_id=0  AND last_read_message_table_id=0  AND sort_timestamp=0  AND my_messages=0  AND plaintext_disabled=0  AND key_remote_jid NOT LIKE '%@g.us' AND key_remote_jid NOT LIKE '%@temp'"
            r3.A0B(r0)     // Catch:{ all -> 0x04a4 }
        L_0x00e6:
            monitor-enter(r11)     // Catch:{ all -> 0x04a4 }
            java.util.Map r0 = r11.A06     // Catch:{ all -> 0x049e }
            r51 = r0
            r51.clear()     // Catch:{ all -> 0x049e }
            java.util.Map r0 = r11.A07     // Catch:{ all -> 0x049e }
            r50 = r0
            r50.clear()     // Catch:{ all -> 0x049e }
            monitor-exit(r11)     // Catch:{ all -> 0x049e }
            r0 = r24
            X.0tg r3 = r0.A02     // Catch:{ all -> 0x04a4 }
            java.lang.String r43 = "chat_list"
            r46 = r41
            r47 = r41
            r48 = r41
            r49 = r41
            r42 = r3
            r44 = r2
            r45 = r41
            android.database.Cursor r13 = r42.A09(r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x04a4 }
            int r26 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0497 }
        L_0x0112:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0497 }
            if (r0 == 0) goto L_0x0334
            r0 = r26
            java.lang.String r0 = r13.getString(r0)     // Catch:{ all -> 0x0497 }
            X.0rv r2 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0497 }
            if (r2 != 0) goto L_0x013f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0497 }
            r1.<init>()     // Catch:{ all -> 0x0497 }
            java.lang.String r0 = "ChatStore/populateChatTable/could not parse raw chat jid: "
            r1.append(r0)     // Catch:{ all -> 0x0497 }
            r0 = r26
            java.lang.String r0 = r13.getString(r0)     // Catch:{ all -> 0x0497 }
            r1.append(r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0497 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0497 }
            goto L_0x0112
        L_0x013f:
            X.14v r0 = r11.A02     // Catch:{ all -> 0x0497 }
            long r15 = r0.A01(r2)     // Catch:{ all -> 0x0497 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0497 }
            r14.<init>()     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            r0 = r40
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = r13.getString(r0)     // Catch:{ all -> 0x0497 }
            r0 = r40
            r14.put(r0, r1)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "created_timestamp"
            r0 = r39
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r19 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "display_message_row_id"
            r0 = r38
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r19 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "last_message_row_id"
            r0 = r37
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r19 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "last_read_message_row_id"
            r0 = r36
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r19 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "last_read_receipt_sent_message_row_id"
            r0 = r35
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r19 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "last_important_message_row_id"
            r0 = r34
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r19 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            r0 = r33
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            int r0 = r13.getInt(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r0 = r33
            r14.put(r0, r1)     // Catch:{ all -> 0x0497 }
            r0 = r32
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r0 = r32
            r14.put(r0, r1)     // Catch:{ all -> 0x0497 }
            r0 = r31
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            double r0 = r13.getDouble(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r0 = r31
            r14.put(r0, r1)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "spam_detection"
            r0 = r30
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r19 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            r0 = r29
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r0 = r29
            r14.put(r0, r1)     // Catch:{ all -> 0x0497 }
            r0 = r28
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r0 = r28
            r14.put(r0, r1)     // Catch:{ all -> 0x0497 }
            int r0 = r13.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r14.put(r10, r0)     // Catch:{ all -> 0x0497 }
            int r0 = r13.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r14.put(r9, r0)     // Catch:{ all -> 0x0497 }
            int r0 = r13.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r14.put(r8, r0)     // Catch:{ all -> 0x0497 }
            int r0 = r13.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r14.put(r7, r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "change_number_notified_message_row_id"
            r0 = r27
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0497 }
            long r19 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            int r0 = r13.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r14.put(r6, r0)     // Catch:{ all -> 0x0497 }
            int r0 = r13.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r14.put(r5, r0)     // Catch:{ all -> 0x0497 }
            int r0 = r13.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0497 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0497 }
            r14.put(r4, r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r1 = "hidden"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0497 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0497 }
            java.lang.String r21 = "chat"
            java.lang.String r1 = "jid_row_id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0497 }
            r19 = r0
            java.lang.String r0 = java.lang.Long.toString(r15)     // Catch:{ all -> 0x0497 }
            r19[r12] = r0     // Catch:{ all -> 0x0497 }
            r15 = r1
            r1 = r21
            r0 = r19
            int r0 = r3.A00(r1, r14, r15, r0)     // Catch:{ all -> 0x0497 }
            long r0 = (long) r0     // Catch:{ all -> 0x0497 }
            r19 = 0
            int r15 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r15 != 0) goto L_0x0311
            r0 = r21
            long r0 = r3.A02(r14, r0)     // Catch:{ all -> 0x0497 }
            r15 = -1
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x030d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0497 }
            r1.<init>()     // Catch:{ all -> 0x0497 }
            java.lang.String r0 = "ChatStore/populateChatTable/error insert chat;jid="
            r1.append(r0)     // Catch:{ all -> 0x0497 }
            r1.append(r2)     // Catch:{ all -> 0x0497 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0497 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0497 }
            goto L_0x0112
        L_0x030d:
            int r14 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r14 != 0) goto L_0x0315
        L_0x0311:
            long r0 = r11.A03(r2)     // Catch:{ all -> 0x0497 }
        L_0x0315:
            X.0rt r14 = r11.A01     // Catch:{ all -> 0x0497 }
            X.0rx r14 = r14.A06(r2)     // Catch:{ all -> 0x0497 }
            if (r14 == 0) goto L_0x0112
            r14.A0U = r0     // Catch:{ all -> 0x0497 }
            monitor-enter(r11)     // Catch:{ all -> 0x0497 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0331 }
            r0 = r51
            r0.put(r2, r1)     // Catch:{ all -> 0x0331 }
            r0 = r50
            r0.put(r1, r2)     // Catch:{ all -> 0x0331 }
            monitor-exit(r11)     // Catch:{ all -> 0x0331 }
            goto L_0x0112
        L_0x0331:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0331 }
            throw r0     // Catch:{ all -> 0x0497 }
        L_0x0334:
            r13.close()     // Catch:{ all -> 0x04a4 }
            java.lang.String r1 = "SELECT DISTINCT key_remote_jid FROM messages LEFT JOIN (SELECT raw_string FROM jid AS jid JOIN chat AS chat ON jid._id = chat.jid_row_id) ON key_remote_jid = raw_string WHERE raw_string IS NULL"
            r0 = r41
            android.database.Cursor r6 = r3.A08(r1, r0)     // Catch:{ SQLiteBlobTooBigException -> 0x037f }
        L_0x033f:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0378 }
            if (r0 == 0) goto L_0x0373
            java.lang.String r0 = X.C33931jQ.A02(r6, r12)     // Catch:{ all -> 0x0378 }
            X.0rv r7 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0378 }
            if (r7 != 0) goto L_0x0355
            java.lang.String r0 = "ChatStore/populateChatTable/jid is null or invalid!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0378 }
            goto L_0x033f
        L_0x0355:
            long r4 = r11.A04(r7)     // Catch:{ all -> 0x0378 }
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x033f
            monitor-enter(r11)     // Catch:{ all -> 0x0378 }
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0370 }
            r0 = r51
            r0.put(r7, r1)     // Catch:{ all -> 0x0370 }
            r0 = r50
            r0.put(r1, r7)     // Catch:{ all -> 0x0370 }
            monitor-exit(r11)     // Catch:{ all -> 0x0370 }
            goto L_0x033f
        L_0x0370:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0370 }
            throw r0     // Catch:{ all -> 0x0378 }
        L_0x0373:
            r6.close()     // Catch:{ SQLiteBlobTooBigException -> 0x037f }
            goto L_0x040c
        L_0x0378:
            r0 = move-exception
            if (r6 == 0) goto L_0x037e
            r6.close()     // Catch:{ all -> 0x037e }
        L_0x037e:
            throw r0     // Catch:{ SQLiteBlobTooBigException -> 0x037f }
        L_0x037f:
            java.lang.String r1 = "SELECT DISTINCT key_remote_jid FROM messages"
            r0 = r41
            android.database.Cursor r4 = r3.A08(r1, r0)     // Catch:{ all -> 0x04a4 }
        L_0x0387:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x0409
            java.lang.String r0 = X.C33931jQ.A02(r4, r12)     // Catch:{ all -> 0x0490 }
            X.0rv r6 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0490 }
            if (r6 != 0) goto L_0x039d
            java.lang.String r0 = "ChatStore/alternativeInsertAllHiddenChats/jid is null or invalid!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0490 }
            goto L_0x0387
        L_0x039d:
            X.14v r0 = r11.A02     // Catch:{ all -> 0x0490 }
            long r7 = r0.A01(r6)     // Catch:{ all -> 0x0490 }
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x03be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0490 }
            r1.<init>()     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = "ChatStore/alternativeInsertAllHiddenChats/jid row id not found; jid="
            r1.append(r0)     // Catch:{ all -> 0x0490 }
            r1.append(r6)     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0490 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0490 }
            goto L_0x0387
        L_0x03be:
            java.lang.String r2 = "SELECT COUNT(1) as count FROM chat WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0490 }
            r1[r12] = r0     // Catch:{ all -> 0x0490 }
            android.database.Cursor r5 = r3.A08(r2, r1)     // Catch:{ all -> 0x0490 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0402 }
            if (r0 == 0) goto L_0x03fb
            java.lang.String r0 = "count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0402 }
            long r7 = r5.getLong(r0)     // Catch:{ all -> 0x0402 }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03fb
            long r1 = r11.A04(r6)     // Catch:{ all -> 0x0402 }
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x03fb
            monitor-enter(r11)     // Catch:{ all -> 0x0402 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x03ff }
            r0 = r51
            r0.put(r6, r1)     // Catch:{ all -> 0x03ff }
            r0 = r50
            r0.put(r1, r6)     // Catch:{ all -> 0x03ff }
            monitor-exit(r11)     // Catch:{ all -> 0x03ff }
        L_0x03fb:
            r5.close()     // Catch:{ all -> 0x0490 }
            goto L_0x0387
        L_0x03ff:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x03ff }
            throw r0     // Catch:{ all -> 0x0402 }
        L_0x0402:
            r0 = move-exception
            if (r5 == 0) goto L_0x0408
            r5.close()     // Catch:{ all -> 0x0408 }
        L_0x0408:
            throw r0     // Catch:{ all -> 0x0490 }
        L_0x0409:
            r4.close()     // Catch:{ all -> 0x04a4 }
        L_0x040c:
            java.lang.String r0 = "ChatStore/drop view"
            X.1Zf r3 = new X.1Zf     // Catch:{ all -> 0x04a4 }
            r3.<init>((java.lang.String) r0)     // Catch:{ all -> 0x04a4 }
            X.0tf r2 = r54.A02()     // Catch:{ all -> 0x04a4 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "DROP VIEW IF EXISTS chat_view"
            r1.A0B(r0)     // Catch:{ all -> 0x048b }
            r2.close()     // Catch:{ all -> 0x04a4 }
            java.lang.String r0 = "ChatChatStore/drop view time spent:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a4 }
            r2.<init>(r0)     // Catch:{ all -> 0x04a4 }
            long r0 = r3.A01()     // Catch:{ all -> 0x04a4 }
            r2.append(r0)     // Catch:{ all -> 0x04a4 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x04a4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04a4 }
            monitor-enter(r11)     // Catch:{ all -> 0x04a4 }
            X.0tf r4 = r54.A02()     // Catch:{ all -> 0x04a1 }
            r54.A04()     // Catch:{ all -> 0x0486 }
            java.lang.String r0 = "databasehelper/createChatView"
            X.1Zf r3 = new X.1Zf     // Catch:{ all -> 0x0486 }
            r3.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0486 }
            X.1cj r2 = r4.A00()     // Catch:{ all -> 0x0486 }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x0481 }
            java.lang.String r0 = "CREATE VIEW chat_view AS SELECT chat._id AS _id, jid.raw_string AS raw_string_jid, hidden AS hidden, subject AS subject, created_timestamp AS created_timestamp, display_message_row_id AS display_message_row_id, last_message_row_id AS last_message_row_id, last_read_message_row_id AS last_read_message_row_id, last_read_receipt_sent_message_row_id AS last_read_receipt_sent_message_row_id, last_important_message_row_id AS last_important_message_row_id, archived AS archived, sort_timestamp AS sort_timestamp, mod_tag AS mod_tag, gen AS gen, spam_detection AS spam_detection, unseen_earliest_message_received_time AS unseen_earliest_message_received_time, unseen_message_count AS unseen_message_count, unseen_missed_calls_count AS unseen_missed_calls_count, unseen_row_count AS unseen_row_count, unseen_message_reaction_count AS unseen_message_reaction_count, last_message_reaction_row_id AS last_message_reaction_row_id, last_seen_message_reaction_row_id AS last_seen_message_reaction_row_id, plaintext_disabled AS plaintext_disabled, vcard_ui_dismissed AS vcard_ui_dismissed, change_number_notified_message_row_id AS change_number_notified_message_row_id, show_group_description AS show_group_description, ephemeral_expiration AS ephemeral_expiration, last_read_ephemeral_message_row_id AS last_read_ephemeral_message_row_id, ephemeral_setting_timestamp AS ephemeral_setting_timestamp, ephemeral_disappearing_messages_initiator AS ephemeral_disappearing_messages_initiator, unseen_important_message_count AS unseen_important_message_count, group_type AS group_type, growth_lock_level AS growth_lock_level, growth_lock_expiration_ts AS growth_lock_expiration_ts, last_read_message_sort_id AS last_read_message_sort_id, display_message_sort_id AS display_message_sort_id, last_message_sort_id AS last_message_sort_id, last_read_receipt_sent_message_sort_id AS last_read_receipt_sent_message_sort_id, has_new_community_admin_dialog_been_acknowledged AS has_new_community_admin_dialog_been_acknowledged, history_sync_progress AS history_sync_progress FROM chat chat LEFT JOIN jid jid ON chat.jid_row_id = jid._id"
            r1.A0B(r0)     // Catch:{ all -> 0x0481 }
            r2.A00()     // Catch:{ all -> 0x0481 }
            r2.close()     // Catch:{ all -> 0x0486 }
            java.lang.String r0 = "databasehelper/createChatView time spent:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0486 }
            r2.<init>(r0)     // Catch:{ all -> 0x0486 }
            long r0 = r3.A01()     // Catch:{ all -> 0x0486 }
            r2.append(r0)     // Catch:{ all -> 0x0486 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0486 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0486 }
            r4.close()     // Catch:{ all -> 0x04a1 }
            monitor-exit(r11)     // Catch:{ all -> 0x04a4 }
            r2 = 2
            r1 = r52
            r0 = r25
            r1.A04(r0, r2)     // Catch:{ all -> 0x04a4 }
            r23.A00()     // Catch:{ all -> 0x04a4 }
            r23.close()     // Catch:{ all -> 0x04a9 }
            r24.close()     // Catch:{ SQLiteException -> 0x04ae }
            goto L_0x04be
        L_0x0481:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0485 }
        L_0x0485:
            throw r0     // Catch:{ all -> 0x0486 }
        L_0x0486:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x048a }
        L_0x048a:
            throw r0     // Catch:{ all -> 0x04a1 }
        L_0x048b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x049d }
            goto L_0x049d
        L_0x0490:
            r0 = move-exception
            if (r4 == 0) goto L_0x049d
            r4.close()     // Catch:{ all -> 0x049d }
            goto L_0x049d
        L_0x0497:
            r0 = move-exception
            if (r13 == 0) goto L_0x049d
            r13.close()     // Catch:{ all -> 0x049d }
        L_0x049d:
            throw r0     // Catch:{ all -> 0x04a4 }
        L_0x049e:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x049e }
            goto L_0x04a3
        L_0x04a1:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x04a4 }
        L_0x04a3:
            throw r0     // Catch:{ all -> 0x04a4 }
        L_0x04a4:
            r0 = move-exception
            r23.close()     // Catch:{ all -> 0x04a8 }
        L_0x04a8:
            throw r0     // Catch:{ all -> 0x04a9 }
        L_0x04a9:
            r0 = move-exception
            r24.close()     // Catch:{ all -> 0x04ad }
        L_0x04ad:
            throw r0     // Catch:{ SQLiteException -> 0x04ae }
        L_0x04ae:
            r1 = move-exception
            java.lang.String r0 = "ChatStore/populateChatTable/Error populating chat table"
            com.whatsapp.util.Log.e(r0, r1)
            X.0so r3 = r11.A00
            java.lang.String r2 = "ChatStore/populateChatTable"
            java.lang.String r1 = "ChatStore/populateChatTable/error"
            r0 = 1
            r3.AcB(r2, r1, r0)
        L_0x04be:
            java.lang.String r0 = "ChatStore/populateChatTable/time spent="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            long r0 = r22.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r54.A04()
            long r1 = r53.length()
            java.lang.String r0 = "ChatStore/populateChatTable/end/db size="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r0 = "; increase="
            r6.append(r0)
            double r4 = (double) r1
            r0 = r17
            double r2 = (double) r0
            double r4 = r4 / r2
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r55.A0L()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46432Eg.A0T(X.1bk):boolean");
    }
}
