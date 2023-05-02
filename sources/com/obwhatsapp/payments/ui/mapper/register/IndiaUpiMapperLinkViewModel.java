package com.obwhatsapp.payments.ui.mapper.register;

import X.AnonymousClass02H;
import X.AnonymousClass4QP;
import X.AnonymousClass60V;
import X.C112335iK;
import X.C16040sK;
import X.C18450wi;
import X.C227719f;
import X.C30801cy;
import X.C35301lh;
import X.C53852gP;
import android.app.Application;
import com.obwhatsapp.Me;

public final class IndiaUpiMapperLinkViewModel extends AnonymousClass02H {
    public C16040sK A00;
    public AnonymousClass60V A01;
    public final Application A02;
    public final C112335iK A03;
    public final C227719f A04;
    public final C30801cy A05 = C30801cy.A01();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndiaUpiMapperLinkViewModel(Application application, C16040sK r3, AnonymousClass60V r4, C112335iK r5, C227719f r6) {
        super(application);
        C18450wi.A0J(application, r4);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r6, 5);
        this.A02 = application;
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r5;
        this.A04 = r6;
    }

    public final void A05(boolean z2) {
        C112335iK r4 = this.A03;
        AnonymousClass60V r0 = this.A01;
        String A0D = r0.A0D();
        if (A0D == null) {
            A0D = "";
        }
        C35301lh A052 = r0.A05();
        C53852gP r3 = new C53852gP();
        Class<String> cls = String.class;
        C16040sK r02 = this.A00;
        r02.A0B();
        Me me = r02.A00;
        r4.A01(A052, new C35301lh(r3, cls, me == null ? null : me.number, "upiAlias"), new AnonymousClass4QP(this), A0D, z2 ? "port" : "add");
    }
}
