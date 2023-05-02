package com.facebook.redex;

import X.AnonymousClass5PI;
import X.C16740tZ;
import X.C52912ee;
import android.content.Context;
import com.obwhatsapp.conversation.conversationrow.InteractiveMessageButton;

public class IDxBCallbackShape84S0200000_2_I1 implements AnonymousClass5PI {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxBCallbackShape84S0200000_2_I1(InteractiveMessageButton interactiveMessageButton, C16740tZ r2, int i2) {
        this.A02 = i2;
        this.A00 = interactiveMessageButton;
        this.A01 = r2;
    }

    public final void ANr(int i2) {
        int i3;
        int i4 = this.A02;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) this.A00;
        C16740tZ r3 = (C16740tZ) this.A01;
        C52912ee r2 = interactiveMessageButton.A02;
        Context context = interactiveMessageButton.getContext();
        switch (i4) {
            case 0:
            case 1:
                i3 = 1;
                break;
            default:
                i3 = 0;
                break;
        }
        r2.A01(context, r3, i3);
    }
}
