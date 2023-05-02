package com.facebook.redex;

import X.C42821yj;
import android.view.KeyEvent;
import android.widget.TextView;
import com.obwhatsapp.backup.encryptedbackup.EncryptionKeyFragment;
import com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment;

public class IDxAListenerShape212S0100000_2_I1 implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public IDxAListenerShape212S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        switch (this.A01) {
            case 0:
                EncryptionKeyFragment encryptionKeyFragment = (EncryptionKeyFragment) this.A00;
                if (i2 != 0) {
                    return false;
                }
                encryptionKeyFragment.A01.A08();
                return false;
            case 1:
                PasswordInputFragment passwordInputFragment = (PasswordInputFragment) this.A00;
                if (i2 != 6) {
                    return false;
                }
                passwordInputFragment.A1B();
                return false;
            default:
                IDxCallbackShape333S0100000_1_I0 iDxCallbackShape333S0100000_1_I0 = (IDxCallbackShape333S0100000_1_I0) this.A00;
                if (i2 != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                    return false;
                }
                C42821yj.A02((C42821yj) iDxCallbackShape333S0100000_1_I0.A00, true);
                return true;
        }
    }
}
