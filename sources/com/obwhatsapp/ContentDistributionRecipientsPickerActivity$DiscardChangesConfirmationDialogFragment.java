package com.obwhatsapp;

import X.AnonymousClass3K3;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;

public class ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment extends Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment {
    public Dialog A1B(Bundle bundle) {
        IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(this, 0);
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        A0c.A01(R.string.str06fe);
        A0c.setPositiveButton(R.string.str06ff, iDxCListenerShape128S0100000_2_I1);
        A0c.setNegativeButton(R.string.str0395, (DialogInterface.OnClickListener) null);
        return A0c.create();
    }
}
