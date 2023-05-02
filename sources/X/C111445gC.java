package X;

import com.obwhatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

/* renamed from: X.5gC  reason: invalid class name and case insensitive filesystem */
public abstract class C111445gC extends C14530pL {
    public boolean A00 = false;

    public C111445gC() {
        C110105dW.A0t(this, 12);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            BrazilAccountRecoveryPinActivity brazilAccountRecoveryPinActivity = (BrazilAccountRecoveryPinActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, brazilAccountRecoveryPinActivity);
            C14530pL.A0b(r3, r1, brazilAccountRecoveryPinActivity, C110105dW.A0F(r1));
            brazilAccountRecoveryPinActivity.A04 = (AnonymousClass5xF) r1.A2H.get();
            brazilAccountRecoveryPinActivity.A02 = (C1222969a) r1.A2U.get();
        }
    }
}
