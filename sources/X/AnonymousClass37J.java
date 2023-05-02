package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.37J  reason: invalid class name */
public class AnonymousClass37J extends C16690tT {
    public C47112Hq A00;
    public final int A01;
    public final C15860rz A02;
    public final AnonymousClass1KP A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final WeakReference A08;

    public AnonymousClass37J(C15860rz r2, AnonymousClass1KP r3, C46522Er r4, String str, String str2, String str3, String str4, int i2) {
        this.A01 = i2;
        this.A07 = str;
        this.A05 = str3;
        this.A04 = str2;
        this.A06 = str4;
        this.A02 = r2;
        this.A03 = r3;
        this.A08 = C13690nt.A0h(r4);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A06;
        int i2 = this.A01;
        try {
            C15860rz r2 = this.A02;
            int A012 = C13690nt.A01(C13680ns.A0B(r2), "reg_attempts_verify_2fa") + 1;
            C13680ns.A1S(r2, "reg_attempts_verify_2fa", A012);
            C47002Hc r1 = new C47002Hc(A012);
            if (str != null) {
                AnonymousClass1KP r22 = this.A03;
                String str2 = this.A04;
                String str3 = this.A05;
                r22.A08();
                byte[] A0C = r22.A0C(str2, str3);
                byte[] A0B = r22.A0B("verifySecurityCode");
                Log.i("http/registration/wamsys/verifysecuritycode");
                HashMap A0x = AnonymousClass000.A0x();
                A0x.put("client_metrics", r1.A00().toString().getBytes());
                r22.A0A(A0x);
                r22.A09(A0x);
                this.A00 = (C47112Hq) C31591ei.A00(new C47102Hp(r22.A00, r22.A0L, str, str2, str3, r22.A03(str2, "security_entrypoint"), r22.A04(), A0x, (byte[]) null, A0C, A0B, 0));
            } else if (i2 == 1) {
                this.A00 = this.A03.A02(r1, this.A04, this.A05, "email", (String) null);
            } else if (i2 == 2) {
                this.A00 = this.A03.A02(r1, this.A04, this.A05, "wipe", this.A07);
            }
            C47112Hq r0 = this.A00;
            if (r0 != null) {
                return r0.A03;
            }
            Log.i("SecurityCodeTask/doInBackground/null SecurityResult");
            return AnonymousClass423.ERROR_UNSPECIFIED;
        } catch (Exception e2) {
            Log.e("SecurityCodeTask/doInBackground/error ", e2);
            return AnonymousClass423.ERROR_UNSPECIFIED;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
        X.AnonymousClass29T.A01(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0123, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0126, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r10) {
        /*
            r9 = this;
            X.423 r10 = (X.AnonymousClass423) r10
            java.lang.ref.WeakReference r0 = r9.A08
            java.lang.Object r3 = r0.get()
            X.2Er r3 = (X.C46522Er) r3
            if (r3 != 0) goto L_0x0012
            java.lang.String r0 = "SecurityCodeTask/onPostExecute/null callback"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0011:
            return
        L_0x0012:
            r1 = 1
            com.obwhatsapp.registration.VerifyTwoFactorAuth r3 = (com.obwhatsapp.registration.VerifyTwoFactorAuth) r3
            com.obwhatsapp.CodeInputField r0 = r3.A0A
            r0.setEnabled(r1)
            android.widget.ProgressBar r1 = r3.A07
            r0 = 100
            r1.setProgress(r0)
            X.2Hq r7 = r9.A00
            r0 = 0
            r3.A0P = r0
            int r0 = r3.A00
            X.AnonymousClass29T.A00(r3, r0)
            r4 = 1
            com.obwhatsapp.CodeInputField r0 = r3.A0A
            r0.setEnabled(r4)
            android.widget.ProgressBar r1 = r3.A07
            r0 = 100
            r1.setProgress(r0)
            r8 = 0
            r3.A0b = r8
            X.0wP r0 = r3.A07
            X.0vz r1 = r3.A0d
            r0.A03(r1)
            int r0 = r10.ordinal()
            r5 = 1000(0x3e8, double:4.94E-321)
            switch(r0) {
                case 0: goto L_0x004c;
                case 1: goto L_0x00ac;
                case 2: goto L_0x01b6;
                case 3: goto L_0x00e1;
                case 4: goto L_0x0167;
                case 5: goto L_0x00d3;
                case 6: goto L_0x0127;
                case 7: goto L_0x0119;
                case 8: goto L_0x00ef;
                case 9: goto L_0x01b6;
                case 10: goto L_0x00c5;
                default: goto L_0x004b;
            }
        L_0x004b:
            return
        L_0x004c:
            X.AnonymousClass00B.A06(r7)
            int r0 = r3.A01
            if (r0 != r4) goto L_0x0073
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/reset-email-sent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131892300(0x7f12184c, float:1.9419344E38)
            r3.Afg(r0)
            java.lang.String r0 = "forgotPinDialogTag"
            r3.A2e(r0)
            r3.A38(r7)
            r3.A3A(r8)
            r4 = 0
            android.os.Handler r1 = r3.A0c
            java.lang.Runnable r0 = r3.A0e
            r1.postDelayed(r0, r4)
            return
        L_0x0073:
            java.lang.String r0 = r7.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/verified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A3A(r4)
            X.0rz r1 = r3.A09
            boolean r0 = r7.A09
            r1.A1L(r0)
            X.0rz r1 = r3.A09
            boolean r0 = r7.A08
            r1.A1K(r0)
            int r0 = r3.A01
            if (r0 != 0) goto L_0x009b
            X.02l r0 = X.AnonymousClass2JN.A09(r3)
            r3.A09 = r0
        L_0x009b:
            r0 = 19
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r1 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r1.<init>(r3, r0, r7)
            X.02l r0 = r3.A09
            if (r0 == 0) goto L_0x01d3
            X.0pt r0 = r3.A05
            r0.A0L(r1, r5)
            return
        L_0x00ac:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/unspecified"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.37J r0 = r3.A0P
            if (r0 == 0) goto L_0x00c2
            boolean r0 = X.C16690tT.A02(r0)
            if (r0 != 0) goto L_0x00c2
            r3.A0b = r4
            X.0wP r0 = r3.A07     // Catch:{ IllegalStateException -> 0x00c2 }
            r0.A02(r1)     // Catch:{ IllegalStateException -> 0x00c2 }
        L_0x00c2:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x00cf
        L_0x00c5:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/blocked"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3.A3A(r4)
            r0 = 124(0x7c, float:1.74E-43)
        L_0x00cf:
            X.AnonymousClass29T.A01(r3, r0)
            return
        L_0x00d3:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/too-many-guesses"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3.A3A(r4)
            X.4Ws r1 = r3.A0I
            r0 = 2131892313(0x7f121859, float:1.941937E38)
            goto L_0x0123
        L_0x00e1:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/incorrect"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3.A3A(r4)
            X.4Ws r1 = r3.A0I
            r0 = 2131891149(0x7f1213cd, float:1.941701E38)
            goto L_0x0123
        L_0x00ef:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/stale"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            int r2 = r3.A35()
            X.AnonymousClass00B.A06(r7)
            r3.A38(r7)
            int r1 = r3.A35()
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x0110
            if (r2 != r1) goto L_0x0110
            java.lang.String r1 = r3.A0V
            int r0 = r3.A01
            r3.A36(r0, r1, r4)
            return
        L_0x0110:
            r3.A3A(r4)
            X.4Ws r1 = r3.A0I
            r0 = 2131891113(0x7f1213a9, float:1.9416937E38)
            goto L_0x0123
        L_0x0119:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/reset-too-soon"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.4Ws r1 = r3.A0I
            r0 = 2131892301(0x7f12184d, float:1.9419346E38)
        L_0x0123:
            r1.A02(r0)
            return
        L_0x0127:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/guessed-too-fast"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.AnonymousClass00B.A06(r7)
            java.lang.String r0 = r7.A04     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r1 * r5
            X.4Ws r6 = r3.A0I     // Catch:{ NumberFormatException -> 0x014e }
            r5 = 2131891069(0x7f12137d, float:1.9416848E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ NumberFormatException -> 0x014e }
            X.013 r0 = r3.A01     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.String r0 = X.C28961Zl.A08(r0, r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.String r0 = X.C13680ns.A0d(r3, r0, r4, r8, r5)     // Catch:{ NumberFormatException -> 0x014e }
            r6.A03(r0)     // Catch:{ NumberFormatException -> 0x014e }
            r3.A37(r1)     // Catch:{ NumberFormatException -> 0x014e }
            return
        L_0x014e:
            r2 = move-exception
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/too_fast failed to parse: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r7.A04
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.w(r0, r2)
            X.4Ws r1 = r3.A0I
            r0 = 2131892313(0x7f121859, float:1.941937E38)
            r1.A02(r0)
            return
        L_0x0167:
            X.AnonymousClass00B.A06(r7)
            X.0rz r0 = r3.A09
            android.content.SharedPreferences r1 = X.C13680ns.A0B(r0)
            java.lang.String r0 = "registration_code"
            java.lang.String r1 = X.C13700nu.A0E(r1, r0)
            java.lang.String r0 = r3.A0V
            boolean r2 = X.C34901l3.A00(r0, r1)
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/mismatch "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r2)
            X.C13680ns.A1V(r0)
            com.obwhatsapp.CodeInputField r0 = r3.A0A
            X.C13700nu.A0T(r0)
            X.4Ws r1 = r3.A0I
            r0 = 2131892316(0x7f12185c, float:1.9419377E38)
            if (r2 == 0) goto L_0x0197
            r0 = 2131892277(0x7f121835, float:1.9419298E38)
        L_0x0197:
            r1.A02(r0)
            java.lang.String r0 = r7.A04     // Catch:{ NumberFormatException -> 0x01a5 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01a5 }
            long r0 = r0 * r5
            r3.A37(r0)     // Catch:{ NumberFormatException -> 0x01a5 }
            return
        L_0x01a5:
            r2 = move-exception
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/mismatch failed to parse: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r7.A04
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.w(r0, r2)
            return
        L_0x01b6:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/connectivity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 32
            X.4Ws r0 = r3.A0I
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01cd
            boolean r0 = r3.AIm()
            if (r0 != 0) goto L_0x01cd
            X.AnonymousClass29T.A01(r3, r1)
            return
        L_0x01cd:
            X.0yL r0 = r3.A0E
            X.AnonymousClass2JN.A0F(r3, r0, r1)
            return
        L_0x01d3:
            r1.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37J.A0A(java.lang.Object):void");
    }
}
