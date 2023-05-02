package com.facebook.redex;

import X.C17170ue;
import X.C55822kS;
import com.obwhatsapp.ShareProductLinkActivity;
import com.whatsapp.jid.UserJid;

public class IDxLListenerShape3S1200000_2_I1 implements C55822kS {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxLListenerShape3S1200000_2_I1(ShareProductLinkActivity shareProductLinkActivity, UserJid userJid, String str, int i2) {
        this.A03 = i2;
        this.A00 = shareProductLinkActivity;
        this.A02 = str;
        this.A01 = userJid;
    }

    public final void AKG() {
        int i2;
        int i3;
        int i4 = this.A03;
        String str = this.A02;
        UserJid userJid = (UserJid) this.A01;
        C17170ue r2 = ((ShareProductLinkActivity) this.A00).A00;
        switch (i4) {
            case 0:
                i2 = 42;
                i3 = 25;
                break;
            case 1:
                i2 = 37;
                i3 = 20;
                break;
            default:
                i2 = 40;
                i3 = 23;
                break;
        }
        r2.A04(userJid, i2, str, i3);
    }
}
