package com.obwhatsapp.catalogcategory.view.viewmodel;

import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass1KV;
import X.AnonymousClass39A;
import X.AnonymousClass3K3;
import X.C003401n;
import X.C13690nt;
import X.C13700nu;
import X.C15220qW;
import X.C16320sq;
import X.C18450wi;
import X.C30801cy;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class CatalogCategoryGroupsViewModel extends C003401n {
    public final AnonymousClass028 A00;
    public final AnonymousClass028 A01;
    public final AnonymousClass028 A02;
    public final AnonymousClass027 A03;
    public final AnonymousClass1KV A04;
    public final AnonymousClass39A A05;
    public final C30801cy A06;
    public final C16320sq A07;
    public final C15220qW A08;

    public CatalogCategoryGroupsViewModel(AnonymousClass1KV r2, AnonymousClass39A r3, C16320sq r4) {
        C18450wi.A0I(r4, 1, r2);
        this.A07 = r4;
        this.A05 = r3;
        this.A04 = r2;
        C15220qW A0t = AnonymousClass3K3.A0t(2);
        this.A08 = A0t;
        this.A00 = (AnonymousClass028) A0t.getValue();
        C30801cy A012 = C30801cy.A01();
        this.A06 = A012;
        this.A01 = A012;
        AnonymousClass027 A0O = C13690nt.A0O();
        this.A03 = A0O;
        this.A02 = A0O;
    }

    public final void A05(UserJid userJid, List list) {
        C18450wi.A0H(list, 0);
        this.A03.A0B(Boolean.FALSE);
        C13700nu.A0X(this.A07, this, list, userJid, 15);
    }
}
