package com.obwhatsapp.status;

import X.AnonymousClass11G;
import X.AnonymousClass128;
import X.C001300o;
import X.C003501o;
import X.C011405n;
import X.C14870pt;
import X.C16320sq;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;

public class StatusExpirationLifecycleOwner implements C003501o {
    public final C14870pt A00;
    public final AnonymousClass128 A01;
    public final AnonymousClass11G A02;
    public final C16320sq A03;
    public final Runnable A04 = new RunnableRunnableShape20S0100000_I1_3(this, 2);

    public StatusExpirationLifecycleOwner(C001300o r3, C14870pt r4, AnonymousClass128 r5, AnonymousClass11G r6, C16320sq r7) {
        this.A00 = r4;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        r3.getLifecycle().A00(this);
    }

    public void A00() {
        this.A00.A0J(this.A04);
        this.A03.Acl(new RunnableRunnableShape20S0100000_I1_3(this, 3));
    }

    @OnLifecycleEvent(C011405n.ON_DESTROY)
    public void onDestroy() {
        this.A00.A0J(this.A04);
    }

    @OnLifecycleEvent(C011405n.ON_START)
    public void onStart() {
        A00();
    }
}
