package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Ea  reason: invalid class name and case insensitive filesystem */
public class C46372Ea extends C30111bl {
    public static final Set A02;
    public final C16920ts A00;
    public final AnonymousClass17I A01;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(2L);
        hashSet.add(1L);
        hashSet.add(25L);
        hashSet.add(3L);
        hashSet.add(28L);
        hashSet.add(13L);
        hashSet.add(29L);
        hashSet.add(20L);
        hashSet.add(9L);
        hashSet.add(26L);
        hashSet.add(23L);
        hashSet.add(37L);
        A02 = Collections.unmodifiableSet(hashSet);
    }

    public C46372Ea(C16920ts r1, AnonymousClass17I r2, C24821Hk r3, String str, int i2) {
        super(r3, str, i2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0281 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C49522Tm A09(android.database.Cursor r49) {
        /*
            r48 = this;
            java.lang.String r0 = "_id"
            r3 = r49
            int r29 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "thumb_image"
            int r28 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_wa_type"
            int r13 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "key_remote_jid"
            int r27 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "multicast_id"
            int r26 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_url"
            int r25 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_mime_type"
            int r24 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_size"
            int r23 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_name"
            int r22 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_hash"
            int r21 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_duration"
            int r12 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_enc_hash"
            int r20 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "timestamp"
            int r11 = r3.getColumnIndexOrThrow(r0)
            r0 = -1
            r10 = 0
        L_0x0055:
            boolean r2 = r3.moveToNext()
            if (r2 == 0) goto L_0x0287
            r0 = r29
            long r0 = r3.getLong(r0)
            int r10 = r10 + 1
            long r5 = r3.getLong(r13)
            java.util.Set r4 = A02
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L_0x0055
            r2 = r48
            boolean r4 = r2.A0U(r3)
            if (r4 == 0) goto L_0x0055
            boolean r4 = r2.A0U(r3)
            if (r4 == 0) goto L_0x0055
            java.lang.String r8 = "row_id="
            r14 = 1
            java.lang.String r9 = ", time="
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d2
            long r4 = r3.getLong(r11)
            X.0so r6 = r2.A01
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = r2.A0C
            r7.append(r2)
            java.lang.String r2 = "-invalid-row-id"
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r8)
            r14.append(r0)
            r14.append(r9)
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
            r8.<init>(r2, r9)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r4)
            java.lang.String r2 = r8.format(r2)
            r14.append(r2)
            java.lang.String r4 = r14.toString()
            r2 = 0
            r6.AcB(r7, r4, r2)
            goto L_0x0055
        L_0x00d2:
            r4 = r27
            java.lang.String r4 = X.C33931jQ.A02(r3, r4)
            X.0rv r7 = X.C15830rv.A02(r4)
            if (r7 == 0) goto L_0x00f9
            X.0ts r4 = r2.A00
            long r4 = r4.A02(r7)
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x014a
            java.lang.String r5 = "MediaCoreMessageStore/MediaMessageDatabaseMigration/processBatch/missing chat row_id; jid="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r4)
        L_0x00f9:
            r4 = -1
        L_0x00fb:
            long r6 = r3.getLong(r11)
            X.0so r14 = r2.A01
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = r2.A0C
            r15.append(r2)
            java.lang.String r2 = "-invalid-chat-row-id"
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r0)
            java.lang.String r8 = ", chat_row_id="
            r2.append(r8)
            r2.append(r4)
            r2.append(r9)
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r4 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            r5.<init>(r4, r8)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r6)
            java.lang.String r4 = r5.format(r4)
            r2.append(r4)
            java.lang.String r5 = r2.toString()
        L_0x0144:
            r2 = 0
            r14.AcB(r15, r5, r2)
            goto L_0x0055
        L_0x014a:
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 < 0) goto L_0x00fb
            r6 = r28
            byte[] r6 = r3.getBlob(r6)
            X.17I r8 = r2.A01
            X.0ta r7 = r8.A03(r6)
            if (r7 != 0) goto L_0x01cf
            long r4 = r3.getLong(r11)
            java.lang.String r7 = "row_id= "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            r8.append(r0)
            java.lang.String r7 = ", media_blob"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            if (r6 != 0) goto L_0x01c2
            r8.append(r7)
            java.lang.String r6 = "=null"
            r8.append(r6)
        L_0x0183:
            java.lang.String r6 = r8.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r9)
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r6 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            r7.<init>(r6, r9)
            java.util.Date r6 = new java.util.Date
            r6.<init>(r4)
            java.lang.String r4 = r7.format(r6)
            r8.append(r4)
            java.lang.String r5 = r8.toString()
            X.0so r14 = r2.A01
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.A0C
            r4.append(r2)
            java.lang.String r2 = "-no-media-blob"
            r4.append(r2)
            java.lang.String r15 = r4.toString()
            goto L_0x0144
        L_0x01c2:
            r8.append(r7)
            java.lang.String r7 = "=non-null, size="
            r8.append(r7)
            int r6 = r6.length
            r8.append(r6)
            goto L_0x0183
        L_0x01cf:
            int r9 = r3.getInt(r13)
            r6 = r23
            long r45 = r3.getLong(r6)
            r6 = r26
            java.lang.String r32 = X.C33931jQ.A02(r3, r6)
            r6 = r25
            java.lang.String r33 = X.C33931jQ.A02(r3, r6)
            r6 = r24
            java.lang.String r34 = X.C33931jQ.A02(r3, r6)
            r6 = r22
            java.lang.String r35 = X.C33931jQ.A02(r3, r6)
            r6 = r21
            java.lang.String r36 = X.C33931jQ.A02(r3, r6)
            r6 = r20
            java.lang.String r37 = X.C33931jQ.A02(r3, r6)
            r6 = 9
            if (r9 == r6) goto L_0x0229
            r6 = 26
            if (r9 == r6) goto L_0x0229
            int r40 = r3.getInt(r12)
            r31 = 0
        L_0x020b:
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            r8.A05(r6, r7)
            r47 = 0
            r38 = 0
            r30 = r6
            r39 = r38
            r41 = r0
            r43 = r4
            X.AnonymousClass17I.A01(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47)
            X.0tq r2 = r2.A05
            X.0tf r2 = r2.A02()
            goto L_0x0234
        L_0x0229:
            int r6 = r3.getInt(r12)
            java.lang.Integer r31 = java.lang.Integer.valueOf(r6)
            r40 = 0
            goto L_0x020b
        L_0x0234:
            X.1cj r19 = r2.A00()     // Catch:{ all -> 0x0282 }
            X.0tg r14 = r2.A02     // Catch:{ all -> 0x027d }
            java.lang.String r9 = "message_media"
            long r17 = r14.A02(r6, r9)     // Catch:{ all -> 0x027d }
            r15 = 0
            r5 = 1
            int r4 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x024d
            int r4 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x026a
            r5 = 0
            goto L_0x026a
        L_0x024d:
            java.lang.String r4 = "message_row_id"
            r6.remove(r4)     // Catch:{ all -> 0x027d }
            java.lang.String r8 = "message_row_id = ?"
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ all -> 0x027d }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x027d }
            r7[r47] = r4     // Catch:{ all -> 0x027d }
            int r4 = r14.A00(r9, r6, r8, r7)     // Catch:{ all -> 0x027d }
            if (r4 == r5) goto L_0x0272
            java.lang.String r1 = "MediaCoreMessageStore/processBatch/Failed to update message media."
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x027d }
            r0.<init>(r1)     // Catch:{ all -> 0x027d }
            throw r0     // Catch:{ all -> 0x027d }
        L_0x026a:
            java.lang.String r4 = "MediaCoreMessageStore/processBatch/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r4, r5)     // Catch:{ all -> 0x027d }
            r8.A06(r7, r0)     // Catch:{ all -> 0x027d }
        L_0x0272:
            r19.A00()     // Catch:{ all -> 0x027d }
            r19.close()     // Catch:{ all -> 0x0282 }
            r2.close()
            goto L_0x0055
        L_0x027d:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x0281 }
        L_0x0281:
            throw r0     // Catch:{ all -> 0x0282 }
        L_0x0282:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0286 }
        L_0x0286:
            throw r0
        L_0x0287:
            X.2Tm r2 = new X.2Tm
            r2.<init>(r0, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46372Ea.A09(android.database.Cursor):X.2Tm");
    }

    public void A0G() {
        super.A0G();
        this.A06.A04("media_message_ready", 2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0U(android.database.Cursor r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C46382Eb
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "_id"
            int r0 = r9.getColumnIndexOrThrow(r0)
            long r6 = r9.getLong(r0)
            X.0tq r0 = r8.A05
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video, media_caption FROM message_media WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0044 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0044 }
            android.database.Cursor r1 = r4.A08(r3, r2)     // Catch:{ all -> 0x0044 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0030
            r1.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0049
        L_0x0030:
            X.17I r0 = r8.A01     // Catch:{ all -> 0x003d }
            r0.A02(r1)     // Catch:{ all -> 0x003d }
            r1.close()     // Catch:{ all -> 0x0044 }
            r5.close()
            r0 = 0
            return r0
        L_0x003d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0
        L_0x0049:
            r5.close()
        L_0x004c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46372Ea.A0U(android.database.Cursor):boolean");
    }
}
