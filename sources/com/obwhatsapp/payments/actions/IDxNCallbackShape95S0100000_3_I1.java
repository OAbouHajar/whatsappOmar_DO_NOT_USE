package com.obwhatsapp.payments.actions;

import X.AnonymousClass000;
import X.AnonymousClass2HJ;
import X.AnonymousClass4XO;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.AnonymousClass68O;
import X.AnonymousClass69M;
import X.C112235iA;
import X.C112245iB;
import X.C112325iJ;
import X.C112485iZ;
import X.C119175wf;
import X.C1222768y;
import X.C1222868z;
import X.C14870pt;
import X.C18340wX;
import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class IDxNCallbackShape95S0100000_3_I1 extends C112485iZ {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape95S0100000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, C112235iA r12) {
        super(context, r9, r10, r11, "upi-get-psp-routing-and-list-keys");
        this.A01 = 1;
        this.A00 = r12;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape95S0100000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, C112325iJ r12) {
        super(context, r9, r10, r11, "upi-set-mpin");
        this.A01 = 4;
        this.A00 = r12;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape95S0100000_3_I1(Context context, C14870pt r11, C18340wX r12, AnonymousClass4XO r13, C112325iJ r14, AnonymousClass61W r15) {
        super(context, r11, r12, r13, r15, "upi-change-mpin", 7);
        this.A01 = 5;
        this.A00 = r14;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxNCallbackShape95S0100000_3_I1(android.content.Context r13, X.C14870pt r14, X.C18340wX r15, X.AnonymousClass4XO r16, X.C119175wf r17, X.AnonymousClass61W r18, X.C112715ix r19, java.lang.String r20, int r21) {
        /*
            r12 = this;
            r2 = r12
            r0 = r21
            r12.A01 = r0
            r1 = r17
            int r21 = 2 - r21
            if (r21 == 0) goto L_0x0020
            java.lang.String r9 = "upi-get-accounts"
            r12.A00 = r1
            r11 = 18
        L_0x0011:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r18
            r8 = r19
            r10 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0020:
            java.lang.String r9 = "upi-bind-device"
            r12.A00 = r1
            r11 = 20
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1.<init>(android.content.Context, X.0pt, X.0wX, X.4XO, X.5wf, X.61W, X.5ix, java.lang.String, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape95S0100000_3_I1(Context context, C14870pt r9, C112245iB r10, C18340wX r11, AnonymousClass4XO r12) {
        super(context, r9, r11, r12, "upi-get-token");
        this.A01 = 0;
        this.A00 = r10;
    }

    public void A03(AnonymousClass2HJ r3) {
        switch (this.A01) {
            case 0:
                super.A03(r3);
                AnonymousClass69M r1 = ((C112245iB) this.A00).A04;
                if (r1 != null) {
                    r1.ARs(r3, false);
                    return;
                }
                return;
            case 1:
                super.A03(r3);
                AnonymousClass68O r0 = ((C112235iA) this.A00).A00;
                if (r0 != null) {
                    r0.AVU(r3);
                    return;
                }
                return;
            case 2:
                super.A03(r3);
                Log.i(AnonymousClass000.A0g("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", r3));
                A06(r3);
                return;
            case 3:
                super.A03(r3);
                Log.i(AnonymousClass000.A0g("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", r3));
                C1222768y r12 = ((C119175wf) this.A00).A02;
                if (r12 != null) {
                    r12.ANT(r3, (ArrayList) null);
                    return;
                }
                return;
            default:
                super.A03(r3);
                C1222868z r02 = ((C112325iJ) this.A00).A00;
                if (r02 != null) {
                    r02.AX5(r3);
                    return;
                }
                return;
        }
    }

    public void A04(AnonymousClass2HJ r3) {
        switch (this.A01) {
            case 0:
                super.A04(r3);
                AnonymousClass69M r1 = ((C112245iB) this.A00).A04;
                if (r1 != null) {
                    r1.ARs(r3, false);
                    return;
                }
                return;
            case 1:
                super.A04(r3);
                AnonymousClass68O r0 = ((C112235iA) this.A00).A00;
                if (r0 != null) {
                    r0.AVU(r3);
                    return;
                }
                return;
            case 2:
                super.A04(r3);
                Log.i(AnonymousClass000.A0g("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", r3));
                A06(r3);
                return;
            case 3:
                super.A04(r3);
                Log.i(AnonymousClass000.A0g("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", r3));
                C1222768y r12 = ((C119175wf) this.A00).A02;
                if (r12 != null) {
                    r12.ANT(r3, (ArrayList) null);
                    return;
                }
                return;
            default:
                super.A04(r3);
                C1222868z r02 = ((C112325iJ) this.A00).A00;
                if (r02 != null) {
                    r02.AX5(r3);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r2 == null) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C28371Vv r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x004b;
                case 2: goto L_0x0100;
                case 3: goto L_0x0130;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A05(r13)
            java.lang.Object r0 = r12.A00
            X.5iJ r0 = (X.C112325iJ) r0
            X.68z r1 = r0.A00
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.AX5(r0)
        L_0x0014:
            return
        L_0x0015:
            super.A05(r13)
            X.1Vv r0 = X.C110115dX.A0X(r13)
            r5 = 0
            r7 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.String r11 = "token"
            java.lang.String r9 = r0.A0N(r11, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/token stored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r4 = r12.A00
            X.5iB r4 = (X.C112245iB) r4
            X.60V r8 = r4.A03
            monitor-enter(r8)
            goto L_0x0143
        L_0x003a:
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/token missing account node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x003f:
            java.lang.Object r0 = r12.A00
            X.5iB r0 = (X.C112245iB) r0
            X.69M r0 = r0.A04
            if (r0 == 0) goto L_0x0014
            r0.ARs(r5, r7)
            return
        L_0x004b:
            super.A05(r13)
            java.lang.Object r5 = r12.A00
            X.5iA r5 = (X.C112235iA) r5
            X.0wS r1 = r5.A08
            java.lang.String r0 = "UPI"
            X.19r r0 = r1.A05(r0)
            X.2Cc r1 = r0.AEJ()
            X.AnonymousClass00B.A06(r1)
            X.173 r0 = r5.A03
            java.util.ArrayList r0 = r1.AaD(r0, r13)
            X.5wy r1 = r5.A05
            X.4XO r4 = r5.A00
            X.5sK r0 = r1.A04(r4, r0)
            java.util.ArrayList r6 = r0.A02
            X.5hO r2 = r0.A00
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x007c
            r0 = 1
            if (r2 != 0) goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            java.lang.String r3 = "upi-get-psp-routing-and-list-keys"
            if (r0 == 0) goto L_0x00e2
            r1.A07 = r6
            r1.A03 = r2
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r6)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A05(r3)
            X.68O r7 = r5.A00
            if (r7 == 0) goto L_0x00bc
            X.5jS r7 = (X.C112805jS) r7
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x00ca
            if (r2 == 0) goto L_0x00ca
            r6 = 0
            X.0sq r5 = r7.A05
            X.0wS r2 = r7.A0P
            X.5qw r0 = new X.5qw
            r0.<init>(r7)
            X.5nc r1 = new X.5nc
            r1.<init>(r7, r2, r0)
            X.00o[] r0 = new X.C001300o[r6]
            r5.Ack(r1, r0)
        L_0x00bc:
            java.util.ArrayList r0 = r4.A05
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0014
            r0 = 500(0x1f4, float:7.0E-43)
            r4.A06(r3, r0)
            return
        L_0x00ca:
            X.1Vo r2 = r7.A0V
            java.lang.String r0 = "onPspRoutingAndListKeys error. showGenericError error: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.4XO r0 = r7.A01
            int r0 = r0.A00(r3)
            r1.append(r0)
            X.C110105dW.A1L(r2, r1)
            r7.A3T()
            goto L_0x00bc
        L_0x00e2:
            java.lang.String r0 = "PAY: received invalid data from upi-get-psp-routing-and-list-keys: psps: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r6)
            java.lang.String r0 = " pspRouting: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r2, r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.68O r1 = r5.A00
            if (r1 == 0) goto L_0x00bc
            X.2HJ r0 = X.C110115dX.A0N()
            r1.AVU(r0)
            goto L_0x00bc
        L_0x0100:
            super.A05(r13)
            java.lang.Object r5 = r12.A00
            X.5wf r5 = (X.C119175wf) r5
            X.5wr r0 = r5.A0I
            java.lang.String r4 = r0.A03()
            X.60V r0 = r5.A0C
            java.lang.String r3 = r5.A04
            java.lang.String r2 = r5.A05
            r0.A0K(r3, r2, r4)
            java.lang.String r0 = "PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.C112485iZ.A02(r3, r2, r4, r1)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.68y r1 = r5.A02
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.APe(r0)
            return
        L_0x0130:
            super.A05(r13)
            java.lang.Object r0 = r12.A00
            X.5wf r0 = (X.C119175wf) r0
            X.0sq r2 = r0.A0K
            r1 = 0
            com.whatsapp.util.IDxATaskShape27S0200000_3_I1 r0 = new com.whatsapp.util.IDxATaskShape27S0200000_3_I1
            r0.<init>(r13, r1, r12)
            X.C13700nu.A0W(r0, r2)
            return
        L_0x0143:
            X.0wT r10 = r8.A03     // Catch:{ JSONException -> 0x0171 }
            java.lang.String r1 = r10.A04()     // Catch:{ JSONException -> 0x0171 }
            X.0t3 r0 = r8.A00     // Catch:{ JSONException -> 0x0171 }
            long r2 = r0.A00()     // Catch:{ JSONException -> 0x0171 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0171 }
            if (r0 == 0) goto L_0x016c
            org.json.JSONObject r6 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0171 }
        L_0x0159:
            java.lang.String r1 = "v"
            java.lang.String r0 = "2"
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0171 }
            r6.put(r11, r9)     // Catch:{ JSONException -> 0x0171 }
            java.lang.String r0 = "tokenTs"
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x0171 }
            X.C110105dW.A1J(r10, r6)     // Catch:{ JSONException -> 0x0171 }
            goto L_0x0177
        L_0x016c:
            org.json.JSONObject r6 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x0171 }
            goto L_0x0159
        L_0x0171:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs storeToken threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0205 }
        L_0x0177:
            monitor-exit(r8)
            byte[] r6 = android.util.Base64.decode(r9, r7)
            X.69M r7 = r4.A04
            if (r7 == 0) goto L_0x0184
            r0 = 1
            r7.ARs(r5, r0)
        L_0x0184:
            X.5rW r11 = r4.A0A
            java.lang.String r10 = r4.A09
            X.0sq r2 = r4.A08
            X.0wR r8 = r4.A07
            java.lang.Class<X.5uq> r5 = X.C118535uq.class
            monitor-enter(r5)
            java.lang.String r3 = r8.A01()     // Catch:{ all -> 0x0202 }
            java.lang.String r4 = "|"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r0 = "com.whatsapp"
            r1.append(r0)     // Catch:{ Exception -> 0x01b3 }
            X.C110115dX.A15(r1, r4, r10)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ Exception -> 0x01b3 }
            byte[] r0 = X.AnonymousClass5xS.A02(r0)     // Catch:{ Exception -> 0x01b3 }
            byte[] r1 = X.AnonymousClass5xS.A04(r0, r6)     // Catch:{ Exception -> 0x01b3 }
            r0 = 2
            java.lang.String r9 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x01ba
        L_0x01b3:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/registerApp threw: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0202 }
            r9 = 0
        L_0x01ba:
            r1 = 0
            if (r9 == 0) goto L_0x01f6
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0202 }
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0202 }
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0202 }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0202 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0202 }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0202 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01e8
            r1 = 0
        L_0x01e8:
            X.AnonymousClass00B.A0G(r1)     // Catch:{ all -> 0x0202 }
            X.5nt r6 = new X.5nt     // Catch:{ all -> 0x0202 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0202 }
            X.C118535uq.A0D = r6     // Catch:{ all -> 0x0202 }
            X.C13700nu.A0W(r6, r2)     // Catch:{ all -> 0x0202 }
            goto L_0x0200
        L_0x01f6:
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/registerApp got null intent"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0202 }
            if (r7 == 0) goto L_0x0200
            r7.AVv(r1)     // Catch:{ all -> 0x0202 }
        L_0x0200:
            monitor-exit(r5)
            return
        L_0x0202:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0205:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1.A05(X.1Vv):void");
    }

    public final void A06(AnonymousClass2HJ r7) {
        C119175wf r5 = (C119175wf) this.A00;
        if (r5.A02 != null) {
            if (r7.A00 == 11453) {
                String A03 = r5.A0I.A03();
                AnonymousClass60V r0 = r5.A0C;
                String str = r5.A04;
                String str2 = r5.A05;
                r0.A0K(str, str2, A03);
                StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ");
                Log.i(AnonymousClass000.A0h(C112485iZ.A02(str, str2, A03, A0r), A0r));
            }
            r5.A02.APe(r7);
        }
    }
}
