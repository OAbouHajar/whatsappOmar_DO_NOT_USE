package com.facebook.redex;

import X.AnonymousClass2HJ;
import X.AnonymousClass5Q2;
import X.C14550pN;
import X.C14570pP;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.BlockList;

public class IDxListenerShape365S0100000_2_I0 implements AnonymousClass5Q2 {
    public Object A00;
    public final int A01;

    public IDxListenerShape365S0100000_2_I0(BlockList blockList, int i2) {
        this.A01 = i2;
        this.A00 = blockList;
    }

    public final void AWL(AnonymousClass2HJ r5) {
        C14550pN r3;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C14550pN r32 = (C14550pN) obj;
            r3 = r32;
            if (r5 != null) {
                r32.Afg(R.string.str0fcc);
                return;
            }
        } else {
            r3 = (C14570pP) obj;
            if (r5 != null) {
                return;
            }
        }
        r3.A05.Acl(new RunnableRunnableShape4S0100000_I0_3(r3, 15));
    }
}
