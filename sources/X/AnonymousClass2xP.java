package X;

/* renamed from: X.2xP  reason: invalid class name */
public class AnonymousClass2xP extends C70943iB {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass3BK A01;
    public final /* synthetic */ C16440t3 A02;

    public AnonymousClass2xP(AnonymousClass3BK r1, C16440t3 r2, long j2) {
        this.A00 = j2;
        this.A02 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0145 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A00(int r16) {
        /*
            r15 = this;
            long r3 = r15.A00
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0013
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            long r0 = r2.toSeconds(r3)
        L_0x0013:
            X.3BK r5 = r15.A01
            java.lang.String r8 = "gdrive-api-v2/backup/begin-transaction/failed "
            java.lang.String r4 = "gdrive-api-v2/backup/beginTransaction failed with exception"
            X.2GM r9 = r5.A08
            boolean r2 = r9.A0B()
            if (r2 != 0) goto L_0x0137
            java.lang.String r2 = r5.A02()
            r14 = 1
            if (r2 != 0) goto L_0x013f
            r2 = 13
            android.net.TrafficStats.setThreadStatsTag(r2)
            r13 = 0
            java.lang.String r10 = "POST"
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.String r2 = "clients/wa/backups/"
            r3.append(r2)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.String r2 = r5.A0A     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            r3.append(r2)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.String r2 = ":beginTransaction"
            java.lang.String r11 = X.AnonymousClass000.A0h(r2, r3)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.String r12 = "application/json; charset=UTF-8"
            javax.net.ssl.HttpsURLConnection r13 = r9.A07(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.io.OutputStream r6 = r13.getOutputStream()     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x010e }
            java.lang.String r2 = "{\"options\":{\"mode\":\"READ_WRITE\"},"
            r7.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r2 = "\"retryCount\":\""
            r7.append(r2)     // Catch:{ all -> 0x010e }
            r2 = r16
            r7.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r2 = "\","
            r7.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r2 = "\"deadline\":\""
            r7.append(r2)     // Catch:{ all -> 0x010e }
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x010e }
            r7.append(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "s\""
            r7.append(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "}"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r7)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x010e }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ all -> 0x010e }
            r6.write(r0)     // Catch:{ all -> 0x010e }
            r6.close()     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            int r1 = r13.getResponseCode()     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00df
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x00d9
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x00c5
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x00f9
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x010a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r8)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            int r0 = r13.getResponseCode()     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r8)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.String r0 = X.C30311c8.A01(r13)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            goto L_0x0131
        L_0x00c5:
            X.0pd r2 = r5.A09     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            r1 = 916(0x394, float:1.284E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            boolean r1 = r2.A0E(r0, r1)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.String r0 = "backup/begin-transaction"
            X.AnonymousClass3BQ.A01(r0, r13, r1)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            goto L_0x0109
        L_0x00d9:
            X.3iQ r0 = new X.3iQ     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            r0.<init>()     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            goto L_0x0109
        L_0x00df:
            java.io.InputStream r0 = r13.getInputStream()     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            org.json.JSONObject r1 = X.C30311c8.A03(r0)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            if (r1 == 0) goto L_0x010a
            java.lang.String r0 = "id"
            java.lang.String r0 = X.AnonymousClass3BK.A01(r0, r1)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            r5.A00 = r0     // Catch:{ all -> 0x00f6 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            goto L_0x0139
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            goto L_0x0109
        L_0x00f9:
            java.lang.String r2 = X.C30311c8.A01(r13)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            X.0so r1 = r5.A06     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            java.lang.String r0 = "gdrive-api-v2/backup/begin-transaction"
            r1.AcB(r0, r2, r14)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            X.3iN r0 = new X.3iN     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
        L_0x0109:
            throw r0     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
        L_0x010a:
            r9.A0A()     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
            goto L_0x0131
        L_0x010e:
            r0 = move-exception
            if (r6 == 0) goto L_0x0114
            r6.close()     // Catch:{ all -> 0x0114 }
        L_0x0114:
            throw r0     // Catch:{ IOException -> 0x011e, JSONException -> 0x0115 }
        L_0x0115:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)     // Catch:{ all -> 0x0127 }
            X.1da r0 = X.C31141da.A00(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0126
        L_0x011e:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)     // Catch:{ all -> 0x0127 }
            X.1da r0 = X.C31141da.A00(r0)     // Catch:{ all -> 0x0127 }
        L_0x0126:
            throw r0     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r0 = move-exception
            if (r13 == 0) goto L_0x012d
            r13.disconnect()
        L_0x012d:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0131:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x0137:
            r0 = 0
            goto L_0x0140
        L_0x0139:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x013f:
            r0 = 1
        L_0x0140:
            if (r0 == 0) goto L_0x0145
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0145:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xP.A00(int):java.lang.Object");
    }
}
