package X;

import android.widget.ProgressBar;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.payments.ui.ConfirmLegalNameBottomSheetFragment;
import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.508  reason: invalid class name */
public final class AnonymousClass508 implements AnonymousClass696 {
    public final /* synthetic */ ConfirmLegalNameBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ PaymentBottomSheet A03;
    public final /* synthetic */ C16830ti A04;
    public final /* synthetic */ String A05;

    public AnonymousClass508(ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2, C16830ti r5, String str) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = str;
        this.A00 = confirmLegalNameBottomSheetFragment;
        this.A03 = paymentBottomSheet;
        this.A02 = paymentBottomSheet2;
        this.A04 = r5;
    }

    public void AQW(AnonymousClass2HJ r11) {
        String str;
        C18450wi.A0H(r11, 0);
        ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment = this.A00;
        WaEditText waEditText = confirmLegalNameBottomSheetFragment.A03;
        if (waEditText != null) {
            waEditText.setVisibility(0);
            TextEmojiLabel textEmojiLabel = confirmLegalNameBottomSheetFragment.A01;
            if (textEmojiLabel != null) {
                textEmojiLabel.setVisibility(0);
                ProgressBar progressBar = confirmLegalNameBottomSheetFragment.A00;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                    P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
                    int i2 = r11.A00;
                    P2mLiteOrderDetailsActivity.A02(confirmLegalNameBottomSheetFragment, p2mLiteOrderDetailsActivity, this.A03, this.A02, this.A04, this.A05, "enter_name", i2);
                    return;
                }
                str = "progressBar";
            } else {
                str = "descText";
            }
        } else {
            str = "nameEditText";
        }
        throw C18450wi.A03(str);
    }

    public void ATr(boolean z2) {
        this.A01.A3C(this.A05, "COMPLETED", "enter_name");
    }
}
