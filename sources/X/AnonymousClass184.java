package X;

/* renamed from: X.184  reason: invalid class name */
public class AnonymousClass184 {
    public final C16900tq A00;

    public AnonymousClass184(C16900tq r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0073 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0073=Splitter:B:15:0x0073, B:10:0x006b=Splitter:B:10:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C34601kX A00(X.C16740tZ r10) {
        /*
            r9 = this;
            X.1kX r6 = new X.1kX
            r6.<init>(r10)
            long r3 = r10.A13
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007d
            X.0tq r0 = r9.A00
            X.0tf r4 = r0.get()
            X.0tg r7 = r4.A02     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "SELECT duration, campaign_id, first_seen_timestamp, action_link_url, action_link_button_title FROM message_status_psa_campaign WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0078 }
            r2 = 0
            long r0 = r10.A13     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0078 }
            r3[r2] = r0     // Catch:{ all -> 0x0078 }
            android.database.Cursor r5 = r7.A08(r5, r3)     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x0074
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "campaign_id"
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "duration"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "first_seen_timestamp"
            int r7 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "action_link_url"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "action_link_button_title"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r5.getString(r8)     // Catch:{ all -> 0x006f }
            r6.A04 = r0     // Catch:{ all -> 0x006f }
            long r0 = r5.getLong(r1)     // Catch:{ all -> 0x006f }
            r6.A00 = r0     // Catch:{ all -> 0x006f }
            long r0 = r5.getLong(r7)     // Catch:{ all -> 0x006f }
            r6.A01 = r0     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r5.getString(r3)     // Catch:{ all -> 0x006f }
            r6.A03 = r0     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x006f }
            r6.A02 = r0     // Catch:{ all -> 0x006f }
        L_0x006b:
            r5.close()     // Catch:{ all -> 0x0078 }
            goto L_0x0074
        L_0x006f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0073 }
        L_0x0073:
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0074:
            r4.close()
            return r6
        L_0x0078:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x007c }
        L_0x007c:
            throw r0
        L_0x007d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass184.A00(X.0tZ):X.1kX");
    }
}
