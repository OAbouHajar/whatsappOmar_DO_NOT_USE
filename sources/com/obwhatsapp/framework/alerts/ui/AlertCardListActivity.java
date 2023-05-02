package com.obwhatsapp.framework.alerts.ui;

import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass050;
import X.AnonymousClass1DV;
import X.AnonymousClass5EI;
import X.C005402i;
import X.C111305fh;
import X.C13680ns;
import X.C13690nt;
import X.C15220qW;
import android.os.Bundle;
import com.obwhatsapp.R;

public final class AlertCardListActivity extends C111305fh {
    public final C15220qW A00 = new AnonymousClass1DV(new AnonymousClass5EI(this));

    public static final /* synthetic */ AlertCardListFragment A02() {
        return new AlertCardListFragment();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout006b);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0J(getString(R.string.str1bcf));
        }
        C005402i x3 = x();
        if (x3 != null) {
            x3.A0N(true);
        }
        C005402i x4 = x();
        if (x4 != null) {
            x4.A0E(AnonymousClass00T.A04(this, R.drawable.ic_back));
        }
        Bundle bundle2 = new Bundle(C13690nt.A0E(this));
        C15220qW r1 = this.A00;
        ((AnonymousClass01A) r1.getValue()).A0T(bundle2);
        AnonymousClass050 A0O = C13680ns.A0O(this);
        A0O.A0D((AnonymousClass01A) r1.getValue(), (String) null, R.id.alert_list_fragment_container);
        A0O.A01();
    }
}
