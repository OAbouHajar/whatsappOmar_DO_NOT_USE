package com.obwhatsapp.payments.actions;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1W3;
import X.AnonymousClass1W9;
import X.AnonymousClass2HJ;
import X.AnonymousClass4XO;
import X.AnonymousClass5Q3;
import X.AnonymousClass5u4;
import X.AnonymousClass5u8;
import X.AnonymousClass61W;
import X.AnonymousClass68P;
import X.AnonymousClass68Q;
import X.AnonymousClass68R;
import X.AnonymousClass68T;
import X.AnonymousClass68Y;
import X.C110105dW;
import X.C110115dX;
import X.C110705eh;
import X.C111775hO;
import X.C112175i4;
import X.C112185i5;
import X.C112275iE;
import X.C112305iH;
import X.C112315iI;
import X.C112325iJ;
import X.C112345iL;
import X.C112355iM;
import X.C112485iZ;
import X.C112715ix;
import X.C116335rD;
import X.C117425sy;
import X.C117955tp;
import X.C117985ts;
import X.C1222868z;
import X.C14870pt;
import X.C18290wS;
import X.C18340wX;
import X.C28371Vv;
import X.C28401Vy;
import X.C30681cm;
import X.C35301lh;
import X.C35481m0;
import X.C35491m1;
import X.C35521m4;
import X.C39911tG;
import X.C46042Cc;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.redex.IDxSListenerShape12S0400000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public class IDxNCallbackShape21S0200000_3_I1 extends C112485iZ {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, C112175i4 r12, C116335rD r13) {
        super(context, r9, r10, r11, "upi-verify-qr-code");
        this.A02 = 13;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, C112175i4 r12, AnonymousClass5u8 r13) {
        super(context, r9, r10, r11, "upi-sign-qr-code");
        this.A02 = 12;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, C112185i5 r12, AnonymousClass5u4 r13) {
        super(context, r9, r10, r11, "upi-get-p2m-config");
        this.A02 = 3;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r13, C18340wX r14, AnonymousClass4XO r15, C112275iE r16, AnonymousClass61W r17, AnonymousClass68Y r18, C112715ix r19, String str) {
        super(context, r13, r14, r15, r17, r19, "upi-register-vpa", str, 5);
        this.A02 = 14;
        this.A00 = r16;
        this.A01 = r18;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, C112315iI r12, C117985ts r13) {
        super(context, r9, r10, r11, "upi-check-balance");
        this.A02 = 10;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r11, C18340wX r12, AnonymousClass4XO r13, C112325iJ r14, AnonymousClass61W r15, Integer num) {
        super(context, r11, r12, r13, r15, "upi-list-keys", 1);
        this.A02 = 11;
        this.A00 = r14;
        this.A01 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, C112345iL r12, C117955tp r13) {
        super(context, r9, r10, r11, "upi-collect-from-vpa");
        this.A02 = 2;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, AnonymousClass68P r12, C112345iL r13) {
        super(context, r9, r10, r11, "upi-accept-collect");
        this.A02 = 0;
        this.A00 = r13;
        this.A01 = r12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxNCallbackShape21S0200000_3_I1(android.content.Context r7, X.C14870pt r8, X.C18340wX r9, X.AnonymousClass4XO r10, X.AnonymousClass68Q r11, X.C112355iM r12, int r13) {
        /*
            r6 = this;
            r0 = r6
            r6.A02 = r13
            switch(r13) {
                case 5: goto L_0x001a;
                case 6: goto L_0x0017;
                case 7: goto L_0x0014;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.String r5 = "upi-resume-mandate"
        L_0x0008:
            r6.A00 = r12
            r6.A01 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0014:
            java.lang.String r5 = "upi-pause-mandate"
            goto L_0x0008
        L_0x0017:
            java.lang.String r5 = "upi-revoke-mandate"
            goto L_0x0008
        L_0x001a:
            java.lang.String r5 = "upi-accept-mandate-request"
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1.<init>(android.content.Context, X.0pt, X.0wX, X.4XO, X.68Q, X.5iM, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, AnonymousClass68R r12, C112305iH r13) {
        super(context, r9, r10, r11, "upi-generate-otp");
        this.A02 = 9;
        this.A00 = r13;
        this.A01 = r12;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r9, AnonymousClass5Q3 r10, C18340wX r11, AnonymousClass4XO r12, C112345iL r13) {
        super(context, r9, r11, r12, "upi-reject-collect");
        this.A02 = 1;
        this.A00 = r13;
        this.A01 = r10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape21S0200000_3_I1(Context context, C14870pt r9, AnonymousClass5Q3 r10, C18340wX r11, AnonymousClass4XO r12, C112355iM r13) {
        super(context, r9, r11, r12, "upi-reject-mandate-request");
        this.A02 = 4;
        this.A00 = r13;
        this.A01 = r10;
    }

    public void A03(AnonymousClass2HJ r10) {
        AnonymousClass2HJ r4 = r10;
        switch (this.A02) {
            case 0:
                super.A03(r10);
                ((AnonymousClass68P) this.A01).ALx(r10);
                return;
            case 1:
            case 4:
                super.A03(r10);
                ((AnonymousClass5Q3) this.A01).AVy(r10);
                return;
            case 2:
                super.A03(r10);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C117955tp) this.A01).A00;
                if (r10 == null) {
                    indiaUpiSendPaymentActivity.A0F.A06(123, 2);
                }
                indiaUpiSendPaymentActivity.A42(r10, true);
                return;
            case 3:
                super.A03(r10);
                ((AnonymousClass5u4) this.A01).A00(r4, (String) null, (String) null, (String) null, (String) null);
                return;
            case 9:
                super.A03(r10);
                AnonymousClass68R r0 = (AnonymousClass68R) this.A01;
                if (r0 != null) {
                    r0.AWD(r10);
                    return;
                }
                return;
            case 10:
                super.A03(r10);
                ((C117985ts) this.A01).A00((C28401Vy) null, (C28401Vy) null, r10);
                return;
            case 11:
                super.A03(r10);
                C112325iJ r3 = (C112325iJ) this.A00;
                r3.A0F.A07(r10, (Integer) this.A01, "upi-list-keys");
                C1222868z r1 = r3.A00;
                if (r1 != null) {
                    r1.ASh(r10, (String) null);
                    return;
                }
                return;
            case 12:
                super.A03(r10);
                ((AnonymousClass5u8) this.A01).A00(r10, (String) null);
                return;
            case 13:
                super.A03(r10);
                C110705eh r02 = ((C116335rD) this.A01).A00;
                if (r10 != null) {
                    C117425sy.A00(r02.A01, 4);
                    return;
                } else {
                    r02.A06();
                    return;
                }
            case 14:
                super.A03(r10);
                AnonymousClass68T r12 = ((C112275iE) this.A00).A01;
                if (r12 != null) {
                    r12.AVw((C35521m4) null, r10);
                    return;
                }
                return;
            default:
                super.A03(r10);
                ((AnonymousClass68Q) this.A01).AWL(r10);
                return;
        }
    }

    public void A04(AnonymousClass2HJ r10) {
        AnonymousClass2HJ r4 = r10;
        switch (this.A02) {
            case 0:
                super.A04(r10);
                ((AnonymousClass68P) this.A01).ALx(r10);
                return;
            case 1:
            case 4:
                super.A04(r10);
                ((AnonymousClass5Q3) this.A01).AVy(r10);
                return;
            case 2:
                super.A04(r10);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C117955tp) this.A01).A00;
                if (r10 == null) {
                    indiaUpiSendPaymentActivity.A0F.A06(123, 2);
                }
                indiaUpiSendPaymentActivity.A42(r10, true);
                return;
            case 3:
                super.A04(r10);
                ((AnonymousClass5u4) this.A01).A00(r4, (String) null, (String) null, (String) null, (String) null);
                return;
            case 9:
                super.A04(r10);
                AnonymousClass68R r0 = (AnonymousClass68R) this.A01;
                if (r0 != null) {
                    r0.AWD(r10);
                    return;
                }
                return;
            case 10:
                super.A04(r10);
                ((C117985ts) this.A01).A00((C28401Vy) null, (C28401Vy) null, r10);
                return;
            case 11:
                super.A04(r10);
                C112325iJ r3 = (C112325iJ) this.A00;
                r3.A0F.A07(r10, (Integer) this.A01, "upi-list-keys");
                C1222868z r1 = r3.A00;
                if (r1 != null) {
                    r1.ASh(r10, (String) null);
                    return;
                }
                return;
            case 12:
                super.A04(r10);
                ((AnonymousClass5u8) this.A01).A00(r10, (String) null);
                return;
            case 13:
                super.A04(r10);
                C110705eh r02 = ((C116335rD) this.A01).A00;
                if (r10 != null) {
                    C117425sy.A00(r02.A01, 4);
                    return;
                } else {
                    r02.A06();
                    return;
                }
            case 14:
                super.A04(r10);
                AnonymousClass68T r12 = ((C112275iE) this.A00).A01;
                if (r12 != null) {
                    r12.AVw((C35521m4) null, r10);
                    return;
                }
                return;
            default:
                super.A04(r10);
                ((AnonymousClass68Q) this.A01).AWL(r10);
                return;
        }
    }

    public void A05(C28371Vv r26) {
        String str;
        C28371Vv r3 = r26;
        switch (this.A02) {
            case 0:
                super.A05(r3);
                ((AnonymousClass68P) this.A01).ALx((AnonymousClass2HJ) null);
                return;
            case 1:
            case 4:
                super.A05(r3);
                ((AnonymousClass5Q3) this.A01).AVy((AnonymousClass2HJ) null);
                return;
            case 2:
                super.A05(r3);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C117955tp) this.A01).A00;
                indiaUpiSendPaymentActivity.A0F.A06(123, 2);
                indiaUpiSendPaymentActivity.A42((AnonymousClass2HJ) null, true);
                return;
            case 3:
                try {
                    C28371Vv A0K = r3.A0K("account");
                    ((AnonymousClass5u4) this.A01).A00((AnonymousClass2HJ) null, A0K.A0M("mcc"), A0K.A0M("receiver-vpa"), A0K.A0N("payee-name", (String) null), A0K.A0N("purpose-code", (String) null));
                    return;
                } catch (AnonymousClass1W9 unused) {
                    new AnonymousClass2HJ();
                    IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = ((AnonymousClass5u4) this.A01).A01;
                    indiaUpiCheckOrderDetailsActivity.Ac1();
                    indiaUpiCheckOrderDetailsActivity.Afg(R.string.str1031);
                    return;
                }
            case 9:
                super.A05(r3);
                AnonymousClass68R r1 = (AnonymousClass68R) this.A01;
                if (r1 != null) {
                    r1.AWD((AnonymousClass2HJ) null);
                    return;
                }
                return;
            case 10:
                super.A05(r3);
                C28371Vv A0X = C110115dX.A0X(r3);
                if (A0X == null) {
                    Log.e("PAY: IndiaUpiPaymentMethodAction sendCheckPin: empty account node");
                } else {
                    C111775hO r4 = new C111775hO();
                    r4.A01(((C112315iI) this.A00).A04, A0X, 6);
                    if (r4.A0F() == null && r4.A0L() && r4.A06() != null) {
                        String A06 = r4.A06();
                        int i2 = ((C35491m1) C35481m0.A05).A01;
                        ((C117985ts) this.A01).A00(C28401Vy.A00(A06, i2), C28401Vy.A00(r4.A0G(), i2), (AnonymousClass2HJ) null);
                        return;
                    }
                }
                ((C117985ts) this.A01).A00((C28401Vy) null, (C28401Vy) null, C110115dX.A0N());
                return;
            case 11:
                super.A05(r3);
                C28371Vv A0X2 = C110115dX.A0X(r3);
                if (A0X2 == null) {
                    str = "PAY: IndiaUpiPinActions sendGetListKeys: empty account node";
                } else {
                    String A0N = A0X2.A0N("keys", (String) null);
                    if (TextUtils.isEmpty(A0N)) {
                        str = "PAY: IndiaUpiPinActions sendGetListKeys: missing keys";
                    } else {
                        C112325iJ r42 = (C112325iJ) this.A00;
                        r42.A08.A0J(A0N);
                        r42.A0F.A0A((Integer) this.A01, "upi-list-keys", 2);
                        C1222868z r0 = r42.A00;
                        if (r0 != null) {
                            r0.ASh((AnonymousClass2HJ) null, A0N);
                            return;
                        }
                        return;
                    }
                }
                Log.w(str);
                C112325iJ r32 = (C112325iJ) this.A00;
                r32.A0F.A07((AnonymousClass2HJ) null, (Integer) this.A01, "upi-list-keys");
                C1222868z r12 = r32.A00;
                if (r12 != null) {
                    r12.ASh(C110115dX.A0N(), (String) null);
                    return;
                }
                return;
            case 12:
                super.A05(r3);
                C28371Vv A0X3 = C110115dX.A0X(r3);
                if (A0X3 != null) {
                    ((AnonymousClass5u8) this.A01).A00((AnonymousClass2HJ) null, A0X3.A0N("signed-qr-code", (String) null));
                    return;
                }
                return;
            case 13:
                super.A05(r3);
                ((C116335rD) this.A01).A00.A06();
                return;
            case 14:
                super.A05(r3);
                C112275iE r6 = (C112275iE) this.A00;
                C18290wS r11 = r6.A0A;
                C46042Cc AEJ = r11.A05("UPI").AEJ();
                AnonymousClass00B.A06(AEJ);
                ArrayList AaD = AEJ.AaD(r6.A04, r3);
                ArrayList A0u = AnonymousClass000.A0u();
                Iterator it = AaD.iterator();
                C39911tG r21 = null;
                C35521m4 r23 = null;
                while (it.hasNext()) {
                    C39911tG r5 = (C39911tG) ((AnonymousClass1W3) it.next());
                    C30681cm r14 = C30681cm.A0E;
                    String str2 = r5.A06;
                    boolean z2 = r5.A08;
                    int i3 = 2;
                    int i4 = 0;
                    if (z2) {
                        i4 = 2;
                    }
                    boolean z3 = r5.A07;
                    if (!z3) {
                        i3 = 0;
                    }
                    C35301lh r9 = r5.A02;
                    String str3 = (String) C110105dW.A0d(r9);
                    byte[] bArr = r5.A09;
                    C35521m4 r13 = new C35521m4(r14, i4, i3, -1, -1);
                    r13.A0A = str2;
                    r13.A09(str3);
                    r13.A0B = (String) C110105dW.A0d(r5.A01);
                    r13.A0D = bArr;
                    r13.A08 = r5;
                    A0u.add(r13);
                    if ((r9 != null && str3.equals(C110105dW.A0d(r6.A00.A02))) || (r21 == null && (z3 || z2))) {
                        r21 = r5;
                        r23 = r13;
                    }
                }
                r11.A01().A03(new IDxSListenerShape12S0400000_3_I1(this.A01, r21, this, r23, 0), A0u);
                return;
            default:
                super.A05(r3);
                ((AnonymousClass68Q) this.A01).AWL((AnonymousClass2HJ) null);
                return;
        }
    }
}
