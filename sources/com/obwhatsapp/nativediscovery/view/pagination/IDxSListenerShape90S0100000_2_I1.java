package com.obwhatsapp.nativediscovery.view.pagination;

import X.AnonymousClass3RR;
import X.AnonymousClass4P1;
import X.C57272qc;
import com.obwhatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.obwhatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;

public class IDxSListenerShape90S0100000_2_I1 extends AnonymousClass3RR {
    public Object A00;
    public final int A01;

    public IDxSListenerShape90S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A02() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((BusinessDirectorySearchFragment) obj).A0B.A08();
        } else {
            ((BusinessDirectoryContextualSearchFragment) obj).A06.A0C();
        }
    }

    public boolean A03() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C57272qc r3 = ((BusinessDirectorySearchFragment) obj).A0B;
            int i3 = r3.A02;
            boolean z2 = true;
            if (!(i3 == 1 || i3 == 4 || r3.A0R())) {
                z2 = false;
            }
            if (z2 && r3.A03 != null) {
                if (!r3.A0P()) {
                    return false;
                }
                AnonymousClass4P1 r0 = (AnonymousClass4P1) r3.A0K.A06.A01();
                return r0 == null || r0.A0A;
            }
        }
        AnonymousClass4P1 r02 = (AnonymousClass4P1) ((BusinessDirectoryContextualSearchFragment) obj).A06.A0T.A06.A01();
        return r02 == null || r02.A0A;
    }
}
