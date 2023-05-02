package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1Qj  reason: invalid class name and case insensitive filesystem */
public class C27081Qj {
    public final C16300so A00;
    public final C209912j A01;

    public C27081Qj(C16300so r1, C209912j r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final C37721pc A00(Cursor cursor) {
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("plaintext_hash");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("hash_of_image_part");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("url");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("enc_hash");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("direct_path");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("mimetype");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("media_key");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("width");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("height");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("emojis");
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("is_first_party");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("is_avatar");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("avatar_template_id");
        String string = cursor2.getString(columnIndexOrThrow);
        String string2 = cursor2.getString(columnIndexOrThrow6);
        if (string == null) {
            return null;
        }
        String string3 = cursor2.getString(columnIndexOrThrow2);
        long j2 = cursor2.getLong(columnIndexOrThrow3);
        String string4 = cursor2.getString(columnIndexOrThrow4);
        String string5 = cursor2.getString(columnIndexOrThrow5);
        String string6 = cursor2.getString(columnIndexOrThrow7);
        String string7 = cursor2.getString(columnIndexOrThrow8);
        int i2 = cursor2.getInt(columnIndexOrThrow9);
        int i3 = cursor2.getInt(columnIndexOrThrow10);
        int i4 = cursor2.getInt(columnIndexOrThrow11);
        String string8 = cursor2.getString(columnIndexOrThrow12);
        boolean z2 = false;
        if (cursor2.getInt(columnIndexOrThrow13) == 1) {
            z2 = true;
        }
        boolean z3 = false;
        if (cursor2.getInt(columnIndexOrThrow14) == 1) {
            z3 = true;
        }
        return new C37721pc(string, string3, string4, string5, string2, string6, string7, string8, cursor2.getString(columnIndexOrThrow15), i2, i3, i4, j2, z2, z3);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37721pc A01(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            r3[r0] = r5
            X.12j r0 = r4.A01
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id FROM starred_stickers WHERE avatar_template_id = ? ORDER BY timestamp DESC"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x0034 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0025
            X.1pc r0 = A00(r1)     // Catch:{ all -> 0x002d }
            r1.close()     // Catch:{ all -> 0x0034 }
            r2.close()
            return r0
        L_0x0025:
            r1.close()     // Catch:{ all -> 0x0034 }
            r2.close()
            r0 = 0
            return r0
        L_0x002d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27081Qj.A01(java.lang.String):X.1pc");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x010b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0110 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A02(int r39, int r40) {
        /*
            r38 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6 = r40
            if (r40 != 0) goto L_0x0020
            java.lang.String r5 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id FROM starred_stickers ORDER BY timestamp DESC LIMIT ?"
        L_0x000b:
            r1 = 2
            if (r6 != r1) goto L_0x001d
            java.lang.String r0 = "1"
        L_0x0010:
            r4 = 0
            r3 = 1
            if (r40 != 0) goto L_0x0023
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = java.lang.Integer.toString(r39)
            r1[r4] = r0
            goto L_0x002d
        L_0x001d:
            java.lang.String r0 = "0"
            goto L_0x0010
        L_0x0020:
            java.lang.String r5 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id FROM starred_stickers WHERE is_avatar = ? ORDER BY timestamp DESC LIMIT ?"
            goto L_0x000b
        L_0x0023:
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r4] = r0
            java.lang.String r0 = java.lang.Integer.toString(r39)
            r1[r3] = r0
        L_0x002d:
            r37 = r38
            r0 = r37
            X.12j r0 = r0.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0111 }
            X.0tf r19 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0111 }
            r0 = r19
            X.0tg r0 = r0.A02     // Catch:{ all -> 0x010c }
            android.database.Cursor r0 = r0.A08(r5, r1)     // Catch:{ all -> 0x010c }
            java.lang.String r1 = "plaintext_hash"
            int r18 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "hash_of_image_part"
            int r17 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "timestamp"
            int r16 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "url"
            int r15 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "enc_hash"
            int r14 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "direct_path"
            int r13 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "mimetype"
            int r12 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "media_key"
            int r11 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "file_size"
            int r10 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "width"
            int r9 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "height"
            int r8 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "emojis"
            int r7 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "is_first_party"
            int r6 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "is_avatar"
            int r5 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "avatar_template_id"
            int r4 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0105 }
        L_0x009c:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0105 }
            if (r1 == 0) goto L_0x00fe
            r1 = r18
            java.lang.String r21 = r0.getString(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r25 = r0.getString(r13)     // Catch:{ all -> 0x0105 }
            if (r21 == 0) goto L_0x009c
            r1 = r17
            java.lang.String r22 = r0.getString(r1)     // Catch:{ all -> 0x0105 }
            r1 = r16
            long r33 = r0.getLong(r1)     // Catch:{ all -> 0x0105 }
            java.lang.String r23 = r0.getString(r15)     // Catch:{ all -> 0x0105 }
            java.lang.String r24 = r0.getString(r14)     // Catch:{ all -> 0x0105 }
            java.lang.String r26 = r0.getString(r12)     // Catch:{ all -> 0x0105 }
            java.lang.String r27 = r0.getString(r11)     // Catch:{ all -> 0x0105 }
            int r30 = r0.getInt(r10)     // Catch:{ all -> 0x0105 }
            int r31 = r0.getInt(r9)     // Catch:{ all -> 0x0105 }
            int r32 = r0.getInt(r8)     // Catch:{ all -> 0x0105 }
            java.lang.String r28 = r0.getString(r7)     // Catch:{ all -> 0x0105 }
            int r3 = r0.getInt(r6)     // Catch:{ all -> 0x0105 }
            r1 = 1
            r35 = 0
            if (r3 != r1) goto L_0x00e5
            r35 = 1
        L_0x00e5:
            int r3 = r0.getInt(r5)     // Catch:{ all -> 0x0105 }
            r36 = 0
            if (r3 != r1) goto L_0x00ef
            r36 = 1
        L_0x00ef:
            java.lang.String r29 = r0.getString(r4)     // Catch:{ all -> 0x0105 }
            X.1pc r1 = new X.1pc     // Catch:{ all -> 0x0105 }
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36)     // Catch:{ all -> 0x0105 }
            r2.add(r1)     // Catch:{ all -> 0x0105 }
            goto L_0x009c
        L_0x00fe:
            r0.close()     // Catch:{ all -> 0x010c }
            r19.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0111 }
            return r2
        L_0x0105:
            r1 = move-exception
            if (r0 == 0) goto L_0x010b
            r0.close()     // Catch:{ all -> 0x010b }
        L_0x010b:
            throw r1     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x0110 }
        L_0x0110:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0111 }
        L_0x0111:
            r1 = move-exception
            java.lang.String r4 = "StarredStickerDBTableHelper.getStarredStickersData"
            com.whatsapp.util.Log.e(r4, r1)
            r0 = r37
            X.0so r3 = r0.A00
            java.lang.String r1 = r1.getMessage()
            r0 = 1
            r3.AcB(r4, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27081Qj.A02(int, int):java.util.List");
    }

    public void A03(C37721pc r6) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("plaintext_hash", r6.A0B);
        contentValues.put("hash_of_image_part", r6.A02);
        contentValues.put("timestamp", Long.valueOf(r6.A08));
        contentValues.put("url", r6.A0E);
        contentValues.put("enc_hash", r6.A0A);
        contentValues.put("direct_path", r6.A09);
        contentValues.put("mimetype", r6.A0D);
        contentValues.put("media_key", r6.A0C);
        contentValues.put("file_size", Integer.valueOf(r6.A05));
        contentValues.put("width", Integer.valueOf(r6.A07));
        contentValues.put("height", Integer.valueOf(r6.A06));
        contentValues.put("emojis", r6.A01);
        contentValues.put("is_first_party", Boolean.valueOf(r6.A04));
        contentValues.put("is_avatar", Boolean.valueOf(r6.A03));
        contentValues.put("avatar_template_id", r6.A00);
        C16800tf A02 = this.A01.A02();
        try {
            A02.A02.A06(contentValues, "starred_stickers", 5);
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A04(String str) {
        C16800tf A02 = this.A01.A02();
        try {
            A02.A02.A01("starred_stickers", "plaintext_hash = ?", new String[]{str});
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
