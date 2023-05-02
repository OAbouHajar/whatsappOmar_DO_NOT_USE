package com.obwhatsapp.phonematching;

import X.AnonymousClass02C;
import X.AnonymousClass050;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.obwhatsapp.R;

public class ConnectionProgressDialogFragment extends Hilt_ConnectionProgressDialogFragment {
    public Dialog A1B(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(A0C());
        progressDialog.setMessage(A0J(R.string.str1376));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public void A1G(AnonymousClass02C r2, String str) {
        AnonymousClass050 r0 = new AnonymousClass050(r2);
        r0.A0C(this, str);
        r0.A02();
    }
}
