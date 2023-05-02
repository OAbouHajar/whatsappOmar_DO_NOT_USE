package com.facebook.redex;

import X.AnonymousClass00O;
import X.AnonymousClass0SD;
import X.C015707n;
import X.C019409a;
import X.C06430Vt;
import X.C06860Ye;
import android.view.View;
import java.util.AbstractCollection;

public class IDxLAdapterShape7S0200000_I1 extends C019409a {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLAdapterShape7S0200000_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void AZC(C015707n r4) {
        switch (this.A02) {
            case 0:
                View view = (View) this.A01;
                AnonymousClass0SD r0 = C06430Vt.A02;
                r0.A06(view, 1.0f);
                r0.A04(view);
                break;
            case 1:
                ((AbstractCollection) ((AnonymousClass00O) this.A01).get(((C06860Ye) this.A00).A00)).remove(r4);
                break;
            default:
                ((C015707n) this.A01).A0F();
                break;
        }
        r4.A09(this);
    }
}
