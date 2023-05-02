package com.obwhatsapp.qrcode.contactqr;

import X.AnonymousClass15X;
import X.AnonymousClass16S;
import X.C14650pX;
import X.C15900s5;
import X.C32241fu;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.obwhatsapp.R;

public class WebCodeDialogFragment extends Hilt_WebCodeDialogFragment {
    public C15900s5 A00;
    public AnonymousClass15X A01;
    public AnonymousClass16S A02;
    public C14650pX A03;

    public void A0k() {
        this.A03 = null;
        super.A0k();
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof C14650pX) {
            this.A03 = (C14650pX) context;
        }
    }

    public Dialog A1B(Bundle bundle) {
        C32241fu r3 = new C32241fu(A02());
        r3.A02(R.string.str132f);
        r3.A01(R.string.str132e);
        r3.setPositiveButton(R.string.str02ac, new IDxCListenerShape127S0100000_2_I0(this, 83));
        r3.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        return r3.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C14650pX r0 = this.A03;
        if (r0 != null) {
            r0.AVW();
        }
    }
}
