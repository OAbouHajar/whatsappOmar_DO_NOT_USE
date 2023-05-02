package com.facebook.redex;

import X.C436420x;
import X.C64933Sf;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.info.StickerInfoDialogFragment;

public class IDxLListenerShape394S0100000_2_I1 implements C436420x {
    public Object A00;
    public final int A01;

    public IDxLListenerShape394S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AXn(boolean z2) {
        if (this.A01 != 0) {
            ((StickerInfoDialogFragment) this.A00).A0H.A04();
            return;
        }
        C64933Sf r1 = (C64933Sf) this.A00;
        if (r1.A03 && r1.A02) {
            StickerView stickerView = r1.A07;
            stickerView.A04 = true;
            stickerView.A04();
        }
    }
}
