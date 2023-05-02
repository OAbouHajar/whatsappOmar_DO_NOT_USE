package com.facebook.redex;

import X.AnonymousClass1KV;
import X.C108585Oo;
import X.C13680ns;
import X.C18450wi;
import X.C35701mM;
import X.C59692yn;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.jid.UserJid;

public class IDxCListenerShape366S0100000_2_I1 implements C108585Oo {
    public Object A00;
    public final int A01;

    public IDxCListenerShape366S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AVH(C35701mM r13, int i2) {
        int i3;
        if (this.A01 != 0) {
            CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A00;
            CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) catalogSearchFragment.A0b.getValue();
            UserJid userJid = catalogSearchFragment.A0P;
            if (userJid == null) {
                throw C18450wi.A03("bizJid");
            }
            String str = r13.A0D;
            C18450wi.A0A(str);
            catalogSearchViewModel.A03.A00(userJid, C13680ns.A0a(), (Integer) null, Integer.valueOf(i2), str);
            return;
        }
        C59692yn r2 = (C59692yn) this.A00;
        if (r2.A0C.A0C(1514) && (i3 = r2.A00) != -1) {
            AnonymousClass1KV r3 = r2.A09;
            UserJid userJid2 = r2.A0K;
            String str2 = r2.A0O;
            int i4 = r2.A01;
            r3.A00(userJid2, true, Integer.valueOf(i2), Integer.valueOf(i4), str2, r13.A0D, i3, 3);
        }
    }
}
