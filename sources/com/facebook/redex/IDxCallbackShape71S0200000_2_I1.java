package com.facebook.redex;

import X.AnonymousClass1z1;
import X.C19300yD;
import X.C38641rB;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import java.util.Set;

public class IDxCallbackShape71S0200000_2_I1 implements AnonymousClass1z1 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCallbackShape71S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void APS(String str) {
        if (this.A02 != 0) {
            ((StarOrRemoveFromRecentsStickerDialogFragment) this.A00).A00.A0V((Set) this.A01);
            return;
        }
        C19300yD r1 = (C19300yD) this.A00;
        if (!((C38641rB) this.A01).A1B()) {
            r1.A07.A0R(str);
        }
    }
}
