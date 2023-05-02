package com.obwhatsapp.consumer.di.bridge.calling;

import X.AnonymousClass3K4;
import X.C52302dW;
import android.content.DialogInterface;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxCListenerShape65S0100000_2_I0 extends C52302dW {
    public Object A00;
    public final int A01;

    public IDxCListenerShape65S0100000_2_I0(VoipActivityV2 voipActivityV2, int i2) {
        this.A01 = i2;
        this.A00 = voipActivityV2;
    }

    public void A00() {
        if (this.A01 != 0) {
            super.A00();
        } else {
            ((VoipActivityV2) this.A00).A3Q();
        }
    }

    public void A01(DialogInterface dialogInterface) {
        if (1 - this.A01 != 0) {
            super.A01(dialogInterface);
            return;
        }
        dialogInterface.dismiss();
        AnonymousClass3K4.A0y(this.A00);
    }
}
