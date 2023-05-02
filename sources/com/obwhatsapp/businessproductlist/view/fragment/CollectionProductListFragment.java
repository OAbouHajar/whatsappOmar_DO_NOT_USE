package com.obwhatsapp.businessproductlist.view.fragment;

import X.AnonymousClass1DV;
import X.AnonymousClass1KA;
import X.AnonymousClass1KV;
import X.AnonymousClass3Ij;
import X.AnonymousClass3PW;
import X.C109265Rj;
import X.C13680ns;
import X.C14710pd;
import X.C15220qW;
import X.C18450wi;
import X.C18630x0;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.jid.UserJid;

public class CollectionProductListFragment extends Hilt_CollectionProductListFragment {
    public int A00 = -1;
    public int A01 = -1;
    public AnonymousClass1KV A02;
    public AnonymousClass1KA A03;
    public C14710pd A04;
    public C18630x0 A05;
    public Integer A06;
    public String A07;
    public final C15220qW A08 = new AnonymousClass1DV(new AnonymousClass3Ij(this));

    public void A14() {
        super.A14();
        if (this.A06 != null) {
            C109265Rj r1 = this.A0B;
            C18450wi.A0F(r1);
            Integer num = this.A06;
            C18450wi.A0F(num);
            r1.AR1(num.intValue());
            this.A06 = null;
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        String string = A04().getString("collection-id", "");
        C18450wi.A0B(string);
        this.A07 = string;
        A04().getString("collection-index");
        this.A00 = A04().getInt("category_browsing_entry_point", -1);
        this.A01 = A04().getInt("category_level", -1);
        C15220qW r2 = this.A08;
        C13680ns.A1M(this, ((AnonymousClass3PW) r2.getValue()).A01.A02, 17);
        C13680ns.A1L(this, ((AnonymousClass3PW) r2.getValue()).A01.A04, 40);
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        super.A18(bundle, view);
        AnonymousClass3PW r5 = (AnonymousClass3PW) this.A08.getValue();
        UserJid A1D = A1D();
        String A1I = A1I();
        boolean z2 = false;
        if (this.A00 != -1) {
            z2 = true;
        }
        r5.A01.A00(r5.A02.A00, A1D, A1I, z2);
    }

    public final String A1I() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        throw C18450wi.A03("collectionId");
    }
}
