package X;

import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.62G  reason: invalid class name */
public class AnonymousClass62G implements C1223869j {
    public final /* synthetic */ AnonymousClass625 A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public AnonymousClass62G(AnonymousClass625 r1, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = r1;
        this.A01 = paymentBottomSheet;
    }

    public void A83() {
        PaymentBottomSheet paymentBottomSheet = this.A01;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1C();
        }
    }

    public void ATa(AnonymousClass1XP r4) {
        String str;
        AnonymousClass625 r2 = this.A00;
        C112825ja r1 = r2.A04;
        r1.A0D = r4;
        if (r4 == null) {
            str = null;
        } else {
            C31781f1 r0 = r4.A0J;
            AnonymousClass00B.A06(r0);
            str = r0.A0D;
        }
        r1.A0f = str;
        r1.A3v(this.A01);
        A83();
        r1.A3x(r2.A01);
    }

    public void Abv() {
        PaymentView paymentView = this.A00.A04.A0X;
        if (paymentView != null) {
            paymentView.A04();
        }
    }

    public void Ac1() {
        this.A00.A04.Ac1();
    }

    public void Ac5() {
        PaymentView paymentView = this.A00.A04.A0X;
        if (paymentView != null) {
            paymentView.A05();
        }
    }
}
