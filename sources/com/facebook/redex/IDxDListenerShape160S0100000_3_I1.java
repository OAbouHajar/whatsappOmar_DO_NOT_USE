package com.facebook.redex;

import X.AnonymousClass1Z7;
import X.AnonymousClass3K4;
import X.AnonymousClass5kl;
import X.AnonymousClass629;
import X.C110705eh;
import X.C112765jH;
import X.C117425sy;
import X.C13680ns;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.obwhatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

public class IDxDListenerShape160S0100000_3_I1 implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape160S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass1Z7) this.A00).A00("on_dismiss");
                return;
            case 1:
                IDxDListenerShape160S0100000_3_I1.super.onBackPressed();
                return;
            case 2:
            case 12:
            case 13:
            case 17:
            case 19:
                AnonymousClass3K4.A0y(this.A00);
                return;
            case 5:
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                ((PinBottomSheetDialogFragment) this.A00).A06.setText((CharSequence) null);
                return;
            case 7:
                DialogFragment dialogFragment = (DialogFragment) this.A00;
                if (dialogFragment.A0c()) {
                    dialogFragment.A1D();
                    return;
                }
                return;
            case 8:
            case 9:
                AnonymousClass5kl r1 = (AnonymousClass5kl) this.A00;
                r1.A3n(r1.A08);
                return;
            case 10:
                IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) this.A00;
                indiaUpiMandatePaymentActivity.finish();
                indiaUpiMandatePaymentActivity.A0E.AKT(C13680ns.A0Y(), C13680ns.A0a(), "approve_mandate_prompt", indiaUpiMandatePaymentActivity.A04, true);
                return;
            case 11:
                IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity2 = (IndiaUpiMandatePaymentActivity) this.A00;
                indiaUpiMandatePaymentActivity2.A01.A05();
                indiaUpiMandatePaymentActivity2.A0E.AKT(C13680ns.A0Y(), C13680ns.A0a(), "decline_mandate_dialogue", indiaUpiMandatePaymentActivity2.A04, true);
                return;
            case 14:
                IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity3 = (IndiaUpiMandatePaymentActivity) this.A00;
                indiaUpiMandatePaymentActivity3.A01.A05();
                indiaUpiMandatePaymentActivity3.A0E.AKT(C13680ns.A0Y(), C13680ns.A0a(), "approve_mandate_update_request_prompt", "payment_transaction_details", true);
                return;
            case 15:
                ((IndiaUpiMandatePaymentActivity) this.A00).A01.A05();
                return;
            case 16:
                C112765jH r12 = (C112765jH) this.A00;
                r12.A01 = 7;
                r12.A3E((String) null);
                return;
            case 18:
                C110705eh r2 = ((IndiaUpiQrCodeUrlValidationActivity) this.A00).A06;
                if (!r2.A03) {
                    C117425sy.A00(r2.A01, 0);
                    return;
                } else {
                    r2.A03 = false;
                    return;
                }
            case 20:
                Activity activity = (Activity) this.A00;
                activity.finish();
                activity.overridePendingTransition(0, 0);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                ((AnonymousClass629) this.A00).A01.finish();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                ((DialogFragment) ((IDxCallbackShape250S0100000_3_I1) this.A00).A00).A1C();
                return;
            default:
                ((DialogFragment) this.A00).A1D();
                return;
        }
    }
}
