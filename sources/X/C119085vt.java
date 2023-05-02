package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.obwhatsapp.WaInAppBrowsingActivity;
import com.obwhatsapp.payments.care.csat.CsatSurveyBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5vt  reason: invalid class name and case insensitive filesystem */
public class C119085vt {
    public static Class A00(Bundle bundle) {
        String A0h;
        String string = bundle.getString("nfm_action");
        if (TextUtils.isEmpty(string)) {
            A0h = "[PAY]: BrazilPayNFMController -- NFM action not passed";
        } else {
            switch (string.hashCode()) {
                case -229223458:
                    if (string.equals("wa_payment_learn_more")) {
                        return WaInAppBrowsingActivity.class;
                    }
                    break;
                case 48886399:
                    if (string.equals("payments_care_csat")) {
                        return CsatSurveyBloksActivity.class;
                    }
                    break;
                case 127237947:
                    if (string.equals("wa_payment_fbpin_reset")) {
                        return BrazilPayBloksActivity.class;
                    }
                    break;
                case 540952115:
                    if (string.equals("wa_payment_transaction_details")) {
                        return BrazilPaymentTransactionDetailActivity.class;
                    }
                    break;
            }
            A0h = AnonymousClass000.A0h(string, AnonymousClass000.A0r("[PAY]: BrazilPayNFMController -- Unsupported NFM action: "));
        }
        Log.e(A0h);
        return null;
    }
}
