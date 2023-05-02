package com.facebook.redex;

import X.AnonymousClass5RL;
import X.C13700nu;
import android.os.Handler;
import com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import com.obwhatsapp.registration.VerifyTwoFactorAuth;

public class IDxECallbackShape271S0100000_2_I0 implements AnonymousClass5RL {
    public Object A00;
    public final int A01;

    public IDxECallbackShape271S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AOm(String str) {
        switch (this.A01) {
            case 0:
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) this.A00;
                verifyTwoFactorAuthCodeDialogFragment.A03.setEnabled(false);
                verifyTwoFactorAuthCodeDialogFragment.A01.setProgress(0);
                Handler handler = verifyTwoFactorAuthCodeDialogFragment.A08;
                handler.removeMessages(0);
                handler.sendMessageDelayed(handler.obtainMessage(0, str), 400);
                return;
            case 1:
                ((VerifyPhoneNumber) this.A00).A3q(str);
                return;
            default:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A00;
                verifyTwoFactorAuth.A36(0, verifyTwoFactorAuth.A0A.getCode(), false);
                return;
        }
    }

    public void AU2(String str) {
        if (this.A01 == 0) {
            C13700nu.A0T(((VerifyTwoFactorAuthCodeDialogFragment) this.A00).A02);
        }
    }
}
