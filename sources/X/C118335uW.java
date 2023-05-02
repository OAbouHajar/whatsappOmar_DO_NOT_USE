package X;

import org.json.JSONObject;

/* renamed from: X.5uW  reason: invalid class name and case insensitive filesystem */
public class C118335uW {
    public C16440t3 A00;
    public C16980tz A01;
    public C18300wT A02;
    public AnonymousClass1Vo A03 = C110105dW.A0Q("NetworkDeviceIdManager", "infra");
    public JSONObject A04;

    public C118335uW(C16440t3 r3, C16980tz r4, C18300wT r5) {
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|29|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(int r7) {
        /*
            r6 = this;
            r5 = r6
            monitor-enter(r5)
            org.json.JSONObject r1 = r6.A04     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x003a
            X.0wT r0 = r6.A02     // Catch:{ JSONException -> 0x0020 }
            android.content.SharedPreferences r1 = r0.A01()     // Catch:{ JSONException -> 0x0020 }
            java.lang.String r0 = "payments_network_id_map"
            java.lang.String r0 = X.C13700nu.A0E(r1, r0)     // Catch:{ JSONException -> 0x0020 }
            if (r0 == 0) goto L_0x001b
            org.json.JSONObject r1 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x0020 }
        L_0x0018:
            r6.A04 = r1     // Catch:{ JSONException -> 0x0020 }
            goto L_0x003a
        L_0x001b:
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0020 }
            goto L_0x0018
        L_0x0020:
            r3 = move-exception
            X.1Vo r2 = r6.A03     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "JSONObject instantiation "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x00bc }
            r2.A05(r0)     // Catch:{ all -> 0x00bc }
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ all -> 0x00bc }
            r6.A04 = r1     // Catch:{ all -> 0x00bc }
        L_0x003a:
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00bc }
            r0 = 0
            java.lang.String r3 = r1.optString(r4, r0)     // Catch:{ all -> 0x00bc }
            monitor-exit(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0062
            X.1Vo r2 = r6.A03
            java.lang.String r0 = "getNetworkId with CARD "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = ": from cache: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)
            r2.A04(r0)
            return r3
        L_0x0062:
            X.0tz r0 = r6.A01
            android.content.Context r0 = r0.A00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            java.lang.String r0 = X.C110115dX.A0c(r0)
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            byte[] r3 = r0.getBytes()
            r0 = 1
            r2 = 150(0x96, float:2.1E-43)
            r1 = 128(0x80, float:1.794E-43)
            if (r7 == r0) goto L_0x008d
            r0 = 5
            if (r7 == r0) goto L_0x008d
            r3 = 0
        L_0x008b:
            monitor-enter(r5)
            goto L_0x009c
        L_0x008d:
            javax.crypto.SecretKey r0 = X.C004101u.A07(r3, r3, r1, r2)
            byte[] r1 = r0.getEncoded()
            r0 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r1, r0)
            goto L_0x008b
        L_0x009c:
            org.json.JSONObject r0 = r6.A04     // Catch:{ JSONException -> 0x00b3 }
            r0.put(r4, r3)     // Catch:{ JSONException -> 0x00b3 }
            X.0wT r1 = r6.A02     // Catch:{ JSONException -> 0x00b3 }
            org.json.JSONObject r0 = r6.A04     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r2 = r0.toString()     // Catch:{ JSONException -> 0x00b3 }
            android.content.SharedPreferences$Editor r1 = X.C110105dW.A06(r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "payments_network_id_map"
            X.C13680ns.A0y(r1, r0, r2)     // Catch:{ JSONException -> 0x00b3 }
            goto L_0x00ba
        L_0x00b3:
            X.1Vo r1 = r6.A03     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "setDeviceId :: failed"
            r1.A05(r0)     // Catch:{ all -> 0x00bc }
        L_0x00ba:
            monitor-exit(r5)
            return r3
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118335uW.A00(int):java.lang.String");
    }
}
