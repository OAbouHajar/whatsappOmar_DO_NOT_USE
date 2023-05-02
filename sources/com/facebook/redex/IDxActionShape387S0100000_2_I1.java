package com.facebook.redex;

import X.AnonymousClass5Q0;
import X.C13680ns;
import com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel;

public class IDxActionShape387S0100000_2_I1 implements AnonymousClass5Q0 {
    public Object A00;
    public final int A01;

    public IDxActionShape387S0100000_2_I1(DeviceTransferViewModel deviceTransferViewModel, int i2) {
        this.A01 = i2;
        this.A00 = deviceTransferViewModel;
    }

    public final void Ah3() {
        int i2 = this.A01;
        DeviceTransferViewModel deviceTransferViewModel = (DeviceTransferViewModel) this.A00;
        if (i2 != 0) {
            deviceTransferViewModel.A02.A09(Boolean.TRUE);
        } else {
            C13680ns.A1O(deviceTransferViewModel.A05, 1);
        }
    }
}
