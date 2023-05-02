package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1HB;
import X.AnonymousClass1Vo;
import X.AnonymousClass1Vt;
import X.AnonymousClass2H9;
import X.AnonymousClass2HJ;
import X.AnonymousClass3K4;
import X.AnonymousClass4XO;
import X.AnonymousClass5kl;
import X.AnonymousClass5w7;
import X.AnonymousClass5w8;
import X.AnonymousClass5wA;
import X.AnonymousClass5wD;
import X.AnonymousClass5xB;
import X.AnonymousClass5xC;
import X.AnonymousClass612;
import X.AnonymousClass618;
import X.AnonymousClass619;
import X.AnonymousClass68Q;
import X.C005702l;
import X.C110105dW;
import X.C110115dX;
import X.C110645ea;
import X.C111345g2;
import X.C111805hR;
import X.C111855hW;
import X.C112265iD;
import X.C112355iM;
import X.C112365iN;
import X.C112415iS;
import X.C115665q7;
import X.C116635rh;
import X.C116815rz;
import X.C117765tW;
import X.C118025tw;
import X.C118195uI;
import X.C119365wy;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16040sK;
import X.C16150sX;
import X.C17190ug;
import X.C28371Vv;
import X.C28881Zb;
import X.C30671cl;
import X.C32241fu;
import X.C32271fx;
import X.C32461gQ;
import X.C35301lh;
import X.C35431lv;
import X.C35491m1;
import X.C35511m3;
import X.C39841t9;
import X.C49132Rg;
import X.C51812cK;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxDListenerShape160S0100000_3_I1;
import com.facebook.redex.IDxRCallbackShape116S0200000_3_I1;
import com.facebook.redex.IDxSListenerShape248S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class IndiaUpiMandatePaymentActivity extends AnonymousClass5kl {
    public PaymentBottomSheet A00;
    public C110645ea A01;
    public C117765tW A02;
    public AnonymousClass1HB A03;
    public String A04;
    public boolean A05;
    public final AnonymousClass1Vo A06;

    public IndiaUpiMandatePaymentActivity() {
        this(0);
        this.A06 = C110105dW.A0P("IndiaUpiMandatePaymentActivity");
    }

    public IndiaUpiMandatePaymentActivity(int i2) {
        this.A05 = false;
        C110105dW.A0t(this, 54);
    }

    public static Intent A02(Context context, AnonymousClass1Vt r3, String str, int i2) {
        Intent A042 = C110105dW.A04(context, IndiaUpiMandatePaymentActivity.class);
        A042.putExtra("payment_transaction_info", r3 == null ? null : new AnonymousClass2H9(r3));
        A042.putExtra("user_action", i2);
        A042.putExtra("extra_referral_screen", str);
        return A042;
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            C111345g2.A1n(A0C, r1, this);
            this.A03 = C111345g2.A1R(A0C, r1, this);
            this.A02 = (C117765tW) r1.ACL.get();
        }
    }

    public void A3l(C30671cl r45, HashMap hashMap) {
        String str;
        C30671cl r5 = r45;
        C110645ea r0 = this.A01;
        if (r45 == null) {
            r5 = r0.A06;
        }
        r0.A0L.A06("handleCredentialBlob");
        C116815rz.A01(r0.A02, r0.A05);
        AnonymousClass1Vt r1 = r0.A08;
        C111855hW r3 = (C111855hW) r1.A0A;
        AnonymousClass00B.A06(r3);
        HashMap hashMap2 = hashMap;
        switch (r0.A00) {
            case 1:
            case 4:
                AnonymousClass5xB r6 = r3.A0B.A0C;
                C112355iM r8 = r0.A09;
                AnonymousClass619 r7 = new AnonymousClass619(r5, r6, r0);
                Log.i("PAY: acceptPayeeMandate called");
                ArrayList A0u = AnonymousClass000.A0u();
                C110105dW.A1P("action", "upi-accept-mandate-request", A0u);
                r8.A02(r1, A0u);
                C112355iM.A00(r5, hashMap2, A0u);
                C111855hW r52 = (C111855hW) r1.A0A;
                AnonymousClass5xC r02 = r52.A0B;
                AnonymousClass00B.A06(r02);
                C35301lh r2 = r02.A06;
                if (!C39841t9.A04(r2)) {
                    C110105dW.A1P("mandate-info", (String) C110105dW.A0d(r2), A0u);
                }
                C112355iM.A01(r6, r52, (String) null, A0u, false);
                C112265iD r22 = r8.A06;
                if (r22 != null) {
                    r22.A00("U66", A0u);
                }
                r8.A01.A0H(new IDxNCallbackShape21S0200000_3_I1(r8.A00, r8.A02, r8.A05, C116635rh.A02(r8, "upi-accept-mandate-request"), (AnonymousClass68Q) r7, r8, 5), C110105dW.A0W(A0u, r8.A03(r1)), "set", 0);
                return;
            case 3:
                C112355iM r10 = r0.A09;
                String str2 = r0.A0B;
                AnonymousClass618 r9 = new AnonymousClass618(r0);
                Log.i("PAY: revokePayerMandate called");
                ArrayList A0u2 = AnonymousClass000.A0u();
                C110105dW.A1P("action", "upi-revoke-mandate", A0u2);
                r10.A02(r1, A0u2);
                C112355iM.A01((AnonymousClass5xB) null, (C111855hW) r1.A0A, str2, A0u2, true);
                C112355iM.A00(r5, hashMap2, A0u2);
                AnonymousClass4XO A022 = C116635rh.A02(r10, "upi-revoke-mandate");
                C112265iD r23 = r10.A06;
                if (r23 != null) {
                    r23.A00("U66", A0u2);
                }
                r10.A01.A0H(new IDxNCallbackShape21S0200000_3_I1(r10.A00, r10.A02, r10.A05, A022, (AnonymousClass68Q) r9, r10, 6), C110105dW.A0W(A0u2, r10.A03(r1)), "set", 0);
                return;
            case 6:
                C112355iM r102 = r0.A09;
                String str3 = r0.A0B;
                IDxRCallbackShape116S0200000_3_I1 iDxRCallbackShape116S0200000_3_I1 = new IDxRCallbackShape116S0200000_3_I1(r3, 1, r0);
                Log.i("PAY: resumePayeeMandate called");
                ArrayList A0u3 = AnonymousClass000.A0u();
                C110105dW.A1P("action", "upi-resume-mandate", A0u3);
                r102.A02(r1, A0u3);
                C112355iM.A01((AnonymousClass5xB) null, (C111855hW) r1.A0A, str3, A0u3, true);
                C112355iM.A00(r5, hashMap2, A0u3);
                C28371Vv[] A032 = r102.A03(r1);
                C112265iD r12 = r102.A06;
                if (r12 != null) {
                    r12.A00("U66", A0u3);
                }
                r102.A01.A0H(new IDxNCallbackShape21S0200000_3_I1(r102.A00, r102.A02, r102.A05, C116635rh.A02(r102, "upi-resume-mandate"), (AnonymousClass68Q) iDxRCallbackShape116S0200000_3_I1, r102, 8), C110105dW.A0W(A0u3, A032), "set", 0);
                return;
            case 7:
                AnonymousClass1Vt r4 = r0.A07;
                C35301lh r62 = null;
                String str4 = r4 != null ? (String) C110105dW.A0d(((C111855hW) r4.A0A).A0B.A08) : null;
                if (r5 != null) {
                    C111805hR r42 = (C111805hR) r5.A08;
                    if (r42 != null) {
                        r62 = r42.A06;
                    }
                    str = r5.A0A;
                } else {
                    str = null;
                }
                String str5 = r1.A0K;
                r0.A0I.A00(r1.A08, r62, new AnonymousClass612(r0, str5), r0.A0J, str5, r3.A0L, r3.A0M, r3.A0J, r3.A0K, str, str4, hashMap2);
                return;
            case 8:
                C16040sK r32 = r0.A03;
                r32.A0B();
                C28881Zb r43 = r32.A01;
                AnonymousClass00B.A06(r43);
                AnonymousClass00B.A06(r5);
                C112355iM r33 = r0.A09;
                C118195uI r11 = new C118195uI(r43, r1, r0);
                Log.i("PAY: createAndApproveMandate called");
                String A002 = hashMap != null ? C119365wy.A00("MPIN", hashMap2) : null;
                C111855hW r44 = (C111855hW) r1.A0A;
                C111805hR r03 = (C111805hR) r5.A08;
                C35301lh r24 = r03 != null ? r03.A06 : null;
                String str6 = r5.A0A;
                C17190ug r36 = r33.A03;
                String A023 = r36.A02();
                AnonymousClass00B.A06(r44);
                AnonymousClass5xC r53 = r44.A0B;
                AnonymousClass00B.A06(r53);
                AnonymousClass00B.A06(r53.A0F);
                AnonymousClass00B.A06(r53.A0E);
                C118025tw A1X = C111345g2.A1X(r1, r44, r33, r1.A08, str6);
                String A012 = r33.A07.A01();
                String str7 = r44.A0N;
                String str8 = r44.A0L;
                String str9 = r44.A0J;
                AnonymousClass00B.A06(r24);
                String A0e = C110115dX.A0e(r24);
                AnonymousClass5xC r13 = r44.A0B;
                String str10 = (String) C110105dW.A0d(r13.A07);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Long valueOf = Long.valueOf(timeUnit.toSeconds(r13.A02));
                Long valueOf2 = Long.valueOf(timeUnit.toSeconds(r44.A0B.A01));
                AnonymousClass5xC r04 = r44.A0B;
                String str11 = r04.A0I;
                AnonymousClass00B.A06(A002);
                Object A0d = C110105dW.A0d(r44.A07);
                AnonymousClass00B.A06(A0d);
                String str12 = (String) A0d;
                Object A0d2 = C110105dW.A0d(r04.A0A);
                AnonymousClass00B.A06(A0d2);
                String str13 = (String) A0d2;
                String str14 = r44.A0H;
                AnonymousClass00B.A06(str14);
                String str15 = r04.A0K;
                String str16 = r04.A0M ? "1" : "0";
                String str17 = r04.A0F;
                Locale locale = Locale.US;
                AnonymousClass5w7 r63 = new AnonymousClass5w7(str17.toUpperCase(locale));
                AnonymousClass5w8 r54 = new AnonymousClass5w8(r44.A0B.A0E.toUpperCase(locale));
                String str18 = r44.A0B.A0J;
                AnonymousClass5wD r14 = new AnonymousClass5wD(new C51812cK(A023), r63, r54, A1X, str18 != null ? new AnonymousClass5wA(str18.toUpperCase(locale)) : null, valueOf, valueOf2, A012, str7, str8, str9, A0e, str10, str11, A002, str12, str13, str14, str15, str6, str16);
                AnonymousClass4XO r72 = r33.A00;
                if (r72 != null) {
                    r72.A04("upi-create-mandate");
                }
                r36.A0A(new C112415iS(r33.A00, r33.A01, r33.A02, r33.A05, r72, r11, r14), r14.A00, A023, 204, 0);
                return;
            case 9:
                AnonymousClass00B.A06(r5);
                C112355iM r82 = r0.A09;
                IDxRCallbackShape116S0200000_3_I1 iDxRCallbackShape116S0200000_3_I12 = new IDxRCallbackShape116S0200000_3_I1(r1, 0, r0);
                Log.i("PAY: updateMandateByIntent called");
                String A003 = hashMap != null ? C119365wy.A00("MPIN", hashMap2) : null;
                C111855hW r25 = (C111855hW) r1.A0A;
                C111805hR r05 = (C111805hR) r5.A08;
                C35301lh r34 = r05 != null ? r05.A06 : null;
                String str19 = r5.A0A;
                C17190ug r422 = r82.A03;
                String A024 = r422.A02();
                AnonymousClass00B.A06(r25);
                AnonymousClass5xC r55 = r25.A0B;
                AnonymousClass00B.A06(r55);
                AnonymousClass00B.A06(r55.A0F);
                AnonymousClass00B.A06(r55.A0E);
                AnonymousClass00B.A06(r55.A08);
                AnonymousClass5xB r56 = r55.A0C;
                AnonymousClass00B.A06(r56);
                AnonymousClass00B.A06(r56.A01);
                AnonymousClass00B.A06(r56.A04);
                AnonymousClass00B.A06(r34);
                AnonymousClass00B.A06(r1.A08);
                C118025tw A1X2 = C111345g2.A1X(r1, r25, r82, r1.A0K, str19);
                C35431lv r73 = r25.A0B.A0C.A01;
                C118025tw r15 = new C118025tw(String.valueOf(r73.A00()), String.valueOf(r73.A00), ((C35491m1) r73.A01).A04);
                String str20 = r1.A0K;
                String A0e2 = C110115dX.A0e(r25.A0B.A08);
                String A013 = r82.A07.A01();
                AnonymousClass5xC r16 = r25.A0B;
                String A0e3 = C110115dX.A0e(r16.A0C.A04);
                String str21 = r25.A0L;
                String str22 = r25.A0J;
                String A0e4 = C110115dX.A0e(r34);
                String str23 = (String) C110105dW.A0d(r16.A07);
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                Long valueOf3 = Long.valueOf(timeUnit2.toSeconds(r16.A02));
                Long valueOf4 = Long.valueOf(timeUnit2.toSeconds(r25.A0B.A0C.A00));
                AnonymousClass5xC r17 = r25.A0B;
                String str24 = r17.A0I;
                AnonymousClass00B.A06(A003);
                Object A0d3 = C110105dW.A0d(r25.A07);
                AnonymousClass00B.A06(A0d3);
                String str25 = (String) A0d3;
                Object A0d4 = C110105dW.A0d(r17.A0A);
                AnonymousClass00B.A06(A0d4);
                String str26 = (String) A0d4;
                String str27 = r25.A0H;
                AnonymousClass00B.A06(str27);
                String str28 = r17.A0K;
                String str29 = r17.A0M ? "1" : "0";
                String str30 = r17.A0F;
                Locale locale2 = Locale.US;
                AnonymousClass5w7 r06 = new AnonymousClass5w7(str30.toUpperCase(locale2));
                AnonymousClass5w8 r07 = new AnonymousClass5w8(r25.A0B.A0E.toUpperCase(locale2));
                String str31 = r25.A0B.A0J;
                AnonymousClass5wA r74 = str31 != null ? new AnonymousClass5wA(str31.toUpperCase(locale2)) : null;
                C51812cK r18 = new C51812cK(A024);
                C32461gQ A0X = C110105dW.A0X();
                C32461gQ A0Y = C110105dW.A0Y(A0X);
                C32461gQ.A00(A0Y, "action", "upi-update-mandate-by-url");
                if (C110105dW.A1W(str20, 1, false)) {
                    C32461gQ.A00(A0Y, "transaction-id", str20);
                }
                if (C32271fx.A0D(A0e2, 0, 255, false)) {
                    C32461gQ.A00(A0Y, "mandate-no", A0e2);
                }
                if (C32271fx.A0D(A013, 1, 255, false)) {
                    C32461gQ.A00(A0Y, "device-id", A013);
                }
                if (C32271fx.A0D(A0e3, 0, 35, false)) {
                    C32461gQ.A00(A0Y, "seq-no", A0e3);
                }
                if (C32271fx.A0D(str21, 1, 100, false)) {
                    C32461gQ.A00(A0Y, "sender-vpa", str21);
                }
                if (C32271fx.A0D(str22, 1, 100, false)) {
                    C32461gQ.A00(A0Y, "receiver-vpa", str22);
                }
                if (C110105dW.A1W(A0e4, 0, false)) {
                    C32461gQ.A00(A0Y, "upi-bank-info", A0e4);
                }
                if (str23 != null && C110115dX.A1D(str23, true)) {
                    C32461gQ.A00(A0Y, "mandate-name", str23);
                }
                if (C32271fx.A0B(valueOf3, 0, false)) {
                    C110115dX.A13(A0Y, "start-ts", valueOf3.longValue());
                }
                if (C32271fx.A0B(valueOf4, 0, false)) {
                    C110115dX.A13(A0Y, "end-ts", valueOf4.longValue());
                }
                if (str24 != null && C32271fx.A0D(str24, 1, 2, true)) {
                    C32461gQ.A00(A0Y, "recurrence-day", str24);
                }
                if (C110105dW.A1W(A003, 0, false)) {
                    C32461gQ.A00(A0Y, "mpin", A003);
                }
                if (C32271fx.A0D(str25, 1, 100, false)) {
                    C32461gQ.A00(A0Y, "receiver-name", str25);
                }
                if (C32271fx.A0D(str26, 1, 100, false)) {
                    C32461gQ.A00(A0Y, "purpose-code", str26);
                }
                if (C32271fx.A0D(str27, 0, 4, false)) {
                    C32461gQ.A00(A0Y, "mcc", str27);
                }
                if (str28 != null && C110105dW.A1V(str28, 1, true)) {
                    C32461gQ.A00(A0Y, "ref-id", str28);
                }
                if (C32271fx.A0D(str19, 1, 100, false)) {
                    C32461gQ.A00(A0Y, "credential-id", str19);
                }
                A0Y.A0A(str29, "is-revocable", C115665q7.A00);
                A0Y.A0A("1", "share-to-payee", C115665q7.A01);
                C32461gQ A0S = AnonymousClass3K4.A0S("original-amount");
                A0S.A05(A1X2.A00, AnonymousClass000.A0u());
                A1X2.A00(A0S, Collections.EMPTY_LIST);
                AnonymousClass3K4.A0s(A0S, A0Y);
                C32461gQ A0S2 = AnonymousClass3K4.A0S("amount");
                A0S2.A05(r15.A00, AnonymousClass000.A0u());
                r15.A00(A0S2, Collections.EMPTY_LIST);
                AnonymousClass3K4.A0s(A0S2, A0Y);
                C28371Vv r57 = r06.A00;
                A0Y.A05(r57, AnonymousClass000.A0u());
                C28371Vv r46 = r07.A00;
                A0Y.A05(r46, AnonymousClass000.A0u());
                if (r74 != null) {
                    A0Y.A05(r74.A00, AnonymousClass000.A0u());
                }
                List list = Collections.EMPTY_LIST;
                A0Y.A07(r57, list, AnonymousClass000.A0u());
                A0Y.A07(r46, list, AnonymousClass000.A0u());
                if (r74 != null) {
                    A0Y.A07(r74.A00, list, AnonymousClass000.A0u());
                }
                r422.A0A(new C112365iN(r82.A00, r82.A02, r82.A05, C116635rh.A02(r82, "upi-update-mandate-by-url"), iDxRCallbackShape116S0200000_3_I12), C110105dW.A0U(A0Y, A0X, r18, list), A024, 204, 0);
                return;
            default:
                return;
        }
    }

    public void A3n(PaymentBottomSheet paymentBottomSheet) {
        super.A3n(paymentBottomSheet);
        paymentBottomSheet.A00 = new IDxDListenerShape160S0100000_3_I1(this, 10);
        this.A0E.AKT(C13680ns.A0X(), (Integer) null, "approve_mandate_prompt", this.A04, true);
    }

    public void A3o(PaymentBottomSheet paymentBottomSheet) {
        super.A3o(paymentBottomSheet);
        paymentBottomSheet.A00 = new IDxDListenerShape160S0100000_3_I1(this, 12);
    }

    public void A3p(PaymentBottomSheet paymentBottomSheet) {
        super.A3p(paymentBottomSheet);
        paymentBottomSheet.A00 = new IDxDListenerShape160S0100000_3_I1(this, 13);
    }

    public void A3r(int i2) {
        C32241fu A002 = C32241fu.A00(this);
        A002.A01(i2);
        A002.A07(true);
        A002.setPositiveButton(R.string.str1015, (DialogInterface.OnClickListener) null);
        A002.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        A002.A0C(new IDxDListenerShape160S0100000_3_I1(this, 11));
        C005702l create = A002.create();
        create.setOnShowListener(new IDxSListenerShape248S0100000_3_I1(this, 1));
        create.show();
    }

    public void AMg(ViewGroup viewGroup) {
        super.AMg(viewGroup);
        C13680ns.A0L(viewGroup, R.id.text).setText(R.string.str18f5);
    }

    public void AP0(View view, View view2, C35511m3 r11, C30671cl r12, PaymentBottomSheet paymentBottomSheet) {
        super.AP0(view, view2, r11, r12, paymentBottomSheet);
        this.A0E.AKT(C13680ns.A0Y(), 104, "approve_mandate_prompt", this.A04, true);
    }

    public void AX5(AnonymousClass2HJ r3) {
        throw new UnsupportedOperationException(this.A06.A02("onSetPin unsupported"));
    }

    public boolean Afl() {
        return true;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1 || (i2 == 155 && i3 != -1)) {
            finish();
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0117, code lost:
        r2 = com.obwhatsapp.R.string.str1903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x011f, code lost:
        r3.A0M.Acl(new X.AnonymousClass66V(r3, r2, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0129, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0145, code lost:
        r2 = new X.C117705tQ(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x014a, code lost:
        r2.A03 = r6;
        r3.A0A.A0B(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0151, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r7 = r23
            r0 = r24
            super.onCreate(r0)
            java.lang.String r0 = X.C110115dX.A0b(r7)
            r7.A04 = r0
            com.obwhatsapp.payments.ui.PaymentBottomSheet r0 = new com.obwhatsapp.payments.ui.PaymentBottomSheet
            r0.<init>()
            r7.A00 = r0
            X.0pt r9 = r7.A05
            X.0so r8 = r7.A03
            X.4XO r13 = r7.A06
            X.0ug r10 = r7.A0H
            X.0wR r2 = r7.A0C
            X.1HB r0 = r7.A03
            X.0wU r14 = r7.A0M
            X.5iD r15 = r7.A09
            X.0wX r12 = r7.A0K
            X.60V r11 = r7.A0C
            X.5iM r6 = new X.5iM
            r16 = r2
            r17 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0pd r1 = r7.A0C
            X.5wy r0 = r7.A0B
            X.5iL r11 = new X.5iL
            r15 = r7
            r16 = r9
            r17 = r1
            r18 = r10
            r19 = r0
            r20 = r12
            r21 = r14
            r22 = r2
            r14 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            X.5tW r5 = r7.A02
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "payment_transaction_info"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            X.2H9 r0 = (X.AnonymousClass2H9) r0
            X.1Vt r10 = r0.A00
            X.5iJ r3 = r7.A0A
            X.5iD r2 = r7.A09
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "user_action"
            r4 = 0
            int r18 = r1.getIntExtra(r0, r4)
            java.lang.String r17 = X.C111345g2.A1b(r7)
            X.5eq r9 = new X.5eq
            r12 = r2
            r13 = r6
            r14 = r3
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.02z r1 = new X.02z
            r1.<init>((X.AnonymousClass04o) r9, (X.C001500q) r7)
            java.lang.Class<X.5ea> r0 = X.C110645ea.class
            X.01n r3 = r1.A01(r0)
            X.5ea r3 = (X.C110645ea) r3
            r7.A01 = r3
            r0 = 26
            com.facebook.redex.IDxObserverShape118S0100000_3_I1 r2 = X.C110115dX.A07(r7, r0)
            X.027 r1 = r3.A02
            X.00o r0 = r3.A01
            r1.A0A(r0, r2)
            X.5ea r3 = r7.A01
            r0 = 25
            com.facebook.redex.IDxObserverShape118S0100000_3_I1 r2 = X.C110115dX.A07(r7, r0)
            X.1cy r1 = r3.A0A
            X.00o r0 = r3.A01
            r1.A0A(r0, r2)
            X.02z r1 = new X.02z
            r1.<init>(r7)
            java.lang.Class<X.5eQ> r0 = X.C110555eQ.class
            X.01n r0 = r1.A01(r0)
            X.5eQ r0 = (X.C110555eQ) r0
            X.027 r1 = r0.A00
            r0 = 24
            X.C110105dW.A0x(r7, r1, r0)
            X.5ea r3 = r7.A01
            X.1Vt r6 = r3.A08
            X.1W2 r1 = r6.A0A
            r5 = r1
            X.5hW r5 = (X.C111855hW) r5
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L_0x0144;
                case 2: goto L_0x012a;
                case 3: goto L_0x011b;
                case 4: goto L_0x0116;
                case 5: goto L_0x0113;
                case 6: goto L_0x010d;
                case 7: goto L_0x00fd;
                case 8: goto L_0x00dc;
                case 9: goto L_0x00c5;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            return
        L_0x00c5:
            X.AnonymousClass00B.A06(r5)
            X.5xC r0 = r5.A0B
            X.AnonymousClass00B.A06(r0)
            X.5xB r2 = r0.A0C
            java.lang.String r1 = r3.A0B
            java.lang.String r0 = "upiSequenceNumber"
            X.1lh r0 = X.C39841t9.A00(r1, r0)
            r2.A04 = r0
            r4 = 14
            goto L_0x0117
        L_0x00dc:
            r0 = 12
            X.5tQ r2 = new X.5tQ
            r2.<init>(r0)
            X.AnonymousClass00B.A06(r1)
            java.lang.String r0 = r3.A0B
            r5.A0N = r0
            X.60V r0 = r3.A0E
            java.lang.String r0 = X.AnonymousClass60V.A00(r0)
            r5.A0L = r0
            X.0t3 r1 = r3.A04
            X.0sK r0 = r3.A03
            java.lang.String r0 = X.C224718b.A00(r0, r1, r4)
            r5.A0F = r0
            goto L_0x014a
        L_0x00fd:
            X.AnonymousClass00B.A06(r5)
            X.0sq r2 = r3.A0M
            java.lang.String r1 = r5.A0G
            X.5nh r0 = new X.5nh
            r0.<init>(r3, r1)
            X.C13700nu.A0W(r0, r2)
            return
        L_0x010d:
            r4 = 10
            r2 = 2131892523(0x7f12192b, float:1.9419797E38)
            goto L_0x011f
        L_0x0113:
            r0 = 9
            goto L_0x0145
        L_0x0116:
            r4 = 7
        L_0x0117:
            r2 = 2131892483(0x7f121903, float:1.9419716E38)
            goto L_0x011f
        L_0x011b:
            r4 = 4
            r2 = 2131892524(0x7f12192c, float:1.9419799E38)
        L_0x011f:
            X.0sq r1 = r3.A0M
            X.66V r0 = new X.66V
            r0.<init>(r3, r2, r4)
            r1.Acl(r0)
            return
        L_0x012a:
            X.5xC r0 = r5.A0B
            X.5xB r0 = r0.A0C
            r2 = 2131892538(0x7f12193a, float:1.9419827E38)
            if (r0 != 0) goto L_0x0136
            r2 = 2131892473(0x7f1218f9, float:1.9419695E38)
        L_0x0136:
            r0 = 5
            X.5tQ r1 = new X.5tQ
            r1.<init>(r0)
            r1.A00 = r2
            X.1cy r0 = r3.A0A
            r0.A0B(r1)
            return
        L_0x0144:
            r0 = 6
        L_0x0145:
            X.5tQ r2 = new X.5tQ
            r2.<init>(r0)
        L_0x014a:
            r2.A03 = r6
            X.1cy r0 = r3.A0A
            r0.A0B(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity.onCreate(android.os.Bundle):void");
    }
}
