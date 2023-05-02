package com.obwhatsapp.calling.callhistory.view;

import X.AnonymousClass1D0;
import X.AnonymousClass1SP;
import X.C13690nt;
import X.C14760pi;
import X.C14870pt;
import X.C16320sq;
import X.C16440t3;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.obwhatsapp.R;

public class CallsHistoryClearCallLogDialogFragment extends Hilt_CallsHistoryClearCallLogDialogFragment {
    public C14870pt A00;
    public C16440t3 A01;
    public AnonymousClass1D0 A02;
    public C14760pi A03;
    public C16320sq A04;
    public AnonymousClass1SP A05;

    public Dialog A1B(Bundle bundle) {
        IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(this, 28);
        C32241fu A002 = C32241fu.A00(A0C());
        A002.A01(R.string.str0468);
        A002.setPositiveButton(R.string.str0e87, iDxCListenerShape128S0100000_2_I1);
        C13690nt.A1E(A002);
        return A002.create();
    }
}
