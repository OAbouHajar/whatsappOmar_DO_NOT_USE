package com.obwhatsapp.payments.ui;

import X.AnonymousClass027;
import X.AnonymousClass04o;
import X.C001300o;
import X.C001500q;
import X.C005402i;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110595eU;
import X.C110895f0;
import X.C114405ni;
import X.C117745tU;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.redex.IDxIFactoryShape5S0200000_3_I1;
import com.facebook.redex.IDxObserverShape118S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.StickyHeadersRecyclerView;

public class MerchantPayoutTransactionHistoryActivity extends C14530pL {
    public ViewGroup A00;
    public FrameLayout A01;
    public StickyHeadersRecyclerView A02;
    public C110895f0 A03;
    public C110595eU A04;
    public C117745tU A05;
    public boolean A06;

    public MerchantPayoutTransactionHistoryActivity() {
        this(0);
    }

    public MerchantPayoutTransactionHistoryActivity(int i2) {
        this.A06 = false;
        C110105dW.A0t(this, 82);
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A05 = (C117745tU) r1.AHx.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int A012 = C110105dW.A01(this, R.layout.layout048a);
        C005402i x2 = x();
        if (x2 != null) {
            C110105dW.A0o(this, x2, R.string.str0f72, A012);
        }
        this.A03 = new C110895f0(this);
        this.A01 = (FrameLayout) findViewById(R.id.loading_container);
        this.A00 = (ViewGroup) findViewById(R.id.transaction_list_container);
        StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) findViewById(R.id.transaction_list);
        this.A02 = stickyHeadersRecyclerView;
        stickyHeadersRecyclerView.setAdapter(this.A03);
        C110595eU r3 = (C110595eU) new C006602z((AnonymousClass04o) new IDxIFactoryShape5S0200000_3_I1(this, 6, this.A05), (C001500q) this).A01(C110595eU.class);
        this.A04 = r3;
        C13700nu.A0V(r3.A00, true);
        C13700nu.A0V(r3.A01, false);
        C13680ns.A1U(new C114405ni(r3.A06, r3), r3.A09);
        C110595eU r5 = this.A04;
        IDxObserverShape118S0100000_3_I1 A07 = C110115dX.A07(this, 53);
        IDxObserverShape118S0100000_3_I1 A072 = C110115dX.A07(this, 55);
        IDxObserverShape118S0100000_3_I1 A073 = C110115dX.A07(this, 54);
        AnonymousClass027 r0 = r5.A02;
        C001300o r1 = r5.A03;
        r0.A0A(r1, A07);
        r5.A00.A0A(r1, A072);
        r5.A01.A0A(r1, A073);
    }
}
