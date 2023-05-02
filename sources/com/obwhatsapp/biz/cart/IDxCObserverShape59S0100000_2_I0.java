package com.obwhatsapp.biz.cart;

import X.AnonymousClass4PR;
import X.C32131fh;
import X.C449726l;
import X.C49982Xa;
import X.C49992Xb;
import X.C64433Po;
import com.obwhatsapp.biz.catalog.view.activity.ProductListActivity;
import com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

public class IDxCObserverShape59S0100000_2_I0 extends AnonymousClass4PR {
    public Object A00;
    public final int A01;

    public IDxCObserverShape59S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        C49992Xb r0;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                r0 = ((C32131fh) obj).A0G.A0H;
                break;
            case 1:
                r0 = ((ProductListActivity) obj).A0E.A06;
                break;
            case 2:
                r0 = ((C449726l) obj).A0b.A0C;
                break;
            case 3:
                r0 = ((C64433Po) ((BusinessProductListBaseFragment) obj).A0J.getValue()).A03;
                break;
            default:
                r0 = ((C49982Xa) ((CatalogSearchFragment) obj).A0Y.getValue()).A04;
                break;
        }
        r0.A00();
    }
}
