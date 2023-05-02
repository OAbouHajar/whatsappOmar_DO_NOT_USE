package com.facebook.redex;

import X.C16830ti;
import android.content.DialogInterface;
import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;

public class IDxCListenerShape1S1200000_2_I0 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxCListenerShape1S1200000_2_I0(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C16830ti r2, String str, int i2) {
        this.A03 = i2;
        this.A00 = p2mLiteOrderDetailsActivity;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3 = this.A03;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A00;
        String str = this.A02;
        C16830ti r0 = (C16830ti) this.A01;
        if (i3 != 0) {
            P2mLiteOrderDetailsActivity.A0u(p2mLiteOrderDetailsActivity, r0, str);
        } else {
            P2mLiteOrderDetailsActivity.A0r(p2mLiteOrderDetailsActivity, r0, str);
        }
    }
}
