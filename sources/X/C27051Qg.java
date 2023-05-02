package X;

/* renamed from: X.1Qg  reason: invalid class name and case insensitive filesystem */
public class C27051Qg {
    public final C209912j A00;

    public C27051Qg(C209912j r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:55|56|57|58|59) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00bc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int A00(java.lang.String r18) {
        /*
            r17 = this;
            r3 = r17
            monitor-enter(r3)
            X.12j r0 = r3.A00     // Catch:{ all -> 0x00bd }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x00bd }
            X.1cj r8 = r4.A00()     // Catch:{ all -> 0x00b8 }
            java.lang.String r12 = "sticker_pack_id = ?"
            r1 = 1
            java.lang.String[] r13 = new java.lang.String[r1]     // Catch:{ all -> 0x00b3 }
            r0 = 0
            r6 = r18
            r13[r0] = r18     // Catch:{ all -> 0x00b3 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x00b3 }
            java.lang.String r10 = "sticker_pack_order"
            java.lang.String[] r11 = new java.lang.String[r1]     // Catch:{ all -> 0x00b3 }
            java.lang.String r5 = "pack_order"
            r11[r0] = r5     // Catch:{ all -> 0x00b3 }
            r14 = 0
            r16 = r14
            r15 = r14
            android.database.Cursor r1 = r9.A09(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00b3 }
            int r0 = r1.getCount()     // Catch:{ all -> 0x00ac }
            if (r0 <= 0) goto L_0x004a
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x004a
            int r0 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x00ac }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x00ac }
            r1.close()     // Catch:{ all -> 0x00b3 }
            r8.close()     // Catch:{ all -> 0x00b8 }
            r4.close()     // Catch:{ all -> 0x00bd }
            monitor-exit(r3)
            return r0
        L_0x004a:
            r1.close()     // Catch:{ all -> 0x00b3 }
            r7 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = "SELECT MAX(pack_order) as max_order FROM sticker_pack_order"
            android.database.Cursor r2 = r9.A08(r0, r14)     // Catch:{ all -> 0x00b3 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x00a5 }
            if (r0 <= 0) goto L_0x006c
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "max_order"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a5 }
            int r7 = r2.getInt(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x0080
        L_0x006c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r1.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "StickerPackOderDBTableHelper/getOrAddStickerPackOrder/max order is not available for sticker pack: "
            r1.append(r0)     // Catch:{ all -> 0x00a5 }
            r1.append(r6)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a5 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a5 }
        L_0x0080:
            r2.close()     // Catch:{ all -> 0x00b3 }
            int r2 = r7 + 1
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "sticker_pack_id"
            r1.put(r0, r6)     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00b3 }
            r1.put(r5, r0)     // Catch:{ all -> 0x00b3 }
            r9.A03(r1, r10)     // Catch:{ all -> 0x00b3 }
            r8.A00()     // Catch:{ all -> 0x00b3 }
            r8.close()     // Catch:{ all -> 0x00b8 }
            r4.close()     // Catch:{ all -> 0x00bd }
            monitor-exit(r3)
            return r2
        L_0x00a5:
            r0 = move-exception
            if (r2 == 0) goto L_0x00b2
            r2.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b2
        L_0x00ac:
            r0 = move-exception
            if (r1 == 0) goto L_0x00b2
            r1.close()     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27051Qg.A00(java.lang.String):int");
    }
}
