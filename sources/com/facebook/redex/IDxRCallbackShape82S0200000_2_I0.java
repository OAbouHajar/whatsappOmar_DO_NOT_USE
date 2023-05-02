package com.facebook.redex;

import X.AnonymousClass020;
import X.AnonymousClass074;
import X.AnonymousClass08E;
import X.AnonymousClass0IU;
import X.AnonymousClass0KX;
import X.AnonymousClass0T2;
import X.AnonymousClass0YG;
import X.AnonymousClass3TN;
import X.C06060Ub;
import X.C1041354b;
import X.C12830l2;
import X.C55562jx;
import X.C87594Xo;
import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.R;

public class IDxRCallbackShape82S0200000_2_I0 implements C12830l2 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxRCallbackShape82S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void ATJ(AnonymousClass074 r7) {
        switch (this.A02) {
            case 0:
                r7.A07(C87594Xo.A00((Context) this.A00, 54.0f), 0, ((C1041354b) this.A01).element);
                return;
            case 1:
                C55562jx r5 = (C55562jx) this.A00;
                Context context = (Context) this.A01;
                AnonymousClass0IU r3 = r5.A07;
                if (r3 == null) {
                    AnonymousClass0KX r2 = r5.A08;
                    C06060Ub r1 = r5.A09;
                    if (r1 == null) {
                        r1 = new AnonymousClass3TN(context, r5);
                        r5.A09 = r1;
                    }
                    r3 = new AnonymousClass0IU(AnonymousClass08E.A01(context, R.drawable.ic_provider_info), r7, r2, r1);
                    r5.A07 = r3;
                }
                r7.A0B(r3);
                r3.A0A(true);
                return;
            default:
                LatLng latLng = (LatLng) this.A01;
                int dimensionPixelSize = ((View) this.A00).getResources().getDimensionPixelSize(R.dimen.dimen050c);
                r7.A07(dimensionPixelSize << 1, dimensionPixelSize, dimensionPixelSize);
                r7.A09(AnonymousClass0T2.A00(new AnonymousClass0YG(new AnonymousClass020(latLng.A00, latLng.A01), 15.0f, Float.MIN_VALUE, Float.MIN_VALUE)));
                return;
        }
    }
}
