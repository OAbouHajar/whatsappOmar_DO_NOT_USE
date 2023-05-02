package com.facebook.redex;

import X.AnonymousClass1DT;
import X.AnonymousClass22J;
import X.AnonymousClass2AF;
import X.C73453o9;
import com.whatsapp.jid.UserJid;

public class IDxObjectShape332S0100000_2_I1 implements AnonymousClass1DT, AnonymousClass22J {
    public Object A00;
    public final int A01;

    public IDxObjectShape332S0100000_2_I1(AnonymousClass2AF r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final Object AIU(Object obj) {
        if (this.A01 != 0) {
            return ((AnonymousClass2AF) this.A00).A05((UserJid) obj);
        }
        AnonymousClass2AF r3 = (AnonymousClass2AF) this.A00;
        UserJid userJid = (UserJid) obj;
        if (r3.A07.A0A()) {
            r3.A05(userJid);
            return null;
        }
        r3.A0J.A0B(new C73453o9(new IDxObjectShape261S0100000_2_I1(r3, 4)));
        return null;
    }
}
