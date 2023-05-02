package com.facebook.redex;

import X.AnonymousClass1ZR;
import X.C109495Sj;
import X.C41681wN;
import X.C42821yj;
import X.C70653hS;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.status.playback.MessageReplyActivity;

public class IDxListenerShape380S0100000_2_I0 implements C109495Sj {
    public Object A00;
    public final int A01;

    public IDxListenerShape380S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AQ8() {
        if (this.A01 == 0) {
            C42821yj r1 = (C42821yj) this.A00;
            if (r1.A2v.isShowing()) {
                r1.A2v.dismiss();
            }
        }
    }

    public void AX3() {
        switch (this.A01) {
            case 0:
                ((C42821yj) this.A00).A0m(false);
                return;
            case 1:
                ((PopupNotification) this.A00).A2q();
                return;
            default:
                ((MessageReplyActivity) this.A00).A3C(false);
                return;
        }
    }

    public void AZk() {
        switch (this.A01) {
            case 0:
                C42821yj r3 = (C42821yj) this.A00;
                C41681wN r2 = r3.A2D;
                if (r2.A01 instanceof C70653hS) {
                    r2.A0A((String) null);
                    r3.A2D.A06((AnonymousClass1ZR) null);
                    r3.A07();
                    return;
                }
                return;
            case 1:
                ((PopupNotification) this.A00).A2o();
                return;
            default:
                ((MessageReplyActivity) this.A00).A38(4);
                return;
        }
    }
}
