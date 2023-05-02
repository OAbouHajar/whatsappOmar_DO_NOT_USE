package com.obwhatsapp.businessdirectory.view.activity;

import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass065;
import X.AnonymousClass12J;
import X.AnonymousClass262;
import X.AnonymousClass263;
import X.AnonymousClass265;
import X.AnonymousClass266;
import X.AnonymousClass3FH;
import X.C005402i;
import X.C006602z;
import X.C14710pd;
import X.C14750ph;
import X.C16620tM;
import X.C17180uf;
import X.C17210ui;
import X.C18450wi;
import X.C18990xa;
import X.C19380yL;
import X.C23041Ag;
import X.C25511Kb;
import X.C25521Kc;
import X.C25531Kd;
import X.C25541Ke;
import X.C28951Zk;
import X.C30801cy;
import X.C31241dn;
import X.C46052Cd;
import X.C52592e6;
import X.C57272qc;
import X.C616239q;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape170S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment;
import com.obwhatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.obwhatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Timer;
import java.util.TimerTask;

public class BusinessDirectoryActivity extends AnonymousClass265 {
    public Menu A00;
    public AnonymousClass12J A01;
    public C17180uf A02;
    public C25531Kd A03;
    public C17210ui A04;
    public C25511Kb A05;
    public C25521Kc A06;
    public C25541Ke A07;
    public AnonymousClass266 A08;
    public BusinessDirectoryContextualSearchFragment A09;
    public BusinessDirectoryActivityViewModel A0A;
    public C19380yL A0B;
    public C18990xa A0C;
    public C23041Ag A0D;
    public TimerTask A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Timer A0I = new Timer();

    public final BusinessDirectorySearchFragment A35() {
        AnonymousClass01A A0B2 = AGM().A0B("BusinessDirectorySearchFragment");
        if (A0B2 instanceof BusinessDirectorySearchFragment) {
            return (BusinessDirectorySearchFragment) A0B2;
        }
        return null;
    }

    public void A36() {
        Menu menu = this.A00;
        if (!(menu == null || menu.findItem(1) == null)) {
            this.A00.removeItem(1);
        }
        this.A0G = false;
    }

    public void A37() {
        AnonymousClass266 r0 = this.A08;
        if (r0 != null && !r0.A06()) {
            this.A08.A02();
            A3A();
            this.A08.A02.requestFocus();
            this.A08.A06.findViewById(R.id.search_back).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 5));
        }
    }

    public void A38() {
        Menu menu = this.A00;
        if (menu != null && menu.findItem(1) == null) {
            this.A00.add(0, 1, 0, getString(R.string.str1d7c)).setIcon(R.drawable.ic_action_search).setShowAsAction(2);
        }
        this.A0G = true;
    }

    public void A39() {
        C31241dn r3;
        C30801cy r0;
        AnonymousClass065 r2 = AGM().A0U;
        AnonymousClass01A r22 = r2.A02().isEmpty() ? null : (AnonymousClass01A) r2.A02().get(r2.A02().size() - 1);
        if (r22 instanceof BusinessDirectorySearchFragment) {
            C57272qc r23 = ((BusinessDirectorySearchFragment) r22).A0B;
            int i2 = r23.A02;
            if (i2 == 2) {
                r0 = r23.A0S;
            } else if (i2 == 1) {
                r0 = r23.A0T;
            } else {
                r3 = null;
                BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = new BusinessDirectoryContextualSearchFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("SEARCH_CONTEXT_CATEGORY", r3);
                businessDirectoryContextualSearchFragment.A0T(bundle);
                A3B(businessDirectoryContextualSearchFragment, true);
            }
            r3 = (C31241dn) r0.A01();
            BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment2 = new BusinessDirectoryContextualSearchFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("SEARCH_CONTEXT_CATEGORY", r3);
            businessDirectoryContextualSearchFragment2.A0T(bundle2);
            A3B(businessDirectoryContextualSearchFragment2, true);
        } else if (r22 instanceof BusinessDirectoryConsumerHomeFragment) {
            BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment3 = new BusinessDirectoryContextualSearchFragment();
            String simpleName = businessDirectoryContextualSearchFragment3.getClass().getSimpleName();
            AGM().A0p();
            AnonymousClass050 r1 = new AnonymousClass050(AGM());
            r1.A0E(businessDirectoryContextualSearchFragment3, simpleName, R.id.business_search_container_view);
            r1.A0I(simpleName);
            r1.A01();
        } else {
            StringBuilder sb = new StringBuilder("BusinessDirectoryActivity/startSearchInConsumerSearchHome foreground fragment is ");
            sb.append(r22 == null ? "null" : r22.A0R);
            Log.e(sb.toString());
        }
        A37();
    }

    public final void A3A() {
        C14710pd r1 = this.A02.A02;
        C16620tM r3 = C16620tM.A02;
        if (r1.A0E(r3, 450) && r1.A0E(r3, 1883)) {
            C25521Kc r0 = this.A06;
            boolean z2 = r0.A02;
            C14710pd r12 = r0.A04;
            int i2 = 2010;
            if (z2) {
                i2 = 2011;
            }
            if (!TextUtils.isEmpty(String.valueOf(r12.A06(r3, i2)))) {
                TimerTask timerTask = this.A0E;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                AnonymousClass263 r13 = new AnonymousClass263(this);
                this.A0E = r13;
                this.A0I.schedule(r13, 0, 7000);
                return;
            }
        }
        AnonymousClass266 r2 = this.A08;
        if (r2 != null) {
            String string = getString(R.string.str01d6);
            SearchView searchView = r2.A02;
            if (searchView != null) {
                searchView.setQueryHint(string);
            }
        }
    }

    public final void A3B(AnonymousClass01A r5, boolean z2) {
        String simpleName = r5.getClass().getSimpleName();
        AnonymousClass02C AGM = AGM();
        if (AGM.A0B(simpleName) == null) {
            AnonymousClass050 r1 = new AnonymousClass050(AGM);
            r1.A0E(r5, simpleName, R.id.business_search_container_view);
            if (z2) {
                r1.A0I(simpleName);
            }
            r1.A01();
        }
    }

    public void A3C(C31241dn r4, int i2) {
        AnonymousClass266 r1 = this.A08;
        if (r1 != null) {
            r1.A05(true);
        }
        AGM().A0p();
        BusinessDirectorySearchFragment A35 = A35();
        if (A35 != null) {
            C57272qc r2 = A35.A0B;
            r2.A00 = i2;
            C616239q r12 = r2.A0L;
            r12.A05();
            r12.A00 = null;
            r2.A0S.A0B(r4);
            if (C52592e6.A00(r4.A00)) {
                r2.A0A();
                return;
            }
            r2.A0T.A0B(r4);
            r2.A0K(false);
            if (r2.A0Q()) {
                r2.A05.pop();
                return;
            }
            return;
        }
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("INITIAL_CATEGORY", r4);
        businessDirectorySearchFragment.A0T(bundle);
        A3B(businessDirectorySearchFragment, false);
    }

    public void A3D(boolean z2) {
        A3B(new BusinessDirectoryConsumerHomeFragment(), z2);
        if (!this.A02.A0A()) {
            A37();
        }
    }

    public void onBackPressed() {
        AnonymousClass266 r0 = this.A08;
        if (r0 != null && r0.A06()) {
            BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = this.A09;
            if (businessDirectoryContextualSearchFragment != null) {
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = businessDirectoryContextualSearchFragment.A06;
                synchronized (businessDirectoryContextualSearchViewModel.A0e) {
                    businessDirectoryContextualSearchViewModel.A0E();
                    C17210ui r5 = businessDirectoryContextualSearchViewModel.A0N;
                    r5.A0C((Integer) null, (Integer) null, businessDirectoryContextualSearchViewModel.A0P.A02(), Long.valueOf((long) businessDirectoryContextualSearchViewModel.A02), Long.valueOf((long) businessDirectoryContextualSearchViewModel.A01), (Long) null, (Long) null, (Long) null, (Long) null, Long.valueOf((long) businessDirectoryContextualSearchViewModel.A03), (String) null, 44);
                    AnonymousClass3FH r1 = businessDirectoryContextualSearchViewModel.A0T;
                    if (!r1.A04) {
                        r5.A0G(r1.A02());
                    }
                }
            }
            this.A08.A05(true);
        }
        this.A04.A00();
    }

    public void onCreate(Bundle bundle) {
        BusinessDirectorySearchFragment businessDirectorySearchFragment;
        String A002;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0038);
        if (bundle != null) {
            this.A0G = bundle.getBoolean("arg_show_search_menu", false);
            this.A0H = bundle.getBoolean("arg_show_search_view", false);
            this.A0F = bundle.getBoolean("arg_go_back_to_utilities", false);
        }
        C25541Ke r4 = this.A07;
        String string = r4.A04.A02.A00().getString("value_model_config_path", (String) null);
        C17180uf r1 = r4.A02;
        String A003 = r1.A00();
        if (!(A003 == null || A003.length() == 0 || C18450wi.A0R(r1.A00(), string) || (A002 = r1.A00()) == null)) {
            r4.A0C((AnonymousClass262) null, A002);
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Aem(toolbar);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0O(true);
        x2.A0N(true);
        this.A08 = new AnonymousClass266(this, findViewById(R.id.search_holder), new IDxTListenerShape170S0100000_2_I0(this, 2), toolbar, this.A01);
        if (this.A0H) {
            A37();
        }
        if (this.A02.A0A()) {
            setTitle(R.string.str01ef);
        } else {
            setTitle(getString(R.string.str0212));
        }
        this.A0A = (BusinessDirectoryActivityViewModel) new C006602z(this).A01(BusinessDirectoryActivityViewModel.class);
        if (bundle == null) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("INITIAL_CATEGORY");
            this.A0F = getIntent().getBooleanExtra("ARG_DIRECTORY_SHOULD_GO_BACK_TO_UTILITIES", false);
            if (parcelableExtra == null) {
                Jid jid = (Jid) getIntent().getParcelableExtra("directory_biz_chaining_jid");
                String stringExtra = getIntent().getStringExtra("directory_biz_chaining_name");
                if (jid == null || stringExtra == null) {
                    A3D(false);
                } else {
                    businessDirectorySearchFragment = BusinessDirectorySearchFragment.A03(jid, stringExtra);
                }
            } else {
                businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("INITIAL_CATEGORY", parcelableExtra);
                businessDirectorySearchFragment.A0T(bundle2);
            }
            A3B(businessDirectorySearchFragment, false);
        }
        C14710pd r12 = this.A02.A02;
        C16620tM r3 = C16620tM.A02;
        if (r12.A0E(r3, 450) && r12.A0E(r3, 1883)) {
            C25521Kc r0 = this.A06;
            boolean z2 = r0.A02;
            C14710pd r13 = r0.A04;
            int i2 = 2010;
            if (z2) {
                i2 = 2011;
            }
            if (!TextUtils.isEmpty(String.valueOf(r13.A06(r3, i2)))) {
                findViewById(R.id.search_holder).getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape190S0100000_2_I0(this, 1));
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 4, 1, getString(R.string.str01ad));
        this.A00 = menu;
        if (this.A0G) {
            A38();
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        TimerTask timerTask = this.A0E;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null && intent.getBooleanExtra("arg_launch_consumer_home", false)) {
            if (this.A02.A0A()) {
                A39();
            } else {
                A3D(false);
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C14710pd r2 = this.A02.A02;
            C16620tM r1 = C16620tM.A02;
            if (!r2.A0E(r1, 450) || !r2.A0E(r1, 1926)) {
                A3D(true);
                return true;
            }
            A39();
            return true;
        } else if (itemId == 2) {
            this.A0A.A00.A02.A00().edit().putBoolean("show_request_permission_dialog", true).apply();
            Toast.makeText(this, R.string.str1c0d, 0).show();
            return true;
        } else if (itemId == 4) {
            startActivity(new C14750ph().A0t(this, (Bundle) null, (Parcelable) null, "biz-directory-browsing", (String) null));
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            BusinessDirectorySearchFragment A35 = A35();
            if (A35 == null || !A35.A0e()) {
                this.A04.A00();
                return true;
            }
            A35.A0B.A07();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        AnonymousClass266 r0 = this.A08;
        if (r0 != null) {
            r0.A03(bundle);
        }
    }

    public void onResume() {
        if (this.A0C.A00) {
            Log.i("BusinessDirectoryActivity/onResume WhatsApp login failed");
            this.A0B.A03(20, (String) null);
            C46052Cd.A00(this);
        } else if (this.A01.A00() != null && this.A0C.A0E(C16620tM.A02, 2466)) {
            Log.i("home/show-account-logout-request");
            C28951Zk A002 = this.A01.A00();
            this.A01.A01((C28951Zk) null);
            this.A0B.A03(52, (String) null);
            C46052Cd.A01(this, A002);
        }
        super.onResume();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onSaveInstanceState(r4)
            X.266 r0 = r3.A08
            if (r0 == 0) goto L_0x000a
            r0.A04(r4)
        L_0x000a:
            android.view.Menu r1 = r3.A00
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0017
            android.view.MenuItem r0 = r1.findItem(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.lang.String r0 = "arg_show_search_menu"
            r4.putBoolean(r0, r1)
            X.266 r0 = r3.A08
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            java.lang.String r0 = "arg_show_search_view"
            r4.putBoolean(r0, r2)
            boolean r1 = r3.A0F
            java.lang.String r0 = "arg_go_back_to_utilities"
            r4.putBoolean(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onSaveInstanceState(android.os.Bundle):void");
    }
}
