package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01A;
import X.AnonymousClass061;
import X.C000900k;
import X.C001000l;
import X.C001100m;
import X.C001500q;
import X.C004301w;
import X.C006202q;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;

public class IDxAListenerShape119S0100000_I0 implements C006202q {
    public Object A00;
    public final int A01;

    public IDxAListenerShape119S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AP6(Context context) {
        switch (this.A01) {
            case 0:
                C001100m.A0I((C001100m) this.A00);
                return;
            case 1:
                C000900k r0 = (C000900k) this.A00;
                C004301w A1S = r0.A1S();
                A1S.A06();
                A1S.A0D(r0.A07.A01.A01(C000900k.A02));
                return;
            default:
                C001000l r3 = (C001000l) this.A00;
                AnonymousClass061 r1 = r3.A03.A00;
                r1.A03.A0a((AnonymousClass01A) null, r1, r1);
                Bundle A012 = r3.A07.A01.A01(C001000l.A05);
                if (A012 != null) {
                    Parcelable parcelable = A012.getParcelable(C001000l.A05);
                    AnonymousClass061 r12 = r3.A03.A00;
                    if (r12 instanceof C001500q) {
                        r12.A03.A0R(parcelable);
                        return;
                    }
                    throw AnonymousClass000.A0V("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
                }
                return;
        }
    }
}
