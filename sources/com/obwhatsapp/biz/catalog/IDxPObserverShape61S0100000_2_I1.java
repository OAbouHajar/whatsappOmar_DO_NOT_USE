package com.obwhatsapp.biz.catalog;

import X.AnonymousClass4VO;
import X.C35701mM;
import X.C449726l;
import X.C59692yn;
import com.whatsapp.jid.UserJid;

public class IDxPObserverShape61S0100000_2_I1 extends AnonymousClass4VO {
    public Object A00;
    public final int A01;

    public IDxPObserverShape61S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(String str) {
        if (this.A01 != 0) {
            C59692yn r2 = (C59692yn) this.A00;
            C35701mM A05 = r2.A08.A05((UserJid) null, str);
            if (A05 != null) {
                r2.A0E.A0M(A05);
                return;
            }
            return;
        }
        C449726l r3 = (C449726l) this.A00;
        C35701mM A052 = r3.A0P.A05((UserJid) null, str);
        C35701mM r1 = r3.A0Q;
        if (r1 == null || (r1.A0D.equals(str) && !r1.equals(A052))) {
            r3.A00 = 0;
            r3.A0Q = r3.A0P.A05(r3.A0i, str);
            r3.A35();
        }
    }

    public void A01(String str) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C59692yn r2 = (C59692yn) obj;
            C35701mM A05 = r2.A08.A05((UserJid) null, str);
            if (A05 != null) {
                r2.A0E.A0M(A05);
                return;
            }
            return;
        }
        C449726l r22 = (C449726l) obj;
        if (str.equals(r22.A0p)) {
            r22.A0Q = r22.A0P.A05(r22.A0i, str);
            r22.A35();
        }
    }
}
