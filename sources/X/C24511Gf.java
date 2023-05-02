package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: X.1Gf  reason: invalid class name and case insensitive filesystem */
public class C24511Gf {
    public C33501ig A00 = null;
    public final C210212m A01;

    public C24511Gf(C210212m r2) {
        this.A01 = r2;
    }

    public static final int A00(C50102Xy r5, C16800tf r6, Jid jid) {
        return r6.A02.A00("cart_item", A01(r5, jid), "business_id=?  AND product_id=?", new String[]{jid.getRawString(), r5.A01.A0D});
    }

    public static ContentValues A01(C50102Xy r9, Jid jid) {
        Long l2;
        Long l3;
        Long l4;
        C35701mM r4 = r9.A01;
        BigDecimal bigDecimal = r4.A05;
        String str = null;
        Long valueOf = bigDecimal != null ? Long.valueOf(bigDecimal.multiply(new BigDecimal(1000.0d)).longValue()) : null;
        C93694jc r2 = r4.A02;
        if (r2 != null) {
            l2 = Long.valueOf(r2.A01.multiply(new BigDecimal(1000.0d)).longValue());
            Date date = r4.A02.A03;
            l3 = date != null ? Long.valueOf(date.getTime()) : null;
            Date date2 = r4.A02.A02;
            if (date2 != null) {
                l4 = Long.valueOf(date2.getTime());
            }
            l4 = null;
        } else {
            l2 = null;
            l3 = null;
            l4 = null;
        }
        C39651sq r0 = r4.A03;
        if (r0 != null) {
            str = r0.A00;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("business_id", jid.getRawString());
        contentValues.put("product_id", r4.A0D);
        contentValues.put("product_title", r4.A04);
        contentValues.put("product_price_1000", valueOf);
        contentValues.put("product_currency_code", str);
        List list = r4.A06;
        contentValues.put("product_image_id", !list.isEmpty() ? ((C35691mL) list.get(0)).A04 : "");
        contentValues.put("product_quantity", Long.valueOf(r9.A00));
        contentValues.put("product_sale_price_1000", l2);
        contentValues.put("product_sale_start_date", l3);
        contentValues.put("product_sale_end_date", l4);
        contentValues.put("product_max_available", Long.valueOf(r4.A08));
        return contentValues;
    }

    public static final C50102Xy A02(Cursor cursor) {
        Cursor cursor2 = cursor;
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("product_id"));
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("product_title"));
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("product_price_1000");
        C93694jc r10 = null;
        Long valueOf = cursor2.isNull(columnIndexOrThrow) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow));
        String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("product_currency_code"));
        long j2 = cursor2.getLong(cursor2.getColumnIndexOrThrow("product_quantity"));
        String string4 = cursor2.getString(cursor2.getColumnIndexOrThrow("product_image_id"));
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("product_sale_price_1000");
        Long valueOf2 = cursor2.isNull(columnIndexOrThrow2) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow2));
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("product_sale_start_date");
        Long valueOf3 = cursor2.isNull(columnIndexOrThrow3) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow3));
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("product_sale_end_date");
        Long valueOf4 = cursor2.isNull(columnIndexOrThrow4) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow4));
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("product_max_available");
        long j3 = cursor2.isNull(columnIndexOrThrow5) ? 99 : cursor2.getLong(columnIndexOrThrow5);
        C39651sq r11 = !TextUtils.isEmpty(string3) ? new C39651sq(string3) : null;
        BigDecimal A002 = (valueOf == null || r11 == null) ? null : C39641sp.A00(r11, valueOf.longValue());
        if (!(valueOf2 == null || r11 == null)) {
            BigDecimal A003 = C39641sp.A00(r11, valueOf2.longValue());
            r10 = (valueOf3 == null || valueOf4 == null) ? new C93694jc(r11, A003, (Date) null, (Date) null) : new C93694jc(r11, A003, new Date(valueOf3.longValue()), new Date(valueOf4.longValue()));
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(string4)) {
            arrayList.add(new C35691mL(string4, "", "", 0, 0));
        }
        return new C50102Xy(new C35701mM((C93584jR) null, (C35681mK) null, r10, r11, string, string2, (String) null, (String) null, (String) null, (String) null, A002, arrayList, 0, j3, true, false), j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r1 != null) goto L_0x0034;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C50102Xy A03(com.whatsapp.jid.Jid r7, java.lang.String r8) {
        /*
            r6 = this;
            X.12m r0 = r6.A01
            X.2Dk r0 = r0.A00()
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date, product_max_available FROM cart_item WHERE business_id=? AND product_id=?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x003b }
            r1 = 0
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x003b }
            r2[r1] = r0     // Catch:{ all -> 0x003b }
            r0 = 1
            r2[r0] = r8     // Catch:{ all -> 0x003b }
            android.database.Cursor r1 = r4.A08(r3, r2)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0031
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0031
            X.2Xy r0 = A02(r1)     // Catch:{ all -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ all -> 0x003b }
        L_0x0031:
            r0 = 0
            if (r1 == 0) goto L_0x0037
        L_0x0034:
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x0037:
            r5.close()
            return r0
        L_0x003b:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24511Gf.A03(com.whatsapp.jid.Jid, java.lang.String):X.2Xy");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x004e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x004e=Splitter:B:28:0x004e, B:16:0x003f=Splitter:B:16:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.concurrent.Future A04(com.whatsapp.jid.Jid r8) {
        /*
            r7 = this;
            X.1kE r6 = new X.1kE
            r6.<init>()
            X.12m r0 = r7.A01     // Catch:{ Exception -> 0x004f }
            X.2Dk r0 = r0.A00()     // Catch:{ Exception -> 0x004f }
            X.0tf r5 = r0.get()     // Catch:{ Exception -> 0x004f }
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date, product_max_available FROM cart_item WHERE business_id=?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004a }
            r1 = 0
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x004a }
            r2[r1] = r0     // Catch:{ all -> 0x004a }
            android.database.Cursor r2 = r4.A08(r3, r2)     // Catch:{ all -> 0x004a }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0043 }
            r1.<init>()     // Catch:{ all -> 0x0043 }
            if (r2 != 0) goto L_0x0029
            goto L_0x0037
        L_0x0029:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0037
            X.2Xy r0 = A02(r2)     // Catch:{ all -> 0x0043 }
            r1.add(r0)     // Catch:{ all -> 0x0043 }
            goto L_0x0029
        L_0x0037:
            r6.A02(r1)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ all -> 0x004a }
        L_0x003f:
            r5.close()     // Catch:{ Exception -> 0x004f }
            return r6
        L_0x0043:
            r0 = move-exception
            if (r2 == 0) goto L_0x0049
            r2.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            r0 = move-exception
            r6.A01(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24511Gf.A04(com.whatsapp.jid.Jid):java.util.concurrent.Future");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0041=Splitter:B:15:0x0041, B:10:0x0039=Splitter:B:10:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C50102Xy r9, com.whatsapp.jid.Jid r10) {
        /*
            r8 = this;
            X.12m r0 = r8.A01
            X.2Dk r0 = r0.A00()
            X.0tf r5 = r0.A02()
            X.1cj r7 = r5.A00()     // Catch:{ all -> 0x0065 }
            X.1mM r0 = r9.A01     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = r0.A0D     // Catch:{ all -> 0x0060 }
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x0060 }
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0060 }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x0060 }
            r0 = 1
            r1[r0] = r3     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "SELECT product_quantity FROM cart_item WHERE business_id=? AND product_id=?"
            android.database.Cursor r1 = r6.A08(r0, r1)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0042
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "product_quantity"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003d }
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x003d }
        L_0x0039:
            r1.close()     // Catch:{ all -> 0x0060 }
            goto L_0x0042
        L_0x003d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0042:
            long r3 = (long) r2     // Catch:{ all -> 0x0060 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            A00(r9, r5, r10)     // Catch:{ all -> 0x0060 }
            goto L_0x0056
        L_0x004d:
            android.content.ContentValues r1 = A01(r9, r10)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "cart_item"
            r6.A02(r1, r0)     // Catch:{ all -> 0x0060 }
        L_0x0056:
            r7.A00()     // Catch:{ all -> 0x0060 }
            r7.close()     // Catch:{ all -> 0x0065 }
            r5.close()
            return
        L_0x0060:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24511Gf.A05(X.2Xy, com.whatsapp.jid.Jid):void");
    }

    public void A06(Jid jid) {
        C16800tf A02 = this.A01.A00().A02();
        try {
            A02.A02.A0C("DELETE FROM cart_item WHERE business_id=?", new String[]{jid.getRawString()});
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A07(Jid jid, String str) {
        C16800tf A02 = this.A01.A00().A02();
        try {
            A02.A02.A0C("DELETE FROM cart_item WHERE business_id=? AND product_id=?", new String[]{jid.getRawString(), str});
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
