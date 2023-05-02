package com.facebook.redex;

import X.AnonymousClass3K4;
import X.C1222168s;
import com.obwhatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.obwhatsapp.payments.ui.IndiaUpiScanQrCodeFragment;

public class IDxSCallbackShape456S0100000_3_I1 implements C1222168s {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape456S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AWg() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = ((IndiaUpiQrTabActivity) obj).A09;
            indiaUpiScanQrCodeFragment.A0A = null;
            indiaUpiScanQrCodeFragment.A09.AcJ();
            return;
        }
        AnonymousClass3K4.A0y(obj);
    }
}
