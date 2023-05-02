package com.facebook.redex;

import X.AnonymousClass23B;
import X.AnonymousClass3BG;
import X.C100304vQ;
import X.C35611mD;
import X.C59562yU;
import com.obwhatsapp.biz.BusinessProfileExtraFieldsActivity;

public class IDxPCallbackShape291S0100000_2_I1 implements AnonymousClass23B {
    public Object A00;
    public final int A01;

    public IDxPCallbackShape291S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ANn(C35611mD r6) {
        AnonymousClass3BG r0;
        if (this.A01 != 0) {
            C59562yU r4 = (C59562yU) this.A00;
            if (r6 == null) {
                r4.A01.A05(new C100304vQ(r4), r4.A00, (String) null);
                return;
            }
            r4.A04(r6);
            return;
        }
        BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) this.A00;
        if (r6 != null && (r0 = businessProfileExtraFieldsActivity.A00) != null) {
            r0.A03(r6);
        }
    }
}
