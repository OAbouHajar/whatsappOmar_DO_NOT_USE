package com.obwhatsapp.payments.ui;

import X.AnonymousClass00T;
import X.AnonymousClass1IC;
import X.AnonymousClass1IE;
import X.AnonymousClass1VZ;
import X.C008603x;
import X.C008804a;
import X.C111535gX;
import X.C13680ns;
import X.C13690nt;
import X.C16620tM;
import X.C17850vk;
import X.C17950vu;
import X.C18450wi;
import X.C228719p;
import X.C25401Jq;
import X.C25411Jr;
import X.C447725m;
import X.C49382Ss;
import X.C63593Kn;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape133S0100000_2_I1;
import com.google.android.material.appbar.AppBarLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import java.util.Map;

public final class P2mLiteWebViewActivity extends C111535gX {
    public C228719p A00;
    public C17850vk A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    public static /* synthetic */ void A09(P2mLiteWebViewActivity p2mLiteWebViewActivity) {
        p2mLiteWebViewActivity.A07 = true;
        p2mLiteWebViewActivity.onBackPressed();
    }

    public WebView A35() {
        Resources A3D = A3D(getResources());
        WebView webView = A3D != null ? new WebView(new C63593Kn(this, A3D)) : new WebView(this);
        webView.setLayoutParams(C13690nt.A0M());
        ((ViewGroup) findViewById(R.id.fragment_container)).addView(webView);
        return webView;
    }

    public void A36(int i2, Intent intent) {
        String str;
        AnonymousClass1IE r4;
        AnonymousClass1VZ r1;
        C17850vk r12 = this.A01;
        if (r12 != null) {
            String str2 = this.A04;
            AnonymousClass1IC r42 = null;
            if (str2 == null) {
                str = "fdsManagerId";
            } else {
                C17950vu A002 = r12.A00(str2);
                if (!(A002 == null || (r1 = A002.A00) == null)) {
                    r42 = r1.A02("native_p2m_lite_hpp_checkout");
                }
                C25401Jq[] r3 = new C25401Jq[3];
                C25401Jq.A00("result_code", Integer.valueOf(i2), r3, 0);
                C25401Jq.A00("result_data", intent, r3, 1);
                C25401Jq.A00("last_screen", "in_app_browser_checkout", r3, 2);
                Map A052 = C25411Jr.A05(r3);
                if ((r42 instanceof AnonymousClass1IE) && (r4 = (AnonymousClass1IE) r42) != null) {
                    r4.A93(A052);
                }
                finish();
                return;
            }
        } else {
            str = "fdsManagerRegistry";
        }
        throw C18450wi.A03(str);
    }

    public void A37(Toolbar toolbar, AppBarLayout appBarLayout, WaImageView waImageView) {
        C18450wi.A0H(appBarLayout, 0);
        C18450wi.A0J(toolbar, waImageView);
        C13680ns.A0u(this, appBarLayout, R.color.color0655);
        toolbar.setBackground(AnonymousClass00T.A04(this, R.drawable.bottom_sheet_background));
        C447725m A002 = C447725m.A00(this, this.A01, R.drawable.ic_close);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(AnonymousClass00T.A00(this, R.color.color0659), PorterDuff.Mode.SRC_ATOP);
        A002.setColorFilter(porterDuffColorFilter);
        toolbar.setNavigationIcon((Drawable) A002);
        toolbar.setNavigationOnClickListener(new IDxCListenerShape133S0100000_2_I1(this, 8));
        waImageView.setColorFilter(porterDuffColorFilter);
    }

    public boolean A3B() {
        return !this.A0C.A0E(C16620tM.A02, 2718);
    }

    public boolean A3C(String str) {
        String str2;
        if (!super.A3C(str) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.A02) && (str2 = this.A02) != null) {
            Boolean bool = null;
            if (str != null) {
                bool = Boolean.valueOf(C008603x.A0F(str, str2));
            }
            if (C18450wi.A0R(bool, Boolean.TRUE)) {
                Intent A09 = C13680ns.A09();
                A09.putExtra("webview_callback", str);
                A36(0, A09);
                return true;
            }
        }
        return false;
    }

    public final Resources A3D(Resources resources) {
        if (!(resources instanceof C008804a)) {
            return resources;
        }
        Resources resources2 = null;
        C008804a r2 = (C008804a) resources;
        if (r2 != null) {
            resources2 = r2.A00;
        }
        return A3D(resources2);
    }

    public void onBackPressed() {
        super.onBackPressed();
        int i2 = 1;
        if (this.A07) {
            i2 = 3;
        }
        C228719p r1 = this.A00;
        if (r1 != null) {
            r1.A01(C49382Ss.A00(), Integer.valueOf(i2), "in_app_browser_checkout", this.A06, this.A05, this.A03, 1, true);
            return;
        }
        throw C18450wi.A03("p2mLiteEventLogger");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = getIntent().getStringExtra("webview_cancel_callback");
        this.A06 = getIntent().getStringExtra("referral_screen");
        String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.A04 = stringExtra;
        this.A05 = getIntent().getStringExtra("order_type");
        this.A03 = getIntent().getStringExtra("config_id");
    }
}
