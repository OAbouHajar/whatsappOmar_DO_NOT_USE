package com.facebook.redex;

import X.AnonymousClass36S;
import X.C16050sL;
import X.C40881uq;
import X.C49642Uo;
import com.whatsapp.jid.Jid;

public class IDxJRunnableShape410S0100000_2_I1 implements C40881uq {
    public Object A00;
    public final int A01;

    public IDxJRunnableShape410S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void Acj(Jid jid, int i2) {
        if (this.A01 != 0) {
            ((C49642Uo) this.A00).A07(i2);
            return;
        }
        ((AnonymousClass36S) this.A00).A02 = (C16050sL) jid;
    }
}
