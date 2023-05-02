package com.facebook.redex;

public class RunnableRunnableShape1S1400000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public RunnableRunnableShape1S1400000_I1(Object obj, Object obj2, Object obj3, Object obj4, String str, int i2) {
        this.A05 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
        if (r0.equals(r8) != false) goto L_0x005b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0254 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A05
            switch(r0) {
                case 0: goto L_0x0162;
                case 1: goto L_0x0105;
                case 2: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r15.A01
            X.0vu r1 = (X.C17950vu) r1
            java.lang.Object r0 = r15.A02
            java.lang.Object r5 = r15.A03
            X.5S1 r5 = (X.AnonymousClass5S1) r5
            int r2 = r0.hashCode()
            X.0vp r0 = r1.A08
            r1 = 105(0x69, float:1.47E-43)
            X.1dR r0 = r0.A02
            r0.A05(r2, r1)
            java.lang.String r4 = "XMPP not connected"
            r3 = 0
            r1 = 1
            X.4W3 r0 = new X.4W3
            r0.<init>(r4, r3, r1)
            if (r5 == 0) goto L_0x002b
            r5.AQy(r0)
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r5 = r15.A00
            com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r5 = (com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r5
            java.lang.Object r2 = r15.A01
            X.0rv r2 = (X.C15830rv) r2
            java.lang.String r1 = r15.A04
            java.lang.Object r8 = r15.A02
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r3 = r15.A03
            X.0t6 r11 = r5.A03
            r12 = 0
            X.1Vw r0 = new X.1Vw
            r0.<init>(r2, r1, r12)
            X.0tZ r9 = X.C16460t6.A00(r11, r0)
            if (r9 == 0) goto L_0x002b
            X.1Oi r2 = r5.A04
            long r0 = r9.A13
            java.lang.Integer r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.equals(r8)
            r14 = 1
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r14 = 0
        L_0x005c:
            long r0 = r9.A13
            X.0tq r4 = r2.A00
            X.0tf r10 = r4.A02()
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x025a }
            r13.<init>()     // Catch:{ all -> 0x025a }
            java.lang.String r6 = "message_row_id"
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x025a }
            r13.put(r6, r4)     // Catch:{ all -> 0x025a }
            java.lang.String r4 = "rating"
            r13.put(r4, r8)     // Catch:{ all -> 0x025a }
            X.0tg r7 = r10.A02     // Catch:{ all -> 0x025a }
            java.lang.String r6 = "message_rating"
            r4 = 5
            long r6 = r7.A06(r13, r6, r4)     // Catch:{ all -> 0x025a }
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r4)
            java.lang.String r0 = "MessageRatingStore/insertOrUpdateMessageRating/inserted row should have same messageRowId"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ all -> 0x025a }
            r10.close()
            com.whatsapp.jid.UserJid r0 = r9.A0C()
            java.lang.String r7 = X.C16030sJ.A03(r0)
            X.1Oh r5 = r5.A02
            boolean r4 = r9 instanceof X.C30591cd
            if (r4 == 0) goto L_0x0103
            r0 = r9
            X.1cd r0 = (X.C30591cd) r0
            X.1cf r0 = r0.AGV()
            java.lang.String r6 = r0.A04
        L_0x00a5:
            long r0 = r9.A13
            java.lang.Integer r0 = r2.A00(r0)
            boolean r10 = X.AnonymousClass000.A1V(r0)
            r2 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.43C r0 = X.AnonymousClass43C.LONG_PRESS
            if (r3 != r0) goto L_0x00b9
            r2 = 1
        L_0x00b9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r14)
            X.3sF r2 = new X.3sF
            r2.<init>()
            r2.A05 = r7
            r2.A02 = r1
            r2.A03 = r0
            if (r8 == 0) goto L_0x00d8
            long r0 = r8.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
        L_0x00d8:
            r2.A01 = r3
            r2.A06 = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r2.A00 = r0
            X.0t9 r0 = r5.A00
            r0.A04(r2)
            if (r4 == 0) goto L_0x002b
            X.17z r10 = r11.A1L
            long r5 = r9.A13
            r2 = 1
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            java.lang.String r0 = "TemplateMessageStore/removeCsatTrigger/parent message row must be set"
            X.AnonymousClass00B.A0C(r0, r1)
            X.0tq r0 = r10.A01
            X.0tf r8 = r0.A02()
            goto L_0x0221
        L_0x0103:
            r6 = 0
            goto L_0x00a5
        L_0x0105:
            java.lang.Object r3 = r15.A00
            X.31Q r3 = (X.AnonymousClass31Q) r3
            java.lang.String r1 = r15.A04
            java.lang.Object r5 = r15.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r8 = r15.A02
            X.3hL r8 = (X.C70603hL) r8
            java.lang.Object r7 = r15.A03
            X.1bb r7 = (X.C30011bb) r7
            if (r1 == 0) goto L_0x0157
            X.16r r0 = r3.A06
            X.1Vt r1 = r0.A0L(r1)
            if (r1 == 0) goto L_0x0157
            X.15p r0 = r3.A07
            java.lang.String r2 = r0.A0K(r1)
            int r9 = X.C218315p.A01(r1)
        L_0x012b:
            android.text.SpannableStringBuilder r6 = X.C13690nt.A0F(r2)
            android.content.res.Resources r0 = r5.getResources()
            int r1 = r0.getColor(r9)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r2 = r2.length()
            r1 = 0
            r6.setSpan(r0, r1, r2, r1)
            X.3MR r0 = new X.3MR
            r0.<init>(r5)
            r6.setSpan(r0, r1, r2, r1)
            X.0pt r0 = r3.A02
            X.568 r4 = new X.568
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A0K(r4)
            return
        L_0x0157:
            r0 = 2131890475(0x7f12112b, float:1.9415643E38)
            java.lang.String r2 = r5.getString(r0)
            r9 = 2131101206(0x7f060616, float:1.7814815E38)
            goto L_0x012b
        L_0x0162:
            java.lang.Object r7 = r15.A00
            X.4S5 r7 = (X.AnonymousClass4S5) r7
            java.lang.Object r6 = r15.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r9 = r15.A02
            X.4Vf r9 = (X.C87064Vf) r9
            java.lang.Object r5 = r15.A03
            X.22J r5 = (X.AnonymousClass22J) r5
            java.lang.String r2 = r15.A04
            X.16N r4 = r7.A02
            X.0rz r10 = r4.A08
            java.lang.String r3 = r6.getRawString()
            android.content.SharedPreferences r1 = X.C13680ns.A0B(r10)
            java.lang.String r0 = "dc_business_domain_"
            java.lang.String r0 = X.C13680ns.A0h(r0, r3)
            java.lang.String r1 = X.C13700nu.A0E(r1, r0)
            java.lang.String r12 = r9.A01
            r3 = 0
            if (r1 == 0) goto L_0x01fb
            r8 = 0
            java.lang.String r13 = r4.A00(r6)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.lang.String r11 = ""
            if (r13 != 0) goto L_0x01a5
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSearchQuery/Null certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            X.0so r1 = r4.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.lang.String r0 = "direct-connection-failed-to-load-certificate-from-preferences"
            r1.AcB(r0, r11, r8)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            goto L_0x020f
        L_0x01a5:
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r14 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            r0 = 2
            byte[] r13 = android.util.Base64.decode(r13, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            r0.<init>(r13)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.security.cert.Certificate r13 = r14.generateCertificate(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.security.cert.X509Certificate r13 = (java.security.cert.X509Certificate) r13     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            javax.security.auth.x500.X500Principal r0 = r13.getSubjectX500Principal()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.lang.String r0 = r0.getName()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.lang.String r0 = X.AnonymousClass16J.A00(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            if (r0 != 0) goto L_0x01e1
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSearchQuery/Incorrect CN in certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            X.0so r1 = r4.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.lang.String r0 = "direct-connection-certificate-common-name-mismatch"
            r1.AcB(r0, r11, r8)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.lang.String r0 = r6.getRawString()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            r10.A0n(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            goto L_0x020f
        L_0x01e1:
            X.16J r1 = r4.A06     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.security.PublicKey r0 = r13.getPublicKey()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            X.22Y r0 = r1.A03(r12, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            java.lang.String r1 = r0.A00()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x01fe }
            if (r1 == 0) goto L_0x020f
            java.lang.String r0 = "V1"
            X.26O r0 = r7.A00(r9, r1, r0, r2)
            r5.AIU(r0)
            return
        L_0x01fb:
            java.lang.String r0 = "CatalogSearchCatalogPageRequestFactory/createRequest/DN"
            goto L_0x0211
        L_0x01fe:
            r1 = move-exception
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSearchQuery/"
            com.whatsapp.util.Log.e(r0, r1)
            X.0so r2 = r4.A04
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "direct-connection-fail-to-generate-encryption-string"
            r2.AcB(r0, r1, r8)
        L_0x020f:
            java.lang.String r0 = "CatalogSearchCatalogPageRequestFactory/createRequest/EN"
        L_0x0211:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.4vM r1 = new X.4vM
            r1.<init>(r7)
            r0 = 0
            r4.A02(r1, r6, r0)
            r5.AIU(r3)
            return
        L_0x0221:
            X.1cj r7 = r8.A00()     // Catch:{ all -> 0x0255 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0250 }
            r4.<init>(r2)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "csat_trigger_expiration_ts"
            r4.putNull(r0)     // Catch:{ all -> 0x0250 }
            java.lang.String r3 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0250 }
            X.C13700nu.A0e(r2, r12, r5)     // Catch:{ all -> 0x0250 }
            X.0tg r1 = r8.A02     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "message_template"
            r1.A00(r0, r4, r3, r2)     // Catch:{ all -> 0x0250 }
            r7.A00()     // Catch:{ all -> 0x0250 }
            r7.close()     // Catch:{ all -> 0x0255 }
            r8.close()
            r10.A01(r9)
            X.17E r1 = r11.A0e
            r0 = -1
            r1.A00(r9, r0)
            return
        L_0x0250:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0254 }
        L_0x0254:
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x025e }
            throw r0
        L_0x025a:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x025e }
        L_0x025e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S1400000_I1.run():void");
    }
}
