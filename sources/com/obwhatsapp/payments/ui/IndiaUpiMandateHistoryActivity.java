package com.obwhatsapp.payments.ui;

import X.AnonymousClass04o;
import X.AnonymousClass17Y;
import X.AnonymousClass1Vo;
import X.AnonymousClass61W;
import X.C001500q;
import X.C005402i;
import X.C005602k;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110745el;
import X.C112875jr;
import X.C113335ls;
import X.C113465m6;
import X.C113535mD;
import X.C117765tW;
import X.C1211864n;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C41411vk;
import X.C49132Rg;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxIFactoryShape1S0300000_3_I1;
import com.facebook.redex.IDxTObserverShape253S0100000_3_I1;
import com.obwhatsapp.R;

public class IndiaUpiMandateHistoryActivity extends C112875jr {
    public C41411vk A00;
    public AnonymousClass17Y A01;
    public AnonymousClass61W A02;
    public C110745el A03;
    public C117765tW A04;
    public boolean A05;
    public final AnonymousClass1Vo A06;

    public IndiaUpiMandateHistoryActivity() {
        this(0);
        this.A06 = AnonymousClass1Vo.A00("IndiaUpiMandateHistoryActivity", "mandates", "IN");
    }

    public IndiaUpiMandateHistoryActivity(int i2) {
        this.A05 = false;
        C110105dW.A0t(this, 53);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A02 = C110105dW.A0O(r1);
            this.A04 = (C117765tW) r1.ACL.get();
            this.A01 = (AnonymousClass17Y) r1.AHs.get();
        }
    }

    public C005602k A35(ViewGroup viewGroup, int i2) {
        if (i2 != 1002) {
            return i2 != 1003 ? i2 != 1007 ? super.A35(viewGroup, i2) : new C113465m6(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0333)) : new C113535mD(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0335));
        }
        View A0H = C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout044d);
        A0H.setBackgroundColor(C13680ns.A0D(A0H).getColor(R.color.color065f));
        return new C113335ls(A0H);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A03.A06.AKT(1, 1, "mandate_payment_screen", "payment_home", true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C005402i x2 = x();
        if (x2 != null) {
            C110115dX.A0u(x2, getString(R.string.str192e));
        }
        this.A06.A06("onCreate");
        C110745el r2 = (C110745el) new C006602z((AnonymousClass04o) new IDxIFactoryShape1S0300000_3_I1(this, this.A02, this.A04, 0), (C001500q) this).A01(C110745el.class);
        this.A03 = r2;
        r2.A07.Acl(new C1211864n(r2));
        r2.A06.AKT(0, (Integer) null, "mandate_payment_screen", "payment_home", true);
        C110745el r3 = this.A03;
        r3.A01.A0A(r3.A00, C110115dX.A07(this, 23));
        C110745el r32 = this.A03;
        r32.A03.A0A(r32.A00, C110115dX.A07(this, 22));
        IDxTObserverShape253S0100000_3_I1 iDxTObserverShape253S0100000_3_I1 = new IDxTObserverShape253S0100000_3_I1(this, 1);
        this.A00 = iDxTObserverShape253S0100000_3_I1;
        this.A01.A02(iDxTObserverShape253S0100000_3_I1);
    }

    public void onDestroy() {
        this.A01.A03(this.A00);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A03.A06.AKT(1, 1, "mandate_payment_screen", "payment_home", true);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
