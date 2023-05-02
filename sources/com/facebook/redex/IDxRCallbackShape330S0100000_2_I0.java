package com.facebook.redex;

import X.AnonymousClass2NT;
import X.AnonymousClass5OF;
import X.C55582jz;
import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity2;

public class IDxRCallbackShape330S0100000_2_I0 implements AnonymousClass5OF {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape330S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ATK(AnonymousClass2NT r3) {
        switch (this.A01) {
            case 0:
                DirectorySetLocationMapActivity.A02(r3, (DirectorySetLocationMapActivity) this.A00);
                return;
            case 1:
                C55582jz r1 = (C55582jz) this.A00;
                if (r1.A08 == null) {
                    r1.A08 = r3;
                    r1.setLocationMode(r1.A03);
                    return;
                }
                return;
            default:
                GroupChatLiveLocationsActivity2.A03(r3, (GroupChatLiveLocationsActivity2) this.A00);
                return;
        }
    }
}
