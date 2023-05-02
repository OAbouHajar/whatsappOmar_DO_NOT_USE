package X;

import java.util.Collection;

/* renamed from: X.36G  reason: invalid class name */
public class AnonymousClass36G extends C16690tT {
    public final C108765Pg A00;
    public final AnonymousClass1M6 A01;
    public final boolean A02 = true;
    public final /* synthetic */ AnonymousClass1M7 A03;

    public AnonymousClass36G(C108765Pg r2, AnonymousClass1M7 r3, AnonymousClass1M6 r4) {
        this.A03 = r3;
        this.A01 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c7, code lost:
        if (r9 != null) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x01cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r17) {
        /*
            r16 = this;
            r2 = r17
            java.lang.String[] r2 = (java.lang.String[]) r2
            X.AnonymousClass00B.A06(r2)
            int r0 = r2.length
            r1 = 0
            boolean r0 = X.C13690nt.A1R(r0)
            X.AnonymousClass00B.A0F(r0)
            r0 = r16
            X.1M6 r7 = r0.A01
            r3 = r2[r1]
            boolean r2 = r0.A02
            java.lang.String r0 = "StickerContextualSuggestionStore fetchMatchingStickersByTextFromDb"
            X.1Zf r6 = new X.1Zf
            r6.<init>((java.lang.String) r0)
            X.11g r1 = r7.A03
            r0 = 200(0xc8, float:2.8E-43)
            r4 = 1
            java.util.List r14 = r1.A01(r3, r0, r2)
            java.lang.String r0 = "Found and parsed emojis:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r14.size()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            r6.A02(r0)
            boolean r0 = r14.isEmpty()
            r11 = 0
            if (r0 == 0) goto L_0x0045
            java.util.ArrayList r0 = X.C13690nt.A0i(r11)
            return r0
        L_0x0045:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.lang.String r0 = "Start search for stickers"
            r6.A02(r0)
            int r1 = r14.size()
            java.lang.String r0 = "SELECT plaintext_hash, from_third_party_pack_db, sticker_pack_identifier, hash_of_image_part FROM (SELECT plaintext_hash as plaintext_hash, emojis as emojis, 10001 as primary_ordering, entry_weight as secondary_ordering, hash_of_image_part as hash_of_image_part, '' as sticker_pack_identifier, 0 as from_third_party_pack_db FROM recent_stickers UNION SELECT plaintext_hash as plaintext_hash, emojis as emojis, 10000 as primary_ordering, timestamp as secondary_ordering, hash_of_image_part as hash_of_image_part, '' as sticker_pack_identifier, 0 as from_third_party_pack_db FROM starred_stickers UNION SELECT plain_file_hash as plaintext_hash, emojis as emojis, sticker_pack_order.pack_order as primary_ordering, 0 as secondary_ordering, hash_of_image_part as hash_of_image_part, sticker_pack_order.sticker_pack_id as sticker_pack_identifier, 0 as from_third_party_pack_db FROM stickers LEFT JOIN sticker_pack_order ON sticker_pack_order.sticker_pack_id=stickers.sticker_pack_id UNION SELECT plaintext_hash as plaintext_hash, emojis as emojis, sticker_pack_order.pack_order as primary_ordering, 0 as secondary_ordering, hash_of_image_part as hash_of_image_part, (third_party_sticker_emoji_mapping.authority || ' ' || third_party_sticker_emoji_mapping.sticker_pack_id) as sticker_pack_identifier, 1 as from_third_party_pack_db FROM third_party_sticker_emoji_mapping LEFT JOIN sticker_pack_order ON sticker_pack_order.sticker_pack_id=(third_party_sticker_emoji_mapping.authority || ' ' || third_party_sticker_emoji_mapping.sticker_pack_id) LEFT JOIN third_party_whitelist_packs ON third_party_sticker_emoji_mapping.sticker_pack_id=third_party_whitelist_packs.sticker_pack_id WHERE avoid_cache = 0 ) WHERE emojis LIKE "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)
            java.lang.String r0 = " OR emojis LIKE "
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            r2.append(r0)
            java.lang.String r0 = " GROUP BY "
            r2.append(r0)
            java.lang.String r10 = "plaintext_hash"
            r2.append(r10)
            java.lang.String r0 = " ORDER BY primary_ordering DESC, secondary_ordering DESC "
            r2.append(r0)
            java.lang.String r0 = " LIMIT 500"
            java.lang.String r13 = X.AnonymousClass000.A0h(r0, r2)
            X.12j r0 = r7.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d2 }
            X.0tf r8 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d2 }
            X.0tg r12 = r8.A02     // Catch:{ all -> 0x01cd }
            int r9 = r14.size()     // Catch:{ all -> 0x01cd }
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ all -> 0x01cd }
            r2 = 0
        L_0x008c:
            if (r2 >= r9) goto L_0x00a6
            java.lang.String r15 = "%"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r15)     // Catch:{ all -> 0x01cd }
            java.lang.Object r0 = r14.get(r2)     // Catch:{ all -> 0x01cd }
            X.1pj r0 = (X.C37781pj) r0     // Catch:{ all -> 0x01cd }
            X.AnonymousClass000.A1I(r0, r1)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = X.AnonymousClass000.A0h(r15, r1)     // Catch:{ all -> 0x01cd }
            r3[r2] = r0     // Catch:{ all -> 0x01cd }
            int r2 = r2 + 1
            goto L_0x008c
        L_0x00a6:
            android.database.Cursor r9 = r12.A08(r13, r3)     // Catch:{ all -> 0x01cd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = "Found stickers:"
            r1.append(r0)     // Catch:{ all -> 0x01c6 }
            int r0 = r9.getCount()     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ all -> 0x01c6 }
            r6.A02(r0)     // Catch:{ all -> 0x01c6 }
            int r0 = r9.getCount()     // Catch:{ all -> 0x01c6 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x01c6 }
            r3.<init>(r0)     // Catch:{ all -> 0x01c6 }
        L_0x00c7:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x01a7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = "Sticker #"
            r1.append(r0)     // Catch:{ all -> 0x01c6 }
            int r0 = r9.getPosition()     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ all -> 0x01c6 }
            r6.A02(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r12 = X.C13680ns.A0e(r9, r10)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = "from_third_party_pack_db"
            int r0 = X.C13690nt.A02(r9, r0)     // Catch:{ all -> 0x01c6 }
            boolean r14 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "sticker_pack_identifier"
            java.lang.String r1 = X.C13680ns.A0e(r9, r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = "hash_of_image_part"
            java.lang.String r2 = X.C13680ns.A0e(r9, r0)     // Catch:{ all -> 0x01c6 }
            boolean r0 = r3.contains(r2)     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x00c7
            boolean r0 = X.AnonymousClass1ZW.A0E(r2)     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x010b
            r3.add(r2)     // Catch:{ all -> 0x01c6 }
        L_0x010b:
            X.1jm r2 = new X.1jm     // Catch:{ all -> 0x01c6 }
            r2.<init>()     // Catch:{ all -> 0x01c6 }
            r2.A0D = r12     // Catch:{ all -> 0x01c6 }
            X.01Z r0 = r7.A01     // Catch:{ all -> 0x01c6 }
            java.io.File r13 = r0.A03(r12)     // Catch:{ all -> 0x01c6 }
            boolean r0 = r13.exists()     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "Sticker file stored internally"
            r6.A02(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ all -> 0x01c6 }
            r2.A09 = r0     // Catch:{ all -> 0x01c6 }
            r2.A01 = r4     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ all -> 0x01c6 }
            byte[] r0 = com.whatsapp.stickers.WebpUtils.fetchWebpMetadata(r0)     // Catch:{ all -> 0x01c6 }
            X.1XO r0 = X.AnonymousClass1XO.A00(r0)     // Catch:{ all -> 0x01c6 }
            r2.A04 = r0     // Catch:{ all -> 0x01c6 }
            X.C37711pb.A00(r2)     // Catch:{ all -> 0x01c6 }
            r5.add(r2)     // Catch:{ all -> 0x01c6 }
            goto L_0x00c7
        L_0x0140:
            java.lang.String r0 = "Sticker file not managed internally"
            r6.A02(r0)     // Catch:{ all -> 0x01c6 }
            if (r14 == 0) goto L_0x00c7
            if (r1 == 0) goto L_0x00c7
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = " "
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x00c7
            android.util.Pair r0 = X.C27031Qe.A00(r1)     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x00c7
            android.util.Pair r13 = X.C27031Qe.A00(r1)     // Catch:{ all -> 0x01c6 }
            X.AnonymousClass00B.A06(r13)     // Catch:{ all -> 0x01c6 }
            X.1M8 r2 = r7.A04     // Catch:{ all -> 0x01c6 }
            java.lang.Object r1 = r13.first     // Catch:{ all -> 0x01c6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01c6 }
            java.lang.Object r0 = r13.second     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01c6 }
            monitor-enter(r2)     // Catch:{ all -> 0x01c6 }
            java.io.File r0 = r2.A00(r1, r0)     // Catch:{ all -> 0x01a4 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01a4 }
            monitor-exit(r2)     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x019d
            java.lang.Object r1 = r13.first     // Catch:{ all -> 0x01c6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01c6 }
            java.lang.Object r0 = r13.second     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01c6 }
            monitor-enter(r2)     // Catch:{ all -> 0x01c6 }
            java.util.List r1 = r2.A01(r1, r0, r12)     // Catch:{ all -> 0x01a4 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x0194
            java.lang.Object r0 = r1.get(r11)     // Catch:{ all -> 0x01a4 }
            X.1jm r0 = (X.C34151jm) r0     // Catch:{ all -> 0x01a4 }
            goto L_0x0195
        L_0x0194:
            r0 = 0
        L_0x0195:
            monitor-exit(r2)     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x00c7
            r5.add(r0)     // Catch:{ all -> 0x01c6 }
            goto L_0x00c7
        L_0x019d:
            java.lang.String r0 = "File not in cache, skipping"
            r6.A02(r0)     // Catch:{ all -> 0x01c6 }
            goto L_0x00c7
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01c6 }
            throw r0     // Catch:{ all -> 0x01c6 }
        L_0x01a7:
            r9.close()     // Catch:{ all -> 0x01cd }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d2 }
            java.lang.String r0 = "Finished parsing stickers:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r5.size()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            r6.A02(r0)
            r6.A01()
            java.util.ArrayList r0 = X.C13680ns.A0n(r5)
            return r0
        L_0x01c6:
            r0 = move-exception
            if (r9 == 0) goto L_0x01cc
            r9.close()     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            throw r0     // Catch:{ all -> 0x01cd }
        L_0x01cd:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x01d1 }
        L_0x01d1:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d2 }
        L_0x01d2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0so r2 = r7.A00
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "StickerContexualSuggestionStore/fetchMatchingStickersByEmojisFromDb"
            r2.AcB(r0, r1, r4)
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36G.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Collection collection = (Collection) obj;
        AnonymousClass1M7 r1 = this.A03;
        if (r1.A00 == this) {
            r1.A00 = null;
        }
        if (!C16690tT.A02(this)) {
            this.A00.AWS(collection);
        }
    }
}
