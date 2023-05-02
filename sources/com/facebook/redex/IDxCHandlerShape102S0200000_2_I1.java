package com.facebook.redex;

import X.AnonymousClass1KU;
import X.AnonymousClass39A;
import X.AnonymousClass4Q6;
import X.AnonymousClass5RT;
import X.C18450wi;
import X.C57242qY;
import X.C86124Rh;
import com.whatsapp.jid.UserJid;

public class IDxCHandlerShape102S0200000_2_I1 implements AnonymousClass5RT {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCHandlerShape102S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void AR4(C86124Rh r2, int i2) {
        if (this.A02 != 0) {
            ((AnonymousClass5RT) this.A00).AR4(r2, i2);
        }
    }

    public void AR5(C86124Rh r5, AnonymousClass4Q6 r6) {
        if (this.A02 != 0) {
            boolean isEmpty = r5.A04.isEmpty();
            AnonymousClass1KU r1 = ((AnonymousClass39A) this.A01).A03;
            UserJid userJid = r5.A02;
            C18450wi.A0A(userJid);
            r1.A02(r6, userJid, isEmpty);
            ((AnonymousClass5RT) this.A00).AR5(r5, r6);
            return;
        }
        C57242qY r3 = (C57242qY) this.A00;
        AnonymousClass1KU r2 = r3.A0I;
        UserJid userJid2 = (UserJid) this.A01;
        r2.A02(r6, userJid2, true);
        r3.A08.A09(r2.A01(userJid2, "catalog_category_dummy_root_id"));
    }
}
