package com.obwhatsapp.payments.ui;

import X.AnonymousClass5ko;
import X.C110105dW;
import X.C111345g2;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import android.view.MenuItem;

public class IndiaUpiAccountRecoveryFinishActivity extends AnonymousClass5ko {
    public boolean A00;

    public IndiaUpiAccountRecoveryFinishActivity() {
        this(0);
    }

    public IndiaUpiAccountRecoveryFinishActivity(int i2) {
        this.A00 = false;
        C110105dW.A0t(this, 35);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
        }
    }

    public void onBackPressed() {
        this.A0E.AKS(C13680ns.A0Y(), C13680ns.A0a(), "notify_verification_complete", this.A0O);
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0051, code lost:
        if (r2 == 12) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r0 = 2131559176(0x7f0d0308, float:1.8743689E38)
            r5.setContentView((int) r0)
            r0 = 2131361873(0x7f0a0051, float:1.834351E38)
            android.widget.ImageView r1 = X.C110115dX.A04(r5, r0)
            r0 = 2131231787(0x7f08042b, float:1.8079665E38)
            r1.setImageResource(r0)
            r0 = 2131361875(0x7f0a0053, float:1.8343515E38)
            android.widget.TextView r1 = X.C13680ns.A0N(r5, r0)
            r0 = 2131892406(0x7f1218b6, float:1.941956E38)
            r1.setText(r0)
            r0 = 2131361874(0x7f0a0052, float:1.8343513E38)
            android.widget.TextView r1 = X.C13680ns.A0N(r5, r0)
            r0 = 2131892405(0x7f1218b5, float:1.9419557E38)
            r1.setText(r0)
            X.02i r1 = X.C111345g2.A0r(r5)
            if (r1 == 0) goto L_0x0040
            r0 = 2131890143(0x7f120fdf, float:1.941497E38)
            java.lang.String r0 = r5.getString(r0)
            X.C110115dX.A0u(r1, r0)
        L_0x0040:
            r0 = 2131361872(0x7f0a0050, float:1.8343509E38)
            android.widget.TextView r3 = X.C13680ns.A0N(r5, r0)
            int r2 = r5.A02
            r0 = 5
            if (r2 == r0) goto L_0x0053
            r1 = 12
            r0 = 2131887916(0x7f12072c, float:1.9410453E38)
            if (r2 != r1) goto L_0x0056
        L_0x0053:
            r0 = 2131886764(0x7f1202ac, float:1.9408116E38)
        L_0x0056:
            r3.setText(r0)
            r0 = 22
            X.C110105dW.A0r(r3, r5, r0)
            X.61W r4 = r5.A0E
            java.lang.Integer r3 = X.C13680ns.A0X()
            r2 = 0
            java.lang.String r1 = r5.A0O
            java.lang.String r0 = "notify_verification_complete"
            r4.AKS(r3, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiAccountRecoveryFinishActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A0E.AKS(C13680ns.A0Y(), C13680ns.A0a(), "notify_verification_complete", this.A0O);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
