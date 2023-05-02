package com.facebook.redex;

import X.AnonymousClass29R;
import com.obwhatsapp.backup.google.SettingsGoogleDrive;
import com.obwhatsapp.settings.SettingsChat;

public class IDxSListenerShape415S0100000_2_I0 implements AnonymousClass29R {
    public Object A00;
    public final int A01;

    public IDxSListenerShape415S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AXc() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((SettingsChat) obj).A36();
        } else {
            ((SettingsGoogleDrive) obj).A0a.A07();
        }
    }
}
