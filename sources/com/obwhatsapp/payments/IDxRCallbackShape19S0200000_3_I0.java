package com.obwhatsapp.payments;

import X.AnonymousClass000;
import X.AnonymousClass1TV;
import X.AnonymousClass2HA;
import X.AnonymousClass2HJ;
import X.AnonymousClass5vZ;
import X.AnonymousClass5wP;
import X.C110115dX;
import X.C116655rj;
import X.C116685rm;
import X.C116695rn;
import X.C117555tB;
import X.C118345uX;
import X.C1222969a;
import X.C14880pu;
import X.C18340wX;
import X.C28371Vv;
import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class IDxRCallbackShape19S0200000_3_I0 extends AnonymousClass2HA {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxRCallbackShape19S0200000_3_I0(Context context, C18340wX r2, C14880pu r3, Object obj, Object obj2, int i2) {
        super(context, r2, r3);
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public List A01(C28371Vv r8) {
        if (1 - this.A02 != 0) {
            return super.A01(r8);
        }
        ArrayList A0u = AnonymousClass000.A0u();
        for (C28371Vv r4 : r8.A0O("error")) {
            if (r4 != null) {
                String A0N = r4.A0N("code", (String) null);
                String A0N2 = r4.A0N("text", (String) null);
                String A0N3 = r4.A0N("auth-ticket-fp", (String) null);
                if (A0N != null) {
                    int parseInt = Integer.parseInt(A0N);
                    AnonymousClass2HJ A0N4 = C110115dX.A0N();
                    A0N4.A00 = parseInt;
                    A0N4.A08 = A0N2;
                    A0N4.A06 = A0N3;
                    A0u.add(A0N4);
                }
            }
        }
        return A0u;
    }

    public void A03(AnonymousClass2HJ r4) {
        AnonymousClass1TV r0;
        switch (this.A02) {
            case 0:
                Log.i(AnonymousClass000.A0g("PAY: BrazilRemoveMerchantAccount onRequestError: ", r4));
                r0 = (AnonymousClass1TV) this.A01;
                break;
            case 1:
                StringBuilder A0r = AnonymousClass000.A0r("PAY: MFAAction/onRequestError - ");
                A0r.append("CREATE_AUTH_TICKET_BASED_FACTOR");
                Log.w(AnonymousClass000.A0e(r4, ": ", A0r));
                ((C116655rj) this.A01).A00.AQY(new AnonymousClass5wP(r4));
                return;
            case 2:
                C1222969a ACC = ((AnonymousClass5vZ) this.A00).A08.A03().ACC();
                if (ACC != null) {
                    ACC.reset();
                }
                r0 = (AnonymousClass1TV) this.A01;
                if (r0 == null) {
                    return;
                }
                break;
            case 3:
                ((C118345uX) this.A01).A00(r4);
                return;
            case 4:
                C116685rm r2 = (C116685rm) this.A01;
                r2.A01.A07.A06(AnonymousClass000.A0g("performNameCheck onError: ", r4));
                r2.A00.AQW(r4);
                return;
            default:
                C116695rn r22 = (C116695rn) this.A01;
                r22.A01.A07.A06(AnonymousClass000.A0g("performDobComplianceCheck onError: ", r4));
                r22.A00.AQW(r4);
                return;
        }
        r0.AWC(r4);
    }

    public void A04(AnonymousClass2HJ r4) {
        AnonymousClass1TV r0;
        switch (this.A02) {
            case 0:
                Log.e(AnonymousClass000.A0g("PAY: BrazilRemoveMerchantAccount onResponseError=", r4));
                r0 = (AnonymousClass1TV) this.A01;
                break;
            case 1:
                StringBuilder A0r = AnonymousClass000.A0r("PAY: MFAAction/onResponseError - ");
                A0r.append("CREATE_AUTH_TICKET_BASED_FACTOR");
                Log.e(AnonymousClass000.A0e(r4, ": ", A0r));
                ((C116655rj) this.A01).A00.AQY(new AnonymousClass5wP(r4));
                return;
            case 2:
                C1222969a ACC = ((AnonymousClass5vZ) this.A00).A08.A03().ACC();
                if (ACC != null) {
                    ACC.reset();
                }
                r0 = (AnonymousClass1TV) this.A01;
                if (r0 == null) {
                    return;
                }
                break;
            case 3:
                ((C118345uX) this.A01).A00(r4);
                return;
            case 4:
                C116685rm r2 = (C116685rm) this.A01;
                r2.A01.A07.A06(AnonymousClass000.A0g("performNameCheck onError: ", r4));
                r2.A00.AQW(r4);
                return;
            default:
                ((C117555tB) this.A00).A06.A05(AnonymousClass000.A0g("performDobComplianceCheck onResponseError: ", r4));
                C116695rn r22 = (C116695rn) this.A01;
                r22.A01.A07.A06(AnonymousClass000.A0g("performDobComplianceCheck onError: ", r4));
                r22.A00.AQW(r4);
                return;
        }
        r0.AWI(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x024d, code lost:
        com.whatsapp.util.Log.e("Pay: requestDyiReport -> error parsing the response");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0252, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C28371Vv r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x011d;
                case 1: goto L_0x0135;
                case 2: goto L_0x0020;
                case 3: goto L_0x0053;
                case 4: goto L_0x0224;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r10.A01
            X.5rn r3 = (X.C116695rn) r3
            r2 = 1
            X.5vG r0 = r3.A01
            X.1Vo r1 = r0.A07
            java.lang.String r0 = "performDobComplianceCheck onDobCheckComplete, eligible: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r2)
            X.C110105dW.A1L(r1, r0)
            X.695 r0 = r3.A00
            r0.APy(r2)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r4 = r10.A00
            X.5vZ r4 = (X.AnonymousClass5vZ) r4
            X.0wT r0 = r4.A05
            android.content.SharedPreferences r2 = r0.A01()
            java.lang.String r1 = "has_p2mlite_transactions"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x0044
            X.0sq r3 = r4.A0A
            X.0t6 r2 = r4.A03
            X.63h r1 = new X.63h
            r1.<init>(r10)
            X.5nb r0 = new X.5nb
            r0.<init>(r2, r1)
            X.C13700nu.A0W(r0, r3)
        L_0x0044:
            java.lang.Object r1 = r10.A01
            X.1TV r1 = (X.AnonymousClass1TV) r1
            if (r1 == 0) goto L_0x001f
            X.3vz r0 = new X.3vz
            r0.<init>()
            r1.AWJ(r0)
            return
        L_0x0053:
            java.lang.Object r4 = r10.A01
            X.5uX r4 = (X.C118345uX) r4
            X.1Vv r2 = X.C110115dX.A0X(r11)     // Catch:{ Exception -> 0x024d }
            X.2HJ r0 = X.AnonymousClass2HJ.A00(r2)     // Catch:{ Exception -> 0x024d }
            if (r0 != 0) goto L_0x0078
            r1 = 500(0x1f4, float:7.0E-43)
            if (r2 != 0) goto L_0x006b
            X.2HJ r0 = new X.2HJ     // Catch:{ Exception -> 0x024d }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x024d }
            goto L_0x0078
        L_0x006b:
            java.lang.String r0 = "document"
            X.1Vv r8 = r2.A0J(r0)     // Catch:{ Exception -> 0x024d }
            if (r8 != 0) goto L_0x007d
            X.2HJ r0 = new X.2HJ     // Catch:{ Exception -> 0x024d }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x024d }
        L_0x0078:
            r4.A00(r0)     // Catch:{ Exception -> 0x024d }
            goto L_0x023f
        L_0x007d:
            java.lang.String r0 = "creation"
            r2 = 0
            long r5 = r8.A0D(r0, r2)     // Catch:{ Exception -> 0x024d }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            java.lang.String r7 = "expiration"
            long r2 = r8.A0D(r7, r2)     // Catch:{ Exception -> 0x024d }
            long r0 = r0 * r2
            byte[] r9 = r8.A01     // Catch:{ Exception -> 0x024d }
            java.lang.String r2 = "DyiViewModel/request-report/on-success"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x024d }
            X.5nH r2 = r4.A03     // Catch:{ Exception -> 0x024d }
            X.5wn r3 = r2.A07     // Catch:{ Exception -> 0x024d }
            java.lang.String r7 = r2.A09     // Catch:{ Exception -> 0x024d }
            monitor-enter(r3)     // Catch:{ Exception -> 0x024d }
            java.lang.String r8 = "dyiReportManager/on-report-available"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ all -> 0x024a }
            java.io.File r8 = r3.A04(r7)     // Catch:{ IOException -> 0x00d5 }
            X.C004101u.A09(r8, r9)     // Catch:{ IOException -> 0x00d5 }
            X.5sN r8 = X.C119255wn.A00(r9, r5)     // Catch:{ all -> 0x024a }
            r3.A01 = r8     // Catch:{ all -> 0x024a }
            if (r8 != 0) goto L_0x00b7
            java.lang.String r0 = "dyiReportManager/on-report-available/cannot-create-message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x024a }
            goto L_0x00db
        L_0x00b7:
            X.0wT r8 = r3.A0A     // Catch:{ all -> 0x024a }
            r8.A0L(r7, r5)     // Catch:{ all -> 0x024a }
            android.content.SharedPreferences$Editor r6 = X.C110105dW.A06(r8)     // Catch:{ all -> 0x024a }
            java.lang.String r5 = "personal"
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x024a }
            if (r5 == 0) goto L_0x00d2
            java.lang.String r5 = "payment_dyi_report_expiration_timestamp"
        L_0x00ca:
            X.C13680ns.A0x(r6, r5, r0)     // Catch:{ all -> 0x024a }
            r0 = 2
            r8.A0D(r0, r7)     // Catch:{ all -> 0x024a }
            goto L_0x00db
        L_0x00d2:
            java.lang.String r5 = "business_payment_dyi_report_expiration_timestamp"
            goto L_0x00ca
        L_0x00d5:
            r1 = move-exception
            java.lang.String r0 = "dyiReportManager/on-report-available/cannot-save"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x024a }
        L_0x00db:
            monitor-exit(r3)     // Catch:{ Exception -> 0x024d }
            X.5sN r0 = r3.A03(r7)     // Catch:{ Exception -> 0x024d }
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "DyiViewModel/request-report/on-error :: invalid report info"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x024d }
            X.027 r0 = r2.A02     // Catch:{ Exception -> 0x024d }
            java.lang.Integer r3 = X.C13680ns.A0X()     // Catch:{ Exception -> 0x024d }
            r0.A09(r3)     // Catch:{ Exception -> 0x024d }
            X.027 r2 = r2.A03     // Catch:{ Exception -> 0x024d }
            r1 = 500(0x1f4, float:7.0E-43)
            X.2HJ r0 = new X.2HJ     // Catch:{ Exception -> 0x024d }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x024d }
            X.C110115dX.A0x(r2, r3, r0)     // Catch:{ Exception -> 0x024d }
        L_0x00fc:
            int r1 = r4.A00     // Catch:{ Exception -> 0x024d }
            r0 = 1
            if (r1 != r0) goto L_0x0119
            com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment r0 = r4.A02     // Catch:{ Exception -> 0x024d }
            if (r0 == 0) goto L_0x001f
            r0.A1D()     // Catch:{ Exception -> 0x024d }
            goto L_0x0240
        L_0x010a:
            X.027 r1 = r2.A01     // Catch:{ Exception -> 0x024d }
            X.5sN r0 = r3.A03(r7)     // Catch:{ Exception -> 0x024d }
            r1.A09(r0)     // Catch:{ Exception -> 0x024d }
            X.027 r0 = r2.A02     // Catch:{ Exception -> 0x024d }
            X.C119255wn.A01(r0, r3, r7)     // Catch:{ Exception -> 0x024d }
            goto L_0x00fc
        L_0x0119:
            if (r1 != 0) goto L_0x001f
            goto L_0x0241
        L_0x011d:
            java.lang.String r0 = "Pay: BrazilRemoveMerchantAccount successfully removed merchant account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r10.A00
            X.5ul r0 = (X.C118485ul) r0
            X.0sq r2 = r0.A08
            java.lang.Object r1 = r10.A01
            X.1TV r1 = (X.AnonymousClass1TV) r1
            X.65D r0 = new X.65D
            r0.<init>(r10, r1)
            r2.Acl(r0)
            return
        L_0x0135:
            java.lang.Object r5 = r10.A01
            X.5rj r5 = (X.C116655rj) r5
            X.1Vv r1 = X.C110115dX.A0X(r11)
            r7 = 9
            r6 = 0
            if (r1 == 0) goto L_0x01a0
            X.2HJ r0 = X.AnonymousClass2HJ.A00(r1)     // Catch:{ 1W9 -> 0x01ab }
            if (r0 == 0) goto L_0x014e
            X.01Q r1 = new X.01Q     // Catch:{ 1W9 -> 0x01ab }
            r1.<init>(r6, r0)     // Catch:{ 1W9 -> 0x01ab }
            goto L_0x01bb
        L_0x014e:
            java.lang.String r0 = "auth-ticket"
            X.1Vv r1 = r1.A0J(r0)     // Catch:{ 1W9 -> 0x01ab }
            if (r1 != 0) goto L_0x0161
            X.2HJ r0 = new X.2HJ     // Catch:{ 1W9 -> 0x01ab }
            r0.<init>((int) r7)     // Catch:{ 1W9 -> 0x01ab }
            X.01Q r1 = new X.01Q     // Catch:{ 1W9 -> 0x01ab }
            r1.<init>(r6, r0)     // Catch:{ 1W9 -> 0x01ab }
            goto L_0x01bb
        L_0x0161:
            java.lang.String r0 = "id"
            r1.A0M(r0)     // Catch:{ 1W9 -> 0x01ab }
            java.lang.String r0 = "issued-at"
            r1.A0C(r0)     // Catch:{ 1W9 -> 0x01ab }
            java.lang.String r9 = "ttl"
            r1.A0C(r9)     // Catch:{ 1W9 -> 0x01ab }
            X.5qn r8 = new X.5qn     // Catch:{ 1W9 -> 0x01ab }
            r8.<init>()     // Catch:{ 1W9 -> 0x01ab }
            java.lang.String r0 = "capabilities"
            X.1Vv r0 = r1.A0K(r0)     // Catch:{ 1W9 -> 0x01ab }
            X.1Vv[] r4 = r0.A03     // Catch:{ 1W9 -> 0x01ab }
            if (r4 == 0) goto L_0x019a
            int r3 = r4.length     // Catch:{ 1W9 -> 0x01ab }
            r2 = 0
        L_0x0181:
            if (r2 >= r3) goto L_0x019a
            r1 = r4[r2]     // Catch:{ 1W9 -> 0x01ab }
            java.lang.String r0 = "name"
            r1.A0M(r0)     // Catch:{ 1W9 -> 0x01ab }
            r1.A0C(r9)     // Catch:{ 1W9 -> 0x01ab }
            X.5pM r1 = new X.5pM     // Catch:{ 1W9 -> 0x01ab }
            r1.<init>()     // Catch:{ 1W9 -> 0x01ab }
            java.util.List r0 = r8.A00     // Catch:{ 1W9 -> 0x01ab }
            r0.add(r1)     // Catch:{ 1W9 -> 0x01ab }
            int r2 = r2 + 1
            goto L_0x0181
        L_0x019a:
            X.01Q r1 = new X.01Q     // Catch:{ 1W9 -> 0x01ab }
            r1.<init>(r8, r6)     // Catch:{ 1W9 -> 0x01ab }
            goto L_0x01bb
        L_0x01a0:
            X.2HJ r0 = new X.2HJ
            r0.<init>((int) r7)
            X.01Q r1 = new X.01Q
            r1.<init>(r6, r0)
            goto L_0x01bb
        L_0x01ab:
            r1 = move-exception
            java.lang.String r0 = "PAY: parseResult corruptStreamException"
            com.whatsapp.util.Log.e(r0, r1)
            X.2HJ r0 = new X.2HJ
            r0.<init>((int) r7)
            X.01Q r1 = new X.01Q
            r1.<init>(r6, r0)
        L_0x01bb:
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x0212
            X.5um r0 = r5.A01     // Catch:{ JSONException -> 0x01fc }
            X.5rl r0 = r0.A06     // Catch:{ JSONException -> 0x01fc }
            java.lang.String r6 = "td"
            X.0wT r4 = r0.A00     // Catch:{ JSONException -> 0x01f5 }
            java.lang.String r1 = r4.A04()     // Catch:{ JSONException -> 0x01f5 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x01f5 }
            if (r0 != 0) goto L_0x01eb
            org.json.JSONObject r3 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x01f5 }
            org.json.JSONObject r2 = r3.optJSONObject(r6)     // Catch:{ JSONException -> 0x01f5 }
            if (r2 != 0) goto L_0x01df
            org.json.JSONObject r2 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x01f5 }
        L_0x01df:
            java.lang.String r1 = "td_is_committed"
            r0 = 1
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x01f5 }
            r3.put(r6, r2)     // Catch:{ JSONException -> 0x01f5 }
            X.C110105dW.A1J(r4, r3)     // Catch:{ JSONException -> 0x01f5 }
        L_0x01eb:
            X.694 r1 = r5.A00     // Catch:{ JSONException -> 0x01fc }
            java.lang.Object r0 = X.C13690nt.A0Y()     // Catch:{ JSONException -> 0x01fc }
            r1.AWP(r0)     // Catch:{ JSONException -> 0x01fc }
            return
        L_0x01f5:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore markCommitted failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x01fc }
            throw r1     // Catch:{ JSONException -> 0x01fc }
        L_0x01fc:
            r1 = move-exception
            java.lang.String r0 = "PAY: MultiFactorAuthFactors/createTrustedDevice/error while marking trusted device as commited: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.694 r2 = r5.A00
            r1 = 0
            X.5wP r0 = new X.5wP
            r0.<init>((int) r1)
            r2.AQY(r0)
            return
        L_0x0212:
            X.694 r2 = r5.A00
            java.lang.Object r1 = r1.A01
            X.AnonymousClass00B.A06(r1)
            X.2HJ r1 = (X.AnonymousClass2HJ) r1
            X.5wP r0 = new X.5wP
            r0.<init>((X.AnonymousClass2HJ) r1)
            r2.AQY(r0)
            return
        L_0x0224:
            java.lang.Object r3 = r10.A01
            X.5rm r3 = (X.C116685rm) r3
            r2 = 1
            X.5vG r0 = r3.A01
            X.1Vo r1 = r0.A07
            java.lang.String r0 = "performNameCheck onNameCheckComplete, eligible: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r2)
            X.C110105dW.A1L(r1, r0)
            X.696 r0 = r3.A00
            r0.ATr(r2)
            return
        L_0x023f:
            return
        L_0x0240:
            return
        L_0x0241:
            X.0pL r0 = r4.A01     // Catch:{ Exception -> 0x024d }
            X.AnonymousClass00B.A06(r0)     // Catch:{ Exception -> 0x024d }
            r0.Ac1()     // Catch:{ Exception -> 0x024d }
            return
        L_0x024a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x024d }
            throw r0     // Catch:{ Exception -> 0x024d }
        L_0x024d:
            java.lang.String r0 = "Pay: requestDyiReport -> error parsing the response"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.IDxRCallbackShape19S0200000_3_I0.A05(X.1Vv):void");
    }
}
