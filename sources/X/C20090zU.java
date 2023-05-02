package X;

/* renamed from: X.0zU  reason: invalid class name and case insensitive filesystem */
public class C20090zU {
    public final C15860rz A00;
    public final C14710pd A01;
    public final C214314b A02;
    public final C215014i A03;
    public final C214914h A04;
    public final AnonymousClass14X A05;
    public final C16320sq A06;
    public final AnonymousClass12P A07;

    public C20090zU(C15860rz r1, C14710pd r2, C214314b r3, C215014i r4, C214914h r5, AnonymousClass14X r6, C16320sq r7, AnonymousClass12P r8) {
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x016d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0225 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x022a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x023f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00() {
        /*
            r14 = this;
            X.14X r0 = r14.A05
            X.AnonymousClass00B.A00()
            X.1Qh r7 = r0.A04
            r1 = 0
            java.lang.String r0 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id)"
            java.util.List r13 = r7.A00(r0, r1)
            X.14h r0 = r14.A04
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            X.12j r11 = r0.A00
            X.0tf r4 = r11.get()
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0240 }
            java.lang.String r1 = "SELECT pack_id FROM new_sticker_packs"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r10 = "pack_id"
            int r1 = r2.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0239 }
        L_0x002a:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0239 }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x0239 }
            r3.add(r0)     // Catch:{ all -> 0x0239 }
            goto L_0x002a
        L_0x0038:
            r2.close()     // Catch:{ all -> 0x0240 }
            r4.close()
            java.util.Iterator r2 = r13.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r1 = r2.next()
            X.1pi r1 = (X.C37771pi) r1
            java.lang.String r0 = r1.A0F
            boolean r0 = r3.contains(r0)
            r1.A06 = r0
            goto L_0x0042
        L_0x0057:
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/size of sticker packs from db:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r13.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14i r3 = r14.A03
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x0238
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ 1q1 -> 0x022e }
            r9.<init>()     // Catch:{ 1q1 -> 0x022e }
            java.util.Iterator r2 = r13.iterator()     // Catch:{ 1q1 -> 0x022e }
        L_0x007d:
            boolean r0 = r2.hasNext()     // Catch:{ 1q1 -> 0x022e }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r1 = r2.next()     // Catch:{ 1q1 -> 0x022e }
            X.1pi r1 = (X.C37771pi) r1     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r0 = r1.A0F     // Catch:{ 1q1 -> 0x022e }
            r9.put(r0, r1)     // Catch:{ 1q1 -> 0x022e }
            goto L_0x007d
        L_0x008f:
            int r0 = r13.size()     // Catch:{ 1q1 -> 0x022e }
            r12 = 0
            if (r0 <= 0) goto L_0x0097
            r12 = 1
        L_0x0097:
            X.14b r2 = r14.A02     // Catch:{ 1q1 -> 0x022e }
            r4 = 0
            X.0sK r0 = r2.A02     // Catch:{ 1q1 -> 0x022e }
            r0.A0B()     // Catch:{ 1q1 -> 0x022e }
            com.obwhatsapp.Me r8 = r0.A00     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r0 = "https://static.whatsapp.net/sticker?cat=all&lg="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1q1 -> 0x022e }
            r1.<init>(r0)     // Catch:{ 1q1 -> 0x022e }
            X.013 r0 = r2.A07     // Catch:{ 1q1 -> 0x022e }
            android.content.Context r0 = r0.A00     // Catch:{ 1q1 -> 0x022e }
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r0 = X.AnonymousClass1WH.A05(r0)     // Catch:{ 1q1 -> 0x022e }
            r1.append(r0)     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r5 = r1.toString()     // Catch:{ 1q1 -> 0x022e }
            if (r8 == 0) goto L_0x00d9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ 1q1 -> 0x022e }
            r6.<init>()     // Catch:{ 1q1 -> 0x022e }
            r6.append(r5)     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r0 = "&country="
            r6.append(r0)     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r1 = r8.cc     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r0 = r8.number     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r0 = X.C18160wF.A01(r1, r0)     // Catch:{ 1q1 -> 0x022e }
            r6.append(r0)     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r5 = r6.toString()     // Catch:{ 1q1 -> 0x022e }
        L_0x00d9:
            X.0pd r6 = r2.A08     // Catch:{ 1q1 -> 0x022e }
            r1 = 2565(0xa05, float:3.594E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ 1q1 -> 0x022e }
            boolean r0 = r6.A0E(r0, r1)     // Catch:{ 1q1 -> 0x022e }
            if (r0 == 0) goto L_0x00eb
            X.13o r0 = r2.A0B     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r5 = r0.A00(r5)     // Catch:{ 1q1 -> 0x022e }
        L_0x00eb:
            if (r12 == 0) goto L_0x00ee
            goto L_0x00f0
        L_0x00ee:
            r0 = r4
            goto L_0x0101
        L_0x00f0:
            X.0rz r0 = r2.A06     // Catch:{ 1q1 -> 0x022e }
            X.01D r0 = r0.A01     // Catch:{ 1q1 -> 0x022e }
            java.lang.Object r1 = r0.get()     // Catch:{ 1q1 -> 0x022e }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r0 = "sticker_store_etag"
            java.lang.String r0 = r1.getString(r0, r4)     // Catch:{ 1q1 -> 0x022e }
        L_0x0101:
            X.1qV r5 = r2.A01(r4, r5, r0)     // Catch:{ 1q1 -> 0x022e }
            if (r5 == 0) goto L_0x011b
            X.0rz r0 = r2.A06     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r2 = r5.A00     // Catch:{ 1q1 -> 0x022e }
            android.content.SharedPreferences$Editor r1 = r0.A0K()     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r0 = "sticker_store_etag"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch:{ 1q1 -> 0x022e }
            r0.apply()     // Catch:{ 1q1 -> 0x022e }
            java.util.List r4 = r5.A01     // Catch:{ 1q1 -> 0x022e }
        L_0x011b:
            if (r4 == 0) goto L_0x0238
            java.util.Iterator r12 = r4.iterator()     // Catch:{ 1q1 -> 0x022e }
        L_0x0121:
            boolean r0 = r12.hasNext()     // Catch:{ 1q1 -> 0x022e }
            if (r0 == 0) goto L_0x016e
            java.lang.Object r8 = r12.next()     // Catch:{ 1q1 -> 0x022e }
            X.1pi r8 = (X.C37771pi) r8     // Catch:{ 1q1 -> 0x022e }
            java.lang.String r1 = r8.A0F     // Catch:{ 1q1 -> 0x022e }
            boolean r0 = r9.containsKey(r1)     // Catch:{ 1q1 -> 0x022e }
            if (r0 == 0) goto L_0x014a
            java.lang.Object r5 = r9.get(r1)     // Catch:{ 1q1 -> 0x022e }
            X.1pi r5 = (X.C37771pi) r5     // Catch:{ 1q1 -> 0x022e }
            if (r5 == 0) goto L_0x0121
            java.lang.String r2 = r5.A02     // Catch:{ 1q1 -> 0x022e }
            long r0 = r5.A01     // Catch:{ 1q1 -> 0x022e }
            r8.A01 = r0     // Catch:{ 1q1 -> 0x022e }
            r8.A02 = r2     // Catch:{ 1q1 -> 0x022e }
            boolean r0 = r5.A06     // Catch:{ 1q1 -> 0x022e }
        L_0x0147:
            r8.A06 = r0     // Catch:{ 1q1 -> 0x022e }
            goto L_0x0121
        L_0x014a:
            int r0 = r9.size()     // Catch:{ 1q1 -> 0x022e }
            if (r0 <= 0) goto L_0x0121
            X.0tf r6 = r11.A02()     // Catch:{ 1q1 -> 0x022e }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0169 }
            r5.<init>()     // Catch:{ all -> 0x0169 }
            r5.put(r10, r1)     // Catch:{ all -> 0x0169 }
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = "new_sticker_packs"
            r0 = 5
            r2.A06(r5, r1, r0)     // Catch:{ all -> 0x0169 }
            r6.close()     // Catch:{ 1q1 -> 0x022e }
            r0 = 1
            goto L_0x0147
        L_0x0169:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x016d }
        L_0x016d:
            throw r0     // Catch:{ 1q1 -> 0x022e }
        L_0x016e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1q1 -> 0x022b }
            r1.<init>()     // Catch:{ 1q1 -> 0x022b }
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/size of sticker packs from web:"
            r1.append(r0)     // Catch:{ 1q1 -> 0x022b }
            int r0 = r4.size()     // Catch:{ 1q1 -> 0x022b }
            r1.append(r0)     // Catch:{ 1q1 -> 0x022b }
            java.lang.String r0 = r1.toString()     // Catch:{ 1q1 -> 0x022b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1q1 -> 0x022b }
            X.AnonymousClass00B.A00()     // Catch:{ 1q1 -> 0x022b }
            X.12j r0 = r7.A01     // Catch:{ 1q1 -> 0x022b }
            X.0tf r5 = r0.A02()     // Catch:{ 1q1 -> 0x022b }
            X.1cj r10 = r5.A00()     // Catch:{ all -> 0x0226 }
            X.0tg r7 = r5.A02     // Catch:{ all -> 0x0221 }
            java.lang.String r6 = "downloadable_sticker_packs"
            r0 = 0
            r7.A01(r6, r0, r0)     // Catch:{ all -> 0x0221 }
            java.util.Iterator r9 = r4.iterator()     // Catch:{ all -> 0x0221 }
        L_0x019f:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x0214
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0221 }
            X.1pi r8 = (X.C37771pi) r8     // Catch:{ all -> 0x0221 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0221 }
            r2.<init>()     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r8.A0F     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "id"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r8.A0H     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "name"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r8.A09     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "description"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r8.A0J     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "publisher"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
            long r0 = r8.A08     // Catch:{ all -> 0x0221 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "size"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r8.A0L     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "tray_image_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r8.A0M     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "tray_image_preview_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r8.A0G     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "image_data_hash"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
            java.util.List r0 = r8.A03     // Catch:{ all -> 0x0221 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0221 }
            if (r0 != 0) goto L_0x0204
            java.util.List r1 = r8.A03     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = ","
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "preview_image_id_array"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
        L_0x0204:
            boolean r0 = r8.A0N     // Catch:{ all -> 0x0221 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "animated_pack"
            r2.put(r0, r1)     // Catch:{ all -> 0x0221 }
            r0 = 5
            r7.A06(r2, r6, r0)     // Catch:{ all -> 0x0221 }
            goto L_0x019f
        L_0x0214:
            r10.A00()     // Catch:{ all -> 0x0221 }
            r10.close()     // Catch:{ all -> 0x0226 }
            r5.close()     // Catch:{ 1q1 -> 0x022b }
            r3.A00()     // Catch:{ 1q1 -> 0x022b }
            return r4
        L_0x0221:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0225 }
        L_0x0225:
            throw r0     // Catch:{ all -> 0x0226 }
        L_0x0226:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x022a }
        L_0x022a:
            throw r0     // Catch:{ 1q1 -> 0x022b }
        L_0x022b:
            r1 = move-exception
            r13 = r4
            goto L_0x022f
        L_0x022e:
            r1 = move-exception
        L_0x022f:
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/getStickerPacksInStoreIfUpdated failed"
            com.whatsapp.util.Log.e(r0, r1)
            r3.A01()
            return r13
        L_0x0238:
            return r13
        L_0x0239:
            r0 = move-exception
            if (r2 == 0) goto L_0x023f
            r2.close()     // Catch:{ all -> 0x023f }
        L_0x023f:
            throw r0     // Catch:{ all -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0244 }
        L_0x0244:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20090zU.A00():java.util.List");
    }
}
