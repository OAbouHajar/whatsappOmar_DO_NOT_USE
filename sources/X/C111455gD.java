package X;

import com.obwhatsapp.payments.ui.BusinessHubActivity;

/* renamed from: X.5gD  reason: invalid class name and case insensitive filesystem */
public abstract class C111455gD extends C14530pL {
    public boolean A00 = false;

    public C111455gD() {
        C110105dW.A0t(this, 30);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            BusinessHubActivity businessHubActivity = (BusinessHubActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, businessHubActivity);
            C14530pL.A0b(r3, r1, businessHubActivity, C110105dW.A0F(r1));
            businessHubActivity.A0A = C110115dX.A0Q(r1);
            businessHubActivity.A0B = (AnonymousClass1N4) r1.AHf.get();
        }
    }
}
