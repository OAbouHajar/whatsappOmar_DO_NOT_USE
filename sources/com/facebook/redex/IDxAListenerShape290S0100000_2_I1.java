package com.facebook.redex;

import X.AnonymousClass5PX;
import com.obwhatsapp.backup.encryptedbackup.EncryptionKeyInputFragment;
import com.obwhatsapp.backup.encryptedbackup.VerifyPasswordFragment;
import com.obwhatsapp.instrumentation.ui.InstrumentationAuthActivity;

public class IDxAListenerShape290S0100000_2_I1 implements AnonymousClass5PX {
    public Object A00;
    public final int A01;

    public IDxAListenerShape290S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AMw(int i2) {
        switch (this.A01) {
            case 0:
                EncryptionKeyInputFragment encryptionKeyInputFragment = (EncryptionKeyInputFragment) this.A00;
                if (i2 == -1 || i2 == 4) {
                    encryptionKeyInputFragment.A06.A0A(6);
                    encryptionKeyInputFragment.A06.A0F(true);
                    return;
                }
                return;
            case 1:
                ((VerifyPasswordFragment) this.A00).A1H(i2);
                return;
            default:
                ((InstrumentationAuthActivity) this.A00).A35(i2);
                return;
        }
    }
}
