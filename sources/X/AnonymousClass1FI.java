package X;

/* renamed from: X.1FI  reason: invalid class name */
public class AnonymousClass1FI {
    public final C216915b A00;

    public AnonymousClass1FI(C216915b r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c1 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00c1=Splitter:B:28:0x00c1, B:21:0x00b6=Splitter:B:21:0x00b6} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(com.whatsapp.jid.GroupJid r13, int r14, int r15) {
        /*
            r12 = this;
            if (r15 == 0) goto L_0x0017
            r0 = 1
            if (r15 == r0) goto L_0x0014
            r0 = 2
            if (r15 == r0) goto L_0x0011
            java.lang.String r6 = "pnh_indicator_clicks_info_screen"
        L_0x000a:
            X.15b r0 = r12.A00
            X.0tf r4 = r0.A02()
            goto L_0x001a
        L_0x0011:
            java.lang.String r6 = "pnh_indicator_clicks_chat"
            goto L_0x000a
        L_0x0014:
            java.lang.String r6 = "reaction_delete_count"
            goto L_0x000a
        L_0x0017:
            java.lang.String r6 = "reaction_open_tray_count"
            goto L_0x000a
        L_0x001a:
            X.1cj r11 = r4.A00()     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = "pnh_daily_event_logging"
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x00bd }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C33961jT.A00(r3, r0, r5)     // Catch:{ all -> 0x00bd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00bd }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "PnhDailyActionLoggingStore/incrementCount: table does not exist"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00bd }
            goto L_0x00b6
        L_0x003a:
            java.lang.String r0 = "UPDATE "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r1.<init>(r0)     // Catch:{ all -> 0x00bd }
            r1.append(r5)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = " SET "
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            r1.append(r6)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = " = "
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            r1.append(r6)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = " + ?"
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = " WHERE "
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r8 = "community_id"
            r1.append(r8)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = " = ? AND "
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = "type_of_subgroup"
            r1.append(r7)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = " = ?"
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bd }
            X.1ou r10 = r3.A0A(r0)     // Catch:{ all -> 0x00bd }
            r0 = 1
            r2 = 1
            r10.A01(r2, r0)     // Catch:{ all -> 0x00bd }
            r1 = 2
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x00bd }
            r10.A02(r1, r0)     // Catch:{ all -> 0x00bd }
            long r0 = (long) r14     // Catch:{ all -> 0x00bd }
            r9 = 3
            r10.A01(r9, r0)     // Catch:{ all -> 0x00bd }
            android.database.sqlite.SQLiteStatement r0 = r10.A00     // Catch:{ all -> 0x00bd }
            int r0 = r0.executeUpdateDelete()     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x00b3
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x00bd }
            r1.<init>(r9)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x00bd }
            r1.put(r8, r0)     // Catch:{ all -> 0x00bd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00bd }
            r1.put(r7, r0)     // Catch:{ all -> 0x00bd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00bd }
            r1.put(r6, r0)     // Catch:{ all -> 0x00bd }
            r3.A02(r1, r5)     // Catch:{ all -> 0x00bd }
        L_0x00b3:
            r11.A00()     // Catch:{ all -> 0x00bd }
        L_0x00b6:
            r11.close()     // Catch:{ all -> 0x00c2 }
            r4.close()
            return
        L_0x00bd:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FI.A00(com.whatsapp.jid.GroupJid, int, int):void");
    }
}
