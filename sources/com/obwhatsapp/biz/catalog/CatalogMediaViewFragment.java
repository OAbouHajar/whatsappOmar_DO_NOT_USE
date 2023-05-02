package com.obwhatsapp.biz.catalog;

import X.AnonymousClass1KX;
import X.AnonymousClass3GA;
import X.C004601z;
import X.C16260sj;
import X.C17170ue;
import X.C19980zJ;
import X.C23081Ak;
import X.C23091Al;
import X.C35701mM;
import X.C50262Yq;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxCListenerShape273S0100000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

public class CatalogMediaViewFragment extends Hilt_CatalogMediaViewFragment {
    public int A00;
    public C19980zJ A01;
    public C35701mM A02;
    public C17170ue A03;
    public C23081Ak A04;
    public C50262Yq A05;
    public C16260sj A06;
    public UserJid A07;
    public C23091Al A08;
    public String A09;

    public void A12() {
        this.A05.A00();
        super.A12();
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            this.A05 = new C50262Yq(this.A04, this.A08);
            this.A07 = UserJid.getNullable(bundle2.getString("cached_jid"));
            this.A02 = (C35701mM) bundle2.getParcelable("product");
            this.A00 = bundle2.getInt("target_image_index", 0);
            A1N(new AnonymousClass3GA(this));
            this.A09.A0F(this.A00, false);
            this.A09.A0G(new IDxCListenerShape273S0100000_2_I1(this, 0));
        }
    }

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        if (bundle == null) {
            this.A09 = AnonymousClass1KX.A00(this.A00, this.A02.A0D);
            Bundle bundle2 = this.A01;
            if (bundle2 != null) {
                this.A0E = true;
                this.A0B.A0C(bundle2, this);
            }
        }
        this.A02.setVisibility(8);
        C004601z.A0E(view, R.id.title_holder).setClickable(false);
    }
}
