package com.obwhatsapp.chatinfo.view.custom;

import X.C13690nt;
import X.C16040sK;
import X.C17220uj;
import X.C19980zJ;
import X.C24561Gk;
import X.C28881Zb;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

public class PhoneNumberSharedInCAGBottomSheet extends Hilt_PhoneNumberSharedInCAGBottomSheet {
    public C19980zJ A00;
    public C16040sK A01;
    public C17220uj A02;

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        C16040sK r0 = this.A01;
        r0.A0B();
        C28881Zb r02 = r0.A01;
        String A012 = r02 != null ? C24561Gk.A01(r02) : null;
        TextView textView = this.A02;
        if (!(A012 == null || textView == null)) {
            textView.setText(A012);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setText(R.string.str12ba);
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            textView3.setText(R.string.str12b9);
        }
        TextView textView4 = this.A01;
        if (textView4 != null) {
            textView4.setText(R.string.str12b3);
        }
        TextView textView5 = this.A03;
        if (textView5 != null) {
            textView5.setText(R.string.str0e87);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (!(id == R.id.share_pn_close_button || id == R.id.share_pn_cta_positive)) {
            if (id == R.id.share_pn_cta_negative) {
                this.A00.A06(A0D(), C13690nt.A0B(this.A02.A03("831150864932965")));
            } else {
                return;
            }
        }
        A1D();
    }
}
