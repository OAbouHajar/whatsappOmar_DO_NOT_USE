package com.obwhatsapp.ctwa.trustsignal;

import X.C000900k;
import X.C001100m;
import X.C006602z;
import X.C008603x;
import X.C13680ns;
import X.C18450wi;
import X.C19980zJ;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.obwhatsapp.InfoCard;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.ctwa.trustsignal.viewmodel.TopBannerViewModel;

public final class TopBannerView extends LinearLayoutCompat {
    public TopBannerViewModel A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final InfoCard A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Class<TopBannerViewModel> cls = TopBannerViewModel.class;
        C18450wi.A0J(context, attributeSet);
        ViewGroup.inflate(context, R.layout.layout05ba, this);
        View findViewById = findViewById(R.id.trust_signal_card);
        C18450wi.A0B(findViewById);
        this.A03 = (InfoCard) findViewById;
        View findViewById2 = findViewById(R.id.trust_banner_title);
        C18450wi.A0B(findViewById2);
        this.A06 = (WaTextView) findViewById2;
        View findViewById3 = findViewById(R.id.fb_follower_count);
        C18450wi.A0B(findViewById3);
        this.A04 = (WaTextView) findViewById3;
        View findViewById4 = findViewById(R.id.ig_follower_count);
        C18450wi.A0B(findViewById4);
        this.A05 = (WaTextView) findViewById4;
        View findViewById5 = findViewById(R.id.ig_follower_container);
        C18450wi.A0B(findViewById5);
        this.A02 = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(R.id.fb_follower_container);
        C18450wi.A0B(findViewById6);
        this.A01 = (ViewGroup) findViewById6;
        C001100m r2 = (C001100m) C19980zJ.A01(context, C000900k.class);
        new C006602z(r2).A01(cls);
        TopBannerViewModel topBannerViewModel = (TopBannerViewModel) new C006602z(r2).A01(cls);
        this.A00 = topBannerViewModel;
        C13680ns.A1N(r2, topBannerViewModel.A03, this, 86);
        C13680ns.A17(findViewById(R.id.trust_banner_close_btn), this, 40);
    }

    public static final int A00(WaTextView waTextView, String str) {
        String obj;
        if (str == null || (obj = C008603x.A04(str).toString()) == null) {
            return 8;
        }
        TextUtils.isEmpty(obj);
        Context context = waTextView.getContext();
        String str2 = null;
        if (context != null) {
            str2 = C13680ns.A0d(context, str, C13680ns.A1b(), 0, R.string.str0171);
        }
        waTextView.setText(str2);
        return 0;
    }
}
