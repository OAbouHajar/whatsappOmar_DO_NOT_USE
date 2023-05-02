package X;

/* renamed from: X.3AC  reason: invalid class name */
public class AnonymousClass3AC {
    public final C84374Kh A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass3AC(C84374Kh r2, String str, String str2, String str3, boolean z2) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = Boolean.valueOf(z2);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ac, code lost:
        if (r6 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3AC A00(android.content.Context r9, X.C26081Mg r10, X.C16740tZ r11, int r12, boolean r13) {
        /*
            boolean r0 = r11 instanceof X.C38831rU
            java.lang.String r6 = ""
            r2 = 0
            if (r0 == 0) goto L_0x0064
            X.1Vw r0 = r11.A11
            boolean r1 = r0.A02
            r0 = 2131891317(0x7f121475, float:1.941735E38)
            if (r1 == 0) goto L_0x0013
            r0 = 2131891318(0x7f121476, float:1.9417353E38)
        L_0x0013:
            java.lang.String r8 = r9.getString(r0)
            r1 = r2
            r7 = r2
            r4 = r2
            r3 = r2
        L_0x001b:
            boolean r0 = r6.equals(r4)
            if (r0 == 0) goto L_0x002e
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x002e
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x002e
            r6 = r2
        L_0x002e:
            boolean r0 = android.text.TextUtils.equals(r4, r1)
            r9 = 1
            if (r0 == 0) goto L_0x0041
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x004e
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x004e
        L_0x0041:
            byte r0 = r11.A10
            if (r0 == 0) goto L_0x0062
            boolean r0 = X.C38621r6.A0o(r11)
            if (r0 != 0) goto L_0x0062
        L_0x004b:
            r3 = r1
            r7 = r1
            r8 = r2
        L_0x004e:
            com.whatsapp.jid.UserJid r0 = r11.A0C()
            java.util.Set r4 = r10.A00(r0, r11, r1)
            if (r4 == 0) goto L_0x005a
            r8 = r2
            r9 = 0
        L_0x005a:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0101
            goto L_0x00f8
        L_0x0062:
            r9 = 0
            goto L_0x004b
        L_0x0064:
            boolean r3 = r11 instanceof X.C16840tj
            if (r3 != 0) goto L_0x00d6
            boolean r0 = X.C42551xz.A04(r11)
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r11 instanceof X.C30581cc
            if (r0 == 0) goto L_0x00b8
            r5 = r11
            X.1cc r5 = (X.C30581cc) r5
            java.lang.String r7 = r5.A06
            java.lang.String r6 = r5.A0I()
            java.lang.String r4 = X.C30931dC.A01(r6)
            java.lang.String r0 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b5
            r3 = r4
        L_0x0088:
            boolean r0 = X.C61863As.A02(r3)
            if (r0 == 0) goto L_0x00b2
            int r0 = r5.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r5.A04
            java.lang.String r8 = X.AnonymousClass4Y8.A00(r9, r1, r0, r13)
        L_0x009a:
            java.util.ArrayList r1 = X.C30931dC.A04(r6)
            if (r1 == 0) goto L_0x00b0
            int r0 = r1.size()
            if (r0 <= r12) goto L_0x00b0
            java.lang.Object r1 = r1.get(r12)
            java.lang.String r1 = (java.lang.String) r1
        L_0x00ac:
            if (r6 == 0) goto L_0x002e
            goto L_0x001b
        L_0x00b0:
            r1 = r4
            goto L_0x00ac
        L_0x00b2:
            java.lang.String r8 = r5.A04
            goto L_0x009a
        L_0x00b5:
            java.lang.String r3 = r5.A07
            goto L_0x0088
        L_0x00b8:
            boolean r0 = r11 instanceof X.C16730tY
            if (r0 == 0) goto L_0x00d1
            r0 = r11
            X.0tY r0 = (X.C16730tY) r0
            java.lang.String r7 = r0.A13()
            java.lang.String r8 = r0.A14()
            java.lang.String r6 = r0.A13()
            java.lang.String r4 = X.C30931dC.A01(r6)
            r3 = r4
            goto L_0x009a
        L_0x00d1:
            r8 = r2
            r7 = r2
            r4 = r2
            r3 = r2
            goto L_0x009a
        L_0x00d6:
            r1 = 0
            if (r3 == 0) goto L_0x00ed
            r0 = r11
            X.0tj r0 = (X.C16840tj) r0
            X.0tn r0 = r0.AAt()
            if (r0 == 0) goto L_0x00e4
            java.lang.String r1 = r0.A07
        L_0x00e4:
            java.lang.String r8 = X.C30931dC.A01(r1)
            r7 = r8
            r4 = r8
            r3 = r8
            r6 = r2
            goto L_0x009a
        L_0x00ed:
            boolean r0 = X.C42551xz.A04(r11)
            if (r0 == 0) goto L_0x00e4
            java.lang.String r1 = X.C42551xz.A01(r11)
            goto L_0x00e4
        L_0x00f8:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0101 }
            r0.<init>(r3)     // Catch:{ MalformedURLException -> 0x0101 }
            java.lang.String r2 = r0.getHost()     // Catch:{ MalformedURLException -> 0x0101 }
        L_0x0101:
            X.4Kh r5 = new X.4Kh
            r5.<init>(r1, r2, r4)
            X.3AC r4 = new X.3AC
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AC.A00(android.content.Context, X.1Mg, X.0tZ, int, boolean):X.3AC");
    }
}
