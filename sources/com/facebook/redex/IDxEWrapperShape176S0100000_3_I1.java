package com.facebook.redex;

import X.AnonymousClass1Z6;
import X.AnonymousClass4LC;
import X.AnonymousClass4NW;
import X.C108615Or;
import X.C114765oX;
import X.C13690nt;
import X.C14930q1;
import X.C29671b0;
import X.C31201dg;
import com.obwhatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;

public class IDxEWrapperShape176S0100000_3_I1 implements C29671b0 {
    public Object A00;
    public final int A01;

    public IDxEWrapperShape176S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final C14930q1 A9V() {
        C31201dg A9T;
        int i2;
        int i3 = this.A01;
        Object obj = this.A00;
        switch (i3) {
            case 0:
                return ((AnonymousClass1Z6) obj).A01;
            case 1:
                break;
            case 2:
                return ((AnonymousClass4NW) obj).A00;
            case 3:
                obj = C13690nt.A0Z(((C114765oX) obj).A01);
                break;
            case 4:
                return ((AnonymousClass4LC) obj).A00;
            case 5:
                A9T = ((BkBottomSheetContentFragment) obj).A02.A00;
                i2 = 38;
                break;
            default:
                A9T = ((BkBottomSheetContentFragment) ((IDxCListenerShape135S0100000_3_I1) obj).A00).A02.A00;
                i2 = 45;
                break;
        }
        A9T = ((C108615Or) obj).A9T();
        i2 = 35;
        return A9T.A0H(i2);
    }
}
