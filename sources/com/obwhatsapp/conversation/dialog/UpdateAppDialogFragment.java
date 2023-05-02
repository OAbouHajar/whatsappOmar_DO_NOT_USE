package com.obwhatsapp.conversation.dialog;

import X.C001000l;
import X.C005702l;
import X.C18890xQ;
import X.C19980zJ;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.obwhatsapp.R;

public class UpdateAppDialogFragment extends Hilt_UpdateAppDialogFragment {
    public C19980zJ A00;
    public C18890xQ A01;
    public final int A02 = R.string.str0ac3;

    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        IDxCListenerShape23S0000000_2_I1 iDxCListenerShape23S0000000_2_I1 = new IDxCListenerShape23S0000000_2_I1(11);
        IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(this, 48);
        C32241fu A002 = C32241fu.A00(A0D);
        A002.A01(this.A02);
        A002.A07(true);
        A002.setPositiveButton(R.string.str18b2, iDxCListenerShape128S0100000_2_I1);
        A002.setNegativeButton(R.string.str0394, iDxCListenerShape23S0000000_2_I1);
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
