package X;

import android.content.ContentValues;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.UserJid;

/* renamed from: X.17t  reason: invalid class name and case insensitive filesystem */
public class C223917t {
    public final C216314v A00;
    public final C16900tq A01;

    public C223917t(C216314v r1, C16900tq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(ContentValues contentValues, C38981rj r4, long j2) {
        contentValues.put("message_row_id", Long.valueOf(j2));
        UserJid userJid = r4.A00;
        if (userJid != null) {
            contentValues.put("business_owner_jid", Long.valueOf(this.A00.A01(userJid)));
        }
        C38611r4.A04(contentValues, "title", r4.A02);
        C38611r4.A04(contentValues, FacebookFacade.RequestParameter.DESCRIPTION, r4.A01);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C38981rj r7, long r8) {
        /*
            r6 = this;
            int r1 = r7.A08()
            r5 = 1
            r0 = 2
            r2 = 0
            if (r1 != r0) goto L_0x000a
            r2 = 1
        L_0x000a:
            java.lang.String r0 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/message in main storage; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r7.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            X.0tq r0 = r6.A01     // Catch:{ SQLiteConstraintException -> 0x0047 }
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
            java.lang.String r0 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/inserted row should have same row_id"
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
            java.lang.String r1 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/fail to insert. Error message is: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223917t.A01(X.1rj, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0074 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0074=Splitter:B:16:0x0074, B:11:0x006c=Splitter:B:11:0x006c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C38981rj r8, java.lang.String r9) {
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
            java.lang.String r0 = "CatalogMessageStore/fillCatalogDataIfAvailable/message must have row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r8.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            java.lang.String[] r3 = new java.lang.String[r6]
            long r0 = r8.A13
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r5] = r0
            X.0tq r0 = r7.A01
            X.0tf r2 = r0.get()
            X.0tg r0 = r2.A02     // Catch:{ all -> 0x0079 }
            android.database.Cursor r3 = r0.A08(r9, r3)     // Catch:{ all -> 0x0079 }
            if (r3 == 0) goto L_0x0075
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006c
            X.14v r5 = r7.A00     // Catch:{ all -> 0x0070 }
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "business_owner_jid"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0070 }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x0070 }
            com.whatsapp.jid.Jid r0 = r5.A07(r4, r0)     // Catch:{ all -> 0x0070 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0070 }
            r8.A00 = r0     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "title"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0070 }
            r8.A02 = r0     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "description"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0070 }
            r8.A01 = r0     // Catch:{ all -> 0x0070 }
        L_0x006c:
            r3.close()     // Catch:{ all -> 0x0079 }
            goto L_0x0075
        L_0x0070:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0075:
            r2.close()
            return
        L_0x0079:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x007d }
        L_0x007d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223917t.A02(X.1rj, java.lang.String):void");
    }
}
