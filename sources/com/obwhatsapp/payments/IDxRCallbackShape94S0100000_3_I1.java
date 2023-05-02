package com.obwhatsapp.payments;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1W9;
import X.AnonymousClass2HA;
import X.AnonymousClass2HJ;
import X.AnonymousClass638;
import X.AnonymousClass68U;
import X.C110105dW;
import X.C110115dX;
import X.C111815hS;
import X.C111825hT;
import X.C112115hy;
import X.C112125hz;
import X.C112135i0;
import X.C112155i2;
import X.C112165i3;
import X.C117465t2;
import X.C117575tD;
import X.C117635tJ;
import X.C117905tk;
import X.C117935tn;
import X.C118425uf;
import X.C118555us;
import X.C118815vI;
import X.C13680ns;
import X.C13700nu;
import X.C14880pu;
import X.C18300wT;
import X.C18340wX;
import X.C28371Vv;
import X.C30671cl;
import X.C35391lr;
import X.C35441lw;
import X.C42511xv;
import android.content.Context;
import android.widget.ImageView;
import com.facebook.redex.IDxSListenerShape43S0300000_3_I1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class IDxRCallbackShape94S0100000_3_I1 extends AnonymousClass2HA {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxRCallbackShape94S0100000_3_I1(Context context, C18340wX r2, C14880pu r3, Object obj, int i2) {
        super(context, r2, r3);
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A03(AnonymousClass2HJ r8) {
        AnonymousClass2HJ r3 = r8;
        switch (this.A01) {
            case 0:
                Log.i(AnonymousClass000.A0g("PAY: BrazilAddCardAction onRequestError: ", r8));
                ((C112135i0) this.A00).A0E.A00((C35391lr) null, r3, (ArrayList) null, false, false);
                return;
            case 1:
                Log.i(AnonymousClass000.A0g("PAY: BrazilDeviceBindingAction onRequestError: ", r8));
                ((C118815vI) this.A00).A0B.APf((C35391lr) null, r8, (ArrayList) null, false);
                return;
            case 2:
                Log.i(AnonymousClass000.A0g("PAY: BrazilDeviceBindingAction onRequestError: ", r8));
                ((C118555us) this.A00).A0A.A00((C117575tD) null);
                return;
            case 3:
                Log.e(AnonymousClass000.A0g("PAY: BrazilMerchantLinkAction request error: ", r8));
                ((C117635tJ) this.A00).A06.A00((C35441lw) null, r8);
                return;
            case 4:
                Log.e(AnonymousClass000.A0g("PAY: BrazilMerchantPreLinkAction request error: ", r8));
                ((C112125hz) this.A00).A06.A00(r8, (C117465t2) null);
                return;
            case 5:
                ((C112115hy) this.A00).A07.A00(C110115dX.A0N());
                return;
            case 6:
                Log.i(AnonymousClass000.A0g("PAY: BrazilVerifyCardOTPSendAction onRequestError: ", r8));
                ((C112165i3) this.A00).A05.A00((C35391lr) null, r8);
                return;
            case 7:
                Log.i(AnonymousClass000.A0g("PAY: BrazilVerifyCardSendAuthCodeAction onRequestError: ", r8));
                ((C112155i2) this.A00).A04.A00(r8);
                return;
            default:
                C118425uf r2 = (C118425uf) this.A00;
                r2.A06.A06(AnonymousClass000.A0g("onRequestError: ", r8));
                r2.A05.AWV(r8, (String) null);
                return;
        }
    }

    public void A04(AnonymousClass2HJ r8) {
        AnonymousClass2HJ r3 = r8;
        switch (this.A01) {
            case 0:
                Log.i(AnonymousClass000.A0g("PAY: BrazilAddCardAction onResponseError: ", r8));
                ((C112135i0) this.A00).A0E.A00((C35391lr) null, r3, (ArrayList) null, false, false);
                return;
            case 1:
                Log.i(AnonymousClass000.A0g("PAY: BrazilDeviceBindingAction onResponseError: ", r8));
                ((C118815vI) this.A00).A0B.APf((C35391lr) null, r8, (ArrayList) null, false);
                return;
            case 2:
                Log.i(AnonymousClass000.A0g("PAY: BrazilDeviceBindingAction onResponseError: ", r8));
                ((C118555us) this.A00).A0A.A00((C117575tD) null);
                return;
            case 3:
                Log.e(AnonymousClass000.A0g("PAY: BrazilMerchantLinkAction response error: ", r8));
                ((C117635tJ) this.A00).A06.A00((C35441lw) null, r8);
                return;
            case 4:
                Log.e(AnonymousClass000.A0g("PAY: BrazilMerchantPreLinkAction response error: ", r8));
                ((C112125hz) this.A00).A06.A00(r8, (C117465t2) null);
                return;
            case 5:
                ((C112115hy) this.A00).A07.A00(C110115dX.A0N());
                return;
            case 6:
                Log.i(AnonymousClass000.A0g("PAY: BrazilVerifyCardOTPSendAction onResponseError: ", r8));
                ((C112165i3) this.A00).A05.A00((C35391lr) null, r8);
                return;
            case 7:
                Log.i(AnonymousClass000.A0g("PAY: BrazilVerifyCardSendAuthCodeAction onResponseError: ", r8));
                ((C112155i2) this.A00).A04.A00(r8);
                return;
            default:
                C118425uf r2 = (C118425uf) this.A00;
                r2.A06.A06(AnonymousClass000.A0g("onResponseError: ", r8));
                r2.A05.AWV(r8, (String) null);
                return;
        }
    }

    public void A05(C28371Vv r11) {
        C28371Vv A0J;
        C28371Vv A0J2;
        C28371Vv A0J3;
        C28371Vv A0J4;
        C28371Vv[] r0;
        int length;
        C28371Vv A0J5;
        C28371Vv[] r02;
        int length2;
        C42511xv A012;
        int i2;
        switch (this.A01) {
            case 0:
                C28371Vv A0X = C110115dX.A0X(r11);
                if (A0X == null || (A0J5 = A0X.A0J("card")) == null) {
                    ((C112135i0) this.A00).A0E.A00((C35391lr) null, C110115dX.A0N(), (ArrayList) null, false, false);
                    return;
                }
                C111815hS r2 = new C111815hS();
                C112135i0 r7 = (C112135i0) this.A00;
                C30671cl A0E = C110115dX.A0E(r7.A06, r2, A0J5);
                r7.A0D.A01((ImageView) null, A0E);
                if (r2.A0a) {
                    A012 = r7.A0A.A01();
                    i2 = 0;
                } else if (r2.A08) {
                    boolean z2 = r2.A07;
                    A012 = r7.A0A.A01();
                    i2 = z2 ? 2 : 1;
                } else {
                    ArrayList A0u = AnonymousClass000.A0u();
                    C28371Vv A0J6 = A0X.A0J("verify-method-list");
                    if (A0J6 == null || (r02 = A0J6.A03) == null || (length2 = r02.length) <= 0) {
                        r7.A0A.A01().A02(new IDxSListenerShape43S0300000_3_I1(A0E, r7, A0u, 0), A0E);
                        return;
                    }
                    int i3 = 0;
                    do {
                        A0u.add(new AnonymousClass638(A0J6.A0I(i3)));
                        i3++;
                    } while (i3 < length2);
                    r7.A0A.A01().A02(new IDxSListenerShape43S0300000_3_I1(A0E, r7, A0u, 0), A0E);
                    return;
                }
                C110115dX.A0z(A012, A0E, this, i2);
                return;
            case 1:
                C28371Vv A0X2 = C110115dX.A0X(r11);
                int i4 = 0;
                if (A0X2 == null || (A0J4 = A0X2.A0J("card")) == null) {
                    ((C118815vI) this.A00).A0B.APf((C35391lr) null, C110115dX.A0N(), (ArrayList) null, false);
                    return;
                }
                C111815hS r9 = new C111815hS();
                C118815vI r72 = (C118815vI) this.A00;
                r9.A01(r72.A05, A0J4, 0);
                C35391lr r5 = (C35391lr) r9.A05();
                ArrayList A0u2 = AnonymousClass000.A0u();
                C28371Vv A0J7 = A0X2.A0J("verify-method-list");
                if (A0J7 == null || (r0 = A0J7.A03) == null || (length = r0.length) <= 0) {
                    r72.A0B.APf(r5, (AnonymousClass2HJ) null, A0u2, r9.A0a);
                    return;
                }
                do {
                    A0u2.add(new AnonymousClass638(A0J7.A0I(i4)));
                    i4++;
                } while (i4 < length);
                r72.A0B.APf(r5, (AnonymousClass2HJ) null, A0u2, r9.A0a);
                return;
            case 2:
                C28371Vv A0X3 = C110115dX.A0X(r11);
                if (A0X3 == null || (A0J3 = A0X3.A0J("elo")) == null) {
                    C117905tk r1 = ((C118555us) this.A00).A0A;
                    new AnonymousClass2HJ();
                    r1.A00((C117575tD) null);
                    return;
                }
                C117575tD r6 = new C117575tD("1", A0J3.A0N("challenge_id", (String) null), (String) null, 5);
                String A0N = A0J3.A0N("ciphered_wallet_secret", (String) null);
                C118555us r52 = (C118555us) this.A00;
                C18300wT r4 = r52.A05.A01;
                String string = r4.A01().getString("payment_trusted_device_elo_wallet_store", (String) null);
                JSONObject jSONObject = null;
                if (string != null) {
                    try {
                        jSONObject = C13700nu.A0K(string);
                    } catch (JSONException unused) {
                        r4.A02.A06("Failed to updated the wallet_secret");
                    }
                } else {
                    jSONObject = C13700nu.A0J();
                }
                jSONObject.put("wallet_secret", A0N);
                C13680ns.A0y(C110105dW.A06(r4), "payment_trusted_device_elo_wallet_store", jSONObject.toString());
                r52.A0A.A00(r6);
                return;
            case 3:
                try {
                    C28371Vv A0K = r11.A0K("account");
                    AnonymousClass2HJ A002 = AnonymousClass2HJ.A00(A0K);
                    if (A002 != null) {
                        ((C117635tJ) this.A00).A06.A00((C35441lw) null, A002);
                        return;
                    }
                    C111825hT r53 = new C111825hT();
                    C117635tJ r42 = (C117635tJ) this.A00;
                    r53.A01(r42.A02, A0K.A0K("merchant"), 0);
                    C110115dX.A0z(r42.A05.A01(), r53.A05(), this, 6);
                    return;
                } catch (AnonymousClass1W9 e2) {
                    Log.e("PAY: BrazilMerchantLinkAction/regMerchant: invalid response message", e2);
                    ((C117635tJ) this.A00).A06.A00((C35441lw) null, C110115dX.A0N());
                    return;
                }
            case 4:
                C28371Vv A0X4 = C110115dX.A0X(r11);
                AnonymousClass00B.A06(A0X4);
                C117465t2 r3 = new C117465t2(A0X4);
                AnonymousClass2HJ r22 = r3.A00;
                C117935tn r03 = ((C112125hz) this.A00).A06;
                if (r22 == null) {
                    r03.A00((AnonymousClass2HJ) null, r3);
                    return;
                } else {
                    r03.A00(r22, (C117465t2) null);
                    return;
                }
            case 5:
                try {
                    C28371Vv A0K2 = r11.A0K("account");
                    AnonymousClass2HJ A003 = AnonymousClass2HJ.A00(A0K2);
                    if (A003 != null) {
                        ((C112115hy) this.A00).A07.A00(A003);
                        return;
                    }
                    C111825hT r43 = new C111825hT();
                    C112115hy r32 = (C112115hy) this.A00;
                    r43.A01(r32.A03, A0K2.A0K("merchant"), 0);
                    C110115dX.A0z(r32.A06.A01(), r43.A05(), this, 7);
                    return;
                } catch (AnonymousClass1W9 unused2) {
                    Log.e("PAY: BrazilMerchantRegAction/regMerchant: invalid response message");
                    ((C112115hy) this.A00).A07.A00(C110115dX.A0N());
                    return;
                }
            case 6:
                Log.i("PAY: BrazilVerifyCardOTPSendAction success");
                C28371Vv A0X5 = C110115dX.A0X(r11);
                if (A0X5 == null || (A0J2 = A0X5.A0J("card")) == null) {
                    ((C112165i3) this.A00).A05.A00((C35391lr) null, C110115dX.A0N());
                    return;
                }
                C111815hS r23 = new C111815hS();
                C112165i3 r12 = (C112165i3) this.A00;
                C110115dX.A0z(r12.A07.A01(), C110115dX.A0E(r12.A01, r23, A0J2), this, 8);
                return;
            case 7:
                Log.i("PAY: BrazilVerifyCardSendAuthCodeAction success");
                C28371Vv A0X6 = C110115dX.A0X(r11);
                if (!(A0X6 == null || (A0J = A0X6.A0J("card")) == null)) {
                    C111815hS r24 = new C111815hS();
                    C112155i2 r13 = (C112155i2) this.A00;
                    C110115dX.A0z(r13.A07.A01(), C110115dX.A0E(r13.A01, r24, A0J), this, 9);
                }
                Log.i(AnonymousClass000.A0g("PAY: BrazilVerifyCardSendAuthCodeAction onResponseSuccess: ", r11));
                return;
            default:
                C28371Vv A0X7 = C110115dX.A0X(r11);
                AnonymousClass68U r14 = ((C118425uf) this.A00).A05;
                if (A0X7 != null) {
                    r14.AWV((AnonymousClass2HJ) null, A0X7.A0N("token-id", (String) null));
                    return;
                } else {
                    r14.AWV(C110115dX.A0N(), (String) null);
                    return;
                }
        }
    }
}
