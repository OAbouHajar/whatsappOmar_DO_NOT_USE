package com.obwhatsapp.payments;

import X.AnonymousClass173;
import X.AnonymousClass5xE;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.C110105dW;
import X.C110115dX;
import X.C111715hI;
import X.C112715ix;
import X.C116305rA;
import X.C118805vH;
import X.C1208363e;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C17190ug;
import X.C18310wU;
import X.C18340wX;
import X.C49132Rg;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentInvitePickerActivity;

public class IndiaUpiPaymentInvitePickerActivity extends PaymentInvitePickerActivity {
    public AnonymousClass173 A00;
    public C17190ug A01;
    public AnonymousClass60V A02;
    public C18340wX A03;
    public C18310wU A04;
    public AnonymousClass5xE A05;
    public C118805vH A06;
    public AnonymousClass61W A07;
    public C112715ix A08;
    public C116305rA A09;
    public boolean A0A;
    public boolean A0B;

    public IndiaUpiPaymentInvitePickerActivity() {
        this(0);
        this.A0B = false;
    }

    public IndiaUpiPaymentInvitePickerActivity(int i2) {
        this.A0A = false;
        C110105dW.A0t(this, 5);
    }

    public void A1q() {
        if (!this.A0A) {
            this.A0A = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111715hI.A02(r1, C14530pL.A0D(r1, this), this);
            this.A01 = C16150sX.A0t(r1);
            this.A09 = A0C.A0W();
            this.A04 = C110115dX.A0P(r1);
            this.A00 = C110115dX.A0D(r1);
            this.A06 = A0C.A0Q();
            this.A07 = C110105dW.A0O(r1);
            this.A05 = C16150sX.A0z(r1);
            this.A03 = C110115dX.A0M(r1);
            this.A02 = (AnonymousClass60V) r1.ACJ.get();
            this.A08 = (C112715ix) r1.ACG.get();
        }
    }

    public void A3J() {
        if (this.A01.A03.A0C(783)) {
            this.A0B = true;
            this.A05.Acl(new C1208363e(this));
        }
    }

    public void A3S(View view, View view2, View view3, View view4) {
        super.A3S(view, view2, view3, view4);
        if (this.A01.A03.A0C(783)) {
            C13690nt.A1I(this, R.id.contact_list_shimmer_container);
        }
    }

    public void A3T(View view, View view2, View view3, View view4) {
        if (this.A01.A03.A0C(783)) {
            startContactShimmerContacts(view4);
            view4.setVisibility(8);
            view.setVisibility(8);
            view2.setVisibility(8);
            view3.setVisibility(0);
            return;
        }
        super.A3T(view, view2, view3, view4);
    }

    public boolean A3c() {
        return this.A0B;
    }

    public final void startContactShimmerContacts(View view) {
        View inflate = getLayoutInflater().inflate(R.layout.layout03f5, (ViewGroup) null, false);
        ((ViewGroup) view.getParent()).addView(inflate, 0);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(R.id.contact_list_shimmer_container);
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.setVisibility(0);
            shimmerFrameLayout.A01();
        }
    }
}
