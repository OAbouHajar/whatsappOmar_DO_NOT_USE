package com.obwhatsapp.contact.picker;

import X.AnonymousClass0SH;
import X.AnonymousClass3K3;
import X.C005602k;
import X.C13190lc;
import X.C57782rn;
import X.C86234Ru;
import X.C95044lt;
import android.view.View;
import java.util.List;

public class IDxLAdapterShape4S0300000_2_I1 extends C95044lt {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLAdapterShape4S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void AMS(View view) {
        C57782rn r2;
        C005602k r1;
        List list;
        switch (this.A03) {
            case 0:
                ((AnonymousClass0SH) this.A01).A0A((C13190lc) null);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                r2 = (C57782rn) this.A00;
                r1 = (C005602k) this.A02;
                r2.A03(r1);
                list = r2.A0A;
                break;
            case 1:
                ((AnonymousClass0SH) this.A01).A0A((C13190lc) null);
                r2 = (C57782rn) this.A00;
                r1 = (C005602k) this.A02;
                r2.A03(r1);
                list = r2.A00;
                break;
            default:
                ((AnonymousClass0SH) this.A02).A0A((C13190lc) null);
                AnonymousClass3K3.A15(view);
                C57782rn r3 = (C57782rn) this.A00;
                C86234Ru r22 = (C86234Ru) this.A01;
                r3.A03(r22.A05);
                r3.A02.remove(r22.A05);
                C57782rn.A01(r3);
                return;
        }
        list.remove(r1);
        C57782rn.A01(r2);
    }

    public void AMT(View view) {
    }
}
