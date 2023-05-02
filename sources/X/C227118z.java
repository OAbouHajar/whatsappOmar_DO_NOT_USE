package X;

import java.util.HashMap;

/* renamed from: X.18z  reason: invalid class name and case insensitive filesystem */
public class C227118z {
    public HashMap A00;
    public HashMap A01;
    public HashMap A02;
    public boolean A03 = false;
    public final C16980tz A04;

    public C227118z(C16980tz r2) {
        this.A04 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113 A[Catch:{ JSONException -> 0x0183 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00() {
        /*
            r19 = this;
            r0 = r19
            monitor-enter(r0)
            boolean r1 = r0.A03     // Catch:{ all -> 0x01b1 }
            if (r1 != 0) goto L_0x01af
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x01b1 }
            r1.<init>()     // Catch:{ all -> 0x01b1 }
            r0.A01 = r1     // Catch:{ all -> 0x01b1 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x01b1 }
            r1.<init>()     // Catch:{ all -> 0x01b1 }
            r0.A00 = r1     // Catch:{ all -> 0x01b1 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x01b1 }
            r1.<init>()     // Catch:{ all -> 0x01b1 }
            r0.A02 = r1     // Catch:{ all -> 0x01b1 }
            X.0tz r1 = r0.A04     // Catch:{ all -> 0x01b1 }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x01b1 }
            java.lang.String r2 = "currency_metadata.json"
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0185 }
            r5.<init>()     // Catch:{ Exception -> 0x0185 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ Exception -> 0x0185 }
            java.io.InputStream r4 = r1.open(r2)     // Catch:{ Exception -> 0x0185 }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r1]     // Catch:{ Exception -> 0x0185 }
        L_0x0033:
            int r2 = r4.read(r3)     // Catch:{ Exception -> 0x0185 }
            r1 = -1
            if (r2 == r1) goto L_0x003f
            r1 = 0
            r5.write(r3, r1, r2)     // Catch:{ Exception -> 0x0185 }
            goto L_0x0033
        L_0x003f:
            r5.close()     // Catch:{ Exception -> 0x0185 }
            r4.close()     // Catch:{ Exception -> 0x0185 }
            byte[] r2 = r5.toByteArray()     // Catch:{ Exception -> 0x0185 }
            if (r2 == 0) goto L_0x01ac
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x01b1 }
            r1.<init>(r2)     // Catch:{ all -> 0x01b1 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0183 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "fiat_currencies"
            org.json.JSONArray r4 = r3.getJSONArray(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r7 = "@"
            r2 = 0
        L_0x005e:
            int r1 = r4.length()     // Catch:{ JSONException -> 0x0183 }
            if (r2 >= r1) goto L_0x00c6
            org.json.JSONObject r5 = r4.getJSONObject(r2)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "code"
            java.lang.String r9 = r5.getString(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "icon"
            java.lang.String r11 = r5.getString(r1)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r1 = "requestIcon"
            java.lang.String r12 = r5.getString(r1)     // Catch:{ JSONException -> 0x007c }
            goto L_0x0093
        L_0x007b:
            r11 = r7
        L_0x007c:
            java.lang.String r1 = "PAY: PaymentCurrencyProvider/loadFiatCurrencies: No IconText for "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0183 }
            r6.<init>(r1)     // Catch:{ JSONException -> 0x0183 }
            r6.append(r9)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = " and using default icon"
            r6.append(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = r6.toString()     // Catch:{ JSONException -> 0x0183 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ JSONException -> 0x0183 }
            r12 = r7
        L_0x0093:
            r15 = 0
            java.lang.String r1 = "symbol"
            java.lang.String r10 = r5.getString(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "offset"
            int r16 = r5.getInt(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "displayExponent"
            int r17 = r5.getInt(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "weight"
            int r18 = r5.getInt(r1)     // Catch:{ JSONException -> 0x0183 }
            r5 = 10000000(0x989680, double:4.9406565E-317)
            java.math.BigDecimal r13 = java.math.BigDecimal.valueOf(r5)     // Catch:{ JSONException -> 0x0183 }
            java.math.BigDecimal r14 = X.C35481m0.A07     // Catch:{ JSONException -> 0x0183 }
            X.1m0 r8 = new X.1m0     // Catch:{ JSONException -> 0x0183 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ JSONException -> 0x0183 }
            java.util.HashMap r5 = r0.A01     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = r8.A04     // Catch:{ JSONException -> 0x0183 }
            r5.put(r1, r8)     // Catch:{ JSONException -> 0x0183 }
            int r2 = r2 + 1
            goto L_0x005e
        L_0x00c6:
            java.lang.String r1 = "crypto_currencies"
            org.json.JSONArray r4 = r3.getJSONArray(r1)     // Catch:{ JSONException -> 0x0183 }
            r3 = 0
        L_0x00cd:
            int r1 = r4.length()     // Catch:{ JSONException -> 0x0183 }
            if (r3 >= r1) goto L_0x01ac
            org.json.JSONObject r2 = r4.getJSONObject(r3)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "code"
            java.lang.String r9 = r2.getString(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "isStable"
            boolean r18 = r2.getBoolean(r1)     // Catch:{ JSONException -> 0x0183 }
            if (r18 == 0) goto L_0x00fe
            java.lang.String r1 = "defaultMatchingFiat"
            java.lang.String r11 = r2.getString(r1)     // Catch:{ JSONException -> 0x00ec }
            goto L_0x0100
        L_0x00ec:
            r6 = move-exception
            java.lang.String r5 = "PAY: PaymentCurrencyProvider/loadCryptoCurrencies: Stable coin has no default matching fiat!"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0183 }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x0183 }
            r1.append(r6)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0183 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ JSONException -> 0x0183 }
        L_0x00fe:
            java.lang.String r11 = ""
        L_0x0100:
            java.lang.String r1 = "matchingFiats"
            org.json.JSONArray r8 = r2.getJSONArray(r1)     // Catch:{ JSONException -> 0x0183 }
            int r1 = r8.length()     // Catch:{ JSONException -> 0x0183 }
            java.lang.String[] r14 = new java.lang.String[r1]     // Catch:{ JSONException -> 0x0183 }
            r7 = 0
        L_0x010d:
            int r1 = r8.length()     // Catch:{ JSONException -> 0x0183 }
            if (r7 >= r1) goto L_0x014a
            java.lang.String r1 = r8.getString(r7)     // Catch:{ JSONException -> 0x0183 }
            r14[r7] = r1     // Catch:{ JSONException -> 0x0183 }
            java.util.HashMap r5 = r0.A02     // Catch:{ JSONException -> 0x0183 }
            r1 = r14[r7]     // Catch:{ JSONException -> 0x0183 }
            boolean r1 = r5.containsKey(r1)     // Catch:{ JSONException -> 0x0183 }
            if (r1 == 0) goto L_0x0144
            java.util.HashMap r5 = r0.A02     // Catch:{ JSONException -> 0x0183 }
            r1 = r14[r7]     // Catch:{ JSONException -> 0x0183 }
            java.lang.Object r1 = r5.get(r1)     // Catch:{ JSONException -> 0x0183 }
            if (r1 == 0) goto L_0x0144
            java.util.HashMap r5 = r0.A02     // Catch:{ JSONException -> 0x0183 }
            r1 = r14[r7]     // Catch:{ JSONException -> 0x0183 }
            java.lang.Object r6 = r5.get(r1)     // Catch:{ JSONException -> 0x0183 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ JSONException -> 0x0183 }
        L_0x0137:
            r6.add(r9)     // Catch:{ JSONException -> 0x0183 }
            java.util.HashMap r5 = r0.A02     // Catch:{ JSONException -> 0x0183 }
            r1 = r14[r7]     // Catch:{ JSONException -> 0x0183 }
            r5.put(r1, r6)     // Catch:{ JSONException -> 0x0183 }
            int r7 = r7 + 1
            goto L_0x010d
        L_0x0144:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0183 }
            r6.<init>()     // Catch:{ JSONException -> 0x0183 }
            goto L_0x0137
        L_0x014a:
            java.lang.String r1 = "symbol"
            java.lang.String r10 = r2.getString(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "offset"
            int r15 = r2.getInt(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "displayExponent"
            int r16 = r2.getInt(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "weight"
            int r17 = r2.getInt(r1)     // Catch:{ JSONException -> 0x0183 }
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.math.BigDecimal r12 = new java.math.BigDecimal     // Catch:{ JSONException -> 0x0183 }
            r12.<init>(r1)     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = "0.01"
            java.math.BigDecimal r13 = new java.math.BigDecimal     // Catch:{ JSONException -> 0x0183 }
            r13.<init>(r1)     // Catch:{ JSONException -> 0x0183 }
            X.1m5 r8 = new X.1m5     // Catch:{ JSONException -> 0x0183 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ JSONException -> 0x0183 }
            java.util.HashMap r2 = r0.A00     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r1 = r8.A04     // Catch:{ JSONException -> 0x0183 }
            r2.put(r1, r8)     // Catch:{ JSONException -> 0x0183 }
            int r3 = r3 + 1
            goto L_0x00cd
        L_0x0183:
            r3 = move-exception
            goto L_0x0198
        L_0x0185:
            r3 = move-exception
            java.lang.String r2 = "PAY: PaymentCurrencyProvider/getAssetFileAsByte"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b1 }
            r1.<init>(r2)     // Catch:{ all -> 0x01b1 }
            r1.append(r3)     // Catch:{ all -> 0x01b1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01b1 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x01b1 }
            goto L_0x01ac
        L_0x0198:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b1 }
            r2.<init>()     // Catch:{ all -> 0x01b1 }
            java.lang.String r1 = "PAY: PaymentCurrencyProvider/load"
            r2.append(r1)     // Catch:{ all -> 0x01b1 }
            r2.append(r3)     // Catch:{ all -> 0x01b1 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01b1 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x01b1 }
        L_0x01ac:
            r1 = 1
            r0.A03 = r1     // Catch:{ all -> 0x01b1 }
        L_0x01af:
            monitor-exit(r0)
            return
        L_0x01b1:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227118z.A00():void");
    }
}
