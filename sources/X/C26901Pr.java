package X;

/* renamed from: X.1Pr  reason: invalid class name and case insensitive filesystem */
public class C26901Pr {
    public final C224217w A00;
    public final C223617q A01;

    public C26901Pr(C224217w r1, C223617q r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0116 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x011b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.C15830rv r10, long r11) {
        /*
            r9 = this;
            X.17q r8 = r9.A01
            boolean r0 = r8.A06()
            if (r0 == 0) goto L_0x0010
            java.lang.String r7 = "SELECT message._id as _id FROM message_quoted JOIN message_view AS message ON message_quoted.message_row_id = message._id WHERE message.sort_id > ? AND message.chat_row_id = ? AND message.message_type <> 15 AND message_quoted.from_me = 1 LIMIT 100"
        L_0x000a:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            goto L_0x0013
        L_0x0010:
            java.lang.String r7 = "SELECT message._id as _id FROM message_view AS message LEFT JOIN messages_quotes ON message.quoted_row_id = messages_quotes._id WHERE message._id > ? AND message.chat_row_id = ? AND message.quoted_row_id IS NOT NULL AND message.message_type <> 15 AND messages_quotes.key_from_me = 1 LIMIT 100"
            goto L_0x000a
        L_0x0013:
            X.0tq r0 = r8.A0C     // Catch:{ Exception -> 0x0061 }
            X.0tf r4 = r0.get()     // Catch:{ Exception -> 0x0061 }
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x005c }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x005c }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x005c }
            r3[r1] = r0     // Catch:{ all -> 0x005c }
            r2 = 1
            X.0ts r0 = r8.A03     // Catch:{ all -> 0x005c }
            long r0 = r0.A02(r10)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005c }
            r3[r2] = r0     // Catch:{ all -> 0x005c }
            android.database.Cursor r3 = r6.A08(r7, r3)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0055 }
        L_0x003c:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004e
            long r0 = r3.getLong(r2)     // Catch:{ all -> 0x0055 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r5.add(r0)     // Catch:{ all -> 0x0055 }
            goto L_0x003c
        L_0x004e:
            r3.close()     // Catch:{ all -> 0x005c }
            r4.close()     // Catch:{ Exception -> 0x0061 }
            goto L_0x0067
        L_0x0055:
            r0 = move-exception
            if (r3 == 0) goto L_0x005b
            r3.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            java.lang.String r0 = "QuotedMessageStore/getQuotedImportantMessagesNewerThanCount"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0067:
            X.17w r6 = r9.A00
            X.0sK r0 = r6.A00
            r0.A0B()
            X.1ZT r2 = r0.A05
            java.util.HashSet r4 = new java.util.HashSet
            if (r2 != 0) goto L_0x007f
            r4.<init>()
        L_0x0077:
            r5.addAll(r4)
            int r0 = r5.size()
            return r0
        L_0x007f:
            r4.<init>()
            boolean r0 = r6.A02()
            r8 = 1
            r1 = 0
            r7 = 2
            if (r0 == 0) goto L_0x00af
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r3[r1] = r0
            X.0ts r0 = r6.A01
            long r0 = r0.A02(r10)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r8] = r0
            X.14v r0 = r6.A02
            long r0 = r0.A01(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r7] = r0
            java.lang.String r1 = "SELECT message._id AS _id FROM message_mentions JOIN message_view AS message ON message_mentions.message_row_id == message._id WHERE message.sort_id > ? AND message.chat_row_id = ? AND message_mentions.jid_row_id = ? AND message.message_type <> 15 LIMIT 100"
            goto L_0x00e4
        L_0x00af:
            java.lang.String[] r3 = new java.lang.String[r7]
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r3[r1] = r0
            X.0ts r0 = r6.A01
            long r0 = r0.A02(r10)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r8] = r0
            java.lang.String r2 = r2.getRawString()
            java.lang.String r0 = "SELECT _id FROM message_view WHERE _id > ? AND chat_row_id = ? AND "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "mentioned_jids LIKE '%"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "%'"
            r1.append(r0)
            java.lang.String r0 = " LIMIT 100"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L_0x00e4:
            X.0tq r0 = r6.A03     // Catch:{ Exception -> 0x011c }
            X.0tf r6 = r0.get()     // Catch:{ Exception -> 0x011c }
            X.0tg r0 = r6.A02     // Catch:{ all -> 0x0117 }
            android.database.Cursor r3 = r0.A08(r1, r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0110 }
        L_0x00f6:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0108
            long r0 = r3.getLong(r2)     // Catch:{ all -> 0x0110 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0110 }
            r4.add(r0)     // Catch:{ all -> 0x0110 }
            goto L_0x00f6
        L_0x0108:
            r3.close()     // Catch:{ all -> 0x0117 }
            r6.close()     // Catch:{ Exception -> 0x011c }
            goto L_0x0077
        L_0x0110:
            r0 = move-exception
            if (r3 == 0) goto L_0x0116
            r3.close()     // Catch:{ all -> 0x0116 }
        L_0x0116:
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x011b }
        L_0x011b:
            throw r0     // Catch:{ Exception -> 0x011c }
        L_0x011c:
            r1 = move-exception
            java.lang.String r0 = "MentionMessageStore/getMentionImportantMessagesNewerThanCount"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26901Pr.A00(X.0rv, long):int");
    }
}
