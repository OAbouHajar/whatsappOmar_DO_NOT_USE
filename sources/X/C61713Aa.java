package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Aa  reason: invalid class name and case insensitive filesystem */
public class C61713Aa {
    public final int A00;

    public C61713Aa(int i2) {
        this.A00 = i2;
    }

    public static AnonymousClass2GH A00(C28371Vv r3) {
        boolean z2;
        String str = null;
        if (r3 != null) {
            C28371Vv A0J = r3.A0J("after");
            if (A0J != null) {
                str = A0J.A0L();
            }
            z2 = !TextUtils.isEmpty(str);
        } else {
            z2 = false;
        }
        return new AnonymousClass2GH(str, z2);
    }

    public AnonymousClass2GI A01(C28371Vv r5) {
        C28371Vv A0J = r5.A0J(this.A00 != 1 ? "product_catalog" : "product_list");
        if (A0J == null) {
            return null;
        }
        List A0O = A0J.A0O("product");
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = A0O.iterator();
        while (it.hasNext()) {
            C35701mM A02 = A02(C13690nt.A0S(it));
            if (A02 != null) {
                A0u.add(A02);
            }
        }
        return new AnonymousClass2GI(A00(A0J.A0J("paging")), A0u);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: X.4jY} */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r39v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0227, code lost:
        if (java.lang.Boolean.parseBoolean(r8.A0L()) == false) goto L_0x0229;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0165 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0155  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C35701mM A02(X.C28371Vv r44) {
        /*
            r43 = this;
            java.lang.String r13 = "id"
            r4 = r44
            X.1Vv r14 = r4.A0J(r13)
            java.lang.String r0 = "name"
            X.1Vv r11 = r4.A0J(r0)
            java.lang.String r0 = "description"
            X.1Vv r10 = r4.A0J(r0)
            java.lang.String r0 = "url"
            X.1Vv r18 = r4.A0J(r0)
            java.lang.String r8 = "price"
            X.1Vv r9 = r4.A0J(r8)
            java.lang.String r0 = "currency"
            X.1Vv r6 = r4.A0J(r0)
            java.lang.String r0 = "retailer_id"
            X.1Vv r15 = r4.A0J(r0)
            java.lang.String r0 = "media"
            X.1Vv r12 = r4.A0J(r0)
            java.lang.String r0 = "image_fetch_status"
            X.1Vv r1 = r4.A0J(r0)
            java.lang.String r0 = "status_info"
            X.1Vv r5 = r4.A0J(r0)
            java.lang.String r0 = "sale_price"
            X.1Vv r7 = r4.A0J(r0)
            java.lang.String r0 = "belongs_to"
            X.1Vv r17 = r4.A0J(r0)
            java.lang.String r0 = "compliance_info"
            X.1Vv r3 = r4.A0J(r0)
            java.lang.String r0 = "max_available"
            X.1Vv r16 = r4.A0J(r0)
            if (r1 != 0) goto L_0x009e
            java.lang.String r28 = ""
        L_0x005e:
            r2 = 0
            if (r14 != 0) goto L_0x0099
            r23 = r2
        L_0x0063:
            if (r11 != 0) goto L_0x0094
            r24 = r2
        L_0x0067:
            if (r10 != 0) goto L_0x008f
            r25 = r2
        L_0x006b:
            if (r6 == 0) goto L_0x008d
            java.lang.String r0 = r6.A0L()
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = r6.A0L()
            X.1sq r6 = new X.1sq
            r6.<init>(r0)
        L_0x0080:
            if (r9 == 0) goto L_0x008b
            java.lang.String r0 = r9.A0L()
        L_0x0086:
            if (r6 == 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00b0
            goto L_0x00a3
        L_0x008b:
            r0 = r2
            goto L_0x0086
        L_0x008d:
            r6 = r2
            goto L_0x0080
        L_0x008f:
            java.lang.String r25 = r10.A0L()
            goto L_0x006b
        L_0x0094:
            java.lang.String r24 = r11.A0L()
            goto L_0x0067
        L_0x0099:
            java.lang.String r23 = r14.A0L()
            goto L_0x0063
        L_0x009e:
            java.lang.String r28 = r1.A0L()
            goto L_0x005e
        L_0x00a3:
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00ac }
            java.math.BigDecimal r29 = X.C39641sp.A00(r6, r0)     // Catch:{ Exception -> 0x00ac }
            goto L_0x00b2
        L_0x00ac:
            r6 = r2
            r29 = r2
            goto L_0x00b2
        L_0x00b0:
            r29 = r2
        L_0x00b2:
            r11 = 0
            if (r7 != 0) goto L_0x0174
            r14 = r2
        L_0x00b6:
            if (r15 != 0) goto L_0x016e
            r27 = r2
        L_0x00ba:
            if (r18 != 0) goto L_0x0168
            r26 = r2
        L_0x00be:
            java.lang.String r0 = "is_hidden"
            java.lang.String r0 = r4.A0N(r0, r2)
            boolean r35 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r0 = "availability"
            java.lang.String r1 = r4.A0N(r0, r2)
            java.lang.String r0 = "out of stock"
            boolean r0 = r0.equalsIgnoreCase(r1)
            boolean r31 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "compliance_category"
            java.lang.String r8 = r4.A0N(r0, r2)
            if (r23 == 0) goto L_0x032d
            if (r24 == 0) goto L_0x032d
            if (r12 == 0) goto L_0x032d
            java.lang.String r0 = "image"
            java.util.List r15 = r12.A0O(r0)
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()
            r0 = 0
        L_0x00ef:
            int r1 = r15.size()
            if (r0 >= r1) goto L_0x01d2
            X.1Vv r4 = r12.A0I(r0)
            if (r4 == 0) goto L_0x0165
            X.1Vv r11 = r4.A0J(r13)
            java.lang.String r1 = "request_image_url"
            X.1Vv r10 = r4.A0J(r1)
            java.lang.String r1 = "original_image_url"
            X.1Vv r7 = r4.A0J(r1)
            java.lang.String r1 = "original_dimensions"
            X.1Vv r1 = r4.A0J(r1)
            if (r11 == 0) goto L_0x0145
            if (r7 != 0) goto L_0x0117
            if (r10 == 0) goto L_0x0145
        L_0x0117:
            java.lang.String r37 = r11.A0L()
            if (r7 != 0) goto L_0x0140
            r38 = r2
        L_0x011f:
            if (r10 != 0) goto L_0x013b
            r39 = r2
        L_0x0123:
            r4 = 0
            if (r1 == 0) goto L_0x0138
            java.lang.String r7 = "width"
            int r40 = r1.A0A(r7, r4)     // Catch:{ 1W9 -> 0x0134 }
            java.lang.String r7 = "height"
            int r41 = r1.A0A(r7, r4)     // Catch:{ 1W9 -> 0x014b }
            goto L_0x0153
        L_0x0134:
            r1 = move-exception
            r40 = 0
            goto L_0x014c
        L_0x0138:
            r40 = 0
            goto L_0x0151
        L_0x013b:
            java.lang.String r39 = r10.A0L()
            goto L_0x0123
        L_0x0140:
            java.lang.String r38 = r7.A0L()
            goto L_0x011f
        L_0x0145:
            java.lang.String r1 = "Connection/Product/image node missing url."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0165
        L_0x014b:
            r1 = move-exception
        L_0x014c:
            java.lang.String r4 = "Connection/Product/image dimension node missing"
            com.whatsapp.util.Log.e(r4, r1)
        L_0x0151:
            r41 = 0
        L_0x0153:
            if (r37 == 0) goto L_0x0165
            if (r38 != 0) goto L_0x015b
            if (r39 == 0) goto L_0x0165
            r38 = r39
        L_0x015b:
            X.1mL r1 = new X.1mL
            r36 = r1
            r36.<init>(r37, r38, r39, r40, r41)
            r9.add(r1)
        L_0x0165:
            int r0 = r0 + 1
            goto L_0x00ef
        L_0x0168:
            java.lang.String r26 = r18.A0L()
            goto L_0x00be
        L_0x016e:
            java.lang.String r27 = r15.A0L()
            goto L_0x00ba
        L_0x0174:
            X.1Vv r1 = r7.A0J(r8)
            java.lang.String r0 = "start_date"
            X.1Vv r8 = r7.A0J(r0)
            java.lang.String r0 = "end_date"
            X.1Vv r7 = r7.A0J(r0)
            if (r1 == 0) goto L_0x0194
            java.lang.String r0 = r1.A0L()
        L_0x018b:
            if (r6 == 0) goto L_0x01cf
            if (r0 == 0) goto L_0x01cf
            long r0 = java.lang.Long.parseLong(r0)
            goto L_0x0196
        L_0x0194:
            r0 = r2
            goto L_0x018b
        L_0x0196:
            java.math.BigDecimal r10 = X.C39641sp.A00(r6, r0)     // Catch:{ IllegalArgumentException -> 0x01cf }
            if (r8 == 0) goto L_0x01c7
            if (r7 == 0) goto L_0x01c7
            java.lang.String r9 = r8.A0L()
            java.lang.String r8 = r7.A0L()
            if (r9 == 0) goto L_0x01c7
            if (r8 == 0) goto L_0x01c7
            java.lang.String r7 = "yyyy-MM-dd'T'HH:mmZ"
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ ParseException -> 0x01c7 }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x01c7 }
            r0.<init>(r7, r1)     // Catch:{ ParseException -> 0x01c7 }
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)     // Catch:{ ParseException -> 0x01c7 }
            r0.setTimeZone(r1)     // Catch:{ ParseException -> 0x01c7 }
            java.util.Date r1 = r0.parse(r9)     // Catch:{ ParseException -> 0x01c7 }
            java.util.Date r0 = r0.parse(r8)     // Catch:{ ParseException -> 0x01c7 }
            r11 = r1
            goto L_0x01c8
        L_0x01c7:
            r0 = r2
        L_0x01c8:
            X.4jc r14 = new X.4jc
            r14.<init>(r6, r10, r11, r0)
            goto L_0x00b6
        L_0x01cf:
            r14 = r2
            goto L_0x00b6
        L_0x01d2:
            r1 = 0
            if (r3 != 0) goto L_0x026b
            r3 = r2
        L_0x01d6:
            java.lang.String r0 = "COUNTRY_ORIGIN_EXEMPT"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01e5
            java.lang.String r0 = "N/A"
            X.4jR r3 = new X.4jR
            r3.<init>(r2, r0, r2)
        L_0x01e5:
            if (r16 == 0) goto L_0x0268
            java.lang.String r0 = r16.A0L()
            if (r0 == 0) goto L_0x0268
            long r32 = java.lang.Long.parseLong(r0)
        L_0x01f1:
            r4 = 0
            if (r5 == 0) goto L_0x0309
            java.lang.String r0 = "status"
            X.1Vv r0 = r5.A0J(r0)
            java.lang.String r1 = "can_appeal"
            X.1Vv r8 = r5.A0J(r1)
            java.lang.String r1 = "reject_reason"
            X.1Vv r7 = r5.A0J(r1)
            java.lang.String r1 = "commerce_url"
            X.1Vv r1 = r5.A0J(r1)
            if (r0 == 0) goto L_0x0213
            java.lang.String r2 = r0.A0L()
        L_0x0213:
            if (r7 != 0) goto L_0x0263
            r37 = r4
        L_0x0217:
            if (r1 != 0) goto L_0x025e
            r38 = r4
        L_0x021b:
            if (r8 == 0) goto L_0x0229
            java.lang.String r1 = r8.A0L()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            r41 = 1
            if (r1 != 0) goto L_0x022b
        L_0x0229:
            r41 = 0
        L_0x022b:
            int r40 = X.C35681mK.A00(r2)
            if (r0 == 0) goto L_0x0300
            java.lang.String r1 = "reasons"
            X.1Vv r0 = r0.A0J(r1)
            r7 = 0
            if (r0 == 0) goto L_0x02ff
            java.lang.String r1 = "product"
            java.util.List r0 = r0.A0O(r1)
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.util.Iterator r5 = r0.iterator()
        L_0x0248:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02f8
            X.1Vv r1 = X.C13690nt.A0S(r5)
            java.lang.String r0 = "reason"
            java.lang.String r0 = r1.A0N(r0, r4)
            if (r0 == 0) goto L_0x0248
            r2.add(r0)
            goto L_0x0248
        L_0x025e:
            java.lang.String r38 = r1.A0L()
            goto L_0x021b
        L_0x0263:
            java.lang.String r37 = r7.A0L()
            goto L_0x0217
        L_0x0268:
            r32 = 99
            goto L_0x01f1
        L_0x026b:
            java.lang.String r0 = "country_code_origin"
            X.1Vv r7 = r3.A0J(r0)
            java.lang.String r0 = "importer_name"
            X.1Vv r4 = r3.A0J(r0)
            java.lang.String r0 = "importer_address"
            X.1Vv r0 = r3.A0J(r0)
            if (r7 != 0) goto L_0x02f3
            r7 = r2
        L_0x0280:
            if (r4 != 0) goto L_0x02ee
            r4 = r2
        L_0x0283:
            if (r0 == 0) goto L_0x02d8
            java.lang.String r3 = "street1"
            X.1Vv r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x02eb
            java.lang.String r37 = r3.A0L()
        L_0x0292:
            java.lang.String r3 = "street2"
            X.1Vv r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x02e8
            java.lang.String r38 = r3.A0L()
        L_0x029f:
            java.lang.String r3 = "postal_code"
            X.1Vv r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x02e5
            java.lang.String r39 = r3.A0L()
        L_0x02ab:
            java.lang.String r3 = "city"
            X.1Vv r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x02e2
            java.lang.String r40 = r3.A0L()
        L_0x02b7:
            java.lang.String r3 = "region"
            X.1Vv r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x02df
            java.lang.String r41 = r3.A0L()
        L_0x02c3:
            java.lang.String r3 = "country_code"
            X.1Vv r0 = r0.A0J(r3)
            if (r0 == 0) goto L_0x02cf
            java.lang.String r1 = r0.A0L()
        L_0x02cf:
            r42 = r1
            X.4jY r1 = new X.4jY
            r36 = r1
            r36.<init>(r37, r38, r39, r40, r41, r42)
        L_0x02d8:
            X.4jR r3 = new X.4jR
            r3.<init>(r1, r7, r4)
            goto L_0x01d6
        L_0x02df:
            r41 = r2
            goto L_0x02c3
        L_0x02e2:
            r40 = r2
            goto L_0x02b7
        L_0x02e5:
            r39 = r2
            goto L_0x02ab
        L_0x02e8:
            r38 = r2
            goto L_0x029f
        L_0x02eb:
            r37 = r2
            goto L_0x0292
        L_0x02ee:
            java.lang.String r4 = r4.A0L()
            goto L_0x0283
        L_0x02f3:
            java.lang.String r7 = r7.A0L()
            goto L_0x0280
        L_0x02f8:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x02ff
            r7 = r2
        L_0x02ff:
            r4 = r7
        L_0x0300:
            X.1mK r36 = new X.1mK
            r39 = r4
            r36.<init>(r37, r38, r39, r40, r41)
            r4 = r36
        L_0x0309:
            r34 = 1
            X.1mM r0 = new X.1mM
            r19 = r3
            r20 = r4
            r21 = r14
            r22 = r6
            r30 = r9
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35)
            if (r17 == 0) goto L_0x032c
            java.lang.String r1 = r17.A0L()
            boolean r2 = java.lang.Boolean.parseBoolean(r1)
            X.3kI r1 = new X.3kI
            r1.<init>(r0, r2)
            return r1
        L_0x032c:
            return r0
        L_0x032d:
            java.lang.String r0 = "Connection/Product/missing required fields."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61713Aa.A02(X.1Vv):X.1mM");
    }

    public void A03(C17150uc r3, UserJid userJid, C28371Vv r5) {
        String A05;
        C28371Vv A0J = r5.A0J(this.A00 != 1 ? "product_catalog" : "product_list");
        if (A0J != null && (A05 = C28371Vv.A05(A0J, "cart_enabled")) != null) {
            r3.A08(userJid, Boolean.parseBoolean(A05));
        }
    }
}
