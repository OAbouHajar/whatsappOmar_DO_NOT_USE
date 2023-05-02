package X;

import com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.obwhatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;

/* renamed from: X.62D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass62D implements C1220568c {
    public final /* synthetic */ C35431lv A00;
    public final /* synthetic */ C15830rv A01;
    public final /* synthetic */ BrazilOrderDetailsActivity A02;
    public final /* synthetic */ C117315sn A03;
    public final /* synthetic */ C16840tj A04;

    public /* synthetic */ AnonymousClass62D(C35431lv r1, C15830rv r2, BrazilOrderDetailsActivity brazilOrderDetailsActivity, C117315sn r4, C16840tj r5) {
        this.A02 = brazilOrderDetailsActivity;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void A4H(String str) {
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A02;
        C35431lv r3 = this.A00;
        C16840tj r2 = this.A04;
        C117315sn r1 = this.A03;
        C15830rv r5 = this.A01;
        if ("WhatsappPay".equals(str)) {
            brazilOrderDetailsActivity.A3O(r3, r2);
        } else if ("CustomPaymentInstructions".equals(str)) {
            for (C119505ya r12 : r1.A03) {
                if (r12.A07.equals(str)) {
                    AnonymousClass00B.A06(r5);
                    String str2 = r12.A03;
                    AnonymousClass00B.A06(r5);
                    AnonymousClass00B.A06(str2);
                    C453428a.A01(PaymentCustomInstructionsBottomSheet.A01(r5, str2, "payment_options_prompt", brazilOrderDetailsActivity.A0C.A0C(1345)), brazilOrderDetailsActivity.AGM());
                }
            }
        }
    }
}
