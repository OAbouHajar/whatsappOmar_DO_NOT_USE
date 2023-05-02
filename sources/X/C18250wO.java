package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;

/* renamed from: X.0wO  reason: invalid class name and case insensitive filesystem */
public class C18250wO {
    public final C16900tq A00;
    public final C14710pd A01;

    public C18250wO(C16900tq r1, C14710pd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final C35361lo A00(Cursor cursor, String str) {
        Cursor cursor2 = cursor;
        String str2 = str;
        if (str == null) {
            str2 = cursor2.getString(cursor2.getColumnIndexOrThrow("background_id"));
        }
        long j2 = cursor2.getLong(cursor2.getColumnIndexOrThrow("file_size"));
        int i2 = cursor2.getInt(cursor2.getColumnIndexOrThrow("width"));
        int i3 = cursor2.getInt(cursor2.getColumnIndexOrThrow("height"));
        C35361lo r10 = new C35361lo(str2, cursor2.getString(cursor2.getColumnIndexOrThrow("mime_type")), cursor2.getString(cursor2.getColumnIndexOrThrow("fullsize_url")), cursor2.getString(cursor2.getColumnIndexOrThrow(FacebookFacade.RequestParameter.DESCRIPTION)), cursor2.getString(cursor2.getColumnIndexOrThrow("lg")), i2, i3, cursor2.getInt(cursor2.getColumnIndexOrThrow("placeholder_color")), cursor2.getInt(cursor2.getColumnIndexOrThrow("text_color")), cursor2.getInt(cursor2.getColumnIndexOrThrow("subtext_color")), j2);
        C14710pd r9 = this.A01;
        C16620tM r7 = C16620tM.A02;
        if (r9.A0E(r7, 1084)) {
            byte[] blob = cursor2.getBlob(cursor2.getColumnIndexOrThrow("media_key"));
            long j3 = cursor2.getLong(cursor2.getColumnIndexOrThrow("media_key_timestamp"));
            String string = cursor2.getString(cursor2.getColumnIndexOrThrow("file_sha256"));
            String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("file_enc_sha256"));
            String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("direct_path"));
            boolean A0E = r9.A0E(r7, 1084);
            r10.A08 = blob;
            r10.A00 = j3;
            r10.A04 = string;
            r10.A03 = string2;
            r10.A02 = string3;
            r10.A07 = A0E;
        }
        return r10;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C35361lo A01(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r1 = "PAY: PaymentBackgroundStore/getPaymentBackgroundById/id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tq r0 = r5.A00
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = "SELECT file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background WHERE background_id =?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0056 }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x0056 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x0056 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0036
            X.1lo r0 = r5.A00(r1, r6)     // Catch:{ all -> 0x004f }
            r1.close()     // Catch:{ all -> 0x0056 }
            r4.close()
            return r0
        L_0x0036:
            r1.close()     // Catch:{ all -> 0x0056 }
            r4.close()
            java.lang.String r1 = "PAY: PaymentBackgroundStore/getPaymentBackgroundById/no background found for id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x004f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18250wO.A01(java.lang.String):X.1lo");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02(java.lang.String r6) {
        /*
            r5 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0tq r0 = r5.A00
            X.0tf r3 = r0.get()
            X.0tg r0 = r3.A02     // Catch:{ all -> 0x002e }
            r2 = 0
            android.database.Cursor r1 = r0.A08(r6, r2)     // Catch:{ all -> 0x002e }
        L_0x0012:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0020
            X.1lo r0 = r5.A00(r1, r2)     // Catch:{ all -> 0x0027 }
            r4.add(r0)     // Catch:{ all -> 0x0027 }
            goto L_0x0012
        L_0x0020:
            r1.close()     // Catch:{ all -> 0x002e }
            r3.close()
            return r4
        L_0x0027:
            r0 = move-exception
            if (r1 == 0) goto L_0x002d
            r1.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18250wO.A02(java.lang.String):java.util.List");
    }

    public final void A03(C16800tf r9, C35361lo r10) {
        int i2;
        String str = r10.A05;
        boolean z2 = !TextUtils.isEmpty(str);
        boolean A0E = this.A01.A0E(C16620tM.A02, 1084);
        ContentValues contentValues = new ContentValues(15);
        String str2 = r10.A0F;
        contentValues.put("background_id", str2);
        contentValues.put("file_size", Long.valueOf(r10.A0E));
        contentValues.put("width", Integer.valueOf(r10.A0D));
        contentValues.put("height", Integer.valueOf(r10.A09));
        contentValues.put("mime_type", r10.A0G);
        contentValues.put("placeholder_color", Integer.valueOf(r10.A0A));
        contentValues.put("text_color", Integer.valueOf(r10.A0C));
        contentValues.put("subtext_color", Integer.valueOf(r10.A0B));
        String str3 = null;
        C38611r4.A06(contentValues, "media_key", A0E ? r10.A08 : null);
        contentValues.put("media_key_timestamp", Long.valueOf(A0E ? r10.A00 : 0));
        C38611r4.A04(contentValues, "file_sha256", A0E ? r10.A04 : null);
        C38611r4.A04(contentValues, "file_enc_sha256", A0E ? r10.A03 : null);
        if (A0E) {
            str3 = r10.A02;
        }
        C38611r4.A04(contentValues, "direct_path", str3);
        if (z2) {
            contentValues.put("fullsize_url", str);
            C38611r4.A04(contentValues, FacebookFacade.RequestParameter.DESCRIPTION, r10.A01);
            C38611r4.A04(contentValues, "lg", r10.A06);
            i2 = 5;
        } else {
            i2 = 4;
        }
        if (r9.A02.A06(contentValues, "payment_background", i2) == -1) {
            StringBuilder sb = new StringBuilder("PAY: PaymentBackgroundStore/insertOrReplacePaymentBackground/shouldReplace: ");
            sb.append(z2);
            sb.append(", failed for id: ");
            sb.append(str2);
            Log.e(sb.toString());
        }
    }

    public void A04(C35361lo r3) {
        StringBuilder sb = new StringBuilder("PAY: PaymentBackgroundStore/insertOrReplacePaymentBackground/id=");
        sb.append(r3.A0F);
        Log.i(sb.toString());
        C16800tf A02 = this.A00.A02();
        try {
            A03(A02, r3);
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
