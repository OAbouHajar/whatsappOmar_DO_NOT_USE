package com.obwhatsapp.chatinfo.view.custom;

import X.AnonymousClass000;
import X.C106635Ep;
import X.C106695Ev;
import X.C13680ns;
import X.C13690nt;
import X.C15220qW;
import X.C17220uj;
import X.C18450wi;
import X.C19980zJ;
import X.C32521gW;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

public final class PhoneNumberSharedBottomSheet extends Hilt_PhoneNumberSharedBottomSheet {
    public C19980zJ A00;
    public C17220uj A01;
    public final C15220qW A02 = C32521gW.A01(new C106695Ev(this));
    public final C15220qW A03 = C32521gW.A01(new C106635Ep(this, "arg_my_phone_number"));
    public final boolean A04 = true;

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        super.A18(bundle, view);
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText((String) this.A03.getValue());
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            C13680ns.A1F(textView2, this, R.string.str12be);
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            boolean A1X = AnonymousClass000.A1X(this.A02.getValue());
            int i2 = R.string.str12bd;
            if (A1X) {
                i2 = R.string.str12bc;
            }
            C13680ns.A1F(textView3, this, i2);
        }
        TextView textView4 = this.A01;
        if (textView4 != null) {
            C13680ns.A1F(textView4, this, R.string.str12bb);
        }
        TextView textView5 = this.A03;
        if (textView5 != null) {
            C13680ns.A1F(textView5, this, R.string.str0e87);
        }
    }

    public void onClick(View view) {
        String str;
        C18450wi.A0H(view, 0);
        int id = view.getId();
        if (id == R.id.share_pn_close_button || id == R.id.share_pn_cta_positive) {
            A1D();
        } else if (id == R.id.share_pn_cta_negative) {
            C17220uj r1 = this.A01;
            if (r1 != null) {
                Uri A032 = r1.A03("626403979060997");
                C18450wi.A0B(A032);
                Intent A0B = C13690nt.A0B(A032);
                C19980zJ r12 = this.A00;
                if (r12 != null) {
                    r12.A06(A02(), A0B);
                    return;
                }
                str = "activityUtils";
            } else {
                str = "faqLinkFactory";
            }
            throw C18450wi.A03(str);
        }
    }
}
