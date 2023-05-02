package X;

/* renamed from: X.1Qh  reason: invalid class name and case insensitive filesystem */
public class C27061Qh {
    public final C16300so A00;
    public final C209912j A01;

    public C27061Qh(C16300so r1, C209912j r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00dc, code lost:
        if (android.text.TextUtils.isEmpty(r17) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ec, code lost:
        if (android.text.TextUtils.isEmpty(r15) == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fc, code lost:
        if (android.text.TextUtils.isEmpty(r14) == false) goto L_0x00fe;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x01c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x01c6 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a8 A[Catch:{ all -> 0x01bb, all -> 0x01c1, all -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ad A[Catch:{ all -> 0x01bb, all -> 0x01c1, all -> 0x01c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00(java.lang.String r36, java.lang.String[] r37) {
        /*
            r35 = this;
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r34 = r35
            r0 = r34
            X.12j r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x01c7 }
            X.0tf r33 = r0.get()     // Catch:{ IllegalArgumentException -> 0x01c7 }
            r0 = r33
            X.0tg r0 = r0.A02     // Catch:{ all -> 0x01c2 }
            r2 = r36
            r1 = r37
            android.database.Cursor r11 = r0.A08(r2, r1)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "id"
            int r32 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "name"
            int r31 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "publisher"
            int r30 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "description"
            int r29 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "size"
            int r28 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "tray_image_id"
            int r27 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "tray_image_preview_id"
            int r26 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "preview_image_id_array"
            int r25 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "image_data_hash"
            int r24 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "animated_pack"
            int r23 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_id"
            int r22 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_name"
            int r21 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_publisher"
            int r20 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_description"
            int r19 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_size"
            int r18 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_image_data_hash"
            int r9 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_tray_image_id"
            int r8 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_tray_image_preview_id"
            int r7 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_animated_pack"
            int r6 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_is_avatar_pack"
            int r5 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_empty_recents_avatar_template_id"
            int r4 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "installed_empty_favorites_avatar_template_id"
            int r3 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01bb }
        L_0x00a2:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x01b4
            X.1ph r2 = new X.1ph     // Catch:{ all -> 0x01bb }
            r2.<init>()     // Catch:{ all -> 0x01bb }
            r0 = r32
            java.lang.String r13 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r0 = r31
            java.lang.String r12 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r0 = r30
            java.lang.String r1 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r0 = r22
            java.lang.String r17 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r0 = r21
            java.lang.String r15 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r0 = r20
            java.lang.String r14 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x00de
            boolean r16 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x01bb }
            r0 = 1
            if (r16 != 0) goto L_0x00df
        L_0x00de:
            r0 = 0
        L_0x00df:
            if (r0 != 0) goto L_0x01a5
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x00ee
            boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x01bb }
            r0 = 1
            if (r16 != 0) goto L_0x00ef
        L_0x00ee:
            r0 = 0
        L_0x00ef:
            if (r0 != 0) goto L_0x01a5
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x00fe
            boolean r16 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x01bb }
            r0 = 1
            if (r16 != 0) goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            if (r0 != 0) goto L_0x01a5
            r2.A0D = r13     // Catch:{ all -> 0x01bb }
            r2.A0F = r12     // Catch:{ all -> 0x01bb }
            r2.A0H = r1     // Catch:{ all -> 0x01bb }
            r0 = r29
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r2.A02 = r0     // Catch:{ all -> 0x01bb }
            r0 = r28
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x01bb }
            long r0 = (long) r0     // Catch:{ all -> 0x01bb }
            r2.A01 = r0     // Catch:{ all -> 0x01bb }
            r0 = r27
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r2.A0J = r0     // Catch:{ all -> 0x01bb }
            r0 = r24
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r2.A0E = r0     // Catch:{ all -> 0x01bb }
            r0 = r26
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r2.A0K = r0     // Catch:{ all -> 0x01bb }
            r0 = r23
            int r1 = r11.getInt(r0)     // Catch:{ all -> 0x01bb }
            r13 = 0
            r12 = 1
            r0 = 0
            if (r1 != r12) goto L_0x013c
            r0 = 1
        L_0x013c:
            r2.A0N = r0     // Catch:{ all -> 0x01bb }
            r0 = r25
            java.lang.String r1 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x0156
            java.lang.String r0 = ","
            java.lang.String[] r0 = android.text.TextUtils.split(r1, r0)     // Catch:{ all -> 0x01bb }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x01bb }
            r2.A0L = r0     // Catch:{ all -> 0x01bb }
        L_0x0156:
            r0 = r17
            r2.A04 = r0     // Catch:{ all -> 0x01bb }
            r2.A06 = r15     // Catch:{ all -> 0x01bb }
            r0 = r19
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01bb }
            r2.A03 = r0     // Catch:{ all -> 0x01bb }
            r2.A07 = r14     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r11.getString(r9)     // Catch:{ all -> 0x01bb }
            r2.A05 = r0     // Catch:{ all -> 0x01bb }
            r0 = r18
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x01bb }
            long r0 = (long) r0     // Catch:{ all -> 0x01bb }
            r2.A00 = r0     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r11.getString(r8)     // Catch:{ all -> 0x01bb }
            r2.A08 = r0     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r11.getString(r7)     // Catch:{ all -> 0x01bb }
            r2.A09 = r0     // Catch:{ all -> 0x01bb }
            int r1 = r11.getInt(r6)     // Catch:{ all -> 0x01bb }
            r0 = 0
            if (r1 != r12) goto L_0x0189
            r0 = 1
        L_0x0189:
            r2.A0P = r0     // Catch:{ all -> 0x01bb }
            int r0 = r11.getInt(r5)     // Catch:{ all -> 0x01bb }
            if (r0 != r12) goto L_0x0192
            r13 = 1
        L_0x0192:
            r2.A0Q = r13     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r11.getString(r3)     // Catch:{ all -> 0x01bb }
            r2.A0A = r0     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r11.getString(r4)     // Catch:{ all -> 0x01bb }
            r2.A0B = r0     // Catch:{ all -> 0x01bb }
            X.1pi r0 = r2.A00()     // Catch:{ all -> 0x01bb }
            goto L_0x01a6
        L_0x01a5:
            r0 = 0
        L_0x01a6:
            if (r0 == 0) goto L_0x01ad
            r10.add(r0)     // Catch:{ all -> 0x01bb }
            goto L_0x00a2
        L_0x01ad:
            java.lang.String r0 = "StickerPackDBTableHelper/readStickerPackListFromDBTable/sticker pack is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01bb }
            goto L_0x00a2
        L_0x01b4:
            r11.close()     // Catch:{ all -> 0x01c2 }
            r33.close()     // Catch:{ IllegalArgumentException -> 0x01c7 }
            return r10
        L_0x01bb:
            r0 = move-exception
            if (r11 == 0) goto L_0x01c1
            r11.close()     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x01c2:
            r0 = move-exception
            r33.close()     // Catch:{ all -> 0x01c6 }
        L_0x01c6:
            throw r0     // Catch:{ IllegalArgumentException -> 0x01c7 }
        L_0x01c7:
            r3 = move-exception
            java.lang.String r0 = "StickerPackDBTableHelper/readStickerPackListFromDBTable/exception"
            com.whatsapp.util.Log.e(r0, r3)
            r0 = r34
            X.0so r2 = r0.A00
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "StickerPackDBTableHelper/readStickerPackListFromDBTable/"
            r2.A03(r0, r1, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27061Qh.A00(java.lang.String, java.lang.String[]):java.util.List");
    }
}
