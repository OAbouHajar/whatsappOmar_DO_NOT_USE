package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.61t  reason: invalid class name and case insensitive filesystem */
public class C1204661t implements C18100w9 {
    public HashMap A00;
    public boolean A01 = false;
    public final C16980tz A02;
    public final C115175pI A03;
    public final C18300wT A04;
    public final C18090w8 A05;

    public C1204661t(C16980tz r2, C115175pI r3, C18300wT r4, C18090w8 r5) {
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
    }

    public String A00(int i2) {
        if (this.A05.A03.A0C(698)) {
            return ADW(String.valueOf(i2));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = ADW(java.lang.String.valueOf(r4.getInt("error_code")));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(android.os.Bundle r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r2 = "error_code"
            if (r4 == 0) goto L_0x001f
            X.0w8 r0 = r3.A05
            X.0pd r1 = r0.A03
            r0 = 698(0x2ba, float:9.78E-43)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x001f
            int r0 = r4.getInt(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r3.ADW(r0)
            if (r0 == 0) goto L_0x001f
            return r0
        L_0x001f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1204661t.A01(android.os.Bundle, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:62|(6:63|64|65|66|67|(4:69|70|71|(3:73|74|75)))|83|84|110) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:51|52|53|54|55|(2:56|(5:58|59|60|(10:62|63|64|65|66|67|(4:69|70|71|(3:73|74|75))|83|84|110)(1:109)|87)(2:107|88))|92|93|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0124, code lost:
        if (r11.isEmpty() != false) goto L_0x0126;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0108 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0120 */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099 A[SYNTHETIC, Splitter:B:47:0x0099] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r17 = this;
            r9 = r17
            boolean r0 = r9.A01
            r6 = 1
            if (r0 == 0) goto L_0x000f
            java.util.HashMap r0 = r9.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0098
        L_0x000f:
            java.lang.String r1 = "payments_error_map.json"
            monitor-enter(r9)
            X.0tz r0 = r9.A02     // Catch:{ all -> 0x0082 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0082 }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x0082 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0082 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0082 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0026
            r2 = 0
        L_0x0026:
            monitor-exit(r9)
            if (r2 != 0) goto L_0x0030
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/ file name is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x002e:
            r0 = 0
            return r0
        L_0x0030:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0036 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0036 }
            goto L_0x0041
        L_0x0036:
            r1 = move-exception
            java.lang.String r0 = "PAY: ErrorMapMetadata/getMessage/ FileNotFoundException: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x002e
        L_0x0041:
            r8 = 0
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0063 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0063 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0063 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0063 }
        L_0x0050:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x005a
            r3.append(r0)     // Catch:{ all -> 0x005e }
            goto L_0x0050
        L_0x005a:
            r1.close()     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0063 }
            goto L_0x0079
        L_0x005e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            throw r0     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0063 }
        L_0x0063:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/IOException: "
            goto L_0x0072
        L_0x006b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/FileNotFoundException: "
        L_0x0072:
            java.lang.String r0 = X.AnonymousClass000.A0e(r2, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0079:
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x0085 }
            org.json.JSONObject r8 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x008f
        L_0x0082:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/JSONException: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x008f:
            java.lang.String r7 = "exit_flow"
            if (r8 != 0) goto L_0x0099
            java.lang.String r0 = "PAY: ErrorMapMetadata/makeMap/ JSONObject is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0098:
            return r6
        L_0x0099:
            java.util.HashMap r0 = X.AnonymousClass000.A0x()     // Catch:{ JSONException -> 0x014a }
            r9.A00 = r0     // Catch:{ JSONException -> 0x014a }
            r9.A01 = r6     // Catch:{ JSONException -> 0x014a }
            java.util.Iterator r16 = r8.keys()     // Catch:{ JSONException -> 0x014a }
        L_0x00a5:
            boolean r0 = r16.hasNext()     // Catch:{ JSONException -> 0x014a }
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r16.next()     // Catch:{ JSONException -> 0x014a }
            java.lang.String r5 = r0.toString()     // Catch:{ JSONException -> 0x014a }
            r4 = 0
            org.json.JSONObject r1 = r8.getJSONObject(r5)     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "actions"
            org.json.JSONArray r12 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x011d }
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x011d }
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0120 }
            r3 = 0
        L_0x00c7:
            int r0 = r12.length()     // Catch:{ Exception -> 0x0120 }
            if (r3 >= r0) goto L_0x0119
            r13 = 0
            org.json.JSONObject r14 = r12.getJSONObject(r3)     // Catch:{ JSONException -> 0x0111 }
            if (r14 == 0) goto L_0x0116
            java.lang.String r0 = "type"
            java.lang.String r2 = r14.getString(r0)     // Catch:{ JSONException -> 0x0106 }
            java.lang.String r0 = "name"
            java.lang.String r1 = r14.getString(r0)     // Catch:{ JSONException -> 0x0107 }
            if (r2 == 0) goto L_0x0108
            java.lang.String r0 = "FAQ"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x0108 }
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = "faq_data"
            org.json.JSONObject r14 = r14.getJSONObject(r0)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r0 = "faq_article_id"
            java.lang.String r13 = r14.getString(r0)     // Catch:{ JSONException -> 0x00f7 }
            goto L_0x0108
        L_0x00f7:
            r15 = move-exception
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r0 = "PAY/ ErrorMapObject/ No article_id present. Exception: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r15, r0, r14)     // Catch:{ JSONException -> 0x0108 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0108 }
            goto L_0x0108
        L_0x0106:
            r2 = r4
        L_0x0107:
            r1 = r4
        L_0x0108:
            X.5vA r0 = new X.5vA     // Catch:{ Exception -> 0x0120 }
            r0.<init>(r2, r1, r13)     // Catch:{ Exception -> 0x0120 }
            r10.add(r0)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0116
        L_0x0111:
            java.lang.String r0 = "PAY/ ErrorMapObject/ Action not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0120 }
        L_0x0116:
            int r3 = r3 + 1
            goto L_0x00c7
        L_0x0119:
            r11.addAll(r10)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0120
        L_0x011d:
            r11 = r4
        L_0x011e:
            r4 = r11
            goto L_0x0126
        L_0x0120:
            boolean r0 = r11.isEmpty()     // Catch:{ JSONException -> 0x014a }
            if (r0 == 0) goto L_0x011e
        L_0x0126:
            boolean r0 = r8.has(r7)     // Catch:{ JSONException -> 0x014a }
            if (r0 == 0) goto L_0x0133
            boolean r0 = r8.getBoolean(r7)     // Catch:{ JSONException -> 0x014a }
            r3 = 1
            if (r0 != 0) goto L_0x0134
        L_0x0133:
            r3 = 0
        L_0x0134:
            java.util.HashMap r2 = r9.A00     // Catch:{ JSONException -> 0x014a }
            org.json.JSONObject r1 = r8.getJSONObject(r5)     // Catch:{ JSONException -> 0x014a }
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x014a }
            X.5sJ r0 = new X.5sJ     // Catch:{ JSONException -> 0x014a }
            r0.<init>(r1, r4, r3)     // Catch:{ JSONException -> 0x014a }
            r2.put(r5, r0)     // Catch:{ JSONException -> 0x014a }
            goto L_0x00a5
        L_0x014a:
            r1 = move-exception
            java.lang.String r0 = "PAY: ErrorMapMetadata/makeMap/JSONException: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1204661t.A02():boolean");
    }

    public String ADW(String str) {
        if (A02()) {
            if (this.A00.containsKey(str)) {
                C117015sJ r0 = (C117015sJ) this.A00.get(str);
                if (r0 != null) {
                    return r0.A00;
                }
            } else {
                Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: ErrorMapMetadata/getMessage/Error code not found. Error code: ")));
            }
        }
        return null;
    }
}
