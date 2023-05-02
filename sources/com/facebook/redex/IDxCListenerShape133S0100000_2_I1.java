package com.facebook.redex;

import X.AnonymousClass56J;
import X.C13690nt;
import X.C14550pN;
import X.C16830ti;
import X.C18450wi;
import X.C49382Ss;
import X.C90004dL;
import android.app.Dialog;
import android.view.View;
import android.widget.ProgressBar;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.dmsetting.DisappearingMessagesSettingActivity;
import com.obwhatsapp.payments.ui.BusinessHubActivity;
import com.obwhatsapp.payments.ui.ConfirmDateOfBirthBottomSheetFragment;
import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.obwhatsapp.payments.ui.P2mLitePaymentSettingsFragment;
import com.obwhatsapp.payments.ui.P2mLiteWebViewActivity;
import com.obwhatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity;
import com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity;
import java.util.Calendar;

public class IDxCListenerShape133S0100000_2_I1 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape133S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        String str;
        switch (this.A01) {
            case 0:
                ((C14550pN) this.A00).onBackPressed();
                return;
            case 1:
                DisappearingMessagesSettingActivity.A02((DisappearingMessagesSettingActivity) this.A00);
                return;
            case 2:
                DisappearingMessagesSettingActivity.A03((DisappearingMessagesSettingActivity) this.A00);
                return;
            case 3:
                BusinessHubActivity.A0T((BusinessHubActivity) this.A00);
                return;
            case 4:
                ((Dialog) this.A00).show();
                return;
            case 5:
                ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = (ConfirmDateOfBirthBottomSheetFragment) this.A00;
                confirmDateOfBirthBottomSheetFragment.A1C((Integer) null, "confirm_dob_in_progress_prompt", "enter_dob", 0);
                confirmDateOfBirthBottomSheetFragment.A1D(false);
                confirmDateOfBirthBottomSheetFragment.A1A().setVisibility(4);
                TextEmojiLabel textEmojiLabel = confirmDateOfBirthBottomSheetFragment.A01;
                if (textEmojiLabel != null) {
                    textEmojiLabel.setVisibility(4);
                    ProgressBar progressBar = confirmDateOfBirthBottomSheetFragment.A00;
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                        C90004dL r1 = confirmDateOfBirthBottomSheetFragment.A09;
                        if (r1 != null) {
                            Calendar calendar = confirmDateOfBirthBottomSheetFragment.A0B;
                            C18450wi.A0H(calendar, 0);
                            P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = r1.A01;
                            Integer A0U = C13690nt.A0U();
                            C16830ti r5 = r1.A03;
                            p2mLiteOrderDetailsActivity.A38(C49382Ss.A00(), r5, A0U, "enter_dob", "confirm_legal_name_in_progress_prompt", 1);
                            p2mLiteOrderDetailsActivity.A05.Acl(new AnonymousClass56J(r1.A00, p2mLiteOrderDetailsActivity, r1.A02, r5, r1.A04, calendar));
                            return;
                        }
                        return;
                    }
                    str = "progressBar";
                } else {
                    str = "descText";
                }
                throw C18450wi.A03(str);
            case 6:
                P2mLitePaymentSettingsFragment.A04((P2mLitePaymentSettingsFragment) this.A00);
                return;
            case 7:
                P2mLitePaymentSettingsFragment.A05((P2mLitePaymentSettingsFragment) this.A00);
                return;
            case 8:
                P2mLiteWebViewActivity.A09((P2mLiteWebViewActivity) this.A00);
                return;
            case 9:
                IndiaUpiInternationalActivationActivity.A02((IndiaUpiInternationalActivationActivity) this.A00);
                return;
            case 10:
                IndiaUpiMapperConfirmationActivity.A02((IndiaUpiMapperConfirmationActivity) this.A00);
                return;
            case 11:
                IndiaUpiMapperPendingActivity.A02((IndiaUpiMapperPendingActivity) this.A00);
                return;
            default:
                IndiaUpiMapperPendingActivity.A03((IndiaUpiMapperPendingActivity) this.A00);
                return;
        }
    }
}
