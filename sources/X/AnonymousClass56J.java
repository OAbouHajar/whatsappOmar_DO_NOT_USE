package X;

import com.obwhatsapp.payments.ui.ConfirmDateOfBirthBottomSheetFragment;
import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import java.util.Calendar;

/* renamed from: X.56J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56J implements Runnable {
    public final /* synthetic */ ConfirmDateOfBirthBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ C16830ti A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Calendar A05;

    public /* synthetic */ AnonymousClass56J(ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, C16830ti r4, String str, Calendar calendar) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = calendar;
        this.A04 = str;
        this.A00 = confirmDateOfBirthBottomSheetFragment;
        this.A02 = paymentBottomSheet;
        this.A03 = r4;
    }

    public final void run() {
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        Calendar calendar = this.A05;
        String str = this.A04;
        ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        C16830ti r6 = this.A03;
        C18450wi.A0H(str, 2);
        p2mLiteOrderDetailsActivity.A36().A00(new AnonymousClass507(confirmDateOfBirthBottomSheetFragment, p2mLiteOrderDetailsActivity, paymentBottomSheet, r6, str), "p2m-lite-buyer-check", calendar.get(1), calendar.get(2), calendar.get(5));
    }
}
