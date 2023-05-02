package X;

import java.util.Date;

/* renamed from: X.5A6  reason: invalid class name */
public class AnonymousClass5A6 implements AnonymousClass5SG {
    public Date A00 = null;
    public C85284Nv A01;
    public final AnonymousClass5NQ A02;

    public AnonymousClass5A6(AnonymousClass5NQ r2) {
        this.A02 = r2;
    }

    public void AIJ(C85284Nv r2) {
        this.A01 = r2;
        this.A00 = new Date();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x018c A[Catch:{ 43k -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017b A[Catch:{ 43k -> 0x01f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void check(java.security.cert.Certificate r31) {
        /*
            r30 = this;
            r11 = r31
            r10 = r30
            X.4Nv r9 = r10.A01     // Catch:{ 43k -> 0x01f8 }
            X.56p r8 = r9.A05     // Catch:{ 43k -> 0x01f8 }
            java.util.Date r0 = r10.A00     // Catch:{ 43k -> 0x01f8 }
            r21 = r0
            java.util.Date r0 = r9.A04     // Catch:{ 43k -> 0x01f8 }
            long r0 = r0.getTime()     // Catch:{ 43k -> 0x01f8 }
            java.util.Date r7 = new java.util.Date     // Catch:{ 43k -> 0x01f8 }
            r7.<init>(r0)     // Catch:{ 43k -> 0x01f8 }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ 43k -> 0x01f8 }
            X.4Nv r1 = r10.A01     // Catch:{ 43k -> 0x01f8 }
            java.security.cert.X509Certificate r0 = r1.A03     // Catch:{ 43k -> 0x01f8 }
            r20 = r0
            java.security.PublicKey r0 = r1.A01     // Catch:{ 43k -> 0x01f8 }
            r18 = r0
            java.security.cert.CertPath r0 = r1.A02     // Catch:{ 43k -> 0x01f8 }
            java.util.List r23 = r0.getCertificates()     // Catch:{ 43k -> 0x01f8 }
            X.5NQ r0 = r10.A02     // Catch:{ 43k -> 0x01f8 }
            r17 = r0
            java.lang.String r0 = X.C32211fp.A04     // Catch:{ Exception -> 0x01e9 }
            X.1fZ r0 = X.C90924f5.A07(r0, r11)     // Catch:{ Exception -> 0x01e9 }
            X.5I6 r16 = X.AnonymousClass5I6.A00(r0)     // Catch:{ Exception -> 0x01e9 }
            X.4aU r14 = new X.4aU     // Catch:{ 43k -> 0x01f8 }
            r14.<init>((X.C1047156p) r8)     // Catch:{ 43k -> 0x01f8 }
            java.util.Map r3 = r8.A06     // Catch:{ 43k -> 0x01e1 }
            if (r16 != 0) goto L_0x0056
            java.util.List r13 = java.util.Collections.EMPTY_LIST     // Catch:{ 43k -> 0x01e1 }
        L_0x0042:
            java.util.Iterator r2 = r13.iterator()     // Catch:{ 43k -> 0x01e1 }
        L_0x0046:
            boolean r0 = r2.hasNext()     // Catch:{ 43k -> 0x01e1 }
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r1 = r2.next()     // Catch:{ 43k -> 0x01e1 }
            java.util.List r0 = r14.A01     // Catch:{ 43k -> 0x01e1 }
            r0.add(r1)     // Catch:{ 43k -> 0x01e1 }
            goto L_0x0046
        L_0x0056:
            X.5IE[] r12 = r16.A03()     // Catch:{ Exception -> 0x01c5 }
            java.util.ArrayList r13 = X.AnonymousClass000.A0u()     // Catch:{ 43k -> 0x01e1 }
            r2 = 0
        L_0x005f:
            int r6 = r12.length     // Catch:{ 43k -> 0x01e1 }
            if (r2 >= r6) goto L_0x008b
            r0 = r12[r2]     // Catch:{ 43k -> 0x01e1 }
            X.5IN r1 = r0.A00     // Catch:{ 43k -> 0x01e1 }
            if (r1 == 0) goto L_0x0088
            int r0 = r1.A00     // Catch:{ 43k -> 0x01e1 }
            if (r0 != 0) goto L_0x0088
            X.1fb r0 = r1.A01     // Catch:{ 43k -> 0x01e1 }
            X.5IG r0 = X.AnonymousClass5IG.A00(r0)     // Catch:{ 43k -> 0x01e1 }
            X.5IP[] r4 = r0.A03()     // Catch:{ 43k -> 0x01e1 }
            r1 = 0
        L_0x0077:
            int r0 = r4.length     // Catch:{ 43k -> 0x01e1 }
            if (r1 >= r0) goto L_0x0088
            r0 = r4[r1]     // Catch:{ 43k -> 0x01e1 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ 43k -> 0x01e1 }
            if (r0 == 0) goto L_0x0085
            r13.add(r0)     // Catch:{ 43k -> 0x01e1 }
        L_0x0085:
            int r1 = r1 + 1
            goto L_0x0077
        L_0x0088:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x008b:
            boolean r0 = r13.isEmpty()     // Catch:{ 43k -> 0x01e1 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "org.spongycastle.x509.enableCRLDP"
            boolean r0 = X.C89714cm.A01(r0)     // Catch:{ 43k -> 0x01e1 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = "X.509"
            r0 = r17
            X.5AA r0 = (X.AnonymousClass5AA) r0     // Catch:{ Exception -> 0x01cd }
            java.security.Provider r0 = r0.A00     // Catch:{ Exception -> 0x01cd }
            java.security.cert.CertificateFactory r15 = java.security.cert.CertificateFactory.getInstance(r1, r0)     // Catch:{ Exception -> 0x01cd }
            r5 = 0
        L_0x00a6:
            if (r5 >= r6) goto L_0x0042
            r0 = r12[r5]     // Catch:{ 43k -> 0x01e1 }
            X.5IN r1 = r0.A00     // Catch:{ 43k -> 0x01e1 }
            if (r1 == 0) goto L_0x00df
            int r0 = r1.A00     // Catch:{ 43k -> 0x01e1 }
            if (r0 != 0) goto L_0x00df
            X.1fb r0 = r1.A01     // Catch:{ 43k -> 0x01e1 }
            X.5IG r0 = X.AnonymousClass5IG.A00(r0)     // Catch:{ 43k -> 0x01e1 }
            X.5IP[] r4 = r0.A03()     // Catch:{ 43k -> 0x01e1 }
            r3 = 0
        L_0x00bd:
            int r0 = r4.length     // Catch:{ 43k -> 0x01e1 }
            if (r3 >= r0) goto L_0x00df
            r2 = r4[r5]     // Catch:{ 43k -> 0x01e1 }
            int r1 = r2.A00     // Catch:{ 43k -> 0x01e1 }
            r0 = 6
            if (r1 != r0) goto L_0x00dc
            X.1fb r0 = r2.A01     // Catch:{ Exception -> 0x00dc }
            X.1hp r0 = (X.C33031hp) r0     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = r0.AGJ()     // Catch:{ Exception -> 0x00dc }
            java.net.URI r0 = new java.net.URI     // Catch:{ Exception -> 0x00dc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00dc }
            X.5AJ r0 = X.C90354e0.A01(r0, r15, r7)     // Catch:{ Exception -> 0x00dc }
            r13.add(r0)     // Catch:{ Exception -> 0x00dc }
            goto L_0x00df
        L_0x00dc:
            int r3 = r3 + 1
            goto L_0x00bd
        L_0x00df:
            int r5 = r5 + 1
            goto L_0x00a6
        L_0x00e2:
            X.4JF r3 = new X.4JF     // Catch:{ 43k -> 0x01f8 }
            r3.<init>()     // Catch:{ 43k -> 0x01f8 }
            r0 = 0
            X.4d4 r2 = new X.4d4     // Catch:{ 43k -> 0x01f8 }
            r2.<init>((int) r0)     // Catch:{ 43k -> 0x01f8 }
            X.56p r6 = new X.56p     // Catch:{ 43k -> 0x01f8 }
            r6.<init>(r14)     // Catch:{ 43k -> 0x01f8 }
            r5 = 0
            r4 = 11
            if (r16 == 0) goto L_0x012f
            X.5IE[] r12 = r16.A03()     // Catch:{ Exception -> 0x0126 }
            r1 = 0
            r14 = 0
        L_0x00fd:
            int r0 = r12.length     // Catch:{ 43k -> 0x01f8 }
            if (r1 >= r0) goto L_0x0130
            int r0 = r3.A00     // Catch:{ 43k -> 0x01f8 }
            if (r0 != r4) goto L_0x0130
            int r13 = r2.A00     // Catch:{ 43k -> 0x01f8 }
            X.4d4 r0 = X.C89864d4.A01     // Catch:{ 43k -> 0x01f8 }
            int r0 = r0.A00     // Catch:{ 43k -> 0x01f8 }
            if (r13 == r0) goto L_0x0130
            r24 = r12[r1]     // Catch:{ 43k -> 0x0120 }
            r22 = r7
            r25 = r9
            r26 = r6
            r27 = r17
            r28 = r3
            r29 = r2
            r19 = r11
            X.C32211fp.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 43k -> 0x0120 }
            goto L_0x0122
        L_0x0120:
            r5 = move-exception
            goto L_0x0123
        L_0x0122:
            r14 = 1
        L_0x0123:
            int r1 = r1 + 1
            goto L_0x00fd
        L_0x0126:
            r1 = move-exception
            java.lang.String r0 = "Distribution points could not be read."
            X.43k r0 = X.C803243k.A00(r0, r1)     // Catch:{ 43k -> 0x01f8 }
            goto L_0x01f7
        L_0x012f:
            r14 = 0
        L_0x0130:
            int r0 = r3.A00     // Catch:{ 43k -> 0x01f8 }
            if (r0 != r4) goto L_0x0172
            int r1 = r2.A00     // Catch:{ 43k -> 0x01f8 }
            X.4d4 r0 = X.C89864d4.A01     // Catch:{ 43k -> 0x01f8 }
            int r0 = r0.A00     // Catch:{ 43k -> 0x01f8 }
            if (r1 == r0) goto L_0x0172
            X.5IQ r5 = X.C90554eM.A02(r11)     // Catch:{ RuntimeException -> 0x0169 }
            r0 = 4
            X.5IP r1 = new X.5IP     // Catch:{ 43k -> 0x0171 }
            r1.<init>(r5, r0)     // Catch:{ 43k -> 0x0171 }
            X.5IG r0 = new X.5IG     // Catch:{ 43k -> 0x0171 }
            r0.<init>((X.AnonymousClass5IP) r1)     // Catch:{ 43k -> 0x0171 }
            X.5IN r1 = new X.5IN     // Catch:{ 43k -> 0x0171 }
            r1.<init>((X.C32071fb) r0)     // Catch:{ 43k -> 0x0171 }
            X.5IE r0 = new X.5IE     // Catch:{ 43k -> 0x0171 }
            r0.<init>((X.AnonymousClass5IN) r1)     // Catch:{ 43k -> 0x0171 }
            r22 = r7
            r24 = r0
            r25 = r9
            r26 = r8
            r27 = r17
            r28 = r3
            r29 = r2
            r19 = r11
            X.C32211fp.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 43k -> 0x0171 }
            goto L_0x0177
        L_0x0169:
            r1 = move-exception
            java.lang.String r0 = "Issuer from certificate for CRL could not be reencoded."
            X.43k r0 = X.C803243k.A00(r0, r1)     // Catch:{ 43k -> 0x0171 }
            throw r0     // Catch:{ 43k -> 0x0171 }
        L_0x0171:
            r5 = move-exception
        L_0x0172:
            if (r14 != 0) goto L_0x0177
            if (r5 != 0) goto L_0x018b
            goto L_0x01f1
        L_0x0177:
            int r0 = r3.A00     // Catch:{ 43k -> 0x01f8 }
            if (r0 != r4) goto L_0x018c
            int r1 = r2.A00     // Catch:{ 43k -> 0x01f8 }
            X.4d4 r0 = X.C89864d4.A01     // Catch:{ 43k -> 0x01f8 }
            int r0 = r0.A00     // Catch:{ 43k -> 0x01f8 }
            if (r1 != r0) goto L_0x0184
            return
        L_0x0184:
            java.lang.String r1 = "Certificate status could not be determined."
            r0 = 0
            X.43k r5 = X.C803243k.A00(r1, r0)     // Catch:{ 43k -> 0x01f8 }
        L_0x018b:
            throw r5     // Catch:{ 43k -> 0x01f8 }
        L_0x018c:
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss Z"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ 43k -> 0x01f8 }
            r2.<init>(r0)     // Catch:{ 43k -> 0x01f8 }
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)     // Catch:{ 43k -> 0x01f8 }
            r2.setTimeZone(r0)     // Catch:{ 43k -> 0x01f8 }
            java.lang.String r0 = "Certificate revocation after "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 43k -> 0x01f8 }
            java.util.Date r0 = r3.A01     // Catch:{ 43k -> 0x01f8 }
            java.lang.String r0 = r2.format(r0)     // Catch:{ 43k -> 0x01f8 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 43k -> 0x01f8 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r0)     // Catch:{ 43k -> 0x01f8 }
            java.lang.String r0 = ", reason: "
            r2.append(r0)     // Catch:{ 43k -> 0x01f8 }
            java.lang.String[] r1 = X.C32211fp.A0D     // Catch:{ 43k -> 0x01f8 }
            int r0 = r3.A00     // Catch:{ 43k -> 0x01f8 }
            r0 = r1[r0]     // Catch:{ 43k -> 0x01f8 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r2)     // Catch:{ 43k -> 0x01f8 }
            r0 = 0
            X.43k r0 = X.C803243k.A00(r1, r0)     // Catch:{ 43k -> 0x01f8 }
            goto L_0x01f7
        L_0x01c5:
            r1 = move-exception
            java.lang.String r0 = "Distribution points could not be read."
            X.43k r0 = X.C803243k.A00(r0, r1)     // Catch:{ 43k -> 0x01e1 }
            goto L_0x01e0
        L_0x01cd:
            r2 = move-exception
            java.lang.String r0 = "cannot create certificate factory: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 43k -> 0x01e1 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ 43k -> 0x01e1 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 43k -> 0x01e1 }
            X.43k r0 = X.C803243k.A00(r0, r2)     // Catch:{ 43k -> 0x01e1 }
        L_0x01e0:
            throw r0     // Catch:{ 43k -> 0x01e1 }
        L_0x01e1:
            r1 = move-exception
            java.lang.String r0 = "No additional CRL locations could be decoded from CRL distribution point extension."
            X.43k r0 = X.C803243k.A00(r0, r1)     // Catch:{ 43k -> 0x01f8 }
            goto L_0x01f7
        L_0x01e9:
            r1 = move-exception
            java.lang.String r0 = "CRL distribution point extension could not be read."
            X.43k r0 = X.C803243k.A00(r0, r1)     // Catch:{ 43k -> 0x01f8 }
            goto L_0x01f7
        L_0x01f1:
            java.lang.String r0 = "No valid CRL found."
            X.43k r0 = X.C803243k.A00(r0, r5)     // Catch:{ 43k -> 0x01f8 }
        L_0x01f7:
            throw r0     // Catch:{ 43k -> 0x01f8 }
        L_0x01f8:
            r0 = move-exception
            java.lang.Throwable r2 = r0._underlyingException
            if (r2 != 0) goto L_0x01fe
            r2 = r0
        L_0x01fe:
            java.lang.String r1 = r0.getMessage()
            X.4Nv r0 = r10.A01
            java.security.cert.CertPathValidatorException r0 = X.C85284Nv.A00(r1, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5A6.check(java.security.cert.Certificate):void");
    }
}
