package com.obwhatsapp.biz.compliance.view;

import X.AnonymousClass027;
import X.C005402i;
import X.C006602z;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C34331k5;
import X.C49132Rg;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel;

public class BusinessComplianceDetailActivity extends C14530pL {
    public LinearLayout A00;
    public ProgressBar A01;
    public CardView A02;
    public RecyclerView A03;
    public BusinessComplianceViewModel A04;
    public boolean A05;

    public BusinessComplianceDetailActivity() {
        this(0);
    }

    public BusinessComplianceDetailActivity(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 18);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public final void A35() {
        if (this.A07.A0A()) {
            BusinessComplianceViewModel businessComplianceViewModel = this.A04;
            Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_CACHE_JID");
            AnonymousClass027 r1 = businessComplianceViewModel.A01;
            C13680ns.A1O(r1, 0);
            if (businessComplianceViewModel.A00.A01() != null) {
                C13680ns.A1O(r1, 1);
            } else {
                businessComplianceViewModel.A03.Acl(new RunnableRunnableShape12S0200000_I1(businessComplianceViewModel, 47, parcelableExtra));
            }
        } else {
            this.A01.setVisibility(8);
            this.A00.setVisibility(0);
            this.A02.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout00a8);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0B(R.string.str02cc);
        }
        this.A04 = (BusinessComplianceViewModel) new C006602z(this).A01(BusinessComplianceViewModel.class);
        this.A01 = (ProgressBar) findViewById(R.id.business_compliance_progress);
        this.A00 = (LinearLayout) findViewById(R.id.business_compliance_network_error_layout);
        this.A02 = (CardView) findViewById(R.id.business_compliance_wrapper_card);
        this.A03 = (RecyclerView) findViewById(R.id.business_compliance_recyclerview);
        C34331k5.A01(findViewById(R.id.business_compliance_network_error_retry), this, 17);
        A35();
        C13680ns.A1L(this, this.A04.A00, 9);
        C13680ns.A1L(this, this.A04.A01, 10);
    }
}
