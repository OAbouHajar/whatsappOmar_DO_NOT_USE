package com.whatsapp.util;

import X.AnonymousClass00B;
import X.AnonymousClass01R;
import X.AnonymousClass160;
import X.AnonymousClass1Vt;
import X.AnonymousClass1XL;
import X.AnonymousClass1XP;
import X.AnonymousClass1ZR;
import X.AnonymousClass2HJ;
import X.AnonymousClass66S;
import X.C110105dW;
import X.C110115dX;
import X.C111805hR;
import X.C111855hW;
import X.C112715ix;
import X.C112765jH;
import X.C112815jT;
import X.C112825ja;
import X.C112935km;
import X.C118405ud;
import X.C1200960h;
import X.C15830rv;
import X.C16690tT;
import X.C16740tZ;
import X.C18210wK;
import X.C18270wQ;
import X.C18310wU;
import X.C28401Vy;
import X.C28411Vz;
import X.C30581cc;
import X.C30671cl;
import X.C30771cv;
import X.C34151jm;
import X.C35361lo;
import X.C35521m4;
import X.C38641rB;
import X.C39901tF;
import X.C40031tS;
import com.facebook.redex.IDxCallbackShape250S0100000_3_I1;
import com.obwhatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;
import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class IDxATaskShape109S0100000_3_I1 extends C16690tT {
    public Object A00;
    public final int A01;

    public IDxATaskShape109S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C39901tF r4;
        C30581cc A04;
        switch (this.A01) {
            case 0:
                C112815jT r2 = (C112815jT) ((IDxCallbackShape250S0100000_3_I1) this.A00).A00;
                return C110115dX.A0H(r2.A0P).A08(r2.A00.A0A);
            case 1:
                C112815jT r6 = (C112815jT) this.A00;
                List A02 = r6.A0I.A02();
                C40031tS A012 = r6.A0I.A01("2fa");
                if (!A02.contains(A012)) {
                    r6.A0I.A08(A012);
                }
                List A0i = C110105dW.A0i(r6.A0P);
                C30671cl A002 = AnonymousClass160.A00(r6.A00.A0A, A0i);
                if (A002 == null || (r4 = A002.A08) == null) {
                    return A002;
                }
                ((C111805hR) r4).A05 = C110105dW.A0J(C110105dW.A0L(), Boolean.class, Boolean.TRUE, "isPinSet");
                C110115dX.A0H(r6.A0P).A0K(A0i);
                return A002;
            default:
                C112825ja r0 = (C112825ja) this.A00;
                PaymentView A35 = r0.A35();
                if (A35 == null || A35.getStickerIfSelected() == null) {
                    C18310wU r42 = r0.A0M;
                    if (r0 instanceof IndiaUpiSendPaymentActivity) {
                        PaymentView paymentView = r0.A0X;
                        String paymentNote = paymentView != null ? paymentView.getPaymentNote() : "";
                        PaymentView paymentView2 = r0.A0X;
                        A04 = r0.A36(paymentNote, paymentView2 != null ? paymentView2.getMentionedJids() : null);
                    } else {
                        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) r0;
                        A04 = indiaUpiCheckOrderDetailsActivity.A0b.A04((AnonymousClass1ZR) null, indiaUpiCheckOrderDetailsActivity.A0E, indiaUpiCheckOrderDetailsActivity.A09.A0K.A03(indiaUpiCheckOrderDetailsActivity.A05.A08), (C30771cv) null, "", (List) null, 0, false, false);
                    }
                    C28401Vy r62 = r0.A0A;
                    C28411Vz r5 = r0.A09;
                    C30671cl r7 = r0.A0B;
                    C111855hW r8 = r0.A0H;
                    String str = r0.A0l;
                    String str2 = r0.A0m;
                    PaymentView paymentView3 = r0.A0X;
                    return r42.A02(r5, r62, r7, r8, paymentView3 != null ? paymentView3.getPaymentBackground() : null, A04, str, str2, C112765jH.A23(r0));
                }
                C118405ud r3 = r0.A0W;
                PaymentView paymentView4 = r0.A0X;
                C34151jm stickerIfSelected = paymentView4 != null ? paymentView4.getStickerIfSelected() : null;
                AnonymousClass00B.A06(stickerIfSelected);
                AnonymousClass1XP r1 = r0.A0D;
                String str3 = r0.A0f;
                C15830rv r82 = r0.A0E;
                AnonymousClass00B.A06(r82);
                UserJid userJid = r0.A0G;
                long j2 = r0.A02;
                C16740tZ A003 = j2 != 0 ? r0.A09.A0K.A00(j2) : null;
                PaymentView paymentView5 = r0.A0X;
                Integer stickerSendOrigin = paymentView5 != null ? paymentView5.getStickerSendOrigin() : null;
                C28401Vy r10 = r0.A0A;
                C28411Vz r9 = r0.A09;
                C30671cl r11 = r0.A0B;
                C111855hW r12 = r0.A0H;
                String str4 = r0.A0l;
                String str5 = r0.A0m;
                C35361lo paymentBackground = paymentView5 != null ? paymentView5.getPaymentBackground() : null;
                boolean A23 = C112765jH.A23(r0);
                C38641rB A022 = r3.A04.A02(r82, userJid, A003, stickerIfSelected, stickerSendOrigin);
                boolean A0J = r3.A03.A0J(r9, r10, r11, r12, paymentBackground, A022, str4, str5, A23);
                if (r1 == null) {
                    C18210wK r43 = r3.A02;
                    AnonymousClass1XL A004 = C18270wQ.A00(stickerIfSelected, str3);
                    AnonymousClass00B.A06(A004);
                    r1 = r43.A02(A004, true);
                }
                r3.A00.A0K(new AnonymousClass66S(r1, r3, A022));
                r3.A05.A00(paymentBackground, A022);
                if (A0J) {
                    return A022.A0L;
                }
                return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        switch (this.A01) {
            case 0:
                C30671cl r9 = (C30671cl) obj;
                IDxCallbackShape250S0100000_3_I1 iDxCallbackShape250S0100000_3_I1 = (IDxCallbackShape250S0100000_3_I1) this.A00;
                if (r9 != null) {
                    C112815jT r2 = (C112815jT) iDxCallbackShape250S0100000_3_I1.A00;
                    C35521m4 r92 = (C35521m4) r9;
                    r2.A00 = r92;
                    r2.A01.A01((C111805hR) r92.A08, r2);
                    return;
                }
                ((C112935km) iDxCallbackShape250S0100000_3_I1.A00).A3b();
                return;
            case 1:
                C30671cl r93 = (C30671cl) obj;
                if (r93 != null) {
                    C112815jT r0 = (C112815jT) this.A00;
                    C35521m4 r94 = (C35521m4) r93;
                    r0.A00 = r94;
                    r0.A04 = r94;
                    AnonymousClass01R.A01(r0.getApplicationContext(), IndiaUpiPayIntentReceiverActivity.class, true);
                }
                C112815jT r02 = (C112815jT) this.A00;
                r02.Ac1();
                C112815jT.A02(r02);
                r02.finish();
                return;
            default:
                AnonymousClass1Vt r95 = (AnonymousClass1Vt) obj;
                C112825ja r6 = (C112825ja) this.A00;
                if (!r6.A0t) {
                    r6.A0F.A06(123, 2);
                    r6.Ac1();
                    r6.A3H();
                    r6.A37(0);
                    return;
                } else if (r95 == null) {
                    AnonymousClass2HJ r5 = new AnonymousClass2HJ(C1200960h.A00(r6.A06, 0));
                    C112715ix r4 = r6.A0F;
                    r4.A05(123, "error_code", (long) r5.A00);
                    r4.A06(123, 3);
                    r6.A41(r5);
                    return;
                } else {
                    r6.A0F.A06(123, 2);
                    r6.A3y(r95, true);
                    return;
                }
        }
    }
}
