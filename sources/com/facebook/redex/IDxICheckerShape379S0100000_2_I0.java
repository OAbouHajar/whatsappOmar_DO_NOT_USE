package com.facebook.redex;

import X.AnonymousClass1ZK;
import X.C108705Pa;
import X.C42821yj;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.status.playback.MessageReplyActivity;

public class IDxICheckerShape379S0100000_2_I0 implements C108705Pa {
    public Object A00;
    public final int A01;

    public IDxICheckerShape379S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean AIx() {
        AnonymousClass1ZK r0;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                return !((C42821yj) obj).A0q();
            case 1:
                r0 = ((PopupNotification) obj).A1I;
                break;
            default:
                r0 = ((MessageReplyActivity) obj).A16;
                break;
        }
        return r0 == null || r0.A0P == null;
    }
}
