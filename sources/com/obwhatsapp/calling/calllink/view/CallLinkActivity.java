package com.obwhatsapp.calling.calllink.view;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass2AN;
import X.C006602z;
import X.C016407u;
import X.C101314x5;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C17650vQ;
import X.C18010w0;
import X.C18380wb;
import X.C204310c;
import X.C204710g;
import X.C434920f;
import X.C45822Bg;
import X.C49132Rg;
import X.C49282Sg;
import X.C52142dD;
import X.C70483h0;
import X.C70493h1;
import X.C70503h2;
import X.C70513h3;
import X.C93494jI;
import X.C93504jJ;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.calling.calllink.viewmodel.CallLinkViewModel;

public class CallLinkActivity extends C45822Bg implements C49282Sg {
    public ViewGroup A00;
    public C70483h0 A01;
    public C70513h3 A02;
    public C70503h2 A03;
    public C70493h1 A04;
    public WaImageView A05;
    public CallLinkViewModel A06;
    public C204310c A07;
    public C18380wb A08;
    public C18010w0 A09;
    public AnonymousClass2AN A0A;
    public C17650vQ A0B;
    public boolean A0C;

    public CallLinkActivity() {
        this(0);
    }

    public CallLinkActivity(int i2) {
        this.A0C = false;
        C13680ns.A1G(this, 32);
    }

    public static /* synthetic */ void A02(CallLinkActivity callLinkActivity) {
        if (Build.VERSION.SDK_INT >= 21) {
            int visibility = callLinkActivity.A0A.getVisibility();
            int i2 = R.color.color064b;
            if (visibility == 0) {
                i2 = R.color.color00dd;
            }
            C434920f.A03(callLinkActivity, i2);
            C434920f.A08(callLinkActivity.getWindow(), false);
        }
    }

    public void A1q() {
        if (!this.A0C) {
            this.A0C = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A07 = (C204310c) r1.A3O.get();
            this.A0B = C16150sX.A0J(r1);
            this.A08 = C16150sX.A0H(r1);
            this.A09 = C16150sX.A0I(r1);
        }
    }

    public final void A3A(C93504jJ r5) {
        boolean z2 = false;
        AnonymousClass00B.A0B("Share text cannot be null", AnonymousClass000.A1V(this.A03.A02));
        if (this.A03.A01 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Email subject cannot be null", z2);
        if (Build.VERSION.SDK_INT < 22) {
            this.A09.A01.A06(C52142dD.A01((String) null, 2, 1, r5.A06));
        }
        boolean z3 = r5.A06;
        C70503h2 r0 = this.A03;
        startActivity(C52142dD.A00(this, r0.A02, r0.A01, 1, z3));
    }

    public void AXH(int i2, int i3) {
        if (i2 == 1) {
            CallLinkViewModel callLinkViewModel = this.A06;
            if (i3 != (!callLinkViewModel.A06())) {
                callLinkViewModel.A05(AnonymousClass000.A1P(i3));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str060a);
        this.A00 = (ViewGroup) AnonymousClass00T.A05(this, R.id.link_btn);
        this.A05 = (WaImageView) AnonymousClass00T.A05(this, R.id.link_icon);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0119);
        this.A00.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A06 = (CallLinkViewModel) new C006602z(this).A01(CallLinkViewModel.class);
        C70513h3 r1 = new C70513h3();
        this.A02 = r1;
        r1.A00 = A35();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen011c);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A02.A00.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, dimensionPixelSize2);
        this.A02.A00.setLayoutParams(layoutParams);
        this.A02 = this.A02;
        A39();
        this.A04 = A38();
        this.A01 = A36();
        this.A03 = A37();
        C13680ns.A1M(this, this.A06.A02.A03("saved_state_link"), 18);
        C13680ns.A1L(this, this.A06.A00, 47);
        CallLinkViewModel callLinkViewModel = this.A06;
        C016407u r4 = callLinkViewModel.A02;
        boolean A062 = callLinkViewModel.A06();
        int i2 = R.drawable.ic_btn_call_audio;
        int i3 = R.string.str1de2;
        if (A062) {
            i2 = R.drawable.ic_btn_call_video;
            i3 = R.string.str1de0;
        }
        C13680ns.A1L(this, r4.A02(new C93494jI(i2, i3, callLinkViewModel.A06() ^ true ? 1 : 0), "saved_state_link_type"), 45);
        C13680ns.A1L(this, this.A06.A01, 46);
        AnonymousClass2AN r0 = new AnonymousClass2AN(this);
        r0.A0A = null;
        this.A0A = r0;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.call_notification_holder);
        if (viewGroup != null) {
            viewGroup.addView(this.A0A);
        }
        this.A0A.A01 = new C101314x5(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01.setOnClickListener((View.OnClickListener) null);
        this.A01.setOnLongClickListener((View.OnLongClickListener) null);
    }

    public void onResume() {
        super.onResume();
        if (this.A0B.A00() || this.A0B.A01()) {
            this.A08.A00(new C204710g("show_voip_activity"));
        }
    }
}
