package X;

import com.obwhatsapp.WaInAppBrowsingActivity;
import com.obwhatsapp.payments.ui.P2mLiteWebViewActivity;

/* renamed from: X.5gX  reason: invalid class name and case insensitive filesystem */
public abstract class C111535gX extends WaInAppBrowsingActivity {
    public boolean A00 = false;

    public C111535gX() {
        C110105dW.A0t(this, 84);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            P2mLiteWebViewActivity p2mLiteWebViewActivity = (P2mLiteWebViewActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, p2mLiteWebViewActivity);
            C14530pL.A0b(r3, r1, p2mLiteWebViewActivity, C110105dW.A0F(r1));
            p2mLiteWebViewActivity.A03 = (C17090uW) r1.ADM.get();
            p2mLiteWebViewActivity.A04 = (C18030w2) r1.A6W.get();
            p2mLiteWebViewActivity.A01 = (C17850vk) r1.AAK.get();
            p2mLiteWebViewActivity.A00 = (C228719p) r1.AGq.get();
        }
    }
}
