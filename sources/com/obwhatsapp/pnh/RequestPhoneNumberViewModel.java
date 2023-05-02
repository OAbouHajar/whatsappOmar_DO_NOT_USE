package com.obwhatsapp.pnh;

import X.AnonymousClass000;
import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass15H;
import X.AnonymousClass1DV;
import X.AnonymousClass1ZX;
import X.AnonymousClass2X1;
import X.AnonymousClass5EY;
import X.C003401n;
import X.C13690nt;
import X.C14710pd;
import X.C15220qW;
import X.C16320sq;
import X.C16760tb;
import X.C17220uj;
import X.C17580vJ;
import X.C18450wi;
import X.C221916z;
import android.net.Uri;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;

public final class RequestPhoneNumberViewModel extends C003401n {
    public final Uri A00;
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final C16760tb A02;
    public final C17580vJ A03;
    public final AnonymousClass15H A04;
    public final C14710pd A05;
    public final C221916z A06;
    public final C16320sq A07;
    public final C15220qW A08 = new AnonymousClass1DV(new AnonymousClass5EY(this));

    public RequestPhoneNumberViewModel(C16760tb r3, C17580vJ r4, AnonymousClass15H r5, C14710pd r6, C221916z r7, C17220uj r8, C16320sq r9) {
        C18450wi.A0L(r8, r6, r9, r3, r4);
        C18450wi.A0K(r5, r7);
        this.A05 = r6;
        this.A07 = r9;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        Uri A032 = r8.A03("626403979060997");
        C18450wi.A0B(A032);
        this.A00 = A032;
    }

    public final AnonymousClass028 A05(AnonymousClass1ZX r5) {
        C18450wi.A0H(r5, 0);
        AnonymousClass027 r3 = this.A01;
        if (AnonymousClass000.A1X(this.A08.getValue())) {
            this.A07.Acl(new RunnableRunnableShape14S0200000_I1_2(this, 40, r5));
        }
        return r3;
    }

    public final void A06(AnonymousClass1ZX r11) {
        AnonymousClass027 r3 = this.A01;
        Uri uri = this.A00;
        boolean A1V = AnonymousClass000.A1V(this.A03.A01(r11));
        AnonymousClass15H r2 = this.A04;
        r3.A09(new AnonymousClass2X1(uri, r11, A1V, C18450wi.A0R(r2.A01(r11), Boolean.TRUE), r2.A0B(r11)));
    }
}
