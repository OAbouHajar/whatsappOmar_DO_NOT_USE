package X;

/* renamed from: X.5um  reason: invalid class name and case insensitive filesystem */
public class C118495um {
    public final C16980tz A00;
    public final C117245sg A01;
    public final C116645ri A02;
    public final AnonymousClass5wK A03 = new AnonymousClass5wK();
    public final C117255sh A04;
    public final C117355sr A05;
    public final C116675rl A06;
    public final AnonymousClass5xG A07;
    public final C118915vc A08;

    public C118495um(C16980tz r2, C117245sg r3, C116645ri r4, C117255sh r5, C117355sr r6, C116675rl r7, AnonymousClass5xG r8, C118915vc r9) {
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r6;
        this.A01 = r3;
        this.A04 = r5;
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r8;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|23|24|25|26|(1:28)) */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03ea, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        com.whatsapp.util.Log.w("PAY: DefaultTrustTokenBuilder/signWith", r1);
        r0 = new X.C115055p2(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0415, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0416, code lost:
        com.whatsapp.util.Log.e("PAY: MFAFactors/registerTD/", r1);
        r2.AQY(new X.AnonymousClass5wP(6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0424, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.whatsapp.util.Log.e("PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03e3 A[Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7, UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5, 5oz | NoSuchAlgorithmException -> 0x03ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03ea A[ExcHandler: 5oz | NoSuchAlgorithmException (r1v15 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:93:0x0233] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0415 A[ExcHandler: 5p2 | NoSuchAlgorithmException | JSONException (r1v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:76:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[Catch:{ KeyStoreException -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c1 A[Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }, LOOP:0: B:78:0x01bb->B:80:0x01c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d7 A[Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0210 A[Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x022d A[Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0246 A[Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7, UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5, 5oz | NoSuchAlgorithmException -> 0x03ea }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass694 r23, boolean r24) {
        /*
            r22 = this;
            r6 = r22
            X.5rl r3 = r6.A06
            r4 = 0
            r2 = r23
            X.0wT r0 = r3.A00     // Catch:{ JSONException -> 0x002f }
            java.lang.String r1 = r0.A04()     // Catch:{ JSONException -> 0x002f }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x002f }
            if (r0 != 0) goto L_0x0035
            org.json.JSONObject r1 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x002f }
            java.lang.String r0 = "td"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x002f }
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "td_is_committed"
            boolean r0 = r1.optBoolean(r0, r4)     // Catch:{ JSONException -> 0x002f }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = X.C13690nt.A0Y()
            r2.AWP(r0)
            return
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore isCommitted failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0035:
            if (r24 == 0) goto L_0x00d8
            X.5wK r0 = r3.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            java.lang.String r7 = "alias-payments-br-trusted-device-key"
            X.67J r0 = r0.A00     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            java.lang.Object r0 = r0.get()     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            X.5u1 r0 = (X.C118075u1) r0     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            if (r0 == 0) goto L_0x007f
            r5 = 0
            java.security.KeyStore r4 = r0.A01     // Catch:{ Exception -> 0x007a }
            java.security.cert.Certificate r1 = r4.getCertificate(r7)     // Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x007f
            boolean r0 = r1 instanceof java.security.cert.X509Certificate     // Catch:{ Exception -> 0x007a }
            if (r0 == 0) goto L_0x0069
            r0 = r1
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ Exception -> 0x007a }
            r0.checkValidity()     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0059 }
            goto L_0x0069
        L_0x0059:
            boolean r0 = r4.containsAlias(r7)     // Catch:{ KeyStoreException -> 0x0063 }
            if (r0 == 0) goto L_0x007f
            r4.deleteEntry(r7)     // Catch:{ KeyStoreException -> 0x0063 }
            goto L_0x007f
        L_0x0063:
            java.lang.String r0 = "PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x007f
        L_0x0069:
            java.security.PublicKey r1 = r1.getPublicKey()     // Catch:{ Exception -> 0x007a }
            java.security.Key r0 = r4.getKey(r7, r5)     // Catch:{ Exception -> 0x007a }
            java.security.PrivateKey r0 = (java.security.PrivateKey) r0     // Catch:{ Exception -> 0x007a }
            java.security.KeyPair r8 = new java.security.KeyPair     // Catch:{ Exception -> 0x007a }
            r8.<init>(r1, r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x0144
        L_0x007a:
            java.lang.String r0 = "PAY: Secp256r1KeyStoreHelper/retrieveKeyPair failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
        L_0x007f:
            X.0wT r0 = r3.A00     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r1 = r0.A04()     // Catch:{ JSONException -> 0x00d2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00d2 }
            if (r0 != 0) goto L_0x00d8
            org.json.JSONObject r1 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r0 = "td"
            org.json.JSONObject r5 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x00d2 }
            if (r5 == 0) goto L_0x00d8
            java.lang.String r0 = "td_public_key_bytes"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ JSONException -> 0x00d2 }
            r1 = 11
            byte[] r4 = android.util.Base64.decode(r0, r1)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r0 = "td_private_key_bytes"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ JSONException -> 0x00d2 }
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r5 = "PAY: TrustedDeviceKeyStore recreateKeyPair failed"
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch:{ JSONException -> 0x00d2 }
            r1.<init>(r4)     // Catch:{ JSONException -> 0x00d2 }
            java.security.spec.PKCS8EncodedKeySpec r4 = new java.security.spec.PKCS8EncodedKeySpec     // Catch:{ JSONException -> 0x00d2 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ JSONException -> 0x00d2 }
            java.security.PublicKey r1 = r0.generatePublic(r1)     // Catch:{ NoSuchAlgorithmException -> 0x00cd }
            java.security.PrivateKey r0 = r0.generatePrivate(r4)     // Catch:{ NoSuchAlgorithmException -> 0x00cd }
            java.security.KeyPair r8 = new java.security.KeyPair     // Catch:{ NoSuchAlgorithmException -> 0x00cd }
            r8.<init>(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x00cd }
            goto L_0x0144
        L_0x00cd:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)     // Catch:{ JSONException -> 0x00d2 }
            goto L_0x00d8
        L_0x00d2:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore retrieveKeyPair failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
        L_0x00d8:
            X.5wK r0 = r3.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            X.01Q r0 = r0.A01()     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            java.lang.Object r8 = r0.A00     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            if (r8 == 0) goto L_0x040a
            java.lang.Object r0 = r0.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            if (r0 != 0) goto L_0x013e
            r10 = r8
            java.security.KeyPair r10 = (java.security.KeyPair) r10     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            java.lang.String r9 = "td"
            X.0wT r7 = r3.A00     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = r7.A04()     // Catch:{ JSONException -> 0x0137 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0137 }
            if (r0 != 0) goto L_0x013e
            org.json.JSONObject r5 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x0137 }
            org.json.JSONObject r4 = r5.optJSONObject(r9)     // Catch:{ JSONException -> 0x0137 }
            if (r4 != 0) goto L_0x010c
            org.json.JSONObject r4 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0137 }
        L_0x010c:
            java.lang.String r1 = "td_public_key_bytes"
            java.security.PublicKey r0 = r10.getPublic()     // Catch:{ JSONException -> 0x0137 }
            byte[] r0 = r0.getEncoded()     // Catch:{ JSONException -> 0x0137 }
            r3 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x0137 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = "td_private_key_bytes"
            java.security.PrivateKey r0 = r10.getPrivate()     // Catch:{ JSONException -> 0x0137 }
            byte[] r0 = r0.getEncoded()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x0137 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0137 }
            r5.put(r9, r4)     // Catch:{ JSONException -> 0x0137 }
            X.C110105dW.A1J(r7, r5)     // Catch:{ JSONException -> 0x0137 }
            goto L_0x013e
        L_0x0137:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore store failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            throw r1     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
        L_0x013e:
            java.security.KeyPair r8 = (java.security.KeyPair) r8     // Catch:{ InvalidAlgorithmParameterException -> 0x0402 }
            if (r8 != 0) goto L_0x0144
            goto L_0x040a
        L_0x0144:
            X.5sg r7 = r6.A01     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0tz r0 = r6.A00     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            android.content.Context r10 = r0.A00     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            byte[] r1 = r0.getEncoded()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r0 = 2
            java.lang.String r4 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r3 = "auth_ticket_type"
            java.lang.String r1 = "TRUSTED_DEVICE"
            X.5rk r0 = new X.5rk     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r0.<init>(r3, r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r9.add(r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r1 = "public_key"
            X.5rk r0 = new X.5rk     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r0.<init>(r1, r4)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r9.add(r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0pt r5 = r7.A00     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0wP r4 = r7.A01     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0wX r1 = r7.A02     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0wU r0 = r7.A03     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.util.List r18 = java.util.Collections.emptyList()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r3 = "CREATE_AUTH_TICKET_BASED_FACTOR"
            java.lang.String r21 = "mfa-create-auth-ticket-based-factor"
            X.5tA r7 = new X.5tA     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r11 = r7
            r12 = r10
            r13 = r5
            r14 = r4
            r15 = r1
            r16 = r0
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.5sr r5 = r6.A05     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            org.json.JSONObject r4 = X.C13700nu.A0J()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r1 = "ver"
            r0 = 1
            r4.put(r1, r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r0 = "op"
            r4.put(r0, r3)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0t3 r1 = r5.A01     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0sK r0 = r5.A00     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r1 = X.C110105dW.A0f(r0, r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r0 = "nonce"
            r4.put(r0, r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            org.json.JSONObject r9 = X.C13700nu.A0J()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            org.json.JSONObject r3 = X.C13700nu.A0J()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.util.List r0 = r7.A05     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
        L_0x01bb:
            boolean r0 = r10.hasNext()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            if (r0 == 0) goto L_0x01cf
            java.lang.Object r0 = r10.next()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.5rk r0 = (X.C116665rk) r0     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r1 = r0.A00     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r0 = r0.A01     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r9.put(r1, r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            goto L_0x01bb
        L_0x01cf:
            java.util.List r1 = r7.A06     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            boolean r0 = r1.isEmpty()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            if (r0 != 0) goto L_0x01f3
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r10.<init>()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
        L_0x01e0:
            boolean r0 = r1.hasNext()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r0 = r1.next()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r10.put(r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            goto L_0x01e0
        L_0x01ee:
            java.lang.String r0 = "caps"
            r9.put(r0, r10)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
        L_0x01f3:
            java.lang.String r1 = "com.obwhatsapp"
            java.lang.String r0 = "app_id"
            r9.put(r0, r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0wR r0 = r5.A03     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r1 = r0.A01()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r0 = "device_id"
            r9.put(r0, r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r0 = "data"
            r4.put(r0, r9)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            int r0 = r3.length()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            if (r0 <= 0) goto L_0x022d
            r1 = 0
            java.lang.String r0 = "server key was never set, its null"
            X.AnonymousClass00B.A07(r1, r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            com.whatsapp.wamsys.JniBridge r1 = r5.A04     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.5wK r0 = r5.A02     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.5ic r9 = new X.5ic     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r9.<init>(r0, r1, r4, r3)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
        L_0x021f:
            r0 = 1
            java.security.PublicKey[] r1 = new java.security.PublicKey[r0]     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r5 = 0
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r1[r5] = r0     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r9.A00(r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            goto L_0x0233
        L_0x022d:
            X.5ib r9 = new X.5ib     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r9.<init>(r4)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            goto L_0x021f
        L_0x0233:
            java.util.List r1 = r9.A00     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            X.AnonymousClass00B.A06(r1)     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            java.lang.String r0 = X.C119065vr.A01(r0)     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            boolean r0 = r1.contains(r0)     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            if (r0 == 0) goto L_0x03e3
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            java.lang.String r12 = r9.A01()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            X.AnonymousClass00B.A06(r12)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            java.lang.String r11 = "alg"
            java.lang.String r10 = "ES256"
            r1.put(r11, r10)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            java.lang.String r0 = X.C119065vr.A01(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            java.lang.String r4 = "kid"
            java.lang.String r0 = X.C110115dX.A0f(r0, r4, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            java.lang.String r3 = X.C119065vr.A00(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            java.lang.String r1 = "."
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            X.C13690nt.A1L(r3, r12, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            java.lang.String r1 = android.text.TextUtils.join(r1, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            byte[] r3 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d7 }
            java.lang.String r0 = "SHA256withECDSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r0)     // Catch:{ Exception -> 0x03d1, 5oz | NoSuchAlgorithmException -> 0x03ea }
            java.security.PrivateKey r0 = r8.getPrivate()     // Catch:{ Exception -> 0x03d1, 5oz | NoSuchAlgorithmException -> 0x03ea }
            r1.initSign(r0)     // Catch:{ Exception -> 0x03d1, 5oz | NoSuchAlgorithmException -> 0x03ea }
            r1.update(r3)     // Catch:{ Exception -> 0x03d1, 5oz | NoSuchAlgorithmException -> 0x03ea }
            byte[] r14 = r1.sign()     // Catch:{ Exception -> 0x03d1, 5oz | NoSuchAlgorithmException -> 0x03ea }
            if (r14 == 0) goto L_0x03d1
            java.security.PublicKey r20 = r8.getPublic()     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            java.util.List r1 = r9.A00     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            java.lang.String r0 = X.C119065vr.A01(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            boolean r0 = r1.contains(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            if (r0 == 0) goto L_0x03be
            int r0 = r14.length     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            java.lang.String r1 = "Invalid ECDSA signature format"
            r3 = 8
            if (r0 < r3) goto L_0x03b8
            byte r8 = r14[r5]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r3 = 48
            if (r8 != r3) goto L_0x03b8
            r3 = 1
            byte r12 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r3 = 2
            if (r12 <= 0) goto L_0x02bb
            r19 = 2
            goto L_0x02c1
        L_0x02bb:
            r8 = -127(0xffffffffffffff81, float:NaN)
            if (r12 != r8) goto L_0x03b2
            r19 = 3
        L_0x02c1:
            int r8 = r19 + 1
            byte r18 = r14[r8]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r13 = r18
        L_0x02c7:
            if (r13 <= 0) goto L_0x02d5
            int r8 = r19 + 2
            int r8 = r8 + r18
            int r8 = r8 - r13
            byte r8 = r14[r8]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            if (r8 != 0) goto L_0x02d5
            int r13 = r13 + -1
            goto L_0x02c7
        L_0x02d5:
            int r17 = r19 + 2
            int r17 = r17 + r18
            int r8 = r17 + 1
            byte r16 = r14[r8]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r12 = r16
        L_0x02df:
            if (r12 <= 0) goto L_0x02ed
            int r8 = r17 + 2
            int r8 = r8 + r16
            int r8 = r8 - r12
            byte r8 = r14[r8]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            if (r8 != 0) goto L_0x02ed
            int r12 = r12 + -1
            goto L_0x02df
        L_0x02ed:
            int r15 = java.lang.Math.max(r13, r12)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r8 = 32
            int r8 = java.lang.Math.max(r15, r8)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            int r15 = r19 + -1
            byte r15 = r14[r15]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r19
            if (r15 != r0) goto L_0x03ac
            int r0 = r18 + 2
            int r0 = r0 + 2
            int r0 = r0 + r16
            if (r15 != r0) goto L_0x03ac
            byte r0 = r14[r19]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            if (r0 != r3) goto L_0x03ac
            byte r0 = r14[r17]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            if (r0 != r3) goto L_0x03ac
            int r3 = r8 << 1
            byte[] r1 = new byte[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            int r0 = r17 - r13
            int r8 = r8 - r13
            java.lang.System.arraycopy(r14, r0, r1, r8, r13)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            int r0 = r17 + 2
            int r0 = r0 + r16
            int r0 = r0 - r12
            int r3 = r3 - r12
            java.lang.System.arraycopy(r14, r0, r1, r3, r12)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            org.json.JSONObject r8 = X.C13700nu.A0J()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            java.lang.String r0 = "signature"
            r8.put(r0, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            java.lang.String r3 = "protected"
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r1.put(r11, r10)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            java.lang.String r0 = X.C119065vr.A01(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            java.lang.String r0 = X.C110115dX.A0f(r0, r4, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            java.lang.String r0 = X.C119065vr.A00(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r8.put(r3, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            org.json.JSONArray r4 = r9.A01     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r4.put(r8)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            java.lang.String r3 = r9.A01()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f6 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f6 }
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f6 }
            java.lang.String r0 = "payload"
            r1.put(r0, r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f6 }
            java.lang.String r0 = "signatures"
            java.lang.String r0 = X.C110115dX.A0f(r4, r0, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f6 }
            java.lang.String r3 = X.C119065vr.A00(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f6 }
            java.lang.String r1 = "trust-token"
            r0 = 0
            X.1Vv r4 = new X.1Vv     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r4.<init>((java.lang.String) r1, (java.lang.String) r3, (X.C35081lL[]) r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.5rj r8 = new X.5rj     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r8.<init>(r2, r6)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0wU r6 = r7.A04     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r1 = "action"
            r0 = r21
            X.C110105dW.A1P(r1, r0, r3)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.1lL[] r3 = X.C110115dX.A1F(r3, r5)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r0 = 1
            X.1Vv[] r1 = new X.C28371Vv[r0]     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r1[r5] = r4     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r0 = "account"
            X.1Vv r5 = new X.1Vv     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r5.<init>((java.lang.String) r0, (X.C35081lL[]) r3, (X.C28371Vv[]) r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            android.content.Context r4 = r7.A00     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0pt r3 = r7.A01     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.0wX r0 = r7.A03     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r15 = 1
            com.obwhatsapp.payments.IDxRCallbackShape19S0200000_3_I0 r1 = new com.obwhatsapp.payments.IDxRCallbackShape19S0200000_3_I0     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r9 = r1
            r10 = r4
            r11 = r0
            r12 = r3
            r13 = r7
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            java.lang.String r0 = "set"
            r6.A0F(r1, r5, r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            return
        L_0x03ac:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            throw r0     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
        L_0x03b2:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            throw r0     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
        L_0x03b8:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            throw r0     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
        L_0x03be:
            java.lang.String r0 = "cannot sign with public key that has not been declared"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
            throw r0     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c5 }
        L_0x03c5:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/addSignature"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            X.5p2 r0 = new X.5p2     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            r0.<init>(r1)     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            throw r0     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
        L_0x03d1:
            X.5oz r0 = new X.5oz     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            r0.<init>()     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            throw r0     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
        L_0x03d7:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/constructInputForSigning"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            X.5p2 r0 = new X.5p2     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            r0.<init>(r1)     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            throw r0     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
        L_0x03e3:
            java.lang.String r0 = "cannot sign with public key that has not been declared"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
            throw r0     // Catch:{ 5oz | NoSuchAlgorithmException -> 0x03ea }
        L_0x03ea:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/signWith"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.5p2 r0 = new X.5p2     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r0.<init>(r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            goto L_0x0401
        L_0x03f6:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/build"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            X.5p2 r0 = new X.5p2     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r0.<init>(r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
        L_0x0401:
            throw r0     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
        L_0x0402:
            r0 = 8
            X.5wP r1 = new X.5wP     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r1.<init>((int) r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            goto L_0x0411
        L_0x040a:
            r0 = 8
            X.5wP r1 = new X.5wP     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            r1.<init>((int) r0)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
        L_0x0411:
            r2.AQY(r1)     // Catch:{ 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415, 5p2 | NoSuchAlgorithmException | JSONException -> 0x0415 }
            return
        L_0x0415:
            r1 = move-exception
            java.lang.String r0 = "PAY: MFAFactors/registerTD/"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 6
            X.5wP r0 = new X.5wP
            r0.<init>((int) r1)
            r2.AQY(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118495um.A00(X.694, boolean):void");
    }
}
