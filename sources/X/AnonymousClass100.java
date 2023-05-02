package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.100  reason: invalid class name */
public abstract class AnonymousClass100 implements AnonymousClass101 {
    public static List A00(AnonymousClass101 r3, JSONArray jSONArray, long j2) {
        Object A6j;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (!(optJSONObject == null || (A6j = r3.A6j(optJSONObject, j2)) == null)) {
                arrayList.add(A6j);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: X.4jR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r0v60, types: [X.4jR] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x021e A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0224 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0240 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0243 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x026a A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b9 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02d9 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e3 A[Catch:{ Exception -> 0x04b3 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e2 A[Catch:{ Exception -> 0x04b3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A6j(org.json.JSONObject r41, long r42) {
        /*
            r40 = this;
            r12 = 0
            r1 = r41
            if (r41 == 0) goto L_0x04ba
            r0 = r40
            boolean r2 = r0 instanceof X.C59602yZ     // Catch:{ Exception -> 0x04b3 }
            if (r2 == 0) goto L_0x007c
            X.2yZ r0 = (X.C59602yZ) r0     // Catch:{ Exception -> 0x04b3 }
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ Exception -> 0x04b3 }
            r2 = 0
            java.lang.String r3 = "price"
            r4[r2] = r3     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r2.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.util.Collections.addAll(r2, r4)     // Catch:{ Exception -> 0x04b3 }
            boolean r2 = X.C87624Xt.A01(r2, r1)     // Catch:{ Exception -> 0x04b3 }
            r5 = 0
            if (r2 == 0) goto L_0x007b
            java.lang.String r3 = X.C87624Xt.A00(r3, r1)     // Catch:{ Exception -> 0x04b3 }
            X.1sq r6 = r0.A00     // Catch:{ Exception -> 0x04b3 }
            if (r3 == 0) goto L_0x007b
            r2 = 1
            java.lang.Float r0 = X.C29501aj.A02(r3, r2)     // Catch:{ NumberFormatException -> 0x007b }
            float r0 = r0.floatValue()     // Catch:{ NumberFormatException -> 0x007b }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
            long r2 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x04b3 }
            java.math.BigDecimal r4 = X.C39641sp.A00(r6, r2)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "start_date"
            boolean r0 = r1.has(r2)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x005b
            java.lang.String r2 = X.C87624Xt.A00(r2, r1)     // Catch:{ Exception -> 0x04b3 }
            if (r2 == 0) goto L_0x005b
            java.text.DateFormat r0 = X.C59602yZ.A01     // Catch:{ Exception -> 0x0057 }
            java.util.Date r3 = r0.parse(r2)     // Catch:{ Exception -> 0x0057 }
            goto L_0x005c
        L_0x0057:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x04b3 }
        L_0x005b:
            r3 = r12
        L_0x005c:
            java.lang.String r2 = "end_date"
            boolean r0 = r1.has(r2)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = X.C87624Xt.A00(r2, r1)     // Catch:{ Exception -> 0x04b3 }
            if (r1 == 0) goto L_0x0075
            java.text.DateFormat r0 = X.C59602yZ.A01     // Catch:{ Exception -> 0x0071 }
            java.util.Date r5 = r0.parse(r1)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0075
        L_0x0071:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x04b3 }
        L_0x0075:
            X.4jc r0 = new X.4jc     // Catch:{ Exception -> 0x04b3 }
            r0.<init>(r6, r4, r3, r5)     // Catch:{ Exception -> 0x04b3 }
            return r0
        L_0x007b:
            return r5
        L_0x007c:
            boolean r2 = r0 instanceof X.C20400zz     // Catch:{ Exception -> 0x04b3 }
            if (r2 == 0) goto L_0x00c0
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ Exception -> 0x04b3 }
            r0 = 0
            java.lang.String r3 = "status"
            r4[r0] = r3     // Catch:{ Exception -> 0x04b3 }
            r0 = 1
            java.lang.String r2 = "can_appeal"
            r4[r0] = r2     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r0.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.util.Collections.addAll(r0, r4)     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = X.C87624Xt.A01(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x009e
            r1 = 0
            return r1
        L_0x009e:
            java.lang.String r0 = X.C87624Xt.A00(r3, r1)     // Catch:{ Exception -> 0x04b3 }
            int r5 = X.C35681mK.A00(r0)     // Catch:{ Exception -> 0x04b3 }
            boolean r6 = r1.optBoolean(r2)     // Catch:{ Exception -> 0x04b3 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "reject_reason"
            java.lang.String r2 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "commerce_url"
            java.lang.String r3 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            X.1mK r1 = new X.1mK     // Catch:{ Exception -> 0x04b3 }
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x04b3 }
            return r1
        L_0x00c0:
            boolean r2 = r0 instanceof X.AnonymousClass102     // Catch:{ Exception -> 0x04b3 }
            if (r2 == 0) goto L_0x011b
            r7 = 1
            java.lang.String[] r3 = new java.lang.String[r7]     // Catch:{ Exception -> 0x04b3 }
            r2 = 0
            java.lang.String r6 = "id"
            r3[r2] = r6     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r0.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.util.Collections.addAll(r0, r3)     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = X.C87624Xt.A01(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            r13 = 0
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = "original_dimensions"
            org.json.JSONObject r5 = r1.optJSONObject(r0)     // Catch:{ Exception -> 0x04b3 }
            if (r5 == 0) goto L_0x011a
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r3 = "height"
            r4[r2] = r3     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "width"
            r4[r7] = r2     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r0.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.util.Collections.addAll(r0, r4)     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = X.C87624Xt.A01(r0, r5)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x011a
            java.lang.String r14 = X.C87624Xt.A00(r6, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "original_image_url"
            java.lang.String r15 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "request_image_url"
            java.lang.String r16 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            int r18 = r5.optInt(r3)     // Catch:{ Exception -> 0x04b3 }
            int r17 = r5.optInt(r2)     // Catch:{ Exception -> 0x04b3 }
            X.1mL r13 = new X.1mL     // Catch:{ Exception -> 0x04b3 }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x04b3 }
        L_0x011a:
            return r13
        L_0x011b:
            boolean r4 = r0 instanceof X.AnonymousClass103     // Catch:{ Exception -> 0x04b3 }
            r2 = r42
            if (r4 == 0) goto L_0x02e5
            X.103 r0 = (X.AnonymousClass103) r0     // Catch:{ Exception -> 0x04b3 }
            r4 = 3
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ Exception -> 0x04b3 }
            r4 = 0
            java.lang.String r6 = "id"
            r8[r4] = r6     // Catch:{ Exception -> 0x04b3 }
            r4 = 1
            java.lang.String r5 = "name"
            r8[r4] = r5     // Catch:{ Exception -> 0x04b3 }
            r4 = 2
            java.lang.String r7 = "media"
            r8[r4] = r7     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r4.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.util.Collections.addAll(r4, r8)     // Catch:{ Exception -> 0x04b3 }
            boolean r4 = X.C87624Xt.A01(r4, r1)     // Catch:{ Exception -> 0x04b3 }
            r10 = 0
            if (r4 == 0) goto L_0x02e4
            java.lang.String r20 = X.C87624Xt.A00(r6, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r21 = X.C87624Xt.A00(r5, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "description"
            java.lang.String r22 = X.C87624Xt.A00(r4, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r6 = "currency"
            boolean r4 = r1.has(r6)     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x0189
            java.lang.String r4 = X.C87624Xt.A00(r6, r1)     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x0189
            java.lang.String r4 = X.C87624Xt.A00(r6, r1)     // Catch:{ Exception -> 0x04b3 }
            int r5 = r4.length()     // Catch:{ Exception -> 0x04b3 }
            r4 = 3
            if (r5 != r4) goto L_0x0189
            java.lang.String r4 = X.C87624Xt.A00(r6, r1)     // Catch:{ Exception -> 0x04b3 }
            X.1sq r6 = new X.1sq     // Catch:{ Exception -> 0x04b3 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x04b3 }
        L_0x0174:
            java.lang.String r5 = "price"
            boolean r4 = r1.has(r5)     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x019b
            java.lang.String r4 = X.C87624Xt.A00(r5, r1)     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x019b
            java.lang.String r8 = X.C87624Xt.A00(r5, r1)     // Catch:{ Exception -> 0x04b3 }
            if (r8 == 0) goto L_0x019b
            goto L_0x018b
        L_0x0189:
            r6 = 0
            goto L_0x0174
        L_0x018b:
            if (r6 == 0) goto L_0x019b
            r5 = 1
            java.lang.Float r4 = X.C29501aj.A02(r8, r5)     // Catch:{ NumberFormatException -> 0x019b }
            float r4 = r4.floatValue()     // Catch:{ NumberFormatException -> 0x019b }
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x019b
            goto L_0x019e
        L_0x019b:
            r26 = 0
            goto L_0x01a6
        L_0x019e:
            long r4 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x04b3 }
            java.math.BigDecimal r26 = X.C39641sp.A00(r6, r4)     // Catch:{ Exception -> 0x04b3 }
        L_0x01a6:
            java.lang.String r4 = "sale_price"
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x04b3 }
            if (r6 == 0) goto L_0x01b2
            if (r5 == 0) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r13 = 0
            goto L_0x01bf
        L_0x01b4:
            X.2yZ r4 = new X.2yZ     // Catch:{ Exception -> 0x04b3 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r13 = r4.A6j(r5, r2)     // Catch:{ Exception -> 0x04b3 }
            X.4jc r13 = (X.C93694jc) r13     // Catch:{ Exception -> 0x04b3 }
        L_0x01bf:
            java.lang.String r4 = "url"
            java.lang.String r23 = X.C87624Xt.A00(r4, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "retailer_id"
            java.lang.String r24 = X.C87624Xt.A00(r4, r1)     // Catch:{ Exception -> 0x04b3 }
            org.json.JSONObject r7 = r1.optJSONObject(r7)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "status_info"
            org.json.JSONObject r11 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x04b3 }
            r4 = 99
            java.lang.String r8 = "max_available"
            long r29 = r1.optLong(r8, r4)     // Catch:{ Exception -> 0x04b3 }
            if (r7 == 0) goto L_0x021e
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b3 }
            r14.<init>()     // Catch:{ Exception -> 0x04b3 }
            r4 = 1
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ Exception -> 0x04b3 }
            r5 = 0
            java.lang.String r8 = "images"
            r9[r5] = r8     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r4.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.util.Collections.addAll(r4, r9)     // Catch:{ Exception -> 0x04b3 }
            boolean r4 = X.C87624Xt.A01(r4, r7)     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x0222
            org.json.JSONArray r7 = r7.optJSONArray(r8)     // Catch:{ Exception -> 0x04b3 }
            if (r7 != 0) goto L_0x0204
            goto L_0x0222
        L_0x0204:
            int r4 = r7.length()     // Catch:{ Exception -> 0x04b3 }
            if (r5 >= r4) goto L_0x0222
            org.json.JSONObject r4 = r7.optJSONObject(r5)     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x021b
            X.101 r8 = r0.A01     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r4 = r8.A6j(r4, r2)     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x021b
            r14.add(r4)     // Catch:{ Exception -> 0x04b3 }
        L_0x021b:
            int r5 = r5 + 1
            goto L_0x0204
        L_0x021e:
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x04b3 }
        L_0x0222:
            if (r11 == 0) goto L_0x022c
            X.101 r0 = r0.A02     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r10 = r0.A6j(r11, r2)     // Catch:{ Exception -> 0x04b3 }
            X.1mK r10 = (X.C35681mK) r10     // Catch:{ Exception -> 0x04b3 }
        L_0x022c:
            java.lang.String r0 = "image_fetch_status"
            java.lang.String r25 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "product_availability"
            java.lang.String r2 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "AVAILABILITY_OUTOFSTOCK"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x0243
            r28 = 1
            goto L_0x024f
        L_0x0243:
            java.lang.String r0 = "AVAILABLE_FOR_ANOTHER_POSTCODE"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x04b3 }
            r28 = 0
            if (r0 == 0) goto L_0x024f
            r28 = 2
        L_0x024f:
            java.lang.String r0 = "is_hidden"
            java.lang.String r2 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "ISHIDDEN_TRUE"
            boolean r32 = r0.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "compliance_category"
            java.lang.String r7 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "compliance_info"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch:{ Exception -> 0x04b3 }
            r2 = 0
            if (r0 == 0) goto L_0x02b1
            java.lang.String r3 = "country_code_origin"
            java.lang.String r5 = X.C87624Xt.A00(r3, r0)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r3 = "importer_name"
            java.lang.String r4 = X.C87624Xt.A00(r3, r0)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r3 = "importer_address"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x02ab
            java.lang.String r2 = "street1"
            java.lang.String r34 = X.C87624Xt.A00(r2, r0)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "street2"
            java.lang.String r35 = X.C87624Xt.A00(r2, r0)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "postal_code"
            java.lang.String r36 = X.C87624Xt.A00(r2, r0)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "city"
            java.lang.String r37 = X.C87624Xt.A00(r2, r0)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "region"
            java.lang.String r38 = X.C87624Xt.A00(r2, r0)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "country_code"
            java.lang.String r39 = X.C87624Xt.A00(r2, r0)     // Catch:{ Exception -> 0x04b3 }
            X.4jY r2 = new X.4jY     // Catch:{ Exception -> 0x04b3 }
            r33 = r2
            r33.<init>(r34, r35, r36, r37, r38, r39)     // Catch:{ Exception -> 0x04b3 }
        L_0x02ab:
            X.4jR r0 = new X.4jR     // Catch:{ Exception -> 0x04b3 }
            r0.<init>(r2, r5, r4)     // Catch:{ Exception -> 0x04b3 }
            r2 = r0
        L_0x02b1:
            java.lang.String r0 = "COMPLIANCECATEGORY_COUNTRYORIGINEXEMPT"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x02c0
            java.lang.String r0 = "N/A"
            X.4jR r2 = new X.4jR     // Catch:{ Exception -> 0x04b3 }
            r2.<init>(r12, r0, r12)     // Catch:{ Exception -> 0x04b3 }
        L_0x02c0:
            r31 = 1
            X.1mM r15 = new X.1mM     // Catch:{ Exception -> 0x04b3 }
            r27 = r14
            r19 = r6
            r18 = r13
            r17 = r10
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "belongsTo"
            java.lang.String r0 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x02e3
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x04b3 }
            X.3kI r10 = new X.3kI     // Catch:{ Exception -> 0x04b3 }
            r10.<init>(r15, r0)     // Catch:{ Exception -> 0x04b3 }
            return r10
        L_0x02e3:
            return r15
        L_0x02e4:
            return r10
        L_0x02e5:
            boolean r4 = r0 instanceof X.AnonymousClass1TM     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x032f
            X.1TM r0 = (X.AnonymousClass1TM) r0     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "xwa_product_catalog_get_single_collection"
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x04b3 }
            r4 = 0
            if (r5 == 0) goto L_0x032e
            java.lang.String r1 = "collection"
            org.json.JSONObject r1 = r5.optJSONObject(r1)     // Catch:{ Exception -> 0x04b3 }
            if (r1 == 0) goto L_0x032e
            X.101 r0 = r0.A00     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r3 = r0.A6j(r1, r2)     // Catch:{ Exception -> 0x04b3 }
            X.2GE r3 = (X.AnonymousClass2GE) r3     // Catch:{ Exception -> 0x04b3 }
            if (r3 == 0) goto L_0x032e
            java.lang.String r0 = "paging"
            java.lang.String r1 = "after"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x031d
            r0 = 0
            X.2GH r2 = new X.2GH     // Catch:{ Exception -> 0x04b3 }
            r2.<init>(r12, r0)     // Catch:{ Exception -> 0x04b3 }
        L_0x0317:
            X.4Gz r4 = new X.4Gz     // Catch:{ Exception -> 0x04b3 }
            r4.<init>(r2, r3)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x032d
        L_0x031d:
            java.lang.String r1 = X.C87624Xt.A00(r1, r0)     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x04b3 }
            r0 = r0 ^ 1
            X.2GH r2 = new X.2GH     // Catch:{ Exception -> 0x04b3 }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x0317
        L_0x032d:
            return r4
        L_0x032e:
            return r4
        L_0x032f:
            boolean r4 = r0 instanceof X.AnonymousClass1TN     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x0373
            X.1TN r0 = (X.AnonymousClass1TN) r0     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "xwa_product_catalog_get_collections"
            org.json.JSONObject r4 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x04b3 }
            if (r4 != 0) goto L_0x0340
            r0 = 0
            return r0
        L_0x0340:
            java.lang.String r1 = "collections"
            org.json.JSONArray r1 = r4.optJSONArray(r1)     // Catch:{ Exception -> 0x04b3 }
            X.101 r0 = r0.A00     // Catch:{ Exception -> 0x04b3 }
            java.util.List r3 = A00(r0, r1, r2)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "paging"
            java.lang.String r1 = "after"
            org.json.JSONObject r0 = r4.optJSONObject(r0)     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x0362
            r0 = 0
            X.2GH r2 = new X.2GH     // Catch:{ Exception -> 0x04b3 }
            r2.<init>(r12, r0)     // Catch:{ Exception -> 0x04b3 }
        L_0x035c:
            X.2GC r0 = new X.2GC     // Catch:{ Exception -> 0x04b3 }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x0372
        L_0x0362:
            java.lang.String r1 = X.C87624Xt.A00(r1, r0)     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x04b3 }
            r0 = r0 ^ 1
            X.2GH r2 = new X.2GH     // Catch:{ Exception -> 0x04b3 }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x035c
        L_0x0372:
            return r0
        L_0x0373:
            boolean r4 = r0 instanceof X.AnonymousClass1TQ     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x039c
            X.1TQ r0 = (X.AnonymousClass1TQ) r0     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "xwa_product_catalog_get_categories"
            org.json.JSONObject r4 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x0396
            java.lang.String r1 = "categories"
            org.json.JSONArray r1 = r4.optJSONArray(r1)     // Catch:{ Exception -> 0x04b3 }
            if (r1 == 0) goto L_0x0396
            X.100 r0 = r0.A00     // Catch:{ Exception -> 0x04b3 }
            java.util.List r1 = A00(r0, r1, r2)     // Catch:{ Exception -> 0x04b3 }
        L_0x0390:
            X.4Q6 r0 = new X.4Q6     // Catch:{ Exception -> 0x04b3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x039b
        L_0x0396:
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x04b3 }
            goto L_0x0390
        L_0x039b:
            return r0
        L_0x039c:
            boolean r4 = r0 instanceof X.AnonymousClass1TK     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x03d9
            java.lang.String r0 = "status"
            java.lang.String r2 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = X.AnonymousClass1ZW.A0E(r2)     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x03c0
            java.lang.String r0 = "approved"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x03c0
            java.lang.String r0 = "rejected"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x04b3 }
            r4 = 1
            if (r0 == 0) goto L_0x03c1
            r4 = 2
            goto L_0x03c1
        L_0x03c0:
            r4 = 0
        L_0x03c1:
            java.lang.String r0 = "can_appeal"
            boolean r3 = r1.optBoolean(r0)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "reject_reason"
            java.lang.String r2 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "commerce_url"
            java.lang.String r1 = X.C87624Xt.A00(r0, r1)     // Catch:{ Exception -> 0x04b3 }
            X.2gM r0 = new X.2gM     // Catch:{ Exception -> 0x04b3 }
            r0.<init>(r2, r1, r4, r3)     // Catch:{ Exception -> 0x04b3 }
            return r0
        L_0x03d9:
            boolean r4 = r0 instanceof X.AnonymousClass1TL     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x0440
            X.1TL r0 = (X.AnonymousClass1TL) r0     // Catch:{ Exception -> 0x04b3 }
            r4 = 2
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ Exception -> 0x04b3 }
            r4 = 0
            java.lang.String r6 = "id"
            r7[r4] = r6     // Catch:{ Exception -> 0x04b3 }
            r4 = 1
            java.lang.String r5 = "name"
            r7[r4] = r5     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r4.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.util.Collections.addAll(r4, r7)     // Catch:{ Exception -> 0x04b3 }
            boolean r4 = X.C87624Xt.A01(r4, r1)     // Catch:{ Exception -> 0x04b3 }
            r13 = 0
            if (r4 == 0) goto L_0x043f
            java.lang.String r16 = X.C87624Xt.A00(r6, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r17 = X.C87624Xt.A00(r5, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "status_info"
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x04b3 }
            if (r5 == 0) goto L_0x0417
            X.101 r4 = r0.A01     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r14 = r4.A6j(r5, r2)     // Catch:{ Exception -> 0x04b3 }
            X.2gM r14 = (X.C53822gM) r14     // Catch:{ Exception -> 0x04b3 }
            if (r14 != 0) goto L_0x041d
            return r13
        L_0x0417:
            r4 = 0
            X.2gM r14 = new X.2gM     // Catch:{ Exception -> 0x04b3 }
            r14.<init>(r12, r12, r4, r4)     // Catch:{ Exception -> 0x04b3 }
        L_0x041d:
            java.lang.String r4 = "products"
            org.json.JSONArray r1 = r1.optJSONArray(r4)     // Catch:{ Exception -> 0x04b3 }
            if (r1 == 0) goto L_0x0439
            X.101 r0 = r0.A00     // Catch:{ Exception -> 0x04b3 }
            java.util.List r18 = A00(r0, r1, r2)     // Catch:{ Exception -> 0x04b3 }
        L_0x042b:
            int r0 = r18.size()     // Catch:{ Exception -> 0x04b3 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x04b3 }
            X.2GE r13 = new X.2GE     // Catch:{ Exception -> 0x04b3 }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x043e
        L_0x0439:
            java.util.List r18 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x04b3 }
            goto L_0x042b
        L_0x043e:
            return r13
        L_0x043f:
            return r13
        L_0x0440:
            boolean r4 = r0 instanceof X.AnonymousClass1TP     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x0473
            X.1TP r0 = (X.AnonymousClass1TP) r0     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "category"
            org.json.JSONObject r4 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x04b3 }
            r6 = 0
            if (r4 == 0) goto L_0x0472
            X.100 r5 = r0.A00     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r4 = r5.A6j(r4, r2)     // Catch:{ Exception -> 0x04b3 }
            X.4N4 r4 = (X.AnonymousClass4N4) r4     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x0472
            java.lang.String r0 = "sub_categories"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x046c
            java.util.List r0 = A00(r5, r0, r2)     // Catch:{ Exception -> 0x04b3 }
        L_0x0466:
            X.4Qh r6 = new X.4Qh     // Catch:{ Exception -> 0x04b3 }
            r6.<init>(r4, r0)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x0471
        L_0x046c:
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x04b3 }
            goto L_0x0466
        L_0x0471:
            return r6
        L_0x0472:
            return r6
        L_0x0473:
            X.1TO r0 = (X.AnonymousClass1TO) r0     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "category_id"
            java.lang.String r8 = X.C87624Xt.A00(r4, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "name"
            java.lang.String r9 = X.C87624Xt.A00(r4, r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = "media"
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x04b3 }
            r6 = 0
            if (r5 == 0) goto L_0x049b
            java.lang.String r4 = "image"
            org.json.JSONObject r4 = r5.optJSONObject(r4)     // Catch:{ Exception -> 0x04b3 }
            if (r4 == 0) goto L_0x049b
            X.101 r0 = r0.A00     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r7 = r0.A6j(r4, r2)     // Catch:{ Exception -> 0x04b3 }
            X.1mL r7 = (X.C35691mL) r7     // Catch:{ Exception -> 0x04b3 }
            goto L_0x049c
        L_0x049b:
            r7 = r12
        L_0x049c:
            if (r8 == 0) goto L_0x04b2
            if (r9 == 0) goto L_0x04b2
            if (r7 == 0) goto L_0x04b2
            java.lang.String r0 = "is_last_level"
            boolean r11 = r1.optBoolean(r0)     // Catch:{ Exception -> 0x04b3 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x04b3 }
            r10.<init>()     // Catch:{ Exception -> 0x04b3 }
            X.4N4 r6 = new X.4N4     // Catch:{ Exception -> 0x04b3 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x04b3 }
        L_0x04b2:
            return r6
        L_0x04b3:
            r1 = move-exception
            java.lang.String r0 = "BaseGraphQLResponseConverter/convert/Could not convert GraphQL response"
            com.whatsapp.util.Log.e(r0, r1)
            return r12
        L_0x04ba:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass100.A6j(org.json.JSONObject, long):java.lang.Object");
    }
}
