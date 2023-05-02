package X;

import com.obwhatsapp.payments.ui.ConfirmLegalNameBottomSheetFragment;
import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.56P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56P implements Runnable {
    public final /* synthetic */ ConfirmLegalNameBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ PaymentBottomSheet A03;
    public final /* synthetic */ C16830ti A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ AnonymousClass56P(ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2, C16830ti r5, String str, String str2) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = confirmLegalNameBottomSheetFragment;
        this.A02 = paymentBottomSheet;
        this.A03 = paymentBottomSheet2;
        this.A04 = r5;
    }

    public final void run() {
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        String str = this.A05;
        String str2 = this.A06;
        ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        PaymentBottomSheet paymentBottomSheet2 = this.A03;
        C16830ti r8 = this.A04;
        C18450wi.A0H(str2, 2);
        p2mLiteOrderDetailsActivity.A36().A01(new AnonymousClass508(confirmLegalNameBottomSheetFragment, p2mLiteOrderDetailsActivity, paymentBottomSheet, paymentBottomSheet2, r8, str2), str, "p2m-lite-buyer-check");
    }
}
