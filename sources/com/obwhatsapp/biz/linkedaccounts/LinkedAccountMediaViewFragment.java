package com.obwhatsapp.biz.linkedaccounts;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass3GB;
import X.C004601z;
import X.C16260sj;
import X.C16440t3;
import X.C17030uP;
import X.C19980zJ;
import X.C26781Pd;
import X.C28331Vq;
import X.C28961Zl;
import X.C35691mL;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.facebook.redex.IDxCListenerShape273S0100000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

public class LinkedAccountMediaViewFragment extends Hilt_LinkedAccountMediaViewFragment {
    public int A00;
    public long A01;
    public C19980zJ A02;
    public C35691mL A03;
    public C26781Pd A04;
    public C17030uP A05;
    public C16440t3 A06;
    public C16260sj A07;
    public AnonymousClass013 A08;
    public UserJid A09;
    public String A0A;
    public boolean A0B = false;

    public void A17(Bundle bundle) {
        super.A17(bundle);
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("extra_business_jid");
            AnonymousClass00B.A06(parcelable);
            this.A09 = (UserJid) parcelable;
            Parcelable parcelable2 = bundle2.getParcelable("extra_image");
            AnonymousClass00B.A06(parcelable2);
            this.A03 = (C35691mL) parcelable2;
            this.A0A = bundle2.getString("extra_caption", "");
            this.A01 = bundle2.getLong("extra_timestamp");
            this.A00 = bundle2.getInt("extra_account_type");
            A1N(new AnonymousClass3GB(this));
            this.A09.A0F(0, false);
            this.A09.A0G(new IDxCListenerShape273S0100000_2_I1(this, 1));
        }
    }

    public void A18(Bundle bundle, View view) {
        Bundle bundle2;
        super.A18(bundle, view);
        if (bundle == null && (bundle2 = this.A01) != null) {
            this.A0E = true;
            this.A0B.A0C(bundle2, this);
        }
        this.A02.setVisibility(8);
        C004601z.A0E(view, R.id.title_holder).setClickable(false);
        C28331Vq A002 = this.A05.A00(this.A09);
        if (A002 != null) {
            this.A07.setText(A002.A08);
        }
        String charSequence = C28961Zl.A01(this.A08, this.A06.A02(this.A01)).toString();
        int i2 = this.A00;
        int i3 = R.string.str1cec;
        if (i2 == 0) {
            i3 = R.string.str1cc2;
        }
        StringBuilder A0q = AnonymousClass000.A0q(A0J(i3));
        A0q.append(" ");
        A0q.append(8226);
        A0q.append(" ");
        this.A05.setText(AnonymousClass000.A0h(charSequence, A0q));
    }
}
