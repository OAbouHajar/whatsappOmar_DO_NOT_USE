package X;

import com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity;

/* renamed from: X.5gJ  reason: invalid class name and case insensitive filesystem */
public abstract class C111485gJ extends C14530pL {
    public boolean A00 = false;

    public C111485gJ() {
        C110105dW.A0t(this, 101);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            IndiaUpiMapperConfirmationActivity indiaUpiMapperConfirmationActivity = (IndiaUpiMapperConfirmationActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, indiaUpiMapperConfirmationActivity);
            C14530pL.A0b(r3, r1, indiaUpiMapperConfirmationActivity, C110105dW.A0F(r1));
            indiaUpiMapperConfirmationActivity.A02 = (AnonymousClass60V) r1.ACJ.get();
            indiaUpiMapperConfirmationActivity.A01 = (C17160ud) r1.A4t.get();
            indiaUpiMapperConfirmationActivity.A03 = C110105dW.A0O(r1);
        }
    }
}
