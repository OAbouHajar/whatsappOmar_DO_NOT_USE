package com.obwhatsapp.inappsupport.ui;

import X.AnonymousClass00T;
import X.AnonymousClass01S;
import X.AnonymousClass39V;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;
import X.C64233Ni;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxDListenerShape58S0200000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape18S0100000_I1_3;
import com.obwhatsapp.R;

public class FaqItemActivityV2 extends C14530pL {
    public AnonymousClass39V A00;
    public String A01;
    public boolean A02;

    public FaqItemActivityV2() {
        this(0);
    }

    public FaqItemActivityV2(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 77);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass39V r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(R.string.str1d95);
        setTitle(string);
        setContentView((int) R.layout.layout0280);
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.toolbar);
        C14530pL.A0W(this, toolbar, this.A01);
        toolbar.setTitle((CharSequence) string);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape18S0100000_I1_3(this, 24));
        Aem(toolbar);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.obwhatsapp.inappsupport.ui.FaqItemActivityV2.html_content");
        String stringExtra2 = intent.getStringExtra("com.obwhatsapp.inappsupport.ui.FaqItemActivityV2.url");
        WebView webView = (WebView) findViewById(R.id.faq_item_web_view);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", AnonymousClass01S.A08, (String) null);
        View findViewById = findViewById(R.id.not_helpful_button_container);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape58S0200000_2_I1(findViewById, 3, this));
        this.A00 = new AnonymousClass39V(webView, findViewById, getResources().getDimensionPixelSize(R.dimen.dimen06f3));
        webView.setWebViewClient(new C64233Ni(this));
        C13680ns.A16(this.A00.A01, this, 23);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.obwhatsapp.inappsupport.ui.FaqItemActivityV2.url"))) {
            return super.onCreateOptionsMenu(menu);
        }
        this.A01 = getIntent().getStringExtra("com.obwhatsapp.inappsupport.ui.FaqItemActivityV2.url");
        menu.add(0, R.id.menuitem_open_in_browser, 0, getString(R.string.str1cc4)).setShowAsAction(0);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.menuitem_open_in_browser) {
            return false;
        } else {
            startActivity(C13680ns.A0A(this.A01));
            return true;
        }
    }
}
