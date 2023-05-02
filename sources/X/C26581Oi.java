package X;

/* renamed from: X.1Oi  reason: invalid class name and case insensitive filesystem */
public class C26581Oi {
    public final C16900tq A00;

    public C26581Oi(C16900tq r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A00(long r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.Long.toString(r5)
            r0 = 0
            r3[r0] = r1
            X.0tq r0 = r4.A00
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "SELECT rating FROM message_rating WHERE message_row_id = ?"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003a
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "rating"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0035 }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0035 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0035 }
            r1.close()     // Catch:{ all -> 0x0044 }
            r2.close()
            return r0
        L_0x0035:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x0044 }
        L_0x003f:
            r2.close()
            r0 = 0
            return r0
        L_0x0044:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26581Oi.A00(long):java.lang.Integer");
    }
}
