package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.12k  reason: invalid class name and case insensitive filesystem */
public class C210012k {
    public final C209912j A00;

    public C210012k(C209912j r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0036 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x003b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x003b=Splitter:B:25:0x003b, B:13:0x002c=Splitter:B:13:0x002c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C34151jm A00(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 0
            X.12j r0 = r6.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x003c }
            X.0tf r4 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x003c }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = "SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id FROM stickers WHERE avatar_template_id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0037 }
            r3 = 0
            r0[r3] = r7     // Catch:{ all -> 0x0037 }
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0037 }
            java.util.List r1 = r6.A01(r2)     // Catch:{ all -> 0x0030 }
            int r0 = r1.size()     // Catch:{ all -> 0x0030 }
            if (r0 <= 0) goto L_0x0026
            java.lang.Object r0 = r1.get(r3)     // Catch:{ all -> 0x0030 }
            X.1jm r0 = (X.C34151jm) r0     // Catch:{ all -> 0x0030 }
            goto L_0x0027
        L_0x0026:
            r0 = r5
        L_0x0027:
            if (r2 == 0) goto L_0x002c
            r2.close()     // Catch:{ all -> 0x0037 }
        L_0x002c:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x003c }
            return r0
        L_0x0030:
            r0 = move-exception
            if (r2 == 0) goto L_0x0036
            r2.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x003c }
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getByPackId"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210012k.A00(java.lang.String):X.1jm");
    }

    public List A01(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("plain_file_hash");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("encrypted_file_hash");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("media_key");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("mime_type");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("height");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("width");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("sticker_pack_id");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("file_path");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("url");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("direct_path");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("emojis");
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("hash_of_image_part");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("is_avatar");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("avatar_template_id");
        while (cursor2.moveToNext()) {
            C34151jm r1 = new C34151jm();
            r1.A0D = cursor2.getString(columnIndexOrThrow);
            r1.A08 = cursor2.getString(columnIndexOrThrow2);
            r1.A0B = cursor2.getString(columnIndexOrThrow3);
            r1.A0C = cursor2.getString(columnIndexOrThrow4);
            r1.A02 = cursor2.getInt(columnIndexOrThrow5);
            r1.A03 = cursor2.getInt(columnIndexOrThrow6);
            r1.A0F = cursor2.getString(columnIndexOrThrow7);
            boolean z2 = true;
            r1.A09 = cursor2.getString(columnIndexOrThrow8);
            r1.A01 = 1;
            r1.A00 = cursor2.getInt(columnIndexOrThrow9);
            r1.A0G = cursor2.getString(columnIndexOrThrow10);
            r1.A06 = cursor2.getString(columnIndexOrThrow11);
            r1.A07 = cursor2.getString(columnIndexOrThrow12);
            r1.A0A = cursor2.getString(columnIndexOrThrow13);
            if (cursor2.getInt(columnIndexOrThrow14) != 1) {
                z2 = false;
            }
            r1.A0H = z2;
            r1.A05 = cursor2.getString(columnIndexOrThrow15);
            C37711pb.A00(r1);
            arrayList.add(r1);
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A02(java.lang.String r6) {
        /*
            r5 = this;
            X.12j r0 = r5.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x002d }
            X.0tf r4 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x002d }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id FROM stickers WHERE sticker_pack_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0028 }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x0028 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x0028 }
            java.util.List r0 = r5.A01(r1)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x001d
            r1.close()     // Catch:{ all -> 0x0028 }
        L_0x001d:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x002d }
            return r0
        L_0x0021:
            r0 = move-exception
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x002d }
        L_0x002d:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getByPackId"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210012k.A02(java.lang.String):java.util.List");
    }
}
