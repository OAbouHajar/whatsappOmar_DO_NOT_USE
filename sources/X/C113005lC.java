package X;

import com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity;

/* renamed from: X.5lC  reason: invalid class name and case insensitive filesystem */
public abstract class C113005lC extends C14530pL {
    public boolean A00 = false;

    public C113005lC() {
        C110105dW.A0t(this, 96);
    }

    public static void A02(C16150sX r1, PaymentTransactionHistoryActivity paymentTransactionHistoryActivity) {
        paymentTransactionHistoryActivity.A05 = (AnonymousClass013) r1.AR8.get();
        paymentTransactionHistoryActivity.A07 = (AnonymousClass17F) r1.AAo.get();
        paymentTransactionHistoryActivity.A0C = (C18290wS) r1.AIB.get();
        paymentTransactionHistoryActivity.A0B = (C18090w8) r1.AI6.get();
        paymentTransactionHistoryActivity.A09 = (AnonymousClass107) r1.AFb.get();
        paymentTransactionHistoryActivity.A0D = (AnonymousClass1MB) r1.AHQ.get();
        paymentTransactionHistoryActivity.A0A = (AnonymousClass17Y) r1.AHs.get();
        paymentTransactionHistoryActivity.A0J = (C218315p) r1.AIL.get();
        paymentTransactionHistoryActivity.A06 = (C16460t6) r1.A5k.get();
        paymentTransactionHistoryActivity.A0H = (C118875vO) r1.AIJ.get();
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = (PaymentTransactionHistoryActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, paymentTransactionHistoryActivity);
            C14530pL.A0b(r3, r1, paymentTransactionHistoryActivity, C110105dW.A0F(r1));
            A02(r1, paymentTransactionHistoryActivity);
        }
    }
}
