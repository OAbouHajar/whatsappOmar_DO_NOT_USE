package com.obwhatsapp.growthlock;

import X.AnonymousClass1BZ;
import X.C001000l;
import X.C005702l;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;

public class InviteLinkUnavailableDialogFragment extends Hilt_InviteLinkUnavailableDialogFragment {
    public AnonymousClass1BZ A00;

    public static InviteLinkUnavailableDialogFragment A01(boolean z2, boolean z3) {
        Bundle A0D = C13690nt.A0D();
        A0D.putBoolean("finishCurrentActivity", z2);
        A0D.putBoolean("isGroupStillLocked", z3);
        InviteLinkUnavailableDialogFragment inviteLinkUnavailableDialogFragment = new InviteLinkUnavailableDialogFragment();
        inviteLinkUnavailableDialogFragment.A0T(A0D);
        return inviteLinkUnavailableDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        C001000l A0C = A0C();
        boolean z2 = A04().getBoolean("isGroupStillLocked");
        IDxCListenerShape29S0200000_2_I1 iDxCListenerShape29S0200000_2_I1 = new IDxCListenerShape29S0200000_2_I1(A0C, 23, this);
        TextView textView = (TextView) A05().inflate(R.layout.layout0207, (ViewGroup) null);
        int i2 = R.string.str0bcf;
        if (z2) {
            i2 = R.string.str0bcd;
        }
        textView.setText(i2);
        C32241fu A002 = C32241fu.A00(A0C);
        A002.A01.A0B = textView;
        int i3 = R.string.str0bce;
        if (z2) {
            i3 = R.string.str0bcc;
        }
        A002.A01(i3);
        A002.A07(true);
        A002.setNegativeButton(R.string.str1cf6, iDxCListenerShape29S0200000_2_I1);
        A002.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C001000l A0C;
        super.onDismiss(dialogInterface);
        if (A04().getBoolean("finishCurrentActivity") && (A0C = A0C()) != null) {
            A0C.finish();
        }
    }
}
