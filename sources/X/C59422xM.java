package X;

import java.util.List;

/* renamed from: X.2xM  reason: invalid class name and case insensitive filesystem */
public class C59422xM extends C70923i9 {
    public final /* synthetic */ AnonymousClass3BK A00;
    public final /* synthetic */ AnonymousClass2GM A01;
    public final /* synthetic */ List A02;

    public C59422xM(AnonymousClass3BK r1, AnonymousClass2GM r2, List list) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0187 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x018e */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c3 A[RETURN] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x0105=Splitter:B:40:0x0105, B:69:0x018e=Splitter:B:69:0x018e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A00(int r15) {
        /*
            r14 = this;
            X.2GM r8 = r14.A01
            X.3BK r6 = r14.A00
            java.util.List r2 = r14.A02
            java.lang.String r5 = "status"
            java.lang.String r7 = "GoogleBackupApi/delete-files "
            boolean r0 = r2.isEmpty()
            r13 = 1
            if (r0 != 0) goto L_0x01bd
            int r0 = r2.size()
            r3 = 2500(0x9c4, float:3.503E-42)
            if (r0 > r3) goto L_0x019f
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r12 = 0
            java.lang.String r9 = "POST"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = "clients/wa/backups/"
            r1.append(r0)     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = r6.A0A     // Catch:{ IOException -> 0x018f }
            r1.append(r0)     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = ":batchDeleteFiles"
            java.lang.String r10 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x018f }
            java.lang.String r11 = "application/json; charset=UTF-8"
            javax.net.ssl.HttpsURLConnection r12 = r8.A07(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x018f }
            java.io.OutputStream r3 = r12.getOutputStream()     // Catch:{ IOException -> 0x018f }
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x0188 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0188 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0188 }
            android.util.JsonWriter r4 = new android.util.JsonWriter     // Catch:{ all -> 0x0188 }
            r4.<init>(r0)     // Catch:{ all -> 0x0188 }
            android.util.JsonWriter r1 = r4.beginObject()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "transactionId"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r6.A02()     // Catch:{ all -> 0x0183 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "fileIds"
            android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ all -> 0x0183 }
            r0.beginArray()     // Catch:{ all -> 0x0183 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0183 }
        L_0x006c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0183 }
            X.3Ad r0 = (X.C61743Ad) r0     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x0183 }
            r4.value(r0)     // Catch:{ all -> 0x0183 }
            goto L_0x006c
        L_0x007e:
            android.util.JsonWriter r0 = r4.endArray()     // Catch:{ all -> 0x0183 }
            android.util.JsonWriter r0 = r0.endObject()     // Catch:{ all -> 0x0183 }
            r0.flush()     // Catch:{ all -> 0x0183 }
            r4.close()     // Catch:{ all -> 0x0188 }
            if (r3 == 0) goto L_0x0091
            r3.close()     // Catch:{ IOException -> 0x018f }
        L_0x0091:
            int r4 = r12.getResponseCode()     // Catch:{ IOException -> 0x018f }
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 == r0) goto L_0x00fb
            r0 = 401(0x191, float:5.62E-43)
            if (r4 == r0) goto L_0x00f6
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x00f0
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r3 = "delete-files"
            if (r4 == r0) goto L_0x00de
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = "GoogleBackupApi/delete-files status of the response is "
            r1.append(r0)     // Catch:{ IOException -> 0x018f }
            r1.append(r4)     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = " statusLine "
            r1.append(r0)     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = r12.getResponseMessage()     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x018f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x018f }
            java.lang.String r2 = X.C30311c8.A01(r12)     // Catch:{ IOException -> 0x018f }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r7)     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)     // Catch:{ IOException -> 0x018f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x018f }
            X.0so r0 = r8.A04     // Catch:{ IOException -> 0x018f }
            X.AnonymousClass2GM.A01(r0, r3, r4)     // Catch:{ IOException -> 0x018f }
            r1 = -1
            X.1da r0 = new X.1da     // Catch:{ IOException -> 0x018f }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x018f }
            throw r0     // Catch:{ IOException -> 0x018f }
        L_0x00de:
            X.0pd r2 = r8.A0C     // Catch:{ IOException -> 0x018f }
            r1 = 916(0x394, float:1.284E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ IOException -> 0x018f }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ IOException -> 0x018f }
            X.AnonymousClass3BQ.A01(r3, r12, r0)     // Catch:{ IOException -> 0x018f }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ IOException -> 0x018f }
            throw r0     // Catch:{ IOException -> 0x018f }
        L_0x00f0:
            X.3iQ r0 = new X.3iQ     // Catch:{ IOException -> 0x018f }
            r0.<init>()     // Catch:{ IOException -> 0x018f }
            throw r0     // Catch:{ IOException -> 0x018f }
        L_0x00f6:
            r8.A0A()     // Catch:{ IOException -> 0x018f }
            goto L_0x017b
        L_0x00fb:
            java.io.InputStream r0 = r12.getInputStream()     // Catch:{ IOException -> 0x0104 }
            java.lang.String r3 = X.C30311c8.A00(r0)     // Catch:{ IOException -> 0x0104 }
            goto L_0x0105
        L_0x0104:
            r3 = 0
        L_0x0105:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x018f }
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = "GoogleBackupApi/delete-files empty response"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x018f }
            goto L_0x017b
        L_0x0111:
            org.json.JSONObject r1 = X.C13700nu.A0K(r3)     // Catch:{ JSONException -> 0x016a }
            boolean r0 = r1.has(r5)     // Catch:{ JSONException -> 0x016a }
            if (r0 == 0) goto L_0x017b
            org.json.JSONObject r4 = r1.getJSONObject(r5)     // Catch:{ JSONException -> 0x016a }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ JSONException -> 0x016a }
        L_0x0123:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x016a }
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r0 = r5.next()     // Catch:{ JSONException -> 0x016a }
            X.3Ad r0 = (X.C61743Ad) r0     // Catch:{ JSONException -> 0x016a }
            java.lang.String r2 = r0.A06     // Catch:{ JSONException -> 0x016a }
            boolean r0 = r4.has(r2)     // Catch:{ JSONException -> 0x016a }
            if (r0 != 0) goto L_0x0148
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x016a }
            java.lang.String r0 = "GoogleBackupApi/delete-files no status for "
            r1.append(r0)     // Catch:{ JSONException -> 0x016a }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ JSONException -> 0x016a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x016a }
            goto L_0x0123
        L_0x0148:
            java.lang.String r1 = r4.getString(r2)     // Catch:{ JSONException -> 0x016a }
            java.lang.String r0 = "OK"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x016a }
            if (r0 != 0) goto L_0x0123
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x016a }
            java.lang.String r0 = "GoogleBackupApi/delete-files failed to delete "
            r1.append(r0)     // Catch:{ JSONException -> 0x016a }
            r1.append(r2)     // Catch:{ JSONException -> 0x016a }
            java.lang.String r0 = " status "
            java.lang.String r0 = X.AnonymousClass000.A0e(r4, r0, r1)     // Catch:{ JSONException -> 0x016a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x016a }
            goto L_0x0123
        L_0x016a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = "GoogleBackupApi/delete-files malformed response"
            r1.append(r0)     // Catch:{ IOException -> 0x018f }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ IOException -> 0x018f }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ IOException -> 0x018f }
        L_0x017b:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = 0
            goto L_0x01be
        L_0x0183:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0187 }
        L_0x0187:
            throw r0     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r0 = move-exception
            if (r3 == 0) goto L_0x018e
            r3.close()     // Catch:{ all -> 0x018e }
        L_0x018e:
            throw r0     // Catch:{ IOException -> 0x018f }
        L_0x018f:
            r0 = move-exception
            X.1da r0 = X.C31141da.A00(r0)     // Catch:{ all -> 0x0195 }
            throw r0     // Catch:{ all -> 0x0195 }
        L_0x0195:
            r0 = move-exception
            if (r12 == 0) goto L_0x019b
            r12.disconnect()
        L_0x019b:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x019f:
            java.lang.String r0 = "Batch too big "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = " max allowed "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x01b7:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x01bd:
            r0 = 1
        L_0x01be:
            if (r0 == 0) goto L_0x01c3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x01c3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59422xM.A00(int):java.lang.Object");
    }
}
