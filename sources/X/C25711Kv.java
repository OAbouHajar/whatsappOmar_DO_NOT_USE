package X;

/* renamed from: X.1Kv  reason: invalid class name and case insensitive filesystem */
public class C25711Kv {
    public final C16920ts A00;
    public final AnonymousClass17F A01;
    public final C16900tq A02;

    public C25711Kv(C16920ts r1, AnonymousClass17F r2, C16900tq r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.AnonymousClass024 r8, X.C15830rv r9) {
        /*
            r7 = this;
            X.0tq r0 = r7.A02
            X.0tf r3 = r0.get()
            X.0tg r6 = r3.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r5 = "SELECT COUNT(*) as count FROM available_message_view WHERE message_type IN ('9', '26' ) AND origin != 7 AND chat_row_id = ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0041 }
            X.0ts r0 = r7.A00     // Catch:{ all -> 0x0041 }
            long r0 = r0.A02(r9)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0041 }
            r2 = 0
            r4[r2] = r0     // Catch:{ all -> 0x0041 }
            android.database.Cursor r1 = r6.A07(r8, r5, r4)     // Catch:{ all -> 0x0041 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003c }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x003c }
            r1.close()     // Catch:{ all -> 0x0041 }
            r3.close()
            return r0
        L_0x0035:
            r1.close()     // Catch:{ all -> 0x0041 }
            r3.close()
            return r2
        L_0x003c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25711Kv.A00(X.024, X.0rv):int");
    }
}
