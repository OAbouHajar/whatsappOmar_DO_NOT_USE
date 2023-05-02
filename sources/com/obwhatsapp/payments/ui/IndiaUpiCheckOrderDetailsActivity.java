package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass17Y;
import X.AnonymousClass1JN;
import X.AnonymousClass1MA;
import X.AnonymousClass1N2;
import X.AnonymousClass1NO;
import X.AnonymousClass1TS;
import X.AnonymousClass2HJ;
import X.AnonymousClass2ZJ;
import X.AnonymousClass4W4;
import X.AnonymousClass4XO;
import X.AnonymousClass5Q8;
import X.AnonymousClass5kb;
import X.AnonymousClass5u4;
import X.AnonymousClass61W;
import X.AnonymousClass628;
import X.AnonymousClass629;
import X.AnonymousClass65Y;
import X.AnonymousClass69W;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C111765hN;
import X.C111805hR;
import X.C111855hW;
import X.C112185i5;
import X.C112525id;
import X.C113285ln;
import X.C114585o0;
import X.C115255pS;
import X.C116635rh;
import X.C117735tT;
import X.C1204261p;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C14870pt;
import X.C16040sK;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C17030uP;
import X.C17110uY;
import X.C18090w8;
import X.C18290wS;
import X.C18450wi;
import X.C19150xq;
import X.C216114t;
import X.C218315p;
import X.C221116r;
import X.C28401Vy;
import X.C30671cl;
import X.C35081lL;
import X.C35421lu;
import X.C35431lv;
import X.C797441c;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.obwhatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.IDxATaskShape27S0200000_3_I1;
import java.util.ArrayList;
import java.util.HashMap;

public class IndiaUpiCheckOrderDetailsActivity extends AnonymousClass5kb implements AnonymousClass69W {
    public C17030uP A00;
    public AnonymousClass013 A01;
    public C19150xq A02;
    public C112185i5 A03;
    public AnonymousClass1MA A04;
    public AnonymousClass629 A05;
    public AnonymousClass2ZJ A06;
    public C113285ln A07;
    public AnonymousClass1N2 A08;
    public AnonymousClass1TS A09;
    public C17110uY A0A;

    public void A3M(Intent intent) {
        super.A3M(intent);
        intent.putExtra("extra_order_id", this.A05.A0C);
        intent.putExtra("extra_order_expiry_ts_in_sec", this.A05.A00);
        intent.putExtra("extra_payment_config_id", this.A05.A0D);
    }

    public void A3z(C111765hN r3, C111765hN r4, AnonymousClass2HJ r5, String str, String str2, boolean z2) {
        super.A3z(r3, r4, r5, str, str2, z2);
        if (r5 == null && r3 == null && r4 == null && str != null) {
            this.A05.Acl(new AnonymousClass65Y(this, str));
        }
    }

    public final void A4B(C28401Vy r7, String str) {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("action", "start");
        HashMap A0x2 = AnonymousClass000.A0x();
        A0x2.put("receiver_jid", this.A0C.getRawString());
        A0x2.put("receiver_vpa", str);
        A0x2.put("order_message_id", this.A05.A08.A01);
        ((AnonymousClass1JN) this.A0k.get()).A00((AnonymousClass5Q8) null, new C1204261p(r7, this), new AnonymousClass4W4(A0x, "upi_p2m_order_payment", (String) null), this instanceof IndiaUpiQuickBuyActivity ? "chat" : "order_details", A0x2);
    }

    public final void A4C(C797441c r12, C117735tT r13, int i2) {
        C005402i x2 = x();
        int i3 = i2;
        if (x2 != null) {
            int i4 = R.string.str0edc;
            if (i2 == 1) {
                i4 = R.string.str0e99;
            }
            x2.A0J(getResources().getString(i4));
        }
        int i5 = 11;
        if (i2 == 1) {
            i5 = 4;
        }
        C117735tT r7 = r13;
        this.A09.A01(r13.A07, this.A05.A09, i5);
        Object obj = C115255pS.A00(this.A0C.A05(1767)).get(this.A05.A09);
        AnonymousClass629 r0 = this.A05;
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2 = r0.A04;
        C16040sK r5 = this.A01;
        int i6 = 1;
        if (obj == null) {
            i6 = 0;
        }
        paymentCheckoutOrderDetailsViewV2.A00(this, r5, r12, r7, r0.A09, i6, i3);
    }

    public boolean AJV() {
        return this instanceof IndiaUpiQuickBuyActivity;
    }

    public void AUE(C797441c r4, C117735tT r5) {
        if (this instanceof IndiaUpiQuickBuyActivity) {
            C13680ns.A1U(new IDxATaskShape27S0200000_3_I1(r5, 2, this), this.A05);
            return;
        }
        A4C(r4, r5, r5.A00);
    }

    public void AUF(C797441c r2, C117735tT r3) {
        A4C(r2, r3, 4);
    }

    public void AX1(C35431lv r14) {
        if (!TextUtils.isEmpty(this.A05.A0B) && this.A0a.A0e(this.A0C)) {
            this.A06 = C110105dW.A0J(C110105dW.A0L(), String.class, this.A05.A0B, "moneyStringValue");
            this.A0G = this.A0C;
        }
        C30671cl r1 = this.A0B;
        if (r1 != null) {
            C111805hR r0 = (C111805hR) r1.A08;
            if (r0 == null || AnonymousClass000.A1X(r0.A05.A00)) {
                Afq(R.string.str13db);
                C112185i5 r5 = this.A03;
                String str = this.A05.A0D;
                UserJid userJid = this.A0C;
                AnonymousClass5u4 r6 = new AnonymousClass5u4(r14, this);
                ArrayList A0u = AnonymousClass000.A0u();
                C110105dW.A1P("action", "upi-get-p2m-config", A0u);
                if (str != null) {
                    C110105dW.A1P("payment-config-id", str, A0u);
                }
                if (userJid != null) {
                    A0u.add(new C35081lL((Jid) userJid, "receiver"));
                }
                AnonymousClass4XO A022 = C116635rh.A02(r5, "upi-get-p2m-config");
                r5.A04.A0H(new IDxNCallbackShape21S0200000_3_I1(r5.A00, r5.A01, r5.A03, A022, r5, r6), C110105dW.A0V(A0u), "get", AnonymousClass1NO.A0L);
                return;
            }
            IndiaUpiPinPrimerDialogFragment A0T = C110115dX.A0T(r1, this);
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            paymentBottomSheet.A01 = A0T;
            Afb(paymentBottomSheet, "IndiaUpiPinPrimerDialogFragment");
            A3w(paymentBottomSheet);
        } else if (TextUtils.isEmpty(this.A05.A0B) || !this.A0a.A0e(this.A0C)) {
            A3u(this, false);
        } else {
            overridePendingTransition(0, 0);
            PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
            String str2 = this.A05.A0B;
            C18450wi.A0H(str2, 0);
            PaymentCheckoutIncentiveFragment paymentCheckoutIncentiveFragment = new PaymentCheckoutIncentiveFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putString("extra_formatted_discount", str2);
            paymentCheckoutIncentiveFragment.A0T(A0D);
            paymentCheckoutIncentiveFragment.A00 = new AnonymousClass628(this);
            paymentBottomSheet2.A01 = paymentCheckoutIncentiveFragment;
            Afb(paymentBottomSheet2, "PaymentCheckoutOrderDiscountFragment");
            A3w(paymentBottomSheet2);
            AnonymousClass61W r52 = this.A0E;
            String str3 = this.A0g;
            AnonymousClass61W.A01(r52.A03(0, (Integer) null, "payment_intro_prompt", str3), C112525id.A00(), r52, false);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1008 || i2 == 1015) {
            A3p();
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C16440t3 r30 = this.A05;
        C14710pd r18 = this.A0C;
        C14870pt r29 = this.A05;
        C17110uY r17 = this.A0A;
        C218315p r15 = this.A0a;
        AnonymousClass013 r14 = this.A01;
        AnonymousClass1N2 r13 = this.A08;
        C18290wS r12 = this.A0P;
        C16460t6 r11 = this.A09;
        C19150xq r10 = this.A02;
        C17030uP r9 = this.A00;
        C18090w8 r8 = this.A0O;
        C221116r r7 = this.A07;
        AnonymousClass1MA r6 = this.A04;
        C216114t r5 = this.A08;
        AnonymousClass1TS r4 = this.A09;
        AnonymousClass17Y r3 = this.A0J;
        C17110uY r27 = r17;
        C16320sq r28 = this.A05;
        AnonymousClass1N2 r24 = r13;
        C16460t6 r152 = r11;
        C19150xq r16 = r10;
        C221116r r172 = r7;
        AnonymousClass17Y r19 = r3;
        C14870pt r102 = r29;
        C17030uP r112 = r9;
        C16440t3 r122 = r30;
        AnonymousClass013 r132 = r14;
        C216114t r142 = r5;
        AnonymousClass629 r92 = new AnonymousClass629(r102, r112, r122, r132, r142, r152, r16, r172, r18, r19, r8, r12, r6, this.A06, r24, r15, r4, r27, r28);
        this.A05 = r92;
        r92.A00(this, this);
        if (!(this instanceof IndiaUpiQuickBuyActivity)) {
            C005402i x2 = x();
            if (x2 != null) {
                x2.A0N(true);
            }
            setContentView((View) this.A05.A04);
        }
        this.A0p = true;
        C111855hW r32 = this.A0H;
        AnonymousClass629 r2 = this.A05;
        String str = r2.A0C;
        if (str == null) {
            str = "";
        }
        r32.A02 = new C35421lu(str, r2.A08.A01, (String) null, r2.A00);
        if (this.A0V != null || !C111345g2.A21(this)) {
            Ac1();
        } else {
            C114585o0 r22 = new C114585o0(this);
            this.A0V = r22;
            C13680ns.A1U(r22, this.A05);
        }
        A3q();
        C16440t3 r52 = this.A05;
        this.A03 = new C112185i5(this, this.A05, r52, this.A0B, this.A0K, this.A0M);
    }

    public void onResume() {
        super.onResume();
        if (C111345g2.A21(this) && !this.A06.A07.contains("upi-get-challenge") && this.A0C.A06().A00 == null) {
            this.A0t.A06("onResume getChallenge");
            Afq(R.string.str13db);
            this.A06.A03("upi-get-challenge");
            A3Y();
        }
    }
}
