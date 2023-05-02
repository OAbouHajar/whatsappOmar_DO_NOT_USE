package com.obwhatsapp.tosgating.viewmodel;

import X.AnonymousClass027;
import X.AnonymousClass135;
import X.AnonymousClass18J;
import X.C003401n;
import X.C14710pd;
import X.C16040sK;
import X.C17030uP;
import X.C19780yz;
import X.C20260zl;
import X.C41471vy;
import X.C41871wn;
import com.whatsapp.jid.UserJid;

public class ToSGatingViewModel extends C003401n {
    public boolean A00;
    public final AnonymousClass027 A01 = new AnonymousClass027();
    public final C16040sK A02;
    public final C17030uP A03;
    public final C19780yz A04;
    public final C14710pd A05;
    public final C20260zl A06;
    public final AnonymousClass18J A07;
    public final AnonymousClass135 A08;
    public final C41471vy A09;

    public ToSGatingViewModel(C16040sK r2, C17030uP r3, C19780yz r4, C14710pd r5, C20260zl r6, AnonymousClass18J r7, AnonymousClass135 r8) {
        C41471vy r0 = new C41471vy(this);
        this.A09 = r0;
        this.A05 = r5;
        this.A02 = r2;
        this.A06 = r6;
        this.A04 = r4;
        this.A07 = r7;
        this.A08 = r8;
        this.A03 = r3;
        r7.A02(r0);
    }

    public void A04() {
        this.A07.A03(this.A09);
    }

    public boolean A05(UserJid userJid) {
        return C41871wn.A00(this.A03, this.A05, this.A06, userJid, this.A08);
    }
}
