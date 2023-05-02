package X;

import android.content.ContentValues;

/* renamed from: X.14Z  reason: invalid class name */
public class AnonymousClass14Z {
    public final C209912j A00;

    public AnonymousClass14Z(C209912j r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00() {
        /*
            r5 = this;
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.12j r0 = r5.A00
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "SELECT pack_id FROM unseen_sticker_packs"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "pack_id"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002f }
        L_0x001a:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x002f }
            r4.add(r0)     // Catch:{ all -> 0x002f }
            goto L_0x001a
        L_0x0028:
            r2.close()     // Catch:{ all -> 0x0036 }
            r3.close()
            return r4
        L_0x002f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14Z.A00():java.util.Set");
    }

    public void A01(String str) {
        C16800tf A02 = this.A00.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("pack_id", str);
            A02.A02.A06(contentValues, "unseen_sticker_packs", 5);
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
