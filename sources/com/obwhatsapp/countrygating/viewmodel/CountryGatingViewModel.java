package com.obwhatsapp.countrygating.viewmodel;

import X.C003401n;
import X.C14710pd;
import X.C17030uP;
import X.C20260zl;
import X.C41861wm;
import com.whatsapp.jid.UserJid;

public class CountryGatingViewModel extends C003401n {
    public boolean A00;
    public final C17030uP A01;
    public final C14710pd A02;
    public final C20260zl A03;

    public CountryGatingViewModel(C17030uP r1, C14710pd r2, C20260zl r3) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
    }

    public boolean A05(UserJid userJid) {
        return C41861wm.A01(this.A01, this.A02, this.A03, userJid);
    }
}
