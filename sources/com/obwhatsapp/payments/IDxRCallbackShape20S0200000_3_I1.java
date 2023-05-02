package com.obwhatsapp.payments;

import X.AnonymousClass000;
import X.AnonymousClass1TV;
import X.AnonymousClass1Z7;
import X.AnonymousClass2HA;
import X.AnonymousClass2HJ;
import X.AnonymousClass3K4;
import X.AnonymousClass5u7;
import X.AnonymousClass692;
import X.AnonymousClass693;
import X.C111815hS;
import X.C112855jo;
import X.C116075qm;
import X.C116145qt;
import X.C116725rq;
import X.C116735rr;
import X.C117575tD;
import X.C118065u0;
import X.C118155uE;
import X.C118165uF;
import X.C118185uH;
import X.C118435ug;
import X.C118445uh;
import X.C118545ur;
import X.C1222468v;
import X.C14880pu;
import X.C18310wU;
import X.C18340wX;
import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

public class IDxRCallbackShape20S0200000_3_I1 extends AnonymousClass2HA {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxRCallbackShape20S0200000_3_I1(Context context, C18340wX r2, C14880pu r3, Object obj, Object obj2, int i2) {
        super(context, r2, r3);
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A03(AnonymousClass2HJ r4) {
        switch (this.A02) {
            case 0:
                ((C18310wU) this.A00).A0I.A06(AnonymousClass000.A0g("Tos onRequestError: ", r4));
                break;
            case 1:
                ((AnonymousClass5u7) this.A01).A00(r4);
                return;
            case 2:
                ((C118545ur) this.A00).A0A.A05(AnonymousClass000.A0g("BrazilAddCredentialAction : onRequestError: ", r4));
                C112855jo.A09(((C116735rr) this.A01).A00, (Map) null, r4.A00);
                return;
            case 3:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = ((C116145qt) this.A01).A00;
                brazilPaymentTransactionDetailActivity.Ac1();
                AnonymousClass3K4.A0r(brazilPaymentTransactionDetailActivity, R.string.str0397, R.string.str1031);
                return;
            case 4:
                Log.i(AnonymousClass000.A0g("PAY: BrazilFetchNetworkInfoAction/onRequestError: ", r4));
                ((C118155uE) this.A01).A00((C117575tD) null);
                return;
            case 5:
                ((C116725rq) this.A01).A00.A00("on_failure");
                return;
            case 6:
                ((C118445uh) this.A00).A06.ARo(r4, (List) null);
                return;
            case 7:
                Log.i(AnonymousClass000.A0g("PAY: BrazilGetVerificationMethods onRequestError: ", r4));
                ((C1222468v) this.A01).AWW(r4, (List) null);
                return;
            case 8:
                Log.i(AnonymousClass000.A0g("PAY: BrazilFetchEloChallengeIdAction onRequestError: ", r4));
                ((C116075qm) this.A01).A00.A02(r4, (String) null);
                return;
            case 9:
                Log.i(AnonymousClass000.A0g("PAY: BrazilSubmitVerificationMethodAction onRequestError: ", r4));
                ((C118165uF) this.A01).A00(r4, (C111815hS) null);
                return;
            case 10:
                break;
            case 11:
                ((C118065u0) this.A01).A00(r4);
                return;
            case 12:
                ((C118435ug) this.A00).A05.A05(AnonymousClass000.A0l(AnonymousClass000.A0r("providerKey: onRequestError "), r4.A00));
                ((AnonymousClass692) this.A01).AVP(r4);
                return;
            case 13:
                ((AnonymousClass693) this.A01).AQW(r4);
                return;
            case 14:
                ((C118185uH) this.A01).A00(r4);
                return;
            default:
                ((BrazilPayBloksActivity) this.A00).A3A((AnonymousClass1Z7) this.A01);
                return;
        }
        ((AnonymousClass1TV) this.A01).AWC(r4);
    }

    public void A04(AnonymousClass2HJ r4) {
        switch (this.A02) {
            case 0:
                ((C18310wU) this.A00).A0I.A06(AnonymousClass000.A0g("Tos onResponseError: ", r4));
                break;
            case 1:
                ((AnonymousClass5u7) this.A01).A00(r4);
                return;
            case 2:
                ((C118545ur) this.A00).A0A.A05(AnonymousClass000.A0g("BrazilAddCredentialAction : onResponseError: ", r4));
                C112855jo.A09(((C116735rr) this.A01).A00, (Map) null, r4.A00);
                return;
            case 3:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = ((C116145qt) this.A01).A00;
                brazilPaymentTransactionDetailActivity.Ac1();
                AnonymousClass3K4.A0r(brazilPaymentTransactionDetailActivity, R.string.str0397, R.string.str1031);
                return;
            case 4:
                Log.i(AnonymousClass000.A0g("PAY: BrazilFetchNetworkInfoAction/onResponseError: ", r4));
                ((C118155uE) this.A01).A00((C117575tD) null);
                return;
            case 5:
                ((C116725rq) this.A01).A00.A00("on_failure");
                return;
            case 6:
                ((C118445uh) this.A00).A06.ARo(r4, (List) null);
                return;
            case 7:
                Log.i(AnonymousClass000.A0g("PAY: BrazilGetVerificationMethods onResponseError: ", r4));
                ((C1222468v) this.A01).AWW(r4, (List) null);
                return;
            case 8:
                Log.i(AnonymousClass000.A0g("PAY: BrazilFetchEloChallengeIdAction onResponseError: ", r4));
                ((C116075qm) this.A01).A00.A02(r4, (String) null);
                return;
            case 9:
                Log.i(AnonymousClass000.A0g("PAY: BrazilSubmitVerificationMethodAction onResponseError: ", r4));
                ((C118165uF) this.A01).A00(r4, (C111815hS) null);
                return;
            case 10:
                break;
            case 11:
                ((C118065u0) this.A01).A00(r4);
                return;
            case 12:
                ((C118435ug) this.A00).A05.A05(AnonymousClass000.A0l(AnonymousClass000.A0r("providerKey: onResponseError "), r4.A00));
                ((AnonymousClass692) this.A01).AVP(r4);
                return;
            case 13:
                ((AnonymousClass693) this.A01).AQW(r4);
                return;
            case 14:
                A03(r4);
                return;
            default:
                ((BrazilPayBloksActivity) this.A00).A3A((AnonymousClass1Z7) this.A01);
                return;
        }
        ((AnonymousClass1TV) this.A01).AWI(r4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C28371Vv r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A02
            r10 = r18
            switch(r1) {
                case 0: goto L_0x0401;
                case 1: goto L_0x0597;
                case 2: goto L_0x034c;
                case 3: goto L_0x01bb;
                case 4: goto L_0x0273;
                case 5: goto L_0x04fe;
                case 6: goto L_0x01be;
                case 7: goto L_0x0140;
                case 8: goto L_0x0119;
                case 9: goto L_0x00ce;
                case 10: goto L_0x00c1;
                case 11: goto L_0x005c;
                case 12: goto L_0x0493;
                case 13: goto L_0x0442;
                case 14: goto L_0x01aa;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r5 = "1"
            java.util.HashMap r4 = X.AnonymousClass000.A0x()
            java.lang.String r1 = "account"
            X.1Vv r2 = r10.A0K(r1)     // Catch:{ 1W9 -> 0x0044 }
            X.2HJ r1 = X.AnonymousClass2HJ.A00(r2)     // Catch:{ 1W9 -> 0x0044 }
            if (r1 == 0) goto L_0x0027
            java.lang.Object r2 = r0.A00     // Catch:{ 1W9 -> 0x0044 }
            com.obwhatsapp.payments.ui.BrazilPayBloksActivity r2 = (com.obwhatsapp.payments.ui.BrazilPayBloksActivity) r2     // Catch:{ 1W9 -> 0x0044 }
            java.lang.Object r1 = r0.A01     // Catch:{ 1W9 -> 0x0044 }
            X.1Z7 r1 = (X.AnonymousClass1Z7) r1     // Catch:{ 1W9 -> 0x0044 }
            r2.A3A(r1)     // Catch:{ 1W9 -> 0x0044 }
            return
        L_0x0027:
            java.lang.String r1 = "result"
            X.1Vv r3 = r2.A0K(r1)     // Catch:{ 1W9 -> 0x0044 }
            java.lang.String r2 = "upload_status"
            boolean r1 = X.C110105dW.A1U(r3, r2, r5)     // Catch:{ 1W9 -> 0x0044 }
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = "is_doc_upload_completed"
            r4.put(r1, r5)     // Catch:{ 1W9 -> 0x0044 }
            java.lang.Object r2 = r0.A01     // Catch:{ 1W9 -> 0x0044 }
            X.1Z7 r2 = (X.AnonymousClass1Z7) r2     // Catch:{ 1W9 -> 0x0044 }
            java.lang.String r1 = "on_success"
            r2.A01(r1, r4)     // Catch:{ 1W9 -> 0x0044 }
            return
        L_0x0044:
            r3 = move-exception
            java.lang.Object r1 = r0.A00
            X.5jo r1 = (X.C112855jo) r1
            X.1Vo r2 = r1.A0M
            java.lang.String r1 = "PAY: performAnswerDocUploadStepUp : invalid response"
            r2.A0A(r1, r3)
        L_0x0050:
            java.lang.Object r1 = r0.A00
            com.obwhatsapp.payments.ui.BrazilPayBloksActivity r1 = (com.obwhatsapp.payments.ui.BrazilPayBloksActivity) r1
            java.lang.Object r0 = r0.A01
            X.1Z7 r0 = (X.AnonymousClass1Z7) r0
            r1.A3A(r0)
            return
        L_0x005c:
            if (r18 == 0) goto L_0x00b5
            r1 = 0
            X.1Vv r2 = r10.A0I(r1)
            if (r2 == 0) goto L_0x00b5
            java.lang.String r1 = "account-eligibility-state"
            java.lang.String r4 = X.C28371Vv.A05(r2, r1)
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r3 = r0.A01
            X.5u0 r3 = (X.C118065u0) r3
            X.5vG r2 = r3.A00
            X.1Vo r1 = r2.A07
            java.lang.String r0 = "getComplianceStatus onStatus: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)
            r1.A06(r0)
            int r0 = r4.hashCode()
            switch(r0) {
                case -2093369835: goto L_0x008f;
                case -1753873386: goto L_0x0092;
                case 35394935: goto L_0x0095;
                case 1383663147: goto L_0x0098;
                default: goto L_0x0089;
            }
        L_0x0089:
            java.lang.String r0 = "Compliance state unknown"
            r1.A06(r0)
            return
        L_0x008f:
            java.lang.String r0 = "UNSUPPORTED"
            goto L_0x009a
        L_0x0092:
            java.lang.String r0 = "NEEDS_MORE_INFO"
            goto L_0x009a
        L_0x0095:
            java.lang.String r0 = "PENDING"
            goto L_0x009a
        L_0x0098:
            java.lang.String r0 = "COMPLETED"
        L_0x009a:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0089
            r2.A00 = r4
            X.5rt r1 = r3.A01
            java.util.HashMap r2 = X.AnonymousClass000.A0x()
            java.lang.String r0 = "compliance_status"
            r2.put(r0, r4)
            X.1Z7 r1 = r1.A00
            java.lang.String r0 = "on_success"
            r1.A01(r0, r2)
            return
        L_0x00b5:
            java.lang.Object r1 = r0.A01
            X.5u0 r1 = (X.C118065u0) r1
            X.2HJ r0 = X.C110115dX.A0N()
            r1.A00(r0)
            return
        L_0x00c1:
            java.lang.Object r1 = r0.A01
            X.1TV r1 = (X.AnonymousClass1TV) r1
            X.3vz r0 = new X.3vz
            r0.<init>()
            r1.AWJ(r0)
            return
        L_0x00ce:
            X.1Vv r6 = X.C110115dX.A0X(r10)
            r5 = 0
            if (r6 == 0) goto L_0x010d
            java.lang.String r1 = "card"
            X.1Vv r4 = r6.A0J(r1)
            if (r4 == 0) goto L_0x010b
            X.5hS r3 = new X.5hS
            r3.<init>()
            java.lang.Object r1 = r0.A00
            X.5tK r1 = (X.C117645tK) r1
            X.173 r2 = r1.A02
            r1 = 0
            r3.A01(r2, r4, r1)
        L_0x00ec:
            java.lang.String r1 = "elo"
            X.1Vv r2 = r6.A0J(r1)
            if (r2 == 0) goto L_0x0103
            java.lang.String r1 = "challenge_id"
            java.lang.String r2 = r2.A0N(r1, r5)
            java.lang.Object r1 = r0.A00
            X.5tK r1 = (X.C117645tK) r1
            X.5uv r1 = r1.A05
            r1.A00(r2)
        L_0x0103:
            java.lang.Object r0 = r0.A01
            X.5uF r0 = (X.C118165uF) r0
            r0.A00(r5, r3)
            return
        L_0x010b:
            r3 = r5
            goto L_0x00ec
        L_0x010d:
            java.lang.Object r1 = r0.A01
            X.5uF r1 = (X.C118165uF) r1
            X.2HJ r0 = X.C110115dX.A0N()
            r1.A00(r0, r5)
            return
        L_0x0119:
            X.1Vv r3 = X.C110115dX.A0X(r10)
            r2 = 0
            if (r3 == 0) goto L_0x0132
            java.lang.String r1 = "challenge_id"
            java.lang.String r1 = r3.A0N(r1, r2)
            if (r1 == 0) goto L_0x0132
            java.lang.Object r0 = r0.A01
            X.5qm r0 = (X.C116075qm) r0
            X.5vY r0 = r0.A00
            r0.A02(r2, r1)
            return
        L_0x0132:
            java.lang.Object r0 = r0.A01
            X.5qm r0 = (X.C116075qm) r0
            X.2HJ r1 = X.C110115dX.A0N()
            X.5vY r0 = r0.A00
            r0.A02(r1, r2)
            return
        L_0x0140:
            X.1Vv r2 = X.C110115dX.A0X(r10)
            if (r2 == 0) goto L_0x01bb
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "verify-method-list"
            X.1Vv r6 = r2.A0J(r1)
            java.lang.String r1 = "card"
            X.1Vv r2 = r2.A0J(r1)
            r4 = 0
            if (r2 == 0) goto L_0x0179
            X.5hS r3 = new X.5hS
            r3.<init>()
            java.lang.Object r1 = r0.A00
            X.5ut r1 = (X.C118565ut) r1
            X.173 r1 = r1.A05
            r3.A01(r1, r2, r4)
            X.1cl r2 = r3.A05()
            X.1lr r2 = (X.C35391lr) r2
            boolean r1 = r3.A0a
            if (r1 == 0) goto L_0x0179
            java.lang.Object r0 = r0.A01
            X.68v r0 = (X.C1222468v) r0
            r0.AOB(r2)
            return
        L_0x0179:
            if (r6 == 0) goto L_0x01bb
            X.1Vv[] r1 = r6.A03
            if (r1 == 0) goto L_0x0193
            int r3 = r1.length
            if (r3 <= 0) goto L_0x0193
        L_0x0182:
            X.1Vv r2 = r6.A0I(r4)
            X.638 r1 = new X.638
            r1.<init>(r2)
            r5.add(r1)
            int r4 = r4 + 1
            if (r4 >= r3) goto L_0x0193
            goto L_0x0182
        L_0x0193:
            boolean r3 = r5.isEmpty()
            r2 = 0
            java.lang.Object r1 = r0.A01
            X.68v r1 = (X.C1222468v) r1
            if (r3 != 0) goto L_0x01a2
            r1.AWW(r2, r5)
            return
        L_0x01a2:
            X.2HJ r0 = X.C110115dX.A0N()
            r1.AWW(r0, r2)
            return
        L_0x01aa:
            X.1Vv r1 = X.C110115dX.A0X(r10)
            if (r1 == 0) goto L_0x01bc
            X.2HJ r1 = X.AnonymousClass2HJ.A00(r1)
        L_0x01b4:
            java.lang.Object r0 = r0.A01
            X.5uH r0 = (X.C118185uH) r0
            r0.A00(r1)
        L_0x01bb:
            return
        L_0x01bc:
            r1 = 0
            goto L_0x01b4
        L_0x01be:
            java.lang.String r6 = "account"
            X.1Vv r1 = r10.A0J(r6)
            r9 = 0
            if (r1 == 0) goto L_0x01d7
            X.2HJ r1 = X.AnonymousClass2HJ.A00(r1)
            if (r1 == 0) goto L_0x01e2
            java.lang.Object r0 = r0.A00
            X.5uh r0 = (X.C118445uh) r0
            X.68N r0 = r0.A06
        L_0x01d3:
            r0.ARo(r1, r9)
            return
        L_0x01d7:
            java.lang.Object r0 = r0.A00
            X.5uh r0 = (X.C118445uh) r0
            X.68N r0 = r0.A06
            X.2HJ r1 = X.C110115dX.A0N()
            goto L_0x01d3
        L_0x01e2:
            java.lang.Object r3 = r0.A01     // Catch:{ 1W9 -> 0x025b }
            X.5rK r3 = (X.C116405rK) r3     // Catch:{ 1W9 -> 0x025b }
            java.lang.Object r2 = r0.A00     // Catch:{ 1W9 -> 0x025b }
            X.5uh r2 = (X.C118445uh) r2     // Catch:{ 1W9 -> 0x025b }
            X.0so r4 = r2.A01     // Catch:{ 1W9 -> 0x025b }
            java.lang.String r1 = "iq"
            X.C28371Vv.A06(r10, r1)     // Catch:{ 1W9 -> 0x025b }
            X.1Vv r3 = r3.A00     // Catch:{ 1W9 -> 0x025b }
            r7 = 2
            java.lang.String[] r15 = new java.lang.String[r7]     // Catch:{ 1W9 -> 0x025b }
            r1 = 0
            r15[r1] = r6     // Catch:{ 1W9 -> 0x025b }
            java.lang.String r5 = "action"
            r8 = 1
            r15[r8] = r5     // Catch:{ 1W9 -> 0x025b }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.Long r12 = X.AnonymousClass3K2.A0X()     // Catch:{ 1W9 -> 0x025b }
            java.lang.Long r13 = X.AnonymousClass3K2.A0Y()     // Catch:{ 1W9 -> 0x025b }
            java.lang.String r14 = "br-get-payout-banks"
            r16 = 0
            X.C32271fx.A01(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ 1W9 -> 0x025b }
            com.facebook.redex.IDxNFunctionShape44S0200000_3_I1 r5 = new com.facebook.redex.IDxNFunctionShape44S0200000_3_I1     // Catch:{ 1W9 -> 0x025b }
            r5.<init>(r4, r3, r1)     // Catch:{ 1W9 -> 0x025b }
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ 1W9 -> 0x025b }
            X.C32271fx.A03(r10, r5, r3)     // Catch:{ 1W9 -> 0x025b }
            java.lang.String[] r12 = new java.lang.String[r7]     // Catch:{ 1W9 -> 0x025b }
            r12[r1] = r6     // Catch:{ 1W9 -> 0x025b }
            java.lang.String r3 = "bank"
            r12[r8] = r3     // Catch:{ 1W9 -> 0x025b }
            com.facebook.redex.IDxNFunctionShape138S0100000_3_I1 r11 = new com.facebook.redex.IDxNFunctionShape138S0100000_3_I1     // Catch:{ 1W9 -> 0x025b }
            r11.<init>(r4, r1)     // Catch:{ 1W9 -> 0x025b }
            r13 = 0
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r3 = X.C32271fx.A07(r10, r11, r12, r13, r15)     // Catch:{ 1W9 -> 0x025b }
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ 1W9 -> 0x025b }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ 1W9 -> 0x025b }
        L_0x0239:
            boolean r3 = r6.hasNext()     // Catch:{ 1W9 -> 0x025b }
            if (r3 == 0) goto L_0x0255
            java.lang.Object r3 = r6.next()     // Catch:{ 1W9 -> 0x025b }
            X.5wb r3 = (X.C119135wb) r3     // Catch:{ 1W9 -> 0x025b }
            X.5hQ r5 = new X.5hQ     // Catch:{ 1W9 -> 0x025b }
            r5.<init>()     // Catch:{ 1W9 -> 0x025b }
            X.173 r4 = r2.A03     // Catch:{ 1W9 -> 0x025b }
            X.1Vv r3 = r3.A00     // Catch:{ 1W9 -> 0x025b }
            r5.A01(r4, r3, r1)     // Catch:{ 1W9 -> 0x025b }
            r7.add(r5)     // Catch:{ 1W9 -> 0x025b }
            goto L_0x0239
        L_0x0255:
            X.68N r1 = r2.A06     // Catch:{ 1W9 -> 0x025b }
            r1.ARo(r9, r7)     // Catch:{ 1W9 -> 0x025b }
            return
        L_0x025b:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            java.lang.String r1 = "GetMerchantPayoutBanks"
            X.C110105dW.A1O(r1, r2)
            java.lang.Object r0 = r0.A00
            X.5uh r0 = (X.C118445uh) r0
            X.68N r1 = r0.A06
            X.2HJ r0 = X.C110115dX.A0N()
            r1.ARo(r0, r9)
            return
        L_0x0273:
            java.lang.String r4 = "registration_status"
            X.1Vv r7 = X.C110115dX.A0X(r10)
            r3 = 0
            if (r7 == 0) goto L_0x033f
            java.lang.String r1 = "network_type"
            java.lang.String r2 = r7.A0N(r1, r3)
            java.lang.String r1 = "ELO"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            if (r1 == 0) goto L_0x032e
            java.lang.String r1 = "elo"
            X.1Vv r6 = r7.A0K(r1)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r2 = r6.A0N(r4, r3)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r1 = "0"
            boolean r1 = android.text.TextUtils.equals(r2, r1)     // Catch:{ 1W9 -> 0x031f }
            r5 = 5
            if (r1 == 0) goto L_0x0308
            java.lang.String r1 = "key"
            X.1Vv r2 = r7.A0K(r1)     // Catch:{ 1W9 -> 0x031f }
            java.lang.Object r7 = r0.A00     // Catch:{ 1W9 -> 0x031f }
            X.5tH r7 = (X.C117615tH) r7     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r1 = "key-type"
            java.lang.String r12 = r2.A0M(r1)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r1 = "provider"
            java.lang.String r10 = r2.A0M(r1)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r1 = "key-version"
            java.lang.String r13 = r2.A0M(r1)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r1 = "key-scope"
            java.lang.String r11 = r2.A0M(r1)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r1 = "expiry-ts"
            r14 = 0
            java.lang.String r8 = r2.A0N(r1, r3)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r1 = "none"
            boolean r1 = r1.equals(r12)     // Catch:{ 1W9 -> 0x031f }
            r9 = 0
            if (r1 != 0) goto L_0x02d7
            java.lang.String r1 = "data"
            X.1Vv r1 = r2.A0K(r1)     // Catch:{ 1W9 -> 0x031f }
            byte[] r14 = r1.A01     // Catch:{ 1W9 -> 0x031f }
        L_0x02d7:
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch:{ 1W9 -> 0x031f }
            if (r1 != 0) goto L_0x02e7
            r1 = 0
            long r1 = X.C29501aj.A01(r8, r1)     // Catch:{ 1W9 -> 0x031f }
            java.lang.Long r9 = java.lang.Long.valueOf(r1)     // Catch:{ 1W9 -> 0x031f }
        L_0x02e7:
            X.50C r8 = new X.50C     // Catch:{ 1W9 -> 0x031f }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ 1W9 -> 0x031f }
            X.5wq r1 = r7.A06     // Catch:{ 1W9 -> 0x031f }
            r1.A04(r8)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r4 = r6.A0N(r4, r3)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r1 = "wallet_id"
            java.lang.String r1 = r6.A0N(r1, r3)     // Catch:{ 1W9 -> 0x031f }
            X.5tD r2 = new X.5tD     // Catch:{ 1W9 -> 0x031f }
            r2.<init>(r4, r3, r1, r5)     // Catch:{ 1W9 -> 0x031f }
            java.lang.Object r1 = r0.A01     // Catch:{ 1W9 -> 0x031f }
            X.5uE r1 = (X.C118155uE) r1     // Catch:{ 1W9 -> 0x031f }
            r1.A00(r2)     // Catch:{ 1W9 -> 0x031f }
            return
        L_0x0308:
            java.lang.String r4 = r6.A0N(r4, r3)     // Catch:{ 1W9 -> 0x031f }
            java.lang.String r1 = "challenge_id"
            java.lang.String r1 = r6.A0N(r1, r3)     // Catch:{ 1W9 -> 0x031f }
            X.5tD r2 = new X.5tD     // Catch:{ 1W9 -> 0x031f }
            r2.<init>(r4, r1, r3, r5)     // Catch:{ 1W9 -> 0x031f }
            java.lang.Object r1 = r0.A01     // Catch:{ 1W9 -> 0x031f }
            X.5uE r1 = (X.C118155uE) r1     // Catch:{ 1W9 -> 0x031f }
            r1.A00(r2)     // Catch:{ 1W9 -> 0x031f }
            return
        L_0x031f:
            java.lang.Object r2 = r0.A01
            X.5uE r2 = (X.C118155uE) r2
            r1 = 9
            X.2HJ r0 = new X.2HJ
            r0.<init>((int) r1)
            r2.A00(r3)
            return
        L_0x032e:
            int r2 = X.C35391lr.A05(r2)
            X.5tD r1 = new X.5tD
            r1.<init>(r3, r3, r3, r2)
            java.lang.Object r0 = r0.A01
            X.5uE r0 = (X.C118155uE) r0
            r0.A00(r1)
            return
        L_0x033f:
            java.lang.Object r1 = r0.A01
            X.5uE r1 = (X.C118155uE) r1
            X.2HJ r0 = new X.2HJ
            r0.<init>()
            r1.A00(r3)
            return
        L_0x034c:
            java.lang.Object r9 = r0.A00
            X.5ur r9 = (X.C118545ur) r9
            X.1Vo r2 = r9.A0A
            java.lang.String r1 = "BrazilAddCredentialAction : onResponseSuccess received"
            r2.A05(r1)
            X.1Vv r2 = X.C110115dX.A0X(r10)
            if (r2 == 0) goto L_0x03f0
            java.lang.String r1 = "callback_url"
            r7 = 0
            java.lang.String r6 = r2.A0N(r1, r7)
            java.lang.String r1 = "credential"
            X.1Vv r4 = r2.A0J(r1)
            if (r4 == 0) goto L_0x03f0
            java.lang.String r1 = "card"
            X.1Vv r3 = r4.A0J(r1)
            if (r3 == 0) goto L_0x03f0
            X.5hS r2 = new X.5hS
            r2.<init>()
            X.173 r1 = r9.A04
            r8 = 0
            r2.A01(r1, r3, r8)
            X.1cl r5 = r2.A05()
            X.1lr r5 = (X.C35391lr) r5
            X.5vX r1 = r9.A0B
            r1.A01(r7, r5)
            boolean r1 = r2.A0a
            if (r1 == 0) goto L_0x03a2
            X.0wS r1 = r9.A08
            X.1xv r3 = r1.A01()
            java.lang.Object r2 = r0.A01
            X.5rr r2 = (X.C116735rr) r2
            r1 = 1
            com.facebook.redex.IDxSListenerShape5S1200000_3_I1 r0 = new com.facebook.redex.IDxSListenerShape5S1200000_3_I1
            r0.<init>(r5, r2, r6, r1)
            r3.A02(r0, r5)
            return
        L_0x03a2:
            boolean r1 = r2.A08
            if (r1 != 0) goto L_0x03dd
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "verify-method-list"
            X.1Vv r4 = r4.A0J(r1)
            if (r4 == 0) goto L_0x03ca
            X.1Vv[] r1 = r4.A03
            if (r1 == 0) goto L_0x03ca
            int r3 = r1.length
            if (r3 <= 0) goto L_0x03ca
        L_0x03b9:
            X.1Vv r2 = r4.A0I(r8)
            X.638 r1 = new X.638
            r1.<init>(r2)
            r7.add(r1)
            int r8 = r8 + 1
            if (r8 >= r3) goto L_0x03ca
            goto L_0x03b9
        L_0x03ca:
            X.0wS r1 = r9.A08
            X.1xv r2 = r1.A01()
            java.lang.Object r1 = r0.A01
            X.5rr r1 = (X.C116735rr) r1
            X.607 r0 = new X.607
            r0.<init>(r5, r1, r6, r7)
            r2.A02(r0, r5)
            return
        L_0x03dd:
            X.0wS r1 = r9.A08
            X.1xv r2 = r1.A01()
            java.lang.Object r1 = r0.A01
            X.5rr r1 = (X.C116735rr) r1
            com.facebook.redex.IDxSListenerShape5S1200000_3_I1 r0 = new com.facebook.redex.IDxSListenerShape5S1200000_3_I1
            r0.<init>(r5, r1, r6, r8)
            r2.A02(r0, r5)
            return
        L_0x03f0:
            java.lang.Object r1 = r0.A01
            X.5rr r1 = (X.C116735rr) r1
            X.2HJ r0 = X.C110115dX.A0N()
            int r2 = r0.A00
            X.1Z7 r1 = r1.A00
            r0 = 0
            X.C112855jo.A09(r1, r0, r2)
            return
        L_0x0401:
            java.lang.String r1 = "accept_pay"
            X.1Vv r4 = r10.A0J(r1)
            X.3vz r3 = new X.3vz
            r3.<init>()
            if (r4 == 0) goto L_0x043e
            java.lang.String r2 = "accept"
            r1 = 0
            java.lang.String r1 = r4.A0N(r2, r1)
            java.lang.String r2 = "1"
            boolean r1 = r2.equals(r1)
            r3.A02 = r1
            java.lang.String r1 = "outage"
            boolean r1 = X.C110105dW.A1U(r4, r1, r2)
            r3.A00 = r1
            java.lang.String r1 = "sandbox"
            boolean r2 = X.C110105dW.A1U(r4, r1, r2)
            r3.A01 = r2
            java.lang.Object r1 = r0.A00
            X.0wU r1 = (X.C18310wU) r1
            X.0wT r1 = r1.A0D
            r1.A0O(r2)
        L_0x0436:
            java.lang.Object r0 = r0.A01
            X.1TV r0 = (X.AnonymousClass1TV) r0
            r0.AWJ(r3)
            return
        L_0x043e:
            r1 = 0
            r3.A02 = r1
            goto L_0x0436
        L_0x0442:
            java.lang.String r1 = "account"
            X.1Vv r4 = r10.A0K(r1)     // Catch:{ 1W9 -> 0x047b }
            X.2HJ r2 = X.AnonymousClass2HJ.A00(r4)     // Catch:{ 1W9 -> 0x047b }
            if (r2 == 0) goto L_0x0456
            java.lang.Object r1 = r0.A01     // Catch:{ 1W9 -> 0x047b }
            X.693 r1 = (X.AnonymousClass693) r1     // Catch:{ 1W9 -> 0x047b }
        L_0x0452:
            r1.AQW(r2)     // Catch:{ 1W9 -> 0x047b }
            goto L_0x046c
        L_0x0456:
            java.lang.String r1 = "webview_url"
            r2 = 0
            java.lang.String r3 = r4.A0N(r1, r2)     // Catch:{ 1W9 -> 0x047b }
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 1W9 -> 0x047b }
            if (r1 == 0) goto L_0x046d
            java.lang.Object r1 = r0.A01     // Catch:{ 1W9 -> 0x047b }
            X.693 r1 = (X.AnonymousClass693) r1     // Catch:{ 1W9 -> 0x047b }
            X.2HJ r2 = X.C110115dX.A0N()     // Catch:{ 1W9 -> 0x047b }
            goto L_0x0452
        L_0x046c:
            return
        L_0x046d:
            java.lang.String r1 = "callback_url"
            java.lang.String r2 = r4.A0N(r1, r2)     // Catch:{ 1W9 -> 0x047b }
            java.lang.Object r1 = r0.A01     // Catch:{ 1W9 -> 0x047b }
            X.693 r1 = (X.AnonymousClass693) r1     // Catch:{ 1W9 -> 0x047b }
            r1.AYD(r3, r2)     // Catch:{ 1W9 -> 0x047b }
            return
        L_0x047b:
            r3 = move-exception
            java.lang.Object r1 = r0.A00
            X.5ua r1 = (X.C118375ua) r1
            X.1Vo r2 = r1.A05
            java.lang.String r1 = "PAY: PaymentStepUpWebviewAction : invalid response"
            r2.A0A(r1, r3)
            java.lang.Object r1 = r0.A01
            X.693 r1 = (X.AnonymousClass693) r1
            X.2HJ r0 = X.C110115dX.A0N()
            r1.AQW(r0)
            return
        L_0x0493:
            java.lang.String r1 = "account"
            X.1Vv r2 = r10.A0K(r1)     // Catch:{ 1W9 -> 0x04e3 }
            java.lang.String r1 = "key"
            X.1Vv r2 = r2.A0K(r1)     // Catch:{ 1W9 -> 0x04e3 }
            java.lang.Object r1 = r0.A00     // Catch:{ 1W9 -> 0x04e3 }
            X.5ug r1 = (X.C118435ug) r1     // Catch:{ 1W9 -> 0x04e3 }
            X.5wq r5 = r1.A04     // Catch:{ 1W9 -> 0x04e3 }
            X.50C r4 = r5.A01(r2)     // Catch:{ 1W9 -> 0x04e3 }
            X.1Vo r3 = r1.A05     // Catch:{ 1W9 -> 0x04e3 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ 1W9 -> 0x04e3 }
            java.lang.String r1 = "providerKey/onSuccess: isValidSignature="
            r2.append(r1)     // Catch:{ 1W9 -> 0x04e3 }
            boolean r1 = X.AnonymousClass000.A1V(r4)
            r2.append(r1)     // Catch:{ 1W9 -> 0x04e3 }
            java.lang.String r1 = r2.toString()     // Catch:{ 1W9 -> 0x04e3 }
            r3.A07(r1)     // Catch:{ 1W9 -> 0x04e3 }
            if (r4 == 0) goto L_0x04cf
            r5.A04(r4)     // Catch:{ 1W9 -> 0x04e3 }
            java.lang.Object r1 = r0.A01     // Catch:{ 1W9 -> 0x04e3 }
            X.692 r1 = (X.AnonymousClass692) r1     // Catch:{ 1W9 -> 0x04e3 }
            r1.AVQ(r4)     // Catch:{ 1W9 -> 0x04e3 }
            return
        L_0x04cf:
            java.lang.String r1 = "providerKey/onSuccess signature is not valid"
            r3.A05(r1)     // Catch:{ 1W9 -> 0x04e3 }
            java.lang.Object r3 = r0.A01     // Catch:{ 1W9 -> 0x04e3 }
            X.692 r3 = (X.AnonymousClass692) r3     // Catch:{ 1W9 -> 0x04e3 }
            r2 = 8
            X.2HJ r1 = new X.2HJ     // Catch:{ 1W9 -> 0x04e3 }
            r1.<init>((int) r2)     // Catch:{ 1W9 -> 0x04e3 }
            r3.AVP(r1)     // Catch:{ 1W9 -> 0x04e3 }
            return
        L_0x04e3:
            r3 = move-exception
            java.lang.Object r1 = r0.A00
            X.5ug r1 = (X.C118435ug) r1
            X.1Vo r2 = r1.A05
            java.lang.String r1 = "providerKey/parseResponse failed: "
            r2.A0A(r1, r3)
            java.lang.Object r2 = r0.A01
            X.692 r2 = (X.AnonymousClass692) r2
            r1 = 9
            X.2HJ r0 = new X.2HJ
            r0.<init>((int) r1)
            r2.AVP(r0)
            return
        L_0x04fe:
            java.lang.String r1 = "account"
            X.1Vv r2 = r10.A0K(r1)     // Catch:{ 1W9 -> 0x0586 }
            X.5t0 r7 = new X.5t0     // Catch:{ 1W9 -> 0x0586 }
            r7.<init>()     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r1 = "auto_address"
            X.1Vv r3 = r2.A0K(r1)     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r10 = "street"
            r2 = 0
            java.lang.String r1 = r3.A0N(r10, r2)     // Catch:{ 1W9 -> 0x0586 }
            r7.A05 = r1     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r9 = "neighborhood"
            java.lang.String r1 = r3.A0N(r9, r2)     // Catch:{ 1W9 -> 0x0586 }
            r7.A03 = r1     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r8 = "city"
            java.lang.String r1 = r3.A0N(r8, r2)     // Catch:{ 1W9 -> 0x0586 }
            r7.A01 = r1     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r6 = "state"
            java.lang.String r1 = r3.A0N(r6, r2)     // Catch:{ 1W9 -> 0x0586 }
            r7.A04 = r1     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r5 = "address_code"
            java.lang.String r1 = r3.A0N(r5, r2)     // Catch:{ 1W9 -> 0x0586 }
            r7.A00 = r1     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r4 = "country"
            java.lang.String r1 = r3.A0N(r4, r2)     // Catch:{ 1W9 -> 0x0586 }
            r7.A02 = r1     // Catch:{ 1W9 -> 0x0586 }
            java.lang.Object r2 = r0.A01     // Catch:{ 1W9 -> 0x0586 }
            X.5rq r2 = (X.C116725rq) r2     // Catch:{ 1W9 -> 0x0586 }
            java.util.HashMap r3 = X.AnonymousClass000.A0x()     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r1 = r7.A05     // Catch:{ 1W9 -> 0x0586 }
            if (r1 != 0) goto L_0x054e
            java.lang.String r1 = ""
        L_0x054e:
            r3.put(r10, r1)     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r1 = r7.A03     // Catch:{ 1W9 -> 0x0586 }
            if (r1 != 0) goto L_0x0557
            java.lang.String r1 = ""
        L_0x0557:
            r3.put(r9, r1)     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r1 = r7.A01     // Catch:{ 1W9 -> 0x0586 }
            if (r1 != 0) goto L_0x0560
            java.lang.String r1 = ""
        L_0x0560:
            r3.put(r8, r1)     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r1 = r7.A04     // Catch:{ 1W9 -> 0x0586 }
            if (r1 != 0) goto L_0x0569
            java.lang.String r1 = ""
        L_0x0569:
            r3.put(r6, r1)     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r1 = r7.A00     // Catch:{ 1W9 -> 0x0586 }
            if (r1 != 0) goto L_0x0572
            java.lang.String r1 = ""
        L_0x0572:
            r3.put(r5, r1)     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r1 = r7.A02     // Catch:{ 1W9 -> 0x0586 }
            if (r1 != 0) goto L_0x057b
            java.lang.String r1 = ""
        L_0x057b:
            r3.put(r4, r1)     // Catch:{ 1W9 -> 0x0586 }
            X.1Z7 r2 = r2.A00     // Catch:{ 1W9 -> 0x0586 }
            java.lang.String r1 = "on_success"
            r2.A02(r1, r3)     // Catch:{ 1W9 -> 0x0586 }
            return
        L_0x0586:
            java.lang.String r1 = "Pay: BrazilGetAutofillAddressAction/onResponseSuccess could not parse auto_address response"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            java.lang.Object r0 = r0.A01
            X.5rq r0 = (X.C116725rq) r0
            X.1Z7 r1 = r0.A00
            java.lang.String r0 = "on_failure"
            r1.A00(r0)
            return
        L_0x0597:
            java.lang.String r1 = "account"
            X.1Vv r1 = r10.A0K(r1)     // Catch:{ 1W9 -> 0x05fc }
            X.2HJ r2 = X.AnonymousClass2HJ.A00(r1)     // Catch:{ 1W9 -> 0x05fc }
            if (r2 == 0) goto L_0x05ab
            java.lang.Object r1 = r0.A01     // Catch:{ 1W9 -> 0x05fc }
            X.5u7 r1 = (X.AnonymousClass5u7) r1     // Catch:{ 1W9 -> 0x05fc }
            r1.A00(r2)     // Catch:{ 1W9 -> 0x05fc }
            return
        L_0x05ab:
            java.lang.Object r5 = r0.A01     // Catch:{ 1W9 -> 0x05fc }
            X.5u7 r5 = (X.AnonymousClass5u7) r5     // Catch:{ 1W9 -> 0x05fc }
            X.61x r7 = r5.A00     // Catch:{ 1W9 -> 0x05fc }
            com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment r1 = r7.A01     // Catch:{ 1W9 -> 0x05fc }
            if (r1 == 0) goto L_0x05e7
            r1.A1N()     // Catch:{ 1W9 -> 0x05fc }
            r1.A1D()     // Catch:{ 1W9 -> 0x05fc }
        L_0x05bb:
            X.5xF r6 = r7.A02     // Catch:{ 1W9 -> 0x05fc }
            X.175 r2 = r6.A05     // Catch:{ 1W9 -> 0x05fc }
            java.lang.String r1 = "tos_no_wallet"
            r2.A09(r1)     // Catch:{ 1W9 -> 0x05fc }
            X.5vc r1 = r6.A0H     // Catch:{ 1W9 -> 0x05fc }
            r3 = 1
            r1.A01()     // Catch:{ 1W9 -> 0x05fc }
            X.0wT r1 = r6.A07     // Catch:{ 1W9 -> 0x05fc }
            android.content.SharedPreferences$Editor r2 = X.C110105dW.A06(r1)     // Catch:{ 1W9 -> 0x05fc }
            java.lang.String r1 = "payment_account_recovered"
            X.C13680ns.A0z(r2, r1, r3)     // Catch:{ 1W9 -> 0x05fc }
            X.0pL r4 = r7.A00     // Catch:{ 1W9 -> 0x05fc }
            boolean r1 = r4 instanceof com.obwhatsapp.payments.ui.BrazilAccountRecoveryPinActivity     // Catch:{ 1W9 -> 0x05fc }
            if (r1 == 0) goto L_0x05f2
            X.5um r3 = r6.A0D     // Catch:{ 1W9 -> 0x05fc }
            r2 = 0
            X.61O r1 = new X.61O     // Catch:{ 1W9 -> 0x05fc }
            r1.<init>(r5)     // Catch:{ 1W9 -> 0x05fc }
            r3.A00(r1, r2)     // Catch:{ 1W9 -> 0x05fc }
            goto L_0x05f1
        L_0x05e7:
            X.0pL r2 = r7.A00     // Catch:{ 1W9 -> 0x05fc }
            boolean r1 = r2 instanceof com.obwhatsapp.payments.ui.BrazilAccountRecoveryPinActivity     // Catch:{ 1W9 -> 0x05fc }
            if (r1 == 0) goto L_0x05bb
            r2.Ac1()     // Catch:{ 1W9 -> 0x05fc }
            goto L_0x05bb
        L_0x05f1:
            return
        L_0x05f2:
            boolean r3 = r7.A03     // Catch:{ 1W9 -> 0x05fc }
            boolean r2 = r7.A04     // Catch:{ 1W9 -> 0x05fc }
            java.lang.String r1 = r5.A01     // Catch:{ 1W9 -> 0x05fc }
            X.AnonymousClass5xF.A00(r4, r6, r1, r3, r2)     // Catch:{ 1W9 -> 0x05fc }
            return
        L_0x05fc:
            r3 = move-exception
            java.lang.Object r1 = r0.A00
            X.5t9 r1 = (X.C117535t9) r1
            X.1Vo r2 = r1.A05
            java.lang.String r1 = "PAY: BrazilAccountRecoveryAction : invalid response"
            r2.A0A(r1, r3)
            java.lang.Object r1 = r0.A01
            X.5u7 r1 = (X.AnonymousClass5u7) r1
            X.2HJ r0 = X.C110115dX.A0N()
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1.A05(X.1Vv):void");
    }
}
