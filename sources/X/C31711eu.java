package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;

/* renamed from: X.1eu  reason: invalid class name and case insensitive filesystem */
public class C31711eu {
    public final C16440t3 A00;
    public final C002601d A01;

    public C31711eu(C16440t3 r1, C002601d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(int i2, byte[] bArr) {
        C16800tf A02 = this.A01.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("prekey_id", Integer.valueOf(i2));
            contentValues.put("timestamp", Long.valueOf(this.A00.A00() / 1000));
            contentValues.put("record", bArr);
            A02.A02.A05(contentValues, "signed_prekeys");
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl stored signed pre key with id ");
            sb.append(i2);
            Log.i(sb.toString());
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A01(int r14) {
        /*
            r13 = this;
            java.lang.String r4 = "record"
            X.01d r0 = r13.A01
            X.0tf r2 = r0.get()
            X.0tg r5 = r2.A02     // Catch:{ all -> 0x005b }
            java.lang.String r6 = "signed_prekeys"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x005b }
            r1 = 0
            r7[r1] = r4     // Catch:{ all -> 0x005b }
            java.lang.String r8 = "prekey_id = ?"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x005b }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x005b }
            r9[r1] = r0     // Catch:{ all -> 0x005b }
            r10 = 0
            r12 = r10
            r11 = r10
            android.database.Cursor r3 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005b }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0045
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r1.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "no signed prekey available with id "
            r1.append(r0)     // Catch:{ all -> 0x0054 }
            r1.append(r14)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0054 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0054 }
            r3.close()     // Catch:{ all -> 0x005b }
            r2.close()
            return r10
        L_0x0045:
            int r0 = r3.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0054 }
            byte[] r0 = r3.getBlob(r0)     // Catch:{ all -> 0x0054 }
            r3.close()     // Catch:{ all -> 0x005b }
            r2.close()
            return r0
        L_0x0054:
            r0 = move-exception
            if (r3 == 0) goto L_0x005a
            r3.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31711eu.A01(int):byte[]");
    }
}
