package X;

import com.obwhatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import java.util.List;

/* renamed from: X.66p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1217266p implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ AddPaymentMethodBottomSheet A02;
    public final /* synthetic */ BrazilPaymentActivity A03;
    public final /* synthetic */ List A04;

    public /* synthetic */ C1217266p(C28401Vy r1, AddPaymentMethodBottomSheet addPaymentMethodBottomSheet, BrazilPaymentActivity brazilPaymentActivity, List list, int i2) {
        this.A03 = brazilPaymentActivity;
        this.A02 = addPaymentMethodBottomSheet;
        this.A04 = list;
        this.A00 = i2;
        this.A01 = r1;
    }

    public final void run() {
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = this.A02;
        List list = this.A04;
        int i2 = this.A00;
        C28401Vy r1 = this.A01;
        addPaymentMethodBottomSheet.A1C();
        brazilPaymentActivity.A3J(r1, C110115dX.A0G(list, i2));
    }
}
