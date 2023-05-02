package X;

import com.obwhatsapp.backup.google.GoogleBackupService;

/* renamed from: X.2xQ  reason: invalid class name and case insensitive filesystem */
public class C59452xQ extends C70953iC {
    public final /* synthetic */ GoogleBackupService A00;
    public final /* synthetic */ AnonymousClass3BK A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C59452xQ(GoogleBackupService googleBackupService, AnonymousClass3BK r2, String str, String str2) {
        this.A00 = googleBackupService;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0141 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A00(int r15) {
        /*
            r14 = this;
            X.3BK r4 = r14.A01
            java.lang.String r3 = r14.A02
            java.lang.String r5 = "name"
            java.lang.String r7 = "backup"
            java.lang.String r2 = "gdrive-api-v2/backup/rename failed with exception"
            X.2GM r8 = r4.A08
            boolean r0 = r8.A0B()
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "gdrive-api-v2/rename-backup/api disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x00ba
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x001d:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r12 = 0
            java.lang.String r9 = "POST"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r0 = "clients/wa/backups/"
            r1.append(r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r0 = r4.A0A     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r1.append(r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r0 = ":rename"
            java.lang.String r10 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r11 = "application/json; charset=UTF-8"
            r13 = 1
            javax.net.ssl.HttpsURLConnection r12 = r8.A07(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.io.OutputStream r6 = r12.getOutputStream()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "{\"newName\": \"clients/wa/backups/"
            r1.append(r0)     // Catch:{ all -> 0x013b }
            r1.append(r3)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "\"}"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x013b }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ all -> 0x013b }
            r6.write(r0)     // Catch:{ all -> 0x013b }
            r6.close()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            int r6 = r12.getResponseCode()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == r0) goto L_0x008e
            r0 = 409(0x199, float:5.73E-43)
            if (r6 == r0) goto L_0x011b
            r0 = 429(0x1ad, float:6.01E-43)
            if (r6 == r0) goto L_0x0107
            r0 = 400(0x190, float:5.6E-43)
            if (r6 == r0) goto L_0x011b
            r0 = 401(0x191, float:5.62E-43)
            if (r6 == r0) goto L_0x0084
            r0 = 403(0x193, float:5.65E-43)
            if (r6 == r0) goto L_0x0101
            r0 = 404(0x194, float:5.66E-43)
            if (r6 == r0) goto L_0x00f1
            goto L_0x00ce
        L_0x0084:
            r8.A0A()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0017
        L_0x008e:
            java.io.InputStream r0 = r12.getInputStream()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            org.json.JSONObject r1 = X.C30311c8.A03(r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            if (r1 == 0) goto L_0x012c
            boolean r0 = r1.has(r7)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            if (r0 == 0) goto L_0x012c
            org.json.JSONObject r1 = r1.getJSONObject(r7)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            boolean r0 = r1.has(r5)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = r1.getString(r5)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r4.A01 = r0     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = 1
            goto L_0x0018
        L_0x00ba:
            java.lang.Object[] r1 = X.C13690nt.A1Z()
            java.lang.String r0 = r14.A03
            X.C13690nt.A1L(r0, r3, r1)
            java.lang.String r0 = "gdrive-service/change-number-v2 failed to rename backup old name: %s, new name: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x00ce:
            java.lang.String r3 = X.C30311c8.A01(r12)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r0 = "gdrive-api-v2/backup/rename weird status code: "
            r1.append(r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r1.append(r6)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r0 = -1
            X.1da r1 = new X.1da     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r1.<init>(r3, r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            goto L_0x013a
        L_0x00f1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r0 = "Failed to find backup "
            java.lang.String r1 = X.AnonymousClass000.A0e(r4, r0, r1)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            X.3ib r0 = new X.3ib     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            throw r0     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
        L_0x0101:
            X.3iQ r0 = new X.3iQ     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r0.<init>()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            throw r0     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
        L_0x0107:
            X.0pd r3 = r4.A09     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r1 = 916(0x394, float:1.284E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            boolean r1 = r3.A0E(r0, r1)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r0 = "rename-backup"
            X.AnonymousClass3BQ.A01(r0, r12, r1)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            throw r0     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
        L_0x011b:
            java.lang.String r3 = X.C30311c8.A01(r12)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            X.0so r1 = r4.A06     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r0 = "gdrive-api-v2/rename-backup"
            r1.AcB(r0, r3, r13)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            X.3iN r0 = new X.3iN     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            throw r0     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
        L_0x012c:
            java.lang.String r0 = "gdrive-api-v2/backup/rename failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            java.lang.String r3 = "unable to get new name"
            r0 = -1
            X.1da r1 = new X.1da     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
            r1.<init>(r3, r0)     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
        L_0x013a:
            throw r1     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
        L_0x013b:
            r0 = move-exception
            if (r6 == 0) goto L_0x0141
            r6.close()     // Catch:{ all -> 0x0141 }
        L_0x0141:
            throw r0     // Catch:{ IOException -> 0x0144, JSONException -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            goto L_0x014d
        L_0x0144:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)     // Catch:{ all -> 0x0155 }
            X.1da r0 = X.C31141da.A00(r0)     // Catch:{ all -> 0x0155 }
            goto L_0x0154
        L_0x014d:
            com.whatsapp.util.Log.e(r2, r0)     // Catch:{ all -> 0x0155 }
            X.1da r0 = X.C31141da.A00(r0)     // Catch:{ all -> 0x0155 }
        L_0x0154:
            throw r0     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            if (r12 == 0) goto L_0x015b
            r12.disconnect()
        L_0x015b:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59452xQ.A00(int):java.lang.Object");
    }
}
