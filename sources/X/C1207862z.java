package X;

import com.obwhatsapp.payments.ui.ConfirmPaymentFragment;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.List;

/* renamed from: X.62z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1207862z implements AnonymousClass1WE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass626 A01;
    public final /* synthetic */ ConfirmPaymentFragment A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public /* synthetic */ C1207862z(AnonymousClass626 r1, ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet, int i2) {
        this.A01 = r1;
        this.A02 = confirmPaymentFragment;
        this.A00 = i2;
        this.A03 = paymentBottomSheet;
    }

    public final void accept(Object obj) {
        AnonymousClass626 r5 = this.A01;
        ConfirmPaymentFragment confirmPaymentFragment = this.A02;
        int i2 = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A03;
        List list = (List) obj;
        AnonymousClass00B.A06(list);
        PaymentMethodsListPickerFragment A012 = PaymentMethodsListPickerFragment.A01(list);
        A012.A0W(confirmPaymentFragment, 0);
        A012.A08 = new C112985l0(r5, i2);
        paymentBottomSheet.A1O(A012);
    }
}
