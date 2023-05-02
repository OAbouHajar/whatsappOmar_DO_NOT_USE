package X;

import android.widget.ProgressBar;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.payments.ui.ConfirmDateOfBirthBottomSheetFragment;
import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.507  reason: invalid class name */
public final class AnonymousClass507 implements AnonymousClass695 {
    public final /* synthetic */ ConfirmDateOfBirthBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ C16830ti A03;
    public final /* synthetic */ String A04;

    public AnonymousClass507(ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, C16830ti r4, String str) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A04 = str;
        this.A00 = confirmDateOfBirthBottomSheetFragment;
        this.A02 = paymentBottomSheet;
        this.A03 = r4;
    }

    public void APy(boolean z2) {
        this.A01.A3C(this.A04, "COMPLETED", "enter_dob");
    }

    public void AQW(AnonymousClass2HJ r11) {
        String str;
        C18450wi.A0H(r11, 0);
        ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = this.A00;
        confirmDateOfBirthBottomSheetFragment.A1A().setVisibility(0);
        TextEmojiLabel textEmojiLabel = confirmDateOfBirthBottomSheetFragment.A01;
        if (textEmojiLabel != null) {
            textEmojiLabel.setVisibility(0);
            ProgressBar progressBar = confirmDateOfBirthBottomSheetFragment.A00;
            if (progressBar != null) {
                progressBar.setVisibility(4);
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
                int i2 = r11.A00;
                P2mLiteOrderDetailsActivity.A02(confirmDateOfBirthBottomSheetFragment, p2mLiteOrderDetailsActivity, this.A02, (PaymentBottomSheet) null, this.A03, this.A04, "enter_dob", i2);
                return;
            }
            str = "progressBar";
        } else {
            str = "descText";
        }
        throw C18450wi.A03(str);
    }
}
