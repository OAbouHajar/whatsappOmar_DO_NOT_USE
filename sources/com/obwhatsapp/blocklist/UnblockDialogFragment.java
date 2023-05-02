package com.obwhatsapp.blocklist;

import X.AnonymousClass00B;
import X.C001000l;
import X.C005702l;
import X.C108605Oq;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.facebook.redex.IDxKListenerShape224S0100000_2_I1;
import com.obwhatsapp.R;

public class UnblockDialogFragment extends Hilt_UnblockDialogFragment {
    public C108605Oq A00;
    public boolean A01;

    public static UnblockDialogFragment A01(C108605Oq r3, String str, int i2, boolean z2) {
        UnblockDialogFragment unblockDialogFragment = new UnblockDialogFragment();
        unblockDialogFragment.A00 = r3;
        unblockDialogFragment.A01 = z2;
        Bundle A0D = C13690nt.A0D();
        A0D.putString("message", str);
        A0D.putInt("title", i2);
        unblockDialogFragment.A0T(A0D);
        return unblockDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        C001000l A0C = A0C();
        String string = A04().getString("message");
        AnonymousClass00B.A06(string);
        int i2 = A04().getInt("title");
        IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = this.A00 == null ? null : new IDxCListenerShape128S0100000_2_I1(this, 25);
        IDxCListenerShape29S0200000_2_I1 iDxCListenerShape29S0200000_2_I1 = new IDxCListenerShape29S0200000_2_I1(A0C, 1, this);
        C32241fu A002 = C32241fu.A00(A0C);
        A002.A06(string);
        if (i2 != 0) {
            A002.A02(i2);
        }
        A002.setPositiveButton(R.string.str1872, iDxCListenerShape128S0100000_2_I1);
        A002.setNegativeButton(R.string.str0394, iDxCListenerShape29S0200000_2_I1);
        if (this.A01) {
            A002.A01.A08 = new IDxKListenerShape224S0100000_2_I1(A0C, 0);
        }
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(!this.A01);
        return create;
    }
}
