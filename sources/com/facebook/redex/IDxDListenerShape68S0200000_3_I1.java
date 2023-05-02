package com.facebook.redex;

import X.AnonymousClass50C;
import X.AnonymousClass61H;
import X.AnonymousClass61I;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.widget.PaymentView;

public class IDxDListenerShape68S0200000_3_I1 implements DialogInterface.OnDismissListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDListenerShape68S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment;
        int i2 = this.A02;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                dialogFragment = (DialogFragment) this.A01;
                BrazilPaymentActivity brazilPaymentActivity = ((AnonymousClass61H) obj).A00.A04;
                brazilPaymentActivity.A01 = 7;
                brazilPaymentActivity.A3E((String) null);
                break;
            case 1:
                dialogFragment = (DialogFragment) this.A01;
                PaymentView paymentView = ((AnonymousClass61H) obj).A00.A04.A0W;
                if (paymentView != null) {
                    paymentView.A0t.setText((CharSequence) null);
                    break;
                }
                break;
            case 2:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) this.A01;
                AnonymousClass50C A022 = ((AnonymousClass61I) obj).A04.A0K.A02("FB", "PIN", false);
                boolean A0c = fingerprintBottomSheet.A0c();
                if (A022 != null) {
                    if (A0c) {
                        fingerprintBottomSheet.A1K();
                        return;
                    }
                    return;
                } else if (A0c) {
                    fingerprintBottomSheet.A1D();
                    return;
                } else {
                    return;
                }
            case 3:
                dialogFragment = (DialogFragment) this.A01;
                PaymentView paymentView2 = ((AnonymousClass61I) obj).A04.A0W;
                if (paymentView2 != null) {
                    paymentView2.A0t.setText((CharSequence) null);
                    break;
                }
                break;
            default:
                dialogFragment = (DialogFragment) this.A01;
                BrazilPaymentActivity brazilPaymentActivity2 = ((AnonymousClass61I) obj).A04;
                brazilPaymentActivity2.A01 = 7;
                brazilPaymentActivity2.A3E((String) null);
                break;
        }
        if (!dialogFragment.A0c()) {
            return;
        }
        dialogFragment.A1D();
    }
}
