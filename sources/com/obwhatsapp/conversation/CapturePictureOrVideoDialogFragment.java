package com.obwhatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass0PG;
import X.AnonymousClass1yZ;
import X.C005702l;
import X.C32241fu;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.obwhatsapp.R;

public final class CapturePictureOrVideoDialogFragment extends Hilt_CapturePictureOrVideoDialogFragment {
    public static final int[] A01 = {R.string.str1782, R.string.str1361};
    public AnonymousClass1yZ A00;

    public void A16(Context context) {
        super.A16(context);
        try {
            this.A00 = (AnonymousClass1yZ) context;
        } catch (ClassCastException unused) {
            StringBuilder A0o = AnonymousClass000.A0o();
            AnonymousClass000.A1I(context, A0o);
            throw new ClassCastException(AnonymousClass000.A0h(" must implement CapturePictureOrVideoDialogClickListener", A0o));
        }
    }

    public Dialog A1B(Bundle bundle) {
        C32241fu A002 = C32241fu.A00(A02());
        String[] A0U = this.A02.A0U(A01);
        IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(this, 41);
        AnonymousClass0PG r0 = A002.A01;
        r0.A0M = A0U;
        r0.A05 = iDxCListenerShape128S0100000_2_I1;
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
