package X;

import java.util.Map;

/* renamed from: X.2xO  reason: invalid class name and case insensitive filesystem */
public class C59442xO extends C70943iB {
    public final /* synthetic */ AnonymousClass3BK A00;
    public final /* synthetic */ Map A01;

    public C59442xO(AnonymousClass3BK r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0088 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0126 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x012d */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A00(int r16) {
        /*
            r15 = this;
            X.3BK r1 = r15.A00
            java.util.Map r7 = r15.A01
            java.lang.String r8 = "gdrive-api-v2/commit-transaction/failed "
            java.lang.String r2 = "metadata"
            X.2GM r9 = r1.A08
            boolean r0 = r9.A0B()
            if (r0 != 0) goto L_0x0154
            java.lang.String r0 = r1.A02()
            if (r0 == 0) goto L_0x0147
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r13 = 0
            java.lang.String r10 = "POST"
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = "clients/wa/backups/"
            r3.append(r0)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = r1.A0A     // Catch:{ IOException -> 0x0134 }
            r3.append(r0)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = ":commit"
            java.lang.String r11 = X.AnonymousClass000.A0h(r0, r3)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r12 = "application/json; charset=UTF-8"
            r14 = 1
            javax.net.ssl.HttpsURLConnection r3 = r9.A07(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x0134 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            java.lang.String r4 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x0127 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0127 }
            r0.<init>(r5, r4)     // Catch:{ all -> 0x0127 }
            android.util.JsonWriter r6 = new android.util.JsonWriter     // Catch:{ all -> 0x0127 }
            r6.<init>(r0)     // Catch:{ all -> 0x0127 }
            android.util.JsonWriter r4 = r6.beginObject()     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "transactionId"
            android.util.JsonWriter r4 = r4.name(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r1.A02()     // Catch:{ all -> 0x0122 }
            r4.value(r0)     // Catch:{ all -> 0x0122 }
            if (r7 == 0) goto L_0x0097
            java.lang.String r0 = "updateMask"
            android.util.JsonWriter r0 = r6.name(r0)     // Catch:{ all -> 0x0122 }
            android.util.JsonWriter r4 = r0.value(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "backup"
            android.util.JsonWriter r0 = r4.name(r0)     // Catch:{ all -> 0x0122 }
            android.util.JsonWriter r0 = r0.beginObject()     // Catch:{ all -> 0x0122 }
            android.util.JsonWriter r4 = r0.name(r2)     // Catch:{ all -> 0x0122 }
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ all -> 0x0122 }
            r0.<init>()     // Catch:{ all -> 0x0122 }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ all -> 0x0122 }
            r2.<init>(r0)     // Catch:{ all -> 0x0122 }
            X.C62173By.A03(r2, r7)     // Catch:{ all -> 0x0084 }
            goto L_0x0089
        L_0x0084:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0088 }
        L_0x0088:
            throw r0     // Catch:{ all -> 0x0122 }
        L_0x0089:
            r2.close()     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0122 }
            android.util.JsonWriter r0 = r4.value(r0)     // Catch:{ all -> 0x0122 }
            r0.endObject()     // Catch:{ all -> 0x0122 }
        L_0x0097:
            android.util.JsonWriter r0 = r6.endObject()     // Catch:{ all -> 0x0122 }
            r0.flush()     // Catch:{ all -> 0x0122 }
            r6.close()     // Catch:{ all -> 0x0127 }
            if (r5 == 0) goto L_0x00a6
            r5.close()     // Catch:{ IOException -> 0x0131, all -> 0x012e }
        L_0x00a6:
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x00f8
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L_0x00f2
            r0 = 429(0x1ad, float:6.01E-43)
            if (r2 == r0) goto L_0x010e
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L_0x00e1
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L_0x00dd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r8)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r8)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            java.lang.String r0 = X.C30311c8.A01(r3)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            goto L_0x014e
        L_0x00dd:
            r9.A0A()     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            goto L_0x014e
        L_0x00e1:
            java.lang.String r2 = X.C30311c8.A01(r3)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            X.0so r1 = r1.A06     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            java.lang.String r0 = "gdrive-api-v2/backup/commit-transaction"
            r1.AcB(r0, r2, r14)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            X.3iN r0 = new X.3iN     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            goto L_0x0121
        L_0x00f2:
            X.3iQ r0 = new X.3iQ     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            r0.<init>()     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            goto L_0x0121
        L_0x00f8:
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            X.C30311c8.A00(r0)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            r1.A00 = r13     // Catch:{ all -> 0x010b }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = 1
            goto L_0x0155
        L_0x010b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            goto L_0x0121
        L_0x010e:
            X.0pd r2 = r1.A09     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            r1 = 916(0x394, float:1.284E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            boolean r1 = r2.A0E(r0, r1)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            java.lang.String r0 = "commit-transaction"
            X.AnonymousClass3BQ.A01(r0, r3, r1)     // Catch:{ IOException -> 0x0131, all -> 0x012e }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ IOException -> 0x0131, all -> 0x012e }
        L_0x0121:
            throw r0     // Catch:{ IOException -> 0x0131, all -> 0x012e }
        L_0x0122:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0126 }
        L_0x0126:
            throw r0     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r0 = move-exception
            if (r5 == 0) goto L_0x012d
            r5.close()     // Catch:{ all -> 0x012d }
        L_0x012d:
            throw r0     // Catch:{ IOException -> 0x0131, all -> 0x012e }
        L_0x012e:
            r0 = move-exception
            r13 = r3
            goto L_0x013e
        L_0x0131:
            r0 = move-exception
            r13 = r3
            goto L_0x0135
        L_0x0134:
            r0 = move-exception
        L_0x0135:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x013d }
            X.1da r0 = X.C31141da.A00(r0)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
        L_0x013e:
            if (r13 == 0) goto L_0x0143
            r13.disconnect()
        L_0x0143:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0147:
            java.lang.String r0 = "No transaction to commit"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x014e:
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x0154:
            r0 = 0
        L_0x0155:
            if (r0 == 0) goto L_0x015a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x015a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59442xO.A00(int):java.lang.Object");
    }
}
