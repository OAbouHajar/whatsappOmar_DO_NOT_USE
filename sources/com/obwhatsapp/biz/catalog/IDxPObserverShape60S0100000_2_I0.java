package com.obwhatsapp.biz.catalog;

import X.AnonymousClass4VO;
import X.C18450wi;
import X.C32131fh;
import X.C35701mM;
import com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

public class IDxPObserverShape60S0100000_2_I0 extends AnonymousClass4VO {
    public Object A00;
    public final int A01;

    public IDxPObserverShape60S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(String str) {
        if (this.A01 != 0) {
            C18450wi.A0H(str, 0);
            BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) this.A00;
            C35701mM A05 = businessProductListBaseFragment.A1B().A05((UserJid) null, str);
            if (A05 != null) {
                businessProductListBaseFragment.A1C().A0M(A05);
                return;
            }
            return;
        }
        C32131fh r2 = (C32131fh) this.A00;
        C35701mM A052 = r2.A09.A05((UserJid) null, str);
        if (A052 != null) {
            r2.A0F.A0O(A052);
        }
    }

    public void A01(String str) {
        if (this.A01 != 0) {
            C18450wi.A0H(str, 0);
            BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) this.A00;
            C35701mM A05 = businessProductListBaseFragment.A1B().A05((UserJid) null, str);
            if (A05 != null) {
                businessProductListBaseFragment.A1C().A0M(A05);
                return;
            }
            return;
        }
        C32131fh r2 = (C32131fh) this.A00;
        C35701mM A052 = r2.A09.A05((UserJid) null, str);
        if (A052 != null) {
            r2.A0F.A0O(A052);
        }
    }
}
