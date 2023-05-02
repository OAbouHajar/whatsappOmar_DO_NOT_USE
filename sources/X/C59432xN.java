package X;

/* renamed from: X.2xN  reason: invalid class name and case insensitive filesystem */
public class C59432xN extends C70943iB {
    public final /* synthetic */ AnonymousClass2GM A00;
    public final /* synthetic */ String A01;

    public C59432xN(AnonymousClass2GM r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A00(int r13) {
        /*
            r12 = this;
            X.2GM r5 = r12.A00
            java.lang.String r11 = r12.A01
            java.lang.String r2 = "GoogleBackupApi/create-backup/failed "
            boolean r0 = r5.A0B()
            r8 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "GoogleBackupApi/create-backup/api disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r8
        L_0x0013:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.util.HashMap r9 = X.AnonymousClass000.A0x()     // Catch:{ IOException -> 0x00aa }
            java.lang.String r0 = "backupId"
            r9.put(r0, r11)     // Catch:{ IOException -> 0x00aa }
            java.lang.String r6 = "POST"
            java.lang.String r7 = "clients/wa/backups"
            r10 = 0
            javax.net.ssl.HttpsURLConnection r4 = r5.A07(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x00aa }
            int r1 = r4.getResponseCode()     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x008e
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x0088
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x0077
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x0065
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0061
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r2)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            int r0 = r4.getResponseCode()     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r2)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r0 = X.C30311c8.A01(r4)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            goto L_0x009d
        L_0x0061:
            r5.A0A()     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            goto L_0x009d
        L_0x0065:
            java.lang.String r3 = X.C30311c8.A01(r4)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            X.0so r2 = r5.A04     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r1 = "GoogleBackupApi/create-backup"
            r0 = 1
            r2.AcB(r1, r3, r0)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            X.3iN r0 = new X.3iN     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            throw r0     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
        L_0x0077:
            X.3BK r8 = r5.A04(r11)     // Catch:{ 3iM -> 0x007c }
            goto L_0x009d
        L_0x007c:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/create-backup/failed to get one"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            X.3ia r0 = new X.3ia     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            throw r0     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
        L_0x0088:
            X.3iQ r0 = new X.3iQ     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            r0.<init>()     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            throw r0     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
        L_0x008e:
            X.0pd r9 = r5.A0C     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            X.0so r6 = r5.A04     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            X.0sd r7 = r5.A06     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            java.io.InputStream r10 = r4.getInputStream()     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            r8 = r5
            X.3BK r8 = X.AnonymousClass3BK.A00(r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
        L_0x009d:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r8
        L_0x00a4:
            r0 = move-exception
            r8 = r4
            goto L_0x00b1
        L_0x00a7:
            r0 = move-exception
            r8 = r4
            goto L_0x00ab
        L_0x00aa:
            r0 = move-exception
        L_0x00ab:
            X.1da r0 = X.C31141da.A00(r0)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
        L_0x00b1:
            if (r8 == 0) goto L_0x00b6
            r8.disconnect()
        L_0x00b6:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59432xN.A00(int):java.lang.Object");
    }
}
