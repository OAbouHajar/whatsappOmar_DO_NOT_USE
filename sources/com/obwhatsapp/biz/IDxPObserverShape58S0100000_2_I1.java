package com.obwhatsapp.biz;

import X.AnonymousClass2XA;
import X.C439822h;
import X.C449726l;
import com.facebook.redex.IDxPCallbackShape291S0100000_2_I1;
import com.whatsapp.jid.UserJid;

public class IDxPObserverShape58S0100000_2_I1 extends C439822h {
    public Object A00;
    public final int A01;

    public IDxPObserverShape58S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A01(UserJid userJid) {
        AnonymousClass2XA r0;
        if (this.A01 != 0) {
            C449726l r1 = (C449726l) this.A00;
            if (r1.A0i.equals(userJid) && (r0 = r1.A0M) != null) {
                r0.A06();
            }
        } else if (userJid != null) {
            BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) this.A00;
            if (userJid.equals(businessProfileExtraFieldsActivity.A0D)) {
                businessProfileExtraFieldsActivity.A01.A03(new IDxPCallbackShape291S0100000_2_I1(businessProfileExtraFieldsActivity, 0), businessProfileExtraFieldsActivity.A0D);
            }
        }
    }
}
