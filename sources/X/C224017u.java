package X;

import android.content.ContentValues;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.17u  reason: invalid class name and case insensitive filesystem */
public class C224017u {
    public final C16920ts A00;
    public final C216314v A01;
    public final C16900tq A02;

    public C224017u(C16920ts r1, C216314v r2, C16900tq r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void A00(ContentValues contentValues, C38891ra r5, long j2) {
        contentValues.put("message_row_id", Long.valueOf(j2));
        UserJid userJid = r5.A01;
        if (userJid != null) {
            contentValues.put("business_owner_jid", Long.valueOf(this.A01.A01(userJid)));
        }
        C38611r4.A04(contentValues, "product_id", r5.A06);
        C38611r4.A04(contentValues, "title", r5.A09);
        C38611r4.A04(contentValues, FacebookFacade.RequestParameter.DESCRIPTION, r5.A04);
        String str = r5.A03;
        if (!(str == null || r5.A0A == null)) {
            contentValues.put("currency_code", str);
            BigDecimal bigDecimal = r5.A0A;
            BigDecimal bigDecimal2 = C39641sp.A00;
            contentValues.put("amount_1000", Long.valueOf(bigDecimal.multiply(bigDecimal2).longValue()));
            BigDecimal bigDecimal3 = r5.A0B;
            if (bigDecimal3 != null) {
                contentValues.put("sale_amount_1000", Long.valueOf(bigDecimal3.multiply(bigDecimal2).longValue()));
            }
        }
        C38611r4.A04(contentValues, "retailer_id", r5.A08);
        C38611r4.A04(contentValues, "url", r5.A07);
        contentValues.put("product_image_count", Integer.valueOf(r5.A00));
        C38611r4.A04(contentValues, "body", r5.A02);
        C38611r4.A04(contentValues, "footer", r5.A05);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C38891ra r7, long r8) {
        /*
            r6 = this;
            int r1 = r7.A08()
            r5 = 1
            r0 = 2
            r2 = 0
            if (r1 != r0) goto L_0x000a
            r2 = 1
        L_0x000a:
            java.lang.String r0 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/message in main storage; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r7.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            X.0tq r0 = r6.A02     // Catch:{ SQLiteConstraintException -> 0x0047 }
            X.0tf r4 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x0047 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0042 }
            r3.<init>()     // Catch:{ all -> 0x0042 }
            r6.A00(r3, r7, r8)     // Catch:{ all -> 0x0042 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "message_quoted_product"
            r0 = 5
            long r1 = r2.A06(r3, r1, r0)     // Catch:{ all -> 0x0042 }
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
            r5 = 0
        L_0x0039:
            java.lang.String r0 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r5)     // Catch:{ all -> 0x0042 }
            r4.close()     // Catch:{ SQLiteConstraintException -> 0x0047 }
            return
        L_0x0042:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0047 }
        L_0x0047:
            r2 = move-exception
            java.lang.String r1 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/fail to insert. Error message is: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224017u.A01(X.1ra, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0103 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0103=Splitter:B:24:0x0103, B:19:0x00fb=Splitter:B:19:0x00fb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C38891ra r8, java.lang.String r9) {
        /*
            r7 = this;
            long r3 = r8.A13
            r6 = 1
            r5 = 0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.String r0 = "ProductMessageStore/fillProductDataIfAvailable/message must have row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r8.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            java.lang.String[] r2 = new java.lang.String[r6]
            long r0 = r8.A13
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r5] = r0
            X.0tq r0 = r7.A02
            X.0tf r1 = r0.get()
            X.0tg r0 = r1.A02     // Catch:{ all -> 0x0108 }
            android.database.Cursor r2 = r0.A08(r9, r2)     // Catch:{ all -> 0x0108 }
            if (r2 == 0) goto L_0x0104
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00fb
            X.14v r6 = r7.A01     // Catch:{ all -> 0x00ff }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "business_owner_jid"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            long r3 = r2.getLong(r0)     // Catch:{ all -> 0x00ff }
            com.whatsapp.jid.Jid r0 = r6.A07(r5, r3)     // Catch:{ all -> 0x00ff }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00ff }
            r8.A01 = r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "product_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00ff }
            r8.A06 = r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "title"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00ff }
            r8.A09 = r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "body"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00ff }
            r8.A02 = r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "footer"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00ff }
            r8.A05 = r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "description"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00ff }
            r8.A04 = r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "currency_code"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00ff }
            r8.A03 = r0     // Catch:{ all -> 0x00ff }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = r8.A03     // Catch:{ IllegalArgumentException -> 0x00d2 }
            X.1sq r5 = new X.1sq     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r5.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            java.lang.String r0 = "amount_1000"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            long r3 = r2.getLong(r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            java.math.BigDecimal r0 = X.C39641sp.A00(r5, r3)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r8.A0A = r0     // Catch:{ IllegalArgumentException -> 0x00d2 }
            java.lang.String r0 = r8.A03     // Catch:{ IllegalArgumentException -> 0x00d2 }
            X.1sq r5 = new X.1sq     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r5.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            java.lang.String r0 = "sale_amount_1000"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            long r3 = r2.getLong(r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            java.math.BigDecimal r0 = X.C39641sp.A00(r5, r3)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r8.A0B = r0     // Catch:{ IllegalArgumentException -> 0x00d2 }
            goto L_0x00d5
        L_0x00d2:
            r0 = 0
            r8.A03 = r0     // Catch:{ all -> 0x00ff }
        L_0x00d5:
            java.lang.String r0 = "retailer_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00ff }
            r8.A08 = r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "url"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00ff }
            r8.A07 = r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "product_image_count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x00ff }
            r8.A00 = r0     // Catch:{ all -> 0x00ff }
        L_0x00fb:
            r2.close()     // Catch:{ all -> 0x0108 }
            goto L_0x0104
        L_0x00ff:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0103 }
        L_0x0103:
            throw r0     // Catch:{ all -> 0x0108 }
        L_0x0104:
            r1.close()
            return
        L_0x0108:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x010c }
        L_0x010c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224017u.A02(X.1ra, java.lang.String):void");
    }
}
