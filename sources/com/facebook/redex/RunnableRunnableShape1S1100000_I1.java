package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1KQ;
import X.AnonymousClass1WD;
import X.AnonymousClass1Y4;
import X.AnonymousClass1ZW;
import X.AnonymousClass2Rv;
import X.AnonymousClass32P;
import X.AnonymousClass33I;
import X.AnonymousClass33J;
import X.AnonymousClass4GS;
import X.AnonymousClass4TD;
import X.AnonymousClass4WY;
import X.AnonymousClass5PW;
import X.C005702l;
import X.C100334vT;
import X.C13680ns;
import X.C13690nt;
import X.C18150wE;
import X.C32241fu;
import X.C57262qa;
import X.C62893Fi;
import X.C76573uH;
import X.C76593uJ;
import X.C76603uK;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.obwhatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.obwhatsapp.deeplink.DeepLinkActivity;
import com.obwhatsapp.inappsupport.ui.SupportTopicsActivity;
import com.obwhatsapp.support.faq.FaqItemActivity;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;
import com.obwhatsapp.videoplayback.ExoPlayerErrorFrame;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class RunnableRunnableShape1S1100000_I1 implements Runnable {
    public Object A00;
    public String A01;
    public final int A02;

    public RunnableRunnableShape1S1100000_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void run() {
        ArrayList parcelableArrayListExtra;
        switch (this.A02) {
            case 0:
                ((AnonymousClass4TD) this.A00).A01.AMl(this.A01);
                return;
            case 1:
                ((AnonymousClass4GS) this.A00).A01.AZZ(this.A01);
                return;
            case 2:
                ComplianceInfoViewModel complianceInfoViewModel = (ComplianceInfoViewModel) this.A00;
                String str = this.A01;
                complianceInfoViewModel.A04.A0M.add(new C100334vT(complianceInfoViewModel, str));
                return;
            case 3:
                String str2 = this.A01;
                C18150wE r3 = ((C57262qa) this.A00).A08;
                if (r3.A03 instanceof AnonymousClass33I) {
                    r3.A00();
                }
                AnonymousClass33J A7B = r3.A07.A7B(new C62893Fi(r3, str2), r3.A06.A00, str2);
                A7B.A04();
                r3.A03 = A7B;
                return;
            case 4:
                synchronized (((LinkedDevicesEnterCodeActivity) this.A00).A01) {
                    Log.e("CompanionRegWithLinkCodeManager/handleInputLinkCode no cache for companion hello");
                }
                return;
            case 5:
                AnonymousClass5PW r32 = (AnonymousClass5PW) this.A00;
                String str3 = this.A01;
                Uri parse = AnonymousClass1ZW.A0E(str3) ? null : Uri.parse(str3);
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) r32;
                deepLinkActivity.A00.removeMessages(1);
                deepLinkActivity.Ac1();
                if (parse == null) {
                    C32241fu A002 = C32241fu.A00(deepLinkActivity);
                    A002.A01(R.string.str0919);
                    C13690nt.A1H(A002, deepLinkActivity, 56, R.string.str0394);
                    C13680ns.A1H(A002, deepLinkActivity, 55, R.string.str18ac);
                    C005702l create = A002.create();
                    create.setOnDismissListener(new IDxDListenerShape159S0100000_2_I1(deepLinkActivity, 3));
                    create.show();
                    return;
                }
                Intent A0B = C13690nt.A0B(parse);
                A0B.putExtra("com.android.browser.application_id", deepLinkActivity.getPackageName());
                A0B.putExtra("create_new_tab", true);
                deepLinkActivity.A00.A06(deepLinkActivity, A0B);
                deepLinkActivity.finish();
                deepLinkActivity.overridePendingTransition(0, 0);
                return;
            case 6:
                String str4 = this.A01;
                C32241fu A003 = C32241fu.A00(((AnonymousClass32P) this.A00).A00);
                A003.A06(str4);
                C13690nt.A1F(A003);
                A003.A00();
                return;
            case 7:
                ((AnonymousClass2Rv) this.A00).A00.A04.A0B(new C76573uH(this.A01));
                return;
            case 8:
                ((AnonymousClass1WD) this.A00).A02(new C76593uJ(this.A01));
                return;
            case 9:
                ((AnonymousClass1WD) this.A00).A02(new C76603uK(this.A01));
                return;
            case 10:
                FaqItemActivity faqItemActivity = (FaqItemActivity) this.A00;
                String str5 = this.A01;
                if (!AnonymousClass1Y4.A00(str5) || (parcelableArrayListExtra = faqItemActivity.getIntent().getParcelableArrayListExtra("payments_support_topics")) == null) {
                    AnonymousClass1KQ r33 = faqItemActivity.A03;
                    if (str5 == null) {
                        str5 = "FaqItemActivity";
                    }
                    r33.A00(faqItemActivity.getIntent().getBundleExtra("describe_problem_fields"), faqItemActivity, str5, true);
                    return;
                }
                faqItemActivity.startActivity(SupportTopicsActivity.A02(faqItemActivity, faqItemActivity.getIntent().getBundleExtra("describe_problem_fields"), parcelableArrayListExtra));
                return;
            default:
                AnonymousClass4WY r0 = (AnonymousClass4WY) this.A00;
                ExoPlayerErrorFrame exoPlayerErrorFrame = r0.A03;
                exoPlayerErrorFrame.setLoadingViewVisibility(8);
                ExoPlaybackControlView exoPlaybackControlView = r0.A02;
                if (exoPlaybackControlView != null) {
                    exoPlaybackControlView.setPlayControlVisibility(8);
                }
                String str6 = this.A01;
                if (str6 == null) {
                    str6 = exoPlayerErrorFrame.getContext().getString(R.string.str1863);
                }
                if (exoPlayerErrorFrame.A02 == null) {
                    FrameLayout frameLayout = (FrameLayout) C13680ns.A0G(exoPlayerErrorFrame).inflate(R.layout.layout0606, (ViewGroup) null);
                    exoPlayerErrorFrame.A02 = frameLayout;
                    exoPlayerErrorFrame.A06.addView(frameLayout);
                    exoPlayerErrorFrame.A03 = C13680ns.A0M(exoPlayerErrorFrame, R.id.error_text);
                    View findViewById = exoPlayerErrorFrame.findViewById(R.id.retry_button);
                    exoPlayerErrorFrame.A01 = findViewById;
                    findViewById.setOnClickListener(exoPlayerErrorFrame.A00);
                }
                TextView textView = exoPlayerErrorFrame.A03;
                AnonymousClass00B.A04(textView);
                textView.setText(str6);
                FrameLayout frameLayout2 = exoPlayerErrorFrame.A02;
                AnonymousClass00B.A04(frameLayout2);
                frameLayout2.setVisibility(0);
                return;
        }
    }
}
