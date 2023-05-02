package X;

import android.content.ContentValues;

/* renamed from: X.17o  reason: invalid class name and case insensitive filesystem */
public class C223417o {
    public final C16900tq A00;
    public final C16490t9 A01;

    public C223417o(C16900tq r1, C16490t9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(byte[] bArr, long j2) {
        C16800tf A02 = this.A00.A02();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("message_secret", bArr);
            A02.A02.A06(contentValues, "message_secret", 5);
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0037 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0037=Splitter:B:16:0x0037, B:8:0x002a=Splitter:B:8:0x002a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A01(long r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A00
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "SELECT message_secret FROM message_secret WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0038 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x0038 }
            r2[r1] = r0     // Catch:{ all -> 0x0038 }
            android.database.Cursor r1 = r4.A08(r3, r2)     // Catch:{ all -> 0x0038 }
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "message_secret"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0031 }
            byte[] r0 = r1.getBlob(r0)     // Catch:{ all -> 0x0031 }
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r1.close()     // Catch:{ all -> 0x0038 }
            r5.close()
            return r0
        L_0x0031:
            r0 = move-exception
            if (r1 == 0) goto L_0x0037
            r1.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223417o.A01(long):byte[]");
    }
}
