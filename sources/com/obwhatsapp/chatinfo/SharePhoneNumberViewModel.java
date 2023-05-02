package com.obwhatsapp.chatinfo;

import X.AnonymousClass027;
import X.AnonymousClass3K2;
import X.C003401n;
import X.C13690nt;
import X.C16040sK;
import X.C16760tb;
import X.C17220uj;
import X.C18450wi;
import X.C221916z;
import X.C87074Vg;
import android.net.Uri;

public final class SharePhoneNumberViewModel extends C003401n {
    public final AnonymousClass027 A00;
    public final C16760tb A01;
    public final C221916z A02;

    public SharePhoneNumberViewModel(C16040sK r5, C16760tb r6, C221916z r7, C17220uj r8) {
        C18450wi.A0J(r5, r8);
        AnonymousClass3K2.A1I(r6, r7);
        this.A01 = r6;
        this.A02 = r7;
        AnonymousClass027 A0O = C13690nt.A0O();
        this.A00 = A0O;
        String A08 = r5.A08();
        Uri A03 = r8.A03("626403979060997");
        C18450wi.A0B(A03);
        String obj = A03.toString();
        C18450wi.A0B(obj);
        A0O.A09(new C87074Vg(A08, obj));
    }
}
