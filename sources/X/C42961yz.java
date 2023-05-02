package X;

import java.util.List;

/* renamed from: X.1yz  reason: invalid class name and case insensitive filesystem */
public class C42961yz implements C206611c {
    public final AnonymousClass1z0 A00;
    public volatile List A01;

    public C42961yz(C212413i r3, boolean z2) {
        this.A00 = new AnonymousClass1z0((C209912j) r3.A00.A01.ANs.get(), z2);
    }

    public /* bridge */ /* synthetic */ C37891pu A7L(Object obj, float f2) {
        return new AnonymousClass1z3((AnonymousClass1z2) obj, 1.0f);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0141 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List AHu() {
        /*
            r34 = this;
            X.AnonymousClass00B.A00()
            r13 = r34
            X.1z0 r3 = r13.A00
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x001f
            java.lang.String r1 = "1"
        L_0x0015:
            r0 = 0
            r2[r0] = r1
            X.12j r0 = r3.A00
            X.0tf r26 = r0.get()
            goto L_0x0022
        L_0x001f:
            java.lang.String r1 = "0"
            goto L_0x0015
        L_0x0022:
            r0 = r26
            X.0tg r1 = r0.A02     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id FROM recent_stickers WHERE is_avocado = ? ORDER BY entry_weight DESC"
            android.database.Cursor r11 = r1.A08(r0, r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "plaintext_hash"
            int r25 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "entry_weight"
            int r24 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "hash_of_image_part"
            int r23 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "url"
            int r22 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "enc_hash"
            int r21 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "direct_path"
            int r20 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "mimetype"
            int r19 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "media_key"
            int r18 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "file_size"
            int r17 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "width"
            int r16 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "height"
            int r10 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "emojis"
            int r9 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "is_first_party"
            int r8 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "last_sticker_sent_ts"
            int r7 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "is_avocado"
            int r6 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "avatar_template_id"
            int r5 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013b }
        L_0x008e:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x0130
            r0 = r25
            java.lang.String r4 = r11.getString(r0)     // Catch:{ all -> 0x013b }
            r0 = r24
            float r3 = r11.getFloat(r0)     // Catch:{ all -> 0x013b }
            r0 = r23
            java.lang.String r2 = r11.getString(r0)     // Catch:{ all -> 0x013b }
            X.1jm r1 = new X.1jm     // Catch:{ all -> 0x013b }
            r1.<init>()     // Catch:{ all -> 0x013b }
            r1.A0D = r4     // Catch:{ all -> 0x013b }
            r0 = r22
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x013b }
            r1.A0G = r0     // Catch:{ all -> 0x013b }
            r0 = r21
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x013b }
            r1.A08 = r0     // Catch:{ all -> 0x013b }
            r0 = r20
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x013b }
            r1.A06 = r0     // Catch:{ all -> 0x013b }
            r0 = r19
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x013b }
            r1.A0C = r0     // Catch:{ all -> 0x013b }
            r0 = r18
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x013b }
            r1.A0B = r0     // Catch:{ all -> 0x013b }
            r0 = r17
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x013b }
            r1.A00 = r0     // Catch:{ all -> 0x013b }
            r0 = r16
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x013b }
            r1.A03 = r0     // Catch:{ all -> 0x013b }
            int r0 = r11.getInt(r10)     // Catch:{ all -> 0x013b }
            r1.A02 = r0     // Catch:{ all -> 0x013b }
            java.lang.String r0 = r11.getString(r9)     // Catch:{ all -> 0x013b }
            r1.A07 = r0     // Catch:{ all -> 0x013b }
            int r14 = r11.getInt(r8)     // Catch:{ all -> 0x013b }
            r15 = 1
            r0 = 0
            if (r14 != r15) goto L_0x00fa
            r0 = 1
        L_0x00fa:
            r1.A0I = r0     // Catch:{ all -> 0x013b }
            r1.A0A = r2     // Catch:{ all -> 0x013b }
            int r14 = r11.getInt(r6)     // Catch:{ all -> 0x013b }
            r0 = 0
            if (r14 != r15) goto L_0x0106
            r0 = 1
        L_0x0106:
            r1.A0H = r0     // Catch:{ all -> 0x013b }
            java.lang.String r0 = r11.getString(r5)     // Catch:{ all -> 0x013b }
            r1.A05 = r0     // Catch:{ all -> 0x013b }
            long r32 = r11.getLong(r7)     // Catch:{ all -> 0x013b }
            X.C37711pb.A00(r1)     // Catch:{ all -> 0x013b }
            java.lang.String r14 = r1.A05     // Catch:{ all -> 0x013b }
            X.1z2 r0 = new X.1z2     // Catch:{ all -> 0x013b }
            r27 = r0
            r28 = r1
            r29 = r4
            r30 = r2
            r31 = r14
            r27.<init>(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x013b }
            X.1z3 r1 = new X.1z3     // Catch:{ all -> 0x013b }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x013b }
            r12.add(r1)     // Catch:{ all -> 0x013b }
            goto L_0x008e
        L_0x0130:
            r11.close()     // Catch:{ all -> 0x0142 }
            r26.close()
            r13.A01 = r12
            java.util.List r0 = r13.A01
            return r0
        L_0x013b:
            r0 = move-exception
            if (r11 == 0) goto L_0x0141
            r11.close()     // Catch:{ all -> 0x0141 }
        L_0x0141:
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            r26.close()     // Catch:{ all -> 0x0146 }
        L_0x0146:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42961yz.AHu():java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AaZ(java.util.List r12) {
        /*
            r11 = this;
            X.AnonymousClass00B.A00()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            r11.A01 = r0
            X.1z0 r1 = r11.A00
            java.util.List r3 = r11.A01
            java.lang.String r6 = "recent_stickers"
            X.12j r0 = r1.A00
            X.0tf r4 = r0.A02()
            X.1cj r10 = r4.A00()     // Catch:{ all -> 0x00f4 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00ef }
            boolean r0 = r1.A01     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00e1
            java.lang.String r1 = "1"
        L_0x0023:
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00ef }
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = "is_avocado = ?"
            r5.A01(r6, r0, r2)     // Catch:{ all -> 0x00ef }
            java.util.Iterator r9 = r3.iterator()     // Catch:{ all -> 0x00ef }
        L_0x0031:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x00ef }
            X.1z3 r2 = (X.AnonymousClass1z3) r2     // Catch:{ all -> 0x00ef }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00ef }
            r3.<init>()     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "plaintext_hash"
            X.1z2 r8 = r2.A01     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "entry_weight"
            float r0 = r2.A00     // Catch:{ all -> 0x00ef }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "hash_of_image_part"
            java.lang.String r0 = r8.A03     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            X.1jm r7 = r8.A04     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "url"
            java.lang.String r0 = r7.A0G     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "enc_hash"
            java.lang.String r0 = r7.A08     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "direct_path"
            java.lang.String r0 = r7.A06     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "mimetype"
            java.lang.String r0 = r7.A0C     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "media_key"
            java.lang.String r0 = r7.A0B     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "file_size"
            int r0 = r7.A00     // Catch:{ all -> 0x00ef }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "width"
            int r0 = r7.A03     // Catch:{ all -> 0x00ef }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "height"
            int r0 = r7.A02     // Catch:{ all -> 0x00ef }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "emojis"
            java.lang.String r0 = r7.A07     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "is_first_party"
            boolean r1 = r7.A0I     // Catch:{ all -> 0x00ef }
            r0 = 0
            if (r1 == 0) goto L_0x00b4
            r0 = 1
        L_0x00b4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ef }
            r3.put(r2, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "is_avocado"
            boolean r1 = r7.A0H     // Catch:{ all -> 0x00ef }
            r0 = 0
            if (r1 == 0) goto L_0x00c3
            r0 = 1
        L_0x00c3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ef }
            r3.put(r2, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "last_sticker_sent_ts"
            long r0 = r8.A00     // Catch:{ all -> 0x00ef }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ef }
            r3.put(r2, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "avatar_template_id"
            java.lang.String r0 = r7.A05     // Catch:{ all -> 0x00ef }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ef }
            r5.A04(r3, r6)     // Catch:{ all -> 0x00ef }
            goto L_0x0031
        L_0x00e1:
            java.lang.String r1 = "0"
            goto L_0x0023
        L_0x00e5:
            r10.A00()     // Catch:{ all -> 0x00ef }
            r10.close()     // Catch:{ all -> 0x00f4 }
            r4.close()
            return
        L_0x00ef:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42961yz.AaZ(java.util.List):void");
    }
}
