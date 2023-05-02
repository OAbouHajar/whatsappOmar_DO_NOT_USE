package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass01S;
import X.AnonymousClass29T;
import X.AnonymousClass2vX;
import X.AnonymousClass4J1;
import X.AnonymousClass4L8;
import X.AnonymousClass5MS;
import X.C005402i;
import X.C005702l;
import X.C13680ns;
import X.C17090uW;
import X.C18030w2;
import X.C32241fu;
import X.C447725m;
import X.C56592oB;
import X.C64193Ne;
import X.C64213Ng;
import X.C812047g;
import X.C812447k;
import X.C817949t;
import X.C94594lA;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape1S0110000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape15S0100000_I1;
import com.google.android.material.appbar.AppBarLayout;

public class WaInAppBrowsingActivity extends AnonymousClass2vX implements AnonymousClass5MS {
    public static final String A08 = AnonymousClass01S.A08;
    public WebView A00;
    public ProgressBar A01;
    public C005702l A02;
    public C17090uW A03;
    public C18030w2 A04;
    public String A05;
    public boolean A06 = false;
    public boolean A07 = false;

    public static String A02(Uri uri) {
        AnonymousClass4L8 r1;
        String query;
        AnonymousClass4J1 r4 = C817949t.A00;
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        if (scheme == null || "".equals(scheme) || authority == null || "".equals(authority)) {
            r1 = new AnonymousClass4L8();
            r1.A01 = uri.getPath();
            r1.A02 = scheme;
            r1.A00 = authority;
            query = uri.getQuery();
        } else {
            String str = TextUtils.isEmpty(uri.getPath()) ? null : "/--sanitized--";
            query = C812047g.A00(uri, r4);
            r1 = new AnonymousClass4L8();
            r1.A02 = scheme;
            r1.A00 = authority;
            r1.A01 = str;
        }
        String str2 = r1.A02;
        String str3 = r1.A00;
        String str4 = r1.A01;
        StringBuilder A0o = AnonymousClass000.A0o();
        if (!TextUtils.isEmpty(str2)) {
            A0o.append(str2);
            A0o.append(':');
        }
        if (!TextUtils.isEmpty(str3)) {
            A0o.append("//");
            A0o.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            A0o.append(str4);
        }
        if (!TextUtils.isEmpty(query)) {
            A0o.append('?');
            A0o.append(query);
        }
        return A0o.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r3 = com.obwhatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean A03(android.webkit.WebView r5, com.obwhatsapp.WaInAppBrowsingActivity r6, java.lang.String r7) {
        /*
            boolean r0 = r6.A3C(r7)
            r4 = 1
            if (r0 != 0) goto L_0x002e
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "webview_deeplink_enabled"
            r2 = 0
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x0030
            android.net.Uri r3 = com.obwhatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r7)
            X.0w2 r0 = r6.A04
            int r1 = r0.A08(r3)
            if (r1 == r4) goto L_0x0030
            r0 = 10
            if (r1 == r0) goto L_0x0030
            X.0uW r1 = r6.A03
            android.content.Context r0 = r5.getContext()
            r1.Act(r0, r3)
        L_0x002e:
            r0 = 1
            return r0
        L_0x0030:
            java.lang.String r4 = r5.getUrl()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            android.content.Intent r1 = r6.getIntent()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            java.lang.String r0 = "webview_avoid_external"
            boolean r1 = r1.getBooleanExtra(r0, r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r7)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            if (r0 == 0) goto L_0x0081
            android.net.Uri r5 = com.obwhatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r4)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            android.net.Uri r4 = com.obwhatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r7)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            if (r5 == 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00ab
            java.lang.String r0 = "SecuredWebViewUtil/checkUrl: Tried to open external link when blocked: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            android.net.Uri r0 = android.net.Uri.parse(r7)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            java.lang.String r0 = A02(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            java.lang.String r1 = r5.getHost()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            java.lang.String r0 = r4.getHost()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            boolean r1 = r1.equals(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            r0 = 2131893127(0x7f121b87, float:1.9421022E38)
            java.lang.String r0 = r3.getString(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            goto L_0x00ab
        L_0x0081:
            java.lang.String r0 = "SecuredWebViewUtil/checkUrl: Tried to open non-HTTPS content on "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            android.net.Uri r0 = android.net.Uri.parse(r7)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            java.lang.String r0 = A02(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            r0 = 2131893129(0x7f121b89, float:1.9421026E38)
            java.lang.String r0 = r3.getString(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r6.A3A(r0, r2)
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.WaInAppBrowsingActivity.A03(android.webkit.WebView, com.obwhatsapp.WaInAppBrowsingActivity, java.lang.String):boolean");
    }

    public WebView A35() {
        return (WebView) findViewById(R.id.web_view);
    }

    public void A36(int i2, Intent intent) {
        setResult(i2, intent);
        finish();
    }

    public void A37(Toolbar toolbar, AppBarLayout appBarLayout, WaImageView waImageView) {
        C13680ns.A0u(this, appBarLayout, R.color.color065f);
        C447725m A002 = C447725m.A00(this, this.A01, R.drawable.ic_back);
        A002.setColorFilter(getResources().getColor(R.color.color01bd), PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon((Drawable) A002);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape15S0100000_I1((Object) this, 9));
    }

    public final void A38(String str) {
        if (x() != null) {
            String stringExtra = getIntent().getStringExtra("webview_title");
            TextView A0N = C13680ns.A0N(this, R.id.website_title);
            if (!TextUtils.isEmpty(stringExtra)) {
                A0N.setText(stringExtra);
            } else if (!TextUtils.isEmpty(str)) {
                A0N.setText(str);
            }
            if (this.A07) {
                C13680ns.A0v(this, A0N, R.color.color0660);
            }
        }
    }

    public final void A39(String str) {
        if (x() != null && str != null && !"about:blank".equals(str) && !getIntent().getBooleanExtra("webview_hide_url", false)) {
            TextView A0N = C13680ns.A0N(this, R.id.website_url);
            A0N.setText(str);
            TextView A0N2 = C13680ns.A0N(this, R.id.website_title);
            if (TextUtils.isEmpty(str)) {
                C13680ns.A0v(this, A0N2, R.color.color06c5);
                A0N.setVisibility(8);
                return;
            }
            C13680ns.A0v(this, A0N2, R.color.color0660);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            A0N.setVisibility(0);
            alphaAnimation.setDuration(300);
            A0N.startAnimation(alphaAnimation);
        }
    }

    public void A3A(String str, boolean z2) {
        if (this.A02 == null && !AnonymousClass29T.A03(this)) {
            C32241fu A002 = C32241fu.A00(this);
            A002.A06(str);
            A002.A07(false);
            A002.setPositiveButton(R.string.str0e87, new IDxCListenerShape1S0110000_2_I1(this, 0, z2));
            this.A02 = A002.A00();
        }
    }

    public boolean A3B() {
        return true;
    }

    public boolean A3C(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.A05) || !str.contains(this.A05)) {
            return false;
        }
        Intent A09 = C13680ns.A09();
        A09.putExtra("webview_callback", str);
        A36(-1, A09);
        return true;
    }

    public void onBackPressed() {
        Intent A09 = C13680ns.A09();
        String stringExtra = getIntent().getStringExtra("webview_callback");
        if (stringExtra != null) {
            A09.putExtra("webview_callback", stringExtra);
        }
        A36(0, A09);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout02fc);
        this.A05 = getIntent().getStringExtra("webview_callback");
        this.A06 = getIntent().getBooleanExtra("webview_open_new_tab_in_external_browser", false);
        this.A07 = getIntent().getBooleanExtra("webview_title_show_domain_only", false);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Aem(toolbar);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            A37(toolbar, (AppBarLayout) findViewById(R.id.appbar), (WaImageView) findViewById(R.id.icon_lock));
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar_page_progress);
            this.A01 = progressBar;
            C812447k.A00(progressBar, R.color.color0909);
        }
        WebView A35 = A35();
        this.A00 = A35;
        boolean booleanExtra = getIntent().getBooleanExtra("webview_javascript_enabled", false);
        A35.getSettings().setAllowContentAccess(false);
        A35.getSettings().setAllowFileAccess(false);
        A35.getSettings().setJavaScriptEnabled(booleanExtra);
        A35.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        A35.getSettings().setGeolocationEnabled(false);
        A35.clearCache(true);
        A35.getSettings().setSaveFormData(false);
        A35.getSettings().setSupportMultipleWindows(false);
        A35.setWebChromeClient(new C64193Ne());
        CookieManager.getInstance().setAcceptCookie(false);
        if (Build.VERSION.SDK_INT < 18) {
            A35.getSettings().setPluginState(WebSettings.PluginState.OFF);
            A35.getSettings().setSavePassword(false);
        }
        A35.getSettings().setAllowFileAccessFromFileURLs(false);
        A35.getSettings().setAllowUniversalAccessFromFileURLs(false);
        if (this.A06) {
            this.A00.getSettings().setSupportMultipleWindows(true);
        }
        this.A00.setWebViewClient(new C56592oB(this));
        this.A00.setWebChromeClient(new C64213Ng(this));
        if (A3B()) {
            getWindow().setFlags(8192, 8192);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            WebView.startSafeBrowsing(this, new C94594lA());
        }
        A38(getString(R.string.str1b8b));
        String stringExtra = getIntent().getStringExtra("webview_url");
        if (A3C(stringExtra)) {
            return;
        }
        if (getIntent().getBooleanExtra("webview_post_on_initial_request", false)) {
            String stringExtra2 = getIntent().getStringExtra("webview_initial_body_params");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.A00.postUrl(stringExtra, stringExtra2.getBytes());
            return;
        }
        this.A00.loadUrl(stringExtra);
    }

    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.A00;
        if (webView != null) {
            webView.onPause();
            webView.loadUrl("about:blank");
            webView.clearHistory();
            webView.clearCache(true);
            webView.removeAllViews();
            webView.destroyDrawingCache();
        }
        this.A00.destroy();
        this.A00 = null;
    }
}
