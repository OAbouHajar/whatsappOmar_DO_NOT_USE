package com.facebook.redex;

import X.AnonymousClass5QL;
import X.C15830rv;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Set;

public class IDxMObserverShape460S0100000_2_I0 implements AnonymousClass5QL {
    public Object A00;
    public final int A01;

    public IDxMObserverShape460S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AXf(C15830rv r4) {
        if (this.A01 != 0) {
            StatusesViewModel statusesViewModel = (StatusesViewModel) this.A00;
            UserJid of = UserJid.of(r4);
            Set set = statusesViewModel.A0G;
            synchronized (set) {
                set.add(of);
            }
            statusesViewModel.A07();
            return;
        }
        ((StatusesFragment) this.A00).A1D();
    }
}
