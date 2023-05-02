package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.File;

/* renamed from: X.17I  reason: invalid class name */
public class AnonymousClass17I {
    public final C16190sc A00;
    public final C16920ts A01;
    public final C16900tq A02;
    public final AnonymousClass11I A03;

    public AnonymousClass17I(C16190sc r1, C16920ts r2, C16900tq r3, AnonymousClass11I r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16750ta A00(java.lang.String r5, byte[] r6) {
        /*
            r4 = 0
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x003f }
            r0.<init>(r6)     // Catch:{ IOException | ClassNotFoundException -> 0x003f }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x003f }
            r3.<init>(r0)     // Catch:{ IOException | ClassNotFoundException -> 0x003f }
            java.lang.Object r2 = r3.readObject()     // Catch:{ all -> 0x003a }
            boolean r0 = r2 instanceof com.whatsapp.MediaData     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r1.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "Unexpected type of media data ("
            r1.append(r0)     // Catch:{ all -> 0x003a }
            r1.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = " )"
            r1.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x003a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x003a }
            r3.close()     // Catch:{ IOException | ClassNotFoundException -> 0x003f }
            return r4
        L_0x0030:
            com.whatsapp.MediaData r2 = (com.whatsapp.MediaData) r2     // Catch:{ all -> 0x003a }
            X.0ta r0 = X.C16750ta.A00(r2)     // Catch:{ all -> 0x003a }
            r3.close()     // Catch:{ IOException | ClassNotFoundException -> 0x003f }
            return r0
        L_0x003a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ IOException | ClassNotFoundException -> 0x003f }
        L_0x003f:
            r2 = move-exception
            java.lang.String r1 = "failure fetching media data by hash; hash="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17I.A00(java.lang.String, byte[]):X.0ta");
    }

    public static final void A01(ContentValues contentValues, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, long j2, long j3, long j4, boolean z2) {
        contentValues.put("message_row_id", Long.valueOf(j2));
        contentValues.put("chat_row_id", Long.valueOf(j3));
        C38611r4.A04(contentValues, "multicast_id", str);
        C38611r4.A04(contentValues, "message_url", str2);
        C38611r4.A04(contentValues, "mime_type", str3);
        contentValues.put("file_length", Long.valueOf(j4));
        C38611r4.A04(contentValues, "media_name", str4);
        C38611r4.A04(contentValues, "file_hash", str5);
        if (num != null) {
            contentValues.put("page_count", num);
            contentValues.put("media_duration", 0);
        } else {
            contentValues.put("page_count", 0);
            contentValues.put("media_duration", Integer.valueOf(i2));
        }
        C38611r4.A04(contentValues, "media_caption", str8);
        C38611r4.A04(contentValues, "enc_file_hash", str6);
        C38611r4.A05(contentValues, "is_animated_sticker", z2);
        C38611r4.A04(contentValues, "original_file_hash", str7);
    }

    public C16750ta A02(Cursor cursor) {
        C16750ta r4 = new C16750ta();
        boolean z2 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("autotransfer_retry_enabled")) == 1) {
            z2 = true;
        }
        r4.A0L = z2;
        r4.A0I = cursor.getString(cursor.getColumnIndexOrThrow("media_job_uuid"));
        boolean z3 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("transferred")) == 1) {
            z3 = true;
        }
        r4.A0P = z3;
        boolean z4 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("transcoded")) == 1) {
            z4 = true;
        }
        r4.A0O = z4;
        r4.A0A = cursor.getLong(cursor.getColumnIndexOrThrow("file_size"));
        r4.A07 = cursor.getInt(cursor.getColumnIndexOrThrow("suspicious_content"));
        r4.A0D = cursor.getLong(cursor.getColumnIndexOrThrow("trim_from"));
        r4.A0E = cursor.getLong(cursor.getColumnIndexOrThrow("trim_to"));
        r4.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("face_x"));
        r4.A03 = cursor.getInt(cursor.getColumnIndexOrThrow("face_y"));
        r4.A0U = cursor.getBlob(cursor.getColumnIndexOrThrow("media_key"));
        r4.A0B = cursor.getLong(cursor.getColumnIndexOrThrow("media_key_timestamp"));
        r4.A08 = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        r4.A06 = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        boolean z5 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("has_streaming_sidecar")) == 1) {
            z5 = true;
        }
        r4.A0M = z5;
        r4.A05 = cursor.getInt(cursor.getColumnIndexOrThrow("gif_attribution"));
        r4.A00 = cursor.getFloat(cursor.getColumnIndexOrThrow("thumbnail_height_width_ratio"));
        r4.A0G = cursor.getString(cursor.getColumnIndexOrThrow("direct_path"));
        r4.A0R = cursor.getBlob(cursor.getColumnIndexOrThrow("first_scan_sidecar"));
        r4.A04 = cursor.getInt(cursor.getColumnIndexOrThrow("first_scan_length"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("file_path"));
        r4.A0K = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_hash"));
        r4.A0J = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_enc_hash"));
        boolean z6 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("mute_video")) == 1) {
            z6 = true;
        }
        r4.A0N = z6;
        r4.A0F = this.A00.A06(string == null ? null : new File(string));
        return r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16750ta A03(byte[] r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L_0x0058
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException -> 0x0052 }
            r3.<init>(r6)     // Catch:{ IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException -> 0x0052 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ all -> 0x004d }
            r1.<init>(r3)     // Catch:{ all -> 0x004d }
            java.lang.Object r2 = r1.readObject()     // Catch:{ all -> 0x0048 }
            r1.close()     // Catch:{ all -> 0x004d }
            r3.close()     // Catch:{ IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException -> 0x0052 }
            boolean r0 = r2 instanceof X.C16750ta
            if (r0 == 0) goto L_0x003a
            X.AnonymousClass00B.A06(r2)
            X.0ta r2 = (X.C16750ta) r2
        L_0x0020:
            java.io.File r0 = r2.A0F
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r0.getPath()
            if (r0 != 0) goto L_0x0034
            r1 = 0
        L_0x002b:
            X.0sc r0 = r5.A00
            java.io.File r0 = r0.A06(r1)
            r2.A0F = r0
        L_0x0033:
            return r2
        L_0x0034:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            goto L_0x002b
        L_0x003a:
            boolean r0 = r2 instanceof com.whatsapp.MediaData
            if (r0 == 0) goto L_0x0058
            X.AnonymousClass00B.A06(r2)
            com.whatsapp.MediaData r2 = (com.whatsapp.MediaData) r2
            X.0ta r2 = X.C16750ta.A00(r2)
            goto L_0x0020
        L_0x0048:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0     // Catch:{ IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            java.lang.String r0 = "CachedMessageStore/getMessageMediaData"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0058:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17I.A03(byte[]):X.0ta");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (X.C16030sJ.A0L(r14) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28701Xf A04(X.C15830rv r14) {
        /*
            r13 = this;
            X.1Xf r4 = new X.1Xf
            r4.<init>()
            r11 = -9223372036854775808
        L_0x0007:
            r0 = 1
            long r11 = r11 + r0
            r8 = 3000(0xbb8, float:4.204E-42)
            boolean r0 = X.C16030sJ.A0G(r14)
            r7 = 1
            r6 = 0
            if (r0 != 0) goto L_0x001b
            boolean r0 = X.C16030sJ.A0L(r14)
            r3 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            java.lang.String r1 = "msgstore/messages "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            X.1Zf r2 = new X.1Zf
            r2.<init>((java.lang.String) r0)
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]
            X.0ts r0 = r13.A01
            long r0 = r0.A02(r14)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r6] = r0
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r5[r7] = r0
            r1 = 2
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r5[r1] = r0
            boolean r0 = r13.A09()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 == 0) goto L_0x0195
            java.lang.String r0 = "SELECT _id, starred, sort_id, message_type,  message_media.file_size AS file_size,  message_media.file_path AS file_path, table_version FROM available_message_view AS message LEFT JOIN message_media AS message_media ON message_media.message_row_id = message._id WHERE message.message_type != 7 AND message.chat_row_id = ?"
            r1.append(r0)
        L_0x005b:
            java.lang.String r0 = " AND sort_id >= ?"
            r1.append(r0)
            java.lang.String r0 = " ORDER BY sort_id ASC"
            r1.append(r0)
            java.lang.String r0 = " LIMIT ?"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r7 = 1
            r9 = -9223372036854775808
            X.0tq r0 = r13.A02
            X.0tf r1 = r0.get()
            X.0tg r0 = r1.A02     // Catch:{ all -> 0x01d9 }
            android.database.Cursor r6 = r0.A08(r3, r5)     // Catch:{ all -> 0x01d9 }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            long r7 = r6.getLong(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "sort_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            long r9 = r6.getLong(r0)     // Catch:{ all -> 0x01d9 }
        L_0x0099:
            r6.moveToFirst()     // Catch:{ all -> 0x01d9 }
            r1.close()
            r2.A01()
            X.1kc r5 = new X.1kc
            r5.<init>(r6, r7, r9)
            long r2 = r5.A02
            android.database.Cursor r5 = r5.A00
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = "message_type"
            int r6 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d2 }
        L_0x00b7:
            int r0 = r5.getInt(r6)     // Catch:{ all -> 0x01d2 }
            byte r1 = (byte) r0     // Catch:{ all -> 0x01d2 }
            int r0 = r4.A06     // Catch:{ all -> 0x01d2 }
            r8 = 1
            int r0 = r0 + 1
            r4.A06 = r0     // Catch:{ all -> 0x01d2 }
            boolean r0 = X.C38621r6.A0N(r1)     // Catch:{ all -> 0x01d2 }
            r9 = 0
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "thumb_image"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x01d2 }
            if (r0 < 0) goto L_0x00e1
            byte[] r0 = r5.getBlob(r0)     // Catch:{ all -> 0x01d2 }
            X.0ta r0 = r13.A03(r0)     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0104
            java.io.File r7 = r0.A0F     // Catch:{ all -> 0x01d2 }
            goto L_0x00f8
        L_0x00e1:
            java.lang.String r0 = "file_path"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0104
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x01d2 }
            r7.<init>(r0)     // Catch:{ all -> 0x01d2 }
            X.0sc r0 = r13.A00     // Catch:{ all -> 0x01d2 }
            java.io.File r7 = r0.A06(r7)     // Catch:{ all -> 0x01d2 }
        L_0x00f8:
            if (r7 == 0) goto L_0x0104
            boolean r0 = r7.canRead()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0104
            long r9 = r7.length()     // Catch:{ all -> 0x01d2 }
        L_0x0104:
            if (r1 == 0) goto L_0x0173
            if (r1 == r8) goto L_0x0167
            r0 = 2
            if (r1 == r0) goto L_0x015b
            r0 = 3
            if (r1 == r0) goto L_0x014f
            r0 = 4
            if (r1 == r0) goto L_0x0148
            r0 = 5
            if (r1 == r0) goto L_0x0141
            r0 = 9
            if (r1 == r0) goto L_0x0135
            r0 = 16
            if (r1 == r0) goto L_0x0141
            r0 = 20
            if (r1 == r0) goto L_0x017a
            r0 = 13
            if (r1 == r0) goto L_0x0129
            r0 = 14
            if (r1 == r0) goto L_0x0148
            goto L_0x0185
        L_0x0129:
            int r0 = r4.A03     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            r4.A03 = r0     // Catch:{ all -> 0x01d2 }
            long r0 = r4.A0C     // Catch:{ all -> 0x01d2 }
            long r0 = r0 + r9
            r4.A0C = r0     // Catch:{ all -> 0x01d2 }
            goto L_0x0185
        L_0x0135:
            int r0 = r4.A02     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            r4.A02 = r0     // Catch:{ all -> 0x01d2 }
            long r0 = r4.A0B     // Catch:{ all -> 0x01d2 }
            long r0 = r0 + r9
            r4.A0B = r0     // Catch:{ all -> 0x01d2 }
            goto L_0x0185
        L_0x0141:
            int r0 = r4.A05     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            r4.A05 = r0     // Catch:{ all -> 0x01d2 }
            goto L_0x0185
        L_0x0148:
            int r0 = r4.A01     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            r4.A01 = r0     // Catch:{ all -> 0x01d2 }
            goto L_0x0185
        L_0x014f:
            int r0 = r4.A09     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            r4.A09 = r0     // Catch:{ all -> 0x01d2 }
            long r0 = r4.A0F     // Catch:{ all -> 0x01d2 }
            long r0 = r0 + r9
            r4.A0F = r0     // Catch:{ all -> 0x01d2 }
            goto L_0x0185
        L_0x015b:
            int r0 = r4.A00     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x01d2 }
            long r0 = r4.A0A     // Catch:{ all -> 0x01d2 }
            long r0 = r0 + r9
            r4.A0A = r0     // Catch:{ all -> 0x01d2 }
            goto L_0x0185
        L_0x0167:
            int r0 = r4.A04     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            r4.A04 = r0     // Catch:{ all -> 0x01d2 }
            long r0 = r4.A0D     // Catch:{ all -> 0x01d2 }
            long r0 = r0 + r9
            r4.A0D = r0     // Catch:{ all -> 0x01d2 }
            goto L_0x0185
        L_0x0173:
            int r0 = r4.A08     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            r4.A08 = r0     // Catch:{ all -> 0x01d2 }
            goto L_0x0185
        L_0x017a:
            int r0 = r4.A07     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            r4.A07 = r0     // Catch:{ all -> 0x01d2 }
            long r0 = r4.A0E     // Catch:{ all -> 0x01d2 }
            long r0 = r0 + r9
            r4.A0E = r0     // Catch:{ all -> 0x01d2 }
        L_0x0185:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x01d2 }
            if (r0 != 0) goto L_0x00b7
            r5.close()
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x01a2
            r11 = r2
            goto L_0x0007
        L_0x0195:
            java.lang.String r0 = "SELECT _id, starred, message_type, thumb_image, sort_id, table_version FROM available_message_view AS message WHERE message.message_type != 7 AND message.chat_row_id = ?"
            r1.append(r0)
            X.C224417y.A02(r1, r3)
            goto L_0x005b
        L_0x019f:
            r5.close()
        L_0x01a2:
            int r1 = r4.A03
            int r0 = r4.A08
            int r1 = r1 + r0
            int r0 = r4.A00
            int r1 = r1 + r0
            int r0 = r4.A04
            int r1 = r1 + r0
            int r0 = r4.A09
            int r1 = r1 + r0
            int r0 = r4.A01
            int r1 = r1 + r0
            int r0 = r4.A02
            int r1 = r1 + r0
            int r0 = r4.A05
            int r1 = r1 + r0
            int r0 = r4.A07
            int r1 = r1 + r0
            r4.A06 = r1
            long r2 = r4.A0C
            long r0 = r4.A0A
            long r2 = r2 + r0
            long r0 = r4.A0D
            long r2 = r2 + r0
            long r0 = r4.A0F
            long r2 = r2 + r0
            long r0 = r4.A0B
            long r2 = r2 + r0
            long r0 = r4.A0E
            long r2 = r2 + r0
            r4.A0G = r2
            return r4
        L_0x01d2:
            r0 = move-exception
            if (r5 == 0) goto L_0x01dd
            r5.close()     // Catch:{ all -> 0x01dd }
            throw r0
        L_0x01d9:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17I.A04(X.0rv):X.1Xf");
    }

    public void A05(ContentValues contentValues, C16750ta r5) {
        AnonymousClass00B.A06(r5);
        C38611r4.A05(contentValues, "autotransfer_retry_enabled", r5.A0L);
        C38611r4.A04(contentValues, "media_job_uuid", r5.A0I);
        C38611r4.A05(contentValues, "transferred", r5.A0P);
        C38611r4.A05(contentValues, "transcoded", r5.A0O);
        contentValues.put("file_size", Long.valueOf(r5.A0A));
        contentValues.put("suspicious_content", Integer.valueOf(r5.A07));
        contentValues.put("trim_from", Long.valueOf(r5.A0D));
        contentValues.put("trim_to", Long.valueOf(r5.A0E));
        contentValues.put("face_x", Integer.valueOf(r5.A02));
        contentValues.put("face_y", Integer.valueOf(r5.A03));
        C38611r4.A06(contentValues, "media_key", r5.A0U);
        contentValues.put("media_key_timestamp", Long.valueOf(r5.A0B));
        contentValues.put("width", Integer.valueOf(r5.A08));
        contentValues.put("height", Integer.valueOf(r5.A06));
        C38611r4.A05(contentValues, "has_streaming_sidecar", r5.A0M);
        contentValues.put("gif_attribution", Integer.valueOf(r5.A05));
        contentValues.put("thumbnail_height_width_ratio", Float.valueOf(r5.A00));
        C38611r4.A04(contentValues, "direct_path", r5.A0G);
        C38611r4.A06(contentValues, "first_scan_sidecar", r5.A0R);
        contentValues.put("first_scan_length", Integer.valueOf(r5.A04));
        File file = r5.A0F;
        if (file != null) {
            contentValues.put("file_path", this.A00.A08(file));
        } else {
            contentValues.putNull("file_path");
        }
        C38611r4.A04(contentValues, "partial_media_hash", r5.A0K);
        C38611r4.A04(contentValues, "partial_media_enc_hash", r5.A0J);
        C38611r4.A05(contentValues, "mute_video", r5.A0N);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C16750ta r20, long r21) {
        /*
            r19 = this;
            java.lang.String r11 = "sort_order"
            r1 = r20
            if (r20 == 0) goto L_0x00bd
            com.obwhatsapp.InteractiveAnnotation[] r0 = r1.A0V
            if (r0 == 0) goto L_0x00bd
            r0 = r19
            X.0tq r0 = r0.A02
            X.0tf r9 = r0.A02()
            X.1cj r18 = r9.A00()     // Catch:{ all -> 0x00b8 }
            com.obwhatsapp.InteractiveAnnotation[] r10 = r1.A0V     // Catch:{ all -> 0x00b3 }
            int r8 = r10.length     // Catch:{ all -> 0x00b3 }
            r7 = 0
            r17 = 0
        L_0x001d:
            if (r7 >= r8) goto L_0x00a9
            r2 = r10[r7]     // Catch:{ all -> 0x00b3 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00b3 }
            r3.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x00b3 }
            r3.put(r1, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = "location_latitude"
            com.obwhatsapp.SerializableLocation r0 = r2.serializableLocation     // Catch:{ all -> 0x00b3 }
            double r0 = r0.latitude     // Catch:{ all -> 0x00b3 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00b3 }
            r3.put(r4, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = "location_longitude"
            com.obwhatsapp.SerializableLocation r0 = r2.serializableLocation     // Catch:{ all -> 0x00b3 }
            double r0 = r0.longitude     // Catch:{ all -> 0x00b3 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00b3 }
            r3.put(r4, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "location_name"
            com.obwhatsapp.SerializableLocation r0 = r2.serializableLocation     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x00b3 }
            r3.put(r1, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00b3 }
            r3.put(r11, r0)     // Catch:{ all -> 0x00b3 }
            X.0tg r6 = r9.A02     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "message_media_interactive_annotation"
            long r15 = r6.A02(r3, r0)     // Catch:{ all -> 0x00b3 }
            int r17 = r17 + 1
            com.obwhatsapp.SerializablePoint[] r5 = r2.polygonVertices     // Catch:{ all -> 0x00b3 }
            if (r5 == 0) goto L_0x00a5
            int r4 = r5.length     // Catch:{ all -> 0x00b3 }
            r3 = 0
            r14 = 0
        L_0x006a:
            if (r3 >= r4) goto L_0x00a5
            r13 = r5[r3]     // Catch:{ all -> 0x00b3 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x00b3 }
            r2.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "message_media_interactive_annotation_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00b3 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r12 = "x"
            double r0 = r13.f147x     // Catch:{ all -> 0x00b3 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00b3 }
            r2.put(r12, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r12 = "y"
            double r0 = r13.f148y     // Catch:{ all -> 0x00b3 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00b3 }
            r2.put(r12, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00b3 }
            r2.put(r11, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "message_media_interactive_annotation_vertex"
            r6.A02(r2, r0)     // Catch:{ all -> 0x00b3 }
            int r14 = r14 + 1
            int r3 = r3 + 1
            goto L_0x006a
        L_0x00a5:
            int r7 = r7 + 1
            goto L_0x001d
        L_0x00a9:
            r18.A00()     // Catch:{ all -> 0x00b3 }
            r18.close()     // Catch:{ all -> 0x00b8 }
            r9.close()
            return
        L_0x00b3:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            throw r0
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17I.A06(X.0ta, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0138 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb A[Catch:{ all -> 0x0134, all -> 0x0138, all -> 0x0139 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3 A[Catch:{ all -> 0x0134, all -> 0x0138, all -> 0x0139 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C16740tZ r37) {
        /*
            r36 = this;
            r7 = r37
            boolean r0 = r7 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0141
            X.1Vw r6 = r7.A11
            X.0rv r0 = r6.A00
            boolean r0 = X.C16030sJ.A0K(r0)
            if (r0 != 0) goto L_0x0141
            long r2 = r7.A13
            r0 = 0
            r9 = 0
            r8 = 1
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r4 = 0
            if (r5 <= 0) goto L_0x001c
            r4 = 1
        L_0x001c:
            java.lang.String r3 = "MediaCoreMessageStore/insertOrUpdateMessage/message must have row_id set; key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            X.AnonymousClass00B.A0C(r2, r4)
            r5 = r7
            X.0tY r5 = (X.C16730tY) r5
            r4 = r36
            boolean r2 = r4.A09()
            if (r2 != 0) goto L_0x004c
            long r2 = r7.A13
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0141
            long r2 = r7.A13
            X.11I r11 = r4.A03
            java.lang.String r10 = "migration_message_media_index"
            long r11 = r11.A01(r10, r0)
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x0141
        L_0x004c:
            int r2 = r7.A08()
            r10 = 0
            if (r2 != r8) goto L_0x0054
            r10 = 1
        L_0x0054:
            java.lang.String r3 = "MediaCoreMessageStore/insertOrUpdateMessage/message in main storage; key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            X.AnonymousClass00B.A0C(r2, r10)
            X.0tq r2 = r4.A02
            X.0tf r10 = r2.A02()
            X.1cj r17 = r10.A00()     // Catch:{ all -> 0x0139 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0134 }
            r3.<init>()     // Catch:{ all -> 0x0134 }
            X.0ta r2 = r5.A02     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x007b
            r4.A05(r3, r2)     // Catch:{ all -> 0x0134 }
        L_0x007b:
            long r15 = r5.A13     // Catch:{ all -> 0x0134 }
            X.0ts r11 = r4.A01     // Catch:{ all -> 0x0134 }
            X.1Vw r2 = r5.A11     // Catch:{ all -> 0x0134 }
            X.0rv r2 = r2.A00     // Catch:{ all -> 0x0134 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x0134 }
            long r31 = r11.A02(r2)     // Catch:{ all -> 0x0134 }
            java.lang.String r2 = r5.A09     // Catch:{ all -> 0x0134 }
            r20 = r2
            java.lang.String r2 = r5.A08     // Catch:{ all -> 0x0134 }
            r21 = r2
            java.lang.String r2 = r5.A06     // Catch:{ all -> 0x0134 }
            r22 = r2
            long r13 = r5.A01     // Catch:{ all -> 0x0134 }
            java.lang.String r23 = r5.A14()     // Catch:{ all -> 0x0134 }
            java.lang.String r2 = r5.A05     // Catch:{ all -> 0x0134 }
            r18 = r2
            boolean r2 = r5 instanceof X.C38631rA     // Catch:{ all -> 0x0134 }
            r19 = 0
            if (r2 == 0) goto L_0x00c3
            r11 = r5
            X.1rA r11 = (X.C38631rA) r11     // Catch:{ all -> 0x0134 }
            int r2 = r11.A00     // Catch:{ all -> 0x0134 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0134 }
            java.lang.String r12 = r11.A01     // Catch:{ all -> 0x0134 }
            r28 = 0
        L_0x00b3:
            java.lang.String r11 = r5.A04     // Catch:{ all -> 0x0134 }
            boolean r2 = r5 instanceof X.C38641rB     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x00ca
            r2 = r5
            X.1rB r2 = (X.C38641rB) r2     // Catch:{ all -> 0x0134 }
            boolean r2 = r2.A00     // Catch:{ all -> 0x0134 }
            r35 = 1
            if (r2 != 0) goto L_0x00cc
            goto L_0x00ca
        L_0x00c3:
            int r28 = r5.A04()     // Catch:{ all -> 0x0134 }
            r12 = r19
            goto L_0x00b3
        L_0x00ca:
            r35 = 0
        L_0x00cc:
            java.lang.String r2 = r5.A0A     // Catch:{ all -> 0x0134 }
            r24 = r18
            r25 = r11
            r26 = r2
            r27 = r12
            r29 = r15
            r33 = r13
            r18 = r3
            A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35)     // Catch:{ all -> 0x0134 }
            X.0tg r12 = r10.A02     // Catch:{ all -> 0x0134 }
            java.lang.String r11 = "message_media"
            long r13 = r12.A02(r3, r11)     // Catch:{ all -> 0x0134 }
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f3
            long r1 = r7.A13     // Catch:{ all -> 0x0134 }
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0121
            r9 = 1
            goto L_0x0121
        L_0x00f3:
            java.lang.String r0 = "message_row_id"
            r3.remove(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ all -> 0x0134 }
            long r0 = r7.A13     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0134 }
            r2[r9] = r0     // Catch:{ all -> 0x0134 }
            int r0 = r12.A00(r11, r3, r4, r2)     // Catch:{ all -> 0x0134 }
            if (r0 == r8) goto L_0x012d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r1.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/Failed to update message media; key="
            r1.append(r0)     // Catch:{ all -> 0x0134 }
            r1.append(r6)     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0134 }
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0134 }
            r0.<init>(r1)     // Catch:{ all -> 0x0134 }
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0121:
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r9)     // Catch:{ all -> 0x0134 }
            X.0ta r2 = r5.A02     // Catch:{ all -> 0x0134 }
            long r0 = r5.A13     // Catch:{ all -> 0x0134 }
            r4.A06(r2, r0)     // Catch:{ all -> 0x0134 }
        L_0x012d:
            r17.A00()     // Catch:{ all -> 0x0134 }
            r17.close()     // Catch:{ all -> 0x0139 }
            goto L_0x013e
        L_0x0134:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0138 }
        L_0x0138:
            throw r0     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x013d }
        L_0x013d:
            throw r0
        L_0x013e:
            r10.close()
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17I.A07(X.0tZ):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x016d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C16730tY r22, long r23) {
        /*
            r21 = this;
            r11 = r22
            int r1 = r11.A08()
            r7 = 0
            r6 = 1
            r0 = 2
            r2 = 0
            if (r1 != r0) goto L_0x000d
            r2 = 1
        L_0x000d:
            java.lang.String r1 = "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/message in main storage; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            X.1Vw r5 = r11.A11
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            r20 = r21
            r0 = r20
            X.0tq r0 = r0.A02
            X.0tf r17 = r0.A02()
            X.1cj r16 = r17.A00()     // Catch:{ all -> 0x016e }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0169 }
            r4.<init>()     // Catch:{ all -> 0x0169 }
            boolean r0 = r11 instanceof X.C38631rA     // Catch:{ all -> 0x0169 }
            r10 = 0
            if (r0 == 0) goto L_0x0124
            r1 = r11
            X.1rA r1 = (X.C38631rA) r1     // Catch:{ all -> 0x0169 }
            int r0 = r1.A00     // Catch:{ all -> 0x0169 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r15 = r1.A01     // Catch:{ all -> 0x0169 }
            r14 = 0
        L_0x0044:
            X.0tm r0 = r11.A0F()     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x004e
            byte[] r10 = r0.A07()     // Catch:{ all -> 0x0169 }
        L_0x004e:
            java.lang.String r8 = r11.A08     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = r11.A06     // Catch:{ all -> 0x0169 }
            long r0 = r11.A01     // Catch:{ all -> 0x0169 }
            r18 = r0
            java.lang.String r13 = r11.A14()     // Catch:{ all -> 0x0169 }
            java.lang.String r12 = r11.A05     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = r11.A04     // Catch:{ all -> 0x0169 }
            java.lang.Long r0 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0169 }
            java.lang.String r2 = "message_row_id"
            r4.put(r2, r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "message_url"
            X.C38611r4.A04(r4, r0, r8)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "mime_type"
            X.C38611r4.A04(r4, r0, r3)     // Catch:{ all -> 0x0169 }
            java.lang.Long r3 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "file_length"
            r4.put(r0, r3)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "media_name"
            X.C38611r4.A04(r4, r0, r13)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "file_hash"
            X.C38611r4.A04(r4, r0, r12)     // Catch:{ all -> 0x0169 }
            java.lang.String r8 = "media_duration"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "page_count"
            if (r9 == 0) goto L_0x011b
            r4.put(r0, r9)     // Catch:{ all -> 0x0169 }
        L_0x0091:
            r4.put(r8, r3)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "enc_file_hash"
            X.C38611r4.A04(r4, r0, r1)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "thumbnail"
            X.C38611r4.A06(r4, r0, r10)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "media_caption"
            X.C38611r4.A04(r4, r0, r15)     // Catch:{ all -> 0x0169 }
            X.0ta r3 = r11.A02     // Catch:{ all -> 0x0169 }
            if (r3 == 0) goto L_0x0106
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = r3.A0I     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "media_job_uuid"
            X.C38611r4.A04(r4, r0, r1)     // Catch:{ all -> 0x0169 }
            boolean r1 = r3.A0P     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "transferred"
            X.C38611r4.A05(r4, r0, r1)     // Catch:{ all -> 0x0169 }
            long r0 = r3.A0A     // Catch:{ all -> 0x0169 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "file_size"
            r4.put(r0, r1)     // Catch:{ all -> 0x0169 }
            byte[] r1 = r3.A0U     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "media_key"
            X.C38611r4.A06(r4, r0, r1)     // Catch:{ all -> 0x0169 }
            long r0 = r3.A0B     // Catch:{ all -> 0x0169 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "media_key_timestamp"
            r4.put(r0, r1)     // Catch:{ all -> 0x0169 }
            int r0 = r3.A08     // Catch:{ all -> 0x0169 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "width"
            r4.put(r0, r1)     // Catch:{ all -> 0x0169 }
            int r0 = r3.A06     // Catch:{ all -> 0x0169 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "height"
            r4.put(r0, r1)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = r3.A0G     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "direct_path"
            X.C38611r4.A04(r4, r0, r1)     // Catch:{ all -> 0x0169 }
            java.io.File r3 = r3.A0F     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = "file_path"
            if (r3 == 0) goto L_0x0117
            r0 = r20
            X.0sc r0 = r0.A00     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = r0.A08(r3)     // Catch:{ all -> 0x0169 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0169 }
        L_0x0106:
            r0 = r17
            X.0tg r10 = r0.A02     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = "message_quoted_media"
            long r11 = r10.A02(r4, r3)     // Catch:{ all -> 0x0169 }
            r8 = 0
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0130
            goto L_0x012a
        L_0x0117:
            r4.putNull(r1)     // Catch:{ all -> 0x0169 }
            goto L_0x0106
        L_0x011b:
            r4.put(r0, r3)     // Catch:{ all -> 0x0169 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0169 }
            goto L_0x0091
        L_0x0124:
            int r14 = r11.A00     // Catch:{ all -> 0x0169 }
            r9 = r10
            r15 = r10
            goto L_0x0044
        L_0x012a:
            int r0 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x015a
            r7 = 1
            goto L_0x015a
        L_0x0130:
            r4.remove(r2)     // Catch:{ all -> 0x0169 }
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = java.lang.String.valueOf(r23)     // Catch:{ all -> 0x0169 }
            r1[r7] = r0     // Catch:{ all -> 0x0169 }
            int r0 = r10.A00(r3, r4, r2, r1)     // Catch:{ all -> 0x0169 }
            if (r0 == r6) goto L_0x015f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r1.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/Failed to insert / update quoted media data; key="
            r1.append(r0)     // Catch:{ all -> 0x0169 }
            r1.append(r5)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0169 }
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0169 }
            r0.<init>(r1)     // Catch:{ all -> 0x0169 }
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x015a:
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r7)     // Catch:{ all -> 0x0169 }
        L_0x015f:
            r16.A00()     // Catch:{ all -> 0x0169 }
            r16.close()     // Catch:{ all -> 0x016e }
            r17.close()
            return
        L_0x0169:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x016d }
        L_0x016d:
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0172 }
        L_0x0172:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17I.A08(X.0tY, long):void");
    }

    public boolean A09() {
        C16900tq r0 = this.A02;
        C16800tf A012 = r0.get();
        try {
            r0.A04();
            boolean z2 = true;
            if (!r0.A04.A0E(A012.A02)) {
                if (!this.A01.A0H() || this.A03.A00("media_message_ready", 0) != 2) {
                    z2 = false;
                }
            }
            A012.close();
            return z2;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
