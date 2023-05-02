package com.facebook.redex;

import X.C108745Pe;
import X.C42821yj;
import X.C93544jN;
import com.obwhatsapp.status.playback.MessageReplyActivity;

public class IDxSListenerShape430S0100000_2_I0 implements C108745Pe {
    public Object A00;
    public final int A01;

    public IDxSListenerShape430S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ARt(C93544jN r3) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((MessageReplyActivity) obj).A3A(r3);
        } else {
            ((C42821yj) obj).A0e(r3);
        }
    }
}
