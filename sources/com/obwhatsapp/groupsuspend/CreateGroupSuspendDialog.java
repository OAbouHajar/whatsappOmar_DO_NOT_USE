package com.obwhatsapp.groupsuspend;

import X.AnonymousClass15W;
import X.AnonymousClass1BZ;
import X.AnonymousClass1KO;
import X.AnonymousClass3MF;
import X.C001000l;
import X.C13690nt;
import X.C16050sL;
import X.C17110uY;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape22S0300000_2_I1;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.obwhatsapp.R;

public class CreateGroupSuspendDialog extends Hilt_CreateGroupSuspendDialog {
    public AnonymousClass1KO A00;
    public AnonymousClass1BZ A01;
    public AnonymousClass15W A02;
    public C17110uY A03;

    public static CreateGroupSuspendDialog A01(C16050sL r2, boolean z2, boolean z3) {
        Bundle A0D = C13690nt.A0D();
        A0D.putBoolean("isSuspendedV1Enabled", z2);
        A0D.putBoolean("hasMe", z3);
        A0D.putParcelable("suspendedEntityId", r2);
        CreateGroupSuspendDialog createGroupSuspendDialog = new CreateGroupSuspendDialog();
        createGroupSuspendDialog.A0T(A0D);
        return createGroupSuspendDialog;
    }

    public void A0q() {
        super.A0q();
        TextView textView = (TextView) A1A().findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(new AnonymousClass3MF());
        }
    }

    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        boolean z2 = A04().getBoolean("isSuspendedV1Enabled");
        boolean z3 = A04().getBoolean("hasMe");
        Parcelable parcelable = A04().getParcelable("suspendedEntityId");
        C32241fu A002 = C32241fu.A00(A0D);
        IDxCListenerShape22S0300000_2_I1 iDxCListenerShape22S0300000_2_I1 = new IDxCListenerShape22S0300000_2_I1(A0D, this, parcelable, 1);
        IDxCListenerShape29S0200000_2_I1 iDxCListenerShape29S0200000_2_I1 = new IDxCListenerShape29S0200000_2_I1(A0D, 22, this);
        if (!z2) {
            A002.A01(R.string.str0b17);
            A002.setNegativeButton(R.string.str13cb, iDxCListenerShape22S0300000_2_I1);
            A002.A0B(iDxCListenerShape29S0200000_2_I1, R.string.str1cf6);
        } else if (z3) {
            A002.A06(this.A03.A06(new RunnableRunnableShape14S0200000_I1_2(this, 27, A0D), C13690nt.A0c(this, "learn-more", new Object[1], 0, R.string.str0b18), "learn-more"));
            A002.setNegativeButton(R.string.str13cb, iDxCListenerShape22S0300000_2_I1);
        } else {
            A002.A01(R.string.str171b);
            A002.setNegativeButton(R.string.str1cf6, iDxCListenerShape29S0200000_2_I1);
        }
        A002.setPositiveButton(R.string.str0b16, (DialogInterface.OnClickListener) null);
        return A002.create();
    }
}
