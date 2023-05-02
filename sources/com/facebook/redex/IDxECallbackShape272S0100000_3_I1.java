package com.facebook.redex;

import X.AnonymousClass5RL;
import X.AnonymousClass698;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

public class IDxECallbackShape272S0100000_3_I1 implements AnonymousClass5RL {
    public Object A00;
    public final int A01;

    public IDxECallbackShape272S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AOm(String str) {
        AnonymousClass698 r0;
        int i2 = this.A01;
        int length = str.length();
        if (i2 != 0) {
            if (length != 6 || (r0 = ((BrazilAccountRecoveryPinActivity) this.A00).A03) == null) {
                return;
            }
        } else if (length == 6) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A00;
            if (pinBottomSheetDialogFragment.A0C != null && pinBottomSheetDialogFragment.A00 <= pinBottomSheetDialogFragment.A08.A00()) {
                r0 = pinBottomSheetDialogFragment.A0C;
            } else {
                return;
            }
        } else {
            return;
        }
        r0.AOu(str);
    }

    public void AU2(String str) {
        AnonymousClass698 r0;
        int i2 = this.A01;
        int length = str.length();
        if (i2 != 0) {
            if (length != 6 || (r0 = ((BrazilAccountRecoveryPinActivity) this.A00).A03) == null) {
                return;
            }
        } else if (length == 6) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A00;
            if (pinBottomSheetDialogFragment.A0C != null && pinBottomSheetDialogFragment.A00 <= pinBottomSheetDialogFragment.A08.A00()) {
                r0 = pinBottomSheetDialogFragment.A0C;
            } else {
                return;
            }
        } else {
            return;
        }
        r0.AOu(str);
    }
}
