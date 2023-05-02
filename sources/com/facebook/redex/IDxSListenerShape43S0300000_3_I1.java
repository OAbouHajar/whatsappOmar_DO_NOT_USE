package com.facebook.redex;

import X.AnonymousClass2HF;
import X.AnonymousClass2HJ;
import X.C112135i0;
import X.C35391lr;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import java.util.ArrayList;
import java.util.List;

public class IDxSListenerShape43S0300000_3_I1 implements AnonymousClass2HF {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxSListenerShape43S0300000_3_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void AMM(List list) {
        int i2 = this.A03;
        Object obj = this.A00;
        if (i2 != 0) {
            DialogFragment dialogFragment = (DialogFragment) this.A02;
            BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) ((IDxMCallbackShape6S1200000_3_I1) obj).A00;
            brazilConfirmReceivePaymentFragment.A00.A05();
            brazilConfirmReceivePaymentFragment.A0r(brazilConfirmReceivePaymentFragment.A0I.A00(brazilConfirmReceivePaymentFragment.A0C(), (C35391lr) this.A01));
            if (dialogFragment != null) {
                dialogFragment.A1C();
                return;
            }
            return;
        }
        ((C112135i0) obj).A0E.A00((C35391lr) this.A01, (AnonymousClass2HJ) null, (ArrayList) this.A02, false, false);
    }
}
