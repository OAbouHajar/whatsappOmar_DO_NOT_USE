package com.facebook.redex;

import X.AnonymousClass4KU;
import X.AnonymousClass5PR;
import X.C603731f;
import com.obwhatsapp.TextEmojiLabel;

public class IDxCallbackShape342S0100000_2_I1 implements AnonymousClass5PR {
    public Object A00;
    public final int A01;

    public IDxCallbackShape342S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AOt(Object obj) {
        if (this.A01 != 0) {
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A00;
            textEmojiLabel.setPlaceholder(0);
            textEmojiLabel.A0G((CharSequence) obj);
            return;
        }
        ((C603731f) this.A00).A0A((AnonymousClass4KU) obj);
    }
}
