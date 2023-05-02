package X;

/* renamed from: X.0tA  reason: invalid class name and case insensitive filesystem */
public class C16500tA {
    public final C16770tc A00;

    public C16500tA(C16770tc r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0031=Splitter:B:8:0x0031, B:16:0x003e=Splitter:B:16:0x003e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(java.lang.String r8) {
        /*
            r7 = this;
            X.0tc r0 = r7.A00
            X.0tf r4 = r0.get()
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x003f }
            java.lang.String r5 = "SELECT file_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?"
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x003f }
            r0 = 0
            r3[r0] = r8     // Catch:{ all -> 0x003f }
            r2 = 1
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x003f }
            r3[r2] = r0     // Catch:{ all -> 0x003f }
            android.database.Cursor r1 = r6.A08(r5, r3)     // Catch:{ all -> 0x003f }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0027
            r0 = 0
            goto L_0x0031
        L_0x0027:
            java.lang.String r0 = "file_name"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0038 }
        L_0x0031:
            r1.close()     // Catch:{ all -> 0x003f }
            r4.close()
            return r0
        L_0x0038:
            r0 = move-exception
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16500tA.A00(java.lang.String):java.lang.String");
    }

    public void A01(String str, String str2, String str3, String str4) {
        C16800tf A02 = this.A00.A02();
        try {
            C37281ou A0A = A02.A02.A0A("INSERT INTO shared_media_ids (item_uuid, file_name, mime_type, display_name, expiration_timestamp) VALUES (?, ?, ?, ?, ?)");
            A0A.A02(1, str);
            A0A.A02(2, str2);
            A0A.A02(3, str3);
            if (str4 == null) {
                A0A.A00.bindNull(4);
            } else {
                A0A.A02(4, str4);
            }
            A0A.A02(5, String.valueOf(System.currentTimeMillis() + 3600000));
            A0A.A00.executeInsert();
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
