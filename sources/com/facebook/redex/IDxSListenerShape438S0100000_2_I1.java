package com.facebook.redex;

import X.AnonymousClass29I;
import X.C108725Pc;
import X.C26181Mq;
import X.C37781pj;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;

public class IDxSListenerShape438S0100000_2_I1 implements C108725Pc {
    public Object A00;
    public final int A01;

    public IDxSListenerShape438S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQJ(C37781pj r4, int i2) {
        if (this.A01 != 0) {
            C26181Mq r0 = ((AnonymousClass29I) this.A00).A00;
            if (r0 != null) {
                r0.AQI(r4);
                return;
            }
            return;
        }
        EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) this.A00;
        emojiSearchContainer.A06.A07(r4.A00);
        emojiSearchContainer.A0A.AQJ(r4, i2);
    }
}
