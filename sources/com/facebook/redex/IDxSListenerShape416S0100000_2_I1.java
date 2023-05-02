package com.facebook.redex;

import X.C108475Od;
import X.C616039o;
import com.obwhatsapp.backup.google.IDxDTask6Shape3S0300000_2_I1;
import java.util.concurrent.atomic.AtomicLong;

public class IDxSListenerShape416S0100000_2_I1 implements C108475Od {
    public Object A00;
    public final int A01;

    public IDxSListenerShape416S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void APP(long j2) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((AtomicLong) obj).addAndGet(j2);
            return;
        }
        C616039o r5 = (C616039o) ((IDxDTask6Shape3S0300000_2_I1) obj).A00;
        AtomicLong atomicLong = r5.A0g;
        atomicLong.addAndGet(j2);
        if (j2 >= 10240) {
            r5.A0G.A07(atomicLong.get(), r5.A0e.get());
        }
    }
}
