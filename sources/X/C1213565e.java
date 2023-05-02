package X;

import android.graphics.BitmapFactory;
import com.facebook.redex.IDxRCallbackShape249S0100000_3_I1;
import com.facebook.redex.IDxTCallbackShape262S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.65e  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1213565e implements Runnable {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A01;

    public /* synthetic */ C1213565e(C28401Vy r1, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A01 = indiaUpiSendPaymentActivity;
        this.A00 = r1;
    }

    public final void run() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C28401Vy r6 = this.A00;
        AnonymousClass1Vt A0M = indiaUpiSendPaymentActivity.A07.A0M((String) null, indiaUpiSendPaymentActivity.A0m);
        AnonymousClass00B.A06(A0M);
        AnonymousClass1W2 r0 = A0M.A0A;
        AnonymousClass00B.A06(r0);
        C35431lv r5 = r0.A01;
        AnonymousClass00B.A06(r5);
        AnonymousClass4W4 r7 = new AnonymousClass4W4((Map) null, "upi_p2p_accept_collect", (String) null);
        HashMap A0x = AnonymousClass000.A0x();
        HashMap A0x2 = AnonymousClass000.A0x();
        A0x2.put("credential_id", indiaUpiSendPaymentActivity.A0B.A0A);
        A0x.put("selected_account", A0x2);
        C28411Vz r4 = r5.A01;
        A0x.put("display_amount", r4.A9H(indiaUpiSendPaymentActivity.A01, r6, 0));
        Object obj = indiaUpiSendPaymentActivity.A0C.A05().A00;
        AnonymousClass00B.A06(obj);
        A0x.put("sender_vpa", obj);
        String A0D = indiaUpiSendPaymentActivity.A0C.A0D();
        if (A0D == null) {
            A0D = "";
        }
        A0x.put("sender_vpa_id", A0D);
        A0x.put("receiver_vpa", indiaUpiSendPaymentActivity.A09.A00);
        A0x.put("receiver_name", indiaUpiSendPaymentActivity.A07.A00);
        A0x.put("amount_value", Integer.valueOf(r5.A00()));
        A0x.put("amount_offset", Integer.valueOf(r5.A00));
        A0x.put("amount_currency", ((C35491m1) r4).A04);
        A0x.put("is_merchant_payment", Boolean.valueOf(indiaUpiSendPaymentActivity.A0q));
        A0x.put("transaction_id", A0M.A0K);
        A0x.put("cl_transaction_id", indiaUpiSendPaymentActivity.A0I);
        A0x.put("receiver_icon", C37741pe.A07(BitmapFactory.decodeResource(indiaUpiSendPaymentActivity.getResources(), R.drawable.avatar_contact)));
        ((AnonymousClass1JN) indiaUpiSendPaymentActivity.A0k.get()).A00(new IDxRCallbackShape249S0100000_3_I1(indiaUpiSendPaymentActivity, 5), new IDxTCallbackShape262S0100000_3_I1(indiaUpiSendPaymentActivity, 3), r7, "new_payment", A0x);
    }
}
