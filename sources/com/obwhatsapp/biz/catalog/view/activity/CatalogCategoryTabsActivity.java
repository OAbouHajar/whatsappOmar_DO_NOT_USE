package com.obwhatsapp.biz.catalog.view.activity;

import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass01J;
import X.AnonymousClass1DV;
import X.AnonymousClass1PQ;
import X.AnonymousClass2SL;
import X.AnonymousClass2XT;
import X.AnonymousClass3DZ;
import X.AnonymousClass4DS;
import X.AnonymousClass4WJ;
import X.AnonymousClass5DQ;
import X.C005402i;
import X.C109265Rj;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C15220qW;
import X.C16150sX;
import X.C18450wi;
import X.C447325i;
import X.C49132Rg;
import X.C64443Ps;
import X.C89964dG;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxCListenerShape51S0000000_2_I1;
import com.facebook.redex.IDxEListenerShape363S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.obwhatsapp.R;
import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import java.util.Iterator;
import java.util.List;

public final class CatalogCategoryTabsActivity extends AnonymousClass2SL implements C447325i, C109265Rj {
    public ViewPager A00;
    public AnonymousClass1PQ A01;
    public C89964dG A02;
    public boolean A03;
    public final C15220qW A04;

    public CatalogCategoryTabsActivity() {
        this(0);
        this.A04 = new AnonymousClass1DV(new AnonymousClass5DQ(this));
    }

    public CatalogCategoryTabsActivity(int i2) {
        this.A03 = false;
        C13680ns.A1G(this, 17);
    }

    public void A1q() {
        if (!this.A03) {
            this.A03 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r2 = A1T.A1s;
            this.A05 = C16150sX.A1B(r2);
            AnonymousClass01J r1 = r2.A05;
            C14530pL.A0b(A1T, r2, this, C14550pN.A0w(r2, this, r1));
            C14530pL.A0c(A1T, r2, this);
            this.A01 = A1T.A05();
            this.A02 = new C89964dG(new AnonymousClass4DS((C14710pd) r1.get()));
        }
    }

    public void AOC(String str) {
        this.A05 = str;
        invalidateOptionsMenu();
    }

    public void AOD() {
        ((C64443Ps) this.A07.getValue()).A03.A00();
    }

    public void AR1(int i2) {
        if (i2 == 404) {
            A2Z(new IDxCListenerShape51S0000000_2_I1(1), 0, R.string.str0479, R.string.str0e87);
        }
    }

    public void onBackPressed() {
        AnonymousClass2XT r1;
        AnonymousClass01A A0B = AGM().A0B("CategoryTabsSearchFragmentTag");
        if (A0B == null || !(A0B instanceof AnonymousClass2XT) || (r1 = (AnonymousClass2XT) A0B) == null || !r1.AHL()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout003b);
        ((ViewStub) findViewById(R.id.stub_toolbar_search)).inflate();
        Aem((Toolbar) C18450wi.A01(this, R.id.toolbar));
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0B(R.string.str03c3);
        }
        AnonymousClass1PQ r3 = this.A01;
        if (r3 != null) {
            r3.A00(new IDxEListenerShape363S0100000_2_I1(this, 0), A35());
            String stringExtra = getIntent().getStringExtra("selected_category_parent_id");
            AnonymousClass00B.A06(stringExtra);
            C18450wi.A09(stringExtra);
            C15220qW r2 = this.A04;
            ((CatalogCategoryTabsViewModel) r2.getValue()).A00.A0A(this, new AnonymousClass3DZ(this, stringExtra));
            CatalogCategoryTabsViewModel catalogCategoryTabsViewModel = (CatalogCategoryTabsViewModel) r2.getValue();
            catalogCategoryTabsViewModel.A04.Acl(new RunnableRunnableShape13S0200000_I1_1(catalogCategoryTabsViewModel, 19, A35()));
            return;
        }
        throw C18450wi.A03("catalogSearchManager");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18450wi.A0H(menu, 0);
        getMenuInflater().inflate(R.menu.menu0005, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onNewIntent(Intent intent) {
        CatalogSearchFragment catalogSearchFragment;
        C18450wi.A0H(intent, 0);
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("selected_category_parent_id");
        if (stringExtra != null) {
            C15220qW r1 = this.A04;
            List A0k = C13690nt.A0k(((CatalogCategoryTabsViewModel) r1.getValue()).A00);
            if (A0k != null) {
                r1.getValue();
                Iterator it = A0k.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (C18450wi.A0R(((AnonymousClass4WJ) it.next()).A01, stringExtra)) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                ViewPager viewPager = this.A00;
                if (viewPager == null) {
                    throw C18450wi.A03("viewPager");
                }
                viewPager.setCurrentItem(i2);
            }
            AnonymousClass01A A0B = AGM().A0B("CategoryTabsSearchFragmentTag");
            if (A0B != null && (A0B instanceof CatalogSearchFragment) && (catalogSearchFragment = (CatalogSearchFragment) A0B) != null) {
                catalogSearchFragment.A1G(false);
            }
        }
    }
}
