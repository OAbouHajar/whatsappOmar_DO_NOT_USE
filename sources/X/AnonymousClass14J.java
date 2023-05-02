package X;

/* renamed from: X.14J  reason: invalid class name */
public class AnonymousClass14J {
    public final AnonymousClass14I A00;
    public final C16440t3 A01;
    public final AnonymousClass14C A02;
    public final AnonymousClass01D A03;

    public AnonymousClass14J(AnonymousClass14I r1, C16440t3 r2, AnonymousClass14C r3, AnonymousClass01D r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.AnonymousClass144 r12, X.AnonymousClass2HZ r13, X.AnonymousClass14J r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            X.14I r4 = r14.A00     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            java.lang.String r1 = "CN=WhatsApp WWW Channel"
            r3 = 0
            r2 = 1
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            r0[r3] = r1     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            r1 = r16
            java.security.cert.X509Certificate r7 = r4.A00(r1, r0)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            java.lang.String r1 = "CN=WhatsApp WWW Channel Signature"
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            r0[r3] = r1     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            r1 = r17
            java.security.cert.X509Certificate r8 = r4.A00(r1, r0)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            r5 = 0
            r6 = r18
            if (r18 == 0) goto L_0x0026
            java.security.PublicKey r1 = X.AnonymousClass3BS.A03(r6)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            goto L_0x0027
        L_0x0026:
            r1 = r5
        L_0x0027:
            if (r19 == 0) goto L_0x0031
            int r0 = java.lang.Integer.parseInt(r19)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
        L_0x0031:
            X.14C r2 = r14.A02     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            java.util.Set r0 = r2.A04     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            boolean r0 = r0.contains(r12)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            if (r0 == 0) goto L_0x006c
            if (r15 == 0) goto L_0x0060
            int r9 = r15.intValue()     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            X.0t3 r0 = r14.A01     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            long r10 = r0.A00()     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r3
            monitor-enter(r2)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            java.util.Map r0 = r2.A00()     // Catch:{  }
            X.4aG r4 = new X.4aG     // Catch:{ all -> 0x0068 }
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0068 }
            r0.put(r12, r4)     // Catch:{ all -> 0x0068 }
            r2.A02(r0)     // Catch:{ CertificateException | JSONException -> 0x005b }
            goto L_0x006b
        L_0x005b:
            r0 = move-exception
            X.AnonymousClass00B.A0E(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x006b
        L_0x0060:
            java.lang.String r0 = "cacheable certs should have ttl"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            r1.<init>(r0)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            goto L_0x006a
        L_0x0068:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
        L_0x006a:
            throw r1     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
        L_0x006b:
            monitor-exit(r2)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
        L_0x006c:
            r13.AYK(r5, r1, r7, r8)     // Catch:{ CertificateExpiredException -> 0x0075, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0070 }
            return
        L_0x0070:
            r0 = move-exception
            r13.AQa(r0)
            return
        L_0x0075:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14J.A00(X.144, X.2HZ, X.14J, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.4aG} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.security.PublicKey] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass144 r12, X.AnonymousClass2HZ r13) {
        /*
            r11 = this;
            X.14C r9 = r11.A02
            java.util.Set r0 = r9.A04
            boolean r0 = r0.contains(r12)
            r6 = 0
            if (r0 == 0) goto L_0x0063
            java.util.Map r0 = r9.A00()     // Catch:{ CertificateException | JSONException -> 0x0058 }
            java.lang.Object r7 = r0.get(r12)     // Catch:{ CertificateException | JSONException -> 0x0058 }
            X.4aG r7 = (X.C88294aG) r7     // Catch:{ CertificateException | JSONException -> 0x0058 }
            if (r7 == 0) goto L_0x0062
            java.security.cert.X509Certificate r8 = r7.A04
            int r10 = r7.A00
            long r4 = r7.A01
            X.0t3 r0 = r11.A01
            long r2 = r0.A00()
            java.util.Date r0 = new java.util.Date     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0054 }
            r0.<init>(r2)     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0054 }
            r8.checkValidity(r0)     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0054 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            X.AnonymousClass00B.A06(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            X.AnonymousClass00B.A06(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            int r0 = r10 >> 1
            long r0 = (long) r0
            long r4 = r4 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0054
            java.security.cert.X509Certificate r1 = r7.A05     // Catch:{ GeneralSecurityException -> 0x005e }
            java.lang.String r0 = r7.A03     // Catch:{ GeneralSecurityException -> 0x005e }
            if (r0 == 0) goto L_0x004e
            java.security.PublicKey r6 = X.AnonymousClass3BS.A03(r0)     // Catch:{ GeneralSecurityException -> 0x005e }
        L_0x004e:
            java.lang.Integer r0 = r7.A02     // Catch:{ GeneralSecurityException -> 0x005e }
            r13.AYK(r0, r6, r8, r1)     // Catch:{ GeneralSecurityException -> 0x005e }
            return
        L_0x0054:
            r9.A01(r12)
            goto L_0x0063
        L_0x0058:
            r0 = move-exception
            X.AnonymousClass00B.A0E(r0)
            r7 = 0
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            X.AnonymousClass00B.A0E(r0)
        L_0x0062:
            r6 = r7
        L_0x0063:
            X.01D r0 = r11.A03
            java.lang.Object r0 = r0.get()
            X.14H r0 = (X.AnonymousClass14H) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r12)
            X.AnonymousClass00B.A06(r0)
            X.01J r0 = (X.AnonymousClass01J) r0
            java.lang.Object r1 = r0.get()
            X.14E r1 = (X.AnonymousClass14E) r1
            X.3FZ r0 = new X.3FZ
            r0.<init>(r6, r12, r13, r11)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14J.A01(X.144, X.2HZ):void");
    }
}
