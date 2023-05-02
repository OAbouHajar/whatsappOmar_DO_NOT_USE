package com.obwhatsapp.wabloks.ui.PrivacyNotice;

import X.AnonymousClass01D;
import X.C13680ns;
import X.C20180zd;
import X.C52372dh;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

public class PrivacyNoticeFragment extends Hilt_PrivacyNoticeFragment {
    public View A00;
    public FrameLayout A01;
    public C52372dh A02;
    public AnonymousClass01D A03;
    public AnonymousClass01D A04;

    public PrivacyNoticeFragment() {
        A1F("com.bloks.www.minishops.whatsapp.privacy_notice");
        A1E((String) null);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0294);
    }

    public void A13() {
        super.A13();
        ((PrivacyNoticeFragmentViewModel) this.A05).A00.A04(A0H());
        this.A00 = null;
    }

    public void A16(Context context) {
        super.A16(context);
        C52372dh A012 = ((C20180zd) this.A04.get()).A01(context);
        C52372dh r0 = this.A02;
        if (!(r0 == null || r0 == A012)) {
            r0.A03(this);
        }
        this.A02 = A012;
    }

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        this.A00 = view.findViewById(R.id.bloks_dialogfragment_progressbar);
        this.A01 = (FrameLayout) view.findViewById(R.id.bloks_dialogfragment);
    }

    public int A19() {
        return R.id.bloks_container;
    }

    public Class A1A() {
        return PrivacyNoticeFragmentViewModel.class;
    }
}
