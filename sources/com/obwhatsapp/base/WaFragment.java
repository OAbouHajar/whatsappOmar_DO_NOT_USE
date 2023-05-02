package com.obwhatsapp.base;

import X.AnonymousClass00F;
import X.AnonymousClass01A;
import X.AnonymousClass01S;
import X.C14610pT;
import X.C17040uR;
import X.C17070uU;
import X.C17080uV;
import X.C54472hZ;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;

public abstract class WaFragment extends AnonymousClass01A implements C17040uR, C14610pT {
    public C17070uU A00;
    public C17080uV A01;

    public void A0o(boolean z2) {
        C54472hZ.A02(this, this.A00, this.A01, this.A0j, z2);
        super.A0o(z2);
    }

    public /* synthetic */ AnonymousClass00F AFf() {
        return this instanceof StatusPlaybackContactFragment ? AnonymousClass01S.A01 : AnonymousClass01S.A02;
    }
}
