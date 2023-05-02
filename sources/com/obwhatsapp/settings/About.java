package com.obwhatsapp.settings;

import X.AnonymousClass1SS;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;

public class About extends C14530pL {
    public AnonymousClass1SS A00;
    public boolean A01;

    public About() {
        this(0);
    }

    public About(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 113);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = (AnonymousClass1SS) r1.A4S.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        if (r1 == r0) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r0 = 2131558428(0x7f0d001c, float:1.8742172E38)
            r5.setContentView((int) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x001e
            android.view.Window r2 = r5.getWindow()
            r1 = 2131099673(0x7f060019, float:1.7811706E38)
            int r0 = X.AnonymousClass00T.A00(r5, r1)
            r0 = 2
            X.C434920f.A05(r5, r1, r0)
        L_0x001e:
            r0 = 2131366901(0x7f0a13f5, float:1.8353709E38)
            android.widget.TextView r3 = X.C13680ns.A0N(r5, r0)
            X.0sK r0 = r5.A01
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x003a
            X.1SS r0 = r5.A00
            X.2Hs r1 = r0.A00()
            X.2Hs r0 = X.C47132Hs.TABLET
            r2 = 2131892657(0x7f1219b1, float:1.9420068E38)
            if (r1 != r0) goto L_0x003d
        L_0x003a:
            r2 = 2131892659(0x7f1219b3, float:1.9420073E38)
        L_0x003d:
            java.lang.Object[] r1 = X.C13680ns.A1b()
            java.lang.String r0 = "2.23.1.76"
            r4 = 0
            java.lang.String r0 = X.C13680ns.A0d(r5, r0, r1, r4, r2)
            r3.setText(r0)
            r0 = 2131361810(0x7f0a0012, float:1.8343383E38)
            android.widget.TextView r3 = X.C13680ns.A0N(r5, r0)
            r0 = 2131892705(0x7f1219e1, float:1.9420166E38)
            java.lang.String r0 = r5.getString(r0)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            int r0 = r2.length()
            r2.setSpan(r1, r4, r0, r4)
            r3.setText(r2)
            r0 = 41
            X.C34331k5.A03(r3, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.About.onCreate(android.os.Bundle):void");
    }
}
