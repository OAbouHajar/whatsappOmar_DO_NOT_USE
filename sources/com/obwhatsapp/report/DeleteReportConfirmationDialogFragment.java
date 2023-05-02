package com.obwhatsapp.report;

import X.AnonymousClass3K3;
import X.AnonymousClass5QE;
import X.C13680ns;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import com.obwhatsapp.R;

public class DeleteReportConfirmationDialogFragment extends Hilt_DeleteReportConfirmationDialogFragment {
    public AnonymousClass5QE A00;

    public Dialog A1B(Bundle bundle) {
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        A0c.A06(Html.fromHtml(A0J(R.string.str093c)));
        C13690nt.A1E(A0c);
        C13680ns.A1H(A0c, this, 96, R.string.str1c4c);
        return A0c.create();
    }
}
