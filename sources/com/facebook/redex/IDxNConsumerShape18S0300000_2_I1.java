package com.facebook.redex;

import X.AnonymousClass1HE;
import X.AnonymousClass1WE;
import X.AnonymousClass1XP;
import X.C14550pN;
import X.C15830rv;
import X.C16030sJ;
import X.C16490t9;
import X.C16740tZ;
import X.C18220wL;
import X.C18450wi;
import X.C42821yj;
import com.obwhatsapp.support.ReportSpamDialogFragment;
import com.whatsapp.jid.Jid;

public class IDxNConsumerShape18S0300000_2_I1 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxNConsumerShape18S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void accept(Object obj) {
        Object obj2 = obj;
        if (this.A03 != 0) {
            AnonymousClass1HE r2 = (AnonymousClass1HE) this.A00;
            AnonymousClass1XP r5 = (AnonymousClass1XP) this.A01;
            Jid jid = (Jid) this.A02;
            Number number = (Number) obj2;
            if (!r2.A0R.containsValue(r5)) {
                C16490t9 r4 = r2.A0C;
                C18220wL r3 = r2.A0D;
                int intValue = number.intValue();
                int i2 = 2;
                if (C16030sJ.A0L(jid)) {
                    i2 = 3;
                }
                r4.A06(r3.A02(r5, intValue, i2));
                r5.A02();
                return;
            }
            return;
        }
        C42821yj r32 = (C42821yj) this.A00;
        C15830rv r42 = (C15830rv) this.A01;
        C16740tZ r22 = (C16740tZ) this.A02;
        Boolean bool = (Boolean) obj2;
        C18450wi.A0H(bool, 3);
        if (!((C14550pN) r32.A22).AIm()) {
            ReportSpamDialogFragment A012 = ReportSpamDialogFragment.A01(r42, r22.A0C(), new IDxAListenerShape432S0100000_2_I1(r32, 0), "message_menu", 0, bool.booleanValue(), false, false, false, true, false);
            A012.A0C = r22;
            ((C14550pN) r32.A22).Afc(A012);
        }
    }
}
