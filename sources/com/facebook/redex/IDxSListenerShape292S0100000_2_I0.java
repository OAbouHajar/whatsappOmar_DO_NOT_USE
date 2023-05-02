package com.facebook.redex;

import X.AnonymousClass3K2;
import X.AnonymousClass5RY;
import X.C14550pN;
import X.C32131fh;
import X.C35701mM;
import X.C49272Sb;
import X.C49992Xb;
import X.C57242qY;
import com.obwhatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.jid.UserJid;

public class IDxSListenerShape292S0100000_2_I0 implements AnonymousClass5RY {
    public Object A00;
    public final int A01;

    public IDxSListenerShape292S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ASd(C35701mM r4, long j2) {
        int i2 = this.A01;
        C14550pN r0 = (C14550pN) this.A00;
        AnonymousClass3K2.A11(r0.A00, r0.A01, j2);
    }

    public void AVY(C35701mM r10, String str, String str2, String str3, int i2, long j2) {
        C49992Xb r1;
        UserJid userJid;
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            C49272Sb r0 = ((ProductListActivity) obj).A0E;
            r1 = r0.A06;
            userJid = r0.A08;
        } else {
            C57242qY r02 = ((C32131fh) obj).A0G;
            r1 = r02.A0H;
            userJid = r02.A0M;
        }
        r1.A01(r10, userJid, str, str2, str3, j2);
    }
}
