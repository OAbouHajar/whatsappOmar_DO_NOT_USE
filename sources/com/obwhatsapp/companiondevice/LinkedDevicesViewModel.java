package com.obwhatsapp.companiondevice;

import X.AnonymousClass01E;
import X.AnonymousClass02H;
import X.AnonymousClass113;
import X.AnonymousClass16S;
import X.AnonymousClass28N;
import X.AnonymousClass28O;
import X.C14870pt;
import X.C16320sq;
import X.C19410yO;
import X.C30801cy;
import android.app.Application;
import com.facebook.redex.IDxCallbackShape427S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import java.util.ArrayList;
import java.util.List;

public class LinkedDevicesViewModel extends AnonymousClass02H {
    public List A00 = new ArrayList();
    public final C14870pt A01;
    public final AnonymousClass28N A02 = new IDxCallbackShape427S0100000_2_I0(this, 0);
    public final C19410yO A03;
    public final AnonymousClass113 A04;
    public final AnonymousClass16S A05;
    public final C30801cy A06 = new C30801cy();
    public final C30801cy A07 = new C30801cy();
    public final C30801cy A08 = new C30801cy();
    public final C16320sq A09;

    public LinkedDevicesViewModel(Application application, C14870pt r4, C19410yO r5, AnonymousClass113 r6, AnonymousClass16S r7, C16320sq r8) {
        super(application);
        this.A01 = r4;
        this.A09 = r8;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
    }

    public void A05() {
        if (AnonymousClass01E.A01()) {
            this.A09.Ack(new AnonymousClass28O(this.A02, this.A03, this.A04), new Void[0]);
            return;
        }
        this.A01.A0K(new RunnableRunnableShape6S0100000_I0_5(this, 14));
    }
}
