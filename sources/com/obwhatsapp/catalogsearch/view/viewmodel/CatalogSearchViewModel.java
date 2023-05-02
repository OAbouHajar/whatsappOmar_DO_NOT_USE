package com.obwhatsapp.catalogsearch.view.viewmodel;

import X.AnonymousClass028;
import X.AnonymousClass1DV;
import X.AnonymousClass1PR;
import X.AnonymousClass2Y5;
import X.AnonymousClass2Y6;
import X.AnonymousClass2Y7;
import X.AnonymousClass2YD;
import X.AnonymousClass2YE;
import X.AnonymousClass2YQ;
import X.AnonymousClass2YR;
import X.AnonymousClass3B7;
import X.AnonymousClass41I;
import X.AnonymousClass4H0;
import X.AnonymousClass4KM;
import X.AnonymousClass5EB;
import X.C003401n;
import X.C008603x;
import X.C15220qW;
import X.C16620tM;
import X.C18450wi;
import X.C73363nl;
import X.C73373nm;
import X.C73383nn;
import com.whatsapp.jid.UserJid;
import kotlin.jvm.internal.IDxLambdaShape55S0000000_2_I0;

public final class CatalogSearchViewModel extends C003401n {
    public final AnonymousClass028 A00;
    public final AnonymousClass028 A01;
    public final AnonymousClass4H0 A02;
    public final AnonymousClass1PR A03;
    public final AnonymousClass4KM A04;
    public final AnonymousClass3B7 A05;
    public final C15220qW A06 = new AnonymousClass1DV(new IDxLambdaShape55S0000000_2_I0(0));
    public final C15220qW A07 = new AnonymousClass1DV(new AnonymousClass5EB(this));

    public CatalogSearchViewModel(AnonymousClass4H0 r3, AnonymousClass1PR r4, AnonymousClass4KM r5, AnonymousClass3B7 r6) {
        C18450wi.A0H(r4, 3);
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r6.A00;
        this.A00 = r5.A00;
    }

    public final void A05(AnonymousClass2Y5 r3) {
        if (r3 instanceof AnonymousClass2Y6) {
            A06(new AnonymousClass2YD(AnonymousClass2YQ.A00));
        } else if (r3 instanceof AnonymousClass2Y7) {
            A06(new AnonymousClass2YD(AnonymousClass2YR.A00));
        }
    }

    public final void A06(AnonymousClass2YE r2) {
        ((AnonymousClass028) this.A06.getValue()).A0B(r2);
    }

    public final void A07(UserJid userJid, int i2) {
        ((AnonymousClass028) this.A06.getValue()).A0B(new C73363nl(this.A02.A01.A0E(C16620tM.A02, 1514)));
        AnonymousClass1PR r2 = this.A03;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 == 1) {
            i3 = 3;
        } else if (i2 != 2) {
            i3 = -1;
        }
        r2.A00(userJid, 1, Integer.valueOf(i3), (Integer) null, (String) null);
        this.A04.A01.A0B("");
    }

    public final void A08(UserJid userJid, String str) {
        C18450wi.A0H(str, 0);
        A06(C73373nm.A00);
        this.A05.A02(AnonymousClass41I.START, userJid, str);
    }

    public final void A09(String str) {
        C18450wi.A0H(str, 0);
        if (str.length() == 0) {
            A06(new C73363nl(this.A02.A01.A0E(C16620tM.A02, 1514)));
            this.A04.A01.A0B("");
            return;
        }
        AnonymousClass4KM r2 = this.A04;
        r2.A01.A0B(C008603x.A04(str).toString());
        A06(C73383nn.A00);
    }
}
