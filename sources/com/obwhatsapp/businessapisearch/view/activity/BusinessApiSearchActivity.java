package com.obwhatsapp.businessapisearch.view.activity;

import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass050;
import X.AnonymousClass065;
import X.AnonymousClass267;
import X.C005402i;
import X.C006602z;
import X.C14710pd;
import X.C16620tM;
import X.C25501Ka;
import X.C50062Xq;
import X.C75883ss;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape170S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.obwhatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel;

public class BusinessApiSearchActivity extends C50062Xq {
    public Menu A00;
    public AnonymousClass267 A01;
    public C25501Ka A02;
    public BusinessApiHomeFragment A03;
    public BusinessApiSearchActivityViewModel A04;
    public boolean A05;
    public boolean A06;

    public final AnonymousClass01A A35() {
        AnonymousClass065 r2 = AGM().A0U;
        if (r2.A02().isEmpty()) {
            return null;
        }
        return (AnonymousClass01A) r2.A02().get(r2.A02().size() - 1);
    }

    public void A36() {
        C14710pd r0 = this.A0C;
        C16620tM r2 = C16620tM.A02;
        boolean A0E = r0.A0E(r2, 2806);
        int i2 = 2;
        if (A0E) {
            i2 = 1;
        }
        A38(BusinessApiHomeFragment.A01(i2), false);
        setTitle(R.string.str017f);
        if (!this.A0C.A0E(r2, 2806)) {
            A39(false);
        }
    }

    public void A37() {
        Menu menu = this.A00;
        if (menu != null && menu.findItem(1) == null) {
            this.A00.add(0, 1, 0, getString(R.string.str1d7c)).setIcon(R.drawable.ic_action_search).setShowAsAction(2);
        }
        this.A05 = true;
    }

    public final void A38(AnonymousClass01A r4, boolean z2) {
        String simpleName = r4.getClass().getSimpleName();
        AnonymousClass050 r1 = new AnonymousClass050(AGM());
        r1.A0E(r4, simpleName, R.id.business_search_container_view);
        if (z2) {
            r1.A0I(simpleName);
        }
        r1.A01();
    }

    public void A39(boolean z2) {
        AnonymousClass267 r0 = this.A01;
        if (r0 != null) {
            r0.A02();
            AnonymousClass267 r2 = this.A01;
            String string = getString(R.string.str017e);
            SearchView searchView = r2.A02;
            if (searchView != null) {
                searchView.setQueryHint(string);
            }
            this.A01.A02.requestFocus();
            C25501Ka r22 = this.A02;
            C75883ss r1 = new C75883ss();
            r1.A01 = 2;
            r1.A03 = Integer.valueOf(z2 ? 1 : 0);
            r1.A00 = Boolean.valueOf(z2);
            r22.A01(r1);
            this.A01.A06.findViewById(R.id.search_back).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 4));
        }
    }

    public void onBackPressed() {
        AnonymousClass267 r0 = this.A01;
        if (r0 != null && r0.A06()) {
            BusinessApiHomeFragment businessApiHomeFragment = this.A03;
            if (businessApiHomeFragment != null) {
                businessApiHomeFragment.A1C();
            }
            this.A01.A05(true);
        }
        this.A04.A00();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z2 = true;
        if (bundle != null) {
            z2 = bundle.getBoolean("arg_show_search_view", true);
        } else {
            A36();
        }
        this.A06 = z2;
        setContentView((int) R.layout.layout0037);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Aem(toolbar);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0O(true);
        x2.A0N(true);
        if (bundle != null && this.A0C.A0E(C16620tM.A02, 2806) && (A35() instanceof BusinessApiHomeFragment)) {
            setTitle(R.string.str017f);
        }
        this.A01 = new AnonymousClass267(this, findViewById(R.id.search_holder), new IDxTListenerShape170S0100000_2_I0(this, 1), toolbar, this.A01);
        if (this.A06 && (bundle != null || !this.A0C.A0E(C16620tM.A02, 2806))) {
            A39(false);
        }
        BusinessApiSearchActivityViewModel businessApiSearchActivityViewModel = (BusinessApiSearchActivityViewModel) new C006602z(this).A01(BusinessApiSearchActivityViewModel.class);
        this.A04 = businessApiSearchActivityViewModel;
        businessApiSearchActivityViewModel.A01.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 55));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.A00 = menu;
        if (this.A05) {
            A37();
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            A38(BusinessApiHomeFragment.A01(2), true);
            A39(true);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            BusinessApiHomeFragment businessApiHomeFragment = this.A03;
            if (businessApiHomeFragment != null) {
                businessApiHomeFragment.A1C();
                return true;
            } else if (A35() instanceof BusinessApiHomeFragment) {
                onBackPressed();
                return true;
            } else {
                A36();
                return true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onSaveInstanceState(r4)
            android.view.Menu r1 = r3.A00
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0010
            android.view.MenuItem r0 = r1.findItem(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            java.lang.String r0 = "arg_show_search_menu"
            r4.putBoolean(r0, r1)
            X.267 r0 = r3.A01
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0021
            r2 = 1
        L_0x0021:
            java.lang.String r0 = "arg_show_search_view"
            r4.putBoolean(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessapisearch.view.activity.BusinessApiSearchActivity.onSaveInstanceState(android.os.Bundle):void");
    }
}
