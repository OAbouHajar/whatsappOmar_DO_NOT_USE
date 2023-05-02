package X;

import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.IDxDListenerShape455S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.obwhatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.624  reason: invalid class name */
public class AnonymousClass624 implements AnonymousClass69Z {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public AnonymousClass624(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void AP0(View view, View view2, C35511m3 r33, C30671cl r34, PaymentBottomSheet paymentBottomSheet) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.Afq(R.string.str13db);
        C111855hW r3 = new C111855hW();
        indiaUpiSendPaymentActivity.A0H = r3;
        r3.A0F = C224718b.A00(indiaUpiSendPaymentActivity.A01, indiaUpiSendPaymentActivity.A05, false);
        indiaUpiSendPaymentActivity.A0H.A0N = !TextUtils.isEmpty(indiaUpiSendPaymentActivity.A0m) ? indiaUpiSendPaymentActivity.A0m : C111345g2.A1b(indiaUpiSendPaymentActivity);
        C39901tF r2 = indiaUpiSendPaymentActivity.A0B.A08;
        AnonymousClass00B.A07(r2, indiaUpiSendPaymentActivity.A0t.A02("IndiaUpiPaymentActivity onRequestPayment: Cannot get IndiaUpiMethodData"));
        C111805hR r22 = (C111805hR) r2;
        indiaUpiSendPaymentActivity.A0H.A09 = r22.A06;
        indiaUpiSendPaymentActivity.A0d = C115225pN.A00(indiaUpiSendPaymentActivity.A0R, indiaUpiSendPaymentActivity.A0c);
        C112345iL r32 = indiaUpiSendPaymentActivity.A0N;
        C35301lh r1 = indiaUpiSendPaymentActivity.A09;
        String str = indiaUpiSendPaymentActivity.A0Q;
        C35301lh A05 = indiaUpiSendPaymentActivity.A0C.A05();
        String A0D = indiaUpiSendPaymentActivity.A0C.A0D();
        C35301lh r4 = r22.A06;
        C28401Vy r8 = indiaUpiSendPaymentActivity.A0A;
        C111855hW r23 = indiaUpiSendPaymentActivity.A0H;
        String str2 = r23.A0N;
        String str3 = r23.A0F;
        String str4 = indiaUpiSendPaymentActivity.A0B.A0A;
        String str5 = indiaUpiSendPaymentActivity.A0d;
        C35301lh r24 = indiaUpiSendPaymentActivity.A08;
        C117955tp r0 = new C117955tp(indiaUpiSendPaymentActivity);
        Log.i("PAY: collectFromVpa called");
        C17190ug r26 = r32.A03;
        String A02 = r26.A02();
        String str6 = (String) C39841t9.A02(r1);
        String str7 = (String) C110105dW.A0d(r24);
        String str8 = (String) A05.A00;
        String str9 = (String) C110105dW.A0d(r4);
        String A01 = r32.A05.A01();
        C35431lv A002 = r32.A01.A00(C35481m0.A05, r8);
        String valueOf = String.valueOf(A002.A00());
        String valueOf2 = String.valueOf(A002.A00);
        String str10 = ((C35491m1) A002.A01).A04;
        C32461gQ A0S = AnonymousClass3K4.A0S("smax:any");
        C32461gQ A0S2 = AnonymousClass3K4.A0S("money");
        if (C32271fx.A0D(valueOf, 1, 100, false)) {
            C32461gQ.A00(A0S2, "value", valueOf);
        }
        if (C32271fx.A0D(valueOf2, 1, 100, false)) {
            C32461gQ.A00(A0S2, "offset", valueOf2);
        }
        if (C32271fx.A0D(str10, 1, 100, false)) {
            C32461gQ.A00(A0S2, "currency", str10);
        }
        AnonymousClass3K4.A0s(A0S2, A0S);
        C28371Vv A012 = A0S.A01();
        C32461gQ A0S3 = AnonymousClass3K4.A0S("amount");
        A0S3.A05(A012, AnonymousClass000.A0u());
        List list = Collections.EMPTY_LIST;
        A0S3.A07(A012, list, AnonymousClass000.A0u());
        C28371Vv A013 = A0S3.A01();
        C51812cK r5 = new C51812cK(A02);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-collect-from-vpa");
        if (C32271fx.A0D(str6, 1, 100, false)) {
            C32461gQ.A00(A0Y, "sender-vpa", str6);
        }
        if (str != null && C32271fx.A0D(str, 1, 100, true)) {
            C32461gQ.A00(A0Y, "sender-vpa-id", str);
        }
        if (str7 != null && C32271fx.A0D(str7, 8, 15, true)) {
            C32461gQ.A00(A0Y, "sender-upi-number", str7);
        }
        if (C32271fx.A0D(str8, 1, 100, false)) {
            C32461gQ.A00(A0Y, "receiver-vpa", str8);
        }
        if (A0D != null && C32271fx.A0D(A0D, 1, 100, true)) {
            C32461gQ.A00(A0Y, "receiver-vpa-id", A0D);
        }
        if (C110115dX.A1B(str9, 1, false)) {
            C32461gQ.A00(A0Y, "upi-bank-info", str9);
        }
        if (C32271fx.A0D(str2, 0, 35, false)) {
            C32461gQ.A00(A0Y, "seq-no", str2);
        }
        if (C32271fx.A0D(str4, 1, 100, false)) {
            C32461gQ.A00(A0Y, "credential-id", str4);
        }
        if (str5 != null && C110115dX.A1B(str5, 0, true)) {
            C32461gQ.A00(A0Y, "note", str5);
        }
        if (C32271fx.A0D(str3, 1, 100, false)) {
            C32461gQ.A00(A0Y, "message-id", str3);
        }
        if (C110105dW.A1V(A01, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A01);
        }
        A0Y.A03(A013);
        r26.A0A(new IDxNCallbackShape21S0200000_3_I1(r32.A00, r32.A01, r32.A04, C116635rh.A02(r32, "upi-collect-from-vpa"), r32, r0), C110105dW.A0U(A0Y, A0X, r5, list), A02, 204, 0);
    }

    public void AUW(PaymentBottomSheet paymentBottomSheet, int i2) {
    }

    public void AUZ(C30671cl r1, PaymentMethodRow paymentMethodRow) {
    }

    public void AUc(PaymentBottomSheet paymentBottomSheet, int i2, int i3) {
    }

    public void AUg(PaymentBottomSheet paymentBottomSheet, int i2) {
    }

    public void AUh(int i2) {
        this.A00.A0n = i2 == 1 ? "p2p" : "p2m";
    }

    public void AZ9(PaymentBottomSheet paymentBottomSheet) {
        IndiaUpiEditTransactionDescriptionFragment A01 = IndiaUpiEditTransactionDescriptionFragment.A01(this.A00.A0c);
        A01.A08 = new IDxDListenerShape455S0100000_3_I1(this, 1);
        paymentBottomSheet.A1O(A01);
    }
}
