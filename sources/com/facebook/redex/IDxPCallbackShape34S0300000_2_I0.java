package com.facebook.redex;

import X.AnonymousClass23B;
import X.AnonymousClass26L;
import X.C100314vR;
import X.C108545Ok;
import X.C18710x8;
import X.C35611mD;
import com.whatsapp.jid.UserJid;

public class IDxPCallbackShape34S0300000_2_I0 implements AnonymousClass23B {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxPCallbackShape34S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public final void ANn(C35611mD r7) {
        if (this.A03 != 0) {
            C108545Ok r2 = (C108545Ok) this.A01;
            UserJid userJid = (UserJid) this.A02;
            if (r7 != null && r7.A0K) {
                r2.AR0(userJid);
                return;
            }
            return;
        }
        C18710x8 r5 = (C18710x8) this.A00;
        UserJid userJid2 = (UserJid) this.A01;
        AnonymousClass26L r3 = (AnonymousClass26L) this.A02;
        if (r7 == null) {
            r5.A00.A05(new C100314vR(r5, r3, userJid2), userJid2, (String) null);
        } else {
            r5.A00(r3, r7, userJid2);
        }
    }
}
