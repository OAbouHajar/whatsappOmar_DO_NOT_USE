package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;

/* renamed from: X.17l  reason: invalid class name and case insensitive filesystem */
public class C223117l {
    public final C216314v A00;
    public final C16900tq A01;

    public C223117l(C216314v r1, C16900tq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(ContentValues contentValues, C39021rn r4, long j2) {
        contentValues.put("message_row_id", Long.valueOf(j2));
        C38611r4.A04(contentValues, "order_id", r4.A06);
        C38611r4.A04(contentValues, "order_title", r4.A07);
        contentValues.put("item_count", Integer.valueOf(r4.A00));
        contentValues.put("status", Integer.valueOf(r4.A01));
        contentValues.put("surface", Integer.valueOf(r4.A02));
        C38611r4.A04(contentValues, "message", r4.A05);
        UserJid userJid = r4.A03;
        if (userJid != null) {
            contentValues.put("seller_jid", Long.valueOf(this.A00.A01(userJid)));
        }
        C38611r4.A04(contentValues, "token", r4.A08);
        if (r4.A0F() != null) {
            C38611r4.A06(contentValues, "thumbnail", r4.A0F().A07());
        }
        String str = r4.A04;
        if (str != null && r4.A09 != null) {
            contentValues.put("currency_code", str);
            contentValues.put("total_amount_1000", Long.valueOf(r4.A09.multiply(C39641sp.A00).longValue()));
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00be */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C39021rn r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A01     // Catch:{ SQLiteConstraintException -> 0x00bf }
            X.0tf r5 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x00bf }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            long r0 = r7.A13     // Catch:{ all -> 0x00ba }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "message_row_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r7.A06     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "order_id"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r7.A07     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "order_title"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x00ba }
            int r0 = r7.A00     // Catch:{ all -> 0x00ba }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "item_count"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ba }
            int r0 = r7.A01     // Catch:{ all -> 0x00ba }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "status"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ba }
            int r0 = r7.A02     // Catch:{ all -> 0x00ba }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "surface"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r7.A05     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "message"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x00ba }
            com.whatsapp.jid.UserJid r1 = r7.A03     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0062
            X.14v r0 = r6.A00     // Catch:{ all -> 0x00ba }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x00ba }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "seller_jid"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ba }
        L_0x0062:
            java.lang.String r1 = r7.A08     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "token"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x00ba }
            X.0tm r0 = r7.A0F()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x007e
            X.0tm r0 = r7.A0F()     // Catch:{ all -> 0x00ba }
            byte[] r1 = r0.A07()     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "thumbnail"
            X.C38611r4.A06(r2, r0, r1)     // Catch:{ all -> 0x00ba }
        L_0x007e:
            java.lang.String r1 = r7.A04     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00a1
            java.math.BigDecimal r0 = r7.A09     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "currency_code"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ba }
            java.math.BigDecimal r1 = r7.A09     // Catch:{ all -> 0x00ba }
            java.math.BigDecimal r0 = X.C39641sp.A00     // Catch:{ all -> 0x00ba }
            java.math.BigDecimal r0 = r1.multiply(r0)     // Catch:{ all -> 0x00ba }
            long r0 = r0.longValue()     // Catch:{ all -> 0x00ba }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "total_amount_1000"
            r2.put(r0, r1)     // Catch:{ all -> 0x00ba }
        L_0x00a1:
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "message_order"
            long r3 = r1.A03(r2, r0)     // Catch:{ all -> 0x00ba }
            long r1 = r7.A13     // Catch:{ all -> 0x00ba }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x00b1
            r1 = 1
        L_0x00b1:
            java.lang.String r0 = "OrderMessageStore/insertOrUpdateOrderMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ all -> 0x00ba }
            r5.close()     // Catch:{ SQLiteConstraintException -> 0x00bf }
            return
        L_0x00ba:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00be }
        L_0x00be:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x00bf }
        L_0x00bf:
            r2 = move-exception
            java.lang.String r1 = "OrderMessageStore/insertOrUpdateOrderMessage/fail to insert. Error message is: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223117l.A01(X.1rn):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C39021rn r6, long r7) {
        /*
            r5 = this;
            int r1 = r6.A08()
            r4 = 1
            r0 = 2
            r2 = 0
            if (r1 != r0) goto L_0x000a
            r2 = 1
        L_0x000a:
            java.lang.String r0 = "OrderMessageStore/insertOrUpdateQuotedOrderMessage/message in main storage; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r6.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            X.0tq r0 = r5.A01     // Catch:{ SQLiteConstraintException -> 0x0046 }
            X.0tf r3 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x0046 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0041 }
            r2.<init>()     // Catch:{ all -> 0x0041 }
            r5.A00(r2, r6, r7)     // Catch:{ all -> 0x0041 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "message_quoted_order"
            long r1 = r1.A03(r2, r0)     // Catch:{ all -> 0x0041 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            r4 = 0
        L_0x0038:
            java.lang.String r0 = "OrderMessageStore/insertOrUpdateQuotedOrderMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r4)     // Catch:{ all -> 0x0041 }
            r3.close()     // Catch:{ SQLiteConstraintException -> 0x0046 }
            return
        L_0x0041:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            java.lang.String r1 = "OrderMessageStore/insertOrUpdateQuotedOrderMessage/fail to insert. Error message is: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223117l.A02(X.1rn, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00fc */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x00f4=Splitter:B:25:0x00f4, B:30:0x00fc=Splitter:B:30:0x00fc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C39021rn r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            long r0 = r9.A13
            r4 = 1
            r7 = 0
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r2 = 0
            if (r3 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.String r0 = "OrderMessageStore/fillOrderDataIfAvailable/message must have row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r9.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            java.lang.String[] r3 = new java.lang.String[r4]
            long r0 = r9.A13
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r7] = r0
            X.0tq r0 = r8.A01
            X.0tf r2 = r0.get()
            X.0tg r0 = r2.A02     // Catch:{ all -> 0x0101 }
            android.database.Cursor r3 = r0.A08(r10, r3)     // Catch:{ all -> 0x0101 }
            if (r3 == 0) goto L_0x00fd
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00f4
            X.14v r6 = r8.A00     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "order_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x00f8 }
            r9.A06 = r0     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "order_title"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x00f8 }
            r9.A07 = r0     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "item_count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00f8 }
            r9.A00 = r0     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "message"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x00f8 }
            r9.A05 = r0     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "status"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00f8 }
            r9.A01 = r0     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "surface"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00f8 }
            r9.A02 = r0     // Catch:{ all -> 0x00f8 }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "seller_jid"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00f8 }
            com.whatsapp.jid.Jid r0 = r6.A07(r5, r0)     // Catch:{ all -> 0x00f8 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00f8 }
            r9.A03 = r0     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "token"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x00f8 }
            r9.A08 = r0     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "currency_code"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x00f8 }
            r9.A04 = r0     // Catch:{ all -> 0x00f8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00f8 }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = r9.A04     // Catch:{ IllegalArgumentException -> 0x00d6 }
            X.1sq r5 = new X.1sq     // Catch:{ IllegalArgumentException -> 0x00d6 }
            r5.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00d6 }
            java.lang.String r0 = "total_amount_1000"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x00d6 }
            long r0 = r3.getLong(r0)     // Catch:{ IllegalArgumentException -> 0x00d6 }
            java.math.BigDecimal r0 = X.C39641sp.A00(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00d6 }
            r9.A09 = r0     // Catch:{ IllegalArgumentException -> 0x00d6 }
            goto L_0x00d9
        L_0x00d6:
            r0 = 0
            r9.A04 = r0     // Catch:{ all -> 0x00f8 }
        L_0x00d9:
            java.lang.String r0 = "thumbnail"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            byte[] r1 = r3.getBlob(r0)     // Catch:{ all -> 0x00f8 }
            if (r1 == 0) goto L_0x00f4
            int r0 = r1.length     // Catch:{ all -> 0x00f8 }
            if (r0 <= 0) goto L_0x00f4
            r9.A02 = r4     // Catch:{ all -> 0x00f8 }
            X.0tm r0 = r9.A0F()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00f4
            r0.A03(r1, r11)     // Catch:{ all -> 0x00f8 }
        L_0x00f4:
            r3.close()     // Catch:{ all -> 0x0101 }
            goto L_0x00fd
        L_0x00f8:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x00fd:
            r2.close()
            return
        L_0x0101:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0105 }
        L_0x0105:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223117l.A03(X.1rn, java.lang.String, boolean):void");
    }
}
