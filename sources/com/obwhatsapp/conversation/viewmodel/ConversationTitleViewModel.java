package com.obwhatsapp.conversation.viewmodel;

import X.AnonymousClass027;
import X.AnonymousClass02H;
import X.AnonymousClass15V;
import X.AnonymousClass15X;
import X.AnonymousClass3K4;
import X.C13690nt;
import X.C16010sH;
import X.C16320sq;
import X.C19580yf;
import X.C26621Om;
import android.app.Application;

public class ConversationTitleViewModel extends AnonymousClass02H {
    public boolean A00 = false;
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final C26621Om A02;
    public final AnonymousClass15X A03;
    public final C19580yf A04;
    public final AnonymousClass15V A05;
    public final C16320sq A06;

    public ConversationTitleViewModel(Application application, C26621Om r3, AnonymousClass15X r4, C19580yf r5, AnonymousClass15V r6, C16320sq r7) {
        super(application);
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void A05(C16010sH r3) {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass3K4.A0u(this.A06, this, r3, 9);
        }
    }
}
