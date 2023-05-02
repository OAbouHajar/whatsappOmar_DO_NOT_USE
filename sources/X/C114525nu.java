package X;

/* renamed from: X.5nu  reason: invalid class name and case insensitive filesystem */
public abstract class C114525nu extends C16690tT {
    public final C18260wP A00;
    public final C18300wT A01;
    public final C18310wU A02;
    public final C116325rC A03;
    public final AnonymousClass0y5 A04;

    public C114525nu(C18260wP r1, C18300wT r2, C18310wU r3, C116325rC r4, AnonymousClass0y5 r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x020e, code lost:
        if (r5 == null) goto L_0x0213;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc A[Catch:{ IOException -> 0x01df, all -> 0x01f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d0 A[SYNTHETIC, Splitter:B:55:0x01d0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r12) {
        /*
            r11 = this;
            X.2HJ r4 = X.C110115dX.A0N()
            X.0wP r0 = r11.A00
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0019
            r2 = 0
            r0 = 6
            X.2HJ r1 = new X.2HJ
            r1.<init>((int) r0)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            return r0
        L_0x0019:
            r3 = r11
            boolean r0 = r11 instanceof X.C112115hy
            if (r0 == 0) goto L_0x0086
            X.5hy r3 = (X.C112115hy) r3
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = r3.A0A
        L_0x0026:
            java.lang.String r0 = "bank_account_number"
        L_0x0028:
            X.C13680ns.A1W(r0, r1, r2)
        L_0x002b:
            X.0wT r0 = r11.A01
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "payments_sandbox"
            boolean r0 = X.C110115dX.A17(r1, r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r3 = "payment_dev_cycle"
            java.lang.String r1 = "dev"
            X.01Q r0 = new X.01Q
            r0.<init>(r3, r1)
            r2.add(r0)
        L_0x0045:
            X.0wU r6 = r11.A02
            X.AnonymousClass00B.A06(r2)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()
            java.util.Iterator r3 = r2.iterator()
        L_0x0052:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r1 = r3.next()
            X.01Q r1 = (X.AnonymousClass01Q) r1
            java.lang.Object r0 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.String r0 = "="
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.Object r1 = r1.A01     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.String r0 = "&"
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            goto L_0x0052
        L_0x007d:
            r2 = move-exception
            X.1Vo r1 = r6.A0I
            java.lang.String r0 = "httpRequestFBToken threw while encoding query: "
            r1.A0A(r0, r2)
            goto L_0x0052
        L_0x0086:
            boolean r0 = r11 instanceof X.C112125hz
            if (r0 == 0) goto L_0x00ab
            X.5hz r3 = (X.C112125hz) r3
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = r3.A0F
            java.lang.String r0 = "BANK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            java.lang.String r1 = r3.A09
            goto L_0x0026
        L_0x009d:
            java.lang.String r0 = "PREPAID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r3.A0D
            java.lang.String r0 = "creditCardNumber"
            goto L_0x0028
        L_0x00ab:
            boolean r0 = r11 instanceof X.C112135i0
            if (r0 == 0) goto L_0x00c2
            X.5i0 r3 = (X.C112135i0) r3
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = r3.A0I
            java.lang.String r0 = "creditCardNumber"
            X.C13680ns.A1W(r0, r1, r2)
            java.lang.String r1 = r3.A0J
            java.lang.String r0 = "csc"
            goto L_0x0028
        L_0x00c2:
            X.5hx r3 = (X.C112105hx) r3
            java.util.List r2 = r3.A03
            goto L_0x002b
        L_0x00c8:
            java.lang.String r2 = r5.toString()
            r3 = 0
            java.lang.String r1 = "https://secure.facebook.com/payments/generate_token"
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01fc }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x01fc }
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ IOException -> 0x01df, all -> 0x01f5 }
            boolean r0 = r5 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x01df, all -> 0x01f5 }
            if (r0 == 0) goto L_0x01d0
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ IOException -> 0x01df, all -> 0x01f5 }
            java.lang.String r0 = "POST"
            r5.setRequestMethod(r0)     // Catch:{ IOException -> 0x01ce }
            X.0vS r0 = r6.A0O     // Catch:{ IOException -> 0x01ce }
            X.1aa r0 = r0.A00()     // Catch:{ IOException -> 0x01ce }
            r5.setSSLSocketFactory(r0)     // Catch:{ IOException -> 0x01ce }
            r0 = 15000(0x3a98, float:2.102E-41)
            r5.setConnectTimeout(r0)     // Catch:{ IOException -> 0x01ce }
            r0 = 30000(0x7530, float:4.2039E-41)
            r5.setReadTimeout(r0)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r1 = "Content-Length"
            int r0 = r2.length()     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x01ce }
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "application/x-www-form-urlencoded"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = "curl/7.49.1"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x01ce }
            r0 = 1
            r5.setDoInput(r0)     // Catch:{ IOException -> 0x01ce }
            r5.setDoOutput(r0)     // Catch:{ IOException -> 0x01ce }
            r5.connect()     // Catch:{ IOException -> 0x01ce }
            X.0ua r10 = r6.A03     // Catch:{ IOException -> 0x01ce }
            r0 = 14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01ce }
            java.io.OutputStream r0 = r5.getOutputStream()     // Catch:{ IOException -> 0x01ce }
            X.1pm r1 = new X.1pm     // Catch:{ IOException -> 0x01ce }
            r1.<init>(r10, r0, r3, r9)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r7 = X.AnonymousClass01S.A08     // Catch:{ IOException -> 0x01ce }
            byte[] r0 = r2.getBytes(r7)     // Catch:{ IOException -> 0x01ce }
            r1.write(r0)     // Catch:{ IOException -> 0x01ce }
            r1.flush()     // Catch:{ IOException -> 0x01ce }
            X.1Vo r2 = r6.A0I     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = "httpRequestFBToken connecting to URL: https://secure.facebook.com/payments/generate_token"
            r2.A06(r0)     // Catch:{ IOException -> 0x01ce }
            int r8 = r5.getResponseCode()     // Catch:{ IOException -> 0x01ce }
            r0 = 200(0xc8, float:2.8E-43)
            if (r8 != r0) goto L_0x019f
            java.io.InputStream r0 = r5.getInputStream()     // Catch:{ IOException -> 0x01ce }
            X.1qW r1 = new X.1qW     // Catch:{ IOException -> 0x01ce }
            r1.<init>(r10, r0, r3, r9)     // Catch:{ IOException -> 0x01ce }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x01ce }
            r0.<init>(r1, r7)     // Catch:{ IOException -> 0x01ce }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01ce }
            r7.<init>(r0)     // Catch:{ IOException -> 0x01ce }
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01ce }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = r7.readLine()     // Catch:{ IOException -> 0x01ce }
        L_0x016c:
            if (r0 == 0) goto L_0x0176
            r1.append(r0)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = r7.readLine()     // Catch:{ IOException -> 0x01ce }
            goto L_0x016c
        L_0x0176:
            java.lang.String r7 = r1.toString()     // Catch:{ IOException -> 0x01ce }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = "httpRequestFBToken got response code: "
            r1.append(r0)     // Catch:{ IOException -> 0x01ce }
            r1.append(r8)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = " response: "
            r1.append(r0)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r1)     // Catch:{ IOException -> 0x01ce }
            r2.A04(r0)     // Catch:{ IOException -> 0x01ce }
            org.json.JSONObject r1 = X.C13700nu.A0K(r7)     // Catch:{ JSONException -> 0x019d }
            java.lang.String r0 = "token"
            java.lang.String r3 = r1.optString(r0, r3)     // Catch:{ JSONException -> 0x019d }
            goto L_0x0210
        L_0x019d:
            r1 = move-exception
            goto L_0x01bf
        L_0x019f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = "httpRequestFBToken got unsuccessful http response code while getting token: "
            r1.append(r0)     // Catch:{ IOException -> 0x01ce }
            r1.append(r8)     // Catch:{ IOException -> 0x01ce }
            X.C110105dW.A1L(r2, r1)     // Catch:{ IOException -> 0x01ce }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = "Unsuccessful HTTP response code"
            r1.append(r0)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r1 = X.AnonymousClass000.A0l(r1, r8)     // Catch:{ IOException -> 0x01ce }
            r0 = 2
            r4.A00 = r0     // Catch:{ IOException -> 0x01ce }
            goto L_0x01cb
        L_0x01bf:
            java.lang.String r0 = "httpRequestFBToken threw json exception in response: "
            r2.A0A(r0, r1)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x01ce }
            r0 = 2
            r4.A00 = r0     // Catch:{ IOException -> 0x01ce }
        L_0x01cb:
            r4.A08 = r1     // Catch:{ IOException -> 0x01ce }
            goto L_0x0210
        L_0x01ce:
            r2 = move-exception
            goto L_0x01e1
        L_0x01d0:
            X.1Vo r1 = r6.A0I     // Catch:{ IOException -> 0x01df, all -> 0x01f5 }
            java.lang.String r0 = "httpRequestFBToken failed to connect with a https connection: https://secure.facebook.com/payments/generate_token"
            r1.A06(r0)     // Catch:{ IOException -> 0x01df, all -> 0x01f5 }
            java.lang.String r1 = ""
            r0 = 4
            r4.A00 = r0     // Catch:{ IOException -> 0x01df, all -> 0x01f5 }
            r4.A08 = r1     // Catch:{ IOException -> 0x01df, all -> 0x01f5 }
            goto L_0x0213
        L_0x01df:
            r2 = move-exception
            r5 = r3
        L_0x01e1:
            X.1Vo r1 = r6.A0I     // Catch:{ all -> 0x01f2 }
            java.lang.String r0 = "httpRequestFBToken connection response threw: "
            r1.A0A(r0, r2)     // Catch:{ all -> 0x01f2 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01f2 }
            r0 = 2
            r4.A00 = r0     // Catch:{ all -> 0x01f2 }
            r4.A08 = r1     // Catch:{ all -> 0x01f2 }
            goto L_0x020e
        L_0x01f2:
            r0 = move-exception
            r3 = r5
            goto L_0x01f6
        L_0x01f5:
            r0 = move-exception
        L_0x01f6:
            if (r3 == 0) goto L_0x01fb
            r3.disconnect()
        L_0x01fb:
            throw r0
        L_0x01fc:
            r2 = move-exception
            X.1Vo r1 = r6.A0I
            java.lang.String r0 = "httpRequestFBToken threw while building url "
            r1.A0A(r0, r2)
            java.lang.String r1 = r2.toString()
            r0 = 3
            r4.A00 = r0
            r4.A08 = r1
            goto L_0x0213
        L_0x020e:
            if (r5 == 0) goto L_0x0213
        L_0x0210:
            r5.disconnect()
        L_0x0213:
            X.01Q r0 = new X.01Q
            r0.<init>(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114525nu.A08(java.lang.Object[]):java.lang.Object");
    }
}
