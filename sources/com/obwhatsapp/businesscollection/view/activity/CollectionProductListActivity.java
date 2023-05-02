package com.obwhatsapp.businesscollection.view.activity;

import X.AnonymousClass01A;
import X.AnonymousClass01J;
import X.AnonymousClass15W;
import X.AnonymousClass1KA;
import X.AnonymousClass1KS;
import X.AnonymousClass1KT;
import X.AnonymousClass1KV;
import X.AnonymousClass1PQ;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SO;
import X.AnonymousClass2XT;
import X.AnonymousClass4DS;
import X.C005402i;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14710pd;
import X.C16150sX;
import X.C18630x0;
import X.C18640x1;
import X.C23081Ak;
import X.C23091Al;
import X.C24511Gf;
import X.C28011Tz;
import X.C447325i;
import X.C49132Rg;
import X.C50262Yq;
import X.C59692yn;
import X.C89964dG;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxEListenerShape363S0100000_2_I1;
import com.obwhatsapp.R;

public class CollectionProductListActivity extends C59692yn implements C447325i {
    public AnonymousClass1PQ A00;
    public C89964dG A01;
    public boolean A02;

    public CollectionProductListActivity() {
        this(0);
    }

    public CollectionProductListActivity(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 23);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg r4 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r5 = r4.A1s;
            this.A05 = C16150sX.A1B(r5);
            AnonymousClass01J r3 = r5.A05;
            C14530pL.A0b(r4, r5, this, C14550pN.A0w(r5, this, r3));
            this.A0M = (C18630x0) r5.A1m.get();
            this.A05 = (C24511Gf) r5.A3U.get();
            this.A04 = (AnonymousClass1KT) r5.A3V.get();
            this.A0B = (AnonymousClass1KA) r5.A3a.get();
            this.A0G = C16150sX.A0M(r5);
            this.A0L = (AnonymousClass1KS) r5.AGl.get();
            this.A0I = C16150sX.A0Q(r5);
            this.A0J = (AnonymousClass15W) r5.AOC.get();
            this.A08 = (C18640x1) r5.A3X.get();
            this.A0H = C16150sX.A0P(r5);
            this.A0A = C16150sX.A0A(r5);
            this.A03 = (AnonymousClass2SO) r4.A0y.get();
            this.A0C = new C50262Yq((C23081Ak) r5.A3Z.get(), (C23091Al) r5.A3f.get());
            this.A07 = (C28011Tz) r5.AJV.get();
            this.A09 = (AnonymousClass1KV) r5.A3Y.get();
            this.A00 = r4.A05();
            this.A01 = new C89964dG(new AnonymousClass4DS((C14710pd) r3.get()));
        }
    }

    public void AOD() {
        this.A0D.A03.A00();
    }

    public void onBackPressed() {
        AnonymousClass01A A0B = AGM().A0B("CatalogSearchFragmentTag");
        if (A0B == null || !(A0B instanceof AnonymousClass2XT) || !((AnonymousClass2XT) A0B).AHL()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ViewStub) findViewById(R.id.stub_toolbar_search)).inflate();
        Aem((Toolbar) findViewById(R.id.toolbar));
        String str = this.A0Q;
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            if (str != null) {
                x2.A0J(str);
            }
        }
        this.A00.A00(new IDxEListenerShape363S0100000_2_I1(this, 1), this.A0K);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu0007, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
