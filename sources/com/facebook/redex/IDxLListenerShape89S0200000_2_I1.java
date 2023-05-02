package com.facebook.redex;

import X.C17170ue;
import X.C55822kS;
import com.obwhatsapp.ShareCatalogLinkActivity;
import com.whatsapp.jid.UserJid;

public class IDxLListenerShape89S0200000_2_I1 implements C55822kS {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLListenerShape89S0200000_2_I1(ShareCatalogLinkActivity shareCatalogLinkActivity, UserJid userJid, int i2) {
        this.A02 = i2;
        this.A00 = shareCatalogLinkActivity;
        this.A01 = userJid;
    }

    public final void AKG() {
        int i2;
        int i3;
        int i4 = this.A02;
        UserJid userJid = (UserJid) this.A01;
        C17170ue r3 = ((ShareCatalogLinkActivity) this.A00).A00;
        switch (i4) {
            case 0:
                i2 = 41;
                i3 = 24;
                break;
            case 1:
                i2 = 36;
                i3 = 19;
                break;
            default:
                i2 = 39;
                i3 = 22;
                break;
        }
        r3.A04(userJid, i2, (String) null, i3);
    }
}
