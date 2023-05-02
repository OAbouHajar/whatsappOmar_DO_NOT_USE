package com.obwhatsapp;

import X.C55472jf;
import android.view.View;

public class ezz implements View.OnClickListener {
    public final /* synthetic */ C55472jf A00;

    public ezz(C55472jf r1) {
        this.A00 = r1;
    }

    public void onClick(View view) {
        C55472jf r1 = this.A00;
        if (!r1.A0H.A00()) {
            RequestPermissionActivity.A0D(r1.A02, R.string.str11c0, R.string.str11bf);
        } else {
            r1.A03();
        }
    }
}
