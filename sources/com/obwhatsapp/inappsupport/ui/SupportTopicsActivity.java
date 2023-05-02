package com.obwhatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass15W;
import X.AnonymousClass1KO;
import X.AnonymousClass1Y3;
import X.AnonymousClass3CN;
import X.C005402i;
import X.C11900jW;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C59242va;
import X.C807545j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickCListenerShape18S0100000_I1_3;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class SupportTopicsActivity extends C59242va implements C11900jW {
    public int A00;
    public int A01;
    public MenuItem A02;
    public AnonymousClass1KO A03;
    public AnonymousClass15W A04;
    public List A05;

    public static Intent A02(Context context, Bundle bundle, ArrayList arrayList) {
        Intent intent = new Intent(context, SupportTopicsActivity.class);
        intent.putParcelableArrayListExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", arrayList);
        intent.putExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        intent.putExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        if (bundle != null) {
            intent.putExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle", bundle);
        }
        return intent;
    }

    public void A35(AnonymousClass3CN r14) {
        int i2 = this.A00;
        if (i2 == 1 || i2 == 2) {
            setResult(-1, C807545j.A00(getIntent()));
            finish();
            return;
        }
        ArrayList A0w = AnonymousClass000.A0w(this.A05);
        ArrayList A0w2 = AnonymousClass000.A0w(this.A05);
        for (int i3 = 0; i3 < this.A05.size(); i3++) {
            if (((SupportTopicsFragment) this.A05.get(i3)).A00 != null) {
                AnonymousClass3CN r1 = ((SupportTopicsFragment) this.A05.get(i3)).A00;
                A0w.add(r1.A03);
                A0w2.add(r1.A02);
            }
        }
        if (r14 != null) {
            A0w.add(r14.A03);
            A0w2.add(r14.A02);
        }
        String string = getIntent().getBundleExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle").getString("com.obwhatsapp.support.DescribeProblemActivity.from");
        AnonymousClass1KO r3 = this.A03;
        boolean A002 = this.A04.A00();
        if (string == null) {
            string = "support_topics";
        }
        startActivity(r3.A00(this, getIntent().getBundleExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle"), (AnonymousClass1Y3) null, (Integer) null, string, (String) null, A0w2, A0w, A002));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 15 && i3 == -1) {
            setResult(-1, C807545j.A00(getIntent()));
            finish();
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onBackPressed() {
        if (!this.A05.isEmpty()) {
            List list = this.A05;
            list.remove(list.size() - 1);
            if (!this.A05.isEmpty()) {
                List list2 = this.A05;
                SupportTopicsFragment supportTopicsFragment = (SupportTopicsFragment) list2.get(list2.size() - 1);
                MenuItem menuItem = this.A02;
                if (menuItem != null) {
                    AnonymousClass3CN r0 = supportTopicsFragment.A00;
                    menuItem.setVisible(r0 != null ? r0.A06 : false);
                }
            }
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        this.A01 = intent.getIntExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        this.A00 = intent.getIntExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        if (this.A01 == 2) {
            String string = getString(R.string.str1d95);
            setTheme(R.style.style0308);
            super.onCreate(bundle);
            setTitle(string);
            setContentView((int) R.layout.layout05a4);
            findViewById(R.id.toolbar_layout).setVisibility(0);
            Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.toolbar);
            C14530pL.A0W(this, toolbar, this.A01);
            toolbar.setTitle((CharSequence) string);
            toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape18S0100000_I1_3(this, 26));
            Aem(toolbar);
            View findViewById = findViewById(R.id.contact_us_button);
            findViewById.setVisibility(0);
            C13680ns.A16(findViewById, this, 25);
        } else {
            super.onCreate(bundle);
            setContentView((int) R.layout.layout05a4);
            C005402i x2 = x();
            if (x2 != null) {
                x2.A0J(getString(R.string.str0fbd));
                x2.A0N(true);
            }
        }
        this.A05 = AnonymousClass000.A0u();
        AnonymousClass02C AGM = AGM();
        ArrayList arrayList = AGM.A0F;
        if (arrayList == null) {
            arrayList = AnonymousClass000.A0u();
            AGM.A0F = arrayList;
        }
        arrayList.add(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.support_topics");
        SupportTopicsFragment supportTopicsFragment = new SupportTopicsFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("parent_topic", (Parcelable) null);
        A0D.putParcelableArrayList("topics", parcelableArrayListExtra);
        supportTopicsFragment.A0T(A0D);
        AnonymousClass050 A0O = C13680ns.A0O(this);
        A0O.A09(supportTopicsFragment, R.id.support_topics_container);
        A0O.A01();
        this.A05.add(supportTopicsFragment);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A01 != 1) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(R.menu.menu0013, menu);
        MenuItem findItem = menu.findItem(R.id.support_topic_skip);
        this.A02 = findItem;
        findItem.setVisible(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332 && !this.A05.isEmpty()) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != R.id.support_topic_skip) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A35((AnonymousClass3CN) null);
            return true;
        }
    }
}
