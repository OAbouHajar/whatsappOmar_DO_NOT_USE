package X;

/* renamed from: X.0zs  reason: invalid class name and case insensitive filesystem */
public class C20330zs {
    public final C14710pd A00;
    public final C17680vT A01;
    public final C17670vS A02;
    public final C17660vR A03;

    public C20330zs(C14710pd r1, C17680vT r2, C17670vS r3, C17660vR r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [X.1ae] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00f2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37801pl A00(X.C29561ap r15, java.net.URL r16, long r17, long r19) {
        /*
            r14 = this;
            X.0pd r1 = r14.A00
            r0 = 72
            X.0tM r3 = X.C16620tM.A02
            boolean r13 = r1.A0E(r3, r0)
            X.0vS r5 = r14.A02
            X.0vR r0 = r14.A03
            java.lang.String r4 = r0.A00()
            X.0vT r1 = r14.A01
            boolean r2 = r1.A01()
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0022
            r1 = 0
        L_0x001f:
            java.lang.String r11 = "-"
            goto L_0x002b
        L_0x0022:
            X.0pd r1 = r1.A03
            r0 = 58
            boolean r1 = r1.A0E(r3, r0)
            goto L_0x001f
        L_0x002b:
            r0 = 0
            java.net.URLConnection r3 = r16.openConnection()     // Catch:{ IOException -> 0x0170 }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ IOException -> 0x0170 }
            r12 = 0
            if (r2 == 0) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            X.1ad r8 = r5.A02()
            goto L_0x004f
        L_0x003b:
            X.1ae r8 = r5.A01(r0)
            if (r1 == 0) goto L_0x004f
            java.lang.String r2 = r15.A06
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()
            X.1q6 r0 = new X.1q6
            r0.<init>(r2, r1)
            r3.setHostnameVerifier(r0)
        L_0x004f:
            int r5 = r8.AAm()
            r3.setSSLSocketFactory(r8)
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)
            java.lang.String r0 = "User-Agent"
            r3.setRequestProperty(r0, r4)
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r3.setRequestProperty(r1, r0)
            java.lang.String r1 = r15.A06
            java.lang.String r0 = "Host"
            r3.setRequestProperty(r0, r1)
            r1 = 0
            r9 = -1
            r6 = r17
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            r1 = r19
            if (r0 != 0) goto L_0x0083
            int r0 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00ac
        L_0x0083:
            java.lang.String r4 = "bytes="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r6)
            r0.append(r11)
            java.lang.String r4 = r0.toString()
            int r0 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
        L_0x00a7:
            java.lang.String r0 = "Range"
            r3.setRequestProperty(r0, r4)
        L_0x00ac:
            if (r13 == 0) goto L_0x00b5
            java.lang.String r1 = "X-FB-Socket-Option"
            java.lang.String r0 = "TCP_CONGESTION=bbr"
            r3.setRequestProperty(r1, r0)
        L_0x00b5:
            int r4 = r3.getResponseCode()     // Catch:{ IllegalArgumentException -> 0x0167, IOException -> 0x0159 }
            int r0 = r8.AAm()
            if (r0 != r5) goto L_0x00c0
            r12 = 1
        L_0x00c0:
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 == r0) goto L_0x0136
            r0 = 206(0xce, float:2.89E-43)
            if (r4 == r0) goto L_0x0136
            r2 = 0
            java.io.InputStream r0 = r3.getErrorStream()
            if (r0 == 0) goto L_0x00f9
            java.io.InputStream r6 = r3.getErrorStream()     // Catch:{ IOException -> 0x00f3 }
            r0 = 1024(0x400, double:5.06E-321)
            X.1q7 r5 = new X.1q7     // Catch:{ all -> 0x00ec }
            r5.<init>(r6, r0)     // Catch:{ all -> 0x00ec }
            java.lang.String r2 = X.C30311c8.A00(r5)     // Catch:{ all -> 0x00e7 }
            r5.close()     // Catch:{ all -> 0x00ec }
            if (r6 == 0) goto L_0x00f9
            r6.close()     // Catch:{ IOException -> 0x00f3 }
            goto L_0x00f9
        L_0x00e7:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            throw r0     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            if (r6 == 0) goto L_0x00f2
            r6.close()     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            throw r0     // Catch:{ IOException -> 0x00f3 }
        L_0x00f3:
            r1 = move-exception
            java.lang.String r0 = "MediaDownloadConnection/download/can't get string from error stream"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00f9:
            java.lang.String r0 = "MediaDownloadConnection/download failed; url="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.C38031q8.A00(r16)
            r1.append(r0)
            java.lang.String r0 = " responseCode="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " responseBody="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 416(0x1a0, float:5.83E-43)
            if (r4 != r0) goto L_0x0153
            java.lang.String r0 = "Content-Range"
            java.lang.String r1 = r3.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = "*/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x014d
        L_0x0136:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            java.lang.Object r2 = r0.first
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            java.lang.Object r1 = r0.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            X.1pk r0 = new X.1pk
            r0.<init>(r1, r2)
            return r0
        L_0x014d:
            X.1q9 r0 = new X.1q9
            r0.<init>(r4, r2)
            throw r0
        L_0x0153:
            X.1q9 r0 = new X.1q9
            r0.<init>(r4, r2)
            throw r0
        L_0x0159:
            r2 = move-exception
            java.lang.String r0 = "MediaDownloadConnection/exception while getting response code"
            com.whatsapp.util.Log.w(r0, r2)
            java.lang.String r1 = "failed with IOException while retrieving response"
            X.1qB r0 = new X.1qB
            r0.<init>(r1, r2)
            throw r0
        L_0x0167:
            r2 = move-exception
            java.lang.String r1 = "failed with IllegalArgumentException while retrieving response"
            X.1qB r0 = new X.1qB
            r0.<init>(r1, r2)
            throw r0
        L_0x0170:
            r2 = move-exception
            java.lang.String r1 = "failed to open http url connection"
            X.1qB r0 = new X.1qB
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20330zs.A00(X.1ap, java.net.URL, long, long):X.1pl");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [X.1ae] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C37801pl A01(java.lang.String r7, java.lang.String r8, java.net.URL r9) {
        /*
            r6 = this;
            r4 = 0
            java.net.URLConnection r3 = r9.openConnection()
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3
            X.0vT r2 = r6.A01
            boolean r1 = r2.A01()
            r5 = 0
            X.0vS r0 = r6.A02
            if (r1 == 0) goto L_0x0059
            X.1ae r4 = r0.A01(r4)
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0034
            X.0pd r2 = r2.A03
            r1 = 58
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0034
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()
            X.1q6 r0 = new X.1q6
            r0.<init>(r7, r1)
            r3.setHostnameVerifier(r0)
        L_0x0034:
            int r2 = r4.AAm()
            r3.setSSLSocketFactory(r4)
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)
            r3.setRequestMethod(r8)
            java.lang.String r0 = "Host"
            r3.setRequestProperty(r0, r7)
            X.0vR r0 = r6.A03
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "User-Agent"
            r3.setRequestProperty(r0, r1)
            goto L_0x005e
        L_0x0059:
            X.1ad r4 = r0.A02()
            goto L_0x0034
        L_0x005e:
            r3.connect()     // Catch:{ IllegalArgumentException -> 0x0072 }
            int r0 = r4.AAm()
            if (r0 != r2) goto L_0x0068
            r5 = 1
        L_0x0068:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            X.1pk r0 = new X.1pk
            r0.<init>(r1, r3)
            return r0
        L_0x0072:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20330zs.A01(java.lang.String, java.lang.String, java.net.URL):X.1pl");
    }
}
