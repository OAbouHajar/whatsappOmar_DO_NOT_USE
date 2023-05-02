package com.obwhatsapp.ctwa.trustsignal.viewmodel;

import X.AnonymousClass013;
import X.AnonymousClass027;
import X.AnonymousClass02H;
import X.AnonymousClass1DV;
import X.AnonymousClass21U;
import X.AnonymousClass21V;
import X.AnonymousClass5EG;
import X.C13690nt;
import X.C15220qW;
import X.C17020u3;
import X.C18450wi;
import X.C20030zO;
import X.C20070zS;
import X.C87094Vi;
import android.app.Application;
import com.whatsapp.jid.UserJid;

public final class TopBannerViewModel extends AnonymousClass02H {
    public C87094Vi A00;
    public Integer A01;
    public String A02 = "none";
    public final AnonymousClass027 A03 = C13690nt.A0O();
    public final AnonymousClass013 A04;
    public final C20030zO A05;
    public final C20070zS A06;
    public final C17020u3 A07;
    public final C15220qW A08 = new AnonymousClass1DV(new AnonymousClass5EG(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopBannerViewModel(Application application, AnonymousClass013 r4, C20030zO r5, C20070zS r6, C17020u3 r7) {
        super(application);
        C18450wi.A0J(application, r4);
        C18450wi.A0H(r5, 4);
        C18450wi.A0H(r7, 5);
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A07 = r7;
    }

    public final void A05() {
        C87094Vi r0 = this.A00;
        UserJid of = UserJid.of(r0 == null ? null : r0.A00);
        if (of != null) {
            C20030zO r2 = this.A05;
            AnonymousClass21U A002 = r2.A00(of);
            if (A002 instanceof AnonymousClass21V) {
                AnonymousClass21V r1 = (AnonymousClass21V) A002;
                String str = r1.A02;
                String str2 = r1.A03;
                long j2 = r1.A01;
                String str3 = this.A02;
                Integer num = this.A01;
                r2.A04(new AnonymousClass21V(of, str, str2, str3, num == null ? -1 : num.intValue(), j2));
            }
        }
    }
}
