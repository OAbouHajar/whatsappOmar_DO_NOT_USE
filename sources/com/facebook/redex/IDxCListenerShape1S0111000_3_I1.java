package com.facebook.redex;

import X.AnonymousClass29T;
import X.AnonymousClass5vZ;
import X.C110655eb;
import X.C112845jn;
import X.C112885jv;
import X.C117655tL;
import X.C118485ul;
import X.C14870pt;
import X.C16040sK;
import X.C16320sq;
import X.C16440t3;
import X.C16980tz;
import X.C17190ug;
import X.C18280wR;
import X.C18290wS;
import android.content.Context;
import android.content.DialogInterface;
import com.obwhatsapp.R;

public class IDxCListenerShape1S0111000_3_I1 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public IDxCListenerShape1S0111000_3_I1(Object obj, int i2, int i3, boolean z2) {
        this.A03 = i3;
        this.A01 = obj;
        this.A00 = i2;
        this.A02 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        if (this.A03 != 0) {
            C112885jv r2 = (C112885jv) this.A01;
            int i3 = this.A00;
            boolean z2 = this.A02;
            AnonymousClass29T.A00(r2, i3);
            r2.A39(z2);
            return;
        }
        C112845jn r1 = (C112845jn) this.A01;
        int i4 = this.A00;
        boolean z3 = this.A02;
        AnonymousClass29T.A00(r1, i4);
        C110655eb r0 = r1.A01;
        C117655tL r22 = new C117655tL(5);
        r22.A08 = true;
        r22.A02 = R.string.str13db;
        r0.A03.A0B(r22);
        IDxCallbackShape250S0100000_3_I1 iDxCallbackShape250S0100000_3_I1 = new IDxCallbackShape250S0100000_3_I1(r0, 6);
        if (z3) {
            Context context = r0.A0E.A00;
            C14870pt r4 = r0.A0A;
            C16320sq r13 = r0.A0V;
            C18280wR r12 = r0.A0T;
            C18290wS r11 = r0.A0R;
            new AnonymousClass5vZ(context, r4, r0.A0C, r0.A0F, r0.A0L, r0.A0N, r0.A0O, r0.A0P, r11, r12, r13).A00(iDxCallbackShape250S0100000_3_I1);
            return;
        }
        C16440t3 r5 = r0.A0D;
        C14870pt r3 = r0.A0A;
        C16040sK r42 = r0.A0B;
        C17190ug r7 = r0.A0J;
        C16980tz r6 = r0.A0E;
        C16320sq r112 = r0.A0V;
        new C118485ul(r3, r42, r5, r6, r7, r0.A0L, r0.A0M, r0.A0R, r112).A00(iDxCallbackShape250S0100000_3_I1);
    }
}
