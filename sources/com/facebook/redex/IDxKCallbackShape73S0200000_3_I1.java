package com.facebook.redex;

import X.AnonymousClass1Z7;
import X.AnonymousClass2HJ;
import X.AnonymousClass50C;
import X.AnonymousClass690;
import X.AnonymousClass692;
import X.C110655eb;
import X.C111825hT;
import X.C117915tl;
import X.C118185uH;
import X.C118415ue;
import X.C118575uu;
import X.C1204761u;
import X.C28371Vv;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;

public class IDxKCallbackShape73S0200000_3_I1 implements AnonymousClass692 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxKCallbackShape73S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void AVP(AnonymousClass2HJ r2) {
        switch (this.A02) {
            case 0:
                Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
                ((AnonymousClass690) this.A01).ASW(r2);
                return;
            case 1:
                ((C118185uH) this.A01).A00(r2);
                return;
            case 3:
                ((C1204761u) this.A00).A01.A02();
                return;
            default:
                Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
                return;
        }
    }

    public void AVQ(AnonymousClass50C r5) {
        switch (this.A02) {
            case 0:
                ((C118415ue) this.A00).A00((AnonymousClass690) this.A01, r5);
                return;
            case 1:
                C117915tl r3 = new C117915tl(r5);
                C118575uu r2 = (C118575uu) this.A00;
                r2.A00(r3, (C118185uH) this.A01, r2.A0C);
                return;
            case 2:
                ((BrazilPayBloksActivity) this.A00).A3C((AnonymousClass1Z7) this.A01, r5.A05);
                return;
            case 3:
                C28371Vv A012 = new C117915tl(r5).A01((byte[]) this.A01);
                C1204761u r1 = (C1204761u) this.A00;
                r1.A00.A1D();
                r1.A01.A06((PinBottomSheetDialogFragment) null, A012);
                return;
            default:
                ((C110655eb) this.A00).A05((C111825hT) this.A01, r5.A05);
                return;
        }
    }
}
