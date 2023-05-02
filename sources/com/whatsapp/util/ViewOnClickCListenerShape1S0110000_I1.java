package com.whatsapp.util;

import X.AnonymousClass00B;
import X.AnonymousClass01J;
import X.AnonymousClass13F;
import X.AnonymousClass1VJ;
import X.C13680ns;
import X.C19220xx;
import X.C31021dL;
import X.C34331k5;
import X.C606734v;
import X.C62623Eh;
import android.view.View;
import java.util.Set;

public class ViewOnClickCListenerShape1S0110000_I1 extends C34331k5 {
    public Object A00;
    public boolean A01;
    public final int A02;

    public ViewOnClickCListenerShape1S0110000_I1(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    public void A06(View view) {
        if (this.A02 != 0) {
            C606734v r3 = (C606734v) this.A00;
            r3.A04();
            r3.A0E = C13680ns.A0Y();
            String str = r3.A0H;
            C31021dL.A01(r3.A01(), r3.A00, r3, str, r3.A0c.A11.A01, (Set) null, this.A01);
            return;
        }
        Log.i("UserNoticeBanner/update/banner dismissed");
        if (!this.A01) {
            ((C62623Eh) this.A00).A05.A04();
        }
        C62623Eh r4 = (C62623Eh) this.A00;
        r4.A04.A01(10);
        View view2 = r4.A00;
        AnonymousClass00B.A04(view2);
        view2.setVisibility(8);
        C19220xx r0 = r4.A05;
        AnonymousClass13F r1 = r0.A05;
        C13680ns.A0x(r1.A00().edit(), "current_user_notice_banner_dismiss_timestamp", r0.A01.A00());
        AnonymousClass01J r2 = r4.A06;
        if (r2.get() != null) {
            r4.A01.A02((AnonymousClass1VJ) r2.get());
        }
    }
}
