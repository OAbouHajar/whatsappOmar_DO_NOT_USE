package com.obwhatsapp.report;

import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape22S0000000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.base.WaDialogFragment;

public class DownloadReportFailedDialogFragment extends WaDialogFragment {
    public Dialog A1B(Bundle bundle) {
        C32241fu r3 = new C32241fu(A0C());
        r3.A02(R.string.str073d);
        r3.A01(R.string.str093d);
        r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape22S0000000_2_I0(6));
        return r3.create();
    }
}
