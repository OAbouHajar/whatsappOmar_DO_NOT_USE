package X;

/* renamed from: X.18Q  reason: invalid class name */
public class AnonymousClass18Q {
    public final C216314v A00;
    public final AnonymousClass11X A01;

    public AnonymousClass18Q(C216314v r1, AnonymousClass11X r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0041 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0041=Splitter:B:16:0x0041, B:8:0x0034=Splitter:B:8:0x0034} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A00(com.whatsapp.jid.GroupJid r8) {
        /*
            r7 = this;
            X.11X r0 = r7.A01
            X.0tf r3 = r0.get()
            X.0tg r6 = r3.A02     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = "SELECT member_count FROM group_membership_count WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0042 }
            r2 = 0
            X.14v r0 = r7.A00     // Catch:{ all -> 0x0042 }
            long r0 = r0.A01(r8)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0042 }
            r4[r2] = r0     // Catch:{ all -> 0x0042 }
            android.database.Cursor r1 = r6.A08(r5, r4)     // Catch:{ all -> 0x0042 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "member_count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003b }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x003b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x003b }
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r1.close()     // Catch:{ all -> 0x0042 }
            r3.close()
            return r0
        L_0x003b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18Q.A00(com.whatsapp.jid.GroupJid):java.lang.Integer");
    }
}
