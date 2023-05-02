package X;

import com.obwhatsapp.payments.ui.ViralityLinkVerifierActivity;

/* renamed from: X.5gM  reason: invalid class name and case insensitive filesystem */
public abstract class C111505gM extends C14530pL {
    public boolean A00 = false;

    public C111505gM() {
        C110105dW.A0t(this, 98);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            ViralityLinkVerifierActivity viralityLinkVerifierActivity = (ViralityLinkVerifierActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, viralityLinkVerifierActivity);
            C14530pL.A0b(r3, r1, viralityLinkVerifierActivity, C110105dW.A0F(r1));
            viralityLinkVerifierActivity.A0E = C110115dX.A0V(r1);
            viralityLinkVerifierActivity.A0C = C110115dX.A0Q(r1);
            viralityLinkVerifierActivity.A09 = C110115dX.A0O(r1);
            viralityLinkVerifierActivity.A0A = C110115dX.A0P(r1);
            viralityLinkVerifierActivity.A0B = C16150sX.A10(r1);
            viralityLinkVerifierActivity.A08 = (C16600tK) r1.ARd.get();
        }
    }
}
