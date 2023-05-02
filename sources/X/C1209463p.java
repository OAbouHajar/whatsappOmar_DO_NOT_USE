package X;

import com.obwhatsapp.payments.ui.AddPaymentMethodBottomSheet;

/* renamed from: X.63p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1209463p implements Runnable {
    public final /* synthetic */ AddPaymentMethodBottomSheet A00;

    public /* synthetic */ C1209463p(AddPaymentMethodBottomSheet addPaymentMethodBottomSheet) {
        this.A00 = addPaymentMethodBottomSheet;
    }

    public final void run() {
        AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = this.A00;
        C117265si r0 = addPaymentMethodBottomSheet.A04;
        AnonymousClass00B.A06(r0);
        addPaymentMethodBottomSheet.startActivityForResult(r0.A00, 10);
    }
}
