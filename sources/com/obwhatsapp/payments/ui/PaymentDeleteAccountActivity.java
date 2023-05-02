package com.obwhatsapp.payments.ui;

import X.AnonymousClass1TV;
import X.AnonymousClass1Vo;
import X.AnonymousClass2HJ;
import X.AnonymousClass4XO;
import X.AnonymousClass5vZ;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14870pt;
import X.C16150sX;
import X.C16320sq;
import X.C16460t6;
import X.C18280wR;
import X.C18290wS;
import X.C18300wT;
import X.C18310wU;
import X.C18320wV;
import X.C18340wX;
import X.C49132Rg;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.obwhatsapp.R;

public class PaymentDeleteAccountActivity extends C14530pL implements AnonymousClass1TV {
    public int A00;
    public C16460t6 A01;
    public C18340wX A02;
    public C18300wT A03;
    public C18310wU A04;
    public C18320wV A05;
    public C18290wS A06;
    public C18280wR A07;
    public boolean A08;
    public final AnonymousClass1Vo A09;

    public PaymentDeleteAccountActivity() {
        this(0);
        this.A09 = C110105dW.A0Q("PaymentDeleteAccountActivity", "payment-settings");
    }

    public PaymentDeleteAccountActivity(int i2) {
        this.A08 = false;
        C110105dW.A0t(this, 90);
    }

    public void A1q() {
        if (!this.A08) {
            this.A08 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A07 = C110115dX.A0V(r1);
            this.A06 = C110115dX.A0Q(r1);
            this.A01 = (C16460t6) r1.A5k.get();
            this.A03 = C110115dX.A0O(r1);
            this.A04 = C110115dX.A0P(r1);
            this.A05 = (C18320wV) r1.AIA.get();
            this.A02 = C110115dX.A0M(r1);
        }
    }

    public void A2S(int i2) {
        setResult(-1);
        finish();
    }

    public void AWC(AnonymousClass2HJ r2) {
        Afg(R.string.str0f37);
    }

    public void AWI(AnonymousClass2HJ r4) {
        int AC2 = this.A06.A03().AB6().AC2((AnonymousClass4XO) null, r4.A00);
        if (AC2 == 0) {
            AC2 = R.string.str0f37;
        }
        Afg(AC2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AWJ(X.AnonymousClass2HK r5) {
        /*
            r4 = this;
            X.1Vo r2 = r4.A09
            java.lang.String r0 = "onDeleteAccount successful: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            boolean r0 = r5.A02
            r1.append(r0)
            java.lang.String r0 = " remove type: "
            r1.append(r0)
            int r0 = r4.A00
            r1.append(r0)
            X.C110105dW.A1L(r2, r1)
            r0 = 2131365554(0x7f0a0eb2, float:1.8350977E38)
            android.view.View r0 = r4.findViewById(r0)
            r3 = 8
            r0.setVisibility(r3)
            boolean r0 = r5.A02
            r2 = 1
            if (r0 == 0) goto L_0x006a
            int r0 = r4.A00
            if (r0 != r2) goto L_0x0045
            r1 = 2131889976(0x7f120f38, float:1.941463E38)
        L_0x0032:
            r0 = 2131366798(0x7f0a138e, float:1.83535E38)
            android.widget.TextView r0 = X.C13680ns.A0N(r4, r0)
            r0.setText(r1)
            r0 = 2131366797(0x7f0a138d, float:1.8353498E38)
            X.C13680ns.A1I(r4, r0, r3)
            r4.Afg(r1)
        L_0x0045:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x004e
            X.0wS r0 = r4.A06
            r0.A08(r2, r2)
        L_0x004e:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0069
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x0069
            android.content.Intent r2 = X.C13680ns.A09()
            int r1 = r4.A00
            java.lang.String r0 = "extra_remove_payment_account"
            r2.putExtra(r0, r1)
            r0 = -1
            r4.setResult(r0, r2)
            r4.finish()
        L_0x0069:
            return
        L_0x006a:
            r1 = 2131889975(0x7f120f37, float:1.9414629E38)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.PaymentDeleteAccountActivity.AWJ(X.2HK):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_payments);
        int i2 = 0;
        if (configuration.orientation == 2) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0485);
        C005402i x2 = x();
        int i2 = 1;
        if (x2 != null) {
            x2.A0B(R.string.str1167);
            x2.A0N(true);
        }
        if (getIntent() != null) {
            i2 = getIntent().getIntExtra("extra_remove_payment_account", 1);
        }
        this.A00 = i2;
        C14870pt r4 = this.A05;
        C16320sq r13 = this.A05;
        C18280wR r12 = this.A07;
        C18290wS r11 = this.A06;
        new AnonymousClass5vZ(this, r4, this.A07, this.A01, this.A02, this.A03, this.A04, this.A05, r11, r12, r13).A00(this);
        this.A09.A06("deleted payments store and sending delete account request");
        onConfigurationChanged(C13700nu.A03(this));
    }
}
