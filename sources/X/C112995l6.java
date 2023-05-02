package X;

import com.obwhatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity;
import com.obwhatsapp.payments.ui.PaymentTransactionDetailsListActivity;

/* renamed from: X.5l6  reason: invalid class name and case insensitive filesystem */
public abstract class C112995l6 extends PaymentTransactionDetailsListActivity {
    public boolean A00 = false;

    public C112995l6() {
        C110105dW.A0t(this, 83);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            P2mLitePaymentTransactionDetailActivity p2mLitePaymentTransactionDetailActivity = (P2mLitePaymentTransactionDetailActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, p2mLitePaymentTransactionDetailActivity);
            C14530pL.A0b(r3, r1, p2mLitePaymentTransactionDetailActivity, C110105dW.A0F(r1));
            C111365g4.A09(r1, p2mLitePaymentTransactionDetailActivity);
            C111365g4.A02(r3, r1, p2mLitePaymentTransactionDetailActivity);
            C111365g4.A03(r3, r1, p2mLitePaymentTransactionDetailActivity, r1.AE1);
            p2mLitePaymentTransactionDetailActivity.A00 = (C16980tz) r1.AQB.get();
            p2mLitePaymentTransactionDetailActivity.A01 = (C228719p) r1.AGq.get();
            p2mLitePaymentTransactionDetailActivity.A02 = (AnonymousClass1N8) r1.AGs.get();
        }
    }
}
