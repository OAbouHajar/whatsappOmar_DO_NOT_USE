package X;

/* renamed from: X.1Oa  reason: invalid class name and case insensitive filesystem */
public class C26501Oa implements C23541Cj {
    public final AnonymousClass18G A00;
    public final AnonymousClass1MG A01;
    public final AnonymousClass01D A02;

    public C26501Oa(AnonymousClass18G r1, AnonymousClass1MG r2, AnonymousClass01D r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x03a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x03ff */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APJ() {
        /*
            r32 = this;
            r31 = r32
            r0 = r31
            X.1MG r4 = r0.A01
            X.1M9 r0 = r4.A03
            r0.A00()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x008c
            X.3rg r9 = new X.3rg
            r9.<init>()
            X.0rz r0 = r4.A01
            X.01D r8 = r0.A01
            java.lang.Object r0 = r8.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r7 = "sticker_suggestion_triggered_count"
            r2 = 0
            int r0 = r0.getInt(r7, r2)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A02 = r0
            java.lang.Object r0 = r8.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r6 = "sticker_suggestion_icon_clicked_count"
            int r0 = r0.getInt(r6, r2)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A00 = r0
            java.lang.Object r0 = r8.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r5 = "sticker_suggestion_sticker_sent_count"
            int r0 = r0.getInt(r5, r2)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A01 = r0
            java.lang.Object r0 = r8.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r3 = "sticker_suggestion_num_suggestions_array"
            java.lang.String r2 = "[]"
            java.lang.String r0 = r0.getString(r3, r2)
            r9.A03 = r0
            X.0t9 r0 = r4.A02
            r0.A06(r9)
            java.lang.Object r0 = r8.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1 = 0
            android.content.SharedPreferences$Editor r0 = r0.putInt(r7, r1)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r1)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r5, r1)
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r2)
            r0.apply()
            r0 = 0
            r4.A00 = r0
        L_0x008c:
            r0 = r31
            X.18G r0 = r0.A00
            r30 = r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.18F r0 = r0.A01
            r29 = r0
            android.content.SharedPreferences r2 = r29.A00()
            java.lang.String r28 = "sticker_send_count"
            r1 = 0
            r0 = r28
            int r0 = r2.getInt(r0, r1)
            long r2 = (long) r0
            java.lang.Long r27 = java.lang.Long.valueOf(r2)
            r0 = r27
            r8.add(r0)
            android.content.SharedPreferences r2 = r29.A00()
            java.lang.String r26 = "sticker_send_from_recent_count"
            r0 = r26
            int r0 = r2.getInt(r0, r1)
            long r2 = (long) r0
            java.lang.Long r25 = java.lang.Long.valueOf(r2)
            r0 = r25
            r8.add(r0)
            android.content.SharedPreferences r2 = r29.A00()
            java.lang.String r24 = "sticker_send_from_favorites_count"
            r0 = r24
            int r0 = r2.getInt(r0, r1)
            long r2 = (long) r0
            java.lang.Long r23 = java.lang.Long.valueOf(r2)
            r0 = r23
            r8.add(r0)
            android.content.SharedPreferences r2 = r29.A00()
            java.lang.String r22 = "sticker_send_from_pack_count"
            r0 = r22
            int r0 = r2.getInt(r0, r1)
            long r2 = (long) r0
            java.lang.Long r21 = java.lang.Long.valueOf(r2)
            r0 = r21
            r8.add(r0)
            android.content.SharedPreferences r2 = r29.A00()
            java.lang.String r20 = "sticker_send_from_emotion_count"
            r0 = r20
            int r0 = r2.getInt(r0, r1)
            long r2 = (long) r0
            java.lang.Long r19 = java.lang.Long.valueOf(r2)
            r0 = r19
            r8.add(r0)
            android.content.SharedPreferences r2 = r29.A00()
            java.lang.String r18 = "sticker_send_from_search_count"
            r0 = r18
            int r0 = r2.getInt(r0, r1)
            long r2 = (long) r0
            java.lang.Long r17 = java.lang.Long.valueOf(r2)
            r0 = r17
            r8.add(r0)
            android.content.SharedPreferences r2 = r29.A00()
            java.lang.String r16 = "sticker_send_from_forward_count"
            r0 = r16
            int r0 = r2.getInt(r0, r1)
            long r2 = (long) r0
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r8.add(r9)
            android.content.SharedPreferences r0 = r29.A00()
            java.lang.String r6 = "sticker_send_first_party_count"
            int r0 = r0.getInt(r6, r1)
            long r2 = (long) r0
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r8.add(r7)
            android.content.SharedPreferences r0 = r29.A00()
            java.lang.String r5 = "sticker_send_animated_count"
            int r0 = r0.getInt(r5, r1)
            long r0 = (long) r0
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r8.add(r4)
            r0 = r29
            java.lang.Object r10 = r0.A04
            monitor-enter(r10)
            android.content.SharedPreferences r1 = r29.A00()     // Catch:{ all -> 0x040e }
            java.lang.String r3 = "sticker_picker_opened_count"
            r0 = 0
            int r0 = r1.getInt(r3, r0)     // Catch:{ all -> 0x040e }
            monitor-exit(r10)     // Catch:{ all -> 0x040e }
            long r0 = (long) r0
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r8.add(r11)
            monitor-enter(r10)
            android.content.SharedPreferences r1 = r29.A00()     // Catch:{ all -> 0x040b }
            java.lang.String r2 = "sticker_search_opened_count"
            r0 = 0
            int r0 = r1.getInt(r2, r0)     // Catch:{ all -> 0x040b }
            monitor-exit(r10)     // Catch:{ all -> 0x040b }
            long r0 = (long) r0
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            r8.add(r13)
            r0 = r29
            java.lang.Object r12 = r0.A02
            monitor-enter(r12)
            android.content.SharedPreferences r1 = r29.A00()     // Catch:{ all -> 0x0408 }
            java.lang.String r10 = "sticker_add_to_favorites_count"
            r0 = 0
            int r0 = r1.getInt(r10, r0)     // Catch:{ all -> 0x0408 }
            monitor-exit(r12)     // Catch:{ all -> 0x0408 }
            long r0 = (long) r0
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            r8.add(r14)
            r0 = r29
            java.lang.Object r0 = r0.A03
            r15 = r0
            monitor-enter(r15)
            android.content.SharedPreferences r1 = r29.A00()     // Catch:{ all -> 0x0405 }
            java.lang.String r12 = "sticker_pack_delete_count"
            r0 = 0
            int r0 = r1.getInt(r12, r0)     // Catch:{ all -> 0x0405 }
            monitor-exit(r15)     // Catch:{ all -> 0x0405 }
            long r0 = (long) r0
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            r8.add(r15)
            X.3sw r1 = new X.3sw
            r1.<init>()
            r0 = r27
            r1.A04 = r0
            r0 = r25
            r1.A0B = r0
            r0 = r23
            r1.A09 = r0
            r0 = r21
            r1.A0A = r0
            r0 = r19
            r1.A08 = r0
            r0 = r17
            r1.A0C = r0
            r1.A05 = r9
            r1.A07 = r7
            r1.A06 = r4
            r1.A02 = r11
            r1.A03 = r13
            r1.A00 = r14
            r1.A01 = r15
            java.util.Iterator r4 = r8.iterator()
        L_0x01f5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0262
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01f5
            long r13 = r0.longValue()
            r7 = 0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f5
            r0 = r30
            X.0t9 r0 = r0.A00
            r0.A06(r1)
            android.content.SharedPreferences r0 = r29.A00()
            android.content.SharedPreferences$Editor r4 = r0.edit()
            r1 = 0
            r0 = r28
            android.content.SharedPreferences$Editor r4 = r4.putInt(r0, r1)
            r0 = r26
            android.content.SharedPreferences$Editor r4 = r4.putInt(r0, r1)
            r0 = r24
            android.content.SharedPreferences$Editor r4 = r4.putInt(r0, r1)
            r0 = r22
            android.content.SharedPreferences$Editor r4 = r4.putInt(r0, r1)
            r0 = r20
            android.content.SharedPreferences$Editor r4 = r4.putInt(r0, r1)
            r0 = r18
            android.content.SharedPreferences$Editor r4 = r4.putInt(r0, r1)
            r0 = r16
            android.content.SharedPreferences$Editor r0 = r4.putInt(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r1)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r5, r1)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r1)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r10, r1)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r12, r1)
            r0.apply()
        L_0x0262:
            r0 = r31
            X.01D r0 = r0.A02
            java.lang.Object r3 = r0.get()
            X.1Nd r3 = (X.C26291Nd) r3
            java.lang.String r0 = "cleanUpOrphanInternalStickerFiles"
            X.1Zf r5 = new X.1Zf
            r5.<init>((java.lang.String) r0)
            r5.A03()
            X.3sD r2 = new X.3sD
            r2.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.12j r0 = r3.A01
            X.0tf r7 = r0.get()
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x0400 }
            java.lang.String r1 = "SELECT plaintext_hash FROM ( SELECT plain_file_hash as plaintext_hash FROM stickers UNION SELECT plaintext_hash as plaintext_hash FROM recent_stickers UNION SELECT plaintext_hash as plaintext_hash FROM starred_stickers )"
            r0 = 0
            android.database.Cursor r6 = r6.A08(r1, r0)     // Catch:{ all -> 0x0400 }
            java.lang.String r0 = "plaintext_hash"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03f9 }
        L_0x0295:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x02ab
            java.lang.String r0 = r6.getString(r1)     // Catch:{ all -> 0x03f9 }
            if (r0 == 0) goto L_0x02a5
            r4.add(r0)     // Catch:{ all -> 0x03f9 }
            goto L_0x0295
        L_0x02a5:
            java.lang.String r0 = "InternalStickerFileReferenceManager/getAllInternalStickerPlainTextHashes/a sticker plaintextHash is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03f9 }
            goto L_0x0295
        L_0x02ab:
            r6.close()     // Catch:{ all -> 0x0400 }
            r7.close()
            X.1Mt r0 = r3.A03
            java.util.List r0 = r0.A02()
            java.util.Iterator r6 = r0.iterator()
        L_0x02bb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02d5
            java.lang.Object r1 = r6.next()
            X.2V1 r1 = (X.AnonymousClass2V1) r1
            boolean r0 = r1 instanceof X.C102814zZ
            if (r0 == 0) goto L_0x02bb
            X.4zZ r1 = (X.C102814zZ) r1
            X.1jm r0 = r1.A00
            java.lang.String r0 = r0.A0D
            r4.add(r0)
            goto L_0x02bb
        L_0x02d5:
            long r0 = r5.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            java.lang.String r0 = "finished db query"
            r5.A02(r0)
            X.01Z r15 = r3.A00     // Catch:{ Exception -> 0x03e0 }
            X.0sb r0 = r15.A00     // Catch:{ Exception -> 0x03e0 }
            java.io.File r14 = r0.A0B()     // Catch:{ Exception -> 0x03e0 }
            X.AnonymousClass00B.A06(r14)     // Catch:{ Exception -> 0x03e0 }
            boolean r0 = r14.exists()     // Catch:{ Exception -> 0x03e0 }
            if (r0 == 0) goto L_0x03f8
            int r0 = r4.size()     // Catch:{ Exception -> 0x03e0 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ Exception -> 0x03e0 }
            r13.<init>(r0)     // Catch:{ Exception -> 0x03e0 }
            java.util.Iterator r7 = r4.iterator()     // Catch:{ Exception -> 0x03e0 }
        L_0x0302:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x03e0 }
            if (r0 == 0) goto L_0x032b
            java.lang.Object r6 = r7.next()     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x03e0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e0 }
            r4.<init>()     // Catch:{ Exception -> 0x03e0 }
            r1 = 47
            r0 = 45
            java.lang.String r0 = r6.replace(r1, r0)     // Catch:{ Exception -> 0x03e0 }
            r4.append(r0)     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = ".webp"
            r4.append(r0)     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x03e0 }
            r13.add(r0)     // Catch:{ Exception -> 0x03e0 }
            goto L_0x0302
        L_0x032b:
            java.lang.String[] r12 = r14.list()     // Catch:{ Exception -> 0x03e0 }
            X.AnonymousClass00B.A06(r12)     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = "finished string conversion"
            r5.A02(r0)     // Catch:{ Exception -> 0x03e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e0 }
            r1.<init>()     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = "cleanUpOrphanInternalStickerFiles/total file count: "
            r1.append(r0)     // Catch:{ Exception -> 0x03e0 }
            int r11 = r12.length     // Catch:{ Exception -> 0x03e0 }
            r1.append(r11)     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x03e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x03e0 }
            r19 = 0
            long r17 = r5.A00()     // Catch:{ Exception -> 0x03e0 }
            r10 = 0
            r4 = 0
        L_0x0354:
            if (r10 >= r11) goto L_0x03a2
            r1 = r12[r10]     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = ".png"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x03e0 }
            if (r0 != 0) goto L_0x039a
            boolean r0 = r13.contains(r1)     // Catch:{ Exception -> 0x03e0 }
            if (r0 != 0) goto L_0x039a
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x03e0 }
            r6.<init>(r14, r1)     // Catch:{ Exception -> 0x03e0 }
            boolean r0 = r6.exists()     // Catch:{ Exception -> 0x03e0 }
            if (r0 == 0) goto L_0x039a
            int r4 = r4 + 1
            long r0 = r6.length()     // Catch:{ Exception -> 0x03e0 }
            long r19 = r19 + r0
            X.AnonymousClass1XI.A0N(r6)     // Catch:{ Exception -> 0x03e0 }
            X.01a r0 = r15.A03     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r16 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x03e0 }
            X.0tq r0 = r0.A01     // Catch:{ Exception -> 0x03e0 }
            X.0tf r9 = r0.A02()     // Catch:{ Exception -> 0x03e0 }
            X.0tg r8 = r9.A02     // Catch:{ all -> 0x039d }
            java.lang.String r7 = "media_refs"
            java.lang.String r6 = "path = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x039d }
            r0 = 0
            r1[r0] = r16     // Catch:{ all -> 0x039d }
            r8.A01(r7, r6, r1)     // Catch:{ all -> 0x039d }
            r9.close()     // Catch:{ Exception -> 0x03e0 }
        L_0x039a:
            int r10 = r10 + 1
            goto L_0x0354
        L_0x039d:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x03a1 }
        L_0x03a1:
            throw r0     // Catch:{ Exception -> 0x03e0 }
        L_0x03a2:
            long r0 = r5.A00()     // Catch:{ Exception -> 0x03e0 }
            long r0 = r0 - r17
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x03e0 }
            r2.A03 = r0     // Catch:{ Exception -> 0x03e0 }
            long r0 = (long) r4     // Catch:{ Exception -> 0x03e0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x03e0 }
            r2.A01 = r0     // Catch:{ Exception -> 0x03e0 }
            r0 = 1024(0x400, double:5.06E-321)
            long r19 = r19 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x03e0 }
            r2.A02 = r0     // Catch:{ Exception -> 0x03e0 }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x03e0 }
            r2.A00 = r0     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = "finished orphan file deletion"
            r5.A02(r0)     // Catch:{ Exception -> 0x03e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e0 }
            r1.<init>()     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = "cleanUpOrphanInternalStickerFiles/total orphan file count: "
            r1.append(r0)     // Catch:{ Exception -> 0x03e0 }
            r1.append(r4)     // Catch:{ Exception -> 0x03e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x03e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x03e0 }
            goto L_0x03f3
        L_0x03e0:
            r1 = move-exception
            java.lang.String r0 = "InternalStickerFileReferenceManager/cleanUpOrphanInternalStickerFiles/exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            java.lang.String r0 = r1.getMessage()
            r2.A05 = r0
        L_0x03f3:
            X.0t9 r0 = r3.A02
            r0.A06(r2)
        L_0x03f8:
            return
        L_0x03f9:
            r0 = move-exception
            if (r6 == 0) goto L_0x03ff
            r6.close()     // Catch:{ all -> 0x03ff }
        L_0x03ff:
            throw r0     // Catch:{ all -> 0x0400 }
        L_0x0400:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0404 }
        L_0x0404:
            throw r0
        L_0x0405:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0405 }
            throw r0
        L_0x0408:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0408 }
            throw r0
        L_0x040b:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x040b }
            throw r0
        L_0x040e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x040e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26501Oa.APJ():void");
    }

    public /* synthetic */ void APK() {
    }
}
