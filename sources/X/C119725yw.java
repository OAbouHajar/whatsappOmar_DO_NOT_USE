package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment;

/* renamed from: X.5yw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119725yw implements AdapterView.OnItemClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ListView A01;
    public final /* synthetic */ PaymentMethodsListPickerFragment A02;

    public /* synthetic */ C119725yw(View view, ListView listView, PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        this.A02 = paymentMethodsListPickerFragment;
        this.A01 = listView;
        this.A00 = view;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = this.A02;
        ListView listView = this.A01;
        View view2 = this.A00;
        if (view2 == null || i2 != listView.getPositionForView(view2)) {
            AnonymousClass01A A09 = paymentMethodsListPickerFragment.A09();
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) paymentMethodsListPickerFragment.A0D;
            C30671cl A0G = C110115dX.A0G(paymentMethodsListPickerFragment.A07.A02, i2 - listView.getHeaderViewsCount());
            C1223069b r0 = paymentMethodsListPickerFragment.A08;
            if (r0 != null && !r0.AfB(A0G)) {
                if (A09 instanceof AnonymousClass68Z) {
                    ((AnonymousClass68Z) A09).AUY(A0G);
                    if (paymentBottomSheet != null) {
                        paymentBottomSheet.A1O(A09);
                        return;
                    }
                    return;
                }
                AnonymousClass68Z r02 = paymentMethodsListPickerFragment.A06;
                if (r02 != null) {
                    r02.AUY(A0G);
                    if (paymentBottomSheet != null) {
                        paymentBottomSheet.A1N();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C1223069b r03 = paymentMethodsListPickerFragment.A08;
        if (r03 != null) {
            r03.AM8();
        }
    }
}
