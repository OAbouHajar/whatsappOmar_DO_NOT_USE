package X;

import com.obwhatsapp.payments.ui.PaymentInvitePickerActivity;

/* renamed from: X.5hI  reason: invalid class name and case insensitive filesystem */
public abstract class C111715hI extends AnonymousClass1V8 {
    public boolean A00 = false;

    public C111715hI() {
        C110105dW.A0t(this, 92);
    }

    public static void A02(C16150sX r1, AnonymousClass127 r2, PaymentInvitePickerActivity paymentInvitePickerActivity) {
        paymentInvitePickerActivity.A0G = r2;
        paymentInvitePickerActivity.A0T = (AnonymousClass18R) r1.ABZ.get();
        paymentInvitePickerActivity.A0R = (C220516l) r1.A4u.get();
        paymentInvitePickerActivity.A02 = (C18290wS) r1.AIB.get();
        paymentInvitePickerActivity.A00 = (AnonymousClass175) r1.AH5.get();
        paymentInvitePickerActivity.A01 = (C18090w8) r1.AI6.get();
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            PaymentInvitePickerActivity paymentInvitePickerActivity = (PaymentInvitePickerActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, paymentInvitePickerActivity);
            C14530pL.A0b(r3, r1, paymentInvitePickerActivity, C110105dW.A0F(r1));
            A02(r1, C14530pL.A0D(r1, paymentInvitePickerActivity), paymentInvitePickerActivity);
        }
    }
}
