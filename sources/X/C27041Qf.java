package X;

/* renamed from: X.1Qf  reason: invalid class name and case insensitive filesystem */
public class C27041Qf {
    public final C14870pt A00;
    public final C16980tz A01;
    public final C27031Qe A02;
    public final AnonymousClass14W A03;
    public final AnonymousClass1M8 A04;
    public final C27021Qd A05;
    public final C27011Qc A06;
    public final C16170sZ A07;

    public C27041Qf(C14870pt r1, C16980tz r2, C27031Qe r3, AnonymousClass14W r4, AnonymousClass1M8 r5, C27021Qd r6, C27011Qc r7, C16170sZ r8) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0150 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0173 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:87:0x0173=Splitter:B:87:0x0173, B:21:0x009d=Splitter:B:21:0x009d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37771pi A00(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r13.hashCode()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sZ r0 = r12.A07
            boolean r1 = r0.A02(r13, r14)
            if (r1 != 0) goto L_0x0031
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/not using sticker cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Qe r0 = r12.A02
            X.1pi r0 = r0.A03(r13, r14)
            return r0
        L_0x0031:
            r1 = 0
            X.1Qe r3 = r12.A02     // Catch:{ Exception -> 0x0046 }
            X.1pi r1 = r3.A04(r13, r14)     // Catch:{ Exception -> 0x0046 }
            boolean r2 = r1.A0O
            if (r2 == 0) goto L_0x004c
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/avoid caching is true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1pi r0 = r3.A03(r13, r14)
            return r0
        L_0x0046:
            r3 = move-exception
            java.lang.String r2 = "ThirdPartyStickerManager/fetchPack/could not fetch pack metadata"
            com.whatsapp.util.Log.e(r2, r3)
        L_0x004c:
            X.12j r2 = r0.A00
            X.0tf r2 = r2.get()
            X.0tg r6 = r2.A02     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = "SELECT authority, sticker_pack_id, sticker_pack_name, sticker_pack_publisher, sticker_pack_image_data_hash, avoid_cache, is_animated_pack FROM third_party_whitelist_packs WHERE authority = ? AND sticker_pack_id = ? LIMIT 1"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x0174 }
            r3 = 0
            r4[r3] = r13     // Catch:{ all -> 0x0174 }
            r3 = 1
            r4[r3] = r14     // Catch:{ all -> 0x0174 }
            android.database.Cursor r4 = r6.A08(r5, r4)     // Catch:{ all -> 0x0174 }
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x016d }
            if (r3 != 0) goto L_0x006b
            r3 = 0
            goto L_0x009d
        L_0x006b:
            java.lang.String r3 = "authority"
            int r5 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x016d }
            java.lang.String r3 = "sticker_pack_id"
            int r6 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x016d }
            java.lang.String r3 = "sticker_pack_name"
            int r7 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x016d }
            java.lang.String r3 = "sticker_pack_publisher"
            int r8 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x016d }
            java.lang.String r3 = "sticker_pack_image_data_hash"
            int r9 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x016d }
            java.lang.String r3 = "avoid_cache"
            int r10 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x016d }
            java.lang.String r3 = "is_animated_pack"
            int r11 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x016d }
            X.1pi r3 = X.C16170sZ.A00(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x016d }
        L_0x009d:
            r4.close()     // Catch:{ all -> 0x0174 }
            r2.close()
            if (r1 == 0) goto L_0x00e0
            if (r3 == 0) goto L_0x00b3
            java.lang.String r4 = r3.A02
            if (r4 == 0) goto L_0x00b3
            java.lang.String r2 = r1.A0G
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00e0
        L_0x00b3:
            r10 = 1
            r0.A01(r1, r13, r14)
            r3 = r1
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/repopulate sticker pack db"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Qd r4 = r12.A05
            java.lang.String r0 = r1.A0F
            java.io.File r2 = r4.A01(r0)
            if (r2 == 0) goto L_0x00d0
            boolean r0 = X.AnonymousClass1XI.A0N(r2)
            if (r0 == 0) goto L_0x00d0
            r2.toString()
        L_0x00d0:
            X.0tz r0 = r12.A01
            android.content.Context r0 = r0.A00
            byte[] r0 = X.C27031Qe.A02(r0, r1)
            r4.A00(r1, r0)
        L_0x00db:
            X.1M8 r1 = r12.A04
            monitor-enter(r1)
            r0 = 0
            goto L_0x00e2
        L_0x00e0:
            r10 = 0
            goto L_0x00db
        L_0x00e2:
            java.util.List r6 = r1.A01(r13, r14, r0)     // Catch:{ all -> 0x016a }
            monitor-exit(r1)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00ef
            if (r10 == 0) goto L_0x00ff
        L_0x00ef:
            X.1Qe r0 = r12.A02
            X.1pi r0 = r0.A03(r13, r14)
            java.util.List r6 = r0.A04
            r1.A02(r13, r14, r6)
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/repopulating sticker cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00ff:
            java.util.Iterator r9 = r6.iterator()
        L_0x0103:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r7 = r9.next()
            X.1jm r7 = (X.C34151jm) r7
            java.lang.String r8 = r7.A0D
            if (r8 == 0) goto L_0x0103
            X.1Qc r0 = r12.A06
            X.12j r0 = r0.A00
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0151 }
            java.lang.String r2 = "SELECT emojis FROM third_party_sticker_emoji_mapping WHERE plaintext_hash = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0151 }
            r0 = 0
            r1[r0] = r8     // Catch:{ all -> 0x0151 }
            android.database.Cursor r1 = r4.A08(r2, r1)     // Catch:{ all -> 0x0151 }
            if (r1 == 0) goto L_0x0145
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x014c }
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = "emojis"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014c }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x014c }
            r1.close()     // Catch:{ all -> 0x0151 }
            r5.close()
            goto L_0x0149
        L_0x0142:
            r1.close()     // Catch:{ all -> 0x0151 }
        L_0x0145:
            r5.close()
            r0 = 0
        L_0x0149:
            r7.A07 = r0
            goto L_0x0103
        L_0x014c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0150 }
        L_0x0150:
            throw r0     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0178 }
            throw r0
        L_0x0156:
            X.AnonymousClass00B.A06(r3)
            r3.A04 = r6
            if (r10 == 0) goto L_0x0169
            X.0pt r2 = r12.A00
            r1 = 48
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r12, r1, r3)
            r2.A0K(r0)
        L_0x0169:
            return r3
        L_0x016a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x016d:
            r0 = move-exception
            if (r4 == 0) goto L_0x0173
            r4.close()     // Catch:{ all -> 0x0173 }
        L_0x0173:
            throw r0     // Catch:{ all -> 0x0174 }
        L_0x0174:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0178 }
        L_0x0178:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27041Qf.A00(java.lang.String, java.lang.String):X.1pi");
    }
}
