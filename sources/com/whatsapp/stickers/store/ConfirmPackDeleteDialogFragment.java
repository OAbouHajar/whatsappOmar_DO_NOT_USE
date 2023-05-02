package com.whatsapp.stickers.store;

import X.AnonymousClass00B;
import X.AnonymousClass1CX;
import X.AnonymousClass3K2;
import X.C001000l;
import X.C005702l;
import X.C13690nt;
import X.C32241fu;
import X.C37771pi;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape2S1100000_2_I1;
import com.obwhatsapp.R;

public class ConfirmPackDeleteDialogFragment extends Hilt_ConfirmPackDeleteDialogFragment {
    public AnonymousClass1CX A00;

    public static ConfirmPackDeleteDialogFragment A01(C37771pi r4) {
        ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = new ConfirmPackDeleteDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("pack_id", r4.A0F);
        A0D.putString("pack_name", r4.A0H);
        confirmPackDeleteDialogFragment.A0T(A0D);
        return confirmPackDeleteDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        C001000l A0C = A0C();
        String string = A04().getString("pack_id");
        AnonymousClass00B.A06(string);
        String string2 = A04().getString("pack_name");
        AnonymousClass00B.A06(string2);
        IDxCListenerShape2S1100000_2_I1 iDxCListenerShape2S1100000_2_I1 = new IDxCListenerShape2S1100000_2_I1(4, string, this);
        C32241fu A002 = C32241fu.A00(A0C);
        A002.A06(C13690nt.A0c(this, string2, new Object[1], 0, R.string.str16aa));
        C005702l A0O = AnonymousClass3K2.A0O(iDxCListenerShape2S1100000_2_I1, A002, R.string.str1c4c);
        A0O.setCanceledOnTouchOutside(true);
        return A0O;
    }
}
