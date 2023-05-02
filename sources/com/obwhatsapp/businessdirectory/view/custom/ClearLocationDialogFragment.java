package com.obwhatsapp.businessdirectory.view.custom;

import X.AnonymousClass1PX;
import X.AnonymousClass3K2;
import X.C004601z;
import X.C13680ns;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class ClearLocationDialogFragment extends Hilt_ClearLocationDialogFragment {
    public AnonymousClass1PX A00;

    public Dialog A1B(Bundle bundle) {
        View inflate = View.inflate(A02(), R.layout.layout0106, (ViewGroup) null);
        View A0E = C004601z.A0E(inflate, R.id.clear_btn);
        View A0E2 = C004601z.A0E(inflate, R.id.cancel_btn);
        C13680ns.A18(A0E, this, 1);
        C13680ns.A18(A0E2, this, 2);
        C32241fu A0R = AnonymousClass3K2.A0R(this);
        A0R.setView(inflate);
        A0R.A07(true);
        return A0R.create();
    }
}
