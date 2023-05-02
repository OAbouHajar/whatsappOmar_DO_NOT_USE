package com.obwhatsapp.conversation.dialog;

import X.C001000l;
import X.C005702l;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.obwhatsapp.R;

public class OkDialogFragment extends Hilt_OkDialogFragment {
    public final int A00 = R.string.str0ac2;

    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        IDxCListenerShape23S0000000_2_I1 iDxCListenerShape23S0000000_2_I1 = new IDxCListenerShape23S0000000_2_I1(10);
        C32241fu A002 = C32241fu.A00(A0D);
        A002.A01(this.A00);
        A002.A07(true);
        A002.setPositiveButton(R.string.str0e87, iDxCListenerShape23S0000000_2_I1);
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
