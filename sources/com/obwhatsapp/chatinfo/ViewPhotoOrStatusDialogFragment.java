package com.obwhatsapp.chatinfo;

import X.AnonymousClass000;
import X.AnonymousClass0PG;
import X.AnonymousClass2DN;
import X.C32241fu;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape126S0100000_1_I1;
import com.obwhatsapp.R;

public class ViewPhotoOrStatusDialogFragment extends Hilt_ViewPhotoOrStatusDialogFragment {
    public AnonymousClass2DN A00;

    public void A0k() {
        super.A0k();
        this.A00 = null;
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof AnonymousClass2DN) {
            this.A00 = (AnonymousClass2DN) context;
            return;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1I(context, A0o);
        throw new ClassCastException(AnonymousClass000.A0h(" must implement ViewPhotoOrStatusDialogClickListener", A0o));
    }

    public Dialog A1B(Bundle bundle) {
        String[] stringArray = A03().getStringArray(R.array.array001a);
        C32241fu A002 = C32241fu.A00(A02());
        IDxCListenerShape126S0100000_1_I1 iDxCListenerShape126S0100000_1_I1 = new IDxCListenerShape126S0100000_1_I1(this, 0);
        AnonymousClass0PG r0 = A002.A01;
        r0.A0M = stringArray;
        r0.A05 = iDxCListenerShape126S0100000_1_I1;
        return A002.create();
    }
}
