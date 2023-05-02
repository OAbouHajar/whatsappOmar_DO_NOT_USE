package com.obwhatsapp.communitysuspend;

import X.AnonymousClass1BZ;
import X.C001000l;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;
import com.obwhatsapp.R;

public class CommunitySuspendDialogFragment extends Hilt_CommunitySuspendDialogFragment {
    public AnonymousClass1BZ A00;

    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        C32241fu r2 = new C32241fu(A0D);
        IDxCListenerShape28S0200000_2_I0 iDxCListenerShape28S0200000_2_I0 = new IDxCListenerShape28S0200000_2_I0(this, 4, A0D);
        r2.A01(R.string.str04ec);
        r2.setNegativeButton(R.string.str1cf6, iDxCListenerShape28S0200000_2_I0);
        r2.setPositiveButton(R.string.str0b16, (DialogInterface.OnClickListener) null);
        return r2.create();
    }
}
