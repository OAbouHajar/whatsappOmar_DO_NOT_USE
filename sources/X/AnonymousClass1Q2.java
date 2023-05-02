package X;

/* renamed from: X.1Q2  reason: invalid class name */
public class AnonymousClass1Q2 {
    public final C16900tq A00;

    public AnonymousClass1Q2(C16900tq r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0047=Splitter:B:17:0x0047, B:9:0x003a=Splitter:B:9:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(long r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A00
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "SELECT _id, message_poll_option_id FROM message_add_on_poll_vote_selected_option WHERE message_add_on_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0048 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x0048 }
            r2[r1] = r0     // Catch:{ all -> 0x0048 }
            android.database.Cursor r4 = r4.A08(r3, r2)     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0041 }
            r3.<init>()     // Catch:{ all -> 0x0041 }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "message_poll_option_id"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0041 }
        L_0x0029:
            long r0 = r4.getLong(r2)     // Catch:{ all -> 0x0041 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0041 }
            r3.add(r0)     // Catch:{ all -> 0x0041 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0029
        L_0x003a:
            r4.close()     // Catch:{ all -> 0x0048 }
            r5.close()
            return r3
        L_0x0041:
            r0 = move-exception
            if (r4 == 0) goto L_0x0047
            r4.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q2.A00(long):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0076 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16800tf r11, X.C39181s3 r12, long r13) {
        /*
            r10 = this;
            X.1cj r9 = r11.A00()
            r0 = 3
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0077 }
            r3.<init>(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = "message_add_on_row_id"
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0077 }
            r3.put(r7, r6)     // Catch:{ all -> 0x0077 }
            java.lang.String r2 = "sender_timestamp"
            long r0 = r12.A00     // Catch:{ all -> 0x0077 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0077 }
            r3.put(r2, r0)     // Catch:{ all -> 0x0077 }
            X.0tg r5 = r11.A02     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "message_add_on_poll_vote"
            r5.A03(r3, r0)     // Catch:{ all -> 0x0077 }
            X.1cj r8 = r11.A00()     // Catch:{ all -> 0x0077 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0072 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = "message_add_on_poll_vote_selected_option"
            java.lang.String r0 = "message_add_on_row_id = ?"
            r5.A01(r4, r0, r2)     // Catch:{ all -> 0x0072 }
            java.util.List r1 = r12.A05     // Catch:{ all -> 0x0072 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0065
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0072 }
        L_0x0047:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0072 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0072 }
            r0 = 2
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0072 }
            r1.<init>(r0)     // Catch:{ all -> 0x0072 }
            r1.put(r7, r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "message_poll_option_id"
            r1.put(r0, r2)     // Catch:{ all -> 0x0072 }
            r5.A03(r1, r4)     // Catch:{ all -> 0x0072 }
            goto L_0x0047
        L_0x0065:
            r8.A00()     // Catch:{ all -> 0x0072 }
            r8.close()     // Catch:{ all -> 0x0077 }
            r9.A00()     // Catch:{ all -> 0x0077 }
            r9.close()
            return
        L_0x0072:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q2.A01(X.0tf, X.1s3, long):void");
    }
}
