package com.obwhatsapp.payments;

import X.AnonymousClass000;
import X.AnonymousClass1Vt;
import X.AnonymousClass2HA;
import X.AnonymousClass2HJ;
import X.AnonymousClass5u6;
import X.AnonymousClass69R;
import X.C110105dW;
import X.C117595tF;
import X.C118185uH;
import X.C1222969a;
import X.C14880pu;
import X.C18340wX;
import android.content.Context;
import com.whatsapp.util.Log;
import java.util.AbstractMap;

public class IDxRCallbackShape8S0300000_3_I1 extends AnonymousClass2HA {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxRCallbackShape8S0300000_3_I1(Context context, C18340wX r2, C14880pu r3, Object obj, Object obj2, Object obj3, int i2) {
        super(context, r2, r3);
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public void A03(AnonymousClass2HJ r4) {
        switch (this.A03) {
            case 0:
                Log.e(AnonymousClass000.A0g("PAY: BrazilMerchantGetStatusAction request error: ", r4));
                AbstractMap abstractMap = (AbstractMap) this.A01;
                C110105dW.A1I(r4, abstractMap);
                ((C117595tF) this.A00).A05.A00.A01("on_failure", abstractMap);
                return;
            case 1:
                A06(r4);
                return;
            case 2:
                ((AnonymousClass69R) this.A01).AKJ(r4, (Integer) this.A02);
                return;
            default:
                ((C118185uH) this.A01).A00(r4);
                return;
        }
    }

    public void A04(AnonymousClass2HJ r4) {
        switch (this.A03) {
            case 0:
                Log.e(AnonymousClass000.A0g("PAY: BrazilMerchantGetStatusAction response error: ", r4));
                AbstractMap abstractMap = (AbstractMap) this.A01;
                C110105dW.A1I(r4, abstractMap);
                ((C117595tF) this.A00).A05.A00.A01("on_failure", abstractMap);
                return;
            case 1:
                A06(r4);
                return;
            case 2:
                ((AnonymousClass69R) this.A01).AKJ(r4, (Integer) this.A02);
                return;
            default:
                A03(r4);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c0, code lost:
        r2 = (X.AnonymousClass5wX) r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C28371Vv r38) {
        /*
            r37 = this;
            r0 = r37
            int r1 = r0.A03
            r8 = r38
            switch(r1) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0166;
                case 2: goto L_0x0073;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Vv r1 = X.C110115dX.A0X(r8)
            if (r1 == 0) goto L_0x0038
            X.2HJ r4 = X.AnonymousClass2HJ.A00(r1)
            if (r4 == 0) goto L_0x0039
            int r2 = r4.A00
            if (r2 == 0) goto L_0x0039
            r1 = 1448(0x5a8, float:2.029E-42)
            if (r2 != r1) goto L_0x0030
            java.lang.Object r1 = r0.A00
            X.5uu r1 = (X.C118575uu) r1
            X.5wq r3 = r1.A07
            java.lang.Object r1 = r0.A02
            X.5tl r1 = (X.C117915tl) r1
            X.50C r1 = r1.A00
            java.lang.String r2 = r1.A05
            java.lang.String r1 = "PIN"
            r3.A03(r4, r2, r1)
        L_0x0030:
            java.lang.Object r0 = r0.A01
            X.5uH r0 = (X.C118185uH) r0
            r0.A00(r4)
        L_0x0037:
            return
        L_0x0038:
            r4 = 0
        L_0x0039:
            java.lang.Object r1 = r0.A00
            X.5uu r1 = (X.C118575uu) r1
            X.5vc r3 = r1.A08
            r3.A01()
            r1 = 0
            r3.A02(r1)
            goto L_0x0030
        L_0x0048:
            java.lang.String r3 = "account"
            X.1Vv r2 = r8.A0J(r3)
            if (r2 == 0) goto L_0x0037
            X.2HJ r1 = X.AnonymousClass2HJ.A00(r2)
            java.lang.String r13 = "on_success"
            java.lang.String r12 = "error_code"
            if (r1 == 0) goto L_0x0195
            java.lang.Object r2 = r0.A01
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            int r1 = r1.A00
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.put(r12, r1)
            java.lang.Object r0 = r0.A00
            X.5tF r0 = (X.C117595tF) r0
            X.5qq r0 = r0.A05
            X.1Z7 r0 = r0.A00
            r0.A01(r13, r2)
            return
        L_0x0073:
            r4 = 500(0x1f4, float:7.0E-43)
            java.lang.String r1 = "account"
            X.1Vv r2 = r8.A0K(r1)     // Catch:{ 1W9 -> 0x0145 }
            X.2HJ r6 = X.AnonymousClass2HJ.A00(r2)     // Catch:{ 1W9 -> 0x0145 }
            java.lang.String r1 = "offer_eligibility"
            X.1Vv r7 = r2.A0J(r1)     // Catch:{ 1W9 -> 0x0145 }
            if (r6 == 0) goto L_0x00dc
            int r2 = r6.A00     // Catch:{ 1W9 -> 0x0145 }
            r1 = 1441(0x5a1, float:2.019E-42)
            if (r2 != r1) goto L_0x0099
            java.lang.Object r1 = r0.A00     // Catch:{ 1W9 -> 0x0145 }
            X.5wX r1 = (X.AnonymousClass5wX) r1     // Catch:{ 1W9 -> 0x0145 }
            X.5vc r3 = r1.A0N     // Catch:{ 1W9 -> 0x0145 }
            long r1 = r6.A02     // Catch:{ 1W9 -> 0x0145 }
            r3.A02(r1)     // Catch:{ 1W9 -> 0x0145 }
            goto L_0x00be
        L_0x0099:
            r1 = 1448(0x5a8, float:2.029E-42)
            if (r2 != r1) goto L_0x00ab
            java.lang.Object r1 = r0.A00     // Catch:{ 1W9 -> 0x0145 }
            X.5wX r1 = (X.AnonymousClass5wX) r1     // Catch:{ 1W9 -> 0x0145 }
            X.5wq r3 = r1.A0H     // Catch:{ 1W9 -> 0x0145 }
            java.lang.String r2 = "FB"
            java.lang.String r1 = "PIN"
            r3.A03(r6, r2, r1)     // Catch:{ 1W9 -> 0x0145 }
            goto L_0x00be
        L_0x00ab:
            r1 = 2896004(0x2c3084, float:4.058166E-39)
            if (r2 != r1) goto L_0x00be
            java.lang.Object r1 = r0.A00     // Catch:{ 1W9 -> 0x0145 }
            X.5wX r1 = (X.AnonymousClass5wX) r1     // Catch:{ 1W9 -> 0x0145 }
            X.0sq r2 = r1.A0Q     // Catch:{ 1W9 -> 0x0145 }
            X.63j r1 = new X.63j     // Catch:{ 1W9 -> 0x0145 }
            r1.<init>(r0)     // Catch:{ 1W9 -> 0x0145 }
            r2.Acl(r1)     // Catch:{ 1W9 -> 0x0145 }
        L_0x00be:
            if (r7 == 0) goto L_0x00d0
            java.lang.Object r2 = r0.A00     // Catch:{ 1W9 -> 0x0145 }
            X.5wX r2 = (X.AnonymousClass5wX) r2     // Catch:{ 1W9 -> 0x0145 }
            X.2fV r1 = r2.A0L     // Catch:{ 1W9 -> 0x0145 }
            if (r1 == 0) goto L_0x00d0
            X.1GO r5 = r2.A0K     // Catch:{ 1W9 -> 0x0145 }
            long r2 = r1.A01     // Catch:{ 1W9 -> 0x0145 }
            r1 = 0
            r5.A09(r1, r7, r2)     // Catch:{ 1W9 -> 0x0145 }
        L_0x00d0:
            java.lang.Object r2 = r0.A01     // Catch:{ 1W9 -> 0x0145 }
            X.69R r2 = (X.AnonymousClass69R) r2     // Catch:{ 1W9 -> 0x0145 }
            java.lang.Object r1 = r0.A02     // Catch:{ 1W9 -> 0x0145 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 1W9 -> 0x0145 }
            r2.AKJ(r6, r1)     // Catch:{ 1W9 -> 0x0145 }
            return
        L_0x00dc:
            java.lang.String r1 = "transaction"
            X.1Vv r6 = r2.A0J(r1)     // Catch:{ 1W9 -> 0x0145 }
            if (r6 == 0) goto L_0x0134
            java.lang.Object r8 = r0.A00     // Catch:{ 1W9 -> 0x0145 }
            X.5wX r8 = (X.AnonymousClass5wX) r8     // Catch:{ 1W9 -> 0x0145 }
            java.lang.String r1 = "elo"
            X.1Vv r2 = r6.A0J(r1)     // Catch:{ 1W9 -> 0x0145 }
            if (r2 == 0) goto L_0x0109
            java.lang.String r1 = "challenge_id"
            java.lang.String r2 = X.C28371Vv.A05(r2, r1)     // Catch:{ 1W9 -> 0x0145 }
            X.5uv r1 = r8.A0J     // Catch:{ 1W9 -> 0x0145 }
            r1.A00(r2)     // Catch:{ 1W9 -> 0x0145 }
            java.lang.String r5 = r8.A0R     // Catch:{ 1W9 -> 0x0145 }
            X.1lv r3 = r8.A05     // Catch:{ 1W9 -> 0x0145 }
            java.lang.String r2 = r8.A0V     // Catch:{ 1W9 -> 0x0145 }
            X.5tD r1 = r1.A00     // Catch:{ 1W9 -> 0x0145 }
            r1.A03 = r5     // Catch:{ 1W9 -> 0x0145 }
            r1.A01 = r3     // Catch:{ 1W9 -> 0x0145 }
            r1.A05 = r2     // Catch:{ 1W9 -> 0x0145 }
        L_0x0109:
            java.lang.String r1 = "id"
            java.lang.String r6 = r6.A0M(r1)     // Catch:{ 1W9 -> 0x0145 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 1W9 -> 0x0145 }
            if (r1 != 0) goto L_0x0134
            if (r7 == 0) goto L_0x0128
            X.2fV r1 = r8.A0L     // Catch:{ 1W9 -> 0x0145 }
            if (r1 == 0) goto L_0x0128
            X.1GO r5 = r8.A0K     // Catch:{ 1W9 -> 0x0145 }
            long r2 = r1.A01     // Catch:{ 1W9 -> 0x0145 }
            X.61a r1 = new X.61a     // Catch:{ 1W9 -> 0x0145 }
            r1.<init>(r0, r6)     // Catch:{ 1W9 -> 0x0145 }
            r5.A09(r1, r7, r2)     // Catch:{ 1W9 -> 0x0145 }
            return
        L_0x0128:
            java.lang.Object r2 = r0.A01     // Catch:{ 1W9 -> 0x0145 }
            X.69g r2 = (X.C1223569g) r2     // Catch:{ 1W9 -> 0x0145 }
            java.lang.Object r1 = r0.A02     // Catch:{ 1W9 -> 0x0145 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 1W9 -> 0x0145 }
            r2.AWR(r6, r1)     // Catch:{ 1W9 -> 0x0145 }
            return
        L_0x0134:
            java.lang.Object r3 = r0.A01     // Catch:{ 1W9 -> 0x0145 }
            X.69R r3 = (X.AnonymousClass69R) r3     // Catch:{ 1W9 -> 0x0145 }
            X.2HJ r2 = new X.2HJ     // Catch:{ 1W9 -> 0x0145 }
            r2.<init>((int) r4)     // Catch:{ 1W9 -> 0x0145 }
            java.lang.Object r1 = r0.A02     // Catch:{ 1W9 -> 0x0145 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 1W9 -> 0x0145 }
            r3.AKJ(r2, r1)     // Catch:{ 1W9 -> 0x0145 }
            return
        L_0x0145:
            r3 = move-exception
            java.lang.Object r1 = r0.A00
            X.5wX r1 = (X.AnonymousClass5wX) r1
            X.1Vo r2 = r1.A0I
            java.lang.String r1 = "sendPrecheckWithSignature/onResponseSuccess/corrupt stream exception: "
            java.lang.String r1 = X.AnonymousClass000.A0g(r1, r3)
            r2.A05(r1)
            java.lang.Object r2 = r0.A01
            X.69R r2 = (X.AnonymousClass69R) r2
            X.2HJ r1 = new X.2HJ
            r1.<init>((int) r4)
            java.lang.Object r0 = r0.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.AKJ(r1, r0)
            return
        L_0x0166:
            X.1Vv r2 = X.C110115dX.A0X(r8)
            if (r2 != 0) goto L_0x0173
            X.2HJ r1 = X.C110115dX.A0N()
            r0.A06(r1)
        L_0x0173:
            java.lang.String r1 = "transaction"
            X.1Vv r4 = r2.A0J(r1)
            if (r4 != 0) goto L_0x0182
            X.2HJ r1 = X.C110115dX.A0N()
            r0.A06(r1)
        L_0x0182:
            java.lang.Object r1 = r0.A00
            X.5i9 r1 = (X.C112225i9) r1
            X.0sq r3 = r1.A06
            java.lang.Object r2 = r0.A01
            X.5u6 r2 = (X.AnonymousClass5u6) r2
            X.66K r1 = new X.66K
            r1.<init>(r0, r2, r4)
            r3.Acl(r1)
            return
        L_0x0195:
            java.lang.String r5 = "status"
            java.lang.String r2 = X.C28371Vv.A05(r2, r5)
            r1 = 0
            int r4 = X.C29501aj.A00(r2, r1)
            java.lang.Object r1 = r0.A01
            r22 = r1
            r1 = r22
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            r22 = r1
            java.lang.String r2 = java.lang.String.valueOf(r4)
            r1.put(r5, r2)
            r1 = 1
            java.lang.String r21 = "bank_name"
            java.lang.String r20 = "bank_code"
            java.lang.String r19 = "on_failure"
            if (r4 != r1) goto L_0x01bc
            goto L_0x0294
        L_0x01bc:
            java.lang.Object r4 = r0.A02     // Catch:{ 1W9 -> 0x03b7 }
            X.5rL r4 = (X.C116415rL) r4     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.Object r1 = r0.A00     // Catch:{ 1W9 -> 0x03b7 }
            X.5tF r1 = (X.C117595tF) r1     // Catch:{ 1W9 -> 0x03b7 }
            X.0so r7 = r1.A01     // Catch:{ 1W9 -> 0x03b7 }
            r23 = 0
            java.lang.String r2 = "iq"
            X.C28371Vv.A06(r8, r2)     // Catch:{ 1W9 -> 0x03b7 }
            X.1Vv r10 = r4.A00     // Catch:{ 1W9 -> 0x03b7 }
            r6 = 2
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ 1W9 -> 0x03b7 }
            r4 = 0
            r9[r4] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r11 = "action"
            r2 = 1
            r9[r2] = r11     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.Class<java.lang.String> r25 = java.lang.String.class
            java.lang.Long r26 = X.AnonymousClass3K2.A0X()     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.Long r27 = X.AnonymousClass3K2.A0Y()     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r28 = "br-get-merchant-status"
            r30 = 0
            r24 = r8
            r29 = r9
            X.C32271fx.A01(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ 1W9 -> 0x03b7 }
            r9[r4] = r3     // Catch:{ 1W9 -> 0x03b7 }
            r9[r2] = r5     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r28 = "0"
            r29 = r9
            X.C32271fx.A01(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1W9 -> 0x03b7 }
            com.facebook.redex.IDxNFunctionShape44S0200000_3_I1 r9 = new com.facebook.redex.IDxNFunctionShape44S0200000_3_I1     // Catch:{ 1W9 -> 0x03b7 }
            r9.<init>(r7, r10, r6)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            X.C32271fx.A03(r8, r9, r5)     // Catch:{ 1W9 -> 0x03b7 }
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ 1W9 -> 0x03b7 }
            r5[r4] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r3 = "banks"
            r5[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r4 = "bank"
            r5[r6] = r4     // Catch:{ 1W9 -> 0x03b7 }
            com.facebook.redex.IDxNFunctionShape138S0100000_3_I1 r4 = new com.facebook.redex.IDxNFunctionShape138S0100000_3_I1     // Catch:{ 1W9 -> 0x03b7 }
            r4.<init>(r7, r2)     // Catch:{ 1W9 -> 0x03b7 }
            r26 = 0
            r28 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r23 = r8
            r24 = r4
            r25 = r5
            java.util.List r2 = X.C32271fx.A07(r23, r24, r25, r26, r28)     // Catch:{ 1W9 -> 0x03b7 }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0275 }
            r7.<init>()     // Catch:{ JSONException -> 0x0275 }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ JSONException -> 0x0275 }
        L_0x0232:
            boolean r2 = r8.hasNext()     // Catch:{ JSONException -> 0x0275 }
            if (r2 == 0) goto L_0x0262
            java.lang.Object r6 = r8.next()     // Catch:{ JSONException -> 0x0275 }
            X.5wc r6 = (X.C119145wc) r6     // Catch:{ JSONException -> 0x0275 }
            org.json.JSONObject r5 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0275 }
            java.lang.Long r4 = r6.A01     // Catch:{ JSONException -> 0x0275 }
            r2 = r20
            r5.put(r2, r4)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r4 = r6.A03     // Catch:{ JSONException -> 0x0275 }
            r2 = r21
            r5.put(r2, r4)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r4 = "short_name"
            java.lang.String r2 = r6.A05     // Catch:{ JSONException -> 0x0275 }
            r5.put(r4, r2)     // Catch:{ JSONException -> 0x0275 }
            java.lang.String r4 = "accept_savings"
            java.lang.String r2 = r6.A02     // Catch:{ JSONException -> 0x0275 }
            r5.put(r4, r2)     // Catch:{ JSONException -> 0x0275 }
            r7.put(r5)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0232
        L_0x0262:
            java.lang.String r4 = r7.toString()     // Catch:{ JSONException -> 0x0275 }
            r2 = r22
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0275 }
            X.5qq r2 = r1.A05     // Catch:{ JSONException -> 0x0275 }
            X.1Z7 r3 = r2.A00     // Catch:{ JSONException -> 0x0275 }
            r2 = r22
            r3.A01(r13, r2)     // Catch:{ JSONException -> 0x0275 }
            return
        L_0x0275:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r2 = "PAY: BrazilPayBloksActivity payoutBanksToJsonArrayException: "
            java.lang.String r2 = X.AnonymousClass000.A0e(r4, r2, r3)     // Catch:{ 1W9 -> 0x03b7 }
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r3 = r4.getMessage()     // Catch:{ 1W9 -> 0x03b7 }
            r2 = r22
            r2.put(r12, r3)     // Catch:{ 1W9 -> 0x03b7 }
            X.5qq r1 = r1.A05     // Catch:{ 1W9 -> 0x03b7 }
            X.1Z7 r2 = r1.A00     // Catch:{ 1W9 -> 0x03b7 }
            r13 = r19
            goto L_0x03b1
        L_0x0294:
            java.lang.Object r2 = r0.A02     // Catch:{ 1W9 -> 0x03b7 }
            X.5rL r2 = (X.C116415rL) r2     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.Object r6 = r0.A00     // Catch:{ 1W9 -> 0x03b7 }
            X.5tF r6 = (X.C117595tF) r6     // Catch:{ 1W9 -> 0x03b7 }
            X.0so r1 = r6.A01     // Catch:{ 1W9 -> 0x03b7 }
            r36 = r1
            r23 = 0
            java.lang.String r1 = "iq"
            X.C28371Vv.A06(r8, r1)     // Catch:{ 1W9 -> 0x03b7 }
            X.1Vv r14 = r2.A00     // Catch:{ 1W9 -> 0x03b7 }
            r4 = 2
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            r2 = 0
            r7[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r9 = "action"
            r1 = 1
            r7[r1] = r9     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.Class<java.lang.String> r25 = java.lang.String.class
            java.lang.Long r26 = X.AnonymousClass3K2.A0X()     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.Long r27 = X.AnonymousClass3K2.A0Y()     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r28 = "br-get-merchant-status"
            r30 = 0
            r24 = r8
            r29 = r7
            X.C32271fx.A01(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            r7[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            r7[r1] = r5     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r28 = "1"
            r29 = r7
            X.C32271fx.A01(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            r5[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r7 = "verify-id"
            r5[r1] = r7     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.Class<java.lang.Long> r30 = java.lang.Long.class
            java.lang.Long r31 = X.AnonymousClass3K2.A0Z()     // Catch:{ 1W9 -> 0x03b7 }
            r33 = r23
            r35 = 0
            r28 = r23
            r29 = r8
            r32 = r27
            r34 = r5
            java.lang.Object r18 = X.C32271fx.A01(r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            r5[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r7 = "bank-code"
            r5[r1] = r7     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.Long r31 = X.AnonymousClass3K2.A0a()     // Catch:{ 1W9 -> 0x03b7 }
            r9 = 100
            java.lang.Long r32 = java.lang.Long.valueOf(r9)     // Catch:{ 1W9 -> 0x03b7 }
            r34 = r5
            java.lang.Object r17 = X.C32271fx.A00(r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            r5[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r7 = "bank-name"
            r5[r1] = r7     // Catch:{ 1W9 -> 0x03b7 }
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r27 = java.lang.Long.valueOf(r9)     // Catch:{ 1W9 -> 0x03b7 }
            r30 = 0
            r26 = r31
            r29 = r5
            java.lang.Object r11 = X.C32271fx.A00(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            r5[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r7 = "masked-account-number"
            r5[r1] = r7     // Catch:{ 1W9 -> 0x03b7 }
            r9 = 10
            java.lang.Long r27 = java.lang.Long.valueOf(r9)     // Catch:{ 1W9 -> 0x03b7 }
            r29 = r5
            java.lang.Object r7 = X.C32271fx.A00(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            r9[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r5 = "last4"
            r9[r1] = r5     // Catch:{ 1W9 -> 0x03b7 }
            r15 = 4
            java.lang.Long r26 = java.lang.Long.valueOf(r15)     // Catch:{ 1W9 -> 0x03b7 }
            r27 = r26
            r29 = r9
            java.lang.Object r10 = X.C32271fx.A00(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            r9[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r15 = "support-phone-number"
            r9[r1] = r15     // Catch:{ 1W9 -> 0x03b7 }
            r26 = r31
            r27 = r32
            r29 = r9
            java.lang.Object r9 = X.C32271fx.A00(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1W9 -> 0x03b7 }
            java.util.ArrayList r15 = X.C115535pu.A00     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ 1W9 -> 0x03b7 }
            r4[r2] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r3 = "verify-type"
            r4[r1] = r3     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r4 = X.C32271fx.A06(r8, r15, r4)     // Catch:{ 1W9 -> 0x03b7 }
            com.facebook.redex.IDxNFunctionShape44S0200000_3_I1 r15 = new com.facebook.redex.IDxNFunctionShape44S0200000_3_I1     // Catch:{ 1W9 -> 0x03b7 }
            r3 = r36
            r15.<init>(r3, r14, r1)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ 1W9 -> 0x03b7 }
            X.C32271fx.A03(r8, r15, r1)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r1 = "PAY: BrazilVerifyTaxId: Linked account, try to link merchant"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r2 = "verify_type"
            r1 = r22
            r1.put(r2, r4)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r3 = "verify_id"
            java.lang.String r2 = java.lang.String.valueOf(r18)     // Catch:{ 1W9 -> 0x03b7 }
            r1.put(r3, r2)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch:{ 1W9 -> 0x03b7 }
            r2 = r1
            r1 = r20
            r2.put(r1, r3)     // Catch:{ 1W9 -> 0x03b7 }
            r1 = r21
            r2.put(r1, r11)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r2 = "masked_account_number"
            r1 = r22
            r1.put(r2, r7)     // Catch:{ 1W9 -> 0x03b7 }
            r1.put(r5, r10)     // Catch:{ 1W9 -> 0x03b7 }
            java.lang.String r2 = "support_phone_number"
            r1.put(r2, r9)     // Catch:{ 1W9 -> 0x03b7 }
            X.5qq r1 = r6.A05     // Catch:{ 1W9 -> 0x03b7 }
            X.1Z7 r2 = r1.A00     // Catch:{ 1W9 -> 0x03b7 }
        L_0x03b1:
            r1 = r22
            r2.A01(r13, r1)     // Catch:{ 1W9 -> 0x03b7 }
            return
        L_0x03b7:
            r3 = move-exception
            java.lang.String r2 = r3.getMessage()
            java.lang.String r1 = "GetMerchantStatus"
            X.C110105dW.A1O(r1, r2)
            java.lang.String r2 = r3.getMessage()
            r1 = r22
            r1.put(r12, r2)
            java.lang.Object r0 = r0.A00
            X.5tF r0 = (X.C117595tF) r0
            X.5qq r0 = r0.A05
            X.1Z7 r2 = r0.A00
            r1 = r19
            r0 = r22
            r2.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.IDxRCallbackShape8S0300000_3_I1.A05(X.1Vv):void");
    }

    public final void A06(AnonymousClass2HJ r3) {
        C1222969a r1 = (C1222969a) this.A02;
        if (r1 != null) {
            r1.AKK(r3, 18);
        }
        ((AnonymousClass5u6) this.A01).A00((AnonymousClass1Vt) null, r3);
    }
}
