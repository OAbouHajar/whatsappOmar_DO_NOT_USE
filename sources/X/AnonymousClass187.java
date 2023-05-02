package X;

import android.content.ContentValues;

/* renamed from: X.187  reason: invalid class name */
public class AnonymousClass187 {
    public final C16900tq A00;

    public AnonymousClass187(C16900tq r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0044=Splitter:B:15:0x0044, B:7:0x0037=Splitter:B:7:0x0037} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C39061rr r7, java.lang.String r8) {
        /*
            r6 = this;
            X.0tq r0 = r6.A00
            X.0tf r3 = r0.get()
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x0045 }
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0045 }
            r2 = 0
            long r0 = r7.A13     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0045 }
            r4[r2] = r0     // Catch:{ all -> 0x0045 }
            android.database.Cursor r2 = r5.A08(r8, r4)     // Catch:{ all -> 0x0045 }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "service"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003e }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x003e }
            r7.A00 = r0     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "expiration_timestamp"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003e }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x003e }
            r7.A01 = r0     // Catch:{ all -> 0x003e }
        L_0x0037:
            r2.close()     // Catch:{ all -> 0x0045 }
            r3.close()
            return
        L_0x003e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0044
            r2.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass187.A00(X.1rr, java.lang.String):void");
    }

    public final void A01(String str, int i2, long j2, long j3) {
        C16800tf A02 = this.A00.A02();
        try {
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("service", Integer.valueOf(i2));
            contentValues.put("expiration_timestamp", Long.valueOf(j3));
            A02.A02.A06(contentValues, str, 5);
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
