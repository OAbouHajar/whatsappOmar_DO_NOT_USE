package X;

import java.lang.ref.WeakReference;

/* renamed from: X.374  reason: invalid class name */
public class AnonymousClass374 extends C16690tT {
    public final C15860rz A00;
    public final AnonymousClass1NE A01;
    public final C47052Hh A02;
    public final AnonymousClass1KP A03;
    public final C47062Hi A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final boolean A0B;

    public AnonymousClass374(C15860rz r3, AnonymousClass1NE r4, C47052Hh r5, AnonymousClass1KP r6, C47062Hi r7, AnonymousClass2FQ r8, String str, String str2, String str3, String str4, String str5, boolean z2) {
        this.A07 = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A02 = r5;
        this.A04 = r7;
        this.A0A = C13690nt.A0h(r8);
        this.A03 = r6;
        this.A01 = r4;
        this.A00 = r3;
        int A012 = C13690nt.A01(C13680ns.A0B(r3), "reg_attempts_verify_code") + 1;
        C13680ns.A1S(r3, "reg_attempts_verify_code", A012);
        r7.A00 = A012;
        this.A0B = z2;
        this.A06 = str4;
        this.A05 = str5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C13700nu.A0c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.C13700nu.A0c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.C13700nu.A0c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        com.whatsapp.util.Log.e("AutoconfManagerConsumerImpl/acquireAuthResponse", r0);
        r7.A01.AcB("AutoconfManagerConsumerImpl/acquireAuthResponse", r0.getMessage(), true);
        r5 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107 A[ExcHandler: 43L | RemoteException | IllegalArgumentException | SecurityException (r0v26 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:13:0x00b5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r31) {
        /*
            r30 = this;
            r1 = r31
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0 = 0
            r3 = r1[r0]
            X.AnonymousClass00B.A06(r3)
            java.lang.String r16 = "verifycode/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r16)
            r13 = r30
            java.lang.String r4 = r13.A08
            r1.append(r4)
            java.lang.String r0 = "/code "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " useStandaloneVerification: "
            r1.append(r0)
            boolean r7 = r13.A0B
            r1.append(r7)
            X.C13680ns.A1V(r1)
            X.0rz r1 = r13.A00
            android.content.SharedPreferences r5 = X.C13680ns.A0B(r1)
            java.lang.String r0 = "com.obwhatsapp.registration.RegisterPhone.mistyped_state"
            r2 = 0
            java.lang.String r6 = r5.getString(r0, r2)
            if (r7 == 0) goto L_0x0080
            java.lang.String r8 = r13.A06     // Catch:{ Exception -> 0x0197 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ Exception -> 0x0197 }
            X.1KP r9 = r13.A03     // Catch:{ Exception -> 0x0197 }
            java.lang.String r7 = r13.A07     // Catch:{ Exception -> 0x0197 }
            java.lang.String r5 = r13.A09     // Catch:{ Exception -> 0x0197 }
            X.2Hh r11 = r13.A02     // Catch:{ Exception -> 0x0197 }
            X.2Hi r10 = r13.A04     // Catch:{ Exception -> 0x0197 }
            r9.A08()     // Catch:{ Exception -> 0x0197 }
            byte[] r26 = r9.A0C(r7, r5)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = "verifyCodeForStandaloneVerification"
            byte[] r27 = r9.A0B(r0)     // Catch:{ Exception -> 0x0197 }
            java.util.Map r25 = r9.A05(r11, r10, r6)     // Catch:{ Exception -> 0x0197 }
            X.1SU r6 = r9.A0L     // Catch:{ Exception -> 0x0197 }
            java.util.List r24 = r9.A04()     // Catch:{ Exception -> 0x0197 }
            X.1S0 r0 = r9.A00     // Catch:{ Exception -> 0x0197 }
            r28 = 2
            com.obwhatsapp.wamsys.IDxARunnableShape0S4600000_2_I1 r17 = new com.obwhatsapp.wamsys.IDxARunnableShape0S4600000_2_I1     // Catch:{ Exception -> 0x0197 }
            r18 = r0
            r19 = r6
            r20 = r3
            r21 = r7
            r22 = r5
            r23 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r5 = X.C31591ei.A00(r17)     // Catch:{ Exception -> 0x0197 }
            X.1en r5 = (X.C31641en) r5     // Catch:{ Exception -> 0x0197 }
            goto L_0x017a
        L_0x0080:
            java.lang.String r0 = "autoconf"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x012f
            X.1NE r7 = r13.A01     // Catch:{ Exception -> 0x0197 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r5 = r13.A05     // Catch:{ Exception -> 0x0197 }
            r10 = 0
            if (r5 != 0) goto L_0x0099
            java.lang.String r0 = "AutoconfManagerConsumerImpl/acquireAuthResponse/null authChallenge"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0197 }
            goto L_0x011e
        L_0x0099:
            X.4Mt r0 = r7.A00     // Catch:{ Exception -> 0x0197 }
            if (r0 != 0) goto L_0x00a0
            r7.A00()     // Catch:{ Exception -> 0x0197 }
        L_0x00a0:
            r0 = 8
            byte[] r9 = android.util.Base64.decode(r5, r0)     // Catch:{ Exception -> 0x0197 }
            X.4Pk r8 = new X.4Pk     // Catch:{ Exception -> 0x0197 }
            r8.<init>()     // Catch:{ Exception -> 0x0197 }
            android.os.Bundle r5 = r8.A00     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = "challenge"
            r5.putByteArray(r0, r9)     // Catch:{ Exception -> 0x0197 }
            r8.A00()     // Catch:{ Exception -> 0x0197 }
            X.4Mt r8 = r7.A00     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            X.4Bl r15 = new X.4Bl     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            r15.<init>(r5)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            r0.<init>()     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            X.39t r9 = r8.A03     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            r9.A00(r15)     // Catch:{ Exception -> 0x00ca, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            X.C13700nu.A0c(r0)     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
        L_0x00ce:
            android.net.Uri r14 = X.C87824Ys.A00     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            X.38e r12 = r8.A01     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            android.content.ContentResolver r5 = r8.A00     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            java.lang.String r11 = "authenticate"
            android.os.Bundle r0 = r15.A00     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            android.os.Bundle r0 = X.C90514eI.A00(r0)     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            android.os.Bundle r5 = X.AnonymousClass4Xb.A00(r5, r14, r0, r12, r11)     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            X.38T r0 = r8.A02     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            X.AnonymousClass4Xb.A01(r5, r0, r11)     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            if (r5 != 0) goto L_0x00e9
            r5 = 0
            goto L_0x00f2
        L_0x00e9:
            android.os.Bundle r0 = X.C90514eI.A00(r5)     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            X.4Pl r5 = new X.4Pl     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
        L_0x00f2:
            r9.A01(r5)     // Catch:{ Exception -> 0x00f6, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            goto L_0x0118
        L_0x00f6:
            r0 = move-exception
            X.C13700nu.A0c(r0)     // Catch:{ Exception -> 0x00fb, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            goto L_0x0118
        L_0x00fb:
            r5 = move-exception
            X.39t r0 = r8.A03     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            r0.A08(r5)     // Catch:{ Exception -> 0x0102, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
            goto L_0x0106
        L_0x0102:
            r0 = move-exception
            X.C13700nu.A0c(r0)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
        L_0x0106:
            throw r5     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            java.lang.String r8 = "AutoconfManagerConsumerImpl/acquireAuthResponse"
            com.whatsapp.util.Log.e(r8, r0)     // Catch:{ Exception -> 0x0197 }
            X.0so r7 = r7.A01     // Catch:{ Exception -> 0x0197 }
            java.lang.String r5 = r0.getMessage()     // Catch:{ Exception -> 0x0197 }
            r0 = 1
            r7.AcB(r8, r5, r0)     // Catch:{ Exception -> 0x0197 }
            r5 = r2
        L_0x0118:
            if (r5 == 0) goto L_0x011e
            byte[] r10 = r5.A00()     // Catch:{ Exception -> 0x0197 }
        L_0x011e:
            if (r10 == 0) goto L_0x0123
            int r0 = r10.length     // Catch:{ Exception -> 0x0197 }
            if (r0 != 0) goto L_0x0130
        L_0x0123:
            java.lang.String r0 = "VerifyCodeTask/doInBackground/no valid authResponse, skip sending autoconf verification request"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0197 }
            X.1em r0 = X.C31631em.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x0197 }
            android.util.Pair r0 = X.C13690nt.A0I(r0, r2)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x012f:
            r10 = r2
        L_0x0130:
            X.1KP r11 = r13.A03     // Catch:{ Exception -> 0x0197 }
            java.lang.String r9 = r13.A07     // Catch:{ Exception -> 0x0197 }
            java.lang.String r8 = r13.A09     // Catch:{ Exception -> 0x0197 }
            X.2Hh r12 = r13.A02     // Catch:{ Exception -> 0x0197 }
            java.lang.String r7 = r13.A06     // Catch:{ Exception -> 0x0197 }
            X.2Hi r5 = r13.A04     // Catch:{ Exception -> 0x0197 }
            r11.A08()     // Catch:{ Exception -> 0x0197 }
            byte[] r27 = r11.A0C(r9, r8)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = "verifyCode"
            byte[] r28 = r11.A0B(r0)     // Catch:{ Exception -> 0x0197 }
            java.util.Map r6 = r11.A05(r12, r5, r6)     // Catch:{ Exception -> 0x0197 }
            r11.A0A(r6)     // Catch:{ Exception -> 0x0197 }
            X.1SU r5 = r11.A0L     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = "register_entrypoint"
            java.lang.String r23 = r11.A03(r9, r0)     // Catch:{ Exception -> 0x0197 }
            java.util.List r25 = r11.A04()     // Catch:{ Exception -> 0x0197 }
            X.1S0 r0 = r11.A00     // Catch:{ Exception -> 0x0197 }
            X.2Hr r17 = new X.2Hr     // Catch:{ Exception -> 0x0197 }
            r18 = r0
            r19 = r5
            r20 = r3
            r21 = r9
            r22 = r8
            r24 = r7
            r26 = r6
            r29 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r5 = X.C31591ei.A00(r17)     // Catch:{ Exception -> 0x0197 }
            X.1en r5 = (X.C31641en) r5     // Catch:{ Exception -> 0x0197 }
        L_0x017a:
            if (r5 != 0) goto L_0x0188
            java.lang.String r0 = "VerifyCodeTask/doInBackground/null verifyCodeResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0197 }
            X.1em r0 = X.C31631em.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x0197 }
            android.util.Pair r0 = X.C13690nt.A0I(r0, r2)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0188:
            r1.A0u(r3)     // Catch:{ Exception -> 0x0197 }
            int r0 = r5.A00     // Catch:{ Exception -> 0x0197 }
            r1.A0d(r0)     // Catch:{ Exception -> 0x0197 }
            X.1em r0 = r5.A06     // Catch:{ Exception -> 0x0197 }
            android.util.Pair r0 = X.C13690nt.A0I(r0, r5)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0197:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r16)
            r1.append(r4)
            java.lang.String r0 = "/error "
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e(r0, r3)
            X.1em r0 = X.C31631em.ERROR_UNSPECIFIED
            android.util.Pair r0 = X.C13690nt.A0I(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass374.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0221, code lost:
        if (r6 == X.C31631em.A0D) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0223, code lost:
        com.whatsapp.util.Log.i(X.AnonymousClass000.A0g("verifyphonenumber/verify-voice-request-error/status=", r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x022f, code lost:
        if (r6 != X.C31631em.A07) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0231, code lost:
        com.whatsapp.util.Log.i("verifyvoice/verifyvoice/incorrect");
        r8.A3F();
        r0 = r2.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023c, code lost:
        if (r0 == null) goto L_0x03d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r1 = java.lang.Long.parseLong(r0) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0249, code lost:
        if (r1 > 0) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x024b, code lost:
        r0 = r8.getString(com.obwhatsapp.R.string.str13cf);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0256, code lost:
        if (r6 != X.C31631em.A04) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0258, code lost:
        com.whatsapp.util.Log.e("verifyvoice/verifyvoice/error");
        r8.A44(true);
        r8.A3V(109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x026b, code lost:
        if (r6 != X.C31631em.A08) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x026d, code lost:
        com.whatsapp.util.Log.e("verifyvoice/verifyvoice/error-missing");
        r8.A3F();
        r3 = com.obwhatsapp.R.string.str1989;
        r2 = X.C13690nt.A1Z();
        r2[0] = r8.A39();
        r1 = r8.getString(com.obwhatsapp.R.string.str19a9);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x028c, code lost:
        r0 = X.C13680ns.A0d(r8, r1, r2, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0297, code lost:
        if (r6 != X.C31631em.A0C) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r6 == X.C31631em.A0F) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0299, code lost:
        com.whatsapp.util.Log.e("verifyvoice/verifyvoice/error-too-many-guesses");
        r8.A14.A03("failTooMany");
        r8.A14.A02("verify-tmg");
        r1 = r2.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02b6, code lost:
        if (X.AnonymousClass47P.A00(r1) != false) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b8, code lost:
        r8.A3V(28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02bf, code lost:
        if (r6 != X.C31631em.A06) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02c1, code lost:
        com.whatsapp.util.Log.e("verifyvoice/verifyvoice/error-guessed-too-fast");
        r8.A3F();
        r1 = r2.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d0, code lost:
        if (X.AnonymousClass47P.A00(r1) != false) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02d2, code lost:
        r0 = com.obwhatsapp.R.string.str137c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r1 = java.lang.Long.parseLong(r1) * 1000;
        r8.A11.A0B(r1);
        r8.A3t(X.C13680ns.A0d(r8, X.C28961Zl.A08(r8.A01, r1), X.C13680ns.A1b(), 0, com.obwhatsapp.R.string.str137d));
        r8.A3X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0300, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0301, code lost:
        com.whatsapp.util.Log.w("verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter", r1);
        r0 = com.obwhatsapp.R.string.str137c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x030d, code lost:
        if (r6 != X.C31631em.A02) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x030f, code lost:
        com.whatsapp.util.Log.e("verifyvoice/verifyvoice/error-connectivity");
        r8.A44(true);
        r3 = com.obwhatsapp.R.string.str1372;
        r2 = new java.lang.Object[1];
        r1 = r8.getString(com.obwhatsapp.R.string.str053b);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x032a, code lost:
        if (r6 != X.C31631em.A05) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x032c, code lost:
        com.whatsapp.util.Log.e("verifyvoice/verifyvoice/error-blocked");
        r8.A3W(12);
        r8.A3Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r6 != X.C31631em.A07) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x033e, code lost:
        if (r6 != X.C31631em.A0A) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0340, code lost:
        com.whatsapp.util.Log.w("verifyvoice/verifyvoice/stale");
        r8.A3F();
        r0 = com.obwhatsapp.R.string.str13a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x034f, code lost:
        if (r6 != X.C31631em.A0B) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0351, code lost:
        com.whatsapp.util.Log.w("verifyvoice/verifyvoice/temporarily-unavailable");
        X.AnonymousClass2JN.A0K(r8.A09, "voice-temporarily-unavailable");
        r1 = r2.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0365, code lost:
        if (X.AnonymousClass47P.A00(r1) != false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0367, code lost:
        r0 = com.obwhatsapp.R.string.str13ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r1 = java.lang.Long.parseLong(r1) * 1000;
        r8.A11.A0B(r1);
        r8.A3t(X.C13680ns.A0d(r8, X.C28961Zl.A08(r8.A01, r1), X.C13680ns.A1b(), 0, com.obwhatsapp.R.string.str13ac));
        r8.A3X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0391, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        com.whatsapp.util.Log.i("verifyphonenumber/verifysms/unauthorized");
        X.AnonymousClass2JN.A0K(r8.A09, "server-send-mismatch");
        r8.A15.A04();
        r0 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0392, code lost:
        com.whatsapp.util.Log.w("verifyvoice/verifyvoice/unable-to-parse-retryAfter", r1);
        r0 = com.obwhatsapp.R.string.str13ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r1 = java.lang.Long.parseLong(r1) * 1000;
        r8.A0A = r1;
        r8.A11.A0B(r1);
        r8.A3V(32);
        r8.A3X(r8.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03b6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03b7, code lost:
        com.whatsapp.util.Log.w("verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter", r1);
        r8.A3V(28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03c3, code lost:
        if (r6 != X.C31631em.A09) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03c5, code lost:
        r8.A3s(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03c9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ca, code lost:
        com.whatsapp.util.Log.w("verifyvoice/verifyvoice/retryafter failed to parse", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        r8.A3T(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03d0, code lost:
        r1 = 60000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03d3, code lost:
        r0 = X.C13680ns.A0d(r8, X.C28961Zl.A08(r8.A01, r1), X.C13680ns.A1b(), 0, com.obwhatsapp.R.string.str13d0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03e5, code lost:
        r8.A3t(r0);
        r8.A3X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x040b, code lost:
        r8.A3k(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0410, code lost:
        r8.A3m(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r7.equals("wa_old") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r6 == r9) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r6 == X.C31631em.A0F) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r6 == X.C31631em.A0E) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r1 = r8.A09;
        r0 = "wa_old_failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        r1.A0y(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r1 = r8.A09;
        r0 = "wa_old_successful";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r10 = r8.A15.A02(r8.A1C, r8.A1D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r6 != X.C31631em.A02) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        com.whatsapp.util.Log.w("verifyphonenumber/verifysms/connectivity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r7.equals("wa_old") == false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r0 = X.C13680ns.A0d(r8, r8.getString(com.obwhatsapp.R.string.str053b), X.C13680ns.A1b(), 0, com.obwhatsapp.R.string.str1372);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r8.A3t(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r6 != X.C31631em.A06) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        com.whatsapp.util.Log.e("verifyphonenumber/verifysms/guessed-too-fast");
        X.AnonymousClass2JN.A0K(r8.A09, "server-send-guessed-too-fast");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
        if (r7.equals("wa_old") == false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        r8.A3F();
        r0 = com.obwhatsapp.R.string.str137c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        r0 = r8.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        if (r6 != X.C31631em.A0B) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        com.whatsapp.util.Log.e("verifyphonenumber/verifysms/error-temporarily-unavailable");
        X.AnonymousClass2JN.A0K(r8.A09, "server-send-error-temporarily-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e9, code lost:
        if (r7.equals("wa_old") == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00eb, code lost:
        r0 = com.obwhatsapp.R.string.str13ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ef, code lost:
        if (r10 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        com.whatsapp.util.Log.e("verifyphonenumber/verifysms/error/connectivity/saved-code-is-null");
        r8.A3W(4);
        r0 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ff, code lost:
        if (r10 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        r0 = "verifyphonenumber/verifysms/error/temp-unavail/saved-code-is-null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0108, code lost:
        if (r6 != X.C31631em.A0E) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        r8.A3l(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0111, code lost:
        if (r6 == X.C31631em.A01) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
        if (r6 == X.C31631em.A0D) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0119, code lost:
        if (r6 != X.C31631em.A09) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011b, code lost:
        r8.A3s(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0120, code lost:
        r8.A15.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0127, code lost:
        if (r6 != X.C31631em.A08) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0129, code lost:
        com.whatsapp.util.Log.e("verifyphonenumber/verifysms/missing");
        r1 = r8.A09;
        r0 = "server-send-missing";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0134, code lost:
        X.AnonymousClass2JN.A0K(r1, r0);
        r8.A3F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013c, code lost:
        if (r6 != X.C31631em.A05) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013e, code lost:
        com.whatsapp.util.Log.e("verifyphonenumber/verifysms/blocked");
        r8.A3W(12);
        X.AnonymousClass2JN.A0K(r8.A09, "server-send-blocked");
        r8.A3Q();
        r8.A3I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015b, code lost:
        if (r6 != X.C31631em.A0C) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015d, code lost:
        com.whatsapp.util.Log.e("verifyphonenumber/verifysms/too-many-guesses");
        X.AnonymousClass2JN.A0K(r8.A09, "server-send-too-many-guesses");
        r8.A14.A03("failTooMany");
        r8.A14.A02("verify-tmg");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017d, code lost:
        if (r6 != X.C31631em.A04) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x017f, code lost:
        com.whatsapp.util.Log.e("verifyphonenumber/verifysms/error");
        X.AnonymousClass2JN.A0K(r8.A09, "server-send-error-unspecified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0190, code lost:
        if (r6 != X.C31631em.A0A) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0192, code lost:
        com.whatsapp.util.Log.e("verifyphonenumber/verifysms/stale");
        r1 = r8.A09;
        r0 = "server-send-error-stale";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019e, code lost:
        if (r10 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a0, code lost:
        r0 = "verifyphonenumber/verifysms/error/too-fast/saved-code-is-null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a3, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01aa, code lost:
        if (r8.A0x.A02 != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r7.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b0, code lost:
        if (r8.AIm() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b2, code lost:
        X.AnonymousClass2JN.A0F(r8, r8.A0i, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ba, code lost:
        r4 = java.lang.Math.random();
        r1 = r8.A01;
        r8.A01 = r1 + 1;
        r11 = (int) (r4 * ((java.lang.Math.pow(2.0d, (double) r1) - 1.0d) * 4000.0d));
        com.whatsapp.util.Log.i(X.C13680ns.A0c(r11, "verifyphonenumber/verifysms/schedule-retry/"));
        r8.A12.sendMessageDelayed(r8.A12.obtainMessage(1, r10), (long) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ef, code lost:
        r8.A3k(r2, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f7, code lost:
        r8.A3m(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0206, code lost:
        if (r7.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r9 = X.C31631em.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020a, code lost:
        if (r6 == X.C31631em.A0G) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020e, code lost:
        if (r6 == X.C31631em.A0F) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0212, code lost:
        if (r6 != X.C31631em.A0E) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0214, code lost:
        r8.A3l(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x021d, code lost:
        if (r6 == X.C31631em.A01) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r6 == r9) goto L_0x01f7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r13) {
        /*
            r12 = this;
            android.util.Pair r13 = (android.util.Pair) r13
            java.lang.ref.WeakReference r0 = r12.A0A
            java.lang.Object r8 = r0.get()
            X.2FQ r8 = (X.AnonymousClass2FQ) r8
            if (r8 == 0) goto L_0x0022
            r8.AHq()
            java.lang.String r7 = r12.A08
            java.lang.Object r6 = r13.first
            X.1em r6 = (X.C31631em) r6
            java.lang.Object r2 = r13.second
            X.1en r2 = (X.C31641en) r2
            com.obwhatsapp.registration.VerifyPhoneNumber r8 = (com.obwhatsapp.registration.VerifyPhoneNumber) r8
            int r0 = r7.hashCode()
            switch(r0) {
                case -795576526: goto L_0x0023;
                case 114009: goto L_0x0027;
                case 97513456: goto L_0x01fc;
                case 112386354: goto L_0x01ff;
                case 1439178067: goto L_0x0415;
                default: goto L_0x0022;
            }
        L_0x0022:
            return
        L_0x0023:
            java.lang.String r0 = "wa_old"
            goto L_0x002a
        L_0x0027:
            java.lang.String r0 = "sms"
        L_0x002a:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.1em r9 = X.C31631em.YES
            if (r6 == r9) goto L_0x01f7
            X.1em r0 = X.C31631em.VERIFIED_STANDALONE
            if (r6 == r0) goto L_0x01f7
            X.1em r0 = X.C31631em.FAIL_MISMATCH
            if (r6 != r0) goto L_0x0076
            java.lang.String r0 = "verifyphonenumber/verifysms/unauthorized"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = "server-send-mismatch"
            X.AnonymousClass2JN.A0K(r1, r0)
            X.4XR r0 = r8.A15
            r0.A04()
            r0 = 30
        L_0x0051:
            r8.A3T(r0)
        L_0x0054:
            java.lang.String r0 = "wa_old"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0022
            if (r6 == r9) goto L_0x0070
            X.1em r0 = X.C31631em.VERIFIED_STANDALONE
            if (r6 == r0) goto L_0x0070
            X.1em r0 = X.C31631em.SECURITY_CODE
            if (r6 == r0) goto L_0x0070
            X.0rz r1 = r8.A09
            java.lang.String r0 = "wa_old_failed"
        L_0x006c:
            r1.A0y(r0)
            return
        L_0x0070:
            X.0rz r1 = r8.A09
            java.lang.String r0 = "wa_old_successful"
            goto L_0x006c
        L_0x0076:
            X.4XR r3 = r8.A15
            java.lang.String r1 = r8.A1C
            java.lang.String r0 = r8.A1D
            java.lang.String r10 = r3.A02(r1, r0)
            X.1em r0 = X.C31631em.ERROR_CONNECTIVITY
            if (r6 != r0) goto L_0x00aa
            java.lang.String r0 = "verifyphonenumber/verifysms/connectivity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "wa_old"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ef
            r3 = 2131891058(0x7f121372, float:1.9416825E38)
            java.lang.Object[] r2 = X.C13680ns.A1b()
            r1 = 0
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r0 = X.C13680ns.A0d(r8, r0, r2, r1, r3)
        L_0x00a6:
            r8.A3t(r0)
            goto L_0x0054
        L_0x00aa:
            X.1em r0 = X.C31631em.FAIL_GUESSED_TOO_FAST
            if (r6 != r0) goto L_0x00d0
            java.lang.String r0 = "verifyphonenumber/verifysms/guessed-too-fast"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = "server-send-guessed-too-fast"
            X.AnonymousClass2JN.A0K(r1, r0)
            java.lang.String r0 = "wa_old"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x019e
            r8.A3F()
            r0 = 2131891068(0x7f12137c, float:1.9416846E38)
        L_0x00cb:
            java.lang.String r0 = r8.getString(r0)
            goto L_0x00a6
        L_0x00d0:
            X.1em r0 = X.C31631em.FAIL_TEMPORARILY_UNAVAILABLE
            if (r6 != r0) goto L_0x0106
            java.lang.String r0 = "verifyphonenumber/verifysms/error-temporarily-unavailable"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = "server-send-error-temporarily-unavailable"
            X.AnonymousClass2JN.A0K(r1, r0)
            java.lang.String r0 = "wa_old"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ff
            r0 = 2131891115(0x7f1213ab, float:1.941694E38)
            goto L_0x00cb
        L_0x00ef:
            if (r10 != 0) goto L_0x01ba
            java.lang.String r0 = "verifyphonenumber/verifysms/error/connectivity/saved-code-is-null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 4
            r8.A3W(r0)
            r0 = 21
            goto L_0x0051
        L_0x00ff:
            if (r10 != 0) goto L_0x01ba
            java.lang.String r0 = "verifyphonenumber/verifysms/error/temp-unavail/saved-code-is-null"
            goto L_0x01a3
        L_0x0106:
            X.1em r0 = X.C31631em.SECURITY_CODE
            if (r6 != r0) goto L_0x010f
            r8.A3l(r2, r7)
            goto L_0x0054
        L_0x010f:
            X.1em r0 = X.C31631em.DEVICE_CONFIRM_OR_SECOND_OTP
            if (r6 == r0) goto L_0x01ef
            X.1em r0 = X.C31631em.SECOND_OTP
            if (r6 == r0) goto L_0x01ef
            X.1em r0 = X.C31631em.FAIL_NOT_ALLOWED
            if (r6 != r0) goto L_0x0120
            r8.A3s(r7)
            goto L_0x0054
        L_0x0120:
            X.4XR r0 = r8.A15
            r0.A04()
            X.1em r0 = X.C31631em.FAIL_MISSING
            if (r6 != r0) goto L_0x0159
            java.lang.String r0 = "verifyphonenumber/verifysms/missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = "server-send-missing"
        L_0x0134:
            X.AnonymousClass2JN.A0K(r1, r0)
            r8.A3F()
        L_0x013a:
            X.1em r0 = X.C31631em.FAIL_BLOCKED
            if (r6 != r0) goto L_0x01a6
            java.lang.String r0 = "verifyphonenumber/verifysms/blocked"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 12
            r8.A3W(r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = "server-send-blocked"
            X.AnonymousClass2JN.A0K(r1, r0)
            r8.A3Q()
            r8.A3I()
            goto L_0x0054
        L_0x0159:
            X.1em r0 = X.C31631em.FAIL_TOO_MANY_GUESSES
            if (r6 != r0) goto L_0x017b
            java.lang.String r0 = "verifyphonenumber/verifysms/too-many-guesses"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = "server-send-too-many-guesses"
            X.AnonymousClass2JN.A0K(r1, r0)
            X.12L r1 = r8.A14
            java.lang.String r0 = "failTooMany"
            r1.A03(r0)
            X.12L r1 = r8.A14
            java.lang.String r0 = "verify-tmg"
            r1.A02(r0)
            goto L_0x013a
        L_0x017b:
            X.1em r0 = X.C31631em.ERROR_UNSPECIFIED
            if (r6 != r0) goto L_0x018e
            java.lang.String r0 = "verifyphonenumber/verifysms/error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = "server-send-error-unspecified"
            X.AnonymousClass2JN.A0K(r1, r0)
            goto L_0x013a
        L_0x018e:
            X.1em r0 = X.C31631em.FAIL_STALE
            if (r6 != r0) goto L_0x013a
            java.lang.String r0 = "verifyphonenumber/verifysms/stale"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = "server-send-error-stale"
            goto L_0x0134
        L_0x019e:
            if (r10 != 0) goto L_0x01ba
            java.lang.String r0 = "verifyphonenumber/verifysms/error/too-fast/saved-code-is-null"
        L_0x01a3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01a6:
            X.4Ws r0 = r8.A0x
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01b2
            boolean r0 = r8.AIm()
            if (r0 == 0) goto L_0x0054
        L_0x01b2:
            X.0yL r1 = r8.A0i
            r0 = -1
            X.AnonymousClass2JN.A0F(r8, r1, r0)
            goto L_0x0054
        L_0x01ba:
            double r4 = java.lang.Math.random()
            int r1 = r8.A01
            int r0 = r1 + 1
            r8.A01 = r0
            double r2 = (double) r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r0, r2)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r0
            r0 = 4661014508095930368(0x40af400000000000, double:4000.0)
            double r2 = r2 * r0
            double r4 = r4 * r2
            int r11 = (int) r4
            java.lang.String r0 = "verifyphonenumber/verifysms/schedule-retry/"
            java.lang.String r0 = X.C13680ns.A0c(r11, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ly r1 = r8.A12
            r0 = 1
            android.os.Message r3 = r1.obtainMessage(r0, r10)
            X.3Ly r2 = r8.A12
            long r0 = (long) r11
            r2.sendMessageDelayed(r3, r0)
            goto L_0x0054
        L_0x01ef:
            java.lang.String r0 = "sms"
            r8.A3k(r2, r0)
            goto L_0x0054
        L_0x01f7:
            r8.A3m(r2, r7)
            goto L_0x0054
        L_0x01fc:
            java.lang.String r0 = "flash"
            goto L_0x0202
        L_0x01ff:
            java.lang.String r0 = "voice"
        L_0x0202:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.1em r0 = X.C31631em.YES
            if (r6 == r0) goto L_0x0410
            X.1em r0 = X.C31631em.VERIFIED_STANDALONE
            if (r6 == r0) goto L_0x0410
            X.1em r0 = X.C31631em.SECURITY_CODE
            if (r6 != r0) goto L_0x021b
            r8.A3l(r2, r7)
        L_0x0217:
            r8.A3u(r7)
            return
        L_0x021b:
            X.1em r0 = X.C31631em.DEVICE_CONFIRM_OR_SECOND_OTP
            if (r6 == r0) goto L_0x040b
            X.1em r0 = X.C31631em.SECOND_OTP
            if (r6 == r0) goto L_0x040b
            java.lang.String r0 = "verifyphonenumber/verify-voice-request-error/status="
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r6)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1em r0 = X.C31631em.FAIL_MISMATCH
            if (r6 != r0) goto L_0x0254
            java.lang.String r0 = "verifyvoice/verifyvoice/incorrect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A3F()
            java.lang.String r0 = r2.A09
            if (r0 == 0) goto L_0x03d0
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x03c9 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x03d3
            r0 = 2131891151(0x7f1213cf, float:1.9417014E38)
            java.lang.String r0 = r8.getString(r0)
            goto L_0x03e5
        L_0x0254:
            X.1em r0 = X.C31631em.ERROR_UNSPECIFIED
            if (r6 != r0) goto L_0x0269
            java.lang.String r0 = "verifyvoice/verifyvoice/error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 1
            r8.A44(r0)
            r0 = 109(0x6d, float:1.53E-43)
            r8.A3V(r0)
            goto L_0x03eb
        L_0x0269:
            X.1em r0 = X.C31631em.FAIL_MISSING
            if (r6 != r0) goto L_0x0295
            java.lang.String r0 = "verifyvoice/verifyvoice/error-missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A3F()
            r3 = 2131892617(0x7f121989, float:1.9419987E38)
            java.lang.Object[] r2 = X.C13690nt.A1Z()
            java.lang.String r1 = r8.A39()
            r0 = 0
            r2[r0] = r1
            r0 = 2131892649(0x7f1219a9, float:1.9420052E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 1
        L_0x028c:
            java.lang.String r0 = X.C13680ns.A0d(r8, r1, r2, r0, r3)
        L_0x0290:
            r8.A3t(r0)
            goto L_0x03eb
        L_0x0295:
            X.1em r0 = X.C31631em.FAIL_TOO_MANY_GUESSES
            if (r6 != r0) goto L_0x02bd
            java.lang.String r0 = "verifyvoice/verifyvoice/error-too-many-guesses"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.12L r1 = r8.A14
            java.lang.String r0 = "failTooMany"
            r1.A03(r0)
            X.12L r1 = r8.A14
            java.lang.String r0 = "verify-tmg"
            r1.A02(r0)
            java.lang.String r1 = r2.A09
            boolean r0 = X.AnonymousClass47P.A00(r1)
            r5 = 28
            if (r0 != 0) goto L_0x039d
            r8.A3V(r5)
            goto L_0x03eb
        L_0x02bd:
            X.1em r0 = X.C31631em.FAIL_GUESSED_TOO_FAST
            if (r6 != r0) goto L_0x030b
            java.lang.String r0 = "verifyvoice/verifyvoice/error-guessed-too-fast"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A3F()
            java.lang.String r1 = r2.A09
            boolean r0 = X.AnonymousClass47P.A00(r1)
            if (r0 != 0) goto L_0x02da
            r0 = 2131891068(0x7f12137c, float:1.9416846E38)
        L_0x02d5:
            java.lang.String r0 = r8.getString(r0)
            goto L_0x0290
        L_0x02da:
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0300 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            X.0yx r0 = r8.A11     // Catch:{ NumberFormatException -> 0x0300 }
            r0.A0B(r1)     // Catch:{ NumberFormatException -> 0x0300 }
            r5 = 2131891069(0x7f12137d, float:1.9416848E38)
            java.lang.Object[] r4 = X.C13680ns.A1b()     // Catch:{ NumberFormatException -> 0x0300 }
            r3 = 0
            X.013 r0 = r8.A01     // Catch:{ NumberFormatException -> 0x0300 }
            java.lang.String r0 = X.C28961Zl.A08(r0, r1)     // Catch:{ NumberFormatException -> 0x0300 }
            java.lang.String r0 = X.C13680ns.A0d(r8, r0, r4, r3, r5)     // Catch:{ NumberFormatException -> 0x0300 }
            r8.A3t(r0)     // Catch:{ NumberFormatException -> 0x0300 }
            r8.A3X(r1)     // Catch:{ NumberFormatException -> 0x0300 }
            goto L_0x03eb
        L_0x0300:
            r1 = move-exception
            java.lang.String r0 = "verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2131891068(0x7f12137c, float:1.9416846E38)
            goto L_0x02d5
        L_0x030b:
            X.1em r0 = X.C31631em.ERROR_CONNECTIVITY
            if (r6 != r0) goto L_0x0328
            java.lang.String r0 = "verifyvoice/verifyvoice/error-connectivity"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 1
            r8.A44(r0)
            r3 = 2131891058(0x7f121372, float:1.9416825E38)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 0
            goto L_0x028c
        L_0x0328:
            X.1em r0 = X.C31631em.FAIL_BLOCKED
            if (r6 != r0) goto L_0x033c
            java.lang.String r0 = "verifyvoice/verifyvoice/error-blocked"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 12
            r8.A3W(r0)
            r8.A3Q()
            goto L_0x03eb
        L_0x033c:
            X.1em r0 = X.C31631em.FAIL_STALE
            if (r6 != r0) goto L_0x034d
            java.lang.String r0 = "verifyvoice/verifyvoice/stale"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r8.A3F()
            r0 = 2131891113(0x7f1213a9, float:1.9416937E38)
            goto L_0x02d5
        L_0x034d:
            X.1em r0 = X.C31631em.FAIL_TEMPORARILY_UNAVAILABLE
            if (r6 != r0) goto L_0x03c1
            java.lang.String r0 = "verifyvoice/verifyvoice/temporarily-unavailable"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = "voice-temporarily-unavailable"
            X.AnonymousClass2JN.A0K(r1, r0)
            java.lang.String r1 = r2.A09
            boolean r0 = X.AnonymousClass47P.A00(r1)
            if (r0 != 0) goto L_0x036c
            r0 = 2131891115(0x7f1213ab, float:1.941694E38)
            goto L_0x02d5
        L_0x036c:
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0391 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            X.0yx r0 = r8.A11     // Catch:{ NumberFormatException -> 0x0391 }
            r0.A0B(r1)     // Catch:{ NumberFormatException -> 0x0391 }
            r5 = 2131891116(0x7f1213ac, float:1.9416943E38)
            java.lang.Object[] r4 = X.C13680ns.A1b()     // Catch:{ NumberFormatException -> 0x0391 }
            r3 = 0
            X.013 r0 = r8.A01     // Catch:{ NumberFormatException -> 0x0391 }
            java.lang.String r0 = X.C28961Zl.A08(r0, r1)     // Catch:{ NumberFormatException -> 0x0391 }
            java.lang.String r0 = X.C13680ns.A0d(r8, r0, r4, r3, r5)     // Catch:{ NumberFormatException -> 0x0391 }
            r8.A3t(r0)     // Catch:{ NumberFormatException -> 0x0391 }
            r8.A3X(r1)     // Catch:{ NumberFormatException -> 0x0391 }
            goto L_0x03eb
        L_0x0391:
            r1 = move-exception
            java.lang.String r0 = "verifyvoice/verifyvoice/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2131891115(0x7f1213ab, float:1.941694E38)
            goto L_0x02d5
        L_0x039d:
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x03b6 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r8.A0A = r1     // Catch:{ NumberFormatException -> 0x03b6 }
            X.0yx r0 = r8.A11     // Catch:{ NumberFormatException -> 0x03b6 }
            r0.A0B(r1)     // Catch:{ NumberFormatException -> 0x03b6 }
            r0 = 32
            r8.A3V(r0)     // Catch:{ NumberFormatException -> 0x03b6 }
            long r0 = r8.A0A     // Catch:{ NumberFormatException -> 0x03b6 }
            r8.A3X(r0)     // Catch:{ NumberFormatException -> 0x03b6 }
            goto L_0x03eb
        L_0x03b6:
            r1 = move-exception
            java.lang.String r0 = "verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r8.A3V(r5)
            goto L_0x03eb
        L_0x03c1:
            X.1em r0 = X.C31631em.FAIL_NOT_ALLOWED
            if (r6 != r0) goto L_0x03eb
            r8.A3s(r7)
            goto L_0x03eb
        L_0x03c9:
            r1 = move-exception
            java.lang.String r0 = "verifyvoice/verifyvoice/retryafter failed to parse"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x03d0:
            r1 = 60000(0xea60, double:2.9644E-319)
        L_0x03d3:
            r5 = 2131891152(0x7f1213d0, float:1.9417016E38)
            java.lang.Object[] r4 = X.C13680ns.A1b()
            r3 = 0
            X.013 r0 = r8.A01
            java.lang.String r0 = X.C28961Zl.A08(r0, r1)
            java.lang.String r0 = X.C13680ns.A0d(r8, r0, r4, r3, r5)
        L_0x03e5:
            r8.A3t(r0)
            r8.A3X(r1)
        L_0x03eb:
            java.lang.String r0 = "flash"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0405
            X.0sC r0 = r8.A09
            int r1 = r0.A00()
            r0 = 8
            if (r1 == r0) goto L_0x0405
            X.0rz r1 = r8.A09
            java.lang.String r0 = "secondary_failed"
            r1.A0w(r0)
        L_0x0405:
            r0 = -1
            r8.A3S(r0)
            goto L_0x0217
        L_0x040b:
            r8.A3k(r2, r7)
            goto L_0x0217
        L_0x0410:
            r8.A3m(r2, r7)
            goto L_0x0217
        L_0x0415:
            java.lang.String r3 = "autoconf"
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyAutoconfResponse/status/"
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r6)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1em r0 = X.C31631em.YES
            java.lang.String r1 = "autoconf_authentication_successful"
            if (r6 != r0) goto L_0x0435
            X.0rz r0 = r8.A09
            r0.A0q(r1)
            r8.A3m(r2, r3)
            return
        L_0x0435:
            X.1em r0 = X.C31631em.SECURITY_CODE
            if (r6 != r0) goto L_0x0442
            X.0rz r0 = r8.A09
            r0.A0q(r1)
            r8.A3l(r2, r3)
            return
        L_0x0442:
            X.0rz r1 = r8.A09
            java.lang.String r0 = "autoconf_authentication_failed"
            r1.A0q(r0)
            X.0rz r1 = r8.A09
            java.lang.String r0 = r6.name()
            X.AnonymousClass2JN.A0K(r1, r0)
            int r0 = r8.A03
            r8.A3S(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass374.A0A(java.lang.Object):void");
    }
}
