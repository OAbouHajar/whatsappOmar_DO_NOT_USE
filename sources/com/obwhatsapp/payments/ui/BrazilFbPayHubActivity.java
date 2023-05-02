package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass107;
import X.AnonymousClass108;
import X.AnonymousClass109;
import X.AnonymousClass175;
import X.AnonymousClass17O;
import X.AnonymousClass17Y;
import X.AnonymousClass1MA;
import X.AnonymousClass1TR;
import X.AnonymousClass5vX;
import X.AnonymousClass5wV;
import X.AnonymousClass5xE;
import X.AnonymousClass5xG;
import X.AnonymousClass60U;
import X.C110105dW;
import X.C110115dX;
import X.C111675hA;
import X.C112785jQ;
import X.C118365uZ;
import X.C118915vc;
import X.C118955vg;
import X.C119165we;
import X.C119285wq;
import X.C119405xi;
import X.C1204661t;
import X.C1223669h;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C16460t6;
import X.C18090w8;
import X.C18280wR;
import X.C18320wV;
import X.C30671cl;
import X.C49132Rg;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrazilFbPayHubActivity extends C112785jQ implements C1223669h {
    public C16460t6 A00;
    public AnonymousClass60U A01;
    public C1204661t A02;
    public AnonymousClass5xE A03;
    public C18090w8 A04;
    public C18320wV A05;
    public AnonymousClass5xG A06;
    public AnonymousClass5wV A07;
    public C118915vc A08;
    public AnonymousClass1TR A09;
    public AnonymousClass5vX A0A;
    public C118955vg A0B;
    public C119165we A0C;
    public C18280wR A0D;
    public boolean A0E;

    public BrazilFbPayHubActivity() {
        this(0);
    }

    public BrazilFbPayHubActivity(int i2) {
        this.A0E = false;
        C110105dW.A0t(this, 14);
    }

    public void A1q() {
        if (!this.A0E) {
            this.A0E = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r2 = A0C2.A1s;
            C14550pN.A15(r2, this);
            C14530pL.A0b(A0C2, r2, this, C110105dW.A0F(r2));
            this.A0I = (C118365uZ) r2.AIm.get();
            this.A0H = C110115dX.A0Q(r2);
            this.A0E = C110115dX.A0O(r2);
            this.A09 = (AnonymousClass175) r2.AH5.get();
            this.A0G = C110115dX.A0P(r2);
            this.A0B = C110115dX.A0M(r2);
            this.A0J = (AnonymousClass1MA) r2.AHr.get();
            this.A0K = (C119285wq) r2.AIH.get();
            this.A0C = (AnonymousClass17O) r2.AHe.get();
            this.A0F = (AnonymousClass17Y) r2.AHs.get();
            this.A08 = (AnonymousClass107) r2.AFb.get();
            this.A0D = (AnonymousClass108) r2.AHh.get();
            this.A0A = (AnonymousClass109) r2.AH7.get();
            this.A0D = C110115dX.A0V(r2);
            this.A07 = (AnonymousClass5wV) r2.AHi.get();
            this.A00 = (C16460t6) r2.A5k.get();
            this.A01 = (AnonymousClass60U) r2.A2G.get();
            this.A0A = (AnonymousClass5vX) r2.A2J.get();
            this.A08 = (C118915vc) r2.AHj.get();
            this.A04 = C16150sX.A10(r2);
            this.A02 = C110115dX.A0J(r2);
            this.A05 = (C18320wV) r2.AIA.get();
            this.A03 = C16150sX.A0z(r2);
            this.A09 = (AnonymousClass1TR) r2.AEa.get();
            this.A06 = (AnonymousClass5xG) r2.AHX.get();
            this.A0B = (C118955vg) r2.A2T.get();
            this.A0C = A0C2.A0T();
        }
    }

    public int ADe(C30671cl r2) {
        return 0;
    }

    public String ADf(C30671cl r2) {
        return null;
    }

    public String ADi(C30671cl r2) {
        return null;
    }

    public void AMA(boolean z2) {
        String A022 = this.A0B.A02(true);
        Intent A042 = C110105dW.A04(this, BrazilPayBloksActivity.class);
        this.A0B.A04(A042, "generic_context");
        C111675hA.A03(A042, "referral_screen", "fbpay_payment_settings");
        if (A022 != null) {
            A042.putExtra("screen_name", A022);
        } else {
            C111675hA.A03(A042, "verification_needed", z2 ? "1" : "0");
            A042.putExtra("screen_name", "brpay_p_add_card");
        }
        A2V(A042);
    }

    public void AUY(C30671cl r3) {
        if (r3.A04() != 5) {
            Intent A042 = C110105dW.A04(this, BrazilPaymentCardDetailsActivity.class);
            C110115dX.A0o(A042, r3);
            startActivity(A042);
        }
    }

    public /* synthetic */ boolean AfB(C30671cl r2) {
        return false;
    }

    public boolean AfI() {
        return true;
    }

    public boolean AfL() {
        return true;
    }

    public void AfY(C30671cl r2, PaymentMethodRow paymentMethodRow) {
        if (C119405xi.A09(r2)) {
            this.A0A.A02(r2, paymentMethodRow);
        }
    }

    public void AhT(List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30671cl A0F = C110115dX.A0F(it);
            if (A0F.A04() == 5) {
                A0u.add(A0F);
            } else {
                A0u2.add(A0F);
            }
        }
        if (this.A04.A05()) {
            boolean isEmpty = A0u2.isEmpty();
            View view = this.A03;
            if (isEmpty) {
                view.setVisibility(8);
                this.A04.setVisibility(0);
            } else {
                view.setVisibility(0);
                this.A04.setVisibility(8);
            }
        }
        super.AhT(A0u2);
    }

    public void onResume() {
        super.onResume();
        if (!this.A0B.A06.A03()) {
            finish();
        }
    }
}
