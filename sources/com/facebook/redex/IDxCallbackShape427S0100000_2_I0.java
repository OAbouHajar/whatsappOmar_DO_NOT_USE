package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass28N;
import X.C001000l;
import X.C13680ns;
import android.content.Intent;
import com.obwhatsapp.companiondevice.LinkedDevicesViewModel;
import java.util.List;

public class IDxCallbackShape427S0100000_2_I0 implements AnonymousClass28N {
    public Object A00;
    public final int A01;

    public IDxCallbackShape427S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AUQ(List list, List list2) {
        if (this.A01 != 0) {
            AnonymousClass01A r3 = (AnonymousClass01A) this.A00;
            C001000l A0C = r3.A0C();
            if (A0C != null && !A0C.isFinishing()) {
                C001000l A0C2 = r3.A0C();
                Intent A09 = C13680ns.A09();
                A09.setClassName(A0C2.getPackageName(), "com.obwhatsapp.companiondevice.LinkedDevicesActivity");
                r3.A0r(A09);
                return;
            }
            return;
        }
        LinkedDevicesViewModel linkedDevicesViewModel = (LinkedDevicesViewModel) this.A00;
        linkedDevicesViewModel.A00 = list;
        if (!list.isEmpty() || !list2.isEmpty()) {
            linkedDevicesViewModel.A08.A0B(list);
            linkedDevicesViewModel.A07.A0B(list2);
            return;
        }
        linkedDevicesViewModel.A06.A0B((Object) null);
    }
}
