package X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.1Hw  reason: invalid class name and case insensitive filesystem */
public class C24941Hw {
    public final AnonymousClass11R A00;
    public final AnonymousClass19K A01;
    public final AnonymousClass1y0 A02;

    public C24941Hw(AnonymousClass11R r3, AnonymousClass19K r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = new AnonymousClass1y0(r4, 1);
    }

    public static final void A00(C37281ou r4, C52362dg r5) {
        SQLiteStatement sQLiteStatement = r4.A00;
        sQLiteStatement.clearBindings();
        r4.A02(1, r5.A08);
        r4.A01(2, (long) r5.A01);
        r4.A01(3, (long) r5.A00);
        sQLiteStatement.bindBlob(4, r5.A09);
        r4.A02(5, r5.A07);
        r4.A02(6, r5.A06);
        r4.A01(7, r5.A02);
        r4.A02(8, r5.A04);
        sQLiteStatement.bindNull(9);
        r4.A01(10, r5.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0092 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C52362dg A01() {
        /*
            r9 = this;
            X.AnonymousClass00B.A00()
            X.AnonymousClass00B.A00()
            X.19K r4 = r9.A01
            X.0tf r5 = r4.get()
            X.0tg r8 = r5.A02     // Catch:{ all -> 0x00a3 }
            java.lang.String r7 = "SELECT message_id, sync_type, chunk_order, media_key, media_hash, media_enc_hash, file_size, direct_path, local_path, start_time FROM history_sync_companion WHERE sync_type IN (?, ?, ?) AND chunk_order = ? ORDER BY sync_type ASC"
            r6 = 4
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ all -> 0x00a3 }
            r0 = 0
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            r3[r0] = r2     // Catch:{ all -> 0x00a3 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00a3 }
            r3[r1] = r0     // Catch:{ all -> 0x00a3 }
            r1 = 2
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00a3 }
            r3[r1] = r0     // Catch:{ all -> 0x00a3 }
            r0 = 3
            r3[r0] = r2     // Catch:{ all -> 0x00a3 }
            android.database.Cursor r1 = r8.A08(r7, r3)     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0041
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0041
            X.2dg r0 = X.C52362dg.A00(r1)     // Catch:{ all -> 0x003c }
            goto L_0x0044
        L_0x003c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x0041:
            r0 = 0
            if (r1 == 0) goto L_0x0047
        L_0x0044:
            r1.close()     // Catch:{ all -> 0x00a3 }
        L_0x0047:
            r5.close()
            if (r0 != 0) goto L_0x00a2
            X.11R r0 = r9.A00
            org.json.JSONObject r7 = r0.A01()
            r6 = 0
            if (r7 == 0) goto L_0x00a1
            X.0tf r4 = r4.get()
            X.0tg r5 = r4.A02     // Catch:{ JSONException -> 0x0093 }
            java.lang.String r3 = "SELECT message_id, sync_type, chunk_order, media_key, media_hash, media_enc_hash, file_size, direct_path, local_path, start_time FROM history_sync_companion WHERE sync_type=? AND chunk_order=?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ JSONException -> 0x0093 }
            r1 = 0
            java.lang.String r0 = "sync_type"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x0093 }
            r2[r1] = r0     // Catch:{ JSONException -> 0x0093 }
            r1 = 1
            java.lang.String r0 = "chunk_order"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x0093 }
            r2[r1] = r0     // Catch:{ JSONException -> 0x0093 }
            android.database.Cursor r1 = r5.A08(r3, r2)     // Catch:{ JSONException -> 0x0093 }
            if (r1 == 0) goto L_0x0098
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x0083
            r1.close()     // Catch:{ JSONException -> 0x0093 }
            goto L_0x0098
        L_0x0083:
            X.2dg r0 = X.C52362dg.A00(r1)     // Catch:{ all -> 0x008e }
            r1.close()     // Catch:{ JSONException -> 0x0093 }
            r4.close()
            return r0
        L_0x008e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0092 }
        L_0x0092:
            throw r0     // Catch:{ JSONException -> 0x0093 }
        L_0x0093:
            java.lang.String r0 = "HistorySyncCompanionStore/ Could not read history sync state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x009c }
        L_0x0098:
            r4.close()
            return r6
        L_0x009c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00a7 }
            throw r0
        L_0x00a1:
            return r6
        L_0x00a2:
            return r0
        L_0x00a3:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24941Hw.A01():X.2dg");
    }

    public void A02(String str) {
        AnonymousClass00B.A00();
        C16800tf A022 = this.A01.A02();
        try {
            A022.A02.A0C("DELETE FROM history_sync_companion WHERE message_id=?", new String[]{str});
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
