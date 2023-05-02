package com.facebook.redex;

import X.AnonymousClass000;
import X.C005702l;
import X.C1041354b;
import X.C30301c6;
import X.C34331k5;
import X.C67493bh;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape46S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.commerce.ui.view.ExtensionsBottomsheetBaseContainer;

public class IDxSListenerShape247S0100000_2_I1 implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public IDxSListenerShape247S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                C34331k5.A01(((C005702l) dialogInterface).A00.A0G, this.A00, 23);
                return;
            case 1:
                Object obj = this.A00;
                BottomSheetBehavior A002 = BottomSheetBehavior.A00(((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet));
                A002.A0M(3);
                A002.A0E = new IDxSCallbackShape46S0100000_2_I1(obj, 2);
                return;
            default:
                ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer = (ExtensionsBottomsheetBaseContainer) this.A00;
                if (dialogInterface != null) {
                    View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                    C30301c6 r3 = new C30301c6();
                    BottomSheetBehavior A003 = BottomSheetBehavior.A00(findViewById);
                    A003.A0N = false;
                    A003.A0L(-1);
                    A003.A0J = true;
                    A003.A0E = new C67493bh(A003, extensionsBottomsheetBaseContainer, r3, new C1041354b());
                    A003.A0M(3);
                    return;
                }
                throw AnonymousClass000.A0W("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        }
    }
}
