package X;

import com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.util.Log;

/* renamed from: X.64P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64P implements Runnable {
    public final /* synthetic */ IndiaUpiPinPrimerFullSheetActivity A00;

    public /* synthetic */ AnonymousClass64P(IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity) {
        this.A00 = indiaUpiPinPrimerFullSheetActivity;
    }

    public final void run() {
        IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity = this.A00;
        C30671cl A01 = AnonymousClass160.A01(C110105dW.A0i(indiaUpiPinPrimerFullSheetActivity.A0P));
        if (A01 == null) {
            Log.e("no valid account found, finishing");
            indiaUpiPinPrimerFullSheetActivity.A05.A0K(new AnonymousClass64O(indiaUpiPinPrimerFullSheetActivity));
            return;
        }
        indiaUpiPinPrimerFullSheetActivity.A00 = (C35521m4) A01;
        indiaUpiPinPrimerFullSheetActivity.A05.A0K(new AnonymousClass64Q(indiaUpiPinPrimerFullSheetActivity));
    }
}
