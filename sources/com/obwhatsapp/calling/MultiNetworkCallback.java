package com.obwhatsapp.calling;

import X.AnonymousClass55b;
import X.C55282jD;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;

public class MultiNetworkCallback {
    public final C55282jD provider;

    public MultiNetworkCallback(C55282jD r1) {
        this.provider = r1;
    }

    public void closeAlternativeSocket(boolean z2) {
        C55282jD r3 = this.provider;
        r3.A07.execute(new RunnableRunnableShape0S0110000_I0(r3, 6, z2));
    }

    public void createAlternativeSocket(boolean z2, boolean z3) {
        C55282jD r2 = this.provider;
        r2.A07.execute(new AnonymousClass55b(r2, z2, z3));
    }
}
