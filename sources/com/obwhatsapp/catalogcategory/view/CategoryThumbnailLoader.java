package com.obwhatsapp.catalogcategory.view;

import X.AnonymousClass05T;
import X.AnonymousClass1DU;
import X.AnonymousClass22J;
import X.AnonymousClass4D4;
import X.AnonymousClass4H5;
import X.C001300o;
import X.C011405n;
import X.C100454vf;
import X.C18450wi;
import X.C35691mL;
import X.C50262Yq;
import android.widget.ImageView;
import com.facebook.redex.IDxBListenerShape285S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape268S0100000_2_I1;
import com.whatsapp.jid.UserJid;

public final class CategoryThumbnailLoader implements AnonymousClass05T {
    public final C001300o A00;
    public final C50262Yq A01;

    public CategoryThumbnailLoader(C001300o r2, C50262Yq r3) {
        this.A01 = r3;
        this.A00 = r2;
        r2.getLifecycle().A00(this);
    }

    public final void A00(C35691mL r10, UserJid userJid, AnonymousClass1DU r12, AnonymousClass1DU r13, AnonymousClass22J r14) {
        AnonymousClass4H5 r5 = new AnonymousClass4H5(new AnonymousClass4D4(897451484), userJid);
        C35691mL r3 = r10;
        this.A01.A01((ImageView) null, r3, new IDxBListenerShape285S0100000_2_I1(r13, 4), r5, new C100454vf(r12), new IDxSListenerShape268S0100000_2_I1(r14, 5), 2);
    }

    public void AXa(C011405n r3, C001300o r4) {
        C18450wi.A0H(r3, 1);
        if (r3.ordinal() == 5) {
            this.A01.A00();
            this.A00.getLifecycle().A01(this);
        }
    }
}
