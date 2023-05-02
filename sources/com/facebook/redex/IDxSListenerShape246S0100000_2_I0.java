package com.facebook.redex;

import X.AnonymousClass0LL;
import X.AnonymousClass2Ra;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape46S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

public class IDxSListenerShape246S0100000_2_I0 implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public IDxSListenerShape246S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) this.A00;
                verifyTwoFactorAuthCodeDialogFragment.A04.A0K(new RunnableRunnableShape2S0100000_I0_1(verifyTwoFactorAuthCodeDialogFragment, 38));
                return;
            case 1:
                BottomSheetBehavior A002 = BottomSheetBehavior.A00(AnonymousClass0LL.A00((Dialog) dialogInterface, R.id.design_bottom_sheet));
                A002.A0M(3);
                A002.A0N = true;
                return;
            case 2:
                ((AnonymousClass2Ra) this.A00).A0Q.A03();
                return;
            case 3:
                Object obj = this.A00;
                View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    BottomSheetBehavior A003 = BottomSheetBehavior.A00(findViewById);
                    A003.A0M(3);
                    A003.A0E = new IDxSCallbackShape46S0100000_2_I1(obj, 4);
                    return;
                }
                return;
            default:
                VoipCallControlBottomSheetV2.A03(dialogInterface, (VoipCallControlBottomSheetV2) this.A00);
                return;
        }
    }
}
