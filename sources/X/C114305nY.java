package X;

import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.5nY  reason: invalid class name and case insensitive filesystem */
public class C114305nY extends C16690tT {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114305nY(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        super(indiaUpiSendPaymentActivity, true);
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0t.A04("Verifying VPA in background...");
        indiaUpiSendPaymentActivity.A00 = 1;
        indiaUpiSendPaymentActivity.A0O.A01(indiaUpiSendPaymentActivity.A09, (C35301lh) null, new AnonymousClass60X(indiaUpiSendPaymentActivity, new AnonymousClass64U(this)));
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0t.A04("Background VPA verification done.");
        indiaUpiSendPaymentActivity.A01 = null;
    }
}
