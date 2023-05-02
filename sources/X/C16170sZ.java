package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.LinkedList;

/* renamed from: X.0sZ  reason: invalid class name and case insensitive filesystem */
public class C16170sZ {
    public final C209912j A00;

    public C16170sZ(C209912j r1) {
        this.A00 = r1;
    }

    public static final C37771pi A00(Cursor cursor, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String string = cursor.getString(i4);
        String str = "";
        if (string == null) {
            string = str;
        }
        String string2 = cursor.getString(i5);
        if (string2 != null) {
            str = string2;
        }
        C37761ph r3 = new C37761ph();
        r3.A0D = C27031Qe.A01(cursor.getString(i2), cursor.getString(i3));
        r3.A0F = string;
        r3.A0H = str;
        r3.A0M = new LinkedList();
        r3.A0L = new LinkedList();
        boolean z2 = true;
        r3.A0S = true;
        if (i6 > 0) {
            r3.A05 = cursor.getString(i6);
        }
        if (i7 > 0) {
            boolean z3 = false;
            if (cursor.getInt(i7) == 1) {
                z3 = true;
            }
            r3.A0O = z3;
        }
        if (i8 > 0) {
            if (cursor.getInt(i8) != 1) {
                z2 = false;
            }
            r3.A0P = z2;
            r3.A0N = z2;
        }
        return new C37771pi(r3);
    }

    public void A01(C37771pi r8, String str, String str2) {
        C16800tf A02 = this.A00.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("authority", str);
            contentValues.put("sticker_pack_id", str2);
            contentValues.put("sticker_pack_name", r8.A0H);
            contentValues.put("sticker_pack_publisher", r8.A0J);
            String str3 = r8.A0G;
            contentValues.put("sticker_pack_image_data_hash", str3);
            int i2 = 1;
            int i3 = 0;
            if (r8.A0O) {
                i3 = 1;
            }
            contentValues.put("avoid_cache", Integer.valueOf(i3));
            if (!r8.A0P) {
                i2 = 0;
            }
            contentValues.put("is_animated_pack", Integer.valueOf(i2));
            A02.A02.A06(contentValues, "third_party_whitelist_packs", 5);
            r8.A01 = r8.A08;
            r8.A02 = str3;
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0032 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0032=Splitter:B:15:0x0032, B:7:0x0025=Splitter:B:7:0x0025} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r7 = "authority = ? AND sticker_pack_id = ?"
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]
            r3 = 0
            r8[r3] = r13
            r0 = 1
            r8[r0] = r14
            X.12j r0 = r12.A00
            X.0tf r2 = r0.get()
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = "third_party_whitelist_packs"
            r6 = 0
            r10 = r6
            r11 = r6
            r9 = r6
            android.database.Cursor r1 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0033 }
            int r0 = r1.getCount()     // Catch:{ all -> 0x002c }
            if (r0 <= 0) goto L_0x0025
            r3 = 1
        L_0x0025:
            r1.close()     // Catch:{ all -> 0x0033 }
            r2.close()
            return r3
        L_0x002c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16170sZ.A02(java.lang.String, java.lang.String):boolean");
    }
}
