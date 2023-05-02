package X;

import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.62H  reason: invalid class name */
public class AnonymousClass62H implements C1223869j {
    public final /* synthetic */ C35511m3 A00;
    public final /* synthetic */ C30671cl A01;
    public final /* synthetic */ AnonymousClass626 A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public AnonymousClass62H(C35511m3 r1, C30671cl r2, AnonymousClass626 r3, PaymentBottomSheet paymentBottomSheet) {
        this.A02 = r3;
        this.A03 = paymentBottomSheet;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A83() {
        this.A02.A05.A1C();
    }

    public void ATa(AnonymousClass1XP r5) {
        AnonymousClass626 r3 = this.A02;
        PaymentBottomSheet paymentBottomSheet = this.A03;
        r3.A00(this.A00, this.A01, r5, paymentBottomSheet);
    }

    public void Abv() {
        PaymentView paymentView = this.A02.A03.A0W;
        if (paymentView != null) {
            paymentView.A04();
        }
    }

    public void Ac1() {
        this.A02.A03.Ac1();
    }

    public void Ac5() {
        PaymentView paymentView = this.A02.A03.A0W;
        if (paymentView != null) {
            paymentView.A05();
        }
    }
}
