package com.facebook.redex;

import X.AnonymousClass43C;
import X.AnonymousClass5PQ;
import X.C14550pN;
import X.C16740tZ;
import X.C42821yj;
import com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingFragment;

public class IDxRCallbackShape307S0100000_2_I0 implements AnonymousClass5PQ {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape307S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AVd(AnonymousClass43C r3, C16740tZ r4) {
        if (2 - this.A01 != 0) {
            ((C14550pN) this.A00).Afc(MessageRatingFragment.A01(r3, r4));
        } else {
            ((C42821yj) this.A00).A22.Afc(MessageRatingFragment.A01(r3, r4));
        }
    }
}
