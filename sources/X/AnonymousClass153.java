package X;

/* renamed from: X.153  reason: invalid class name */
public class AnonymousClass153 {
    public final AnonymousClass126 A00;
    public final C16900tq A01;

    public AnonymousClass153(AnonymousClass126 r1, C16900tq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(X.C16740tZ r8) {
        /*
            r7 = this;
            X.0tq r0 = r7.A01
            X.0tf r4 = r0.get()
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x003c }
            java.lang.String r5 = "SELECT message_template_id FROM messages_hydrated_four_row_template WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x003c }
            r2 = 0
            long r0 = r8.A13     // Catch:{ all -> 0x003c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x003c }
            r3[r2] = r0     // Catch:{ all -> 0x003c }
            android.database.Cursor r3 = r6.A08(r5, r3)     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r3 == 0) goto L_0x0033
            java.lang.String r0 = "message_template_id"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002e }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = r3.getString(r1)     // Catch:{ all -> 0x002e }
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            r3.close()     // Catch:{ all -> 0x003c }
        L_0x0038:
            r4.close()
            return r2
        L_0x003c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass153.A00(X.0tZ):java.lang.String");
    }
}
