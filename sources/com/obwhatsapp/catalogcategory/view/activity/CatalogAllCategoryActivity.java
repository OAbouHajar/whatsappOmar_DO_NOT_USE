package com.obwhatsapp.catalogcategory.view.activity;

import X.AnonymousClass00B;
import X.AnonymousClass050;
import X.AnonymousClass2SL;
import X.AnonymousClass41H;
import X.AnonymousClass46F;
import X.C005402i;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C18450wi;
import X.C49132Rg;
import android.os.Bundle;
import android.view.Menu;
import com.obwhatsapp.R;

public final class CatalogAllCategoryActivity extends AnonymousClass2SL {
    public boolean A00;

    public CatalogAllCategoryActivity() {
        this(0);
    }

    public CatalogAllCategoryActivity(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 36);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0c(A1T, r1, this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout003a);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0J(getString(R.string.str03c2));
        }
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("category_parent_id");
            AnonymousClass00B.A06(stringExtra);
            AnonymousClass050 A0O = C13680ns.A0O(this);
            C18450wi.A09(stringExtra);
            A0O.A0A(AnonymousClass46F.A00(AnonymousClass41H.CATALOG_CATEGORY_FLOW, A35(), stringExtra), R.id.container);
            A0O.A01();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18450wi.A0H(menu, 0);
        getMenuInflater().inflate(R.menu.menu0004, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
