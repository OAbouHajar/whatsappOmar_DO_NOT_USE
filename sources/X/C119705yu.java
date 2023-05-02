package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentSettingsFragment;

/* renamed from: X.5yu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119705yu implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ PaymentSettingsFragment A03;

    public /* synthetic */ C119705yu(View view, View view2, ViewGroup viewGroup, PaymentSettingsFragment paymentSettingsFragment) {
        this.A03 = paymentSettingsFragment;
        this.A00 = view;
        this.A02 = viewGroup;
        this.A01 = view2;
    }

    public final void onScrollChanged() {
        int i2;
        PaymentSettingsFragment paymentSettingsFragment = this.A03;
        View view = this.A00;
        ViewGroup viewGroup = this.A02;
        View view2 = this.A01;
        int scrollY = view.getScrollY();
        Resources A032 = paymentSettingsFragment.A03();
        if (scrollY <= 20) {
            int dimension = (int) (A032.getDimension(R.dimen.dimen0602) + 0.5f);
            viewGroup.setPadding(dimension, dimension, dimension, dimension);
            i2 = 0;
        } else {
            int dimension2 = (int) (A032.getDimension(R.dimen.dimen0603) + 0.5f);
            viewGroup.setPadding(dimension2, dimension2, dimension2, dimension2);
            i2 = 8;
        }
        view2.setVisibility(i2);
    }
}
