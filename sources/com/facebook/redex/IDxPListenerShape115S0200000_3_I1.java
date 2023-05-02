package com.facebook.redex;

import X.AnonymousClass50C;
import X.AnonymousClass5wV;
import X.AnonymousClass61K;
import X.AnonymousClass698;
import X.C110115dX;
import X.C113305lp;
import X.C114325na;
import X.C116035qi;
import X.C117915tl;
import X.C118435ug;
import X.C118515uo;
import X.C119285wq;
import X.C119345ww;
import X.C13680ns;
import X.C14530pL;
import X.C14870pt;
import X.C16320sq;
import X.C18290wS;
import X.C18310wU;
import X.C18340wX;
import android.view.View;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class IDxPListenerShape115S0200000_3_I1 implements AnonymousClass698 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxPListenerShape115S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void AOu(String str) {
        IDxPCallbackShape69S0200000_3_I1 iDxPCallbackShape69S0200000_3_I1;
        int i2;
        if (this.A02 != 0) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A01;
            pinBottomSheetDialogFragment.A1O();
            C119345ww r3 = (C119345ww) this.A00;
            C14530pL r6 = r3.A06;
            C14870pt r7 = r3.A04;
            C18310wU r9 = r3.A0E;
            C18340wX r8 = r3.A0C;
            C119285wq r10 = r3.A0H;
            C118435ug r5 = new C118435ug(r6, r7, r8, r9, r10, "PIN");
            AnonymousClass50C A0R = C110115dX.A0R(r10, "FB", "PIN");
            if (A0R != null) {
                C119345ww.A00(new C117915tl(A0R), pinBottomSheetDialogFragment, r3, str);
            } else {
                r5.A00(new AnonymousClass61K(this, str), "FB");
            }
        } else {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = (PinBottomSheetDialogFragment) this.A01;
            pinBottomSheetDialogFragment2.A1O();
            C118515uo r2 = (C118515uo) this.A00;
            int A012 = r2.A05.A01();
            AnonymousClass5wV r32 = r2.A06;
            if (A012 == 1) {
                iDxPCallbackShape69S0200000_3_I1 = new IDxPCallbackShape69S0200000_3_I1(pinBottomSheetDialogFragment2, 5, this);
                i2 = 2;
            } else {
                iDxPCallbackShape69S0200000_3_I1 = new IDxPCallbackShape69S0200000_3_I1(pinBottomSheetDialogFragment2, 4, this);
                i2 = 1;
            }
            r32.A01(new IDxKCallbackShape2S1200000_3_I1(iDxPCallbackShape69S0200000_3_I1, r32, str, i2), iDxPCallbackShape69S0200000_3_I1, "FB");
        }
    }

    public void ARW(View view) {
        C116035qi r3;
        C16320sq r2;
        C18290wS r1;
        if (this.A02 != 0) {
            C119345ww r4 = (C119345ww) this.A00;
            C14530pL r12 = r4.A06;
            if (r4 instanceof C113305lp) {
                C113305lp r42 = (C113305lp) r4;
                r3 = new C116035qi(r12);
                r2 = r42.A02;
                r1 = r42.A01;
            } else {
                return;
            }
        } else {
            C118515uo r13 = (C118515uo) this.A00;
            r3 = new C116035qi(r13.A01);
            r2 = r13.A09;
            r1 = r13.A04;
        }
        C13680ns.A1U(new C114325na(r3, r1), r2);
    }
}
