package com.obwhatsapp.support.faq;

import X.AnonymousClass01S;
import X.AnonymousClass1KQ;
import X.AnonymousClass1Y4;
import X.AnonymousClass39V;
import X.AnonymousClass3MJ;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15910s6;
import X.C16150sX;
import X.C18290wS;
import X.C49132Rg;
import X.C56582oA;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.redex.RunnableRunnableShape1S1100000_I1;
import com.obwhatsapp.R;

public class FaqItemActivity extends C14530pL {
    public long A00;
    public long A01;
    public long A02;
    public AnonymousClass1KQ A03;
    public C18290wS A04;
    public AnonymousClass39V A05;
    public boolean A06;
    public final WebViewClient A07;

    public FaqItemActivity() {
        this(0);
        this.A07 = new C56582oA(this);
    }

    public FaqItemActivity(int i2) {
        this.A06 = false;
        C13680ns.A1G(this, 136);
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A03 = (AnonymousClass1KQ) r1.AAL.get();
            this.A04 = (C18290wS) r1.AIB.get();
        }
    }

    public void onBackPressed() {
        C14530pL.A0o(this);
        super.onBackPressed();
        overridePendingTransition(R.anim.anim003d, R.anim.anim0041);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass39V r0 = this.A05;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str14a3);
        x().A0N(true);
        setContentView((int) R.layout.layout027f);
        x().A0J(getIntent().getStringExtra("title"));
        String stringExtra = getIntent().getStringExtra("content");
        String stringExtra2 = getIntent().getStringExtra("url");
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(this.A07);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", AnonymousClass01S.A08, (String) null);
        this.A00 = getIntent().getLongExtra("article_id", -1);
        this.A02 = 0;
        String stringExtra3 = getIntent().getStringExtra("contact_us_context");
        if (!getIntent().getBooleanExtra("show_contact_support_button", false)) {
            return;
        }
        if (!AnonymousClass1Y4.A00(stringExtra3) || !this.A06.A05(C15910s6.A0i)) {
            String stringExtra4 = getIntent().getStringExtra("contact_us_context");
            View findViewById = findViewById(R.id.bottom_button_container);
            RunnableRunnableShape1S1100000_I1 runnableRunnableShape1S1100000_I1 = new RunnableRunnableShape1S1100000_I1(10, stringExtra4, this);
            AnonymousClass39V r10 = new AnonymousClass39V(webView, findViewById, getResources().getDimensionPixelSize(R.dimen.dimen06f3));
            this.A05 = r10;
            r10.A02(this, new AnonymousClass3MJ(this, runnableRunnableShape1S1100000_I1), C13680ns.A0N(this, R.id.does_not_match_button), getString(R.string.str072b), R.style.style0172);
            C13680ns.A19(this.A05.A01, runnableRunnableShape1S1100000_I1, 40);
            findViewById.setVisibility(0);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        overridePendingTransition(R.anim.anim003d, R.anim.anim0041);
        return true;
    }

    public void onPause() {
        super.onPause();
        this.A02 += System.currentTimeMillis() - this.A01;
        this.A01 = System.currentTimeMillis();
    }

    public void onResume() {
        super.onResume();
        this.A01 = System.currentTimeMillis();
    }

    public void onStop() {
        super.onStop();
        C14530pL.A0o(this);
    }
}
