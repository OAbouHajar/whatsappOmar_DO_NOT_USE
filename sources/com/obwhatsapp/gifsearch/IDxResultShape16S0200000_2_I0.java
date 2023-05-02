package com.obwhatsapp.gifsearch;

import X.C13680ns;
import X.C16320sq;
import X.C25851Lj;
import X.C25861Lk;
import X.C25921Lq;
import X.C86974Uw;

public class IDxResultShape16S0200000_2_I0 extends C86974Uw {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    public IDxResultShape16S0200000_2_I0(C25851Lj r5, CharSequence charSequence) {
        this.A00 = r5;
        this.A01 = charSequence;
        r5.A0A.Ack(new IDxRTaskShape78S0100000_1_I1(this, charSequence, (String) null, 0), new Void[0]);
    }

    public IDxResultShape16S0200000_2_I0(C25921Lq r5, CharSequence charSequence) {
        this.A00 = r5;
        this.A01 = charSequence;
        C13680ns.A1U(new IDxRTaskShape78S0100000_1_I1(this, charSequence, (String) null, 1), r5.A0A);
    }

    public boolean A01(String str) {
        C16320sq r3;
        int i2;
        IDxRTaskShape78S0100000_1_I1 iDxRTaskShape78S0100000_1_I1;
        if (this.A02 != 0) {
            if (str == null) {
                return false;
            }
            r3 = ((C25861Lk) this.A00).A0A;
            iDxRTaskShape78S0100000_1_I1 = new IDxRTaskShape78S0100000_1_I1(this, (CharSequence) this.A01, str, 1);
            i2 = 0;
        } else if (str == null) {
            return false;
        } else {
            r3 = ((C25861Lk) this.A00).A0A;
            i2 = 0;
            iDxRTaskShape78S0100000_1_I1 = new IDxRTaskShape78S0100000_1_I1(this, (CharSequence) this.A01, str, 0);
        }
        r3.Ack(iDxRTaskShape78S0100000_1_I1, new Void[i2]);
        return true;
    }
}
