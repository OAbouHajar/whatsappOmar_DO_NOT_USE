package com.facebook.redex;

import X.AnonymousClass5RN;
import X.C26181Mq;
import X.C37781pj;
import X.C59172uy;
import X.C59182uz;
import com.obwhatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;

public class IDxEListenerShape201S0100000_2_I1 implements C26181Mq {
    public Object A00;
    public final int A01;

    public IDxEListenerShape201S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQI(C37781pj r3) {
        AnonymousClass5RN r1;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                r1 = ((C59172uy) obj).A02;
                break;
            case 1:
                r1 = ((EmojiEditTextBottomSheetDialogFragment) obj).A0R;
                break;
            default:
                r1 = ((C59182uz) obj).A0E;
                break;
        }
        r1.AQH(r3.A00);
    }
}
